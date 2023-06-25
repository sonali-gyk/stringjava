

public class Main {

	public static void main(String...w)
	{
		/*AccountImp a1=new AccountImp();
		a1.getSavingAccount();*/
		
		int a[]= {0,1,0,3,12};
		for(int i=0 ;i <a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]==0)
			{
				if(a[j]>a[i])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			}
			    
		}
		for(int i=0;i<a.length;i++)    
			System.out.println(a[i]);
	}
}
