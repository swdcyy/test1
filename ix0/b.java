package ix0.b;
import vb1.b$a;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$b;
import xb1.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vb1.b;
import lp3.c;
import lp3.e;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService;
import ry1.b;
import brd.t;
import ix0.a;
import s91.d;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Throwable;
import sd1.f;
import java.lang.Boolean;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import o63.d;
import com.kwai.robust.PatchProxyResult;
import p63.a;
import p63.a$a;
import p63.a$b;
import oa1.a;
import lnc.a1;
import oa1.b;
import o63.a;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$State;
import java.lang.Integer;

public class b extends b implements b$a, LiveAudienceApplyChatService$b	// class@0029ac
{
    public e x;
    public boolean y;
    public static String sLivePresenterClassName = "LiveBlindPendantAudiencePresenter";

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       super.E8();
       this.x.a(b.class).mh(this);
       this.x.a(LiveAudienceApplyChatService.class).Od(this);
       this.X7(this.x.a(b.class).W().subscribe(new a(this), new d()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       super.J8();
       this.x.a(b.class).Eo(this);
       this.x.a(LiveAudienceApplyChatService.class).eb(this);
       return;
    }
    public void M4(Throwable p0){
       f.a(this, p0);
    }
    public int R8(){
       return 0x7f0d0a76;
    }
    public void S2(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "5")) {
          return;
       }
       if (p0) {
          this.X8();
       }else {
          this.P8();
          this.V8();
       }
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.t.n0(R.string.arg_RES_7f1024fe);
       return;
    }
    public d W8(){
       a$a obj = PatchProxy.apply(null, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.W8();
       obj = a.b.a();
       String str = (this.y != null)? "1": "0";
       a uoa = new a();
       uoa.e(String.valueOf(a1.a(R.color.arg_RES_7f06008c)));
       uoa.b(0x3f1e353f);
       uoa.d(16);
       uoa.c(1);
       return b.a.b(this.x.a(a.class), LiveKrnPageKey.LiveBlindSquareInfoPanel, obj.a("isPaidMatchmaker", str).b(), uoa);
    }
    public void b6(boolean p0){
       f.b(this, p0);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       super.j8();
       this.x = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
    public void v7(LiveAudienceApplyChatService$State p0,int p1){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, b.class, "7")) {
          return;
       }
       if (p0 == LiveAudienceApplyChatService$State.CHATTING) {
          this.P8();
       }
       return;
    }
}
