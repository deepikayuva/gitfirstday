package Dayone;
//StateDetails
public class Question5of2 extends question5of1

{
	public void southIndia() {
		System.out.println("TamilNadu,kerla,Andhra,Karnataka");
	}
	public void northIndia()
	{
		System.out.println("Delhi,punjab,Mumbai");
	}
	public static void main(String[] args) {
		Question5of2 q = new Question5of2();
		//question5of1 q1 = new question5of1();
		q.southIndia();
		q.northIndia();
		//q1.englishLanguage();
		//q1.tamilLanguage();
		//q1.hindiLanguage();
		q.englishLanguage();
		q.tamilLanguage();
		q.hindiLanguage();
		
	}

}
