package Puke;

public class Player {
	String Cards;
	Card card = new Card();
	int kind[];
	char num[];
	int cou[];
	
	public char[] getNum1() {
		num=card.getNum1();
		return num;
	}
	

	

	public int[] getCou() {
		cou=card.getCou();
		return cou;
	}
	public int[] getKind(String cards2) {
		int result[] = {0,0,0,0,0,0,0,0};     //比较结果
		int cou[] = {0,0,0,0,0};			//计数牌面数目
			card.setResult(result);
			card.setCou(cou);
			kind=card.Kind(cards2);	
		return kind;
	}
	
	
	
}
