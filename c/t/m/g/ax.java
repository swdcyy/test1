package c.t.m.g.ax;
import java.lang.Object;
import java.lang.String;
import c.t.m.g.bt;

public abstract class ax	// class@000bd9
{
    public boolean a;
    public byte[] b;

    public void ax(){
       super();
       this.a = false;
       byte[] uobyteArray = new byte[false];
       this.b = uobyteArray;
    }
    public abstract void a();
    public abstract String b();
    public abstract int d();
    public int e(){
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
          return this.d();
       }
    }
    public boolean f(){
       ax tb = this.b;
       _monitor_enter(tb);
       _monitor_exit(tb);
       return this.a;
    }
    public void g(){
       ax tb = this.b;
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
}
