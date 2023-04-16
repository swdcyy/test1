package ik.f;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import ik.f$a;
import android.os.Handler$Callback;
import ik.f$c;
import java.lang.ref.WeakReference;
import ik.f$b;
import android.os.Message;

public class f	// class@0021f9
{
    public final Object a;
    public final Handler b;
    public f$c c;
    public f$c d;
    public static f e;

    public void f(){
       super();
       this.a = new Object();
       this.b = new Handler(Looper.getMainLooper(), new f$a(this));
    }
    public static f b(){
       if (f.e == null) {
          f.e = new f();
       }
       return f.e;
    }
    public final boolean a(f$c p0,int p1){
       f$b uob = p0.a.get();
       if (uob == null) {
          return false;
       }
       this.b.removeCallbacksAndMessages(p0);
       uob.c(p1);
       return true;
    }
    public void c(f$c p0){
       f ta = this.a;
       _monitor_enter(ta);
       if (this.c == p0 || this.d == p0) {
          this.a(p0, 2);
       }
       _monitor_exit(ta);
       return;
    }
    public final boolean d(f$b p0){
       f tc = this.c;
       boolean b = (tc != null && tc.a(p0))? true: false;
       return b;
    }
    public void e(f$b p0){
       f ta = this.a;
       _monitor_enter(ta);
       if (this.d(p0)) {
          f tc = this.c;
          if (tc.c == null) {
             tc.c = true;
             this.b.removeCallbacksAndMessages(tc);
          }
       }
       _monitor_exit(ta);
       return;
    }
    public void f(f$b p0){
       f ta = this.a;
       _monitor_enter(ta);
       if (this.d(p0)) {
          f tc = this.c;
          if (tc.c != null) {
             tc.c = false;
             this.g(tc);
          }
       }
       _monitor_exit(ta);
       return;
    }
    public final void g(f$c p0){
       f$c b = p0.b;
       if (b == -2) {
          return;
       }
       if (b <= null) {
          b = (b == -1)? 1500: 2750;
       }
    label_0013 :
       this.b.removeCallbacksAndMessages(p0);
       f tb = this.b;
       tb.sendMessageDelayed(Message.obtain(tb, 0, p0), (long)b);
       return;
    }
}
