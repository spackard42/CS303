import java.util.ArrayList;
public class recursive<T> {
    //in: array to search through, index of searching, and search term
    public int lastOccurance(ArrayList<T> arr, int index, T search){
        if (index < 0){
            return -1;
        }
        try {
            if (search.equals( arr.get(index))){
                return index;
            }
            lastOccurance(arr, index -1, search);
        }
        catch(Error e){
            throw new Error("Error: search item is not the right datatype for ArrayList " + arr);
        }
        return -1; //backup return since VS doesn't understand that it will 
    }
}
