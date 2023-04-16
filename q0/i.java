package q0.i;
import java.lang.Object;
import java.lang.Math;

public class i	// class@002946
{
    public long a;
    public long b;
    public int c;
    public static i d;

    public void i(){
       super();
    }
    public static i b(){
       if (i.d == null) {
          i.d = new i();
       }
       return i.d;
    }
    public void a(long p0,double p1,double p2){
       i oi = this;
       long l = 0xdc6d62da00;
       float f = (float)(p0 - l) / 86400000.00f;
       float f1 = (0.02f * f) + 6.24f;
       double d = (double)f1;
       double d1 = (((((Math.sin(d) * 0x3fa11c5fc0000000) + d) + (Math.sin((double)(2.00f * f1)) * 0x3f36e05b00000000)) + (Math.sin((double)(f1 * 3.00f)) * 0x3ed5f61cc0000000)) + 0x3ffcbed85e1ce332) + 0x400921fb54442d18;
       double d2 = (- p2) / 360.00f;
       double d3 = (double)((float)Math.round(((double)(f - 0x3a6bedfa) - d2)) + 0x3a6bedfa) + d2;
       d3 = (d3 + (Math.sin(d) * 0x3f75b573eab367a1)) + (Math.sin((2.00f * d1)) * 0xbf7c432ca57a786c);
       d = Math.sin(d1);
       d = Math.asin((d * Math.sin(0x3fda31a380000000)));
       d1 = 0x3f91df46a0000000 * p1;
       d2 = (Math.sin(0xbfbaceea00000000) - (Math.sin(d1) * Math.sin(d))) / (Math.cos(d1) * Math.cos(d));
       long l1 = -1;
       if (d2 - 0x3ff0000000000000 >= 0) {
          oi.c = 1;
          oi.a = l1;
          oi.b = l1;
          return;
       }else if(d2 - 0xbff0000000000000 <= 0){
          oi.c = 0;
          oi.a = l1;
          oi.b = l1;
          return;
       }else {
          double d4 = (double)(float)(Math.acos(d2) / 0x401921fb54442d18);
          oi.a = Math.round(((d3 + d4) * 86400000.00f)) + l;
          long l2 = Math.round(((d3 - d4) * 86400000.00f)) + l;
          oi.b = l2;
          oi.c = (l2 - p0 < 0 && oi.a - p0 > 0)? 0: 1;
          return;
       }
    }
}
