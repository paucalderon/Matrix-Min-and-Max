/* Name: Ana Paulina Calderón
 * Student ID: 80635513
 * Description of the lab2:
 * 	Complete the following 6 functions: 
 * 	-> maxInRows, minInRows, allMax, allMin, rowAverage, allAverage  
 */

public class calderon_ana_lab2{
	public static void main(String[] args){

	// Ragged array/Jagged array
    int[][] b = {{5, 3, 2, 10},
                 {10, 15, 12, 10, 100, 20},
                 {1, 15, 11, 100},
                 {12, 16, 100, 150},
                };

    // Same number of columns in every row in matrix a
    int[][] a = {{ 1,  2,  3},
                 { 4,  5,  6},
                 { 7,  8,  9},
                 {10, 11, 12}};

    // Methods need to work on
    
    // Count number of appearance of an item inside the matrix.
    int item = 100;
    int count;
    count = countItem(b, item);
    System.out.println(item+" count in matrix b is: "+count);
    
    // Transpose the matrix. Change columns into rows
    transposeMat(a);

    //goes to myPrintMethod to print array
    myPrintMethod(b);   
    
    //goes to rowSum method to print sum for each row
    rowSum(b);
    
    //goes to allSum method to print sum for whole array
    allSum(b); 
    
    // Methods need to work on
    //goes to method to print each individual row's max
    maxInRows(b);
    
    //goes to method to print each individual row's min
    minInRows(b);
    
   //goes to method to print the array's max
    allMax(b);
    
    //goes to method to print the array's min
    allMin(b);
    
    //goes to method to print each individual row's average
    rowAverage(b);
    
    ////goes to method to print the array's average
    allAverage(b);
    
  }
  
  static int countItem(int[][] arr, int item){
	    int count = 0;
	    int num = item;
	    for (int i=0; i<arr.length; i++){    
	      for (int j=0; j<arr[i].length; j++){
	        //locates number in array
	        if(arr[i][j]==item){
	           //counts how many times number appears in array
	           count++;
	    	}
	       }
	    }    
	    System.out.println();
	    return count;
  }
  
  static void transposeMat(int[][] arr){
  	// Complete this function
	  int nrow = arr.length; 
	  int ncol = arr[0].length;
	  
	  int transposeA[][] = new int[ncol][nrow];
	  //loop switches rows and columns
	  for(int i=0; i<ncol; i++){
	  	for(int j=0; j<nrow; j++){
	  		//creates transposed array
	  		transposeA[i][j] = arr[j][i];
	  	}
	  }
	  System.out.println();
	  //prints array
	  myPrintMethod(transposeA);
	  
 }

  static void maxInRows(int[][] arr){
	// Complete this function
	for (int i=0; i<arr.length; i++){      
      //int inside first for loop sets up comparison for elements each individual row instead of the whole array
      int maxValRow = -Integer.MAX_VALUE;
      for (int j=0; j<arr[i].length; j++){
      	//if statement looks for maxVal
      	if(arr[i][j] > maxValRow){
      		maxValRow = arr[i][j];
      	}   
      }
    //System.out.print inside first loop prints maxVal each time for each row
    System.out.println("Max of row "+ i +" is "+maxValRow);
	}
	System.out.println();
  }

  static void minInRows(int[][] arr){
	// Complete this function
	for (int i=0; i<arr.length; i++){
	  //int inside first for loop sets up comparison for elements each individual row instead of the whole array     
      int minValRow = Integer.MAX_VALUE;
      for (int j=0; j<arr[i].length; j++){
      	//if statement looks for minVal
      	if(arr[i][j] < minValRow){
      		minValRow = arr[i][j];
      	}   
      }
    //System.out.print inside first loop prints minVal each time for each row
    System.out.println("Min of row "+ i +" is "+minValRow);
	}
  }  
  
  static void allMax(int[][] arr){
	// Complete this function
	//int outside first for loop sets up comparison for all of array 
	int maxVal = -Integer.MAX_VALUE;
  	for(int i=0; i<arr.length; i++){
  		for(int j=0; j<arr[i].length; j++){
  			//looks for maxVal in whole array
  			if(arr[i][j] > maxVal){
				maxVal = arr[i][j];
			}	
  		}
  	}
  	System.out.println("\nMax value for the whole array is "+ maxVal);
  }

  static void allMin(int[][] arr){
	// Complete this function
	//int outside first for loop sets up comparison for all of array 
  	int minVal = Integer.MAX_VALUE;
  	for(int i=0; i<arr.length; i++){
  		for(int j=0; j<arr[i].length; j++){
  			if(arr[i][j] < minVal){
  				//looks for minVal in whole array
				minVal = arr[i][j];
			}	
  		}
  	}
  	System.out.println("\nMin value for the whole array is "+ minVal+"\n");
  }  
  
  static void rowSum(int[][] arr){
    for (int i=0; i<arr.length; i++){ 
      //int inside first loop sets up sum for each row     
      int sum=0;
      for (int j=0; j<arr[i].length; j++){
      	//sums each new element
      	sum=sum+arr[i][j];
      }    
      System.out.println("Sum of row "+ i +" is "+sum);
    }
  }
  
  static void rowAverage(int[][] arr){
	// Complete this function
  	for (int i=0; i<arr.length; i++){      
      //int inside first loop sets up sum for each row    
      int sum=0;
      for (int j=0; j<arr[i].length; j++){
      	//sums each new element
      	sum=sum+arr[i][j];
      }
      //system.out.print prints out sum divided by length of each row along with the modulus
      System.out.println("Average of row "+ i +" is "+(sum/arr[i].length)+"."+(sum%arr[i].length));
    }
  }

  static void allSum(int[][] arr){
	    int sum = 0;
	    //int inside first loop sets up sum for entire array
	    for (int i=0; i<arr.length; i++){    
	      for (int j=0; j<arr[i].length; j++){
	      	//sums each new element
	        sum=sum+arr[i][j];
	      }      
	    }   
	    System.out.println("\nThe total sum for the whole array is "+sum+"\n");
  }
  
  static void allAverage(int[][] arr){
	// Complete this function
	//int inside first loop sets up sum for entire array
  	int sum = 0;
  	int elementCounter = 0;
	    for (int i=0; i<arr.length; i++){    
	      for (int j=0; j<arr[i].length; j++){
	      	//sums each new element
	        sum=sum+arr[i][j];
	        //counts the amount of elements in entire array
	        elementCounter++;
	      }      
	    }
	    //system.out.print prints out sum divided by the amount of elements in array along with the modulus 
	    System.out.println("\nThe total average for the whole array is "+(sum/elementCounter)+"."+(sum%elementCounter)+"\n");
  
  }
  
  static void myPrintMethod(int[][] c){
    for (int i=0; i<c.length; i++){      
      for (int j=0; j<c[i].length; j++){
        System.out.print(c[i][j]+" ");
      }      
      System.out.println();
    }
    System.out.println();
  }
  
  
}