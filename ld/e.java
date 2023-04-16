package ld.e;
import java.lang.Integer;
import java.lang.Object;
import com.facebook.common.internal.ImmutableList;
import uc.e;
import bd.d;
import java.util.ArrayList;
import java.lang.IllegalArgumentException;
import java.lang.String;
import uc.d;
import java.lang.Math;

public class e	// class@002547
{
    public static final ImmutableList a;

    static {
       Integer[] integerArray = new Integer[]{Integer.valueOf(2),Integer.valueOf(7),Integer.valueOf(4),Integer.valueOf(5)};
       e.a = ImmutableList.of(integerArray);
    }
    public static int a(e p0,d p1){
       ImmutableList a = e.a;
       int i = a.indexOf(Integer.valueOf(p1.g()));
       if (i < 0) {
          throw new IllegalArgumentException("Only accepts inverted exif orientations");
       }
       int i1 = 0;
       if (!p0.g()) {
          i1 = p0.e();
       }
       return a.get(((i + (i1 / 90)) % a.size())).intValue();
    }
    public static int b(e p0,d p1){
       int i = 0;
       if (!p0.f()) {
          return i;
       }
       int i1 = p1.l();
       if (i1 == 90 || (i1 == 180 || i1 == 270)) {
          i = p1.l();
       }
       if (p0.g()) {
          return i;
       }else {
          return ((i + p0.e()) % 360);
       }
    }
    public static int c(e p0,d p1,d p2,boolean p3){
       if (!p3) {
          return 8;
       }
       if (p1 == null) {
          return 8;
       }
       int i = e.b(p0, p2);
       d uod = null;
       int i1 = (e.a.contains(Integer.valueOf(p2.g())))? e.a(p0, p2): 0;
       int i2 = 1;
       if (i != 90 && (i != 270 && (i1 == 5 || i1 == 7))) {
          uod = 1;
       }
       i1 = (uod)? p2.getHeight(): p2.getWidth();
       int width = (uod)? p2.getWidth(): p2.getHeight();
       float f = (float)i1;
       float f1 = (float)width;
       float f2 = Math.max(((float)p1.a / f), ((float)p1.b / f1));
       uod = p1.c;
       if ((f * f2) - uod > 0) {
          f2 = uod / f;
       }
       if ((f1 * f2) - uod > 0) {
          f2 = uod / f1;
       }
       i1 = (int)(p1.d + (f2 * 8.00f));
       if (i1 > 8) {
          return 8;
       }else if(i1 < i2){
          i2 = i1;
       }
       return i2;
    }
}
