package androidx.appcompat.view.menu.b$c;
import w0.o;
import androidx.appcompat.view.menu.b;
import java.lang.Object;
import androidx.appcompat.view.menu.e;
import android.view.MenuItem;
import android.os.Handler;
import java.util.List;
import androidx.appcompat.view.menu.b$d;
import androidx.appcompat.view.menu.b$c$a;
import android.os.SystemClock;
import java.lang.Runnable;

public class b$c implements o	// class@0005a4
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public void a(e p0,MenuItem p1){
       Object obj = null;
       this.b.h.removeCallbacksAndMessages(obj);
       int i = this.b.j.size();
       int i1 = 0;
       while (true) {
          int i2 = -1;
          if (i1 < i) {
             if (p0 == this.b.j.get(i1).b) {
             label_0027 :
                if (i1 == i2) {
                   return;
                }
                i1 = i1 + 1;
                if (i1 < this.b.j.size()) {
                   obj = this.b.j.get(i1);
                   break ;
                }
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             i1 = -1;
             goto label_0027 ;
          }
       }
       this.b.h.postAtTime(new b$c$a(this, obj, p1, p0), p0, (SystemClock.uptimeMillis() + 200));
       return;
    }
    public void b(e p0,MenuItem p1){
       this.b.h.removeCallbacksAndMessages(p0);
    }
}
