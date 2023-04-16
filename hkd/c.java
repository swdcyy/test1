package hkd.c;
import java.lang.Object;

public class c	// class@000f89
{
    public boolean a;

    public void c(){
       super();
       this.a = false;
    }
    public void c(boolean p0){
       super();
       this.a = p0;
    }
    public void a(){
       _monitor_enter(this);
       while (this.a == null) {
          try{
             this.wait();
          }catch(java.lang.InterruptedException e0){
          }
       }
       _monitor_exit(this);
       return;
    }
    public void b(){
       _monitor_enter(this);
       c ta = this.a;
       this.a = true;
       if (ta == null) {
          this.notifyAll();
       }
       _monitor_exit(this);
       return;
    }
}
