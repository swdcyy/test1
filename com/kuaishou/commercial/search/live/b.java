package com.kuaishou.commercial.search.live.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import mxb.h;
import com.kuaishou.commercial.search.live.b$a;
import com.kuaishou.commercial.search.live.b$b;
import mxb.j0;
import mxb.i0;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.j;
import com.kuaishou.commercial.search.live.a;
import erd.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import wkd.b;
import mxb.f0;
import s99.i;
import com.yxcorp.gifshow.autoplay.widget.ConstraintAutoPlayCard;
import java.lang.Boolean;
import t99.y;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import vy.a;
import java.lang.Integer;
import ekd.y0;
import android.view.View;
import ekd.m1;

public class b extends PresenterV2	// class@001565
{
    public QPhoto p;
    public boolean q;
    public final h r;
    public int s;
    public int t;
    public y0 u;
    public LiveAutoPlayModule v;
    public ConstraintAutoPlayCard w;
    public i x;
    public final y y;

    public void b(){
       super();
       this.r = new h();
       this.t = 0;
       this.x = new b$a(this);
       this.y = new b$b(this);
    }
    public static void P8(b p0){
       p0.S8();
    }
    private void S8(){
       b tt = this.t;
       int[] a = j0.a;
       if (tt >= a.length) {
          this.X8();
          return;
       }else if(this.q == null){
          return;
       }else if(this.s >= a[tt]){
          i0.a().u(i0.a().g(this.p.mEntity).a(a.b), a[this.t]);
          this.t = this.t + 1;
       }
       this.s = this.s + 500;
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       if (!this.p.isLiveStream()) {
          return;
       }
       this.r.c();
       if (k.B(this.p) == null) {
          return;
       }
       this.W8();
       b.a(-762347696).r1(this.p.mEntity, "key_ad_live_watching_monitor", this.r);
       this.w.y(this.x);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       this.w.A(this.x);
       return;
    }
    public void R8(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "4")) {
          return;
       }
       if (this.p.isLiveStream() && this.p.isAd()) {
          uob = this.v;
          if (uob != null) {
             if (p0) {
                this.W8();
                this.v.O(this.y);
             }else {
                uob.e0(this.y);
                this.V8();
             }
          }
       }
       return;
    }
    public final void V8(){
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, uob, "5")) {
          return;
       }
       i0.a().e(67, this.p.mEntity).d(new a(this)).a();
       if (!PatchProxy.applyVoid(null, this, uob, "11")) {
          this.s = 0;
          this.t = 0;
          this.r.c();
       }
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b tp = this.p;
       if (tp != null && tp.mEntity != null) {
          b.a(-762347696).r1(this.p.mEntity, "key_enteraction", Integer.valueOf(1));
       }
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       b tu = this.u;
       if (tu != null) {
          tu.e();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.w = m1.f(p0, 0x7f0a30e1);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.v = this.t8("SEARCH_PLAY_LIVE_PLAY_MODULE");
       return;
    }
}
