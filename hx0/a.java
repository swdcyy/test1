package hx0.a;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$b;
import a51.c;
import hx0.a$a;
import ix0.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import jx0.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService;
import lp3.c;
import lp3.i;
import sj3.b;
import sj3.l;
import java.lang.Throwable;
import sd1.f;
import com.yxcorp.retrofit.model.KwaiException;
import p91.m;
import o63.d;
import vb1.c;
import com.kwai.robust.PatchProxyResult;
import p63.a;
import p63.a$a;
import p63.a$b;
import oa1.a;
import nsd.u;
import lnc.a1;
import oa1.b;
import o63.a;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import msd.l;
import com.kuaishou.live.common.core.component.chat.apply.LiveAudienceApplyChatService$State;

public final class a extends c implements LiveAudienceApplyChatService$b	// class@002799
{
    public m v;
    public i w;
    public l x;
    public d y;
    public final b z;
    public static String sLivePresenterClassName = "LiveAudienceBlindDatePresenter";

    public void a(){
       super();
       this.z = new a$a(this);
       this.U7(new b());
       this.U7(new i());
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       super.E8();
       a tw = this.w;
       if (tw == null) {
          a.S("liveServiceManager");
       }
       tw.a(LiveAudienceApplyChatService.class).Od(this);
       tw = this.x;
       if (tw == null) {
          a.S("livePlayerReconnectService");
       }
       tw.b(this.z);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       super.J8();
       a tw = this.w;
       if (tw == null) {
          a.S("liveServiceManager");
       }
       tw.a(LiveAudienceApplyChatService.class).eb(this);
       tw = this.x;
       if (tw == null) {
          a.S("livePlayerReconnectService");
       }
       tw.c(this.z);
       this.S8();
       return;
    }
    public void M4(Throwable p0){
       d uod;
       b a;
       Object obj = this;
       a obj1 = p0;
       a uoa = a.class;
       String str = "4";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, uoa, str)) {
          return;
       }
       f.a(this, p0);
       if (obj1 instanceof KwaiException) {
          int errorCode = obj1.getErrorCode();
          String str1 = "liveBasicContext";
          if (errorCode == 0x15cde) {
             this.S8();
             obj1 = obj.v;
             if (obj1 == null) {
                a.S(str1);
             }
             uod = c.g(obj1, str);
             a.m(uod);
             obj.y = uod;
          }else if(errorCode == 622){
             this.S8();
             uod = PatchProxy.apply(null, obj, uoa, "5");
             if (uod != PatchProxyResult.class) {
             }else {
                a$a uoa1 = a.b.a();
                uoa = obj.v;
                if (uoa == null) {
                   a.S(str1);
                }
                a uoa2 = uoa1.a("liveStreamId", uoa.getLiveStreamId()).a("source", "1").b();
                a uoa3 = new a(0, 0, 0, 0, 0, 0, null, false, 0, 511, null);
                uoa1.e(String.valueOf(a1.a(R.color.arg_RES_7f06060a)));
                uoa1.b(0x3f000000);
                uoa1.d(16);
                uoa1.c(1);
                a = b.a;
                a w = obj.w;
                if (w == null) {
                   a.S("liveServiceManager");
                }
                c uoc = w.a(a.class);
                a.o(uoc, "liveServiceManager.getSe¡­ridgeService::class.java\)");
                uod = b.d(a, uoc, LiveKrnPageKey.LiveBlindDateChatLiveVertify, uoa2, uoa1, null, 16, null);
             }
             obj.y = uod;
          }
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       a ty = this.y;
       if (ty != null) {
          ty.L();
       }
       return;
    }
    public void b6(boolean p0){
       f.b(this, p0);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       Object obj = this.r8("LIVE_BASIC_CONTEXT");
       a.o(obj, "inject\(LiveAccessIds.LIVE_BASIC_CONTEXT\)");
       this.v = obj;
       obj = this.r8("LIVE_SERVICE_MANAGER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_SERVICE_MANAGER\)");
       this.w = obj;
       obj = this.r8("LIVE_PLAYER_RECONNECT");
       a.o(obj, "inject\(LiveAccessIds.LIVE_PLAYER_RECONNECT\)");
       this.x = obj;
       return;
    }
    public void v7(LiveAudienceApplyChatService$State p0,int p1){
    }
}
