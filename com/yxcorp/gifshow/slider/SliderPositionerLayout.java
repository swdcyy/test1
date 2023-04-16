package com.yxcorp.gifshow.slider.SliderPositionerLayout;
import android.widget.RelativeLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.slider.SliderView;
import o79.i;
import java.util.ArrayList;
import com.yxcorp.gifshow.slider.SliderPositionerLayout$b;
import g79.a;
import w69.m0;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.slider.SliderPositionerLayout$c;
import com.yxcorp.gifshow.slider.SliderPositionerLayout$d;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import hjc.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import qsd.d;
import com.yxcorp.utility.Log;
import android.widget.LinearLayout;
import java.lang.StringBuilder;
import java.util.Objects;
import java.util.Set;
import java.util.LinkedHashMap;
import hjc.b;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.Pair;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import kotlin.TypeCastException;
import java.lang.Boolean;
import com.yxcorp.gifshow.slider.SliderPositionerLayout$a;

public final class SliderPositionerLayout extends RelativeLayout	// class@001d40
{
    public int A;
    public final RecyclerView$r B;
    public final SliderView$a C;
    public final int D;
    public HashMap E;
    public final float b;
    public final float c;
    public final long d;
    public final long e;
    public boolean f;
    public RecyclerView g;
    public boolean h;
    public boolean i;
    public boolean j;
    public e k;
    public int l;
    public float m;
    public SliderView n;
    public final int o;
    public final ArrayList p;
    public final RelativeLayout q;
    public float r;
    public Runnable s;
    public final SharedPreferences t;
    public boolean u;
    public boolean v;
    public SliderPositionerLayout$a w;
    public boolean x;
    public int y;
    public float z;

    public void SliderPositionerLayout(Context p0,int p1){
       a.q(p0, "context");
       super(p0);
       this.D = p1;
       this.b = 0x3f666666;
       this.c = 0.10f;
       this.d = 2000;
       this.e = 3000;
       this.n = new SliderView(p0);
       this.o = i.c(0x7f070493);
       this.p = new ArrayList();
       this.q = new RelativeLayout(p0);
       this.s = new SliderPositionerLayout$b(this);
       this.t = a.c.h().b(p0, "Slider", 0);
       this.B = new SliderPositionerLayout$c(this, p0);
       this.C = new SliderPositionerLayout$d(this);
       this.setBackgroundColor(ContextCompat.getColor(p0, R.color.arg_RES_7f060b87));
    }
    public static final RecyclerView a(SliderPositionerLayout p0){
       p0 = p0.g;
       if (p0 == null) {
          a.S("targetRecycler");
       }
       return p0;
    }
    public static final e b(SliderPositionerLayout p0){
       p0 = p0.k;
       if (p0 == null) {
          a.S("transformRule");
       }
       return p0;
    }
    public final int c(int p0){
       if (PatchProxy.isSupport(SliderPositionerLayout.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, SliderPositionerLayout.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return d.H0(Math.abs(((float)p0 - this.z)));
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, SliderPositionerLayout.class, "8")) {
          return;
       }
       Log.g("Slider", "adjustSliderOffset");
       this.x = true;
       return;
    }
    public final void e(int p0){
       if (PatchProxy.isSupport(SliderPositionerLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SliderPositionerLayout.class, "2")) {
          return;
       }
       SliderPositionerLayout tk = this.k;
       if (tk == null) {
          a.S("transformRule");
       }
       float f = tk.c((float)p0);
       float f1 = (this.z + f) - this.n.getTranslationY();
       Log.g("Slider", "rvScrolled="+p0+", sliderShouldSlide="+f+", "+"slider.translationY="+this.n.getTranslationY()+", offset="+f1);
       if (f1) {
          this.n.c(f1);
       }
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, SliderPositionerLayout.class, "19")) {
          return;
       }
       if (this.v != null) {
          this.u = false;
          this.n.setGuiding$core_release(false);
       }
       return;
    }
    public final int getPositionerHeight(){
       return this.o;
    }
    public final SliderView getSlider(){
       return this.n;
    }
    public final int getSliderHeight(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       SliderPositionerLayout obj = PatchProxy.apply(objArray, this, SliderPositionerLayout.class, "18");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.k;
       if (obj == null) {
          a.S("transformRule");
       }
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, e.class, "7");
       int i = (obj1 != patchProxyRe)? obj1.intValue(): obj.r.keySet().size();
       if (i <= 1) {
          Log.g("Slider", "getSliderHeight = normal");
          i = i.c(R.dimen.arg_RES_7f070498);
       }else {
          Log.g("Slider", "getSliderHeight = detail");
          i = i.c(R.dimen.arg_RES_7f070495);
       }
       return i;
    }
    public final float getStartPadding(){
       return this.z;
    }
    public final void setEmmitRecyclerScrollThreshold(int p0){
       if (PatchProxy.isSupport(SliderPositionerLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SliderPositionerLayout.class, "9")) {
          return;
       }
       Log.g("Slider", "setEmmitRecyclerScrollThreshold:: threshold="+p0);
       this.y = p0;
       return;
    }
    public final void setHeaderHeight(float p0){
       this.m = p0;
    }
    public final void setHeight(int p0){
       String str = "5";
       if (PatchProxy.isSupport(SliderPositionerLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SliderPositionerLayout.class, str)) {
          return;
       }
       if (this.k == null) {
          Log.d("Slider", "setHeight transformRule is not isInitialized");
          return;
       }else {
          Log.g("Slider", "setHeight: "+p0);
          int i = this.c(p0);
          SliderPositionerLayout tk = this.k;
          String str1 = "transformRule";
          if (tk == null) {
             a.S(str1);
          }
          i = i - this.getSliderHeight();
          Objects.requireNonNull(tk);
          if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(i), tk, e.class, str)) {
             tk.f = p0;
             tk.d = i;
             tk.b();
          }
          this.r = this.n.getTranslationY();
          b uob = new b(this.z, (float)(p0 - this.getSliderHeight()));
          Log.g("Slider", "setHeight, slideRange="+uob);
          this.n.setTranslationY(this.r);
          this.n.setSlideRange$core_release(uob);
          if (!PatchProxy.applyVoid(null, this, SliderPositionerLayout.class, "12")) {
             SliderPositionerLayout tk1 = this.k;
             if (tk1 == null) {
                a.S(str1);
             }
             i = 0;
             Iterator iterator = tk1.a().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   Object obj = iterator.next();
                   int i1 = i + 1;
                   if (i < 0) {
                      CollectionsKt__CollectionsKt.W();
                   }
                   float f = obj.getSecond().floatValue();
                   if (i >= this.p.size() || i < 0) {
                      Log.d("Slider", "index out of bounds, rule index="+i+", positionerListSize="+this.p.size());
                   }else {
                      ViewGroup$LayoutParams obj1 = this.p.get(i);
                      a.h(obj1, "positionerList[index]");
                      obj1 = obj1.getLayoutParams();
                      if (obj1 != null) {
                         obj1.topMargin = (int)f;
                      }else {
                         throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                      }
                   }
                   i = i1;
                }else {
                   this.q.requestLayout();
                   break ;
                }
             }
          }
          return;
       }
    }
    public final void setPositionersVisibility(boolean p0){
       if (PatchProxy.isSupport(SliderPositionerLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SliderPositionerLayout.class, "10")) {
          return;
       }
       int i = (p0)? 0: 4;
       Iterator iterator = this.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().setVisibility(i);
       }
       return;
    }
    public final void setReadyCallback(SliderPositionerLayout$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SliderPositionerLayout.class, "4")) {
          return;
       }
       a.q(p0, "callback");
       this.w = p0;
       return;
    }
    public final void setSlider(SliderView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SliderPositionerLayout.class, "1")) {
          return;
       }
       a.q(p0, "<set-?>");
       this.n = p0;
       return;
    }
    public final void setStartPadding(float p0){
       this.z = p0;
    }
}
