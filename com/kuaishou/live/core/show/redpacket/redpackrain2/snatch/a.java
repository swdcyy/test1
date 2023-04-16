package com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.a;
import im8.g;
import k51.c;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import d61.c0;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.a$b;
import com.yxcorp.image.request.a;
import s0d.e;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.request.ImageRequest;
import kb.c;
import com.kwai.robust.PatchProxyResult;
import th2.c;
import java.util.Map;
import java.util.HashMap;
import t02.a0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ih2.x;

public class a extends c implements g	// class@000f1d
{
    public a0 p;
    public x q;
    public a$b r;
    public LiveRedPackRainDialogFragment s;
    public DialogInterface$OnDismissListener t;
    public static String sLivePresenterClassName = "LiveAudienceRedPackRainSnatchDialogPresenter";

    public void a(){
       super();
       this.r = new a$a(this);
    }
    public void E8(){
       c0 a;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          a = c0.a;
          this.P8(a.b("/udata/pkg/kwai-client-image/live_red_packet_rain/red_packet_anim_circle.webp"));
          this.P8(a.b("/udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_snatch_coin.webp"));
          this.P8(a.b("/udata/pkg/kwai-client-image/live_red_packet_rain/live_red_pack_rain2_count_down_bg.webp"));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.r.a();
       this.s = null;
       return;
    }
    public final void P8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       Fresco.getImagePipeline().prefetchToDiskCache(a.u(p0).q(), null);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new c());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.q = this.r8("LIVE_RED_PACK_RAIN_SERVICE");
       return;
    }
}
