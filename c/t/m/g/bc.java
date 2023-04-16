package c.t.m.g.bc;

public class bc	// class@000be0
{

    public static void a(byte[] p0,int p1,boolean p2){
       int i;
       if (p2) {
          i = p1 / 8;
          p0[i] = (byte)((1 << (p1 % 8)) | p0[i]);
       }else {
          i = p1 / 8;
          p0[i] = (byte)((~ (1 << (p1 % 8))) & p0[i]);
       }
       return;
    }
    public static boolean a(byte[] p0,int p1){
       int i = 1;
       if (p0[(p1 / 8)] & (i << (p1 % 8))) {
       }else {
          i = false;
       }
       return i;
    }
}
