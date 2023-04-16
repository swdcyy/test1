package com.kuaishou.merchant.transaction.detail.self.widget.OrderAnimationView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import android.graphics.RectF;
import java.util.HashSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.n;
import android.graphics.Color;
import com.kuaishou.merchant.transaction.detail.self.widget.OrderAnimationView$d;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.content.res.Resources;
import com.yxcorp.gifshow.util.BitmapUtil;
import zd4.a;
import q87.c;
import android.animation.ValueAnimator;
import android.util.LruCache;
import com.kuaishou.merchant.transaction.base.model.ItemTradeIndex$a;
import com.kuaishou.merchant.transaction.base.model.ItemTradeIndex$b;
import com.kuaishou.merchant.transaction.detail.self.widget.OrderAnimationView$c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Number;
import android.graphics.Rect;
import android.graphics.Canvas;
import java.util.List;
import android.graphics.LinearGradient;
import com.kuaishou.merchant.transaction.base.model.ItemTradeIndex;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import lnc.a1;
import com.yxcorp.utility.TextUtils;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.ref.SoftReference;
import java.lang.CharSequence;
import com.kuaishou.merchant.transaction.detail.self.widget.OrderAnimationView$b;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import java.util.Map;
import java.util.Collection;
import ekd.q;
import java.lang.StringBuilder;
import kg4.a;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import hi4.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.merchant.transaction.detail.self.widget.OrderAnimationView$a;
import android.animation.Animator$AnimatorListener;

public class OrderAnimationView extends View	// class@000771
{
    public float A;
    public float B;
    public float C;
    public float D;
    public boolean E;
    public OrderAnimationView$d F;
    public Bitmap G;
    public ValueAnimator H;
    public HashSet I;
    public List J;
    public float b;
    public float c;
    public float d;
    public ArrayList e;
    public Map f;
    public a g;
    public int h;
    public OrderAnimationView$c i;
    public OrderAnimationView$c j;
    public Paint k;
    public Paint l;
    public Paint m;
    public Paint n;
    public Paint o;
    public Paint p;
    public Paint q;
    public Paint r;
    public RectF s;
    public RectF t;
    public long u;
    public long v;
    public int w;
    public int x;
    public float y;
    public float z;
    public static final int K;

    public void OrderAnimationView(Context p0){
       super(p0, null);
    }
    public void OrderAnimationView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void OrderAnimationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 50.00f;
       this.c = 16.00f;
       float f = 25.00f;
       this.d = f;
       this.e = new ArrayList();
       int i = -1;
       this.h = i;
       this.s = new RectF();
       this.t = new RectF();
       this.u = 2000;
       this.v = 800;
       this.I = new HashSet();
       this.J = new ArrayList();
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, OrderAnimationView.class, "1")) {
       }else {
          this.b = (float)n.c(this.getContext(), f);
          this.c = (float)n.c(this.getContext(), 8.00f);
          f = (float)n.c(this.getContext(), 3.50f);
          this.z = f;
          this.y = f;
          this.A = (float)n.c(this.getContext(), 5.00f);
          f = (float)n.c(this.getContext(), 18.00f);
          this.D = f;
          this.C = f;
          this.B = (float)n.c(this.getContext(), 8.00f);
          this.d = (float)n.c(this.getContext(), 12.50f);
          this.w = Color.argb(255, 0, 0, 0);
          this.x = i;
          this.F = new OrderAnimationView$d(10);
          Paint paint = new Paint();
          this.o = paint;
          paint.setAlpha(255);
          this.o.setAntiAlias(true);
          this.o.setColor(this.w);
          paint = new Paint();
          this.q = paint;
          paint.setAlpha(255);
          this.q.setAntiAlias(true);
          this.q.setStyle(Paint$Style.STROKE);
          paint = new Paint();
          this.p = paint;
          paint.setAlpha(0);
          this.p.setAntiAlias(true);
          this.p.setColor(this.w);
          paint = new Paint();
          this.r = paint;
          paint.setAlpha(0);
          this.r.setAntiAlias(true);
          this.r.setStyle(Paint$Style.STROKE);
          paint = new Paint();
          this.k = paint;
          paint.setAlpha(255);
          this.k.setTextSize((float)n.c0(this.getContext(), 14.00f));
          this.k.setAntiAlias(true);
          this.k.setColor(i);
          paint = new Paint();
          this.m = paint;
          paint.setAlpha(255);
          this.m.setAntiAlias(true);
          this.m.setColor(i);
          Paint paint1 = new Paint();
          this.l = paint1;
          paint1.setAlpha(0);
          this.l.setTextSize((float)n.c0(this.getContext(), 14.00f));
          this.l.setAntiAlias(true);
          this.l.setColor(i);
          paint1 = new Paint();
          this.n = paint1;
          paint1.setAlpha(0);
          this.l.setAntiAlias(true);
          this.l.setColor(i);
          if (!PatchProxy.applyVoid(objArray, this, OrderAnimationView.class, "2")) {
             Bitmap uBitmap = Bitmap.createBitmap((int)this.C, (int)this.D, Bitmap$Config.RGB_565);
             uBitmap.eraseColor(this.getResources().getColor(R.color.arg_RES_7f060bcf));
             this.G = BitmapUtil.k(uBitmap);
          }
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, OrderAnimationView.class, "7")) {
          return;
       }
       OrderAnimationView tH = this.H;
       if (tH != null && (tH.isRunning() || this.H.isStarted())) {
          this.H.cancel();
       }
       this.H = null;
       this.E = true;
       this.h = -1;
       this.F.evictAll();
       this.I.clear();
       this.setVisibility(8);
       this.s.setEmpty();
       this.t.setEmpty();
       return;
    }
    public final OrderAnimationView$c b(ItemTradeIndex$a p0,ItemTradeIndex$b p1,int p2){
       OrderAnimationView$c obj;
       if (PatchProxy.isSupport(OrderAnimationView.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), this, OrderAnimationView.class, "28");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new OrderAnimationView$c(this);
       obj.f = p0.mRollingInfo;
       obj.a = p0.mBuyerImage;
       obj.g = p0.mType;
       this.j(obj);
       OrderAnimationView$c p = obj.p;
       float f = (float)p2 * (p.b + p.c);
       obj.h = f;
       obj.b = f;
       int i = (p2 == 2)? 0: 1;
       obj.i = (float)i;
       f = (this.y + this.D) + this.A;
       OrderAnimationView tk = this.k;
       p = obj.f;
       Object obj1 = PatchProxy.applyTwoRefs(tk, p, this, OrderAnimationView.class, "19");
       float f1 = (obj1 != PatchProxyResult.class)? obj1.floatValue(): (float)this.e(tk, p).width();
       obj.c = (f + f1) + this.B;
       obj.d = this.b;
       if (p1 != null) {
          obj.j = p1.mBgColorList;
          obj.k = p1.mBgColorPositionList;
          obj.l = p1.mBorderColorList;
          obj.m = p1.mBorderColorPositionList;
          obj.n = p1.mShadowColor;
          obj.o = p1.mTextColor;
       }
       return obj;
    }
    public final void c(Canvas p0,OrderAnimationView$c p1,Paint p2,Paint p3,RectF p4){
       OrderAnimationView$c k;
       LinearGradient linearGradie;
       int i = 1;
       if (PatchProxy.isSupport(OrderAnimationView.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, OrderAnimationView.class, "21")) {
             return;
          }
       }
       if (p1 != null) {
          p4.left = 0;
          OrderAnimationView$c h = p1.h;
          p4.top = h;
          p4.right = 0 + p1.c;
          p4.bottom = h + p1.d;
          if (this.n()) {
             if (p1.j != null) {
                k = p1.k;
                if (k != null && k.size() != i) {
                   linearGradie = new LinearGradient(0, 0, (float)this.getMeasuredWidth(), 0, ItemTradeIndex.stringList2ColorList(p1.j), ItemTradeIndex.list2Array(p1.k), Shader$TileMode.CLAMP);
                   p2.setShader(k);
                }
             }
             if (p1.l != null) {
                k = p1.m;
                if (k != null && k.size() != i) {
                   linearGradie = new LinearGradient(0, 0, (float)this.getMeasuredWidth(), 0, ItemTradeIndex.stringList2ColorList(p1.l), ItemTradeIndex.list2Array(p1.m), Shader$TileMode.CLAMP);
                   p3.setShader(k);
                }
             }
             p3.setAlpha((int)(p1.i * (float)Color.alpha(this.w)));
             p0.drawRoundRect(p4, this.d, this.d, p3);
          }
          p2.setAlpha((int)(p1.i * (float)Color.alpha(this.w)));
          p0.drawRoundRect(p4, this.d, this.d, p2);
       }
       return;
    }
    public final void d(Canvas p0,OrderAnimationView$c p1,Paint p2,Paint p3,RectF p4){
       OrderAnimationView$c n;
       OrderAnimationView obj1;
       int i6;
       float f1;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 0;
       int i4 = 5;
       if (PatchProxy.isSupport(OrderAnimationView.class)) {
          Object[] objArray = new Object[i4];
          objArray[i3] = oobject;
          objArray[1] = oobject1;
          objArray[i2] = oobject2;
          objArray[i1] = oobject3;
          objArray[i] = oobject4;
          if (PatchProxy.applyVoid(objArray, obj, OrderAnimationView.class, "14")) {
             return;
          }
       }
       if (oobject1 != null) {
          if (this.n()) {
             oobject2.setColor(TextUtils.J(oobject1.o, a1.a(R.color.arg_RES_7f061e52)));
             oobject2.setFakeBoldText(1);
             n = oobject1.n;
             OrderAnimationView$c i5 = oobject1.i;
             if (PatchProxy.isSupport(OrderAnimationView.class)) {
                obj1 = PatchProxy.applyTwoRefs(n, Float.valueOf(i5), obj, OrderAnimationView.class, "15");
                if (obj1 != patchProxyRe) {
                   i6 = obj1.intValue();
                }else if(n != null && !("").equals(n)){
                   i4 = 9;
                   if (n.length() == i4) {
                      int[] ointArray = new int[i];
                      ointArray[i3] = (int)((float)Integer.valueOf(n.substring(7, i4), 16).intValue() * i5);
                      ointArray[1] = Integer.valueOf(n.substring(1, i1), 16).intValue();
                      i4 = 5;
                      ointArray[2] = Integer.valueOf(n.substring(i1, i4), 16).intValue();
                      ointArray[i1] = Integer.valueOf(n.substring(i4, 7), 16).intValue();
                      i6 = Color.argb(ointArray[i3], ointArray[1], ointArray[2], ointArray[i1]);
                   }
                }
                i6 = -1;
             }else {
                goto label_006f ;
             }
             oobject2.setShadowLayer(0x3f800000, 0, 2.00f, i6);
          }
          oobject2.setAlpha((int)(oobject1.i * (float)Color.alpha(obj.x)));
          oobject3.setAlpha((int)(oobject1.i * (float)Color.alpha(obj.x)));
          n = oobject1.f;
          float f = ((oobject4.left + obj.y) + obj.C) + obj.A;
          RectF top = oobject4.top;
          obj1 = obj.k;
          Object obj2 = PatchProxy.applyTwoRefs(obj1, n, obj, OrderAnimationView.class, "18");
          if (obj2 != patchProxyRe) {
             f1 = obj2.floatValue();
          }else {
             obj2 = PatchProxy.applyTwoRefs(obj1, n, obj, OrderAnimationView.class, "16");
             if (obj2 != patchProxyRe) {
                f1 = obj2.floatValue();
             }else {
                Rect rect = obj.e(obj1, n);
                i3 = rect.height();
                f1 = (float)(i3 - rect.bottom);
             }
             f1 = f1 + ((obj.b - (float)obj.e(obj1, n).height()) / 2.00f);
          }
          oobject.drawText(n, f, (top + f1), oobject2);
          oobject.drawBitmap(oobject1.e, (oobject4.left + obj.y), (oobject4.top + obj.z), oobject3);
       }
       return;
    }
    public final Rect e(Paint p0,String p1){
       Rect obj = PatchProxy.applyTwoRefs(p0, p1, this, OrderAnimationView.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Rect();
       p0.getTextBounds(p1, 0, p1.length(), obj);
       return obj;
    }
    public final String f(int p0){
       if (PatchProxy.isSupport(OrderAnimationView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, OrderAnimationView.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 < 0 || p0 >= this.e.size()) {
          return null;
       }else {
          return this.e.get(p0).mBuyerImage;
       }
    }
    public boolean g(Bitmap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OrderAnimationView.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && !p0.isRecycled())? true: false;
       return b;
    }
    public final boolean h(Bitmap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OrderAnimationView.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.isRecycled() || p0 == this.G))? true: false;
       return b;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, OrderAnimationView.class, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("OrderAnimationView", "pasue ! ", objArray);
       this.E = true;
       return;
    }
    public final void j(OrderAnimationView$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderAnimationView.class, "29")) {
          return;
       }
       SoftReference softReferenc = this.F.get(p0.a);
       if (softReferenc != null) {
          p0.e = softReferenc.get();
       }
       if (this.h(p0.e)) {
          p0.e = this.G;
          String[] stringArray = new String[]{p0.a};
          this.k(stringArray);
       }
       return;
    }
    public final void k(String[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderAnimationView.class, "30")) {
          return;
       }
       if (p0.length) {
          int len = p0.length;
          int i = 0;
          while (i < len) {
             object oobject = p0[i];
             if (TextUtils.x(oobject) || (this.F.get(oobject) == null && !this.I.contains(oobject))) {
                this.I.add(oobject);
                a.e(oobject, new OrderAnimationView$b(this, oobject));
             }
          label_0039 :
             i = i + 1;
          }
       }
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, OrderAnimationView.class, "9")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.C().w("OrderAnimationView", "resume ! ", objArray);
       if (this.E == null) {
          return;
       }
       this.E = i;
       if (this.h < this.e.size()) {
          this.o();
       }
       return;
    }
    public void m(List p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OrderAnimationView.class, "3")) {
          return;
       }
       int i = 0;
       if (q.f(p0)) {
          Object[] objArray = new Object[i];
          a.C().A("OrderAnimationView", "input itemRollingInfos is empty, return!", objArray);
          return;
       }else {
          this.a();
          this.e.clear();
          this.e.addAll(p0);
          this.f = p1;
          if (!PatchProxy.applyVoid(null, this, OrderAnimationView.class, "5") && !this.n()) {
             this.w = Color.argb(127, i, i, i);
             this.k.setTextSize((float)n.c0(this.getContext(), 11.00f));
             this.l.setTextSize((float)n.c0(this.getContext(), 11.00f));
          }
          return;
       }
    }
    public boolean n(){
       OrderAnimationView obj = PatchProxy.apply(null, this, OrderAnimationView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.f;
       boolean b = (obj != null && !obj.isEmpty())? true: false;
       return b;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, OrderAnimationView.class, "6")) {
          return;
       }
       int i = 0;
       if (!this.e.size()) {
          Object[] objArray = new Object[i];
          a.C().A("OrderAnimationView", "mItemInfos.size\(\) == 0 , return!", objArray);
          return;
       }else {
          this.E = i;
          this.setVisibility(i);
          this.p();
          return;
       }
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OrderAnimationView.class, "12")) {
          return;
       }
       super.onDraw(p0);
       if (this.h == null && this.n()) {
          this.H.setStartDelay(this.u);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, OrderAnimationView.class, "20")) {
          this.c(p0, this.i, this.o, this.q, this.s);
          this.c(p0, this.j, this.p, this.r, this.t);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, OrderAnimationView.class, "13")) {
          this.d(p0, this.i, this.k, this.m, this.s);
          this.d(p0, this.j, this.l, this.n, this.t);
       }
       return;
    }
    public final void p(){
       int i2;
       ItemTradeIndex$a uoa;
       OrderAnimationView tf1;
       Object[] objArray1;
       ItemTradeIndex$b uob;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, OrderAnimationView.class, "22")) {
          return;
       }
       int i = 0;
       int i1 = 1;
       if (!PatchProxy.applyVoid(objArray, this, OrderAnimationView.class, "10")) {
          i2 = this.h + i1;
          String str = "preLoad ";
          String str1 = "OrderAnimationView";
          if (!i2) {
             int i3 = i2 + 1;
             int i4 = i2 + 2;
             Object[] objArray2 = new Object[i];
             a.C().w(str1, str+i2+" "+i3+" "+i4, objArray2);
             String[] stringArray = new String[]{this.f(i2),this.f(i3),this.f(i4)};
             this.k(stringArray);
          }else {
             Object[] objArray3 = new Object[i];
             a.C().w(str1, str+i2, objArray3);
             String[] stringArray1 = new String[i1];
             stringArray1[i] = this.f((i2 + 2));
             this.k(stringArray1);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, OrderAnimationView.class, "24")) {
          i2 = this.h + i1;
          if (i2 <= 0) {
             this.h = i2;
             this.i = objArray;
             uoa = this.e.get(i);
             OrderAnimationView tf = this.f;
             if (tf != null) {
                objArray = tf.get(String.valueOf(this.e.get(i).mType));
             }
             this.j = this.b(uoa, objArray, 2);
             if (this.getAlpha() && !this.J.contains(Integer.valueOf(i))) {
                this.g.M(i, this.j.g);
                this.J.add(Integer.valueOf(i));
             }
          }else if(i2 < this.e.size()){
             this.h = i2;
             uoa = this.e.get((i2 - i1));
             tf1 = this.f;
             objArray1 = (tf1 == null)? objArray: tf1.get(String.valueOf(this.e.get((this.h - i1)).mType));
             this.i = this.b(uoa, objArray1, i1);
             uoa = this.e.get(this.h);
             tf1 = this.f;
             if (tf1 != null) {
                objArray = tf1.get(String.valueOf(this.e.get(this.h).mType));
             }
             this.j = this.b(uoa, objArray, 2);
             if (this.getAlpha() && !this.J.contains(Integer.valueOf((this.h - i1)))) {
                this.g.M((this.h - i1), this.i.g);
                this.J.add(Integer.valueOf((this.h - i1)));
             }
          }else {
             this.E = i1;
             uoa = this.e.get(this.h);
             tf1 = this.f;
             objArray1 = (tf1 == null)? objArray: tf1.get(String.valueOf(this.e.get(this.h).mType));
             this.i = this.b(uoa, objArray1, i1);
             this.j = objArray;
             if (this.getAlpha() && !this.J.contains(Integer.valueOf(this.h))) {
                this.g.M(this.h, this.i.g);
                this.J.add(Integer.valueOf(this.h));
             }
          }
       }
    label_01dc :
       OrderAnimationView tH = this.H;
       if (tH != null) {
          tH.cancel();
          this.H.start();
          return;
       }else {
          this.H = ValueAnimator.ofFloat(new float[2]{0,0x3f800000}).setDuration(this.v);
          if (this.h == null && this.n()) {
             this.H.setStartDelay(0);
          }else {
             this.H.setStartDelay(this.u);
          }
          this.H.setInterpolator(new AccelerateDecelerateInterpolator());
          this.H.addUpdateListener(new a(this));
          this.H.addListener(new OrderAnimationView$a(this));
          this.H.start();
          return;
       }
    }
    public void setDelayTime(long p0){
       if (p0 < 0) {
          return;
       }
       this.u = p0;
       return;
    }
    public void setLogger(a p0){
       this.g = p0;
    }
}
