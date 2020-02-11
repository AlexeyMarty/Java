/**
 * Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
 * В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии.
 * Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
 * тогда при запросе такой фамилии должны выводиться все телефоны
 * @author Мартынюк Алексей
 * @date 11.02.2020
 * @version 0.1
 */
package PhoneBook;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    //создаем карту для хранения ключей и значений
    private HashMap<String, HashSet<String>> contactList = new HashMap<>();
    //метод добавления контакта
    public void addContact(String title, String phone) {
        HashSet<String> hs = contactList.getOrDefault(title, new HashSet<>());
        hs.add(phone);
        contactList.put(title, hs);
    }
    //метод получения номера телефона по ключу(ФИО)
    public void getContact(String title) {
        if (contactList.containsKey(title)){
            System.out.println(contactList.get(title));
        }else {
            System.out.println("Такого контакта нет");
        }
    }
}
