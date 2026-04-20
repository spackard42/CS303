package HW3;
import java.util.ArrayList;

public class recursive<T> {
    //in: array to search through, index of searching, and search term
    public int lastOccurance(ArrayList<T> arr, int index, T search){
        if (index < 0){
            return -1;
        }
        try {
            if (search == arr[index]){
                return index;
            }
        }
        catch(Error e){
            throw new Error("Error: search item is not stored by provided ArrayList");
        }
        lastOccurance(arr, index -1, search);
    }
}
