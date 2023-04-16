package cl0.c;
import java.lang.Object;

public class c	// class@0004dc
{
    public int a;
    public byte[] b;
    public int c;
    public int d;
    public int[][] e;
    public int[] f;
    public int[] g;
    public int[] h;
    public int[] i;

    public void c(byte[] p0,int p1,int p2){
       super();
       int[] ointArray = new int[256];
       this.f = ointArray;
       ointArray = new int[256];
       this.g = ointArray;
       ointArray = new int[256];
       this.h = ointArray;
       ointArray = new int[32];
       this.i = ointArray;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       int[][] ointArray1 = new int[][256];
       this.e = ointArray1;
       for (p1 = 0; p1 < 256; p1++) {
          c te = this.e;
          ointArray = new int[4];
          te[p1] = ointArray;
          object oobject = te[p1];
          int i = p1 << 12;
          i = i / 256;
          oobject[2] = i;
          oobject[1] = i;
          oobject[0] = i;
          oobject[p1] = 256;
          oobject[p1] = 0;
       }
       return;
    }
}
