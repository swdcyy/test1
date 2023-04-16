package b34.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import b34.e;
import java.lang.Runnable;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import b34.a;
import lnc.c3$b;
import lnc.c3;
import com.kuaishou.merchant.live.cart.salemanager.model.LiveAnchorToolsInfo$LiveAnchorTool;
import java.lang.Integer;
import java.util.HashMap;
import b34.f$a;
import com.kwai.library.widget.button.SlipSwitchButton$a;
import b34.b;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;

public class f extends PresenterV2	// class@000310
{
    public LiveMerchantBaseContext p;
    public LiveAnchorToolsInfo$LiveAnchorTool q;
    public HashMap r;
    public b s;

    public void f(){
       super();
    }
    public final void P8(SlipSwitchButton p0,boolean p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uof, "4")) {
          return;
       }
       p0.post(new e(this, p0, p1));
       return;
    }
    public String R8(){
       Object obj = PatchProxy.apply(null, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c3.a(this.p, a.a);
    }
    public void S8(SlipSwitchButton p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       f tr = this.r;
       if (tr == null) {
          return;
       }
       f tq = this.q;
       LiveAnchorToolsInfo$LiveAnchorTool mSwitchOpen = tq.mSwitchOpen;
       LiveAnchorToolsInfo$LiveAnchorTool liveAnchorTo = tr.get(Integer.valueOf(tq.mType));
       if (liveAnchorTo != null) {
          mSwitchOpen = (this.q.mSwitchOpen != null || liveAnchorTo.mSwitchOpen != null)? true: false;
       }
    label_0032 :
       p0.setSwitch(mSwitchOpen);
       p0.setOnSwitchChangeListener2(new f$a(this, p0));
       return;
    }
    public String getLiveStreamId(){
       Object obj = PatchProxy.apply(null, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c3.a(this.p, b.a);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.t8("LIVE_BASE_CONTEXT");
       this.r = this.t8("LIVE_ANCHOR_TOOLS_NEED_CALL_BACKEND");
       this.q = this.q8(LiveAnchorToolsInfo$LiveAnchorTool.class);
       return;
    }
}
