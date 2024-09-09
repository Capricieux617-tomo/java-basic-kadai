package kadai_018;

 abstract public class Kato_Chapter18 {
	//姓を表すフィールド
	public String familyName = "加藤";
	//名を表すフィールド
	public String givenName;
	//住所を表すフィールド
	public String address = "東京都中野区〇×";
	
	//コンストラクタで名の設定
	public Kato_Chapter18(String givenName) {
		this.givenName = givenName;
	}
	
	//共通の紹介を出力するメソッド
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	//個別の紹介を出力する
	abstract public void eachIntroduce(); 
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}
