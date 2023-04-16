package kqd.i;

public final class i	// class@001b59
{

    public static byte a(byte[] p0,int p1){
       return p0[p1];
    }
    public static int b(byte[] p0,int p1){
       return ((p0[(p1 + 3)] & 0x00ff) | ((((p0[p1] & 0x00ff) << 24) | ((p0[(p1 + 1)] & 0x00ff) << 16)) | ((p0[(p1 + 2)] & 0x00ff) << 8)));
    }
    public static int c(byte[] p0,int p1){
       return (((p0[(p1 + 3)] & 0x00ff) << 24) | (((p0[p1] & 0x00ff) | ((p0[(p1 + 1)] & 0x00ff) << 8)) | ((p0[(p1 + 2)] & 0x00ff) << 16)));
    }
    public static long d(byte[] p0,int p1){
       return (((long)p0[(p1 + 7)] & 255) | (((((((((long)p0[p1] & 255) << 56) | (((long)p0[(p1 + 1)] & 255) << 48)) | (((long)p0[(p1 + 2)] & 255) << 40)) | (((long)p0[(p1 + 3)] & 255) << 32)) | (((long)p0[(p1 + 4)] & 255) << 24)) | (((long)p0[(p1 + 5)] & 255) << 16)) | (((long)p0[(p1 + 6)] & 255) << 8)));
    }
    public static long e(byte[] p0,int p1){
       return ((((long)p0[(p1 + 7)] & 255) << 56) | ((((((((long)p0[p1] & 255) | (((long)p0[(p1 + 1)] & 255) << 8)) | (((long)p0[(p1 + 2)] & 255) << 16)) | (((long)p0[(p1 + 3)] & 255) << 24)) | (((long)p0[(p1 + 4)] & 255) << 32)) | (((long)p0[(p1 + 5)] & 255) << 40)) | (((long)p0[(p1 + 6)] & 255) << 48)));
    }
    public static short f(byte[] p0,int p1){
       p1++;
       return (short)((p0[p1] & 0x00ff) | (p0[p1] << 8));
    }
    public static short g(byte[] p0,int p1){
       p1++;
       return (short)((p0[p1] << 8) | (p0[p1] & 0x00ff));
    }
    public static int h(byte[] p0,int p1){
       return ((p0[(p1 + 2)] & 0x00ff) | (((p0[p1] & 0x00ff) << 16) | ((p0[(p1 + 1)] & 0x00ff) << 8)));
    }
    public static int i(byte[] p0,int p1){
       return (((p0[(p1 + 2)] & 0x00ff) << 16) | ((p0[p1] & 0x00ff) | ((p0[(p1 + 1)] & 0x00ff) << 8)));
    }
    public static void j(byte[] p0,int p1,int p2){
       p0[p1] = (byte)p2;
    }
    public static void k(byte[] p0,int p1,int p2){
       p0[p1] = (byte)(p2 >> 24);
       p0[(p1 + 1)] = (byte)(p2 >> 16);
       p0[(p1 + 2)] = (byte)(p2 >> 8);
       p0[(p1 + 3)] = (byte)p2;
    }
    public static void l(byte[] p0,int p1,int p2){
       p0[p1] = (byte)p2;
       p0[(p1 + 1)] = (byte)(p2 >> 8);
       p0[(p1 + 2)] = (byte)(p2 >> 16);
       p0[(p1 + 3)] = (byte)(p2 >> 24);
    }
    public static void m(byte[] p0,int p1,long p2){
       p0[p1] = (byte)(int)(p2 >> 56);
       p0[(p1 + 1)] = (byte)(int)(p2 >> 48);
       p0[(p1 + 2)] = (byte)(int)(p2 >> 40);
       p0[(p1 + 3)] = (byte)(int)(p2 >> 32);
       p0[(p1 + 4)] = (byte)(int)(p2 >> 24);
       p0[(p1 + 5)] = (byte)(int)(p2 >> 16);
       p0[(p1 + 6)] = (byte)(int)(p2 >> 8);
       p0[(p1 + 7)] = (byte)(int)p2;
    }
    public static void n(byte[] p0,int p1,long p2){
       p0[p1] = (byte)(int)p2;
       p0[(p1 + 1)] = (byte)(int)(p2 >> 8);
       p0[(p1 + 2)] = (byte)(int)(p2 >> 16);
       p0[(p1 + 3)] = (byte)(int)(p2 >> 24);
       p0[(p1 + 4)] = (byte)(int)(p2 >> 32);
       p0[(p1 + 5)] = (byte)(int)(p2 >> 40);
       p0[(p1 + 6)] = (byte)(int)(p2 >> 48);
       p0[(p1 + 7)] = (byte)(int)(p2 >> 56);
    }
    public static void o(byte[] p0,int p1,int p2){
       p0[p1] = (byte)(p2 >> 16);
       p0[(p1 + 1)] = (byte)(p2 >> 8);
       p0[(p1 + 2)] = (byte)p2;
    }
    public static void p(byte[] p0,int p1,int p2){
       p0[p1] = (byte)p2;
       p0[(p1 + 1)] = (byte)(p2 >> 8);
       p0[(p1 + 2)] = (byte)(p2 >> 16);
    }
    public static void q(byte[] p0,int p1,int p2){
       p0[p1] = (byte)(p2 >> 8);
       p1++;
       p0[p1] = (byte)p2;
    }
    public static void r(byte[] p0,int p1,int p2){
       p0[p1] = (byte)p2;
       p1++;
       p0[p1] = (byte)(p2 >> 8);
    }
}
