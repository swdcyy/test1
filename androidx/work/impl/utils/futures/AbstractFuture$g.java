package androidx.work.impl.utils.futures.AbstractFuture$g;
import androidx.work.impl.utils.futures.AbstractFuture$b;
import androidx.work.impl.utils.futures.AbstractFuture$a;
import androidx.work.impl.utils.futures.AbstractFuture;
import androidx.work.impl.utils.futures.AbstractFuture$d;
import java.lang.Object;
import androidx.work.impl.utils.futures.AbstractFuture$h;
import java.lang.Thread;

public final class AbstractFuture$g extends AbstractFuture$b	// class@000a9c
{

    public void AbstractFuture$g(){
       super(null);
    }
    public boolean a(AbstractFuture p0,AbstractFuture$d p1,AbstractFuture$d p2){
       _monitor_enter(p0);
       if (p0.c == p1) {
          p0.c = p2;
          _monitor_exit(p0);
          return true;
       }else {
          _monitor_exit(p0);
          return false;
       }
    }
    public boolean b(AbstractFuture p0,Object p1,Object p2){
       _monitor_enter(p0);
       if (p0.b == p1) {
          p0.b = p2;
          _monitor_exit(p0);
          return true;
       }else {
          _monitor_exit(p0);
          return false;
       }
    }
    public boolean c(AbstractFuture p0,AbstractFuture$h p1,AbstractFuture$h p2){
       _monitor_enter(p0);
       if (p0.d == p1) {
          p0.d = p2;
          _monitor_exit(p0);
          return true;
       }else {
          _monitor_exit(p0);
          return false;
       }
    }
    public void d(AbstractFuture$h p0,AbstractFuture$h p1){
       p0.b = p1;
    }
    public void e(AbstractFuture$h p0,Thread p1){
       p0.a = p1;
    }
}
