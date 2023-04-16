package c.t.m.g.cr$b;
import java.lang.Runnable;
import c.t.m.g.ce;
import java.lang.Object;
import c.t.m.g.df;

public class cr$b implements Runnable	// class@000c1f
{
    public ce a;
    public df b;

    public void cr$b(ce p0){
       super();
       this.a = p0;
    }
    public void a(df p0){
       this.b = p0;
    }
    public void run(){
       cr$b ta = this.a;
       cr$b tb = this.b;
       if (tb != null) {
          ta.b(tb);
       }
       return;
    }
}
