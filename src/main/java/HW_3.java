import java.lang.reflect.Array;
import java.util.*;

public class HW_3 {

    public static void main(String[] args) {
        // 1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.
        ArrayList array1 = new ArrayList();
        array1.add(5);
        array1.add("Hi");
        array1.add(2.34f);
        array1.add(17830);
        System.out.println(array1);

        // 2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        String string_colors = "red, green, blue";
        List<String> array_colors = new ArrayList<String>(Arrays.asList(string_colors.split(",")));
        System.out.println(array_colors);
        // Не понимаю, как добавить ! к каждому символу.
//        for (int i = 0; i < array_colors.size(); i++) {
//            array_colors.add(i, "!");
//            System.out.println(array_colors);
//        }
        // Вставить элемент в список в первой позиции.
        array1.add(0, 345);
        System.out.println(array1);

        //Извлечь элемент (по указанному индексу) из заданного списка.
        System.out.println(array1.get(3));

        // Обновить определенный элемент списка по заданному индексу.
        array1.set(3, "World");
        System.out.println(array1);

        //Удалить третий элемент из списка.
        array1.remove(2);
        System.out.println(array1);

        //Поиск элемента в списке по строке.

        //Создать новый список и добавить в него несколько елементов первого списка.
        List array_2 = array1.subList(2, array1.size());
        System.out.println(array_2);

        //Удалить из первого списка все элементы отсутствующие во втором списке.
        ArrayList array3 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            array3.add(new Random().nextInt(10));
        }
        System.out.println(array3);
        ArrayList array4 = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            array4.add(new Random().nextInt(10));
        }
        System.out.println(array4);

        array3.retainAll(array4);
        System.out.println(array3);

        //Сортировка списка.
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        array4.sort(c);
        System.out.println(array4);

        // Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.
        // Напомните, пожалуйста, как можно вычислить время работы

    }
}

