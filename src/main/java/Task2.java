public class Task2 {

    public int[] returnArrayWithElementsAfterLast_4(int[] array) throws RuntimeException{
        int countElements = 0;
        for (int i = array.length-1; i >= 0; i--) {
            if( array[i] == 4 ){
                break;
            }
            countElements++;
        }
        if(countElements == array.length){
            throw new RuntimeException("в массиве нет 4");
        }

        int[] returnedArray = new int[countElements];
        int j = 0;
        for (int i = array.length-countElements; i < array.length; i++, j++) {
            returnedArray[j] = array[i];
            System.out.print(returnedArray[j] + ", ");
        }
        return returnedArray;
    }
}
