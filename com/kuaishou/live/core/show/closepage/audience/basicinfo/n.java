package com.kuaishou.live.core.show.closepage.audience.basicinfo.n;
import im8.g;
import k51.c;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.n$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import d61.i;
import t02.a0;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import vb5.a;
import jd.c;
import com.facebook.imagepipeline.request.ImageRequest;
import wb5.b;
import yb7.a;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import brd.t;
import g52.i;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.l;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d6a.u;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Boolean;
import android.app.Activity;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.User;
import java.lang.StringBuilder;
import f52.z;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import jga.c;
import wca.b;
import f52.a0;
import y41.i$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import p91.m;
import com.kuaishou.live.core.basic.utils.e;
import y41.i;
import ekd.m1;
import android.widget.TextView;
import android.view.ViewStub;
import com.airbnb.lottie.LottieAnimationView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.n$b;
import com.yxcorp.gifshow.widget.m;
import f52.h0;
import java.util.Map;
import java.util.HashMap;

public class n extends c implements g	// class@000a45
{
    public a0 p;
    public i q;
    public TextView r;
    public View s;
    public LottieAnimationView t;
    public KwaiImageView u;
    public boolean v;
    public ViewStub w;
    public final b x;
    public static String sLivePresenterClassName = "LivePlayClosedV3LiveInfoPresenter";

    public void n(){
       super();
       this.x = new n$a(this);
    }
    public void E8(){
       n on = n.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, on, "3")) {
          return;
       }
       n tu = this.u;
       if (!PatchProxy.applyVoidOneRefs(tu, this, on, "10") && !i.a(tu)) {
          ImageRequest[] imageRequest = b.e(this.p.c.getCoverMeta(), (this.p.c.getWidth() / 8), (this.p.c.getHeight() / 8), new a(5));
          if (!a.c(imageRequest)) {
             d uod = Fresco.newDraweeControllerBuilder();
             uod.y(tu.getController());
             uod.u(imageRequest);
             tu.setController(uod.e());
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, on, "4")) {
          this.X7(this.q.a().subscribe(new l(this, this.p.c), Functions.d()));
       }
       if (u.a()) {
          ViewGroup$MarginLayoutParams layoutParams = this.s.getLayoutParams();
          layoutParams.topMargin = layoutParams.topMargin + n.A(a.B);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, n.class, "8")) {
          return;
       }
       this.v = false;
       return;
    }
    public void P8(LiveStreamFeedWrapper p0,boolean p1){
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, on, "11")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       if (!QCurrentUser.me().isLogined()) {
          b uob = d.a(-1712118428);
          Activity activity = this.getActivity();
          String str = PatchProxy.applyOneRefs(p0, this, on, "16");
          if (str != PatchProxyResult.class) {
          }else {
             str = "ks://live_audience_end/";
             if (p0 != null && p0.getUser() != null) {
                str = str+p0.getUser().getId()+"/"+p0.getLiveStreamId();
             }
          }
          Object obj = str;
          uob.ne(activity, obj, "live_follow", 45, "", null, null, null, new z(this, p0, p1)).h();
          return;
       }else {
          User user = p0.getUser();
          user.mPage = "live";
          i$a uoa = new i$a(this.getActivity(), this.p.Z2.getLiveStreamId());
          uoa.o(user);
          uoa.f(b.c(this.p.c.mEntity));
          uoa.m(e.j(this.p.c));
          uoa.n(26);
          uoa.r(true);
          uoa.j(new a0(p0));
          i oi = uoa.a();
          if (p1) {
             oi.c();
          }else {
             oi.e();
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a22ce);
       this.w = m1.f(p0, 0x7f0a1b31);
       this.s = m1.f(p0, 0x7f0a22cb);
       this.t = m1.f(p0, 0x7f0a22cd);
       this.u = m1.f(p0, 0x7f0a22cc);
       m1.b(p0, new n$b(this), R.id.live_play_closed_v3_back_btn);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, n.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, n.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(n.class, new h0());
       }else {
          obj.put(n.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.q = this.q8(i.class);
       return;
    }
}
