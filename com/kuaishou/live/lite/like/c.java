package com.kuaishou.live.lite.like.c;
import or5.d;
import v51.a;
import ds5.a;
import xp5.i;
import ga1.d;
import la3.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import com.kuaishou.live.lite.like.c$a;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import or5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.like.count.b;
import ne2.e;
import ok.x;
import com.kuaishou.live.common.core.component.like.count.b$b;
import com.kuaishou.live.common.core.component.like.count.i;
import hf3.a;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import d61.l0;
import java.lang.Long;
import x51.b;
import java.lang.Integer;
import tj3.e;
import tj3.i;
import tj3.k;
import tj3.r;
import android.app.Application;
import o56.a;
import android.os.Vibrator;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public class c	// class@0009ef
{
    public final e0 a;
    public final ClientContent$LiveStreamPackage b;
    public final b c;
    public final i d;
    public final d e;
    public final a f;
    public final long g;
    public long h;
    public final MutableLiveData i;
    public final b$b j;
    public final FeedLogCtx k;

    public void c(d p0,a p1,a p2,i p3,d p4,a p5){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       super();
       MutableLiveData mutableLiveD = new MutableLiveData(Boolean.FALSE);
       this.i = mutableLiveD;
       c$a uoa = new c$a(this);
       this.j = uoa;
       this.a = p3.getPage();
       ClientContent$LiveStreamPackage liveStreamPa = p3.a();
       this.b = liveStreamPa;
       this.e = p4;
       this.f = p5;
       this.k = p3.c0();
       LiveStreamFeedWrapper liveStreamFe = p0.r5();
       b uob = PatchProxy.applyTwoRefs(p0, liveStreamFe, this, c.class, "1");
       if (uob != patchProxyRe) {
       }else {
          uob = new b(2, new e(p0), uoa);
          uob.d(liveStreamFe);
       }
       this.c = uob;
       boolean b = false;
       i oi = new i(liveStreamFe, p1.u(), p2, b);
       this.d = oi;
       oi.f();
       long l = a.t().u("SOURCE_LIVE").b("liteLikeExpiredTime", 0x5265c00);
       this.g = l;
       p2 = PatchProxy.apply(null, this, c.class, "7");
       if (p2 != patchProxyRe) {
          b1 = p2.booleanValue();
       }else if((b.b().a() - l0.f(liveStreamPa.liveStreamId).b(Long.valueOf(0)).longValue()) - l < 0){
          b = 1;
       }
       b1 = b;
       mutableLiveD.setValue(Boolean.valueOf(b1));
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       this.i.setValue(Boolean.TRUE);
       this.h = b.b().a();
       return;
    }
    public void b(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "2")) {
          return;
       }
       for (int i = 0; i < p0; i = i + 1) {
          this.c.b();
          this.e.a().h().b();
          this.e.a().x().b();
       }
       this.f.c(p0);
       this.d.d(p0);
       return;
    }
    public void c(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "5")) {
          return;
       }
       this.c.c();
       this.d.g();
       if (!PatchProxy.applyVoid(objArray, this, uoc, "9") && this.h > 0) {
          l0.f(this.b.liveStreamId).i(Long.valueOf(this.h));
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, c.class, "6")) {
          return;
       }
       if (!a.t().u("SOURCE_LIVE").d("enableLiteLikeVibrate", false)) {
          return;
       }
       Vibrator systemServic = a.b().getSystemService("vibrator");
       if (systemServic != null && systemServic.hasVibrator()) {
          long l = 50;
          try{
             systemServic.vibrate(l);
          }catch(java.lang.Exception e0){
             b.g0(LiveLiteLogTag.LITE_LIKE, "Exception info£º", e0);
          }
       }
    }
}
