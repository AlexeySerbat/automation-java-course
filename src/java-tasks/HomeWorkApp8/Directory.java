package HomeWorkApp8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    static void phoneBook() {
        Directory directory = new Directory();

        directory.add("Ivanov", "8999123321");
        directory.add("Ivanov", "8912155326");
        directory.add("Smirnov", "8917155552");
        directory.add("Smirnov", "8913455672");
        directory.add("Ivanov", "899999999");
        directory.add("Vasiliev", "899111111");
        directory.add("Smirnov", "89923231999");
        directory.add("Zubenko", "8888123113");
        directory.add("Vasiliev", "8324325234");

        System.out.println(directory.get("Ivanov"));
        System.out.println(directory.get("Smirnov"));
        System.out.println(directory.get("Vasiliev"));
        System.out.println(directory.get("Zubenko"));
    }

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }
}
