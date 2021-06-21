package br.pucpr.ed.tree;

public class Heap<T extends Comparable> {

    private T[] heap;
    private int size;

    public Heap(int capacity) {
        heap = (T[]) new Comparable[capacity];
        size = 0;
    }

    public void insert(T e) {
        int position = trickeUp(size, e);
        heap[position] = e;
        size++;
    }

    private int trickeUp(int position, T e){
        int parentIndex = getParent(position);
        if(position > 0 && e.compareTo(heap[parentIndex]) < 0){
            heap[position] = heap[parentIndex];
            return trickeUp(parentIndex, e);
        } return position;
    }

    public T remove() {
        T removed = heap[0];
        heap[0] = heap[size - 1];
        heap[size-- - 1] = null;
        T tmp = heap[0];
        int position = trickeDown(0, heap[0]);
        heap[position] = tmp;
        return removed;
    }

    private int  trickeDown(int position, T e) {
        int leftChild = getLeftChild(position);
        int rightChild = getRightChild(position);
        int lowestChild = rightChild >= size || heap[leftChild].compareTo(heap[rightChild]) < 0 ? leftChild : rightChild;
        if(lowestChild < size && e.compareTo(heap[lowestChild]) > 0){
            heap[position] = heap[lowestChild];
            return trickeDown(lowestChild, e);
        }
        return position;
    }

    private int getParent(int position) {
        return (position - 1) / 2;
    }

    private int getLeftChild(int position) {
        return position * 2 + 1;
    }

    private int getRightChild(int position) {
        return position * 2 + 2;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}