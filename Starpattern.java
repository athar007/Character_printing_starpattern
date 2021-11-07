package abcTraining;

import java.util.Scanner;

public class Starpattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range : ");
		int n = sc.nextInt();
		char c = '%';
		while(c!='*') {
			System.out.println("Enter the Character you want to print (Uppercase Only & use * to exit): ");
			c = sc.next().charAt(0);
			switch (c) {
		        case 'A':
		        	printA(n);
		            break;
		        case 'B':
		        	printB(n);
		            break;
		        case 'C':
		        	printC(n);
		            break;
		        case 'D':
		        	printD(n);
		            break;
		        case 'E':
		        	printE(n);
		            break;
		        case 'F':
		        	printF(n);
		            break;
		        case 'G':
		        	printG(n);
		            break;
		        case 'H':
		        	printH(n);
		            break;
		        case 'I':
		        	printI(n);
		            break;
		        case 'J':
		        	printJ(n);
		            break;
		        case 'K':
		        	printK(n);
		            break;
		        case 'L':
		        	printL(n);
		            break;
		        case 'M':
		        	printM(n);
		            break;
		        case 'N':
		        	printN(n);
		            break;
		        case 'O':
		        	printO(n);
		            break;
		        case 'P':
		        	printP(n);
		            break;
		        case 'Q':
		        	printQ(n);
		            break;
		        case 'R':
		        	printR(n);
		            break;
		        case 'S':
		        	printS(n);
		            break;
		        case 'T':
		        	printT(n);
		            break;
		        case 'U':
		        	printU(n);
		            break;
		        case 'V':
		        	printV(n);
		            break;
		        case 'W':
		        	printW(n);
		            break;
		        case 'X':
		        	printX(n);
		            break;
		        case 'Y':
		        	printY(n);
		            break;
		        case 'Z':
		        	printZ(n);
		            break;
		        case '0':
		        	printZero(n);
		            break;
		        case '1':
		        	printOne(n);
		            break;
		        case '2':
		        	printTwo(n);
		            break;
		        case '3':
		        	printThree(n);
		            break;
		        case '4':
		        	printFour(n);
		            break;
		        case '5':
		        	printFive(n);
		            break;
		        case '6':
		        	printSix(n);
		            break;
		        case '7':
		        	printSeven(n);
		            break;
		        case '8':
		        	printEight(n);
		            break;
		        case '9':
		        	printNine(n);
		            break;
		        case '*':
		        	System.out.println("You have exited sucessfully!!");
		            break;
		        default:
		            System.out.println("Please enter a valid character from A to Z or 0 to 9");
	        }
		}
		/*
		 * printA(n); printB(n); printC(n);
		 */
		
		

	}
	static void printA(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 && j!=0) && (i==0 && j!=n-1) || (j==0 && i!=0) || (j==n-1 && i!=0) || i==n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printB(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 && j!=n-1) || j==0 || (i==n-1 && j!=n-1) || (i==n/2 && j!=n-1) || ((j==n-1 && i!=0) && (j==n-1 && i!=n/2) && (j==n-1 && i!=n-1))) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printC(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(((i==0 && j!=0) && (i==0 && j!=n-1)) || ((i==n-1 && j!=0) && (i==n-1 && j!=n-1)) || ((j==0 && i!=0) && (j==0 && i!=n-1)) || ((j==n-1 && (i<=n/4 || i>=n-(n/4)) && i!=0 && i!=n-1))) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printD(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 && j!=n-1) || (i==n-1 && j!=n-1) || j==0 || ((j==n-1 && i!=0 && i!=n-1))) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printE(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n/2 || i==n-1 || j==0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printF(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n/2 || j==0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printG(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(((i==0 && j!=0) && (i==0 && j!=n-1)) || ((i==n-1 && j!=0) && (i==n-1 && j!=n-1)) || ((j==0 && i!=0) && (j==0 && i!=n-1)) || ((j==n-1 && (i<=n/4 || i>=n-(n/3)) && i!=0 && i!=n-1) || ((i==n-(n/3)) && (j>=n-(n/4))))) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printH(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printI(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==n/2 || ((i==0 && ((j>=n/3) && (j<=n-(n/3)))) || (i==n-1 && ((j>=n/3) && (j<=n-(n/3)))))) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printJ(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((j==n/2 && i<n-1) || ((i==0 && ((j>=n/4) && (j<=n-(n/4)))) || (j==n/4 && (i>=n-(n/3) && i<n-1)) || (i==n-1 && j>n/4 && j<n/2))) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printK(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || i+j==n/2 || i-j==n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printL(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printM(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || (i==j && i<n/2) || (i+j==n-1 && i<n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printN(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || i==j ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printO(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 && i>0 && i<n-1 || (j==n-1 && i>0 && i<n-1) || (i==0 && j>0 && j<n-1) || (i==n-1 && j>0 && j<n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printP(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || (j==n-1 && i>0 && i<n/2) || (i==n/2 && j<n-1) || (i==0 && j<n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printQ(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((j==0 && i>0 && i<n-(n/4)) || (i==0  && j>0 && j<n-(n/4)) || (i==n-(n/4) && j>0 && j<n-(n/4)) || (j==n-(n/4) && i>0 && i<n-(n/4)) || (i==j && i>=n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printR(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || (i==0 && j<n-1) || (i==n/2 && j<n-1) || (j==n-1 && i>0 && i<n/2) || (i==j && i>=n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printS(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((j==0 && i>0 && i<n/2) || (i==0 && j>0 && j<n-1) || (i==n/2 && j>0 && j<n-1) || (j==n-1 && i>0 && i<n/4) || (j==n-1 && i>n/2 && i<n-1) || (i==n/2 && j>0 && j<n-1) || (i==n-1 && j>0 && j<n-1) || (j==0 && i>n-(n/4) && i<n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printT(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==n/2 || (i==0 && j>0 && j<n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printU(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((j==0 && i<n-1) || (i==n-1 && j>0 && j<n-1) || (j==n-1 && i<n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printV(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==2*j && j<n/2-1) || (2*j+i==n+(n/2) && j>0 && i<n-2 )) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printW(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 || j==n-1 || (i==j && i>=n/2) || (i+j==n-1 && i>=n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printX(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j || i+j==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printY(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==j && i<n/2) || (i+j==n-1 && i<n/2) || (j==n/2 && i>=n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printZ(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0  || i==n-1 || i+j==n-1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printZero(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 && j>n/4 && j<n-(n/4)) || (i==n-1 && j>n/4 && j<n-(n/4)) || (j==n-1 && i>n/4 && i<n-(n/4)) || (j==0 && i>n/4 && i<n-(n/4)) || i+j==n/4 || i-j==-3*n/4+1 || i-j==n/2+2 || i+j==3*n/2+1 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printOne(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==n/2 || i+j==n/2 && i<n/4 || i==n-1 && j>n/4 && j<n-(n/4)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printTwo(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==0 && i>0 && i<n/4 || i+j==5*n/4-2 && i>=n/4 || i==n-1 && j>=n/4 || j==n-1 && i>0 && i<n/4 || i==0 && j>0 && j<n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printThree(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((j==0 && ((i>0 && i<n/4) || (i<n-1 && i>3*n/4))) || i==n/2 && j<n-1 && j>n/4 || i==n-1 && j>0 && j<n-1 || j==n-1 && i>0 && i!=n/2 && i<n-1 || i==0 && j>0 && j<n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printFour(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==3*n/4 || i==3*n/4 || i+j==3*n/4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
		static void printFive(int n) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i==0 || j==0 && ((i<n/2) || (i<n-1 && i>3*n/4)) || i==n/2 && j<n-1 || j==n-1 && i>n/2 && i<n-1 || i==n-1 && j>0 && j<n-1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
	}
		static void printSix(int n) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i==0 && j>0 && j<n-1 || j==0 && i<n-1 && i>0 || i==n/2 && j<n-1 || j==n-1 && ((i>0 && i<n/4) || (i<n-1 && i>n/2)) || i==n-1 && j>0 && j<n-1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
	}
		static void printSeven(int n) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i==0 || i+j==n-1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
	}
		static void printEight(int n) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if((i==0 && j>0 && j<n-1) || (j==0 && i>0 && i!=n/2 && i<n-1) || (j==n-1 && i>0 && i!=n/2 && i<n-1) || (i==n-1 && j>0 && j<n-1) || (i==n/2 && j>0 && j<n-1)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
	}
		static void printNine(int n) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if((i==0 && j>0 && j<n-1) || (j==0 && ((i>0 && i<n/2) || (i>3*n/4 && i<n-1))) || (j==n-1 && i>0 && i<n-1) || (i==n-1 && j>0 && j<n-1) || (i==n/2 && j>0 && j<n-1)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
	}

}
