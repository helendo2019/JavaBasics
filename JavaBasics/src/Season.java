
public class Season {

	public static void main(String[] args) {
		int season=Integer.parseInt(args[0]);
		
		switch(season)
		{
		case 1:
		case 2:
		case 3:
			System.out.println("It is a Summer Season");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("It os a Rainy Season");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("It is a Spring Season");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("It is a Winter Season");
			break;
			default:
				System.out.println("It is a Invalid Season");
		}

	}

}
