public class App {
    public static void main(String[] args) {
        int[] array = {3, 6, 4, 2, 8, 5, 7, 1};
        QuickSort quick = new QuickSort();
        
        System.out.println("Numeros originais:");
        
        quick.printArray(array);
        quick.sort(array);
        System.out.println("Numeros ordenados:");
        quick.printArray(array);
    }
}
