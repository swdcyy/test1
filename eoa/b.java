package eoa.b;
import tx4.o;
import com.yxcorp.gifshow.growth.invite.slidepage.GrowthInvitePageFragment;
import java.lang.Object;
import sx4.e;
import tx4.w;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.View;
import tx4.h;
import java.lang.Throwable;
import java.lang.Integer;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import rx4.a;

public final class b implements o	// class@002787
{
    public final GrowthInvitePageFragment a;

    public void b(GrowthInvitePageFragment p0){
       this.a = p0;
       super();
    }
    public void a(e p0,w p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       a.p(p0, "tkView");
       b ta = this.a;
       ta.I = p0;
       GrootBaseFragment j = ta.j;
       if (!j instanceof ViewGroup) {
          j = null;
       }
       if (j != null) {
          j.addView(p0.getView());
       }
       if (this.a.m != null) {
          b.a(p0, "onShow", null, null, 6, null);
       }
       return;
    }
    public void b(int p0,Throwable p1,w p2){
       a uoa;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, b.class, "2")) {
          return;
       }
       w ow = w.C();
       StringBuilder str = "";
       p2 = (p2 != null)? p2.b: null;
       ow.e("GrowthInvitePage", str+p2+' '+p0, p1);
       GrowthInvitePageFragment h = this.a.H;
       if (h != null) {
          h.onDestroy();
       }
       b ta = this.a;
       ta.H = null;
       ta.Ah();
       return;
    }
}
