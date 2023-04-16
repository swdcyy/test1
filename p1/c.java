package p1.c;
import java.lang.ThreadLocal;
import android.graphics.Paint;
import java.lang.String;
import android.os.Build$VERSION;
import java.lang.Character;
import z1.e;
import android.graphics.Rect;
import java.lang.Object;

public final class c	// class@002897
{
    public static final ThreadLocal a;

    static {
       c.a = new ThreadLocal();
    }
    public static boolean a(Paint p0,String p1){
       if (Build$VERSION.SDK_INT >= 23) {
          return p0.hasGlyph(p1);
       }
       int i = p1.length();
       if (i == 1 && Character.isWhitespace(p1.charAt(0))) {
          return true;
       }
       String str = "\xff\x02\xff\x02\xff\x02\xff\x02\x00";
       float f = p0.measureText(str);
       float f1 = p0.measureText("m");
       float f2 = p0.measureText(p1);
       float f3 = 0;
       if (!f2 - f3) {
          return 0;
       }
       if (p1.codePointCount(0, p1.length()) > 1) {
          if (f2 - (f1 * 2.00f) > 0) {
             return 0;
          }else {
             for (int i1 = 0; i1 < i; i1 = i2) {
                int i2 = Character.charCount(p1.codePointAt(i1)) + i1;
                f3 = f3 + p0.measureText(p1, i1, i2);
             }
             if (f2 - f3 >= 0) {
                return 0;
             }
          }
       }
       if (f2 - f) {
          return true;
       }else {
          e uoe = c.b();
          p0.getTextBounds(str, 0, 2, uoe.a);
          p0.getTextBounds(p1, 0, i, uoe.b);
          return (uoe.a.equals(uoe.b) ^ true);
       }
    }
    public static e b(){
       ThreadLocal a = c.a;
       e uoe = a.get();
       if (uoe == null) {
          uoe = new e(new Rect(), new Rect());
          a.set(uoe);
       }else {
          uoe.a.setEmpty();
          uoe.b.setEmpty();
       }
       return uoe;
    }
}
