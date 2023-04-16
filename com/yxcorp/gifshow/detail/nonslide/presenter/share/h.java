package com.yxcorp.gifshow.detail.nonslide.presenter.share.h;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.a;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.h$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Set;
import z2a.o;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.guide.ShareMyFeedGuideConfig;
import java.lang.reflect.Type;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import z2a.q;
import erd.r;
import z2a.p;
import com.kuaishou.android.model.mix.PhotoMeta;
import io.reactivex.subjects.PublishSubject;

public class h extends a	// class@0015e3
{
    public boolean A;
    public final h$a B;
    public PhotoDetailParam s;
    public QPhoto t;
    public PhotoMeta u;
    public PublishSubject v;
    public Set w;
    public boolean x;
    public ShareMyFeedGuideConfig y;
    public b z;

    public void h(){
       super();
       this.x = false;
       this.y = null;
       this.A = false;
       this.B = new h$a(this);
    }
    public void E8(){
       boolean b;
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "2")) {
          return;
       }
       ShareMyFeedGuideConfig obj = PatchProxy.apply(objArray, this, oh, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          PhotoDetailParam mPhoto = this.s.mPhoto;
          b = (mPhoto != null && (mPhoto.isPublic() && !this.s.mPhoto.isLimitVisibility()))? true: false;
       }
       if (!b) {
          return;
       }else {
          this.w.add(this.B);
          this.X7(this.v.subscribe(new o(this)));
          obj = a.t().getValue("shareMyFeedGuideConfig", ShareMyFeedGuideConfig.class, new ShareMyFeedGuideConfig());
          this.y = obj;
          if (!obj.canSharePopGuideShow()) {
             return;
          }else {
             this.z = t.timer((long)this.y.mDelay, TimeUnit.SECONDS).subscribeOn(d.c).observeOn(d.a).filter(new q(this)).subscribe(new p(this));
             return;
          }
       }
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       super.H8();
       h tz = this.z;
       if (tz != null && !tz.isDisposed()) {
          this.z.dispose();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       this.w.remove(this.B);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.s = this.q8(PhotoDetailParam.class);
       this.t = this.q8(QPhoto.class);
       this.u = this.q8(PhotoMeta.class);
       this.v = this.r8("DETAIL_ON_CONFIGURATION_CHANGED_EVENT");
       this.w = this.r8("DETAIL_SCREEN_TOUCH_LISTENER");
       return;
    }
}
