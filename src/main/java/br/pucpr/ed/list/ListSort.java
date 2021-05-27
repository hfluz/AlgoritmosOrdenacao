package br.pucpr.ed.list;

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

    /**
     * Método usado para mesclar as listas ordenadas list1 e list2.
     *
     * Dicas:
     * 1. Crie uma lista com tamanho igual a soma dos tamanhos de list1 e list2.
     * 2. Itere sobre a lista recém criada, a cada iteração um elemento de list1 ou list2 é selecionado
     * (aquele que for menor) para ser incluído na nova lista.
     * a. Utilize os métodos add e remove para mover os elementos de uma lista para outra.
     * b. Utilize um índice para cada uma das 2 listas para saber qual o próximo elemento que deve
     * ser inserido. Por exemplo: l1Index e l2Index.
     * c. Tome cuidado para não acessar uma posição não alocada de list1 ou list2, o que causará
     * IndexArrayOfBoundsException.
     * 3. Retorne a lista.
     * @param list1 Lista ordenada 1
     * @param list2 Lista ordenada 2
     * @return Lista ordenada com a combinação de todos os elementos de list1 e list2
     */
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
}
