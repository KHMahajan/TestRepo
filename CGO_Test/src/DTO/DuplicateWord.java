package DTO;

public class DuplicateWord {

	public static void main(String args[]) {
		String s1="The CGO here. Hello world In This world techmologies are growing rapidly. The java is one of them This";
		
		String[] allWords= s1.split(" ");	
		
		for(int i=0; i< allWords.length;i++) {
			int	cnt=1;
				for(int j=i+1 ; j<allWords.length;j++) {
					if(allWords[i].equals(allWords[j])) {
						cnt++;
						allWords[j]="0";
					}
				}
				if(cnt>1 && allWords[i]!="0") {
					System.out.print(cnt);
					System.out.println(allWords[i]);	
				}
		}
	}
}
