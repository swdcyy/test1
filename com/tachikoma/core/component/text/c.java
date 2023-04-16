package com.tachikoma.core.component.text.c;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import gx4.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.tachikoma.core.component.text.SpanItem;
import com.tkruntime.v8.V8Object;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.util.List;
import hp8.g;
import com.kwai.robust.PatchProxyResult;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Function;
import android.widget.TextView;
import com.tachikoma.core.bridge.d;
import java.lang.CharSequence;
import android.text.SpannableString;
import java.util.Iterator;
import java.util.Objects;
import iq8.p;
import java.lang.Integer;
import android.text.style.BackgroundColorSpan;
import com.tachikoma.core.component.text.c$b;
import android.text.style.StrikethroughSpan;
import android.text.TextUtils;
import java.lang.StringBuilder;
import android.text.style.ImageSpan;
import android.graphics.drawable.Drawable;
import hp8.o;
import com.tachikoma.core.component.text.b;
import java.lang.Runnable;
import iq8.o;
import hp8.j;
import java.lang.Throwable;
import zp8.a;
import com.tkruntime.v8.V8Value;
import tx4.y;
import java.util.Map;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import com.tachikoma.core.component.text.c$a;
import android.text.style.URLSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import hp8.e;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import com.tachikoma.core.component.text.CustomTypefaceSpan;
import hp8.a;
import iq8.n;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StyleSpan;

public class c	// class@000d9c
{
    public final List a;
    public final Map b;
    public final List c;
    public final List d;
    public final Context e;
    public final String f;
    public static final float g;

    static {
       c.g = c.c(Resources.getSystem()).density;
    }
    public void c(Context p0,String p1){
       super();
       this.a = new ArrayList();
       this.b = new HashMap();
       this.e = p0;
       this.f = p1;
       this.c = new ArrayList();
       this.d = new ArrayList();
    }
    public void a(c p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, str)) {
          return;
       }
       if (!p0 instanceof SpanItem) {
          return;
       }
       p0.retainJsObj();
       this.a.add(p0);
       Object obj = null;
       g og = PatchProxy.applyOneRefs(p0, obj, g.class, str);
       if (og != PatchProxyResult.class) {
       }else {
          og = new g();
          og.a = p0.spanType;
          og.b = p0.url;
          og.c = p0.start;
          og.d = p0.end;
          og.e = p0.color;
          og.f = p0.size;
          og.g = p0.fontFamily;
          og.h = p0.textStyle;
          og.i = p0.imageUrl;
          og.k = p0.imageWidth;
          og.l = p0.imageHeight;
          og.m = p0.offsetX;
          og.n = p0.offsetY;
          og.o = p0.index;
          og.p = p0.marginLeft;
          og.q = p0.marginRight;
          SpanItem mV8FunctionR = p0.mV8FunctionRef;
          if (mV8FunctionR != null) {
             obj = mV8FunctionR.get();
          }
          og.r = obj;
          og.j = p0.imagePlaceholder;
       }
       if (og == null) {
          return;
       }else {
          this.c.add(og);
          return;
       }
    }
    public CharSequence b(String p0,TextView p1,d p2){
       int this;
       Integer integer;
       g obj1;
       c e;
       c$b this2;
       g o;
       c$b b1;
       int i4;
       int i5;
       c$b c;
       c uoc = this;
       TextView textView = p1;
       SpannableString obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new SpannableString(p0);
       Iterator iterator = uoc.c.iterator();
       while (iterator.hasNext()) {
          int i = iterator.next();
          g a = i.a;
          Objects.requireNonNull(a);
          boolean i1 = -1;
          this = 0;
          String str = 1;
          switch (a.hashCode()){
              case 0xb7009c93:
                if (a.equals("fontFamily")) {
                   i1 = 0;
                }
                break;
              case 0xbc66ce18:
                if (a.equals("absoluteSize")) {
                   i1 = 1;
                }
                break;
              case 0xc17f1c84:
                if (a.equals("textStyle")) {
                   i1 = 2;
                }
                break;
              case 0xc2bb3aec:
                if (a.equals("underLine")) {
                   i1 = 3;
                }
                break;
              case 0xd9ca27e0:
                if (a.equals("foregroundColor")) {
                   i1 = 4;
                }
                break;
              case 0x1c56f:
                if (a.equals("url")) {
                   i1 = 5;
                }
                break;
              case 0x5a5c588:
                if (a.equals("click")) {
                   i1 = 6;
                }
                break;
              case 0x5faa95b:
                if (a.equals("image")) {
                   i1 = 7;
                }
                break;
              case 0x294116b3:
                if (a.equals("strikeThrough")) {
                   i1 = 8;
                }
                break;
              case 0x4cb7f6d5:
                if (a.equals("backgroundColor")) {
                   i1 = 9;
                }
                break;
              default:
          }
       label_00bb :
          boolean b = false;
          int i2 = 17;
          switch (i1){
              case 0:
                if (PatchProxy.applyVoidTwoRefs(obj, i, uoc, c.class, "6") || (!TextUtils.isEmpty(i.g) && !TextUtils.isEmpty(uoc.f))) {
                   Typeface this1 = e.c().d(i.g, this, uoc.e.getAssets(), (uoc.f).concat(i.g));
                   if (this1 != null) {
                      CustomTypefaceSpan uCustomTypef = new CustomTypefaceSpan(b, this1);
                      obj.setSpan(uCustomTypef, i.c, i.d, i2);
                      uoc.d.add(new c$b(uCustomTypef, i.c, i.d));
                   }
                }
                uoc.d(obj, i);
                uoc.e(obj, i);
                break;
              case 1:
                uoc.d(obj, i);
                break;
              case 2:
                uoc.e(obj, i);
                break;
              case 3:
                UnderlineSpan underlineSpa = new UnderlineSpan();
                obj.setSpan(underlineSpa, i.c, i.d, i2);
                uoc.d.add(new c$b(underlineSpa, i.c, i.d));
                break;
              case 4:
                integer = Integer.valueOf(p.b(i.e));
                if (integer != null) {
                   super(integer.intValue());
                   obj.setSpan(this, i.c, i.d, i2);
                   uoc.d.add(new c$b(this, i.c, i.d));
                }
                break;
              case 5:
                URLSpan uRLSpan = new URLSpan(i.b);
                obj.setSpan(uRLSpan, i.c, i.d, i2);
                uoc.d.add(new c$b(uRLSpan, i.c, i.d));
                break;
              case 6:
                JsValueRef jsValueRef = y.b(i.r, uoc);
                if (jsValueRef != null && y.a(jsValueRef.get())) {
                   y.c(uoc.b.get(i));
                   uoc.b.put(i, jsValueRef);
                   textView.setMovementMethod(LinkMovementMethod.getInstance());
                   c$a uoa = new c$a(uoc, i, p2, textView);
                   obj.setSpan(uoa, i.c, i.d, i2);
                   uoc.d.add(new c$b(uoa, i.c, i.d));
                }else {
                }
                break;
              case 7:
                if (!TextUtils.isEmpty(i.i)) {
                   SpannableString spannableStr = PatchProxy.applyTwoRefs(obj, i, uoc, c.class, "12");
                   if (spannableStr != PatchProxyResult.class) {
                   }else {
                      String str1 = obj.toString();
                      o = i.o;
                      String str2 = "\xff\x02\x00";
                      if (o < str) {
                         str1 = str2+str1;
                      }else if(o > str1.length()){
                         str1 = str1+str2;
                      }else {
                         Iterator iterator2 = uoc.d.iterator();
                         while (iterator2.hasNext()) {
                            b1 = iterator2.next();
                            if (b1.a instanceof ImageSpan && i.o > b1.b) {
                               o = o + 1;
                            }else {
                               continue ;
                            }
                         }
                         str1 = str1.substring(this, o)+str2+str1.substring(o);
                      }
                      spannableStr = new SpannableString(str1);
                      if (uoc.d.size() > 0) {
                         Iterator iterator1 = uoc.d.iterator();
                         while (iterator1.hasNext()) {
                            this2 = iterator1.next();
                            c$b a1 = this2.a;
                            if (a1 instanceof ImageSpan) {
                               obj1 = i.o;
                               b1 = this2.b;
                               if (obj1 <= b1) {
                                  i4 = b1 + 1;
                                  this2.b = i4;
                                  i5 = this2.c + str;
                                  this2.c = i5;
                               }else {
                                  i5 = obj1 + 1;
                                  i.o = i5;
                               }
                            }else {
                               obj1 = i.o;
                               b1 = this2.b;
                               if (obj1 > b1) {
                                  c = this2.c;
                                  if (obj1 < c) {
                                     int i6 = c + 1;
                                     this2.c = i6;
                                  }
                               }
                               if (obj1 < b1) {
                                  i4 = b1 + 1;
                                  this2.b = i4;
                                  i5 = this2.c + str;
                                  this2.c = i5;
                               }else if(obj1 == b1){
                                  i4 = b1 + 1;
                                  this2.b = i4;
                                  i5 = this2.c + str;
                                  this2.c = i5;
                               }else {
                                  b1 = this2.c;
                                  if (obj1 == b1) {
                                     i4 = b1 + 1;
                                     this2.c = i4;
                                  }
                               }
                            }
                            spannableStr.setSpan(a1, this2.b, this2.c, i2);
                         }
                      }
                   }
                   obj1 = spannableStr;
                   if ((i.i).startsWith("http")) {
                      o oo = PatchProxy.applyTwoRefs(i, textView, uoc, c.class, "13");
                      if (oo != PatchProxyResult.class) {
                      }else {
                         oo = new o();
                         if (!PatchProxy.applyVoidThreeRefs(i, oo, p1, this, c.class, "9")) {
                            o.a(new b(uoc, i, oo, textView));
                         }
                      }
                      uoc.c(oo, obj1, i);
                   }else {
                      g i3 = i.i;
                      i1 = PatchProxy.applyOneRefs(i3, uoc, c.class, "11");
                      if (i1 != PatchProxyResult.class) {
                      }else {
                         e = uoc.e;
                         c f = uoc.f;
                         this2 = PatchProxy.applyThreeRefs(e, i3, f, null, j.class, "3");
                         if (this2 != PatchProxyResult.class) {
                            b = this2;
                         }else if(e == null || (!TextUtils.isEmpty(i3) && (i3.startsWith("http://") || i3.startsWith("https://")))){
                            if (i3.startsWith("asset://")) {
                               b = j.a(e, i3);
                            }else if(i3.startsWith("file://")){
                               b = j.c(i3);
                            }else if(i3.startsWith("bundle://")){
                               b = j.b(i3, f);
                            }else {
                               b = j.b(i3, f);
                            }
                         }
                         i1 = b;
                      }
                      uoc.c(i1, obj1, i);
                   }
                   obj = obj1;
                }else {
                }
                break;
              case 8:
                StrikethroughSpan strikethroug = new StrikethroughSpan();
                obj.setSpan(strikethroug, i.c, i.d, i2);
                uoc.d.add(new c$b(strikethroug, i.c, i.d));
                break;
              case 9:
                integer = Integer.valueOf(p.b(i.e));
                if (integer != null) {
                   BackgroundColorSpan uBackgroundC = new BackgroundColorSpan(integer.intValue());
                   obj.setSpan(uBackgroundC, i.c, i.d, i2);
                   uoc.d.add(new c$b(uBackgroundC, i.c, i.d));
                }else {
                }
                break;
              default:
             label_00c1 :
                i1 = p2;
          }
       }
       return obj;
    }
    public final void c(Drawable p0,SpannableString p1,g p2){
       int i1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "10")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       a uoa = new a(p0, "");
       g k = p2.k;
       int i = (k >= null && p2.l >= null)? n.b(k): p0.getIntrinsicWidth();
       if (p2.k >= null) {
          g l = p2.l;
          if (l >= null) {
             i1 = n.b(l);
          label_003b :
             a uoa1 = uoa.b(i, i1);
             uoa1.c((float)n.a(p2.p));
             uoa1.d((float)n.a(p2.q));
             uoa1.e((float)n.a(p2.n));
             g o = p2.o;
             p1.setSpan(uoa, o, (o + 1), 17);
             p2 = p2.o;
             this.d.add(new c$b(uoa, p2, (p2 + 1)));
             return;
          }
       }
       i1 = p0.getIntrinsicHeight();
       goto label_003b ;
    }
    public final void d(SpannableString p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "8")) {
          return;
       }
       if (p1.f <= null) {
          return;
       }
       AbsoluteSizeSpan uAbsoluteSiz = new AbsoluteSizeSpan((int)((float)p1.f * c.g));
       p0.setSpan(uAbsoluteSiz, p1.c, p1.d, 17);
       this.d.add(new c$b(uAbsoluteSiz, p1.c, p1.d));
       return;
    }
    public final void e(SpannableString p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "7")) {
          return;
       }
       int i = 0;
       if (("bold").equals(p1.h)) {
          i = 1;
       }else if(("bold_italic").equals(p1.h)){
          i = 3;
       }else if(("italic").equals(p1.h)){
          i = 2;
       }
       StyleSpan styleSpan = new StyleSpan(i);
       p0.setSpan(styleSpan, p1.c, p1.d, 17);
       this.d.add(new c$b(styleSpan, p1.c, p1.d));
       return;
    }
}
