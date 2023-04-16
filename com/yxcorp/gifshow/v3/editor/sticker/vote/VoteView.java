package com.yxcorp.gifshow.v3.editor.sticker.vote.VoteView;
import mn6.b;
import com.yxcorp.gifshow.v3.editor.sticker.vote.EditVoteView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.RectF;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.widget.RelativeLayout;
import nn6.a;
import java.lang.Math;
import android.view.View;
import android.app.Activity;
import e3a.a;
import com.yxcorp.utility.n;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import com.kwai.gifshow.post.api.feature.vote.model.VoteInfo;
import jn6.c;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.EditText;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteTextView;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteResultBar;
import android.widget.LinearLayout;
import mn6.c;
import com.kwai.gifshow.post.api.feature.vote.model.VoteResultResponse;
import com.kwai.gifshow.post.api.feature.vote.model.VoteResult;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteView$a;
import android.animation.Animator$AnimatorListener;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteView$b;
import vtc.j;

public class VoteView extends EditVoteView implements b	// class@0012cb
{
    public boolean A;
    public boolean B;
    public c C;
    public a D;
    public LinearLayout k;
    public RelativeLayout l;
    public VoteTextView m;
    public VoteTextView n;
    public TextView o;
    public TextView p;
    public LinearLayout q;
    public TextView r;
    public VoteResultBar s;
    public TextView t;
    public TextView u;
    public ImageView v;
    public ImageView w;
    public FrameLayout x;
    public long y;
    public long z;
    public static final int E;

    public void VoteView(Context p0){
       super(p0);
    }
    public void VoteView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void VoteView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public float a(RectF p0,int p1,int p2,int p3,int p4,float p5,float p6){
       EditVoteView obj;
       float f;
       String str2;
       View view = this;
       int i = p1;
       int i1 = p2;
       int i2 = p3;
       int i3 = p4;
       String str = "7";
       int i4 = 1;
       int i5 = 0;
       if (PatchProxy.isSupport(VoteView.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Float.valueOf(p5),Float.valueOf(p6)};
          obj = PatchProxy.apply(objArray, view, VoteView.class, str);
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       if (p0 != null && (i <= 0 || i1 <= 0)) {
          return 0x3f800000;
       }else if(p5 - null <= 0 || Float.isNaN(p5)){
          f = 0x3f800000;
       }else {
          f = p5;
       }
       float f1 = (float)i;
       int i6 = (int)((p0.centerX() * f1) - (((float)this.getMeasuredWidth() * f) / 2.00f));
       float f2 = p0.centerX() * f1;
       int i7 = (int)(f2 + (((float)this.getMeasuredWidth() * f) / 2.00f));
       float f3 = (float)i1;
       int i8 = (int)((p0.centerY() * f3) - (((float)this.getMeasuredHeight() * f) / 2.00f));
       f2 = p0.centerY() * f3;
       int i9 = (int)(f2 + (((float)this.getMeasuredHeight() * f) / 2.00f));
       int i10 = i7 - i6;
       int i11 = i9 - i8;
       String str1 = "ShowVoteView";
       if (i10 > 0 && (i11 > 0 && (this.getMeasuredWidth() <= 0 || this.getMeasuredHeight() <= 0))) {
          Object[] objArray1 = new Object[0];
          a.D().A(str1, "translateAndScale param error... parentWidth:"+i+" , parentHeight:"+i1+" , realWidth:"+i10+" , realHeight:"+i11+" , getMeasuredWidth:"+this.getMeasuredWidth()+" , getMeasuredHeight:"+this.getMeasuredHeight(), objArray1);
          return 0x3f800000;
       }else if(i10 > i){
          i11 = (i11 * i) / i10;
          i10 = i;
       }
       if (i11 > i1) {
          i10 = (i10 * i1) / i11;
          i11 = i1;
       }
       VoteView d = view.D;
       if (d != null) {
          d.g();
       }
       d = view.D;
       if (d != null && d.a()) {
          if (i6 < 0) {
             str2 = str1;
             i6 = 0;
          }else {
             float f7 = (float)(i9 + i3);
             if (f7 - view.D.d() > 0) {
                str2 = str1;
                if ((float)(i7 + i2) - view.D.b() > 0) {
                   i6 = ((int)view.D.b() - i10) - i2;
                }
             }else {
                str2 = str1;
             }
             if (f7 - view.D.d() < 0 && i7 > i) {
                i6 = i - i10;
             }
          }
          i4 = (int)view.D.e();
          if (i8 < 0 || (i8 + i3) < i4) {
             i8 = Math.max((i4 - i3), 0);
          }else if((float)(i9 + i3) - view.D.c() > 0){
             i8 = ((int)view.D.c() - i11) - i3;
          }
       }else {
          str2 = str1;
          if (i6 < 0) {
             i6 = 0;
          }else if(i7 > i){
             i6 = i - i10;
          }
          if (i8 < 0) {
             i8 = 0;
          }else if(i9 > i1){
             i8 = i1 - i11;
          }
       }
       float f4 = 0;
       view.setTranslationX(f4);
       view.setTranslationY(f4);
       float f5 = (float)Math.max((i6 + i2), 0);
       float f6 = (float)Math.max((i8 + i3), 0);
       if (!PatchProxy.isSupport(EditVoteView.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(f5), Float.valueOf(f6), view, EditVoteView.class, "10")) {
          view.setTranslationX((this.getTranslationX() + f5));
          view.setTranslationY((this.getTranslationY() + f6));
          EditVoteView uEditVoteVie = null;
          if (f5 - uEditVoteVie && f6 - uEditVoteVie) {
             Object[] objArray3 = null;
             if (!PatchProxy.applyVoid(objArray3, view, EditVoteView.class, "9")) {
                obj = view.i;
                if (obj != null) {
                   Activity uActivity = a.b(obj.getContext());
                   if (uActivity != null) {
                      n.C(uActivity);
                   }
                   view.i = objArray3;
                }
             }
          }
       }
       if (!PatchProxy.isSupport(EditVoteView.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), view, EditVoteView.class, str)) {
          f6 = 0;
          view.setPivotX(f6);
          view.setPivotY(f6);
          view.setScaleX(f);
          view.setScaleY(f);
       }
       Object[] objArray2 = new Object[]{"position:"+p0.toString()+" , parent width:"+i+" , parent height:"+i1+" , offsetX:"+i2+" , offsetY:"+i3+" , scale:"+f};
       a.D().s(str2, "translateAndScale VoteView", objArray2);
       return f;
    }
    public void b(InteractStickerInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoteView.class, "3")) {
          return;
       }
       VoteInfo voteInfo = c.f(p0);
       if (voteInfo != null) {
          this.c(voteInfo, false, false);
       }
       return;
    }
    public void c(VoteInfo p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(VoteView.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, VoteView.class, "4")) {
          return;
       }
       if (TextUtils.x(p0.mQuestion)) {
          this.b.setVisibility(4);
          if (!p2 && p1) {
             this.v.setVisibility(0);
             this.w.setVisibility(8);
          }
       }else {
          this.c.setText(p0.mQuestion);
          if (!p2 && p1) {
             this.v.setVisibility(8);
             this.w.setVisibility(0);
          }
       }
       this.d.setHint(null);
       this.e.setHint(null);
       this.d.setText(p0.getOptionLeft());
       this.e.setText(p0.getOptionRight());
       this.m.setText(p0.getOptionLeft());
       this.n.setText(p0.getOptionRight());
       this.m.setGravity(0x800003);
       this.n.setGravity(0x800005);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoteView.class, "1")) {
          return;
       }
       super.doBindView(p0);
       this.t = m1.f(p0, 0x7f0a35d8);
       this.v = m1.f(p0, 0x7f0a15a2);
       this.x = m1.f(p0, 0x7f0a0eeb);
       this.p = m1.f(p0, 0x7f0a35db);
       this.u = m1.f(p0, 0x7f0a35dc);
       this.w = m1.f(p0, 0x7f0a15a1);
       this.r = m1.f(p0, 0x7f0a35d2);
       this.n = m1.f(p0, 0x7f0a3e3d);
       this.s = m1.f(p0, 0x7f0a4539);
       this.m = m1.f(p0, 0x7f0a3e24);
       RelativeLayout relativeLayo = m1.f(p0, R.id.result_layout);
       this.l = relativeLayo;
       relativeLayo.setClickable(true);
       this.o = m1.f(p0, 0x7f0a35d7);
       this.k = m1.f(p0, 0x7f0a2ef7);
       this.q = m1.f(p0, 0x7f0a030e);
       return;
    }
    public void e(VoteTextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoteView.class, "2")) {
          return;
       }
       boolean b = false;
       this.k.setEnabled(b);
       VoteView tC = this.C;
       if (tC != null) {
          if (p0 == this.d) {
             tC.a(b);
          }else if(p0 == this.e){
             tC.a(1);
          }
       }
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, VoteView.class, "11")) {
          return;
       }
       Object[] objArray = new Object[]{TextUtils.N((this.y + this.z))};
       this.r.setText(this.getContext().getString(R.string.arg_RES_7f10513f, objArray));
       objArray = new Object[]{TextUtils.N(this.y)};
       this.t.setText(this.getContext().getString(R.string.arg_RES_7f102302, objArray));
       Object[] objArray1 = new Object[]{TextUtils.N(this.z)};
       this.u.setText(this.getContext().getString(R.string.arg_RES_7f102302, objArray1));
       return;
    }
    public void g(VoteResultResponse p0,boolean p1){
       if (PatchProxy.isSupport(VoteView.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, VoteView.class, "5")) {
          return;
       }
       this.c(p0.mVoteInfo, true, p1);
       this.y = p0.mVoteResult.getLeftCount();
       this.z = p0.mVoteResult.getRightCount();
       this.A = p0.mVoted;
       p0 = p0.mIsAuthor;
       this.B = p0;
       if (p0 != null) {
          this.q.setVisibility(0);
          this.f();
       }
       if (this.A != null) {
          this.h(0);
       }
       return;
    }
    public boolean getOptionViewHasResetLayout(){
       Object obj = PatchProxy.apply(null, this, VoteView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.e.getHasResetLayout() && (this.d.getHasResetLayout() && this.c.getHasResetLayout()))? true: false;
       return b;
    }
    public View getView(){
       return this;
    }
    public final void h(boolean p0){
       if (PatchProxy.isSupport(VoteView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VoteView.class, "9")) {
          return;
       }
       boolean b = true;
       this.A = b;
       if (this.B != null) {
          this.f();
       }
       int i = 0;
       this.l.setVisibility(i);
       AnimatorSet uAnimatorSet = new AnimatorSet();
       Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(this.k, View.ALPHA, new float[2]{0x3f800000,0}),ObjectAnimator.ofFloat(this.l, View.ALPHA, new float[2]{0,0x3f800000})};
       uAnimatorSet.playTogether(uAnimatorArr);
       long l = (p0)? 200: 0;
       uAnimatorSet.setDuration(l);
       uAnimatorSet.addListener(new VoteView$a(this, p0));
       uAnimatorSet.start();
       return;
    }
    public void setAuthorResultOnClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoteView.class, "12")) {
          return;
       }
       this.q.setOnClickListener(new VoteView$b(this, p0));
       return;
    }
    public void setInteractStickerContainerBorder(a p0){
       this.D = p0;
    }
    public void setOnOptionsClickListener(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoteView.class, "13")) {
          return;
       }
       this.C = new j(this, p0);
       return;
    }
}
