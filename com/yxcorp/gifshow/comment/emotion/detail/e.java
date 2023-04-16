package com.yxcorp.gifshow.comment.emotion.detail.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import s0d.f;
import com.kwai.emotionsdk.bean.EmotionInfo;
import java.util.Collection;
import s0d.e;
import ub.b;
import com.facebook.imagepipeline.request.ImageRequest;
import pb.d;
import com.yxcorp.gifshow.comment.emotion.detail.e$b;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import java.util.List;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import com.yxcorp.utility.n;
import android.animation.LayoutTransition;
import android.view.ViewGroup;
import com.yxcorp.gifshow.comment.emotion.detail.e$a;
import com.yxcorp.gifshow.comment.emotion.view.XfScalableImageView$c;
import com.yxcorp.gifshow.comment.emotion.view.XfScalableImageView;
import crd.b;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import android.app.Activity;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import lk9.k;
import android.content.Context;
import n3d.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.component.misc.report.ReportInfo;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import com.kwai.component.misc.report.ReportActivity;
import lk9.l;
import ak5.j;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.comment.emotion.detail.d;
import com.yxcorp.gifshow.comment.emotion.detail.c;
import erd.g;
import lk9.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import ekd.m1;
import lk9.i;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.comment.emotion.detail.b;

public class e extends PresenterV2	// class@0010c8
{
    public b A;
    public EmotionInfo p;
    public String q;
    public String r;
    public ViewGroup s;
    public XfScalableImageView t;
    public View u;
    public View v;
    public View w;
    public View x;
    public KwaiBindableImageView y;
    public TextView z;

    public void e(){
       super();
    }
    public void E8(){
       Object[] objArray1;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "4")) {
          return;
       }
       this.t.setPlaceHolderImage(new ColorDrawable(0));
       d uod = this.t.g0(objArray, objArray, f.x().q(this.p.mEmotionImageBigUrl).w());
       if (uod != null) {
          uod.s(new e$b(this));
       }
       e tt = this.t;
       if (uod == null) {
          objArray1 = objArray;
       }else {
          uod.q(1);
          objArray1 = uod.e();
       }
       tt.setController(objArray1);
       if (!PatchProxy.applyVoid(objArray, this, uoe, "5") && this.P8()) {
          this.y.P(this.p.mEmotionImageSmallUrl);
          this.z.setText(this.p.mMessage);
          View[] viewArray = new View[]{this.w,this.x};
          n.Z(0, viewArray);
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       LayoutTransition layoutTransi = new LayoutTransition();
       layoutTransi.setDuration(100);
       this.s.setLayoutTransition(layoutTransi);
       this.t.setListener(new e$a(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "12")) {
          return;
       }
       b9.a(this.A);
       return;
    }
    public final boolean P8(){
       Object obj = PatchProxy.apply(null, this, e.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.x(this.p.mMessage) ^ 0x01);
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, e.class, "7")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined()) {
          d.a(-1712118428).x00(this.getActivity(), 0, new LoginParams$a().a(), new k(this));
          return;
       }else {
          GifshowActivity activity = this.getActivity();
          ReportInfo reportInfo = new ReportInfo();
          reportInfo.mRefer = activity.getUrl();
          reportInfo.mPreRefer = activity.U2();
          reportInfo.mSourceType = "comment";
          reportInfo.mCommentId = this.q;
          reportInfo.mPhotoId = this.r;
          ReportActivity.P3(activity, WebEntryUrls.k, reportInfo);
          return;
       }
    }
    public final void S8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, e.class, "8")) {
          return;
       }
       if (!QCurrentUser.ME.isLogined()) {
          d.a(-1712118428).x00(this.getActivity(), 0, new LoginParams$a().a(), new l(this));
          return;
       }else {
          e tA = this.A;
          if (tA != null && !tA.isDisposed()) {
             return;
          }
          e tp = this.p;
          this.A = j.o().b(tp.mId, String.valueOf(tp.mBizType)).observeOn(d.a).subscribe(d.b, new c(this));
          tA = this.p;
          g og = g.class;
          if (!PatchProxy.applyVoidOneRefs(tA, objArray, og, "1")) {
             String str = "COMMENT_EMOTION";
             ClientEvent$ElementPackage uElementPack = PatchProxy.applyTwoRefs(tA, str, objArray, og, "5");
             if (uElementPack != PatchProxyResult.class) {
             }else {
                uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = str;
                i3 oi3 = i3.f();
                oi3.d("emo_id", tA.mId);
                oi3.c("emotion_biz_type", Integer.valueOf(tA.mBizType));
                uElementPack.params = oi3.e();
             }
             u1.u(1, uElementPack, objArray);
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a369f);
       this.t = m1.f(p0, 0x7f0a0cf9);
       this.u = m1.f(p0, 0x7f0a3f6a);
       this.v = m1.f(p0, 0x7f0a3f50);
       this.w = m1.f(p0, 0x7f0a04aa);
       this.x = m1.f(p0, 0x7f0a04ab);
       this.y = m1.f(p0, 0x7f0a0cf8);
       this.z = m1.f(p0, 0x7f0a0cfd);
       m1.a(p0, new i(this), R.id.left_btn);
       m1.a(p0, new b(this), R.id.right_btn);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_EMOTION_INFO");
       this.q = this.r8("comment_id");
       this.r = this.r8("photo_id");
       return;
    }
}
