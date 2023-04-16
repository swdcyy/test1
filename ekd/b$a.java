package ekd.b$a;
import java.lang.Runnable;
import ekd.b;
import java.lang.Object;
import ekd.b$a$a;
import android.os.Handler;
import java.lang.Exception;

public class b$a implements Runnable	// class@000d27
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void run(){
       try{
          b$a tb = this.b;
          this.b.mHandler.postAtFrontOfQueue(new b$a$a(this, tb.prepareData(tb.getElapse())));
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
}
