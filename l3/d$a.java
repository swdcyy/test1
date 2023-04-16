package l3.d$a;
import java.lang.Runnable;
import l3.b;
import java.lang.String;
import xk.d;
import java.lang.Object;
import java.util.concurrent.Future;
import java.lang.Boolean;

public class d$a implements Runnable	// class@002500
{
    public b b;
    public String c;
    public d d;

    public void d$a(b p0,String p1,d p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void run(){
       boolean b;
       try{
          b = this.d.get().booleanValue();
       }catch(java.lang.InterruptedException e0){
          b = true;
       }catch(java.util.concurrent.ExecutionException e0){
       }
       this.b.d(this.c, b);
       return;
    }
}
