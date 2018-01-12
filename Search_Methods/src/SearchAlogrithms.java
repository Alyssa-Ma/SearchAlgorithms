//Alyssa Ma 1/12/18
public class SearchAlogrithms 
{
	
	public static void main (String[] args)
	{
		int[] test1 = {1,2,3,4,5,6,7,8,9,10};
		int[] test2 = {0,4,5,6,12,15,17,23,29};
	
		System.out.println(binSearch(test1, 3)); //2
		System.out.println(linSearch(test1, 3)); //2
		
		System.out.println(binSearch(test2, 23)); //7
		System.out.println(linSearch(test2, 23)); //7
		
		System.out.println(binSearch(test2, 25)); //-1
		System.out.println(linSearch(test2, 25)); //-1
		
		System.out.println(binSearch(test1, 10)); //9
		System.out.println(linSearch(test1, 1)); //0
		
		System.out.println(binSearch(test1, 1)); //0
	}
	
	public static int linSearch(int[]nums, int query)
	{
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i] == query)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static int binSearch(int[]nums, int query)
	{
		int i = 0;
		int r = nums.length - 1;
		while(i <= r)
		{
			int k = i +(r-i)/2;
			
			if(nums[k]==query)
			{
				return k;
			}
			
			if(nums[k] < query)
			{
				i = k+1;
			}
			
			else
			{
				r = k-1;
			}
		}
		return -1;
	}
	
}
