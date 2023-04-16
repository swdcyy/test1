package cx0.g;
import im8.g;
import c12.f;
import cx0.g$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import xp5.i;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import lp3.c;
import lp3.e;
import com.kuaishou.live.authentication.LiveAudienceAuthorAuthenticationTopPendantInfo;
import java.lang.Integer;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.j;
import cx0.i;
import ks5.b;
import ks5.c;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import cx0.b;
import cx0.l;
import java.util.Map;
import java.util.HashMap;
import vq5.d;

public final class g extends f implements g	// class@001e95
{
    public d K;
    public c L;
    public e M;
    public b N;
    public final a O;
    public static String sLivePresenterClassName = "LiveAudienceAuthorAuthenticationPresenter";

    public void g(){
       super();
       this.O = new g$a(this);
    }
    public void Q(boolean p0){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, g.class, "2")) {
          return;
       }
       this.c9();
       return;
    }
    public final i a9(){
       g obj = PatchProxy.apply(null, this, g.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.M;
       if (obj == null) {
          a.S("liveServiceManager");
       }
       c uoc = obj.a(i.class);
       a.o(uoc, "liveServiceManager.getSe¡­kageProvider::class.java\)");
       return uoc;
    }
    public final void b9(LiveAudienceAuthorAuthenticationTopPendantInfo p0,int p1){
       boolean b;
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, og, "5")) {
          return;
       }
       this.c9();
       Context context = this.getContext();
       i obj = PatchProxy.applyOneRefs(p0, this, og, "8");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 != null && (!j.h(p0.mAfterLinkageImgUrl) && !j.h(p0.mBeforeLinkageImgUrl))){
          b = true;
       }else {
          b = false;
       }
       if (context != null && (p0 == null || !b)) {
          b.S(LiveLogTag.LIVE_AUTHOR_AUTHENTICATION.appendTag("AudienceAuthorAuthenticationPresenter"), " show authentication pendant info  is not Valid or context is null ", "isPendantInfoValid ", Boolean.valueOf(b));
          return;
       }else if(PatchProxy.isSupport(og) && PatchProxy.applyVoidThreeRefs(context, p0, Integer.valueOf(p1), this, g.class, "6")){
          obj = new i(this, p0, p1, context, context, p0);
          this.N = og;
          g tL = this.L;
          if (tL == null) {
             a.S("mLiveTopPendantAssociateService");
          }
          g tN = this.N;
          a.m(tN);
          tL.b(tN);
       }
       return;
    }
    public final void c9(){
       if (PatchProxy.applyVoid(null, this, g.class, "7")) {
          return;
       }
       g tN = this.N;
       if (tN != null) {
          tN.w();
          g tL = this.L;
          if (tL == null) {
             a.S("mLiveTopPendantAssociateService");
          }
          tL.c(tN);
          this.N = null;
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new l();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, g.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(g.class, new l());
       }else {
          obj.put(g.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       super.j8();
       Object obj = this.r8("LIVE_ROUTER_SERVICE");
       a.o(obj, "inject\(LiveAccessIds.LIVE_ROUTER_SERVICE\)");
       this.K = obj;
       obj = this.q8(c.class);
       a.o(obj, "inject\(LiveTopPendantAssociateService::class.java\)");
       this.L = obj;
       obj = this.r8("LIVE_SERVICE_MANAGER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_SERVICE_MANAGER\)");
       this.M = obj;
       return;
    }
}
