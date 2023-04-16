package ld.a;
import uc.e;
import uc.d;
import bd.d;
import java.lang.Boolean;
import ab.e;
import java.lang.Math;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import cb.a;
import com.facebook.imageformat.a;
import nc.a;

public class a	// class@002543
{

    public static int a(e p0,d p1,d p2,int p3){
       float f;
       boolean i2;
       int i3;
       float f1;
       double d;
       double d1;
       d uod = p1;
       int i = 1;
       if (!d.s(p2)) {
          return i;
       }
       e.a(Boolean.valueOf(d.s(p2)));
       int i1 = 2;
       if (uod && (uod.b > null && (uod.a > null && (!p2.getWidth() || !p2.getHeight())))) {
          f = 0x3f800000;
       }else {
          int i4 = 270;
          d uod1 = 90;
          int i5 = 0;
          if (!p0.g()) {
             d = 0;
          }else {
             i3 = p2.l();
             i2 = (i3 && (i3 != uod1 && (i3 == 180 || i3 == i4)))? true: false;
             e.a(Boolean.valueOf(i2));
          }
          i3 = (d == uod1 || d == i4)? 1: 0;
          i4 = (i3)? p2.getHeight(): p2.getWidth();
          i3 = (i3)? p2.getWidth(): p2.getHeight();
          float f2 = (float)uod.a / (float)i4;
          float f3 = (float)uod.b / (float)i3;
          f = Math.max(f2, f3);
          Object[] objArray = new Object[7];
          objArray[i5] = Integer.valueOf(uod.a);
          objArray[i] = Integer.valueOf(uod.b);
          objArray[i1] = Integer.valueOf(i4);
          objArray[3] = Integer.valueOf(i3);
          objArray[4] = Float.valueOf(f2);
          objArray[5] = Float.valueOf(f3);
          objArray[6] = Float.valueOf(f);
          a.s("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", objArray);
       }
       i2 = 0x3f2aaaab;
       if (p2.j() == a.a) {
          if (f - i2 <= 0) {
             i = 2;
             i1 = i * 2;
             d = 0x3ff0000000000000 / (double)i1;
             d1 = d * 0x3fd5555560000000;
             d = d + d1;
             while (d - (double)f > 0) {
                i = i1;
             }
          }
       }else if(f - i2 > 0){
          d = (double)i1;
          d1 = Math.pow(d, 2.00f) - d;
          d1 = 0x3ff0000000000000 / d1;
          d = 0x3ff0000000000000 / d;
          d1 = d1 * 0x3fd5555560000000;
          d = d + d1;
          while (d - (double)f > 0) {
             i1 = i1 + 1;
          }
          i = i1 - 1;
       }
       i1 = Math.max(p2.getHeight(), p2.getWidth());
       uod = (uod != null)? uod.c: (float)p3;
       i3 = i1 / i;
       while ((float)i3 - uod > 0) {
          i = (p2.j() == a.a)? i * 2: i + 1;
       }
       return i;
    }
}
