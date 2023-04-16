package com.kuaishou.live.audience.component.gift.customgift.LiveAudienceCustomGiftPresenter;
import im8.g;
import c12.f;
import com.kuaishou.live.audience.component.gift.customgift.LiveAudienceCustomGiftPresenter$infoManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.audience.component.gift.customgift.LiveAudienceCustomGiftPresenter$b;
import com.kuaishou.live.audience.component.gift.customgift.LiveAudienceCustomGiftPresenter$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ug1.a1;
import ik1.i0;
import yy0.b;
import java.util.Objects;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.List;
import com.kuaishou.live.core.show.customgift.LiveCustomGiftKrnPagePrefCtrlManager;
import com.kwai.robust.PatchProxyResult;
import yy0.e;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import jk1.f;

public final class LiveAudienceCustomGiftPresenter extends f implements g	// class@000adf
{
    public final String K;
    public final p L;
    public i0 M;
    public final LiveAudienceCustomGiftPresenter$b N;
    public f O;
    public final f P;
    public static String sLivePresenterClassName = "LiveAudienceCustomGiftPresenter";

    public void LiveAudienceCustomGiftPresenter(){
       super();
       this.K = "LiveAudienceCustomGiftPresenter";
       this.L = s.c(new LiveAudienceCustomGiftPresenter$infoManager$2(this));
       this.N = new LiveAudienceCustomGiftPresenter$b(this);
       this.P = new LiveAudienceCustomGiftPresenter$a(this);
    }
    public void Q(boolean p0){
       LiveAudienceCustomGiftPresenter liveAudience = LiveAudienceCustomGiftPresenter.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "4")) {
          return;
       }
       LiveAudienceCustomGiftPresenter tM = this.M;
       if (tM == null) {
          a.S("sendGiftResultService");
       }
       tM.J8(this.N);
       b uob = this.a9();
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoid(null, uob, b.class, "6")) {
          b.Z(LiveLogTag.CUSTOM_GIFT, uob.a+" destroy");
          uob.a();
          uob.b.clear();
       }
       LiveCustomGiftKrnPagePrefCtrlManager.c.c();
       return;
    }
    public final b a9(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceCustomGiftPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.L.getValue();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceCustomGiftPresenter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceCustomGiftPresenter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveAudienceCustomGiftPresenter.class, new e());
       }else {
          obj.put(LiveAudienceCustomGiftPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceCustomGiftPresenter.class, "2")) {
          return;
       }
       super.j8();
       Object obj = this.q8(i0.class);
       a.o(obj, "inject\(LiveSendGiftResultService::class.java\)");
       this.M = obj;
       obj = this.r8("LIVE_AUDIENCE_GIFT_BOX_SERVICE");
       a.o(obj, "inject\(LiveAccessIds.LIV¡­UDIENCE_GIFT_BOX_SERVICE\)");
       this.O = obj;
       return;
    }
    public void x(boolean p0){
       LiveAudienceCustomGiftPresenter liveAudience = LiveAudienceCustomGiftPresenter.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "3")) {
          return;
       }
       LiveAudienceCustomGiftPresenter tM = this.M;
       if (tM == null) {
          a.S("sendGiftResultService");
       }
       tM.Nk(this.N);
       LiveCustomGiftKrnPagePrefCtrlManager.c.a();
       return;
    }
}
