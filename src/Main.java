
public class Main {
	public static  class Num{
		public int firstMax;
		public int secondMax;
	}
	
	public static Num Find(int []a){
		Num reslut=new Num();
		reslut.firstMax=-32768;
		reslut.secondMax=-32767;
		for(int i=0;i<a.length;i++){
			
			if(a[i]>reslut.firstMax){
				reslut.firstMax=a[i];
			}else if((a[i]<reslut.firstMax)&&(a[i]>reslut.secondMax)){
				reslut.secondMax=a[i];
			}
		
		}
		return reslut;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []a=new int[]{6,3,5,8};
//		Num o=Find(a);
//		System.out.println("firstMax="+o.firstMax+",SecondMax="+o.secondMax);
	
	
	}

}
