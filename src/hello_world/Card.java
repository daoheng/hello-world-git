package hello_world;

public class Card {
	private int num;
	private String rank;
	
	public Card(int num,String rank){
		this.num=num;
		this.rank=rank;
	}

	public Card(int num) {
		this.num = num;
		this.rank = "King";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "This Card is a " + num + " of " + rank; 
	}
	
	

}
