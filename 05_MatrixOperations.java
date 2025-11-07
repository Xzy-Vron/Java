
import java.util.*;
public class MatrixOperations {
    static int[][] readMatrix(Scanner sc, int r, int c){
        int[][] m = new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) m[i][j]=sc.nextInt();
        return m;
    }
    static int[][] transpose(int[][] a){
        int r=a.length, c=a[0].length;
        int[][] t = new int[c][r];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) t[j][i]=a[i][j];
        return t;
    }
    static int[][] add(int[][]a,int[][]b){
        int r=a.length,c=a[0].length; int[][] s=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) s[i][j]=a[i][j]+b[i][j];
        return s;
    }
    static int[][] subtract(int[][]a,int[][]b){
        int r=a.length,c=a[0].length; int[][] s=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) s[i][j]=a[i][j]-b[i][j];
        return s;
    }
    static int[][] multiply(int[][]a,int[][]b){
        int r=a.length, m=b.length, c=b[0].length;
        int[][] p=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) for(int k=0;k<m;k++) p[i][j]+=a[i][k]*b[k][j];
        return p;
    }
    static void print(int [][]a){
        for(int[] row:a){ for(int v:row) System.out.print(v+" "); System.out.println(); }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows and cols for matrix A:");
        int r=sc.nextInt(), c=sc.nextInt();
        System.out.println("Enter matrix A:");
        int[][] A=readMatrix(sc,r,c);
        System.out.println("Transpose of A:");
        print(transpose(A));
        System.out.println("For add/subtract/multiply, enter rows and cols for B:");
        int r2=sc.nextInt(), c2=sc.nextInt();
        if (r2!=r || c2!=c) System.out.println("For add/subtract dims must match; for multiply ensure columns of A == rows of B.");
        System.out.println("Enter matrix B:");
        int[][] B=readMatrix(sc,r2,c2);
        if (r==r2 && c==c2) {
            System.out.println("A+B:"); print(add(A,B));
            System.out.println("A-B:"); print(subtract(A,B));
        }
        if (c==r2) {
            System.out.println("A*B:"); print(multiply(A,B));
        }
        sc.close();
    }
}
