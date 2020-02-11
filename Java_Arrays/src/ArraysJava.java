/**
 * Создать массив с набором слов (10-20 слов, среди которых должны встречаться повторяющиеся).
 * Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
 * Посчитать, сколько раз встречается каждое слово.
 * @author Мартынюк Алексей
 * @version 0.1
 */
import java.util.*;


public class ArraysJava {
    public void arrManip(String inputString) {
        ArrayList<String> arrayList = new ArrayList<>();
        //разбиваем строку на массив слов игнорируя знаки препинания и пробелы
        for (String str:inputString.split("\\s*(\\s|,|!|—|\\.)\\s*")) {
            arrayList.add(str);
        }
        System.out.println(arrayList);
        //вносим все слова HashMap и считаем сколько раз встречается каждое слово
        Map<String, Integer> tempMap = new HashMap<>();
        for (String tempString : arrayList) {
            if (!tempMap.containsKey(tempString)) {
                tempMap.put(tempString, 1);
            }else {
                tempMap.put(tempString, tempMap.get(tempString) + 1);
            }
        }
        System.out.println(tempMap);
    }
}
