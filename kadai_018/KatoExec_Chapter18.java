package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		//KatoTaro_Chapter18インスタンスを親クラスのKato_Chapter18.javaへ代入
		Kato_Chapter18 taro = new KatoTaro_Chapter18();
		//KatoIchiro＿Chapter18インスタンスを親クラスのKato_Chapter18へ代入
		Kato_Chapter18 ichiro = new KatoIchiro_Chapter18();
		//KatoHanako＿Chapter18インスタンスを親クラスのKato_Chapter18へ代入
		Kato_Chapter18 hanako = new KatoHanako_Chapter18();
		
		//KatoTaro_Chapter18インスタンスのメソッドを実行
		taro.execIntroduce();
		
		//KatoIchiro_Chapter18インスタンスのメソッドを実行
		ichiro.execIntroduce();
		
		//KatoHanako_Chapter18インスタンスのメソッドを実行
		hanako.execIntroduce();

	}

}
