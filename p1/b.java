package p1.b;
import java.lang.Object;
import java.lang.Math;
import android.graphics.Rect;
import android.graphics.Insets;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;

public final class b	// class@002896
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public static final b e;

    static {
       b.e = new b(0, 0, 0, 0);
    }
    public void b(int p0,int p1,int p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public static b a(b p0,b p1){
       return b.b(Math.max(p0.a, p1.a), Math.max(p0.b, p1.b), Math.max(p0.c, p1.c), Math.max(p0.d, p1.d));
    }
    public static b b(int p0,int p1,int p2,int p3){
       if (!p0 && (!p1 && (!p2 && !p3))) {
          return b.e;
       }
       return new b(p0, p1, p2, p3);
    }
    public static b c(Rect p0){
       return b.b(p0.left, p0.top, p0.right, p0.bottom);
    }
    public static b d(Insets p0){
       return b.b(p0.left, p0.top, p0.right, p0.bottom);
    }
    public Insets e(){
       return Insets.of(this.a, this.b, this.c, this.d);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || b.class != p0.getClass()) {
          return false;
       }
       if (this.d != p0.d) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       return true;
    }
    public int hashCode(){
       return ((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d);
    }
    public String toString(){
       return "Insets{left="+this.a+", top="+this.b+", right="+this.c+", bottom="+this.d+'}';
    }
}
