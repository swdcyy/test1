package com.yxcorp.gifshow.detail.fragments.milano.presenter.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.widget.d;
import v0a.v;
import uid.a;
import java.util.BitSet;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.d$a;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.d$b;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.d$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import hf5.b;
import df5.b;
import android.view.View;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import android.widget.ImageView;
import android.widget.TextView;
import o56.a;
import lnc.a1;
import java.lang.CharSequence;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.widget.EmojiTextView;
import android.graphics.drawable.Drawable;
import le5.f;
import lnc.u1;
import android.content.Context;
import com.yxcorp.utility.n;
import jta.c;
import hf5.e;
import v0a.w;
import java.lang.Runnable;
import v0a.e0;
import erd.g;
import crd.b;
import brd.t;
import v0a.g0;
import hf5.g;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import v0a.d0;
import v0a.f0;
import qvb.q;
import sy6.a;
import java.lang.Boolean;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import wh5.c;
import ekd.k1;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.d$d;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.d$e;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;
import com.yxcorp.gifshow.comment.utils.d;
import qd5.a;
import k2b.e0;
import com.yxcorp.gifshow.event.CommentsEvent;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.event.CommentsEvent$Operation;
import nk9.a;
import rnc.i;
import java.lang.Float;
import android.text.SpannableString;
import android.text.Spannable;
import ak5.j;
import hl9.c;

public class d extends PresenterV2	// class@001525
{
    public ImageView A;
    public TextView B;
    public KwaiImageView C;
    public ImageView D;
    public EmojiTextView E;
    public EmojiTextView F;
    public View G;
    public QComment H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public final d M;
    public AnimatorSet N;
    public OverallEmotionsData O;
    public Runnable P;
    public b Q;
    public final boolean R;
    public t S;
    public BitSet T;
    public final q U;
    public final c V;
    public final b W;
    public final boolean p;
    public a q;
    public e0 r;
    public MilanoContainerEventBus s;
    public View t;
    public ViewStubInflater2 u;
    public g v;
    public e w;
    public b x;
    public QPhoto y;
    public ImageView z;

    public void d(boolean p0,boolean p1,boolean p2,int p3){
       super(p0, p1, p2, false, p3);
    }
    public void d(boolean p0,boolean p1,boolean p2,boolean p3,int p4){
       super();
       this.M = new d();
       this.P = new v(this);
       this.R = a.a();
       this.T = new BitSet();
       this.U = new d$a(this);
       this.V = new d$b(this);
       this.W = new d$c(this);
       this.p = p0;
       this.I = p1;
       this.J = p2;
       this.K = p3;
       this.L = p4;
    }
    public void E8(){
       d tD;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "2")) {
          return;
       }
       boolean b = true;
       this.M.e(b);
       this.y = this.x.getCurrentPhoto();
       this.x.De(this.W);
       this.u.d(this.m8());
       this.t = this.u.b(0x7f0a048f);
       this.z = this.u.b(0x7f0a026f);
       this.A = this.u.b(0x7f0a308f);
       this.B = this.u.b(0x7f0a0eb0);
       this.D = this.u.b(0x7f0a0cf0);
       if (a.d()) {
          tD = this.D;
          if (tD != null) {
             tD.setContentDescription(a1.p(R.string.arg_RES_7f100d1b));
          }
       }
       this.C = this.u.b(0x7f0a2f58);
       this.E = this.t.findViewById(0x7f0a3deb);
       this.G = this.t.findViewById(0x7f0a047d);
       this.t.setBackground(objArray);
       this.t.setVisibility(8);
       if (f.r()) {
          this.t.setBackgroundColor(a1.a(R.color.arg_RES_7f0606b3));
       }
       u1.a(this);
       EmojiTextView uEmojiTextVi = this.t.findViewById(R.id.text_emotion_tips);
       View view = this.t.findViewById(R.id.text_parent);
       int i = 0;
       if (uEmojiTextVi != null && view != null) {
          this.F = uEmojiTextVi;
          this.R8(view, b);
       }else {
          this.R8(this.E, i);
       }
       if (this.A != null && (this.R != null && this.S8())) {
          this.A.setVisibility(i);
          tD = this.E;
          tD.setPadding(tD.getPaddingLeft(), this.E.getPaddingTop(), (this.E.getPaddingRight() + n.c(this.E.getContext(), 40.00f)), this.E.getPaddingBottom());
       }
    label_0122 :
       this.w.D0(this.V);
       this.E.post(new w(this));
       tD = this.S;
       if (tD != null) {
          this.X7(tD.subscribe(new e0(this)));
       }
       this.X7(this.v.L2(new g0(this)));
       this.X7(this.s.s.subscribe(new d0(this)));
       this.X7(this.s.r.subscribe(new f0(this)));
       this.q.e(this.U);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "12")) {
          return;
       }
       this.x.c3(this.W);
       u1.b(this);
       this.w.w0(this.V);
       this.q.b(this.U);
       return;
    }
    public void P8(){
    }
    public final void R8(View p0,boolean p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uod, "3")) {
          return;
       }
       ViewGroup$MarginLayoutParams layoutParams = p0.getLayoutParams();
       p0.setBackground(this.getContext().getResources().getDrawable(R.drawable.arg_RES_7f0819ab));
       layoutParams.height = a1.e(38.00f);
       float f = 16.00f;
       if (p1) {
          p0.setPadding(a1.e(f), 0, p0.getPaddingRight(), 0);
          layoutParams.rightMargin = a1.e(11.00f);
       }else {
          p0.setPadding(a1.e(f), 0, 0, 0);
       }
       p0.setLayoutParams(layoutParams);
       p0.requestLayout();
       return;
    }
    public boolean S8(){
       d obj = PatchProxy.apply(null, this, d.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.y;
       boolean b = (obj != null && obj.enablePictureCommentForPhoto())? true: false;
       return b;
    }
    public void V8(){
    }
    public void W8(boolean p0){
    }
    public void X8(int p0,boolean p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uod, "14")) {
          return;
       }
       if (this.p != null) {
          return;
       }
       if (c.b()) {
          return;
       }
       this.T.set(p0, p1);
       if (this.T.isEmpty()) {
          n.Y(this.t, 0, 0);
       }else {
          n.Y(this.t, 8, 0);
       }
       return;
    }
    public void Y8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "13")) {
          return;
       }
       k1.m(this.P);
       this.O = objArray;
       if (this.D != null) {
          d tC = this.C;
          if (tC != null && !tC.getVisibility()) {
             this.Z8(this.C, this.D, false);
          }
       }
       return;
    }
    public final void Z8(View p0,View p1,boolean p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, d.class, "15")) {
          return;
       }
       if (p0 != null && p1 != null) {
          this.N = new AnimatorSet();
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, "scaleX", new float[2]{0x3f800000,0});
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(p0, "scaleY", new float[2]{0x3f800000,0});
          objectAnimat.addListener(new d$d(this, p0));
          objectAnimat.setDuration(160);
          objectAnimat1.setDuration(160);
          ObjectAnimator objectAnimat2 = ObjectAnimator.ofFloat(p1, "scaleX", new float[2]{0,0x3f800000});
          ObjectAnimator objectAnimat3 = ObjectAnimator.ofFloat(p1, "scaleY", new float[2]{0,0x3f800000});
          objectAnimat2.addListener(new d$e(this, p1, p2));
          objectAnimat2.setDuration(160);
          objectAnimat3.setDuration(160);
          this.N.play(objectAnimat).with(objectAnimat1);
          this.N.play(objectAnimat2).with(objectAnimat3);
          this.N.play(objectAnimat).before(objectAnimat2);
          this.N.start();
       }
       return;
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, d.class, "11")) {
          return;
       }
       if (this.z == null) {
          return;
       }
       d tz = this.z;
       float f = (!d.b(this.E.getText()))? 0x3f000000: 0x3f800000;
       tz.setAlpha(f);
       return;
    }
    public final void b9(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "6")) {
          return;
       }
       if (p0 != null && !p0.isAllowComment()) {
          this.E.setHint(a1.p(R.string.arg_RES_7f10078c));
       }else {
          this.E.setHint(a.a(this.y));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.q = this.q8(a.class);
       this.s = this.q8(MilanoContainerEventBus.class);
       this.u = this.r8("NASA_BOTTOM_COMMENT_VIEW_STUB");
       this.v = this.q8(g.class);
       this.x = this.q8(b.class);
       this.w = this.q8(e.class);
       this.r = this.q8(e0.class);
       this.S = this.t8("NASA_BOTTOM_TAG_BAR_VIEW_SHOW_OBSERVABLE");
       this.u.e(R.layout.arg_RES_7f0d105f);
       this.M.f(a1.a(R.color.arg_RES_7f060221));
       return;
    }
    public void onEventMainThread(CommentsEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "9")) {
          return;
       }
       QPhoto currentPhoto = this.x.getCurrentPhoto();
       if (currentPhoto != null && (p0.b == null || (TextUtils.n(currentPhoto.getPhotoId(), p0.b.getPhotoId()) && p0.c == CommentsEvent$Operation.SEND))) {
          this.E.setText("");
          this.a9();
          this.B.setVisibility(8);
          this.W8(false);
          d tF = this.F;
          if (tF != null) {
             tF.setVisibility(8);
             this.b9(this.y);
          }
       }
    label_004f :
       return;
    }
    public void onEventMainThread(a p0){
       SpannableString spannableStr;
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "8")) {
          return;
       }
       QPhoto currentPhoto = this.q.getCurrentPhoto();
       if (currentPhoto == null || (p0.a != null && TextUtils.n(currentPhoto.getPhotoId(), p0.a.getPhotoId()))) {
          CharSequence uCharSequenc = i.j(p0.b);
          d tE = this.E;
          float textSize = tE.getTextSize();
          if (PatchProxy.isSupport(uod)) {
             spannableStr = PatchProxy.applyTwoRefs(uCharSequenc, Float.valueOf(textSize), this, uod, "10");
             if (spannableStr != PatchProxyResult.class) {
             }else {
             label_004c :
                spannableStr = new SpannableString(uCharSequenc);
                if (!TextUtils.x(uCharSequenc)) {
                   this.M.a(spannableStr);
                   if (j.o().t()) {
                      j.o().f(spannableStr, this.E, textSize);
                   }
                }
             }
          }else {
             goto label_004c ;
          }
          tE.setText(spannableStr);
          this.a9();
          if (p0.c != null || p0.d != null) {
             tE = this.F;
             if (tE != null) {
                tE.setVisibility(0);
                tE = this.F;
                String str = (p0.d != null)? a1.p(R.string.arg_RES_7f101640): a1.p(R.string.arg_RES_7f100d1f);
                tE.setText(str);
                this.E.setHint(null);
             }else if(this.F != null){
                this.b9(this.y);
                this.F.setVisibility(8);
             }
          }else {
             goto label_00a6 ;
          }
          if (!PatchProxy.applyVoidOneRefs(p0, this, uod, "16") && this.B != null) {
             a b = p0.b;
             if (b == null || (TextUtils.x(b) && (p0.c != null || p0.d != null))) {
                this.B.setVisibility(0);
                this.W8(true);
             }else {
                this.B.setVisibility(8);
                this.W8(0);
             }
          }
          this.H = p0.f;
          c.f(this.B, this.getContext(), uCharSequenc);
       }
    label_00f4 :
       return;
    }
}
