package com.yxcorp.gifshow.detail.slidev2.presenter.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.e;
import android.graphics.RectF;
import com.yxcorp.gifshow.detail.slidev2.presenter.g$b;
import com.yxcorp.gifshow.detail.slidev2.presenter.f;
import z1.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.g$a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import uc6.c;
import sd5.d;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b8a.o;
import java.lang.Runnable;
import com.kuaishou.android.model.mix.PhotoDisplayLocationInfo;
import android.view.ViewGroup$OnHierarchyChangeListener;
import android.view.ViewGroup;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import b8a.n;
import erd.g;
import crd.b;
import brd.t;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import b8a.q;
import msd.r;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.entity.QPhoto;
import b8a.r;
import b8a.s;
import b8a.p;
import im8.f;
import java.lang.Boolean;
import uw9.q;
import lnc.a1;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.Math;
import lnc.e9;
import android.widget.TextView;
import android.view.View$OnLayoutChangeListener;
import ekd.m1;
import sd5.c;
import im8.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewStub;
import android.text.TextPaint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable$ConstantState;

public abstract class g extends e	// class@0019b3
{
    public View G;
    public KwaiImageView H;
    public View I;
    public ViewGroup J;
    public View K;
    public View L;
    public View M;
    public View N;
    public View O;
    public TextView P;
    public View Q;
    public View R;
    public View S;
    public View T;
    public d U;
    public final ViewTreeObserver$OnGlobalLayoutListener U0;
    public PhotoDisplayLocationInfo V;
    public f W;
    public f X;
    public t Y;
    public final g$b Z;
    public static final RectF V0;

    static {
       g.V0 = new RectF();
    }
    public void g(){
       super();
       this.Z = new g$b(new f(this));
       this.U0 = new g$a(this);
    }
    public static RectF e9(g p0,RectF p1,float p2,float p3,float p4){
       RectF rectF;
       Objects.requireNonNull(p0);
       if (PatchProxy.isSupport(g.class)) {
          rectF = PatchProxy.applyFourRefs(p1, Float.valueOf(p2), Float.valueOf(p3), Float.valueOf(p4), p0, g.class, "10");
          if (rectF != PatchProxyResult.class) {
          label_0044 :
             return rectF;
          }
       }
       rectF = g.V0;
       rectF.setEmpty();
       float f = 0x3f800000 - p4;
       rectF.set(0, 0, (p2 + ((p1.width() - p2) * f)), (p3 + ((p1.height() - p3) * f)));
       goto label_0044 ;
    }
    public static RectF h9(g p0,RectF p1,float p2,float p3,float p4){
       return p0.k9(p1, p2, p3, p4);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       this.G = this.U.N().m();
       super.E8();
       this.m8().post(new o(this));
       g tV = this.V;
       if (tV == null || !tV.isValid()) {
          PhotoDisplayLocationInfo photoDisplay = new PhotoDisplayLocationInfo();
          this.V = photoDisplay;
          photoDisplay.mTopRatio = 0;
          photoDisplay.mLeftRatio = 0;
          float f = 0x3f800000;
          photoDisplay.mWidthRatio = f;
          photoDisplay.mHeightRatio = f;
       }
       tV = this.Z;
       g tJ = this.J;
       Objects.requireNonNull(tV);
       if (!PatchProxy.applyVoidOneRefs(tJ, tV, g$b.class, "1")) {
          tV.e = tJ;
          tJ.setOnHierarchyChangeListener(tV);
          tV.d = tV.e.findViewById(0x7f0a2908);
       }
       this.j9(this.M, this.R);
       this.j9(this.N, this.S);
       Object[] objArray = new Object[0];
       o.C().w("FEATURED_SMALL_WINDOW", "adapt photoDisplayLocationInfo left:"+this.V.mLeftRatio+" top:"+this.V.mTopRatio+" width:"+this.V.mWidthRatio+" height:"+this.V.mHeightRatio, objArray);
       this.X7(this.Y.subscribe(new n(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, g.class, "15")) {
          return;
       }
       super.J8();
       g tI = this.I;
       if (tI != null) {
          tI.getViewTreeObserver().removeOnGlobalLayoutListener(this.U0);
       }
       return;
    }
    public void R8(float p0,float p1,float p2){
       g g;
       Object[] objArray;
       float f4;
       int i1;
       g og = this;
       float f = p0;
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, g.class, "5")) {
          return;
       }
       g = og.G;
       this.S8(g, g, og.E, og.F, p0, new q(this));
       String str = ", photo: ";
       String str1 = ",";
       String str2 = "FEATURED_SMALL_WINDOW";
       if (og.G.getLayoutParams().width == null || og.G.getLayoutParams().height == null) {
          objArray = new Object[0];
          o.C().t(str2, "PlayerContent error adapt size: "+og.G.getLayoutParams().width+str1+og.G.getLayoutParams().height+str+og.v.getPhotoId()+og.v.getCaption(), objArray);
       }
       g = og.I;
       this.S8(g, g, og.E, og.F, p0, new r(this));
       if (og.I.getLayoutParams().width == null || og.I.getLayoutParams().height == null) {
          objArray = new Object[0];
          o.C().t(str2, "TextureFrame error adapt size: "+og.I.getLayoutParams().width+str1+og.I.getLayoutParams().height+str+og.v.getPhotoId()+og.v.getCaption(), objArray);
       }
       g h = og.H;
       g e g1 = (og.v.isVideoType())? og.G: og.H;
       g1 = this;
       float f1 = p0;
       g1.S8(h, g1, og.E, og.F, f1, new q(this));
       g = og.K;
       g1.V8(g, g, og.E, og.F, f1, new s(this), true);
       g$b d = og.Z.d;
       this.S8(d, d, og.E, og.F, f1, new p(this));
       int i = 8;
       if (!PatchProxy.isSupport(g.class) || (PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, g.class, "8") || (og.X.get().booleanValue() || (og.O != null && q.c(og.v))))) {
          g1 = og.O;
          v1 = f;
          int i2 = (!h)? a1.a(R.color.arg_RES_7f060974): 0;
          g1.setBackgroundColor(i2);
          g1 = og.T;
          i1 = (!h)? 8: 0;
          g1.setVisibility(i1);
       }
    label_018f :
       e e = og.E;
       e f2 = og.F;
       float f3 = 0x3f800000;
       if (!PatchProxy.isSupport(g.class) || !PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(e), Float.valueOf(f2), this, g.class, "9")) {
          RectF rectF = this.X8(og.K);
          ViewGroup$MarginLayoutParams marginLayout = this.b9(og.Q);
          marginLayout.width = (int)rectF.width();
          marginLayout.height = (int)rectF.height();
          marginLayout.leftMargin = (int)rectF.left;
          marginLayout.topMargin = (int)rectF.top;
          og.Q.setLayoutParams(marginLayout);
          og.Q.setPadding(0, 0, 0, og.K.getPaddingBottom());
          g1 = og.Q;
          i1 = (!f)? 8: 0;
          g1.setVisibility(i1);
          rectF = this.X8(og.Q);
          if (!rectF.isEmpty()) {
             og.Q.setPivotY(og.K.getPivotY());
             og.Q.setPivotX(og.K.getPivotX());
             og.Q.setScaleY(og.K.getScaleY());
             og.Q.setScaleX(e9.a(Math.min((this.k9(this.X8(og.G), e, f2, f).width() / rectF.width()), f3)));
             og.Q.setTranslationY(og.K.getTranslationY());
          }
       }
       if (!PatchProxy.isSupport(g.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, g.class, "6")) {
          g1 = og.L;
          if (g1 != null) {
             f4 = (!f)? 0x3f800000: 0;
             g1.setAlpha(f4);
          }
          g1 = og.M;
          if (g1 != null) {
             f4 = (!f)? 0x3f800000: 0;
             g1.setAlpha(f4);
          }
          g1 = og.N;
          if (g1 != null) {
             f4 = (!f)? 0x3f800000: 0;
             g1.setAlpha(f4);
          }
          if (og.M != null) {
             g1.height = og.M.getHeight();
             g1 = og.R;
             i1 = (!f)? 8: og.M.getVisibility();
             g1.setVisibility(i1);
             og.R.setTranslationY(og.M.getTranslationY());
          }else {
             g1.height = 0;
             og.R.setVisibility(i);
          }
          if (og.N != null) {
             g1.height = og.N.getHeight();
             g1 = og.S;
             if (f) {
                i = og.N.getVisibility();
             }
             g1.setVisibility(i);
             og.S.setTranslationY(og.N.getTranslationY());
          }else {
             g1.height = 0;
             og.S.setVisibility(i);
          }
       }
       f3 = f3 - f;
       og.K.setAlpha(f3);
       og.R.setAlpha(f3);
       og.S.setAlpha(f3);
       og.T.setAlpha(f3);
       g1 = og.P;
       if (g1 != null) {
          g1.setAlpha(f3);
       }
       return;
    }
    public boolean Z8(){
       Object obj = PatchProxy.apply(null, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.W.get() != null && this.W.get().booleanValue())? true: false;
       return b;
    }
    public void d9(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, g.class, "14")) {
          return;
       }
       super.d9();
       g tZ = this.Z;
       Objects.requireNonNull(tZ);
       if (!PatchProxy.applyVoid(objArray, tZ, g$b.class, "2")) {
          g$b e = tZ.e;
          if (e != null) {
             e.setOnHierarchyChangeListener(objArray);
          }
          e = tZ.d;
          if (e != null) {
             e.removeOnLayoutChangeListener(tZ);
          }
          tZ.d = objArray;
       }
       this.K.setAlpha(0x3f800000);
       this.c9(this.K);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       d uod = c.a(m1.f(p0, R.id.texture_view_frame));
       this.U = uod;
       this.W7(uod);
       this.H = m1.f(p0, 0x7f0a319f);
       this.I = m1.f(p0, 0x7f0a3e7f);
       this.J = m1.f(p0, 0x7f0a3698);
       this.K = m1.f(p0, 0x7f0a3a43);
       this.L = m1.f(p0, 0x7f0a400c);
       this.M = m1.f(p0, 0x7f0a04db);
       this.N = m1.f(p0, 0x7f0a04e1);
       View view = m1.f(p0, R.id.anim_content_view_stub).inflate();
       this.Q = m1.f(view, 0x7f0a0210);
       this.R = m1.f(view, 0x7f0a020e);
       this.S = m1.f(view, 0x7f0a020f);
       this.T = m1.f(view, 0x7f0a0213);
       TextView textView = m1.f(p0, R.id.hdr_view);
       this.P = textView;
       if (textView != null) {
          textView.getPaint().setFakeBoldText(true);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       super.j8();
       this.V = this.s8(PhotoDisplayLocationInfo.class);
       this.W = this.x8("DETAIL_LYRIC_EXPAND_STATUS");
       this.X = this.x8("SLIDE_PLAY_CLOSE_STATE");
       this.Y = this.r8("DETAIL_FOLD_SCREEN_CHANGE_OBSERVABLE");
       return;
    }
    public final void j9(View p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "7")) {
          return;
       }
       if (p0 != null && p1 != null) {
          Drawable background = p0.getBackground();
          if (background != null && background.getConstantState() != null) {
             p1.setBackground(background.getConstantState().newDrawable().mutate());
          }
       }
       return;
    }
    public final RectF k9(RectF p0,float p1,float p2,float p3){
       RectF obj;
       if (PatchProxy.isSupport(g.class)) {
          obj = PatchProxy.applyFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, g.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = g.V0;
       obj.setEmpty();
       g tV = this.V;
       PhotoDisplayLocationInfo mWidthRatio = tV.mWidthRatio;
       float f = p1 / mWidthRatio;
       float f1 = p2 / tV.mHeightRatio;
       float f2 = 0x3f800000;
       if (((mWidthRatio * p0.width()) / (this.V.mHeightRatio * p0.height())) - (p1 / p2) > 0) {
          obj.left = (p0.left * (f2 - p3)) + ((- (this.V.mLeftRatio * f)) * p3);
          p1 = (float)(int)(p0.height() * (f / p0.width()));
          g tV1 = this.V;
          RectF top = p0.top;
          obj.top = top - (((float)(int)((tV1.mTopRatio * p1) - ((p2 - (tV1.mHeightRatio * p1)) / 2.00f)) + top) * p3);
          obj.right = obj.left + (p0.width() - ((p0.width() - f) * p3));
          obj.bottom = obj.top + (p0.height() / (p0.width() / obj.width()));
       }else {
          float f3 = (p0.top * (f2 - p3)) + ((- (this.V.mTopRatio * f1)) * p3);
          obj.top = f3;
          obj.bottom = (f3 + p0.height()) - ((p0.height() - f1) * p3);
          float f4 = (float)(int)(p0.width() / (p0.height() / obj.height()));
          p1 = (p1 - f4) / 2.00f;
          obj.left = p1;
          obj.right = p1 + f4;
       }
       return obj;
    }
}
