package bbc.n;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import bbc.y;
import com.yxcorp.gifshow.widget.h$a;
import e17.i$b;
import com.yxcorp.gifshow.widget.h;
import e17.i;

public final class n implements Runnable	// class@000434
{
    public final String b;

    public void n(String p0){
       this.b = p0;
    }
    public final void run(){
       i$b uob = h.b(R.string.arg_RES_7f1017b2, new y(this.b), 3000, 0);
       uob.v(0);
       i.z(uob);
    }
}
