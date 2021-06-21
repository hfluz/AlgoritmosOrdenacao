package br.pucpr.ed.list;

import br.pucpr.ed.tree.Heap;

public class ListSort {
    /**
     * Exercício 1
     */
    public static SortableArrayList bubbleSort(SortableArrayList list){
        return null;
    }

    /**
     * Exercício 2
     */
    public static SortableArrayList mergeSort(SortableArrayList list){
        return null;
    }

    private static SortableArrayList merge(SortableArrayList list1, SortableArrayList list2){
        return null;
    }

    /**
     * Exercício 3
     */
    public static SortableArrayList shellSort(SortableArrayList list){
        return null;
    }

    /**
     * Exercício 4
     */
    public static SortableArrayList quickSort(SortableArrayList list){
        return null;
    }

    private static void quickSortRecursivo(SortableArrayList list, int left, int right) {

    }

    private static int partitionList(SortableArrayList list, int left, int right) {
        return 0;
    }

    public static SortableArrayList heapSort(SortableArrayList list) {
        Heap<Comparable> heap = new Heap<>(list.array.length);
        for (int i= 0; i < list.size; i++) {
            heap.insert(list.get(i));
        }
        for (int i= 0; i < list.size; i++) {
            list.set(i,heap.remove());
        }
        return list;
    }
}
