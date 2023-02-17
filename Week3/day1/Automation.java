package week3.day2;

public class Automation extends MultipleLanguage implements Language,TestTool{


		// TODO Auto-generated method stub
		public void ruby() {
			System.out.println("Ruby");
			}

			public void Selenium() {
				System.out.println("Selenium");		
			}

			public void Java() {
				System.out.println("Java");		
			}
			
			public static void main(String[] args) {
				Automation auto = new Automation();
				auto.python();
				auto.ruby();
				auto.Selenium();
				auto.Java();

	}

			public void selenium() {
				// TODO Auto-generated method stub
				
			}

			public void java() {
				// TODO Auto-generated method stub
				
			}

}
