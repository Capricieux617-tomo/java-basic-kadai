package kadai_015;

public class Car_Chapter15 {
	
	
		//フィールド(内部データ）
		private int gear = 1;
		private int speed = 10;
		
		//コンストラクタ（初期化処理）
		public  Car_Chapter15(int gear, int speed) {
			this.gear = gear;
			this.speed = speed;
		}
			
		
//【メソッド】ギアの値により速度を変える

public void gearChenge( int afterGear ) {
	System.out.println("ギア"+ gear + "から" + afterGear +"に切り替えました");
		this.gear = afterGear;
		this.speed = switch(this.gear){
		case 1 -> 10;
		case 2 -> 20;
		case 3 -> 30;
		case 4 -> 40;
		case 5 -> 50;
		default -> 10;
	};
}

//ギアチェンジ後の速度を表示する

public void run() {
	System.out.println("速度は時速" + speed + "㎞です");
	
}
	
}


