public class Task3 {

    public boolean checkingArrayFor_1_and_4(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1 || array[i] == 4 ){
                return true;
            }
        }
        return false;
    }
}
