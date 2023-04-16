package b77.n;
import com.kwai.live.gzone.widget.e;
import com.kwai.live.gzone.widget.e$a;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import o07.n;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import android.view.View;
import android.os.Bundle;
import b77.e;
import im8.c;
import f37.o0;

public class n extends e	// class@0003e5
{
    public e x;
    public b y;

    public void n(e$a p0){
       super(p0);
    }
    public void b(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
          return;
       }
       n.a(this, p0);
       this.x.destroy();
       return;
    }
    public int d0(){
       return 0x7f0d059e;
    }
    public int e0(){
       Object obj = PatchProxy.apply(null, this, n.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e(395.00f);
    }
    public void f0(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n.class, "1")) {
          return;
       }
       e uoe = new e();
       this.x = uoe;
       uoe.f(p0);
       Object[] objArray = new Object[]{new c("LIVE_BASIC_CONTEXT", this.y),this};
       this.x.i(objArray);
       o0.p(this.q, this.r);
       return;
    }
    public boolean j0(){
       return true;
    }
}
