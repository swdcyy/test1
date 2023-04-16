package ak0.e;
import java.lang.Runnable;
import com.facebook.react.a;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import ek0.d;
import com.kuaishou.krn.load.a;

public final class e implements Runnable	// class@0000bb
{
    public final boolean b;
    public final a c;

    public void e(boolean p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       e tb = this.b;
       d.e("[perfOpt]createReactContextInBackground start runOnUiThread,isRecreate="+tb);
       a.c(this.c, tb);
    }
}
