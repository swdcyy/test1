package com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView;
import twa.e;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView$f;
import nsd.u;
import com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView$a;
import com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView$b;
import com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView$c;
import com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView$d;
import com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView$e;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Path;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.animation.Animator;
import lnc.a1;
import android.widget.TextView;
import android.graphics.Typeface;
import android.widget.ImageView;
import java.lang.Integer;
import kotlin.Pair;
import java.lang.Float;
import java.util.Iterator;
import twa.b;
import android.graphics.Canvas;
import j06.b;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Path$Direction;
import iy5.d;
import java.lang.Throwable;
import q87.c;
import qrd.l1;
import android.view.ViewGroup;
import rwa.a;
import com.kwai.robust.PatchProxyResult;
import twa.c;
import java.util.Objects;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.lang.Number;
import android.text.Layout;
import usd.q;
import android.content.res.Configuration;
import android.view.View;
import com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView$g;
import java.lang.Runnable;
import com.yxcorp.gifshow.image.KwaiImageView;
import j06.a;
import java.lang.Math;
import com.kwai.feature.component.model.SearchHotWordItemExt;
import com.yxcorp.utility.TextUtils;
import android.view.ViewGroup$LayoutParams;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import android.net.Uri;
import com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView$h;
import ub.b;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.StringBuilder;
import java.lang.Boolean;
import com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView$changeStateTemporary$runBlock$1;
import msd.p;
import android.animation.ValueAnimator;
import vy5.a;
import vy5.b;
import com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView$changeState$runBlock$1;
import com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView$changeState$alphaBlock$1;
import msd.l;
import android.view.animation.PathInterpolator;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import uwa.b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import uwa.c;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorSet;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView$setHotWordState$1;
import twa.f;
import com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView$i;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.hotword_v2.widget.SearchBubbleView$j;

public final class SearchBubbleView extends FrameLayout implements e	// class@001911
{
    public View b;
    public TextView c;
    public View d;
    public ImageView e;
    public KwaiImageView f;
    public a g;
    public final ArrayList h;
    public Animator i;
    public final GradientDrawable j;
    public final Path k;
    public int l;
    public HashMap m;
    public static final d n;
    public static final d o;
    public static final d p;
    public static final d q;
    public static final d r;
    public static final SearchBubbleView$f s;

    static {
       SearchBubbleView.s = new SearchBubbleView$f(null);
       SearchBubbleView.n = new SearchBubbleView$a();
       SearchBubbleView.o = new SearchBubbleView$b();
       SearchBubbleView.p = new SearchBubbleView$c();
       SearchBubbleView.q = new SearchBubbleView$d();
       SearchBubbleView.r = new SearchBubbleView$e();
    }
    public void SearchBubbleView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0);
       this.h = new ArrayList();
       this.j = new GradientDrawable();
       this.k = new Path();
       this.l = 15;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, SearchBubbleView.class, "8")) {
          return;
       }
       SearchBubbleView ti = this.i;
       if (ti != null) {
          ti.cancel();
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, SearchBubbleView.class, "2")) {
          return;
       }
       SearchBubbleView tc = this.c;
       if (tc != null) {
          tc.setTextColor(a1.a(R.color.arg_RES_7f060801));
       }
       tc = this.c;
       if (tc != null) {
          tc.setTypeface(Typeface.DEFAULT_BOLD);
       }
       tc = this.e;
       if (tc != null) {
          tc.setColorFilter(a1.a(R.color.arg_RES_7f060649));
       }
       return;
    }
    public final void c(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(SearchBubbleView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, SearchBubbleView.class, "14")) {
          return;
       }
       this.j.setBounds(p0, p1, p2, p3);
       this.invalidate();
       return;
    }
    public void d(Pair p0,float p1){
       if (PatchProxy.isSupport(SearchBubbleView.class) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, SearchBubbleView.class, "17")) {
          return;
       }
       a.p(p0, "states");
       Iterator iterator = this.h.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1);
       }
       return;
    }
    public void dispatchDraw(Canvas p0){
       l1 a;
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchBubbleView.class, "6")) {
          return;
       }
       if (p0 != null) {
          try{
             this.j.draw(p0);
             this.k.reset();
             Rect bounds = this.j.getBounds();
             a.o(bounds, "mBackGround.bounds");
             RectF rectF = new RectF(bounds);
             this.k.addRoundRect(rectF, (float)b.a0, (float)b.a0, Path$Direction.CCW);
             p0.clipPath(this.k);
          }catch(java.lang.Exception e0){
             Object[] objArray = new Object[0];
             d.C().u("SearchBubbleView", e0, objArray);
             a = l1.a;
          }
       }
    }
    public void e(int p0){
       this.l = p0;
    }
    public void f(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchBubbleView.class, "19")) {
          return;
       }
       a.p(p0, "listener");
       this.h.remove(p0);
       return;
    }
    public void g(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchBubbleView.class, "18")) {
          return;
       }
       a.p(p0, "listener");
       this.h.add(p0);
       return;
    }
    public a getCurrentHotWordState(){
       return this.g;
    }
    public String getShowText(){
       CharSequence text;
       int ellipsisCoun;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, SearchBubbleView.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = c.a;
       SearchBubbleView tc = this.c;
       Objects.requireNonNull(obj);
       String str = PatchProxy.applyOneRefs(tc, obj, c.class, "7");
       if (str != patchProxyRe) {
       }else if(tc != null){
          text = tc.getText();
       }else {
          text = objArray;
       }
       String str1 = String.valueOf(text);
       Integer integer = Integer.valueOf(StringsKt__StringsKt.i3(str1, "¡­", 0, false, 6, null));
       int i = (integer.intValue() > 0)? 1: 0;
       if (i) {
          objArray = integer;
       }
       int i1 = (objArray != null)? objArray.intValue(): str1.length();
       if (tc != null) {
          Layout layout = tc.getLayout();
          if (layout != null) {
             ellipsisCoun = layout.getEllipsisCount(0);
          label_0065 :
             if (ellipsisCoun) {
                i1 = str1.length() - ellipsisCoun;
             }
             str = str1.substring(0, q.n(i1, 0));
             a.o(str, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
          }
       }
       ellipsisCoun = 0;
       goto label_0065 ;
       return str;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchBubbleView.class, "4")) {
          return;
       }
       super.onConfigurationChanged(p0);
       this.post(new SearchBubbleView$g(this));
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, SearchBubbleView.class, "7")) {
          return;
       }
       super.onDetachedFromWindow();
       SearchBubbleView ti = this.i;
       if (ti != null) {
          ti.cancel();
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, SearchBubbleView.class, "3")) {
          return;
       }
       super.onFinishInflate();
       this.b = this.findViewById(0x7f0a0e00);
       this.c = this.findViewById(0x7f0a0dfc);
       this.d = this.findViewById(0x7f0a0dfd);
       this.e = this.findViewById(0x7f0a0dfe);
       this.f = this.findViewById(0x7f0a0e05);
       return;
    }
    public final void setBackGroundStyle(float p0){
       int i1;
       if (PatchProxy.isSupport(SearchBubbleView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SearchBubbleView.class, "1")) {
          return;
       }
       this.j.setDither(true);
       int i = a1.a(R.color.arg_RES_7f060200);
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Integer.valueOf(i), null, uoa, "6");
          if (obj != PatchProxyResult.class) {
             i1 = obj.intValue();
          label_005d :
             this.j.setColor(i1);
             this.j.setCornerRadius((float)b.a0);
             this.j.setStroke(a1.e(0x3f000000), a1.a(R.color.arg_RES_7f060621));
             return;
          }
       }
       i1 = (Math.min(255, Math.max(0, (int)(p0 * 0x437f0000))) << 24) + (i & 0xffffff);
       goto label_005d ;
    }
    public final void setBubbleIcon(SearchHotWordItemExt p0){
       c a;
       char c;
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchBubbleView.class, "12")) {
          return;
       }
       SearchBubbleView tf = this.f;
       if (tf != null) {
          tf.setVisibility(8);
       }
       if (p0 != null) {
          int i = 1;
          CharSequence[] uCharSequenc = new CharSequence[i];
          int i1 = 0;
          uCharSequenc[i1] = p0.mIconUrl;
          if (!TextUtils.y(uCharSequenc)) {
             SearchHotWordItemExt mIconWidth = p0.mIconWidth;
             if (mIconWidth > null && mIconWidth <= 90) {
                SearchBubbleView tf1 = this.f;
                if (tf1 != null) {
                   ViewGroup$LayoutParams layoutParams = tf1.getLayoutParams();
                   if (layoutParams != null) {
                      layoutParams.width = p0.mIconWidth;
                   }
                }
                d uod = Fresco.newDraweeControllerBuilder().D(Uri.parse(p0.mIconUrl));
                uod.s(new SearchBubbleView$h(this));
                uod.q(i);
                AbstractDraweeController uAbstractDra = uod.e();
                a.o(uAbstractDra, "Fresco.newDraweeControll¡­ns\(true\)\n        .build\(\)");
                tf = this.f;
                if (tf != null) {
                   tf.setController(uAbstractDra);
                }
                SearchBubbleView tf2 = this.f;
                if (tf2 != null) {
                   tf2.setVisibility(i1);
                }
                tf2 = this.f;
                if (tf2 != null) {
                   tf2.requestLayout();
                }
                return;
             }
          }
       }
       a = c.a;
       c = ',';
       StringBuilder str = "setBubbleIcon,itemExt="+p0+c+"iconUrl=";
       Integer integer = null;
       SearchHotWordItemExt mIconUrl = (p0 != null)? p0.mIconUrl: integer;
       str = str+mIconUrl+c+"iconWidth=";
       if (p0 != null) {
          integer = Integer.valueOf(p0.mIconWidth);
       }
       a.j("SearchBubbleView", str+integer);
       return;
    }
    public void setHotWordState(a p0){
       boolean b;
       Pair pair;
       float[] uofloatArray;
       a a;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, SearchBubbleView.class, "9")) {
          return;
       }
       a.p(obj1, "newState");
       SearchBubbleView g = obj.g;
       Objects.requireNonNull(p0);
       float[] obj2 = PatchProxy.applyOneRefs(g, obj1, a.class, "3");
       float f = 0.00f;
       int i = 2;
       if (obj2 != PatchProxyResult.class) {
          b = obj2.booleanValue();
       }else if(g == null){
          if (obj1.a == i) {
          label_0036 :
             b = true;
          }
       }else if(a.g(obj1, g)){
          a = g.a;
          if (a != null) {
             if (a != 1) {
                if (a != i) {
                   if (a == f) {
                      a = obj1.a;
                      if (a == null || a == 1) {
                         goto label_0036 ;
                      }
                   }
                }else {
                   a = obj1.a;
                   if (a == null || a == 1) {
                      goto label_0036 ;
                   }
                }
             }else {
                a = obj1.a;
                if (a == null || a == f) {
                   goto label_0036 ;
                }
             }
          }else if(obj1.a == i){
             goto label_0036 ;
          }
       }
       b = false;
       if (b) {
          float f1 = 0x3f800000;
          float f2 = 0;
          if (p0.e() & 1) {
             pair = new Pair(obj.g, obj1);
             if (!PatchProxy.applyVoidOneRefs(pair, obj, SearchBubbleView.class, "13")) {
                g = (pair.getSecond().e() == f)? 1: null;
                if (g) {
                   f1 = 0;
                }
                f = (float)1 - f1;
                f2 = (g)? 0: 8;
                g = obj.i;
                if (g != null) {
                   g.cancel();
                }
                obj.setVisibility(0);
                obj.setAlpha(f1);
                SearchBubbleView$changeStateTemporary$runBlock$1 uochangeStat = new SearchBubbleView$changeStateTemporary$runBlock$1(obj);
                if (!pair.getSecond().f()) {
                   c.a.m(0x3f800000, f2, uochangeStat, this, pair);
                }else {
                   uofloatArray = new float[i];
                   uofloatArray[0] = f1;
                   uofloatArray[1] = f;
                   ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
                   valueAnimato.setDuration(200);
                   c.a.n(valueAnimato, 0x3f800000, f2, uochangeStat, this, pair);
                   valueAnimato.start();
                   obj.i = valueAnimato;
                }
             }
          }else {
             pair = new Pair(obj.g, obj1);
             if (!PatchProxy.applyVoidOneRefs(pair, obj, SearchBubbleView.class, "11")) {
                boolean b1 = (pair.getSecond().e() == i)? true: false;
                if (b1) {
                   g = obj.c;
                   if (g != null) {
                      a.g(g, pair.getSecond().c().mHotWord, obj.l, 0);
                   }
                   obj.setBubbleIcon(pair.getSecond().c().mItemExt);
                }
                float f3 = (b1)? 0: 0x3f800000;
                f = f1 - f3;
                SearchBubbleView$changeState$runBlock$1 uochangeStat1 = new SearchBubbleView$changeState$runBlock$1(obj);
                float f4 = (b1)? 0: 0x3f800000;
                float f5 = f1 - f4;
                SearchBubbleView$changeState$alphaBlock$1 uochangeStat2 = new SearchBubbleView$changeState$alphaBlock$1(obj);
                SearchBubbleView i1 = obj.i;
                if (i1 != null) {
                   i1.cancel();
                }
                int i2 = (b1)? 0: 8;
                if (!pair.getSecond().f()) {
                   uochangeStat2.invoke(Float.valueOf(f5));
                   c.a.m(f, i2, uochangeStat1, this, pair);
                }else {
                   uochangeStat1.invoke(Float.valueOf(f3), Integer.valueOf(0));
                   uochangeStat2.invoke(Float.valueOf(f4));
                   obj2 = new float[i];
                   obj2[0] = f3;
                   obj2[1] = f;
                   ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(obj2);
                   valueAnimato1.setDuration(330);
                   valueAnimato1.setStartDelay(30);
                   Path path = new Path();
                   path.moveTo(f2, f2);
                   path.cubicTo(0.40f, 0, 0.20f, 0x3f800000, 0x3f800000, 0x3f800000);
                   valueAnimato1.setInterpolator(new PathInterpolator(path));
                   ValueAnimator valueAnimato2 = valueAnimato1;
                   ValueAnimator valueAnimato3 = valueAnimato1;
                   c.a.n(valueAnimato2, f, i2, uochangeStat1, this, pair);
                   uofloatArray = new float[i];
                   uofloatArray[0] = f4;
                   uofloatArray[1] = f5;
                   ValueAnimator valueAnimato4 = ValueAnimator.ofFloat(uofloatArray);
                   valueAnimato4.setDuration(40);
                   long l = (b1)? 60: 260;
                   valueAnimato4.setStartDelay(l);
                   valueAnimato4.setInterpolator(new LinearInterpolator());
                   valueAnimato4.addUpdateListener(new b(b1, uochangeStat2, f5));
                   valueAnimato4.addListener(new c(b1, uochangeStat2, f5));
                   AnimatorSet uAnimatorSet = new AnimatorSet();
                   Animator[] uAnimatorArr = new Animator[i];
                   uAnimatorArr[0] = valueAnimato3;
                   uAnimatorArr[1] = valueAnimato4;
                   uAnimatorSet.playTogether(uAnimatorArr);
                   uAnimatorSet.start();
                   obj.i = uAnimatorSet;
                }
             }
          }
          obj.g = obj1;
       }else {
          QPhoto qPhoto = p0.d();
          SearchBubbleView g1 = obj.g;
          QPhoto qPhoto1 = (g1 != null)? g1.d(): null;
          if (qPhoto != qPhoto1) {
             g = obj.i;
             if (g != null) {
                g.cancel();
             }
             c.a.m(0, 0, SearchBubbleView$setHotWordState$1.INSTANCE, this, new Pair(obj.g, obj1));
             obj.g = obj1;
          }
       }
       return;
    }
    public void setOnCloseListener(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchBubbleView.class, "16")) {
          return;
       }
       a.p(p0, "listener");
       SearchBubbleView td = this.d;
       if (td != null) {
          td.setOnClickListener(new SearchBubbleView$i(this, p0));
       }
       return;
    }
    public void setOnHotWordClickListener(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchBubbleView.class, "15")) {
          return;
       }
       a.p(p0, "listener");
       this.setOnClickListener(new SearchBubbleView$j(this, p0));
       return;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(SearchBubbleView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SearchBubbleView.class, "5")) {
          return;
       }
       super.setPressed(p0);
       float f = (p0)? 0x3f000000: 0x3f800000;
       this.setAlpha(f);
       return;
    }
}
