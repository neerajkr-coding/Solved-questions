
	public static void findOccurance(String main,String str) {
		
		int count=0;
		
		for(int i =0;i<main.length();i++) {
			char ch = main.charAt(i);
			
			
			if(ch==str.charAt(0)) {
				int temp = i;
				for(int j=0;(temp+j)<main.length()&&j<str.length();j++) {
					if(main.charAt(temp+j)!=str.charAt(j)) {
						break;
					}
					if(str.length()-1==(j)) {
						count++;
					}
				}
			}
			
		}
		System.out.println(count);	
	}
}
