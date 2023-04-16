package e1.t$m;

public class t$m	// class@001eb1
{

    public static void a(int[] p0,float[] p1,int p2,int p3){
       int[] ointArray = new int[(p0.length + 10)];
       ointArray[0] = p3;
       ointArray[1] = p2;
       p2 = 2;
       while (p2 > 0) {
          p2--;
          int i = ointArray[p2];
          p2--;
          int i1 = ointArray[p2];
          if (i < i1) {
             int i2 = t$m.b(p0, p1, i, i1);
             int i3 = p2 + 1;
             int i4 = i2 - 1;
             ointArray[p2] = i4;
             p2 = i3 + 1;
             ointArray[i3] = i;
             i = p2 + 1;
             ointArray[p2] = i1;
             p2 = i + 1;
             i2 = i2 + 1;
             ointArray[i] = i2;
          }
       }
       return;
    }
    public static int b(int[] p0,float[] p1,int p2,int p3){
       int i = p0[p3];
       int i1 = p2;
       while (p2 < p3) {
          if (p0[p2] <= i) {
             t$m.c(p0, p1, i1, p2);
             i1 = i1 + 1;
          }
          p2++;
       }
       t$m.c(p0, p1, i1, p3);
       return i1;
    }
    public static void c(int[] p0,float[] p1,int p2,int p3){
       int i = p0[p2];
       p0[p2] = p0[p3];
       p0[p3] = i;
       int i1 = p1[p2];
       p1[p2] = p1[p3];
       p1[p3] = i1;
    }
}
