package hw1;
import java.lang.*;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		int[] equal1000 = new int[1000];
		for (int i = 0; i < equal1000.length; i++) {
			equal1000[i]=0;
		}
		 int[] equal10000 = new int[10000];
		for (int i = 0; i < equal10000.length; i++) {
			equal10000[i]=0;
		}
		  int[] equal100000 = new int[100000];
		for (int i = 0; i < equal100000.length; i++) {
			equal100000[i]=0;
		}
	
		Random rand = new Random();
		int[] random1000 = new int[1000];
		for (int i = 0; i < random1000.length; i++) {
			 int rand_int1 = rand.nextInt(1000);
			 random1000[i]=rand_int1;
		}
		int[] random10000 = new int[10000];
		for (int i = 0; i < random10000.length; i++) {
			 int rand_int1 = rand.nextInt(10000);
			 random10000[i]=rand_int1;
		}
		int[] random100000 = new int[100000];
		for (int i = 0; i < random100000.length; i++) {
			 int rand_int1 = rand.nextInt(100000);
			 random100000[i]=rand_int1;
		}
		int[] increase1000 = new int[1000];
		int a=0;
		for (int i = 0; i < increase1000.length; i++) {
			increase1000[i]=a;
			a++;
		}
		a=0;
		int[] increase10000 = new int[10000];
		for (int i = 0; i < increase10000.length; i++) {
			increase10000[i]=a;
			a++;
		}
		a=0;
		int[] increase100000 = new int[100000];
		for (int i = 0; i < increase100000.length; i++) {
			increase100000[i]=a;
			a++;
		}
		a=100000;
		int[] decrease100000 = new int[100000];
		for (int i = 0; i < decrease100000.length; i++) {
			decrease100000[i]=a;
			a--;
		}
		a=10000;
		int[] decrease10000 = new int[10000];
		for (int i = 0; i < decrease10000.length; i++) {
			decrease10000[i]=a;
			a--;
		}
		a=1000;
		int[] decrease1000 = new int[1000];
		for (int i = 0; i < decrease1000.length; i++) {
			decrease1000[i]=a;
			a--;
		}
		//arraylari olusturduk
		
		Bucketsort bucketSort=new Bucketsort();
		HeapSort heapsort=new HeapSort();
		//classlari actik
		
		int b= decrease1000.length;//bucket sort icin arrayin uzunlugunu kaydettik
		double nanotimeS=System.nanoTime();
		double timemillisS=System.currentTimeMillis();
		System.out.print(System.nanoTime()+" ");
		System.out.println(System.currentTimeMillis());
	
		heapsort.sort(decrease1000);
		//dualPivotQuicksort DPQS=new dualPivotQuicksort(decrease1000);
		//bucketSort.bucketSort(decrease1000, b);
	
		
		System.out.print(System.nanoTime()+" ");
		System.out.println(System.currentTimeMillis());
		double nanotimeE=System.nanoTime();
		double timemillisE=System.currentTimeMillis();
		System.out.println("nanotime is :"+ (nanotimeE-nanotimeS));
		System.out.println("tmemillis is :"+ (timemillisE-timemillisS));
		
	}

}
