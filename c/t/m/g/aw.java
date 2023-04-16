package c.t.m.g.aw;
import c.t.m.g.ax;
import android.os.Looper;
import c.t.m.g.bt;
import java.lang.String;

public abstract class aw extends ax	// class@000bd8
{

    public void aw(){
       super();
    }
    public abstract int a(Looper p0);
    public int b(Looper p0){
       ax tb = this.b;
       _monitor_enter(tb);
       if (this.a != null) {
          _monitor_exit(tb);
          return -1;
       }else {
          this.a = true;
          if (bt.a()) {
             bt.a(this.b(), "startup\(\)");
          }
          _monitor_exit(tb);
          return this.a(p0);
       }
    }
    public int d(){
       return 0;
    }
    public int e(){
       return this.b(Looper.myLooper());
    }
}
