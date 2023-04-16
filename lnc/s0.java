package lnc.s0;

public class s0	// class@001dcd
{

    public static int a(byte[] p0,int p1){
       return (((((p0[(p1 + 3)] & 0x00ff) << 24) + ((p0[(p1 + 2)] & 0x00ff) << 16)) + ((p0[(p1 + 1)] & 0x00ff) << 8)) + ((p0[(p1 + 0)] & 0x00ff) << 0));
    }
    public static long b(byte[] p0,int p1){
       return (((((((((long)p0[(p1 + 7)] << 56) + ((long)(p0[(p1 + 6)] & 0x00ff) << 48)) + ((long)(p0[(p1 + 5)] & 0x00ff) << 40)) + ((long)(p0[(p1 + 4)] & 0x00ff) << 32)) + ((long)(p0[(p1 + 3)] & 0x00ff) << 24)) + (long)((p0[(p1 + 2)] & 0x00ff) << 16)) + (long)((p0[(p1 + 1)] & 0x00ff) << 8)) + (long)((p0[(p1 + 0)] & 0x00ff) << 0));
    }
    public static long c(long p0,long p1){
       p0 = (p0 ^ p1) * 0x9ddfea08eb382d69;
       p0 = ((p0 ^ (p0 >> 47)) ^ p1) * 0x9ddfea08eb382d69;
       return ((p0 ^ (p0 >> 47)) * 0x9ddfea08eb382d69);
    }
    public static long d(long p0,int p1){
       if (!p1) {
       }else {
          p0 = (p0 << (p1 - 64)) | (p0 >> p1);
       }
       return p0;
    }
    public static long e(long p0){
       return (p0 ^ (p0 >> 47));
    }
    public static long[] f(byte[] p0,int p1,long p2,long p3){
       long l = s0.b(p0, (p1 + 24));
       p2 = p2 + s0.b(p0, (p1 + 0));
       long l1 = (s0.b(p0, (p1 + 8)) + p2) + s0.b(p0, (p1 + 16));
       long[] olongArray = new long[]{l1,(s0.d(((p3 + p2) + l), 21) + s0.d(l1, 44)) + p2};
       l1 = l1 + l;
       return olongArray;
    }
}
