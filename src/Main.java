import java.util.Scanner;

class RowSum{
    public void findRowSum(int row ,int col ,int arr[][]){
        int ar[]=new int[row];
        for(int i=0;i<row;i++){
            int sum=0;
            for (int j=0;j<col;j++){
                sum+=arr[i][j];
            }
            ar[i]=sum;
        }
        for(int i=0;i<row;i++){
            System.out.print(ar[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        RowSum rowSum=new RowSum();
        System.out.println("Enter no of row  :");
        int row= scanner.nextInt();
        System.out.println("Enter no of col  :");
        int col= scanner.nextInt();
        System.out.println("Enter array elements  :");
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++) {

            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Row Sum :");
        rowSum.findRowSum(row,col,arr);


    }
}