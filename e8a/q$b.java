package e8a.q$b;
import foc.m$d;
import e8a.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import org.greenrobot.eventbus.a;
import vs5.g;

public class q$b extends m$d	// class@0020cf
{
    public final q b;

    public void q$b(q p0){
       this.b = p0;
       super();
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, q$b.class, "3")) {
          return;
       }
       q t = this.b.t;
       if (t != null) {
          t.finish();
          this.b.t.overridePendingTransition(R.anim.arg_RES_7f0100e5, 0x7f0100e5);
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, q$b.class, "2")) {
          return;
       }
       a.d().k(new g(1));
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, q$b.class, "1")) {
          return;
       }
       a.d().k(new g(0));
       return;
    }
}
