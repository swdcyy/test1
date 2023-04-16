package f83.e;
import com.kuaishou.live.viewcontroller.ViewController;
import lp1.e;
import msd.l;
import lp1.b;
import com.kuaishou.live.lite.gesture.LiveLiteGestureService;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import f83.a;
import android.view.View;
import com.kuaishou.live.common.core.component.multichat.audience.LiveAudienceMultiChatController;
import lp1.d;

public final class e extends ViewController	// class@0028f0
{
    public LiveAudienceMultiChatController j;
    public a k;
    public b l;
    public View m;
    public final e n;
    public final l o;
    public final b p;
    public final LiveLiteGestureService q;

    public void e(e p0,l p1,b p2,LiveLiteGestureService p3){
       a.p(p0, "multiChatDependence");
       a.p(p1, "multiChatDelegate");
       a.p(p2, "multiChatCallback");
       a.p(p3, "gestureService");
       super();
       this.n = p0;
       this.o = p1;
       this.p = p2;
       this.q = p3;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0cac);
       a uoa = new a(this.P2());
       this.k = uoa;
       a.m(uoa);
       LiveAudienceMultiChatController liveAudience = new LiveAudienceMultiChatController(this.n, this.o.invoke(uoa), this.p);
       this.j = liveAudience;
       a.m(liveAudience);
       this.x2(R.id.live_multi_chat_render_ui_layout, liveAudience);
       return;
    }
}
