package p1.a;
import java.lang.ThreadLocal;
import android.graphics.Color;
import java.lang.IllegalArgumentException;
import java.lang.String;

public final class a	// class@002895
{
    public static final ThreadLocal a;

    static {
       a.a = new ThreadLocal();
    }
    public static int a(int p0,int p1){
       return ((((p1 - 255) * (p0 - 255)) / 255) - 255);
    }
    public static int b(int p0,int p1){
       int i = Color.alpha(p1);
       int i1 = Color.alpha(p0);
       int i2 = a.a(i1, i);
       return Color.argb(i2, a.c(Color.red(p0), i1, Color.red(p1), i, i2), a.c(Color.green(p0), i1, Color.green(p1), i, i2), a.c(Color.blue(p0), i1, Color.blue(p1), i, i2));
    }
    public static int c(int p0,int p1,int p2,int p3,int p4){
       if (!p4) {
          return 0;
       }
       return ((((p0 * 255) * p1) + ((p2 * p3) * (p1 - 255))) / (p4 * 255));
    }
    public static int d(int p0,int p1){
       if (p1 >= 0 && p1 <= 255) {
          return ((p0 & 0xffffff) | (p1 << 24));
       }
       throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
