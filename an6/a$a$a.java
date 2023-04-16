package an6.a$a$a;
import com.kuaishou.ax2c.PreLoader$InflateListener;
import brd.v;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Boolean;
import brd.g;
import android.view.View;
import java.lang.Integer;

public final class a$a$a implements PreLoader$InflateListener	// class@0000e0
{
    public final v a;

    public void a$a$a(v p0){
       this.a = p0;
       super();
    }
    public void onFallback(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("home_entrance_bubble", "asyncInflateBubbleView failed "+p0, objArray);
       this.a.onNext(Boolean.FALSE);
       this.a.onComplete();
       return;
    }
    public void onFinish(int p0,View p1){
       a$a$a uoa$a = a$a$a.class;
       if (PatchProxy.isSupport(uoa$a) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa$a, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("home_entrance_bubble", "asyncInflateBubbleView done", objArray);
       this.a.onNext(Boolean.TRUE);
       this.a.onComplete();
       return;
    }
    public void onStart(int p0){
    }
}
