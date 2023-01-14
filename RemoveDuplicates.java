package day11;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java";	
		
		String[] textArray = new String[text.length()];
		int count = 0;
		String[] arr1 = text.split(" ");
		for(int i=0; i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i].equalsIgnoreCase(arr1[j])) {
					arr1[j]="";
					count++;
                   
				}
			}

		}
		if(count>1) {
			for(int r=0; r<arr1.length-1;r++) {
				System.out.print(arr1[r]+" ");
			}	
		}

	}
}

