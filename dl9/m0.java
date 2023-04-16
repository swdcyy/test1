package dl9.m0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.QComment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import android.widget.ImageView;
import nx9.c;
import hl9.t;
import com.kuaishou.android.model.mix.QComment$Label;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import com.kwai.emotionsdk.bean.EmotionInfo;
import java.lang.Math;
import dl9.f0;
import android.view.View$OnLongClickListener;
import crd.b;
import com.yxcorp.gifshow.comment.utils.c;
import dl9.m0$a;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import dl9.m0$c;
import brd.t;
import xl8.b;
import t45.d;
import brd.z;
import dl9.c0;
import erd.r;
import dl9.a0;
import erd.g;
import dl9.k0;
import com.kwai.library.widget.popup.common.c;
import java.util.Objects;
import ek9.e;
import lnc.b9;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import zf6.k;
import android.content.Context;
import android.widget.TextView;
import android.content.res.ColorStateList;
import androidx.core.content.ContextCompat;
import android.content.res.Resources;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import ou5.b;
import android.app.Activity;
import com.kwai.feature.api.social.login.model.LoginParams$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import dl9.j0;
import n3d.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.component.misc.report.ReportInfo;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import com.kwai.component.misc.report.ReportActivity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import k2b.f0;
import yk9.d;
import dl9.i0;
import ak5.j;
import dl9.b0;
import dl9.l0;
import java.lang.Integer;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import com.facebook.drawee.generic.RoundingParams;
import java.util.Collection;
import ekd.q;
import s0d.f;
import s0d.a;
import uc.c;
import uc.b;
import s0d.e;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeController;

public class m0 extends PresenterV2	// class@001f83
{
    public boolean A;
    public boolean B;
    public QComment p;
    public d q;
    public RecyclerFragment r;
    public QPhoto s;
    public b t;
    public KwaiImageView u;
    public e v;
    public View w;
    public View x;
    public a y;
    public m0$c z;

    public void m0(){
       super();
    }
    public void E8(){
       int b;
       m0 tx;
       m0 om0 = m0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om0, "4")) {
          return;
       }
       int i = 8;
       if (!PatchProxy.applyVoid(objArray, this, om0, "7")) {
          if (TextUtils.x(this.p.mComment)) {
             this.w.setVisibility(i);
          }else {
             this.w.setVisibility(0);
          }
       }
       this.S8(this.m8());
       QComment mEmotionInfo = this.p.mEmotionInfo;
       if (mEmotionInfo == null) {
          om0 = this.u;
          if (om0 != null) {
             om0.setVisibility(i);
          }
          om0 = this.x;
          if (om0 != null) {
             om0.setVisibility(i);
          }
          return;
       }else if(c.f() && this.u == null){
          t.l9(this.m8(), R.id.layout_emotion_image);
          this.S8(this.m8());
       }
       if (this.p.isTopComment() && this.p.getCommentTopLabel() != null) {
          QComment$Label commentTopLa = this.p.getCommentTopLabel();
          if (!PatchProxy.applyVoidOneRefs(commentTopLa, this, om0, "5")) {
             tx = this.x;
             if (tx != null) {
                String str = (TextUtils.x(commentTopLa.mLabelName))? a1.p(R.string.arg_RES_7f104d63): commentTopLa.mLabelName;
                t.k9(tx, str);
                this.x.setVisibility(0);
             }
          }
       }else {
          tx = this.x;
          if (tx != null) {
             tx.setVisibility(i);
          }
       }
       if (!PatchProxy.applyVoidOneRefs(mEmotionInfo, this, om0, "16")) {
          b = a1.d(R.dimen.arg_RES_7f070254);
          this.u.getLayoutParams().width = 0;
          this.u.getLayoutParams().height = 0;
          EmotionInfo mWidth = mEmotionInfo.mWidth;
          if (mWidth > null) {
             EmotionInfo mHeight = mEmotionInfo.mHeight;
             if (mHeight > null) {
                float f = (float)b;
                float f1 = Math.max((((float)mWidth * 0x3f800000) / f), (((float)mHeight * 0x3f800000) / f));
                this.u.getLayoutParams().width = (int)((float)mEmotionInfo.mWidth / f1);
                this.u.getLayoutParams().height = (int)((float)mEmotionInfo.mHeight / f1);
             }
          }
          if (this.u.getLayoutParams().width <= null || this.u.getLayoutParams().height <= null) {
             this.u.getLayoutParams().width = b;
             this.u.getLayoutParams().height = b;
          }
       }
       this.u.setVisibility(0);
       this.X7(c.b(this.u, new f0(this)));
       this.X7(c.a(this.u, new m0$a(this)));
       t obj = PatchProxy.apply(objArray, objArray, c.class, "3");
       b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().d("enableCommentEmotionGifOpt", 0);
       this.B = b;
       this.z = new m0$c(objArray);
       this.Y8(mEmotionInfo);
       if (this.B != null) {
          z a = d.a;
          this.X7(this.t.observable().distinctUntilChanged().subscribeOn(d.c).observeOn(a).filter(new c0(this)).subscribe(new a0(this, mEmotionInfo)));
          obj = this.t.observable().distinctUntilChanged().observeOn(a);
          this.X7(obj.subscribe(new k0(this)));
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, m0.class, "17")) {
          return;
       }
       this.z = objArray;
       m0 ty = this.y;
       if (ty != null) {
          ty.q(0);
       }
       ty = this.v;
       if (ty != null) {
          Objects.requireNonNull(ty);
          if (!PatchProxy.applyVoid(objArray, ty, e.class, "1")) {
             b9.a(ty.a);
          }
       }
       return;
    }
    public void P8(boolean p0){
       m0 om0 = m0.class;
       if (PatchProxy.isSupport(om0) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, om0, "12")) {
          return;
       }
       if (this.r.h0() == null) {
          return;
       }
       this.r.h0().requestDisallowInterceptTouchEvent(p0);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, m0.class, "11")) {
          return;
       }
       m0 ty = this.y;
       if (ty != null) {
          ty.o();
       }
       return;
    }
    public final void S8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m0.class, "3")) {
          return;
       }
       if (this.u != null) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a0861);
       return;
    }
    public final void V8(View p0,boolean p1){
       int color;
       m0 om0 = m0.class;
       if (PatchProxy.isSupport(om0) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, om0, "10")) {
          return;
       }
       if (!k.d()) {
          return;
       }
       View view = p0.findViewById(R.id.emotion_popup);
       int i = 0x7f080405;
       if (k.e()) {
          if (t.W8(this.getContext())) {
             view.setBackgroundResource(R.drawable.bubble_black_background);
             ColorStateList colorStateLi = ContextCompat.getColorStateList(p0.getContext(), R.color.arg_RES_7f060a0b);
             p0.findViewById(R.id.emotion_add).setTextColor(colorStateLi);
             p0.findViewById(R.id.save_to_album).setTextColor(colorStateLi);
             p0.findViewById(R.id.emotion_report).setTextColor(colorStateLi);
          }else {
             view.setBackgroundResource(R.drawable.bubble_white_background);
             color = p0.getResources().getColor(R.color.arg_RES_7f06203c);
             p0.findViewById(R.id.emotion_divider).setBackgroundColor(color);
             p0.findViewById(R.id.emotion_divider_2).setBackgroundColor(color);
             p0 = p0.findViewById(R.id.arrow);
             if (!p1) {
                i = 0x7f080402;
             }
             p0.setBackgroundResource(i);
          }
       }else {
          color = p0.getResources().getColor(R.color.arg_RES_7f06203c);
          p0.findViewById(R.id.emotion_divider).setBackgroundColor(color);
          p0.findViewById(R.id.emotion_divider_2).setBackgroundColor(color);
          p0 = p0.findViewById(R.id.arrow);
          if (!p1) {
             i = 0x7f080402;
          }
          p0.setBackgroundResource(i);
       }
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, m0.class, "14")) {
          return;
       }
       this.R8();
       if (!QCurrentUser.ME.isLogined()) {
          d.a(-1712118428).x00(this.getActivity(), 0, new LoginParams$a().a(), new j0(this));
          return;
       }else {
          GifshowActivity activity = this.getActivity();
          ReportInfo reportInfo = new ReportInfo();
          reportInfo.mRefer = activity.getUrl();
          reportInfo.mPreRefer = activity.U2();
          reportInfo.mSourceType = "comment";
          reportInfo.mCommentId = this.p.getId();
          reportInfo.mPhotoId = this.s.getPhotoId();
          ReportActivity.P3(activity, WebEntryUrls.k, reportInfo);
          QComment mEmotionInfo = this.p.mEmotionInfo;
          if (mEmotionInfo != null) {
             this.q.o(mEmotionInfo, "report", f0.a(this.r, this.getActivity()));
          }
          return;
       }
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, m0.class, "13")) {
          return;
       }
       this.R8();
       if (!QCurrentUser.ME.isLogined()) {
          d.a(-1712118428).x00(this.getActivity(), 0, new LoginParams$a().a(), new i0(this));
          return;
       }else {
          QComment mEmotionInfo = this.p.mEmotionInfo;
          if (mEmotionInfo == null) {
             return;
          }
          j.o().b(mEmotionInfo.mId, String.valueOf(mEmotionInfo.mBizType)).observeOn(d.a).subscribe(b0.b, new l0(this));
          this.q.o(mEmotionInfo, "add_to_emoticon", f0.a(this.r, this.getActivity()));
          return;
       }
    }
    public final void Y8(EmotionInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m0.class, "6")) {
          return;
       }
       if (!TextUtils.x(p0.mId) && (p0.mId).equals(this.u.getTag())) {
          return;
       }
       boolean b = true;
       if (this.B != null && this.t.a().intValue() == b) {
          this.u.i0();
          this.A = b;
          return;
       }else {
          boolean b1 = false;
          this.A = b1;
          this.u.setPlaceHolderImage(R.drawable.arg_RES_7f0804d2);
          this.u.getHierarchy().u(t$b.e);
          this.u.setTag(p0.mId);
          RoundingParams roundingPara = RoundingParams.c((float)a1.d(R.dimen.arg_RES_7f070429));
          if (this.getContext() != null) {
             roundingPara.o(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f0606e9));
          }
          this.u.getHierarchy().L(roundingPara);
          if (q.f(p0.mEmotionImageBigUrl)) {
             return;
          }else {
             c uoc = new c();
             uoc.c(this.B);
             a$a uoa = a.d();
             uoa.b(":ks-components:comment");
             uoa.d(ImageSource.COMMENT_EMOTION);
             d uod = Fresco.newDraweeControllerBuilder();
             uod.q(b);
             d uod1 = uod.r(uoa.a());
             uod1.y(this.u.getController());
             uod1.s(this.z);
             uod1.v(f.x().q(p0.mEmotionImageBigUrl).o(this.u.getLayoutParams().width, this.u.getLayoutParams().height).j(uoc.a()).w(), b1);
             this.u.setController(uod1.e());
             return;
          }
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m0.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a0861);
       this.w = m1.f(p0, 0x7f0a0846);
       p0 = m1.f(p0, R.id.top_comment_tag_with_emotion);
       this.x = p0;
       t.h9(p0, true);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m0.class, "1")) {
          return;
       }
       this.p = this.q8(QComment.class);
       this.q = this.q8(d.class);
       this.r = this.r8("FRAGMENT");
       this.s = this.q8(QPhoto.class);
       this.t = this.r8("COMMENT_RECYCLE_VIEW_SCROLL_FAST_STATE");
       return;
    }
}
