package com.yxcorp.gifshow.slider.SliderPositionerLayout$c;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.slider.SliderPositionerLayout;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Runnable;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.slider.SliderView;
import java.util.Objects;
import android.widget.LinearLayout;
import android.view.ViewGroup$LayoutParams;
import o79.i;
import java.lang.CharSequence;
import android.widget.TextView;
import com.kwai.robust.PatchProxyResult;
import hjc.e;
import java.lang.Float;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import hjc.b;
import hjc.a;
import java.lang.Iterable;
import kotlin.Pair;
import java.lang.Number;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import java.lang.StringBuilder;
import android.text.TextPaint;
import androidx.core.content.ContextCompat;
import android.graphics.Typeface;
import android.widget.LinearLayout$LayoutParams;
import android.view.View;

public final class SliderPositionerLayout$c extends RecyclerView$r	// class@001d3e
{
    public final SliderPositionerLayout a;
    public final Context b;

    public void SliderPositionerLayout$c(SliderPositionerLayout p0,Context p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(RecyclerView p0,int p1){
       SliderPositionerLayout$c uoc = SliderPositionerLayout$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1")) {
          return;
       }
       a.q(p0, "recyclerView");
       int i = 1;
       if (p1) {
          if (p1 == i) {
             this.a.f();
             SliderPositionerLayout$c ta = this.a;
             ta.removeCallbacks(ta.s);
          }
       }else {
          SliderPositionerLayout$c ta1 = this.a;
          if (ta1.u != null) {
             SliderView slider = ta1.getSlider();
             String str = this.b.getString(R.string.arg_RES_7f1018be);
             a.h(str, "context.getString\(R.stri¡­_quick_locator_guide_tip\)");
             Objects.requireNonNull(slider);
             if (!PatchProxy.applyVoidOneRefs(str, slider, SliderView.class, "8")) {
                a.q(str, "guideText");
                slider.e = 0;
                slider.a();
                slider.setBackgroundResource(R.drawable.arg_RES_7f080f8e);
                slider.getLayoutParams().width = i.c(0x7f070497);
                slider = slider.f;
                if (slider != null) {
                   slider.setText(str);
                }
             }
             this.a.getSlider().b();
             ta1 = this.a;
             ta1.v = i;
             ta1.postDelayed(ta1.s, ta1.e);
          }else {
             ta1.postDelayed(ta1.s, ta1.d);
          }
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       SliderPositionerLayout$c a;
       String str1;
       String str2;
       String str3;
       int k11;
       int i2;
       String str4;
       String[] stringArray;
       List list;
       String str6;
       int i3;
       SliderView f1;
       SliderView h;
       float f2;
       SliderView k11;
       SliderPositionerLayout$c uoc = this;
       int i = p2;
       if (PatchProxy.isSupport(SliderPositionerLayout$c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, SliderPositionerLayout$c.class, "2")) {
          return;
       }
       a.q(p0, "recyclerView");
       uoc.a.A = p0.computeVerticalScrollOffset();
       a = uoc.a;
       Objects.requireNonNull(a);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(SliderPositionerLayout.class) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p2), a, SliderPositionerLayout.class, "17") && i)) {
          SliderPositionerLayout n = a.n;
          if (!n.getGuiding$core_release()) {
             n.b();
          }
          SliderPositionerLayout k = a.k;
          if (k == null) {
             a.S("transformRule");
          }
          float f = (float)i;
          Objects.requireNonNull(k);
          e uoe = e.class;
          String str = "6";
          if (PatchProxy.isSupport(uoe)) {
             str1 = PatchProxy.applyOneRefs(Float.valueOf(f), k, uoe, str);
             if (str1 != patchProxyRe) {
             }else {
             label_0084 :
                f2 = k.A + f;
                k.A = f2;
                if (f2 - (float)0 < 0) {
                   k.A = 0;
                }
                e z = k.z;
                if (k.A - z > 0) {
                   k.A = z;
                }
                Iterator iterator1 = k.t.entrySet().iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      Map$Entry uEntry = iterator1.next();
                      b key = uEntry.getKey();
                      str4 = uEntry.getValue();
                      e a1 = k.A;
                      key = key.b;
                      str2 = (a1 - key.a >= 0 && a1 - key <= 0)? 1: null;
                      if (str2) {
                         str1 = str4;
                      }
                   }else {
                      str1 = null;
                   }
                }
             }
          }else {
             goto label_0084 ;
          }
          if (str1 != null) {
             a String k1 = a.i;
             Context context = n.getContext();
             str2 = "context";
             a.h(context, str2);
             Objects.requireNonNull(k1);
             k1 = PatchProxy.applyTwoRefs(context, str1, k1, a.class, "2");
             int i1 = 2;
             if (k1 != patchProxyRe) {
             }else {
                a.q(context, str2);
                a.q(str1, "date");
                if (a.g(str1, a.e)) {
                   k1 = context.getString(R.string.arg_RES_7f1018bf);
                   a.h(k1, "context.getString\(R.stri¡­lbum_quick_locator_today\)");
                }else if(a.g(str1, a.f)){
                   k1 = context.getString(R.string.arg_RES_7f1018c3);
                   a.h(k1, "context.getString\(R.stri¡­_quick_locator_yesterday\)");
                }else {
                   ArrayList g = a.g;
                   if (g != null) {
                      Iterator iterator = g.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            Pair k12 = iterator.next();
                            if (a.g(str1, k12.getFirst())) {
                               k1 = context.getString(a.c[k12.getSecond().intValue()].intValue());
                               a.h(k1, "context.getString\(weeksStrs[it.second]\)");
                            }else {
                               continue ;
                            }
                         }
                      }
                      str4 = "primaryText";
                      if (a.g(str3, str1)) {
                         stringArray = new String[]{"-"};
                         list = StringsKt__StringsKt.H4(str3, stringArray, false, 0, 6, null);
                         str3 = list.get(0);
                         String str5 = list.get(1);
                         Object[] objArray = new Object[]{Integer.valueOf(Integer.parseInt(str5))};
                         Object[] objArray1 = new Object[]{Integer.valueOf(Integer.parseInt(list.get(i1)))};
                         str6 = n.getContext().getString(i2, objArray)+n.getContext().getString(k11, objArray1);
                         Object[] objArray2 = new Object[]{Integer.valueOf(Integer.parseInt(str3))};
                         k1 = n.getContext().getString(R.string.arg_RES_7f1018c2, objArray2);
                         a.h(k1, "context.getString\(R.stri¡­ator_xyear, year.toInt\(\)\)");
                         if (!PatchProxy.applyVoidTwoRefs(str6, k1, n, SliderView.class, "7")) {
                            a.q(str6, str4);
                            a.q(k1, "secondaryText");
                            if (n.d == null) {
                               if (!PatchProxy.applyVoid(null, n, SliderView.class, "11")) {
                                  f2 = 10.00f;
                                  n.setPadding(i.d(f2), 0, i.d(f2), 0);
                                  if (n.g == null && n.h == null) {
                                     TextView textView = new TextView(n.getContext());
                                     n.g = textView;
                                     textView.setGravity(17);
                                     textView.setTextSize(1, 14.00f);
                                     TextPaint paint = textView.getPaint();
                                     a.h(paint, "paint");
                                     paint.setFakeBoldText(1);
                                     textView.setTextColor(ContextCompat.getColor(textView.getContext(), R.color.arg_RES_7f060b75));
                                     textView.setTypeface(Typeface.create("sans-serif-medium", 0));
                                     LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, i.c(0x7f070505));
                                     layoutParams.gravity = 5;
                                     layoutParams.topMargin = i.d(7.00f);
                                     n.addView(n.g, layoutParams);
                                     textView = new TextView(n.getContext());
                                     n.h = textView;
                                     textView.setGravity(17);
                                     textView.setTextSize(1, f2);
                                     TextPaint paint1 = textView.getPaint();
                                     a.h(paint1, "paint");
                                     paint1.setFakeBoldText(1);
                                     textView.setTextColor(ContextCompat.getColor(textView.getContext(), R.color.arg_RES_7f060b74));
                                     textView.setTypeface(Typeface.create("sans-serif-medium", 0));
                                     LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams(-2, i.c(0x7f070507));
                                     layoutParams1.gravity = 5;
                                     n.addView(n.h, layoutParams1);
                                     n.getLayoutParams().width = -2;
                                     n.requestLayout();
                                  label_0336 :
                                     if (n.e != 2) {
                                        n.getLayoutParams().width = i3;
                                        n.getLayoutParams().height = i.c(0x7f070495);
                                        n.setBackgroundResource(R.drawable.arg_RES_7f080f8d);
                                        f1 = n.f;
                                        if (f1 != null) {
                                           f1.setVisibility(8);
                                        }
                                        f1 = n.g;
                                        if (f1 != null) {
                                           f1.setVisibility(0);
                                        }
                                        f1 = n.h;
                                        if (f1 != null) {
                                           f1.setVisibility(0);
                                        }
                                     }
                                     f1 = n.g;
                                     if (f1 != null) {
                                        f1.setText(str6);
                                     }
                                     h = n.h;
                                     if (h != null) {
                                        h.setText(k1);
                                     }
                                     n.e = 2;
                                  }
                               }
                               i3 = -2;
                               goto label_0336 ;
                            }
                         }
                      }else {
                         SliderPositionerLayout sliderPositi = 8;
                         if (!PatchProxy.applyVoidOneRefs(str3, n, SliderView.class, str)) {
                            a.q(str3, str4);
                            if (n.d == null) {
                               n.a();
                               if (n.e != 1) {
                                  k11.width = -2;
                                  k11.height = i.c(0x7f070498);
                                  n.setBackgroundResource(R.drawable.arg_RES_7f080f8e);
                                  k11 = n.g;
                                  if (k11 != null) {
                                     k11.setVisibility(sliderPositi);
                                  }
                                  k11 = n.h;
                                  if (k11 != null) {
                                     k11.setVisibility(sliderPositi);
                                  }
                                  h = n.f;
                                  if (h != null) {
                                     h.setVisibility(0);
                                  }
                               }
                               h = n.f;
                               if (h != null) {
                                  h.setText(str3);
                               }
                               n.e = 1;
                            }
                         }
                      }
                   }
                   stringArray = new String[]{"-"};
                   k11 = 0x7f1018c0;
                   i2 = 0x7f1018c1;
                   list = StringsKt__StringsKt.H4(str1, stringArray, false, 0, 6, null);
                   if (a.g(a.h, list.get(0))) {
                      Object[] objArray3 = new Object[]{Integer.valueOf(Integer.parseInt(list.get(1)))};
                      objArray3 = new Object[]{Integer.valueOf(Integer.parseInt(list.get(i1)))};
                      str6 = context.getString(i2, objArray3)+context.getString(k11, objArray3);
                   }else {
                      str6 = str1;
                   }
                   str3 = str6;
                   goto label_01d2 ;
                }
             }
             str3 = k1;
             k11 = 0x7f1018c0;
             i2 = 0x7f1018c1;
             goto label_01d2 ;
          }
       label_03cf :
          if (a.f == null) {
             SliderPositionerLayout k2 = a.k;
             if (k2 == null) {
                a.S("transformRule");
             }
             n.c(k2.c(f));
          }
       }
       return;
    }
}
