import java.util.*;
public class pascalstriangle{
    static List<List<Integer>> generate (int rows){
        List<List<Integer>> result= new ArrayList<>();
        if (rows<=0){
            return result;
        }
        for (int i=0;i<rows;i++){
            List<Integer> firstrow = new ArrayList<>();
            firstrow.add(1);
            if (i>0){
                List<Integer> prevRow= new ArrayList<>();
                prevRow=result.get(i-1);
                for (int j=1;j<i;j++){
                    firstrow.add(prevRow.get(j-1)+prevRow.get(j));
                }
            }
            if(i>0){
                firstrow.add(1);
            }
            result.add(firstrow);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows=ab.nextInt();
        List<List<Integer>> result=generate(rows);
        System.out.println(result);
    }
    
}
