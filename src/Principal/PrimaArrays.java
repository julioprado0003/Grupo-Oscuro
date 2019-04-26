package Principal;

public class PrimaArrays {
	
	public static void main (String []args) {
		
		// Matrices de dos dimensiones
		int [][] matrix = new int [3][3];
		
		matrix [0][0] = 15;
		matrix [0][1] = 20;
		matrix [0][2] = 65;
		
		matrix [1][0] = 6;
		matrix [1][1] = 8;
		matrix [1][2] = 0;
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				System.out.println("Matrix ["+i+"]["+j+"] = "+matrix[i][j]);
			}
		}
		
		System.out.println("\n**************************************************************************");
		
		// Matrix de dos dimensiones con corchetes
		int [][] matrix2 = {
				{20,65,88,10},
				{5,9,7,916},
				{20,30,40,50},
				{90,1000,65,648}
		};
		
		for(int x=0;x<matrix2.length;x++) {
			for(int z=0;z<matrix2.length;z++) {
				System.out.println("Matrix2 ["+x+"]["+z+"] = "+matrix2[x][z]);
			}
		}
		
		System.out.println("\n*************************************************************************************");
		
		// matrix de tres dimensiones con corchetes
		double [][][] matrix3 = {
				{
					{10,20,30},
					{40,50,60},
					{70,80,90}
				},
				{
					{100,200,300},
					{400,500,600},
					{700,800,900}
				},
				{
					{1000,2000,3000},
					{4000,5000,6000},
					{7000,8000,9000}
				}
		};
		
		for(int m=0;m<matrix3.length;m++) {
			for(int n=0;n<matrix3.length;n++) {
				for(int o=0;o<matrix3.length;o++) {
					System.out.println("Matrix3 ["+m+"]["+n+"]["+o+"] = "+matrix3[m][n][o]);
				}
			}
		}
		
		// Modificando contenido de Array
		
		for(int r=0;r<matrix3.length;r++) {
			for(int s=0;s<matrix3.length;s++) {
				for(int t=0;t<matrix3.length;t++) {
					
					double result = matrix3[r][s][t]+matrix3[r][s][t]*0.2;
					
					System.out.println("Matrix ["+r+"]["+s+"]["+t+"] X 0.2 = "+result);
				}
			}
		}
		
	}

}
