package com.kuaishou.live.core.voiceparty.p;
import im8.g;
import k51.c;
import com.kuaishou.live.core.voiceparty.p$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fu2.g;
import kotlin.jvm.internal.a;
import fu2.h;
import android.widget.FrameLayout;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import at5.a;
import fu2.g$a;
import mw1.c;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import com.kwai.robust.PatchProxyResult;
import co2.k0;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class p extends c implements g	// class@00180c
{
    public LivePlayTextureView p;
    public LiveStreamFeedWrapper q;
    public c r;
    public a s;
    public final p$a t;
    public static String sLivePresenterClassName = "LiveAudienceVoicePartyPlayViewPresenter";

    public void p(){
       super();
       this.t = new p$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p.class, "3")) {
          return;
       }
       g$a i = g.i;
       p tp = this.p;
       if (tp == null) {
          a.S("playView");
       }
       Object tag = tp.getTag(h.e.a());
       p tq = this.q;
       if (tq == null) {
          a.S("photo");
       }
       LiveStreamFeedWrapper mEntity = tq.mEntity;
       a.o(mEntity, "photo.mEntity");
       a uoa = i.a(tag, mEntity);
       if (uoa != null) {
          tp = this.r;
          if (tp == null) {
             a.S("liveAudiencePlayViewService");
          }
          tp.e(uoa);
          this.s = uoa;
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, p.class, "4")) {
          return;
       }
       this.P8();
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, p.class, "5")) {
          return;
       }
       p ts = this.s;
       if (ts != null) {
          p tr = this.r;
          if (tr == null) {
             a.S("liveAudiencePlayViewService");
          }
          tr.d(ts);
          this.s = null;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       p0 = m1.f(p0, R.id.play_view);
       a.o(p0, "ViewBindUtils.bindWidget\(rootView, R.id.play_view\)");
       this.p = p0;
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, p.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(p.class, new k0());
       }else {
          obj.put(p.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       Object obj = this.r8("LIVE_PHOTO");
       a.o(obj, "inject\(LiveAccessIds.LIVE_PHOTO\)");
       this.q = obj;
       obj = this.q8(c.class);
       a.o(obj, "inject\(LiveAudiencePlayViewService::class.java\)");
       this.r = obj;
       return;
    }
}
