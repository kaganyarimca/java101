import java.util.Arrays;

public class Main {

    static boolean isFind(int[] array, int value){
        for(int i : array){
            if( i == value){
                return  true;
            }
        }
        return  false;


    }
    public static void main(String[] args) {

        int[] list= {3,7,3,4,9,7,10,9,21,5,};
        int[] duplicate = new int[list.length];
        int startIndex = 0 ;

        for( int i=0; i< list.length; i++){
            for(int j=0; j<list.length; j++ ){
                if( (i != j) && (list[i] == list[j])){

                    if(!isFind(duplicate, list[i])){
                        duplicate[startIndex++] = list[i];
                    }break;
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }
}