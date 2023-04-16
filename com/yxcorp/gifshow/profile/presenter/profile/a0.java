package com.yxcorp.gifshow.profile.presenter.profile.a0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import jp.a;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.CoverMeta;
import kp.r1;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import java.net.URL;
import com.yxcorp.gifshow.util.rx.RxBus;
import w16.l;
import brd.t;
import eoc.e;
import brd.z;
import j4c.d0;
import erd.g;
import crd.b;
import i3c.c;
import j4c.e0;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.graphics.drawable.ColorDrawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.facebook.drawee.view.DraweeView;
import hc.a;
import java.lang.Boolean;
import android.widget.ImageView;
import ekd.s0;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.gifshow.profile.presenter.profile.a0$d;
import android.view.View;
import ub.b;
import com.facebook.drawee.controller.ForwardingControllerListener;
import wb5.h;
import da6.c;
import wb5.a;
import mw4.a;
import s1c.o;
import com.yxcorp.gifshow.profile.presenter.profile.a0$a;
import com.yxcorp.gifshow.profile.presenter.profile.a0$b;
import com.yxcorp.gifshow.profile.presenter.profile.a0$c;
import s0d.f;
import s0d.a;
import jd.c;
import ha5.c;
import dd.d;
import uc.c;
import uc.b;
import s0d.e;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.ImageSource;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import com.facebook.drawee.controller.AbstractDraweeController;
import ekd.m1;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class a0 extends PresenterV2	// class@001480
{
    public KwaiImageView p;
    public User q;
    public CoverMeta r;
    public CommonMeta s;
    public BaseFeed t;
    public int u;
    public a v;
    public a0$b w;
    public a0$c x;
    public final a y;

    public void a0(){
       super();
       this.y = a.c;
    }
    public static String V8(BaseFeed p0){
       CDNUrl mUrl;
       Object obj = PatchProxy.applyOneRefs(p0, null, a0.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       CoverMeta uCoverMeta = r1.D0(p0);
       if (uCoverMeta == null) {
          return null;
       }
       if (!j.h(uCoverMeta.mOverrideCoverThumbnailUrls)) {
          mUrl = uCoverMeta.mOverrideCoverThumbnailUrls[0].mUrl;
       }else if(!j.h(uCoverMeta.mCoverThumbnailUrls)){
          mUrl = uCoverMeta.mCoverThumbnailUrls[0].mUrl;
       }else {
          mUrl = null;
       }
       if (mUrl != null) {
          try{
             return new URL(mUrl).getPath();
          }catch(java.net.MalformedURLException e0){
             return v1;
          }
       }else {
          goto label_0043 ;
       }
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a0.class, "3")) {
          return;
       }
       RxBus f = RxBus.f;
       z c = e.c;
       this.X7(f.f(l.class).observeOn(c).subscribe(new d0(this)));
       this.X7(f.f(c.class).observeOn(c).subscribe(new e0(this)));
       if (this.q == null) {
          this.p.setImageDrawable(objArray);
          this.p.setPlaceHolderImage(new ColorDrawable(0));
          return;
       }else {
          this.p.setAspectRatio(0x3f400000);
          if (this.W8()) {
             return;
          }
          this.P8();
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "6")) {
          return;
       }
       a0 tv = this.v;
       if (tv != null) {
          tv.stop();
          this.v = null;
       }
       this.R8();
       this.x = null;
       this.w = null;
       return;
    }
    public void P8(){
       boolean b;
       a0 uoa0 = a0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa0, "5")) {
          return;
       }
       this.R8();
       Object obj = PatchProxy.apply(objArray, this, uoa0, "8");
       int i = 0x7f0a326f;
       int i1 = 0x7f0a326e;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(s0.a(this.t.getId(), this.p.getTag(i1)) && (s0.a(a0.V8(this.t), this.p.getTag(i)) && this.p.getTag(0x7f0a326d) instanceof a)){
          b = true;
       }else {
          b = false;
       }
       if (!b) {
          this.p.setTag(i1, this.t.getId());
          this.p.setTag(i, a0.V8(this.t));
          this.p.setTag(R.id.profile_cover_context, objArray);
          uoa0 = this.p;
          a0 tt = this.t;
          h.d(uoa0, tt, this.y, ForwardingControllerListener.of(new a0$d(this, uoa0, tt.getId())));
       }else {
          this.r.putExtra("KWAI_IMAGE_CALLER_CONTEXT", this.p.getTag(R.id.profile_cover_context));
       }
       if (!j.h(this.r.mOverrideCoverThumbnailUrls)) {
          a.c(this.r);
       }
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "7")) {
          return;
       }
       if (this.p.getTag(0x7f0a0e38) != null) {
          this.p.i0();
          this.p.setTag(R.id.feed_tag_for_cover_view, null);
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "11")) {
          return;
       }
       this.p.setTag(R.id.profile_cover_feed_id, null);
       this.p.setTag(R.id.profile_cover_feed_url, null);
       this.p.setTag(R.id.profile_cover_context, null);
       return;
    }
    public final boolean W8(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a0 uoa0 = a0.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoa0, "13");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a0$a obj1 = PatchProxy.apply(objArray, this, uoa0, "9");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(this.u != true || (j.h(this.r.mProfileAnimatedCoverUrls) || !a.i())){
          b = 0;
       }else {
          b = o.h() ^ true;
       }
       if (!b) {
          return false;
       }else {
          CoverMeta mProfileAnim = this.r.mProfileAnimatedCoverUrls;
          if (j.h(mProfileAnim)) {
             this.p.i0();
             return false;
          }else if(this.p.getTag(0x7f0a0e38) == this.t){
             return false;
          }else {
             this.S8();
             obj1 = new a0$a(this);
             this.x = obj1;
             this.w = new a0$b(obj1);
             c uoc = new c();
             uoc.c(true);
             a$a uoa = a.d();
             uoa.b(":ks-features:ft-social:profile");
             uoa.d(ImageSource.FEED_COVER);
             d uod = Fresco.newDraweeControllerBuilder();
             uod.q(true);
             d uod1 = uod.r(uoa.a());
             uod1.y(this.p.getController());
             uod1.s(this.w);
             uod1.v(f.x().r(mProfileAnim).o(this.y.d(this.r), this.y.b(this.r)).l(objArray).m(new c()).j(uoc.a()).w(), false);
             AbstractDraweeController uAbstractDra = uod1.e();
             this.p.setController(uAbstractDra);
             this.p.setTag(R.id.feed_tag_for_cover_view, this.t);
             return true;
          }
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3105);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "2")) {
          return;
       }
       this.q = this.s8(User.class);
       this.r = this.q8(CoverMeta.class);
       this.s = this.q8(CommonMeta.class);
       this.t = this.r8("feed");
       this.u = this.r8("TAB_ID").intValue();
       return;
    }
    public void onEventMainThread(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "10")) {
          return;
       }
       p0 = p0.a;
       if (p0 != null && TextUtils.n(p0.getId(), this.t.getId())) {
          this.S8();
       }
       return;
    }
}
