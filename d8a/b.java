package d8a.b;
import qvb.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import az6.a;
import com.yxcorp.gifshow.detail.slideplay.b;
import qvb.i;
import qvb.j;
import android.view.View;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import ge5.d;
import g9a.b;
import d8a.a;
import g9a.b$a;
import joc.q;
import joc.c;
import java.lang.Throwable;
import java.lang.Boolean;
import qvb.p;
import ekd.m1;
import java.lang.Runnable;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import p5a.c;
import com.yxcorp.gifshow.detail.playmodule.QPhotoMediaPlayerCacheManager;
import com.kwai.framework.player.core.b;

public class b extends PresenterV2 implements q	// class@001eb8
{
    public d p;
    public NasaBizParam q;
    public Runnable r;
    public PhotoDetailParam s;
    public View t;
    public View u;
    public View v;
    public View w;
    public i x;

    public void b(){
       super();
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "4")) {
          uob = b.e(this.s.mSlidePlayId);
          if (uob != null) {
             i oi = uob.M7();
             this.x = oi;
             oi.h(this);
             this.t.setVisibility(0);
             this.u.setVisibility(0);
             int i = 8;
             this.w.setVisibility(i);
             this.v.setVisibility(i);
             this.x.a();
          }
       }
       if (this.q.getNasaSlideParam().isFromLink()) {
          this.p.b.C(new b(new a(this)));
          this.p.c.f(true);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       b tx = this.x;
       if (tx != null) {
          tx.f(this);
       }
       return;
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, b.class, "7")) {
          return;
       }
       if (p0) {
          this.t.setVisibility(8);
          this.u.setVisibility(8);
          this.w.setVisibility(0);
          this.v.setVisibility(0);
       }
       return;
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a3a1a);
       this.u = m1.f(p0, 0x7f0a39ec);
       this.v = m1.f(p0, 0x7f0a35e1);
       this.w = m1.f(p0, 0x7f0a35e2);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.q = this.q8(NasaBizParam.class);
       this.r = this.r8("DETAIL_FLOW_END_LISTENER");
       this.s = this.q8(PhotoDetailParam.class);
       this.p = this.r8("PHOTO_ROOTVIEW_TOUCH_MANAGER");
       return;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, b.class, "6")) {
          return;
       }
       int i = 0;
       if (p0) {
          int i1 = 8;
          this.t.setVisibility(i1);
          this.u.setVisibility(i1);
          this.w.setVisibility(i);
          this.v.setVisibility(i);
       }
       if (p0 && this.q.getNasaSlideParam().isFromLink()) {
          Object[] objArray = null;
          b obj = PatchProxy.apply(objArray, this, b.class, "9");
          if (obj != PatchProxyResult.class) {
          }else {
             obj = this.x;
             obj = (obj == null || obj.isEmpty())? objArray: this.x.getItem(i);
          }
          if (obj != null) {
             b ts = this.s;
             if (ts.mPhoto == null) {
                ts.mPhoto = obj;
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, b.class, "8")) {
             c uoc = QPhotoMediaPlayerCacheManager.d(this.s.mPhoto);
             if (uoc != null) {
                uoc.release();
             }
          }
          this.r.run();
       }
       return;
    }
}
