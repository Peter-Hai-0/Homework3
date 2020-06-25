package Puke;

public class Card {
		char num [] = {'0','0','0','0','0'};//牌面大小
		char num1[] = {'0','0','0','0','0'};
		char flo [] = {'0','0','0','0','0'};//牌面花色
		int result[] = {0,0,0,0,0,0,0,0};     //比较结果
		int cou[] = {0,0,0,0,0};			//计数牌面数目
	

		
		
		
		
	public void setCou(int[] cou) {
			this.cou = cou;
		}
	public void setResult(int[] result) {
			this.result = result;
		}
	public int[] getCou() {
			return cou;
		}
	public char[] getNum1() {
			return num1;
		}
	public int[] Kind(String s){
		
		int i,t=0;
		//拆分数组
		
		for(i=1;i<s.length();i+=3){
			
			flo[t]=s.charAt(i);
			t++;
			
		}
		t=0;
		for(i=0;i<s.length();i+=3){
			
			num[t]=s.charAt(i);
			t++;
		}
		//变换牌面大小数组-->由大到小
		num=change(num);
		
		//判断顺子
		result=sam_szi(num,result);
		//计数
		
		for(i=0;i<5;i++){
			num1[i]=num[i];
			if(num[i]=='F') num[i]='A';
			if(num[i]=='E') num[i]='K';
			if(num[i]=='D') num[i]='Q';
			if(num[i]=='C') num[i]='J';
			if(num[i]=='B') num[i]='T';
			
	}
		cou=Count(num1);
		
		//判断散牌，一对，两对，三条
		result=same_num2345(cou,result);
		
		//判断同花
		result=sam_flo5(flo,result);
		
		//判断同花顺
		if(result[6]==1&&result[5]==1) result[7]=1;
		
		
		
		return result; 
		
		
	}
	public char [] change(char ch[]){
		int i,j;
		char ch1 [] = {'B','C','D','E','F'};
		char ch_t;
		for(i=0;i<5;i++){
				if(ch[i]=='A') ch[i]=ch1[4];
				if(ch[i]=='K') ch[i]=ch1[3];
				if(ch[i]=='Q') ch[i]=ch1[2];
				if(ch[i]=='J') ch[i]=ch1[1];
				if(ch[i]=='T') ch[i]=ch1[0];
		}
		for(i=0;i<4;i++){
			for(j=0;j<4;j++){
				if(ch[j]<ch[j+1]){
					ch_t=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=ch_t;
				}
				
			}
		}
		
		
		
		
		
		
		
		return ch;
	}
	
	public int [] Count(char ch[]){
		int cou[] = {1,1,1,1,1};
		
		int count=1;
		int i=0,j=0;
		for(i=0;i<4;i+=count){
			for(j=i;j<4;j++){
				if(ch[i]==ch[j+1]){
					cou[i]++;
					count++;
					ch[j+1]='0';
					cou[j+1]=0;
				}
				count=1;
			}
		}
		
		return cou;
	}

	public int [] same_num2345(int cou[],int result[]){
		int count=0;
		for(int i=0;i<5;i++){
			if(cou[i]==4) result[3]=1;
			if(cou[i]==3) result[4]=1;
			if(cou[i]==2) {
				result[2]=1;
				count++;
			}
			else result[1]=1;
		}
		if(count==2) result[3]=1;
		return result;
		
	}
	public int [] sam_szi(char ch[],int result[]){
		
		//判断顺子
		int count=0;
		int number1;
		number1=Integer.valueOf(ch[0]);
		int number2;
		int i;
		for(i=1;i<5;i++){
				number2=Integer.valueOf(ch[i]);
			if(number2+i==number1) count++;
		}
		if(count==4) result[5]=1;
		return result;
	}
	public int[] sam_flo5(char ch[],int result[]){
		char ch1;
		ch1 = ch[0];
		int count=0;
		for(int i=1;i<5;i++){
			if(ch1!=ch[i]) break;
			else count++;
		}
		if(count==4) result[6]=1;
		return result;
	}

	
}
