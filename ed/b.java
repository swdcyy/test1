package ed.b;
import java.lang.Object;
import java.lang.Boolean;
import ab.e;
import ed.b$a;
import android.graphics.Bitmap;
import nd.a;
import java.lang.Integer;
import java.lang.Long;
import java.lang.IllegalArgumentException;
import java.lang.String;
import fb.c;

public class b	// class@00152c
{
    public int a;
    public long b;
    public final int c;
    public final int d;
    public final c e;

    public void b(int p0,int p1){
       super();
       boolean b = true;
       boolean b1 = (p0 > 0)? true: false;
       e.a(Boolean.valueOf(b1));
       if (p1 <= 0) {
          b = false;
       }
       e.a(Boolean.valueOf(b));
       this.c = p0;
       this.d = p1;
       this.e = new b$a(this);
       return;
    }
    public synchronized void a(Bitmap p0){
       int i = a.d(p0);
       boolean b = (this.a > null)? true: false;
       e.b(b, "No bitmaps registered.");
       long l = (long)i;
       b uob = (l - this.b <= 0)? 1: null;
       Object[] objArray = new Object[]{Integer.valueOf(i),Long.valueOf(this.b)};
       if (uob) {
          this.b = this.b - l;
          this.a = this.a - 1;
          return;
       }else {
          throw new IllegalArgumentException(e.h("Bitmap size bigger than the total registered size: %d, %d", objArray));
       }
    }
    public c b(){
       return this.e;
    }
    public synchronized boolean c(Bitmap p0){
       int i = a.d(p0);
       b ta = this.a;
       if (ta < this.c) {
          b tb = this.b;
          long l = (long)i;
          if ((tb + l) - (long)this.d <= 0) {
             this.a = ta + 1;
             this.b = tb + l;
             return 1;
          }
       }
       return false;
    }
}
