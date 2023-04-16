package c.t.m.g.ay;
import c.t.m.g.bz$a;
import android.os.Looper;
import c.t.m.g.bt;
import java.lang.String;

public abstract class ay extends bz$a	// class@000bda
{
    public boolean a;
    public byte[] b;

    public void ay(){
       super();
       this.a = false;
       byte[] uobyteArray = new byte[false];
       this.b = uobyteArray;
    }
    public abstract int a(Looper p0);
    public abstract void a();
    public int b(Looper p0){
       ay tb = this.b;
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
    public abstract String b();
    public void c(){
       ay tb = this.b;
       _monitor_enter(tb);
       if (this.a == null) {
          _monitor_exit(tb);
          return;
       }else if(bt.a()){
          bt.a(this.b(), "shutdown\(\)");
       }
       this.a();
       this.a = false;
       _monitor_exit(tb);
       return;
    }
    public boolean e(){
       ay tb = this.b;
       _monitor_enter(tb);
       _monitor_exit(tb);
       return this.a;
    }
}
