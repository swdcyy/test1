package m5.b;
import java.lang.Math;

public class b	// class@0025ad
{

    public static float a(float p0){
       p0 = (p0 - 0x3d25aee6 <= 0)? p0 / 12.92f: (float)Math.pow((double)((p0 + 0.05f) / 0x3f870a3d), 2.40f);
       return p0;
    }
    public static float b(float p0){
       p0 = (p0 - 0x3b4d2e1c <= 0)? p0 * 12.92f: (float)((Math.pow((double)p0, 0x3fdaaaaaa0000000) * 0x3ff0e147a0000000) - 0x3fac28f5c0000000);
       return p0;
    }
    public static int c(float p0,int p1,int p2){
       float f = (float)((p1 >> 24) & 0x00ff) / 0x437f0000;
       float f1 = b.a(((float)((p1 >> 16) & 0x00ff) / 0x437f0000));
       float f2 = b.a(((float)((p1 >> 8) & 0x00ff) / 0x437f0000));
       float f3 = b.a(((float)(p1 & 0x00ff) / 0x437f0000));
       return ((((Math.round((b.b((f1 + ((b.a(((float)((p2 >> 16) & 0x00ff) / 0x437f0000)) - f1) * p0))) * 0x437f0000)) << 16) | (Math.round(((f + ((((float)((p2 >> 24) & 0x00ff) / 0x437f0000) - f) * p0)) * 0x437f0000)) << 24)) | (Math.round((b.b((f2 + ((b.a(((float)((p2 >> 8) & 0x00ff) / 0x437f0000)) - f2) * p0))) * 0x437f0000)) << 8)) | Math.round((b.b((f3 + (p0 * (b.a(((float)(p2 & 0x00ff) / 0x437f0000)) - f3)))) * 0x437f0000)));
    }
}
