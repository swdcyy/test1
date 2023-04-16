package ed.o;
import ed.d;
import ed.x;
import eb.c;
import java.lang.Object;
import ed.e;
import eb.b;
import android.graphics.Bitmap;
import ed.t;
import android.graphics.Bitmap$Config;
import com.facebook.common.memory.MemoryTrimType;

public class o implements d	// class@001f2f
{
    public final t a;
    public final int b;
    public int c;
    public final x d;
    public int e;

    public void o(int p0,int p1,x p2,c p3){
       super();
       this.a = new e();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       if (p3 != null) {
          p3.b(this);
       }
       return;
    }
    public void a(Object p0){
       int i = this.a.a(p0);
       if (i <= this.c) {
          this.d.e(i);
          this.a.put(p0);
          _monitor_enter(this);
          this.e = this.e + i;
          _monitor_exit(this);
       }
       return;
    }
    public synchronized final void d(int p0){
       while (this.e > p0) {
          Bitmap uBitmap = this.a.pop();
          if (uBitmap == null) {
             break ;
          }else {
             int i = this.a.a(uBitmap);
             int i1 = this.e - i;
             this.e = i1;
             this.d.d(i);
          }
       }
       return;
    }
    public Object get(int p0){
       _monitor_enter(this);
       o tb = this.b;
       if (this.e > tb) {
          this.d(tb);
       }
       Bitmap uBitmap = this.a.get(p0);
       if (uBitmap != null) {
          p0 = this.a.a(uBitmap);
          this.e = this.e - p0;
          this.d.b(p0);
          _monitor_exit(this);
       }else {
          this.d.a(p0);
          uBitmap = Bitmap.createBitmap(1, p0, Bitmap$Config.ALPHA_8);
          _monitor_exit(this);
       }
       return uBitmap;
    }
    public void o(MemoryTrimType p0){
       this.d((int)((double)this.b * (0x3ff0000000000000 - p0.getSuggestedTrimRatio())));
    }
}
