package com.kuaishou.live.common.core.component.comments.mock.b;
import ds5.c;
import n81.e;
import xq5.c;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.protobuf.livestream.nano.LiveRichTextUserState;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveDisplayUserStateConfig;
import java.lang.reflect.Type;
import wg3.a;
import lf1.g;
import java.lang.Runnable;
import ekd.k1;
import ds5.a;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import crd.b;
import lnc.b9;
import ds5.b;
import z1.a;
import com.kuaishou.android.live.log.b;
import h91.d;
import h91.c;
import brd.t;
import lf1.c;
import erd.g;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import lf1.d;
import lf1.f;
import java.util.concurrent.TimeUnit;
import lf1.a;
import brd.w;
import lf1.b;
import erd.a;
import lf1.e;
import com.kuaishou.live.common.core.component.comments.mock.a;
import xq5.b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.robust.PatchProxyResult;
import lf1.j;
import java.util.Map;
import java.util.HashMap;
import p91.m;
import ds5.e;
import java.lang.Boolean;
import android.os.SystemClock;
import java.lang.Throwable;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class b extends PresenterV2 implements c, e, c, g	// class@0010b2
{
    public LiveRichTextUserState p;
    public long q;
    public long r;
    public b s;
    public m t;
    public e u;
    public LiveSlidePlayService v;
    public e w;
    public static String sLivePresenterClassName = "LiveDisplayUserStatePresenter";
    public static final List x;

    static {
       b.x = LiveLogTag.COMMENT.appendTag("DisplayUserState");
    }
    public void b(){
       super();
       this.p = new LiveRichTextUserState();
       this.q = 2000;
       this.w = this;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       LiveConfigStartupResponse$LiveDisplayUserStateConfig liveDisplayU = a.k(LiveConfigStartupResponse$LiveDisplayUserStateConfig.class);
       g og = new g(this);
       long l = (liveDisplayU == null)? 3000: liveDisplayU.mDisplayUserStateApiDelayMs;
       k1.s(og, this, l);
       b tu = this.u;
       if (tu != null) {
          tu.gd(this);
       }
       tu = this.v;
       if (tu != null) {
          tu.P4(this);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b9.a(this.s);
       k1.n(this);
       b tu = this.u;
       if (tu != null) {
          tu.fo(this);
       }
       tu = this.v;
       if (tu != null) {
          tu.d5(this);
       }
       return;
    }
    public String N5(){
       return b.a(this);
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       b9.a(this.s);
       k1.n(this);
       return;
    }
    public final void P8(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "8")) {
          return;
       }
       b9.a(this.s);
       b.S(b.x, "start request", "liveStreamId", p0);
       this.s = c.b().a(p0).doOnSubscribe(new c(this)).observeOn(d.b).map(new e()).doOnNext(new d(this)).map(new f(this)).timeout(500, TimeUnit.MILLISECONDS, new a(this)).observeOn(d.a).doFinally(new b(this, p1)).subscribe(new e(this), a.b);
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void e2(QLivePlayConfig p0,QLivePlayConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "4")) {
          return;
       }
       if (!TextUtils.equals(p0.mLiveStreamId, p1.mLiveStreamId)) {
          this.P8(p0.mLiveStreamId, null);
       }
       return;
    }
    public void ff(QLivePlayConfig p0){
       b.b(this, p0);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new j());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.t = this.r8("LIVE_BASIC_CONTEXT");
       this.u = this.t8("LIVE_PLAY_CONFIG_SERVICE");
       this.v = this.t8("LIVE_SLIDE_PLAY_SERVICE");
       return;
    }
    public void m7(a p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "7")) {
          return;
       }
       Object obj = PatchProxy.apply(null, this, uob, "10");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if((SystemClock.elapsedRealtime() - this.r) - this.q > 0){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          b.P(b.x, "request update");
          this.P8(this.t.getLiveStreamId(), p0);
       }else {
          b.P(b.x, "use cache");
          p0.accept(this.p);
       }
       return;
    }
    public LiveRichTextUserState o5(){
       return this.p;
    }
    public void onError(Throwable p0){
       b.d(this, p0);
    }
    public void r(){
       b.b(this);
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public boolean xi(){
       return b.e(this);
    }
    public void y1(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       b9.a(this.s);
       k1.n(this);
       return;
    }
}
