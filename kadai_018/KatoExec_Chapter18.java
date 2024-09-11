package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		//KatoTaro_Chapter18インスタンスを親クラスのKato_Chapter18.javaへ代入
		KatoTaro_Chapter18 katotaro = new KatoTaro_Chapter18();
		//setGivenNameメソッド
			katotaro.setGivenName();
		//execIntroduceを実行
			katotaro.execIntroduce();
		
		//KatoIchiro＿Chapter18インスタンスを親クラスのKato_Chapter18へ代入
		KatoIchiro_Chapter18 katoichiro = new KatoIchiro_Chapter18();
		//setGivenNameメソッド
		katoichiro.setGivenName();
		//execIntroduceを実行
		katoichiro.execIntroduce();
		
		//KatoHanako＿Chapter18インスタンスを親クラスのKato_Chapter18へ代入
		KatoHanako_Chapter18 katohanako = new KatoHanako_Chapter18();
		//setGivenNameメソッド
		katohanako.setGivenName();
		//execIntroduceを実行
		katohanako.execIntroduce();

	}

}
