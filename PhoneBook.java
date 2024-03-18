import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();

        // Populate the phonebook
        addEntry(phoneBook, "Ivanov", "123123123");
        addEntry(phoneBook, "Petrov", "789789789");
        addEntry(phoneBook, "Sidorov", "567567567");
        addEntry(phoneBook, "Fedorov", "321321321");
        addEntry(phoneBook, "Petrov", "901901901");
        addEntry(phoneBook, "Ivanov", "908908908");
        addEntry(phoneBook, "Ivanov", "765765765");
        addEntry(phoneBook, "Ivanov", "456456456");
        addEntry(phoneBook, "Petrov", "278278278");

        // Sort by descending number of phones by the last name
        List<Map.Entry<String, List<String>>> sortedEntries = new ArrayList<>(phoneBook.entrySet());
        sortedEntries.sort((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()));

        // Output
        for (Map.Entry<String, List<String>> entry : sortedEntries) {
            String name = entry.getKey();
            List<String> phones = entry.getValue();
            System.out.println(name + ": " + phones + ", total phones: " + phones.size());
        }
    }

    public static void addEntry(Map<String, List<String>> phoneBook, String name, String phone) {
        phoneBook.putIfAbsent(name, new ArrayList<>());
        phoneBook.get(name).add(phone);
    }
}