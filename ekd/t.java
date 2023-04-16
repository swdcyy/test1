package ekd.t;
import java.lang.Object;
import ekd.t$a;
import android.os.Looper;
import android.os.Handler;
import android.os.Message;

public abstract class t	// class@000d7b
{
    public final int a;
    public final int b;
    public int c;
    public boolean d;
    public boolean e;
    public final Handler f;

    public void t(int p0,int p1){
       super();
       this.f = new t$a(this, Looper.getMainLooper());
       this.b = p0;
       this.c = p0;
       this.a = p1;
    }
    public synchronized final void a(){
       if (this.d == null) {
          this.d = true;
          this.e = false;
          this.f.removeMessages(true);
          this.c();
       }
       return;
    }
    public synchronized final boolean b(){
       return this.e;
    }
    public void c(){
    }
    public abstract void d();
    public abstract void e(int p0);
    public synchronized final t f(){
       if (this.e != null) {
          return this;
       }
       boolean b = false;
       this.d = b;
       boolean b1 = true;
       this.e = b1;
       if (this.a <= null || this.b <= null) {
          this.e = b;
          this.d();
          return this;
       }else {
          t tf = this.f;
          tf.sendMessage(tf.obtainMessage(b1));
          return this;
       }
    }
}
