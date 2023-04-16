package com.yxcorp.gifshow.notice.krn.m;
import com.facebook.react.uimanager.LayoutShadowNode;
import oec.i;
import android.text.TextPaint;
import java.lang.Integer;
import ekd.e0;
import android.content.Context;
import ync.a;
import lnc.a1;
import android.text.SpannableStringBuilder;
import java.lang.CharSequence;
import android.os.Build$VERSION;
import com.yxcorp.gifshow.notice.krn.m$a;
import yf.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Character;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.facebook.react.bridge.WritableMap;
import ze.n0;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactContext;
import android.app.Application;
import o56.a;
import java.lang.Number;
import com.facebook.yoga.YogaDirection;
import com.facebook.react.bridge.ReadableMap;
import android.net.Uri;
import java.util.Locale;
import android.content.res.Resources;
import android.net.Uri$Builder;
import java.lang.Math;
import qtb.u;
import android.text.TextUtils;
import java.lang.Float;
import ze.p;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import nfc.j;
import com.yxcorp.utility.TextUtils;
import android.text.DynamicLayout;
import android.text.Layout$Alignment;
import android.text.Layout;
import lg.e;
import android.text.Spannable;
import com.facebook.yoga.YogaMeasureMode;
import android.text.BoringLayout$Metrics;
import android.text.BoringLayout;
import lg.d;
import android.text.StaticLayout;
import android.text.StaticLayout$Builder;
import ze.n;
import java.util.ArrayList;
import com.yxcorp.gifshow.notice.krn.m$c;
import com.facebook.react.views.text.ReactForegroundColorSpan;
import yf.k;
import com.facebook.react.views.text.ReactBackgroundColorSpan;
import com.facebook.react.views.text.ReactAbsoluteSizeSpan;
import yf.c;
import android.content.res.AssetManager;
import yf.l;
import java.util.Iterator;
import java.util.Objects;
import com.facebook.react.bridge.ReadableArray;
import qtb.v;
import com.yxcorp.gifshow.notice.krn.m$b;
import oec.c;
import oec.j;
import oec.h;
import ak5.j;
import android.view.View;
import jl5.f;
import qtb.s;
import koc.c;
import com.yxcorp.gifshow.notice.krn.SocialReactTextShadowNode$2;
import koc.d;
import qtb.w;
import qtb.t;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.StringBuilder;
import vtb.b;
import vtb.a;
import wtb.b;
import wtb.a;
import android.graphics.Color;
import android.util.DisplayMetrics;
import ze.c;
import com.yxcorp.gifshow.notice.krn.style.ContentAlign;
import com.facebook.react.uimanager.j;
import yf.n;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.UiThreadUtil;

public class m extends LayoutShadowNode	// class@0021b0
{
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public String J;
    public String K;
    public boolean L;
    public final e M;
    public CharSequence b;
    public CharSequence c;
    public float d;
    public float e;
    public Integer f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public Integer l;
    public Integer m;
    public float n;
    public ReadableArray o;
    public ReadableArray p;
    public int q;
    public int r;
    public Spannable s;
    public final SpannableStringBuilder t;
    public boolean u;
    public boolean v;
    public s w;
    public boolean x;
    public int y;
    public ReadableArray z;
    public static final h N;
    public static final TextPaint O;

    static {
       m.N = new i();
       m.O = new TextPaint(1);
    }
    public void m(){
       super();
       this.d = 14.00f;
       this.e = 14.00f;
       this.f = Integer.valueOf(0x7f061f7d);
       boolean b = false;
       this.g = b;
       boolean b1 = true;
       this.h = b1;
       this.i = b;
       this.j = b;
       this.k = b;
       this.l = Integer.valueOf(a.c(e0.b));
       this.m = Integer.valueOf(a.h(e0.b));
       this.n = (float)a1.e(4.00f);
       this.q = -1;
       this.r = -1;
       this.t = new SpannableStringBuilder("");
       this.u = b;
       this.v = b;
       this.x = b;
       this.A = b;
       this.C = b;
       int i = (Build$VERSION.SDK_INT < 23)? 0: 1;
       this.D = i;
       this.E = b;
       this.F = b;
       this.G = b1;
       this.H = -1;
       this.I = -1;
       this.J = null;
       this.K = null;
       this.L = b;
       this.M = new m$a(this);
       this.w = new s();
       this.g();
       return;
    }
    public static boolean h(char p0,char p1){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object obj = PatchProxy.applyTwoRefs(Character.valueOf(p0), Character.valueOf(p1), null, om, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = ((Integer.toHexString(p0)).compareTo("dc00") >= 0 && ((Integer.toHexString(p0)).compareTo("dfff") <= 0 && !(Integer.toHexString(p1)).equals("200D")))? true: false;
       return b;
    }
    public void b(String p0,WritableMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "49")) {
          return;
       }
       n0 themedContex = this.getThemedContext();
       if (themedContex != null) {
          RCTEventEmitter jSModule = themedContex.getJSModule(RCTEventEmitter.class);
          if (jSModule != null) {
             jSModule.receiveEvent(this.getReactTag(), p0, p1);
          }
       }
       return;
    }
    public final Context c(){
       Application uApplication;
       n0 obj = PatchProxy.apply(null, this, m.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getThemedContext();
       if (obj == null) {
          uApplication = a.b();
       }
       return uApplication;
    }
    public final int d(){
       int i;
       m obj = PatchProxy.apply(null, this, m.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.C;
       if (this.getLayoutDirection() == YogaDirection.RTL) {
          if (obj == 5) {
             i = 3;
          }else if(obj == 3){
             i = 5;
          }
       }
       return i;
    }
    public void e(ReadableMap p0,boolean p1){
       Uri uri;
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, om, "6")) {
          return;
       }
       String str = "uri";
       String str1 = null;
       if (p0.hasKey(str)) {
          str = p0.getString(str);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          uri = PatchProxy.applyOneRefs(str, this, om, "8");
          if (uri != patchProxyRe) {
          }else if(str != null){
             try{
                uri = Uri.parse(str);
                if (uri.getScheme() == null) {
                   uri = str1;
                }
             }catch(java.lang.Exception e0){
             }
             if (uri == null) {
                Context uContext = this.c();
                Object obj = PatchProxy.applyTwoRefs(uContext, str, this, e0, "9");
                if (obj != patchProxyRe) {
                   str1 = obj;
                }else if(uContext != null && !str.isEmpty()){
                   str1 = new Uri$Builder().scheme("res").path(String.valueOf(uContext.getResources().getIdentifier((str.toLowerCase(Locale.getDefault())).replace("-", "_"), "drawable", uContext.getPackageName()))).build();
                }
             }
          }
          str1 = uri;
       }
    label_008c :
       om = this.s;
       if (p1) {
          om = this.t;
       }
       if (om != null && str1 != null) {
          int i = om.length();
          om.append("0");
          int i1 = om.length();
          Resources resources = this.c().getResources();
          int i2 = (int)Math.ceil((double)this.d);
          String str2 = "height";
          int i3 = (p0.hasKey(str2))? (int)Math.ceil(p0.getDouble(str2)): i2;
          String str3 = "width";
          if (p0.hasKey(str3)) {
             i2 = (int)Math.ceil(p0.getDouble(str3));
          }
          this.L = true;
          om.setSpan(new u(resources, i3, i2, str1), i, i1, 33);
       }
       return;
    }
    public void f(ReadableMap p0,int p1,boolean p2){
       m this;
       int i2;
       float f;
       m om = this;
       ReadableMap readableMap = p0;
       m om1 = m.class;
       if (PatchProxy.isSupport(om1) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, m.class, "5")) {
          return;
       }
       m s = om.s;
       String str = "text";
       if (readableMap.hasKey(str)) {
          str = readableMap.getString(str);
          m e = om.e;
          this = om.f;
          String str1 = "fontSize";
          if (readableMap.hasKey(str1)) {
             e = (float)readableMap.getDouble(str1);
          }
          str1 = "color";
          if (readableMap.hasKey(str1)) {
             this = Integer.valueOf(readableMap.getInt(str1));
          }
          str1 = "isBold";
          int i = 0;
          boolean booleanx = (readableMap.hasKey(str1))? readableMap.getBoolean(str1): false;
          if (!TextUtils.isEmpty(str)) {
             SpannableStringBuilder spannableStr = new SpannableStringBuilder(str);
             boolean i1 = spannableStr.length();
             if (PatchProxy.isSupport(om1)) {
                DynamicLayout obj = PatchProxy.applyTwoRefs(Boolean.FALSE, Float.valueOf(e), om, om1, "51");
                if (obj != PatchProxyResult.class) {
                   i2 = obj.intValue();
                label_00a2 :
                   int i3 = 34;
                   spannableStr.setSpan(new AbsoluteSizeSpan(i2), i, i1, i3);
                   spannableStr.setSpan(new ForegroundColorSpan(this.intValue()), i, i1, i3);
                   if (booleanx) {
                      spannableStr.setSpan(j.b(), i, i1, 33);
                   }
                   if (p2) {
                      om.t.append(spannableStr);
                   }else {
                      str = "needWrap";
                      i1 = (readableMap.hasKey(str))? readableMap.getBoolean(str): false;
                      String boolean str2 = "allowBreak";
                      str2 = (readableMap.hasKey(str2))? readableMap.getBoolean(str2): false;
                      f = (float)i2;
                      if (PatchProxy.isSupport(om1)) {
                         Object[] objArray = new Object[]{s,spannableStr,Integer.valueOf(p1),Float.valueOf(f),Boolean.valueOf(i1),Boolean.valueOf(str2)};
                         if (!PatchProxy.applyVoid(objArray, om, om1, "7")) {
                         }
                      }else if(s == null || TextUtils.x(spannableStr)){
                         TextPaint o = m.O;
                         o.setTextSize(f);
                         obj = new DynamicLayout(s, o, p1, Layout$Alignment.ALIGN_NORMAL, 0, om.n, false);
                         int lineCount = f.getLineCount();
                         i = (((int)Math.ceil((double)f.getLineWidth((lineCount - 1))) + (int)Math.ceil((double)Layout.getDesiredWidth(spannableStr, o))) > p1)? 1: 0;
                         if (!i1 || (lineCount == 1 || (!str2 && i))) {
                            s.append("\n");
                         }
                         s.append(spannableStr);
                      }
                   }
                }
             }
             if (Float.isNaN(e)) {
                f = 14.00f;
             }
             i2 = (int)Math.ceil((double)p.c(e));
             goto label_00a2 ;
          }
       }
    label_0170 :
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, m.class, "10")) {
          return;
       }
       if (!this.isVirtual()) {
          this.setMeasureFunction(this.M);
       }
       return;
    }
    public boolean getSelfLayoutFlag(){
       return true;
    }
    public Layout i(Spannable p0,float p1,YogaMeasureMode p2){
       int this;
       StaticLayout staticLayout;
       StaticLayout$Builder uBuilder;
       StaticLayout staticLayout1;
       if (PatchProxy.isSupport(m.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), p2, this, m.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       TextPaint o = m.O;
       o.setTextSize((float)this.w.c());
       BoringLayout$Metrics metrics = BoringLayout.isBoring(p0, o);
       float desiredWidth = (metrics == null)? Layout.getDesiredWidth(p0, o): Float.NaN;
       boolean b = true;
       this = 0;
       int i = (p2 == YogaMeasureMode.UNDEFINED || p1 < 0)? 1: 0;
       Layout$Alignment aLIGN_NORMAL = Layout$Alignment.ALIGN_NORMAL;
       int i1 = this.d();
       if (i1 != b) {
          if (i1 != 3) {
             if (i1 == 5) {
                aLIGN_NORMAL = Layout$Alignment.ALIGN_OPPOSITE;
             }
          }else {
             aLIGN_NORMAL = Layout$Alignment.ALIGN_NORMAL;
          }
       }else {
          aLIGN_NORMAL = Layout$Alignment.ALIGN_CENTER;
       }
       Layout$Alignment uAlignment = aLIGN_NORMAL;
       aLIGN_NORMAL = 28;
       float f = 0x3f800000;
       m om = 23;
       if (metrics == null && (i || (!d.a(desiredWidth) && desiredWidth - p1 <= 0))) {
          int i2 = (int)Math.ceil((double)desiredWidth);
          i = Build$VERSION.SDK_INT;
          if (i < om) {
             staticLayout = new StaticLayout(p0, o, i2, uAlignment, 0x3f800000, this.n, this.G);
          }else {
             uBuilder = StaticLayout$Builder.obtain(p0, this, p0.length(), o, i2).setAlignment(uAlignment).setLineSpacing(this.n, f).setIncludePad(this.G).setBreakStrategy(this.D).setHyphenationFrequency(this.E);
             if (i >= 26) {
                uBuilder.setJustificationMode(this.F);
             }
             if (i >= aLIGN_NORMAL) {
                uBuilder.setUseLineSpacingFromFallbacks(b);
             }
             staticLayout1 = uBuilder.build();
          }
       }else if(metrics != null && (i || (float)metrics.width - p1 <= 0)){
          staticLayout1 = BoringLayout.make(p0, o, metrics.width, uAlignment, 0x3f800000, this.n, metrics, this.G);
       }else {
          i = Build$VERSION.SDK_INT;
          if (i < om) {
             staticLayout = new StaticLayout(p0, o, (int)p1, uAlignment, 0x3f800000, this.n, this.G);
          }else {
             uBuilder = StaticLayout$Builder.obtain(p0, this, p0.length(), o, (int)p1).setAlignment(uAlignment).setLineSpacing(this.n, f).setIncludePad(this.G).setBreakStrategy(this.D).setHyphenationFrequency(this.E);
             if (i >= aLIGN_NORMAL) {
                uBuilder.setUseLineSpacingFromFallbacks(b);
             }
             staticLayout1 = uBuilder.build();
          }
       }
       return i;
    }
    public void markUpdated(){
       if (PatchProxy.applyVoid(null, this, m.class, "14")) {
          return;
       }
       super.markUpdated();
       super.dirty();
       return;
    }
    public void onBeforeLayout(n p0){
       m$c a;
       int i3;
       String str5;
       int i7;
       int i8;
       m obj2;
       ReadableMap map;
       String str6;
       ReadableMap map1;
       a uoa2;
       String str7;
       int i9;
       int iterator2;
       boolean b = this;
       m om = m.class;
       if (PatchProxy.applyVoidOneRefs(p0, b, om, "12")) {
          return;
       }
       Object[] objArray = null;
       SpannableStringBuilder spannableStr = PatchProxy.apply(objArray, b, om, "18");
       if (spannableStr != PatchProxyResult.class) {
       }else {
          SpannableStringBuilder spannableStr1 = new SpannableStringBuilder();
          ArrayList uArrayList = new ArrayList();
          int i = 0;
          if (!PatchProxy.applyVoidThreeRefs(this, spannableStr1, uArrayList, null, m.class, "17")) {
             iterator2 = spannableStr1.length();
             if (iterator2 >= 0) {
                if (b.x != null) {
                   uArrayList.add(new m$c(i, iterator2, new ReactForegroundColorSpan(b.y)));
                }
                if (b.A != null) {
                   uArrayList.add(new m$c(i, iterator2, new ReactBackgroundColorSpan(b.B)));
                }
                uArrayList.add(new m$c(i, iterator2, new ReactAbsoluteSizeSpan(b.w.c())));
                c uoc2 = -1;
                if (b.H == uoc2 && (b.I != uoc2 || b.J != null)) {
                   c uoc3 = new c(b.H, b.I, b.K, b.J, this.c().getAssets());
                   uArrayList.add(new m$c(i, iterator2, uoc2));
                }
                uArrayList.add(new m$c(i, iterator2, new l(this.getReactTag())));
             }
          }
          Iterator iterator = uArrayList.iterator();
          int i1 = 0;
          int i2 = 34;
          String str = "1";
          while (iterator.hasNext()) {
             m$c uoc = iterator.next();
             Objects.requireNonNull(uoc);
             m$c uoc1 = m$c.class;
             if (!PatchProxy.isSupport(uoc1) || !PatchProxy.applyVoidTwoRefs(spannableStr1, Integer.valueOf(i1), uoc, uoc1, str)) {
                a = uoc.a;
                if (a == null) {
                   i2 = 18;
                }
                i2 = i2 & -16711681;
                i3 = i1 << 16;
                i3 = i3 & 0xff0000;
                i2 = i2 | i3;
                spannableStr1.setSpan(uoc.c, a, uoc.b, i2);
             }
             i1 = i1 + 1;
          }
          String str1 = 1;
          if (!PatchProxy.applyVoid(objArray, b, om, str) && (b.p != null && b.v == null)) {
             b.t.clear();
             b.v = str1;
             iterator2 = 0;
             while (iterator2 < b.p.size()) {
                ReadableMap map2 = b.p.getMap(iterator2);
                if (map2 != null) {
                   String str8 = "type";
                   if (map2.hasKey(str8)) {
                      str8 = map2.getString(str8);
                      if (("Text").equals(str8)) {
                         b.f(map2, i, str1);
                      }
                      if (("Image").equals(str8)) {
                         b.e(map2, str1);
                      }
                   }
                }
                iterator2++;
             }
          }
          m Spannable iterator1 = PatchProxy.applyOneRefs(spannableStr1, b, om, "19");
          if (iterator1 != PatchProxyResult.class) {
             spannableStr1 = iterator1;
          }else {
             iterator1 = b.b;
             if (iterator1 != null) {
                if (iterator1 instanceof SpannableStringBuilder) {
                }else {
                   String[] stringArray = new String[str1];
                   h n = m.N;
                   h oh = n;
                   h oh1 = n;
                   iterator1 = oh.b(iterator1.toString(), new v(b), new m$b(b), stringArray, b.j);
                   if (b.g != null) {
                      oh1.c(iterator1, stringArray[i], new m$b(b));
                   }
                }
                if (j.o().t()) {
                   iterator1 = j.o().q(iterator1, objArray, (float)b.w.c(), objArray);
                   if (iterator1 instanceof SpannableStringBuilder) {
                   }else {
                      iterator1 = new SpannableStringBuilder(iterator1);
                   }
                }
                spannableStr1 = spannableStr1.append(iterator1);
             }
          }
          if (b.k != null && (!PatchProxy.applyVoidOneRefs(spannableStr1, b, om, "2") && !TextUtils.x(spannableStr1))) {
             s os = new s();
             os.l(i);
             os.m(new SocialReactTextShadowNode$2(b, new m$b(b)));
             os.g(spannableStr1);
          }
       label_01e4 :
          if (!TextUtils.x(b.t)) {
             spannableStr1.setSpan(new AbsoluteSizeSpan(b.w.c()), i, spannableStr1.length(), i2);
             spannableStr = new SpannableStringBuilder(b.t).append(spannableStr1);
          }else {
             spannableStr = spannableStr1;
          }
          w ow = new w(b);
          if (!PatchProxy.applyVoidTwoRefs(spannableStr, ow, objArray, t.class, str)) {
             Matcher matcher = t.a.matcher(spannableStr);
             while (matcher.find()) {
                int i4 = matcher.start();
                i3 = matcher.end();
                String str2 = matcher.group(1);
                String str3 = matcher.group(2);
                String str4 = "\(T"+str3+"\)";
                int i5 = (TextUtils.x(str2))? 0: str2.length();
                i = i3 - str4.length();
                int i6 = 33;
                spannableStr.setSpan(new b(), i, i3, i6);
                i3 = t.b + i4;
                spannableStr.setSpan(new b(), i4, i3, i6);
                i = (str3 != null)? Integer.parseInt(str3): 0;
                ow.a = i;
                a uoa = new a();
                b uob = PatchProxy.apply(objArray, ow, w.class, "2");
                if (uob != PatchProxyResult.class) {
                }else {
                   obj2 = ow.b.z;
                   if (obj2 != null) {
                      map = obj2.getMap(ow.a);
                      if (map != null) {
                         str3 = "paddingLeftRrght";
                         if (map.hasKey(str3)) {
                            i6 = map.getInt(str3);
                         label_02ad :
                            b uob1 = new b();
                            i9 = 2;
                            uob1.d(i9);
                            uob1.c(i6);
                            uob1.b(i6);
                            uob1.a(i9);
                            uob = uob1;
                         }
                      }
                      i6 = 0;
                      goto label_02ad ;
                   }else {
                      i9 = 2;
                      uob = new b();
                      uob.d(i9);
                      uob.c(i9);
                      uob.b(i9);
                      uob.a(i9);
                   }
                }
                if (uob != null && !PatchProxy.applyVoidOneRefs(uob, uoa, a.class, "2")) {
                   uoa.e = uob.a;
                   uoa.f = uob.b;
                   uoa.g = uob.c;
                   uoa.h = uob.d;
                }
                a uoa1 = PatchProxy.apply(objArray, ow, w.class, str);
                if (uoa1 != PatchProxyResult.class) {
                }else {
                   obj2 = ow.b.z;
                   if (obj2 != null) {
                      map = obj2.getMap(ow.a);
                      if (map != null) {
                         str3 = "cornerRadius";
                         if (map.hasKey(str3)) {
                            i7 = map.getInt(str3);
                         label_0313 :
                            if (map != null) {
                               str6 = "backgroundColor";
                               if (map.hasKey(str6)) {
                                  str5 = map.getString(str6);
                               label_0323 :
                                  uoa2 = new a();
                                  uoa2.a(i7);
                                  uoa2.a = Color.parseColor(str5);
                                  uoa1 = uoa2;
                               }
                            }
                            Object[] objArray1 = objArray;
                            goto label_0323 ;
                         }
                      }
                      i7 = 0;
                      goto label_0313 ;
                   }else {
                      uoa1 = new a();
                      uoa1.a(4);
                   }
                }
                if (uoa1 != null && !PatchProxy.applyVoidOneRefs(uoa1, uoa, a.class, str)) {
                   uoa.l = uoa1.a;
                   uoa.m = uoa1.b;
                }
                str5 = "3";
                Object[] obj = PatchProxy.apply(objArray, ow, w.class, str5);
                if (obj != PatchProxyResult.class) {
                   i7 = obj.intValue();
                }else {
                   m z = ow.b.z;
                   uoa2 = 0x7f0606da;
                   if (z != null) {
                      map1 = z.getMap(ow.a);
                      if (map1 != null) {
                         str3 = "color";
                         if (map1.hasKey(str3)) {
                            str7 = map1.getString(str3);
                         label_037d :
                            if (str7 != null) {
                               i7 = Color.parseColor(str7);
                            }else {
                               i7 = a1.a(uoa2);
                            }
                         }
                      }
                      str7 = null;
                      goto label_037d ;
                   }else {
                      i7 = a1.a(uoa2);
                   }
                }
                uoa.c = i7;
                m obj1 = PatchProxy.apply(null, ow, w.class, "4");
                if (obj1 != PatchProxyResult.class) {
                   i8 = obj1.intValue();
                }else {
                   obj1 = ow.b.z;
                   if (obj1 != null) {
                      map1 = obj1.getMap(ow.a);
                      if (map1 != null) {
                         str3 = "fontSize";
                         if (map1.hasKey(str3)) {
                            i8 = map1.getInt(str3);
                         }
                      }
                   }
                   i8 = 9;
                }
                float f = (float)i8 * c.e().density;
                i8 = (int)f;
                if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i8), uoa, a.class, str5)) {
                   uoa.d = i8;
                   uoa.b.setTextSize((float)i8);
                }
                uoa.n = true;
                obj2 = PatchProxy.apply(null, ow, w.class, "5");
                if (obj2 != PatchProxyResult.class) {
                   i6 = obj2.intValue();
                }else {
                   obj2 = ow.b.z;
                   if (obj2 != null) {
                      map = obj2.getMap(ow.a);
                      if (map != null) {
                         str3 = "leftMargin";
                         if (map.hasKey(str3)) {
                            i6 = map.getInt(str3);
                         }
                      }
                   }
                   i6 = 0;
                }
                uoa.i = i6;
                obj2 = PatchProxy.apply(null, ow, w.class, "6");
                if (obj2 != PatchProxyResult.class) {
                   i6 = obj2.intValue();
                }else {
                   obj2 = ow.b.z;
                   if (obj2 != null) {
                      map = obj2.getMap(ow.a);
                      if (map != null) {
                         str3 = "rightMargin";
                         if (map.hasKey(str3)) {
                            i6 = map.getInt(str3);
                         }
                      }
                   }
                   i6 = 0;
                }
                uoa.j = i6;
                obj = null;
                str5 = PatchProxy.apply(obj, ow, w.class, "7");
                if (str5 != PatchProxyResult.class) {
                }else {
                   obj2 = ow.b.z;
                   if (obj2 != null) {
                      map = obj2.getMap(ow.a);
                      if (map != null) {
                         str6 = "fontWeight";
                         if (map.hasKey(str6)) {
                            str5 = map.getString(str6);
                         }
                      }
                   }
                   str5 = "normal";
                }
                uoa.k = ("bold").equals(str5);
                i4 = i4 + i5;
                spannableStr.setSpan(uoa, i3, i4, 17);
                objArray = obj;
                str4 = null;
             }
          }
       }
       b.s = spannableStr;
       this.markUpdated();
       return;
    }
    public void onCollectExtraUpdates(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "15")) {
          return;
       }
       super.onCollectExtraUpdates(p0);
       m ts = this.s;
       if (ts != null) {
          n on = new n(ts, -1, this.L, this.getPadding(4), this.getPadding(1), this.getPadding(5), this.getPadding(3), this.d(), this.D, this.F);
          p0.h(this.getReactTag(), v0);
       }
       return;
    }
    public void setActionTitle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "21")) {
          return;
       }
       this.c = p0;
       this.markUpdated();
       return;
    }
    public void setAppendElements(ReadableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "41")) {
          return;
       }
       this.o = p0;
       this.u = false;
       this.markUpdated();
       return;
    }
    public void setAtColor(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "39")) {
          return;
       }
       this.markUpdated();
       return;
    }
    public void setAtHighlightColor(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "40")) {
          return;
       }
       this.markUpdated();
       return;
    }
    public void setBackgroundColor(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "48")) {
          return;
       }
       if (this.isVirtual()) {
          boolean b = (p0 != null)? true: false;
          this.A = b;
          if (b) {
             this.B = p0.intValue();
          }
          this.markUpdated();
       }
       return;
    }
    public void setColor(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "47")) {
          return;
       }
       boolean b = (p0 != null)? true: false;
       this.x = b;
       if (b) {
          this.y = p0.intValue();
       }
       this.markUpdated();
       return;
    }
    public void setContactColor(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "30")) {
          return;
       }
       this.f = p0;
       this.markUpdated();
       return;
    }
    public void setContactFontSize(float p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, om, "29")) {
          return;
       }
       this.e = p0;
       this.markUpdated();
       return;
    }
    public void setContent(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "20")) {
          return;
       }
       this.b = p0;
       this.u = false;
       this.v = false;
       this.markUpdated();
       return;
    }
    public void setContentColor(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "28")) {
          return;
       }
       this.setColor(p0);
       return;
    }
    public void setContentFontFamily(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "23")) {
          return;
       }
       this.J = p0;
       this.markUpdated();
       return;
    }
    public void setContentFontSize(float p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, om, "22")) {
          return;
       }
       this.w.k(p0);
       this.d = p0;
       this.w.j(false);
       this.markUpdated();
       return;
    }
    public void setContentIsBold(boolean p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, om, "24")) {
          return;
       }
       this.I = p0;
       this.markUpdated();
       return;
    }
    public void setEnableClickableSpan(boolean p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, om, "35")) {
          return;
       }
       this.h = p0;
       this.markUpdated();
       return;
    }
    public void setEnableTagParser(boolean p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, om, "26")) {
          return;
       }
       this.k = p0;
       this.markUpdated();
       return;
    }
    public void setHeadElements(ReadableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "42")) {
          return;
       }
       this.p = p0;
       this.v = false;
       this.markUpdated();
       return;
    }
    public void setHidesAtSymbol(boolean p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, om, "27")) {
          return;
       }
       this.j = p0;
       this.markUpdated();
       return;
    }
    public void setLineSpacing(float p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, om, "45")) {
          return;
       }
       if (p0 >= 0) {
          this.n = (float)a1.e(p0);
          this.markUpdated();
       }
       return;
    }
    public void setLinkColor(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "33")) {
          return;
       }
       this.l = p0;
       this.markUpdated();
       return;
    }
    public void setLinkCoverUniversal(boolean p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, om, "32")) {
          return;
       }
       this.g = p0;
       this.markUpdated();
       return;
    }
    public void setLinkFontSize(float p0){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, m.class, "31")) {
          return;
       }
       this.markUpdated();
       return;
    }
    public void setLinkHighlightColor(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "34")) {
          return;
       }
       this.m = p0;
       this.markUpdated();
       return;
    }
    public void setLinkIsBold(boolean p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, om, "25")) {
          return;
       }
       this.i = p0;
       this.markUpdated();
       return;
    }
    public void setMaxLineCount(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "44")) {
          return;
       }
       int i = (!p0.intValue())? -1: p0.intValue();
       this.r = i;
       this.markUpdated();
       return;
    }
    public void setNumberOfLines(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "43")) {
          return;
       }
       int i = (!p0.intValue())? -1: p0.intValue();
       this.q = i;
       this.markUpdated();
       return;
    }
    public void setTagColor(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "36")) {
          return;
       }
       this.markUpdated();
       return;
    }
    public void setTagFontSize(float p0){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, m.class, "38")) {
          return;
       }
       this.markUpdated();
       return;
    }
    public void setTagHighlightColor(Integer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "37")) {
          return;
       }
       this.markUpdated();
       return;
    }
    public void setTextInsertStyle(ReadableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "46")) {
          return;
       }
       this.z = p0;
       this.markUpdated();
       return;
    }
    public void synchronouslyUpdateLayoutInfoForKdsList(ViewManager p0,View p1){
       m om = m.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, om, "53")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, om, "52");
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else {
          m ts = this.s;
          if (ts != null) {
             n on = new n(ts, -1, this.L, this.getPadding(4), this.getPadding(1), this.getPadding(5), this.getPadding(3), this.d(), this.D, this.F);
          }
       }
       p0.updateExtraData(p1, objArray);
       return;
    }
}
