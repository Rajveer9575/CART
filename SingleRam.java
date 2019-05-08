class SingleRam
{
	private static SingleRam ram=null;
	private SingleRam()
	{
		
	}
	public static SingleRam getRam()
	{
		if(ram==null)
			ram=new SingleRam();
		return ram;
	}
	public static void main(String[] args)
	{
		System.out.println(SingleRam.getRam()); 
		System.out.println(SingleRam.getRam()); 
		
		
	}
}
