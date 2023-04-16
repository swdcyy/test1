package com.yxcorp.gifshow.activity.share.presenter.p1;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import android.app.Activity;
import android.view.ViewGroup;
import com.yxcorp.gifshow.activity.share.player.PreviewPlayer;
import xw8.p0;
import android.widget.EditText;
import java.lang.Object;
import lnc.a1;
import java.util.ArrayList;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import crd.a;
import jn6.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f66.i;
import jq.a;
import q87.c;
import android.view.View;
import android.view.ViewTreeObserver;
import zw8.l3;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import zw8.m3;
import com.kwai.video.editorsdk2.PreviewEventListenerV2;
import android.animation.ValueAnimator;
import android.widget.ImageView;
import com.yxcorp.gifshow.activity.share.presenter.p1$a;
import android.animation.Animator$AnimatorListener;
import android.content.Context;
import androidx.core.content.ContextCompat;
import zf6.k;
import tkd.b;
import tkd.d;
import pca.d0;
import java.lang.StringBuilder;
import java.lang.Exception;
import zw8.a3;
import ix8.a;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.lang.Float;
import com.yxcorp.utility.n;
import java.lang.Math;
import android.graphics.drawable.Drawable;
import java.lang.Integer;
import java.lang.Boolean;
import ekd.i;
import com.yxcorp.utility.RomUtils;
import ln6.a;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import ln6.b;
import com.yxcorp.gifshow.activity.share.player.a;
import android.graphics.Bitmap;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import java.util.concurrent.Callable;
import zw8.i3;
import brd.a0;
import t45.d;
import brd.z;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.activity.share.presenter.o1;
import brd.e0;
import zw8.e3;
import zw8.d3;
import erd.g;
import crd.b;
import android.widget.ImageView$ScaleType;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.Workspace$Source;
import wba.p0;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import java.io.File;
import voc.t;
import android.graphics.drawable.BitmapDrawable;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.util.List;
import java.util.Iterator;
import com.kuaishou.edit.draft.AssetSegment;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Pair;
import gx8.b;
import android.graphics.Rect;
import java.lang.NullPointerException;
import java.lang.Number;
import zw8.f3;
import zw8.g3;
import com.yxcorp.gifshow.widget.SafeKwaiImageView;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import zw8.h3;
import java.lang.RuntimeException;
import com.yxcorp.gifshow.activity.share.presenter.p1$b;
import android.view.ViewOutlineProvider;
import zw8.j3;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.image.KwaiImageView;

public class p1	// class@001421
{
    public c A;
    public List B;
    public boolean C;
    public boolean D;
    public boolean E;
    public a F;
    public int G;
    public int H;
    public float a;
    public float b;
    public float c;
    public ValueAnimator d;
    public ValueAnimator e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public b n;
    public ImageView o;
    public InteractStickerInfo p;
    public Activity q;
    public ViewGroup r;
    public PreviewPlayer s;
    public p0 t;
    public EditText u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public float z;

    public void p1(c p0,Activity p1,ViewGroup p2,PreviewPlayer p3,p0 p4,EditText p5,boolean p6,boolean p7,boolean p8){
       super();
       this.a = 0;
       this.b = 0;
       this.c = 0x3f800000;
       this.h = (float)a1.e((float)a1.d(0x7f070429));
       this.i = 0x3f800000;
       this.B = new ArrayList();
       this.C = true;
       this.D = false;
       this.E = PostExperimentUtils.L();
       this.F = new a();
       this.G = -1;
       this.H = -1;
       this.A = p0;
       this.q = p1;
       this.r = p2;
       this.s = p3;
       this.t = p4;
       this.u = p5;
       this.y = p6;
       this.w = p7;
       this.x = p8;
    }
    public void a(b p0){
       Object[] objArray2;
       p1 op1 = p1.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, op1, "8")) {
          return;
       }
       String str = "SharePreviewAnimation";
       int i = 0;
       if (p0 == null) {
          Object[] objArray = new Object[i];
          a.b().t(str, "addInteractStickerView null", objArray);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          a.b().s(str, "addInteractStickerView", objArray1);
          this.n = p0;
          this.r.addView(p0.getView());
          if (!PatchProxy.applyVoid(null, this, op1, "10")) {
             if (this.p == null) {
                objArray2 = new Object[i];
                a.b().w(str, "translateInteractStickerView interactStickerInfo is null", objArray2);
             }else {
                p1 tn = this.n;
                if (tn == null) {
                   objArray2 = new Object[i];
                   a.b().w(str, "translateInteractStickerView interactStickerView is null", objArray2);
                }else {
                   tn.getView().getViewTreeObserver().addOnGlobalLayoutListener(new l3(this));
                }
             }
          }
          if (this.y != null) {
             this.n.getView().setVisibility(4);
             VideoSDKPlayerView videoSDKPlay = this.s.b();
             if (!PatchProxy.applyVoidOneRefs(videoSDKPlay, this, op1, "11")) {
                videoSDKPlay.setPreviewEventListener("SharePreviewPresenter", new m3(this));
             }
          }else {
             this.n.getView().setVisibility(i);
          }
          return;
       }
    }
    public final void b(){
       int i;
       if (PatchProxy.applyVoid(null, this, p1.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().w("SharePreviewAnimation", "animHidePreview", objArray);
       try{
          i = 0x66204fb9;
          if (this.C != null) {
             this.c();
             p1 te = this.e;
             if (te != null) {
                te.removeAllListeners();
                this.o.setVisibility(0);
                this.n();
                this.e.addListener(new p1$a(this));
                te = this.s;
                if (te != null) {
                   te.g(this.v);
                }
                this.e.start();
                te = this.s;
                if (te != null && te.b() instanceof VideoSDKPlayerView) {
                   this.s.b().pause();
                }
             }else {
                int color = ContextCompat.getColor(this.q, R.color.arg_RES_7f06008d);
                boolean b = (!k.d())? true: false;
                this.e(color, b);
             }
          }else {
             this.g();
             d.a(i).resumeAll();
          }
       }catch(java.lang.Exception e2){
          Object[] objArray1 = new Object[0];
          a.b().t("SharePreviewAnimation", "exit animation has exception : "+e2.getMessage(), objArray1);
          this.C = false;
          this.g();
          d.a(i).resumeAll();
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, p1.class, "1")) {
          return;
       }
       if (this.d != null) {
          return;
       }
       a3 uoa3 = new a3(this);
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0x42c80000,0});
       this.d = valueAnimato;
       valueAnimato.setInterpolator(a.b());
       this.d.setDuration(300);
       this.d.addUpdateListener(uoa3);
       ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(new float[2]{0,0x42c80000});
       this.e = valueAnimato1;
       valueAnimato1.setInterpolator(a.b());
       this.e.setDuration(250);
       this.e.addUpdateListener(uoa3);
       return;
    }
    public void d(float p0){
       p1 op1 = p1.class;
       if (PatchProxy.isSupport(op1) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, op1, "28")) {
          return;
       }
       float f = 0x3f800000 - (((Math.abs(p0) * 2.00f) / (float)n.j(this.q)) * 0x3f333333);
       this.r.getBackground().mutate().setAlpha((int)Math.ceil((double)(0x437f0000 * f)));
       this.i = f;
       return;
    }
    public void e(int p0,boolean p1){
       int i;
       p1 op1 = p1.class;
       if (PatchProxy.isSupport(op1) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, op1, "14")) {
          return;
       }
       if (i.e(this.q) && RomUtils.o()) {
          i = 0x1020002;
          if (p1) {
             this.q.findViewById(i).setPadding(0, n.A(this.q), 0, 0);
          }else {
             this.q.findViewById(i).setPadding(0, 0, 0, 0);
             p0 = 0;
          }
       }
       i.h(this.q, p0, p1);
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, p1.class, "33")) {
          return;
       }
       if (this.s == null) {
          return;
       }
       this.x();
       this.o.setVisibility(4);
       this.r.getBackground().mutate().setAlpha(255);
       if (this.p != null && this.n == null) {
          this.a(d.a(-863649994).b00(this.q, this.p.getType(), this.p));
       }
       this.e(0xff000000, false);
       this.r.setVisibility(false);
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, p1.class, "34")) {
          return;
       }
       this.r.setVisibility(4);
       p1 ts = this.s;
       if (ts instanceof a) {
          ts.j();
       }
       ts = this.s;
       boolean b = true;
       if (ts != null) {
          ts.e(b);
       }
       this.e(ContextCompat.getColor(this.q, R.color.arg_RES_7f06008d), (b ^ k.d()));
       this.a = 0;
       this.b = 0;
       this.c = 0x3f800000;
       this.i = 0x3f800000;
       return;
    }
    public final void h(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p1.class, "22")) {
          return;
       }
       p1 ts = this.s;
       int i = 0;
       if (ts == null || ts.b() == null) {
          Object[] objArray = new Object[i];
          a.b().w("SharePreviewAnimation", "fillDragBitmap: mPreviewPlayer is not initialized", objArray);
          return;
       }else if(p0 == null || p0.isRecycled()){
          p0 = this.k();
       }
       this.j(p0);
    }
    public final void i(Bitmap p0,Callable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p1.class, "24")) {
          return;
       }
       Object[] objArray = new Object[0];
       String str = "SharePreviewAnimation";
       a.b().w(str, "fillDragBitmapObservable", objArray);
       int i = this.l();
       int i1 = this.m();
       Object[] objArray1 = new Object[0];
       a.b().w(str, "fillDragBitmapObservable£º maxHeight:"+i+" maxWidth:"+i1, objArray1);
       if (i <= 0 || i1 <= 0) {
          this.C = false;
          return;
       }else {
          b uob = a0.y(new i3(this, p0)).T(d.c).W(500, TimeUnit.MILLISECONDS, a0.y(o1.b)).G(d.a).R(new e3(this, p1), new d3(this));
          if (!PatchProxy.applyVoidOneRefs(uob, this, p1.class, "35")) {
             if (this.F.isDisposed()) {
                this.F = new a();
             }
             this.F.c(uob);
          }
          return;
       }
    }
    public final void j(Bitmap p0){
       Object[] obj;
       boolean b;
       p1 op1 = p1.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, op1, "23")) {
          return;
       }
       int i = 0;
       if (p0 != null && !p0.isRecycled()) {
          this.o.setScaleType(ImageView$ScaleType.CENTER_CROP);
          float f = (float)this.m();
          this.l = f;
          f = (float)(int)((f / (float)p0.getWidth()) * (float)p0.getHeight());
          this.m = f;
          if (f - (float)this.l() > 0) {
             obj = PatchProxy.apply(null, this, op1, "26");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                op1 = this.A;
                if (op1 != null && (!p0.a(op1.T0()) && (DraftUtils.M(this.A) || this.A.a1() == Workspace$Type.KUAISHAN))) {
                   i = 1;
                }
                b = i;
             }
             if (!b) {
                float f1 = (float)this.l();
                this.m = f1;
                this.l = (float)(int)((f1 / (float)p0.getHeight()) * (float)p0.getWidth());
             }
          }
          this.o.setImageBitmap(p0);
          this.C = true;
       }else {
          obj = new Object[i];
          a.b().w("SharePreviewAnimation", "fillDragPictureView : bitmap is null", obj);
          this.C = i;
       }
       return;
    }
    public final Bitmap k(){
       Bitmap uBitmap;
       Bitmap uBitmap2;
       Pair first;
       p1 v1;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p1 op1 = p1.class;
       Object[] objArray = null;
       p1 obj1 = PatchProxy.apply(objArray, obj, op1, "25");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = obj.s;
       String str = "_";
       String str1 = "SharePreviewAnimation";
       int b = false;
       if (obj1 != null && obj1.b() instanceof VideoSDKPlayerView) {
          uBitmap = obj.s.b().dumpNextFrame();
          if (uBitmap == null) {
             String coverPath = obj.s.b().getCoverPath();
             if (coverPath == null && obj.A != null) {
                File uFile = DraftFileManager.E().u(obj.A);
                if (uFile != null) {
                   coverPath = uFile.getAbsolutePath();
                }
             }
             BitmapDrawable uBitmapDrawa = t.a().b(coverPath+str+str1+this.hashCode());
             if (uBitmapDrawa != null) {
                uBitmap = uBitmapDrawa.getBitmap();
             }
             if (uBitmap == null) {
                uBitmap = BitmapUtil.t(coverPath, (this.m() / 2), (this.l() / 2), b);
                t.a().c(coverPath+str+str1+this.hashCode(), uBitmap);
             }
          }
       }else {
          obj1 = obj.B;
          if (obj1 == null || obj1.isEmpty()) {
             Object[] objArray1 = new Object[0];
             a.b().w(str1, "getDragBitmap mPicturesList is empty", objArray1);
             return objArray;
          }else {
             StringBuilder str2 = PatchProxy.apply(objArray, obj, op1, "37");
             if (str2 != patchProxyRe) {
             }else {
                str2 = "";
                Iterator iterator1 = obj.B.iterator();
                while (iterator1.hasNext()) {
                   AssetSegment uAssetSegmen = iterator1.next();
                   str2 = str2+uAssetSegmen.getFile()+str+uAssetSegmen.getCropFile();
                }
                str2 = str2+str+str1+this.hashCode();
             }
             if (obj.w != null) {
                BitmapDrawable uBitmapDrawa1 = t.a().b(str2);
                Bitmap bitmap = (uBitmapDrawa1 != null)? uBitmapDrawa1.getBitmap(): objArray;
                if (bitmap == null) {
                   Bitmap uBitmap1 = PatchProxy.apply(objArray, obj, op1, "29");
                   if (uBitmap1 != patchProxyRe) {
                   }else if(!obj.B.isEmpty()){
                      int i = this.m() / 2;
                      int i1 = this.l() / 2;
                      uBitmap2 = Bitmap.createBitmap(i, i1, Bitmap$Config.ARGB_8888);
                      Canvas uCanvas = new Canvas(uBitmap2);
                      Paint paint = new Paint();
                      ArrayList uArrayList = new ArrayList();
                      int i2 = 0;
                      int i3 = 0;
                      while (i3 < obj.B.size() && i2 < i1) {
                         int i5 = this.m() / 2;
                         int i6 = this.l() / 2;
                         b = i2;
                         first = b.a(obj.A, obj.B.get(i3), i5, i6, obj.x, i3);
                         if (first != null) {
                            Pair first1 = first.first;
                            if (first1 != null) {
                               float f1 = (float)i / (float)first1.getWidth();
                               f1 = f1 * (float)first1.getHeight();
                               uArrayList.add(first);
                               i2 = b + (int)f1;
                            label_019b :
                               i3 = i3 + 1;
                               b = 0;
                            }
                         }
                         i2 = b;
                         goto label_019b ;
                      }
                      b = i2;
                      i1 = (b < i1)? (i1 - b) / 2: 0;
                      Iterator iterator = uArrayList.iterator();
                      while (iterator.hasNext()) {
                         Pair pair = iterator.next();
                         first = pair.first;
                         float f = (float)i / (float)first.getWidth();
                         f = f * (float)first.getHeight();
                         int i4 = (int)f + i1;
                         uCanvas.drawBitmap(first, new Rect(0, 0, first.getWidth(), first.getHeight()), new Rect(0, i1, i, i4), paint);
                         if (!pair.second.booleanValue()) {
                            first.recycle();
                         }
                         i1 = i4;
                      }
                      uBitmap1 = uBitmap2;
                   }else {
                      throw new NullPointerException("long picture is null");
                   }
                   t.a().c(str2, uBitmap1);
                   uBitmap = uBitmap1;
                }else {
                   uBitmap = bitmap;
                }
                if (uBitmap != null) {
                   obj.l = (float)this.m();
                   obj.m = (float)this.l();
                }
             }else {
                p1 v = obj.v;
                b = (v < null || v >= obj.B.size())? 0: obj.v;
                BitmapDrawable uBitmapDrawa2 = t.a().b(str2+b);
                if (uBitmapDrawa2 != null) {
                   uBitmap2 = uBitmapDrawa2.getBitmap();
                }
                if (uBitmap2 == null) {
                   Pair pair1 = b.a(obj.A, obj.B.get(b), (this.m() / 2), (this.l() / 2), obj.x, b);
                   if (pair1 != null) {
                      pair1 = pair1.first;
                      if (pair1 != null) {
                         t.a().c(str2+b, pair1);
                      }
                   }
                }
                uBitmap = uBitmap2;
             }
          }
       }
       return uBitmap;
    }
    public final int l(){
       p1 obj = PatchProxy.apply(null, this, p1.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.H;
       if (obj > null) {
          return obj;
       }
       int i = n.j(this.q) - n.A(this.q);
       this.H = i;
       return i;
    }
    public final int m(){
       p1 obj = PatchProxy.apply(null, this, p1.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.G;
       if (obj > null) {
          return obj;
       }
       int i = n.k(this.q);
       this.G = i;
       return i;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, p1.class, "17")) {
          return;
       }
       p1 ts = this.s;
       if (ts != null && ts.b() != null) {
          this.s.b().setVisibility(4);
       }
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, p1.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().w("SharePreviewAnimation", "hidePreviewIfNeeded", objArray);
       if (this.r.getVisibility()) {
          return;
       }
       p1 te = this.e;
       if (te == null || !te.isRunning()) {
          te = this.s;
          if (te != null && te.b() instanceof VideoSDKPlayerView) {
             if (this.E != null) {
                this.i(null, new f3(this));
                return;
             }else {
                this.h(null);
             }
          }else if(this.w != null){
             te = this.B;
             if (te != null && !te.isEmpty()) {
                this.i(null, new g3(this));
                return;
             }
          }
          this.b();
       }
       return;
    }
    public final void p(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p1.class, "21")) {
          return;
       }
       if (this.o != null) {
          return;
       }
       SafeKwaiImageView safeKwaiImag = new SafeKwaiImageView(this.q);
       this.o = safeKwaiImag;
       safeKwaiImag.setClipToOutline(true);
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -2);
       this.o.setScaleType(ImageView$ScaleType.CENTER_CROP);
       layoutParams.gravity = 17;
       this.o.setMaxHeight((n.j(this.q) - n.A(this.q)));
       this.r.addView(this.o, layoutParams);
       if (this.E != null) {
          this.i(p0, new h3(this));
       }else {
          this.h(p0);
          this.o.setVisibility(4);
       }
       return;
    }
    public void q(){
       p1 op1 = p1.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, op1, "9")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.b().s("SharePreviewAnimation", "removeInteractStickerView", objArray1);
       p1 tn = this.n;
       if (tn != null) {
          tn.getView().setVisibility(8);
          this.r.removeView(this.n.getView());
          this.n = objArray;
       }
       if (this.y != null) {
          tn = this.s;
          if (tn == null) {
             PostUtils.D("SharePreviewAnimation", "removeInteractStickerView", new RuntimeException("mPreviewPlayer is null"));
             return;
          }else {
             VideoSDKPlayerView videoSDKPlay = tn.b();
             if (!PatchProxy.applyVoidOneRefs(videoSDKPlay, this, op1, "12")) {
                videoSDKPlay.setPreviewEventListener("SharePreviewPresenter", objArray);
             }
          }
       }
       return;
    }
    public final void r(float p0,float p1,float p2){
       if (PatchProxy.isSupport(p1.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, p1.class, "27")) {
          return;
       }
       p1 to = this.o;
       if (to == null) {
          return;
       }
       FrameLayout$LayoutParams layoutParams = to.getLayoutParams();
       layoutParams.width = (int)p0;
       layoutParams.height = (int)p1;
       this.o.setScaleType(ImageView$ScaleType.CENTER_CROP);
       this.o.setLayoutParams(layoutParams);
       Object[] objArray = new Object[0];
       a.b().w("SharePreviewAnimation", "resizeDragView: mDragPictureView.width = "+this.o.getWidth()+", mDragPictureView.height = "+this.o.getHeight(), objArray);
       this.o.setOutlineProvider(new p1$b(this, p2));
       return;
    }
    public void s(float p0){
       p1 op1 = p1.class;
       if (PatchProxy.isSupport(op1) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, op1, "3")) {
          return;
       }
       float f = (float)a1.h();
       float f1 = (float)(n.j(this.q) - n.A(this.q));
       float f2 = f / f1;
       Object[] objArray = new Object[0];
       a.b().s("SharePreviewAnimation", "setCoverSize ratio: "+p0+" screen ratio: "+f2, objArray);
       if (f2 - p0 > 0) {
          f = f1 * p0;
       }else {
          f1 = f / p0;
       }
       Object[] objArray1 = new Object[0];
       a.b().s("SharePreviewAnimation", "setCoverSize w: "+f+" h: "+f1, objArray1);
       return;
    }
    public void t(View p0,ViewGroup p1,Bitmap p2,Callable p3){
       Object[] objArray1;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, p1.class, "7")) {
          return;
       }
       if (p0 != null) {
          p1 ts = this.s;
          if (ts != null && ts.b() != null) {
             Object[] objArray = new Object[0];
             a.b().w("SharePreviewAnimation", "setCurrentThumbnailView: ", objArray);
             Rect rect = new Rect();
             p0.getDrawingRect(rect);
             p1.offsetDescendantRectToMyCoords(p0, rect);
             this.j = (float)rect.width();
             this.k = (float)rect.height();
             Rect rect1 = new Rect(0, n.A(this.q), p1.getMeasuredWidth(), p1.getMeasuredHeight());
             float f = rect.exactCenterX() - rect1.exactCenterX();
             float f1 = rect.exactCenterY() - rect1.exactCenterY();
             if (this.g - f1 || this.f - f) {
                this.f = f;
                this.g = f1;
             }
             this.p(p2);
             if (this.E != null) {
                objArray1 = new Object[0];
                a.b().w("SharePreviewAnimation", "fillDragBitmapObservable: ", objArray1);
                this.i(p2, new j3(this, p3));
             }else {
                objArray1 = new Object[0];
                a.b().w("SharePreviewAnimation", "fillDragBitmap: ", objArray1);
                this.h(p2);
                this.r(this.j, this.k, this.h);
                this.o.setTranslationX(this.f);
                this.o.setTranslationY(this.g);
                if (p3 != null) {
                   p3.call();
                   Object[] objArray2 = new Object[0];
                   a.b().w("SharePreviewAnimation", "callable called : mDragPictureView: x = "+this.f+", y = "+this.g+", width = "+this.o.getWidth()+", height = "+this.o.getHeight(), objArray2);
                }
             }
          }
       }
       return;
    }
    public void u(InteractStickerInfo p0){
       this.p = p0;
    }
    public void v(int p0){
       this.v = p0;
    }
    public void w(float p0){
       this.z = p0;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, p1.class, "18")) {
          return;
       }
       p1 ts = this.s;
       if (ts != null && ts.b() != null) {
          View view = this.s.b();
          view.setVisibility(0);
          if (view instanceof VideoSDKPlayerView && (TextUtils.x(view.getCoverPath()) && this.C != null)) {
             view.getCoverView().setVisibility(4);
          }
       }
    label_003d :
       return;
    }
}
