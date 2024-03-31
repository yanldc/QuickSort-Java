public class QuickSort {

    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int menor, int maior) {
        if (menor < maior) {
            int partitionIndex = particao(array, menor, maior);
            quickSort(array, menor, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, maior);
        }
    }

    private int particao(int[] array, int menor, int maior) {
        int pivo = array[maior];
        int i = menor - 1;
        for (int j = menor; j < maior; j++) {
            if (array[j] < pivo) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[maior];
        array[maior] = temp;
        return i + 1;
    }

    public void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
