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



public class TestPhoneBook {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Иванов","79208980888");
        phoneBook.addContact("Сидоров","79205580888");
        phoneBook.addContact("Сидоров","792055280888");
        phoneBook.addContact("Желыбин","79208965988");
        phoneBook.addContact("Желыбин","79208865988");
        phoneBook.addContact("Желыбин","79208975988");

        phoneBook.getContact("Сидоров");

    }
}
