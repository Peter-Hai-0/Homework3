package Puke;


public class test {
	static int kindb[];
	static int kindw[];
	static char numb[];
	static char numw[];
	static int coub[];
	static int couw[];
	Player Black = new Player();
	Player Write = new Player();
public static void main(String[] args) {
		// TODO Auto-generated method stub
	test t = new test(); 
	//test1
	
	t.dotest("2H 3D 5S 9C KD","2C 3H 4S 8C AH");
	
	//test2
	
	t.dotest("2H 4S 4C 2D 4H", "2S 8S AS QS 3S");
		
	//test3	
		
	t.dotest("2H 3H 5H 9H KH", "2C 3H 4S 5C 6H");	
		
	//test4	
		
	t.dotest("2H 3D 5S 9C KD", "2D 3H 5C 9S KH");	
		
	//test5	
		
	t.dotest("2D 3H 5C", "5C 9S KH");
	
	
		
	
	}
public  void dotest(String s1,String s2){
	if(s1.length()<14||s2.length()<14){
		System.out.print("ÅÆÊý²»¹»£¬ÓÎÏ·ÔÝÍ£¡£");
		System.exit(0);
	}
	kindb=Black.getKind(s1);
	kindw=Write.getKind(s2);
	numb=Black.getNum1();
	numw=Write.getNum1();
	coub=Black.getCou();
	couw=Write.getCou();
	int i;
	for(i=7;i>0;i--){
		if(kindb[i]>kindw[i]) {
			System.out.print("Black Wins\n");
			break;
		}
		else if(kindb[i]<kindw[i]) {
			System.out.print("Write Wins\n");
			break;
		}
		else {
			if((i==6||i==5||i==1||i==7)&&kindb[i]==1){
				judge1567();
				break;
			}
			else if(i==4&&kindb[i]==1){
				judge4();
				break;
			}
			else if(i==3&&kindb[i]==1){
				judge3();
				break;
			}
			else if(i==2&&kindb[i]==1){
				judge2();
				break;
			}
			
		}
	}
}

public static void judge1567(){
	
		
		if(numb[0]>numw[0]) {
			System.out.print("Black Wins\n");
			
		}
		else if(numb[0]<numw[0]) {
			System.out.print("Write Wins\n");
			
		}
		else {
			System.out.print("Tie\n");
			
		}
	
}

public static void judge4(){
	 char chb[] = {'0','0','0'};
	 char chw[] = {'0','0','0'};
	for(int j=0;j<5;j++){
		if(coub[j]==3){
			chb[0]=numb[j];
		
		}
		if(couw[j]==3){
				chw[0]=numw[j];
		}
		if(coub[j]==2){
			chb[1]=numb[j];
			
		}
		if(couw[j]==2){
			chw[1]=numw[j];
		}
		if(coub[j]==1){
			chb[2]=numb[j];
			
			
		}
		if(couw[j]==1){
			chw[2]=numw[j];
		}
	}
	if(chb[0]<chw[0]){
		System.out.print("Write Wins\n");
	
	}
	else if(chb[0]>chw[0]){
		System.out.print("Black Wins\n");
		
	}
	else {
		if(chb[1]<chw[1]){
			System.out.print("Write Wins\n");
			
		}
		else if(chb[1]>chw[1]){
			System.out.print("Black Wins\n");
			
		}
		else{
			if(chb[2]<chw[2]){
				System.out.print("Write Wins\n");
				
			}
			else if(chb[2]>chw[2]){
				System.out.print("Black Wins\n");
			
			}
			else {
				System.out.print("Tie\n");
			}
		}
	}
	
}

public static void judge3(){

	 char chb[] = {'0','0','0'};
	 char chw[] = {'0','0','0'};
	 int t1=0,t2=0;
		for(int j=0;j<5;j++){
			if(coub[j]==2){
				chb[t1]=numb[j];
				t1++;
			}
			if(couw[j]==2){
				chw[t2]=numw[j];
				t2++;
			}
			if(coub[j]==4){
				chb[0]=chb[1]=numb[j];
				
			}
			if(couw[j]==4){
				chw[0]=chw[1]=numw[j];
			}
			
			if(coub[j]==1){
				chb[2]=numb[j];
			
				
			}
			if(couw[j]==1){
					chw[2]=numw[j];
			}
		}
		if(chb[0]<chw[0]){
			System.out.print("Write Wins\n");
		
		}
		else if(chb[0]>chw[0]){
			System.out.print("Black Wins\n");
			
		}
		else {
			if(chb[1]<chw[1]){
				System.out.print("Write Wins\n");
				
			}
			else if(chb[1]>chw[1]){
				System.out.print("Black Wins\n");
				
			}
			else{
				if(chb[2]<chw[2]){
					System.out.print("Write Wins\n");
					
				}
				else if(chb[2]>chw[2]){
					System.out.print("Black Wins\n");
				
				}
				else {
					System.out.print("Tie\n");
				}
			}
		}
	
	
}

public static void judge2(){
	 char chb[] = {'0','0','0','0'};
	 char chw[] = {'0','0','0','0'};
	 int t1=1,t2=1,i;
	for(int j=0;j<5;j++){
		if(coub[j]==2){
			chb[0]=numb[j];
			
		}
		if(couw[j]==2){
			chw[0]=numw[j];
		}
		if(coub[j]==1){
			chb[t1]=numb[j];
			t1++;
		}
		if(couw[j]==1){
			chw[t2]=numw[j];
			t2++;
		}
	}
	if(chb[0]<chw[0]){
		System.out.print("Write Wins\n");
	
	}
	else if(chb[0]>chw[0]){
		System.out.print("Black Wins\n");
		
	}
	else {
		for(i=1;i<4;i++){
			if(chb[i]<chw[i]){
				System.out.print("Write Wins\n");
				break;
			}
			else if(chb[i]>chw[i]){
				System.out.print("Black Wins\n");
				break;
			}
			else continue;
		}
			if(i==3) System.out.print("Tie\n");
		}
	
	
	
	
	
	
	
}


}
