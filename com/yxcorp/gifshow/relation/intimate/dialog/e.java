package com.yxcorp.gifshow.relation.intimate.dialog.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import java.lang.Object;
import wkd.b;
import com.kwai.user.base.intimate.b;
import com.yxcorp.gifshow.model.IntimateRelationInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.relation.intimate.IntimateRouterActivity;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.kwai.robust.PatchProxyResult;
import bld.b;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;
import android.view.View;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import tkd.b;
import tkd.d;
import vu5.b;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.widget.m;
import android.widget.TextView;
import android.view.View$OnClickListener;
import java.lang.Boolean;
import com.yxcorp.widget.selector.view.SelectShapeFrameLayout;
import android.widget.ImageView;
import com.yxcorp.gifshow.relation.intimate.dialog.e$b;
import com.yxcorp.gifshow.relation.intimate.dialog.e$d;
import com.yxcorp.gifshow.relation.intimate.dialog.e$c;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import ub.b;
import com.yxcorp.image.callercontext.a;
import wb5.g;
import android.widget.FrameLayout;
import kzc.d;
import abc.d;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import com.kwai.library.widget.popup.common.c$b;
import com.kuaishou.growth.privacy.dialog.helper.j;
import abc.e;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.yxcorp.gifshow.relation.intimate.dialog.e$a;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.yxcorp.gifshow.relation.intimate.dialog.d;
import erd.r;
import abc.f;
import erd.g;
import crd.b;

public abstract class e	// class@0018ee
{
    public c a;
    public View b;
    public KwaiImageView c;
    public SelectShapeFrameLayout d;
    public SelectShapeFrameLayout e;
    public TextView f;
    public GifshowActivity g;
    public IntimateRelationInfo h;
    public final IntimateRelationDialogParams i;
    public final PopupInterface$h j;
    public boolean k;
    public int l;

    public void e(GifshowActivity p0,IntimateRelationDialogParams p1,PopupInterface$h p2){
       super();
       this.k = true;
       this.l = -1;
       this.g = p0;
       this.i = p1;
       this.h = b.a(0x40193068).c(p1.mIntimateType);
       this.j = p2;
    }
    public boolean a(){
       return true;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "20")) {
          return;
       }
       this.c(4);
       return;
    }
    public void c(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "21")) {
          return;
       }
       uoe = this.a;
       if (uoe != null) {
          uoe.q(p0);
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, e.class, "22")) {
          return;
       }
       e tg = this.g;
       if (tg instanceof IntimateRouterActivity && !tg.isFinishing()) {
          this.g.finish();
       }
       return;
    }
    public Drawable e(int p0){
       b obj;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new b();
       obj.s(DrawableCreator$Shape.Oval);
       obj.v(p0);
       return obj.a();
    }
    public abstract int f();
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "9")) {
          return;
       }
       e tb = this.b;
       if (tb == null) {
          return;
       }
       tb.setTag(R.id.tag_view_refere, Integer.valueOf(259));
       ProfileStartParam profileStart = ProfileStartParam.m(p0);
       profileStart.r(this.b);
       d.a(-1718536792).Kp(this.g, profileStart);
       return;
    }
    public void h(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "12")) {
          return;
       }
       KwaiImageView kwaiImageVie = m1.f(p0, R.id.dialog_bg);
       String dialogBgImag = this.h.getDialogBgImage();
       if (!TextUtils.x(dialogBgImag)) {
          kwaiImageVie.M(dialogBgImag, null);
       }
       return;
    }
    public void i(View p0,m p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "16")) {
          return;
       }
       TextView textView = m1.f(p0, R.id.bottom_button);
       this.f = textView;
       textView.setOnClickListener(p1);
       return;
    }
    public void j(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "15")) {
          return;
       }
       m1.f(p0, R.id.desc).setText(p1);
       return;
    }
    public void k(View p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoe, "4")) {
          return;
       }
       this.d = m1.f(p0, 0x7f0a174d);
       this.e = m1.f(p0, 0x7f0a366f);
       this.c = m1.f(p0, 0x7f0a3554);
       this.m(m1.f(p0, R.id.right_user_avatar), p1);
       this.l(m1.f(p0, R.id.left_user_avatar), p1);
       String icon = this.h.getIcon();
       if (p1 && !TextUtils.x(icon)) {
          this.c.setVisibility(0);
          this.c.M(icon, null);
       }else {
          this.c.setVisibility(8);
       }
       m1.b(p0, new e$b(this), R.id.left_user_avatar);
       return;
    }
    public void l(KwaiImageView p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoe, "6")) {
          return;
       }
       this.w(this.i.mOwnerHeadUrl, p0, this.d, p1);
       m1.b(p0, new e$d(this), R.id.left_user_avatar);
       return;
    }
    public void m(KwaiImageView p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoe, "5")) {
          return;
       }
       this.w(this.i.mTargetHeadUrl, p0, this.e, p1);
       m1.b(p0, new e$c(this), R.id.right_user_avatar);
       return;
    }
    public void n(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "14")) {
          return;
       }
       TextView textView = m1.f(p0, R.id.sub_title);
       textView.setVisibility(0);
       textView.setText(p1);
       return;
    }
    public void o(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "13")) {
          return;
       }
       m1.f(p0, R.id.title).setText(p1);
       return;
    }
    public abstract void p(View p0);
    public void q(){
       if (PatchProxy.applyVoid(null, this, e.class, "8")) {
          return;
       }
       this.c(11);
       this.g(this.i.mOwnerId);
       return;
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, e.class, "7")) {
          return;
       }
       this.c(11);
       this.g(this.i.mTargetId);
       return;
    }
    public void s(c p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "19")) {
          return;
       }
       uoe = this.j;
       if (uoe != null) {
          uoe.H(p0, p1);
       }
       this.d();
       return;
    }
    public void t(){
    }
    public void u(c p0){
    }
    public void v(c p0){
    }
    public final void w(String p0,KwaiImageView p1,SelectShapeFrameLayout p2,boolean p3){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, e.class, "10")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       g.g(p1, p0, HeadImageSize.ADJUST_BIG, null, null);
       int avatarBorder = (p3)? this.h.getAvatarBorderColor(): -1;
       p2.setBackground(this.e(avatarBorder));
       return;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       if (!this.a()) {
          return;
       }
       d uod = new d(this.g);
       uod.Z0(this.l);
       uod.G(new d(this));
       uod.O(j.a);
       uod.Q(R.id.intimate_dialog_container);
       uod.L(new e(this));
       this.a = uod.Y(new e$a(this));
       this.g.m().filter(d.b).subscribe(new f(this));
       return;
    }
}
