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
		int result[] = {0,0,0,0,0,0,0,0};     //�ȽϽ��
		int cou[] = {0,0,0,0,0};			//����������Ŀ
			card.setResult(result);
			card.setCou(cou);
			kind=card.Kind(cards2);	
		return kind;
	}
	
	
	
}
