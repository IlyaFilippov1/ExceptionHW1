public class Main {
    //Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
    // Метод должен пройтись по каждому элементу и проверить что он не равен null. А теперь реализуйте следующую логику:
    // Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
    // Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
    public static void main(String[] args) {
        Main main = new Main();
        Integer[] array = new Integer[]{1, 5, 6, null, 89, 5, null};
        for (int item = 0; item < array.length; item++) {
            try {
                main.checkItem(array[item]);
            } catch (MyException e) {
                System.out.print(e.getMessage());
                System.out.format(" item index - %d%n", item);
            }
        }
    }
    public void checkItem(Integer item) {
        if (item == null) {
            throw new MyException("Exception: item is null!");
        }
    }
}
