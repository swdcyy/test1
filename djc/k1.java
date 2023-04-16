package djc.k1;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import android.content.Context;
import f17.c;
import e17.s;

public final class k1 implements Runnable	// class@002202
{
    public static final k1 b;

    static {
       k1.b = new k1();
    }
    public void k1(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, k1.class, "1")) {
          return;
       }
       s.r(a.b(), R.string.arg_RES_7f10326c, 1);
       return;
    }
}
