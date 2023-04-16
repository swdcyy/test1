package com.yxcorp.gifshow.follow.init.plugin.live.d;
import android.view.ViewStub;
import com.kwai.component.feedstaggercard.model.CardStyle;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.kwai.component.feedstaggercard.widget.SimpleDanmakuView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.gifshow.follow.init.plugin.live.d$b;
import com.kwai.component.feedstaggercard.widget.SimpleDanmakuView$c;
import com.yxcorp.gifshow.follow.init.plugin.live.b;
import com.kwai.component.feedstaggercard.widget.SimpleDanmakuView$d;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.follow.init.plugin.live.d$a;
import java.util.Collection;
import brd.t;
import nga.l;
import nga.k;
import oha.u;
import java.lang.Long;
import java.lang.NumberFormatException;
import oha.o;
import erd.g;
import cjd.e;
import erd.o;
import oha.p;
import oha.m;
import oha.s;
import com.yxcorp.gifshow.follow.init.plugin.live.c;
import erd.r;
import java.lang.Float;
import crd.b;
import lnc.b9;
import t45.d;
import brd.z;
import oha.l;
import com.gifshow.tuna.player.poi.e;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import oha.r;
import oha.n;

public class d	// class@0010e8
{
    public ViewStub a;
    public SimpleDanmakuView b;
    public d$b c;
    public QPhoto d;
    public boolean e;
    public boolean f;
    public int g;
    public b h;
    public float i;
    public long j;
    public int k;
    public String l;
    public long m;
    public boolean n;
    public int o;
    public boolean p;
    public d$a q;
    public CardStyle r;
    public boolean s;

    public void d(ViewStub p0,CardStyle p1){
       super();
       this.a = p0;
       this.r = p1;
    }
    public static void a(d p0,List p1){
       d$b obj;
       int i;
       Objects.requireNonNull(p0);
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p1, p0, uod, "3")) {
       }else {
          boolean b = false;
          if (p0.b == null) {
             SimpleDanmakuView simpleDanmak = p0.a.inflate();
             p0.b = simpleDanmak;
             obj = PatchProxy.apply(null, p0, uod, "11");
             i = (obj != PatchProxyResult.class)? obj.intValue(): a1.e(12.00f);
             simpleDanmak.setSpan(i);
             p0.b.setAnimationDuration(2800);
             p0.b.setLoopPlay(b);
          }
          if (CardStyle.isV4Bottom(p0.r.mBottomType)) {
             i = a1.d(R.dimen.arg_RES_7f07061e);
             if (p0.g == 5 && p0.s != null) {
                i = a1.d(R.dimen.arg_RES_7f070865);
             }
             p0.b.getLayoutParams().bottomMargin = i;
          }
          if (CardStyle.isV5Bottom(p0.r.mBottomType)) {
             p0.b.getLayoutParams().bottomMargin = a1.d(0x7f07105e);
          }
          if (p0.e != null) {
             p0.e = b;
             p0.p = true;
             obj = new d$b(p0, p1);
             p0.c = obj;
             p0.b.setAdapter(obj);
             p0.b.setAutoStop(b);
             p0.b.setOnItemShowListener(new b(p0));
             uod = p0.q;
             if (uod != null) {
                uod.a(p0.d, p1.size());
             }
          }else {
             uod = p0.c;
             Objects.requireNonNull(uod);
             if (!PatchProxy.applyVoidOneRefs(p1, uod, d$b.class, "1")) {
                uod.b.addAll(p1);
             }
             if (!p0.b.getChildCount() && p0.p != null) {
                p0.b.e();
             }
          }
       }
    label_00e3 :
       return;
    }
    public final t b(){
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, d.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       this.n = true;
       l ol = k.b();
       String liveStreamId = this.d.getLiveStreamId();
       obj = this.d.getUserId();
       u ou = u.class;
       Object obj1 = PatchProxy.applyOneRefs(obj, objArray, ou, "3");
       if (obj1 != patchProxyRe) {
          l = obj1.longValue();
       }else {
          long l1 = 0;
          if (PatchProxy.isSupport(ou)) {
             Object obj2 = PatchProxy.applyTwoRefs(obj, Long.valueOf(l1), objArray, ou, "2");
             if (obj2 != patchProxyRe) {
                l1 = obj2.longValue();
             }else {
                try{
                label_0050 :
                   l1 = Long.parseLong(obj);
                }catch(java.lang.NumberFormatException e0){
                   e0.printStackTrace();
                }
             }
          }else {
             goto label_0050 ;
          }
       }
       return ol.a(liveStreamId, l, 200, this.l, this.g).doOnSubscribe(new o(this)).map(new e()).doOnNext(new p(this)).doOnError(new m(this)).map(new s(this)).filter(c.b);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, d.class, "8")) {
          return;
       }
       d tb = this.b;
       if (tb != null) {
          tb.d();
          this.p = false;
       }
       return;
    }
    public final void d(){
       this.e = true;
       this.p = false;
       this.o = 0;
       this.l = null;
    }
    public void e(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "9")) {
          return;
       }
       if (this.f != null && Float.compare(this.i, 0x3fe38e39) <= 0) {
          if (this.e != null) {
             if (!PatchProxy.applyVoid(objArray, this, uod, "2")) {
                b9.a(this.h);
                this.h = this.b().observeOn(d.a).subscribe(new l(this), e.b);
             }
             return;
          }else {
             uod = this.b;
             if (uod != null) {
                this.p = true;
                uod.e();
             }
          }
       }
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       d to = this.o;
       int i = 1;
       if (to >= (this.k - i)) {
          to = this.b;
          if (to != null) {
             to.setAutoStop(i);
          }
          return;
       }else {
          this.o = to + i;
          b9.a(this.h);
          this.n = i;
          this.h = t.timer(((this.m + this.j) - SystemClock.elapsedRealtime()), TimeUnit.MILLISECONDS).flatMap(new r(this)).observeOn(d.a).subscribe(new l(this), new n(this));
          return;
       }
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, d.class, "10")) {
          return;
       }
       b9.a(this.h);
       d tb = this.b;
       if (tb != null) {
          tb.g();
       }
       this.d();
       return;
    }
}
