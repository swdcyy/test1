package com.tachikoma.core.component.text.richtext.RichTextHelper;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.Object;
import android.text.SpannableString;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.tachikoma.core.component.text.richtext.RichTextHelper$4;
import com.tachikoma.core.component.text.richtext.RichTextHelper$3;
import com.tachikoma.core.component.text.TKText;
import java.util.List;
import ip8.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.View;
import com.tachikoma.core.component.e;
import androidx.appcompat.widget.AppCompatTextView;
import android.text.TextPaint;
import android.widget.TextView;
import java.lang.StringBuilder;
import java.util.Iterator;
import com.tachikoma.core.component.text.richtext.RichTextHelper$a;
import iq8.n;
import com.tachikoma.core.component.text.richtext.URLSpanEx;
import android.text.style.UnderlineSpan;
import android.text.style.ForegroundColorSpan;
import iq8.p;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import com.tachikoma.core.component.text.richtext.a;
import com.tachikoma.core.component.text.richtext.b;
import android.content.Context;
import com.tachikoma.core.component.TKBaseNativeModule;
import com.tachikoma.core.bridge.d;
import brd.a0;
import com.tachikoma.core.utility.b;
import zp8.a;
import brd.z;
import io.reactivex.android.schedulers.a;
import com.tachikoma.core.component.text.richtext.c;
import oo8.b;
import com.tachikoma.core.component.text.richtext.d;
import erd.g;
import crd.b;
import com.tachikoma.core.component.text.richtext.VerticalAlignSpan;
import java.lang.Exception;
import java.lang.Throwable;
import wp8.a;
import java.lang.Float;
import com.tachikoma.core.bridge.c;
import ip8.e;
import android.text.style.BackgroundColorSpan;
import hp8.e;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import com.tachikoma.core.component.text.CustomTypefaceSpan;
import java.util.Map;
import com.tachikoma.core.component.text.richtext.e;
import com.tachikoma.core.component.text.a$d;
import com.tachikoma.core.component.text.a;
import android.text.style.AbsoluteSizeSpan;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.text.style.StyleSpan;
import java.util.Objects;
import android.text.style.StrikethroughSpan;
import ip8.f;
import com.tachikoma.core.component.text.richtext.OffsetYSpan;
import ip8.b;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.JsValueRef;
import tx4.y;
import com.tkruntime.v8.V8Value;

public class RichTextHelper	// class@000da1
{
    public static final float a;
    public static float b;
    public static boolean c;

    static {
       RichTextHelper.a = c.c(Resources.getSystem()).density;
    }
    public void RichTextHelper(){
       super();
    }
    public static void a(SpannableString p0,int p1,int p2){
       if (PatchProxy.isSupport(RichTextHelper.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, RichTextHelper.class, "14")) {
          return;
       }
       p0.setSpan(new RichTextHelper$4(), p1, p2, 17);
       return;
    }
    public static void b(SpannableString p0,int p1,int p2){
       if (PatchProxy.isSupport(RichTextHelper.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, RichTextHelper.class, "13")) {
          return;
       }
       p0.setSpan(new RichTextHelper$3(), p1, p2, 17);
       return;
    }
    public static void c(TKText p0,List p1,d p2){
       RichTextHelper$a e;
       int i;
       int i6;
       Object[] objArray2;
       float f1;
       Object[] obj1;
       String obj2;
       String str1;
       b uob2;
       Object obj4;
       TKText tKText = p0;
       d uod = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, RichTextHelper.class, "4")) {
          return;
       }
       if (p1 == null || p1.isEmpty()) {
          if (uod) {
             uod.a(new SpannableString(""));
          }
          return;
       }else {
          int b = true;
          if (RichTextHelper.c) {
             tKText.setRichTextHasDecoration(b);
             if (!TextUtils.isEmpty(p0.getTextDecoration())) {
                p0.getView().getPaint().setFlags(((p0.getView().getPaintFlags() & 0xf7) & 0xef));
             }
          }else {
             tKText.setRichTextHasDecoration(0);
          }
          StringBuilder str = "";
          Iterator iterator = p1.iterator();
          Object[] objArray = null;
          while (iterator.hasNext()) {
             RichTextHelper$a uoa = iterator.next();
             if (TextUtils.isEmpty(uoa.i) || (!TextUtils.isEmpty(uoa.i) && !TextUtils.isEmpty(uoa.a))) {
                e = uoa.e;
                if (e > null) {
                   if ((float)e - RichTextHelper.b > 0) {
                      RichTextHelper.b = (float)e;
                   }
                }else if(p0.getFontSize() > 0){
                   if ((float)p0.getFontSize() - RichTextHelper.b > 0) {
                      RichTextHelper.b = (float)p0.getFontSize();
                   }
                }else {
                   float f = n.g(p0.getView().getTextSize());
                   if (RichTextHelper.b - f < 0) {
                      RichTextHelper.b = f;
                   }
                }
             }
             if (RichTextHelper.c && (TextUtils.isEmpty(uoa.h) && !TextUtils.isEmpty(p0.getTextDecoration()))) {
                uoa.h = p0.getTextDecoration();
             }
          label_00e0 :
             if (TextUtils.isEmpty(uoa.a)) {
                e = uoa.o;
                if (e != null) {
                   uoa.a = e;
                }
             }
             if (!TextUtils.isEmpty(uoa.i) && TextUtils.isEmpty(uoa.a)) {
                uoa.a = " ";
             }
             if (TextUtils.isEmpty(uoa.i) && uoa.m - objArray) {
                uoa.a = " "+uoa.a;
                i = uoa.v + b;
                uoa.v = i;
             }
             if (TextUtils.isEmpty(uoa.i) && uoa.l - objArray) {
                uoa.a = uoa.a+" ";
                i = uoa.w + b;
                uoa.w = i;
             }
             if (TextUtils.isEmpty(uoa.i) && uoa.t - objArray) {
                uoa.a = " "+uoa.a+" ";
                i = uoa.v + b;
                uoa.v = i;
                i = uoa.w + b;
                uoa.w = i;
             }
             str = str+uoa.a;
          }
          SpannableString spannableStr = new SpannableString(str);
          Iterator iterator1 = p1.iterator();
          int i1 = 0;
          while (iterator1.hasNext()) {
             f obj = iterator1.next();
             int i2 = (obj.a).length();
             int i3 = 3;
             i = 2;
             int i4 = 5;
             int i5 = 4;
             if (!TextUtils.isEmpty(obj.o)) {
                i6 = i1 + i2;
                if (PatchProxy.isSupport(RichTextHelper.class)) {
                   objArray = new Object[i4];
                   objArray[0] = tKText;
                   objArray[b] = spannableStr;
                   objArray[i] = obj;
                   objArray[i3] = Integer.valueOf(i1);
                   objArray[i5] = Integer.valueOf(i6);
                   if (!PatchProxy.applyVoid(objArray, null, RichTextHelper.class, "5")) {
                   }
                }else if(obj.o != null){
                   i3 = 17;
                   spannableStr.setSpan(new URLSpanEx(obj.o), i1, i6, i3);
                   spannableStr.setSpan(new UnderlineSpan(), i1, i6, i3);
                   if (obj.p != null) {
                      spannableStr.setSpan(new ForegroundColorSpan(p.b(obj.p)), i1, i6, i3);
                   }
                   p0.getView().setMovementMethod(LinkMovementMethod.getInstance());
                }
             }else if(obj.q != null){
                i6 = i1 + i2;
                if (PatchProxy.isSupport(RichTextHelper.class)) {
                   objArray2 = new Object[i4];
                   objArray2[0] = tKText;
                   objArray2[b] = spannableStr;
                   objArray2[i] = obj;
                   objArray2[3] = Integer.valueOf(i1);
                   objArray2[4] = Integer.valueOf(i6);
                   if (!PatchProxy.applyVoid(objArray2, null, RichTextHelper.class, "6")) {
                   }
                }else if(obj.o != null){
                   p0.getView().setMovementMethod(LinkMovementMethod.getInstance());
                   spannableStr.setSpan(new a(obj, tKText), i1, i6, 17);
                }
             }
          label_0251 :
             int i7 = 6;
             if (!TextUtils.isEmpty(obj.i)) {
                int i8 = i1 + i2;
                if (PatchProxy.isSupport(RichTextHelper.class)) {
                   Object[] objArray1 = new Object[i7];
                   objArray1[0] = tKText;
                   objArray1[b] = spannableStr;
                   objArray1[i] = obj;
                   objArray1[3] = Integer.valueOf(i1);
                   objArray1[4] = Integer.valueOf(i8);
                   objArray1[i4] = uod;
                   if (PatchProxy.applyVoid(objArray1, null, RichTextHelper.class, "7")) {
                   label_02fc :
                      i6 = obj;
                      b = i1;
                   }
                }else {
                   uob2 = 4;
                }
                b uob1 = i4;
                uob2 = i4;
                Object obj3 = obj;
                b = i1;
                uob1 = new b(obj, p0, spannableStr, i1, i8, p2);
                if (PatchProxy.applyVoidThreeRefs(p0, obj3, uob2, null, RichTextHelper.class, "17")) {
                   obj4 = obj3;
                }else {
                   obj4 = obj3;
                   a0 uoa0 = b.g(p0.getContext(), obj4.i, p0.getTKJSContext().e(), p0.getRootDir(), 0, 0);
                   if (uoa0 == null) {
                      a.c("richText loadDrawable single is null or empty: "+obj4.i);
                   }else {
                      uoa0.G(a.c()).R(new c(tKText, uob2), new d(obj4));
                   }
                }
             }else {
                goto label_02fc ;
             }
             i1 = b + i2;
             if (PatchProxy.isSupport(RichTextHelper.class)) {
                objArray2 = new Object[i7];
                objArray2[0] = tKText;
                objArray2[1] = spannableStr;
                i4 = 2;
                objArray2[i4] = i6;
                i3 = 3;
                objArray2[i3] = Integer.valueOf(b);
                objArray2[4] = Integer.valueOf(i1);
                i = 5;
                objArray2[i] = uod;
                if (PatchProxy.applyVoid(objArray2, null, RichTextHelper.class, "8")) {
                label_0875 :
                   i4 = 0;
                }else if(PatchProxy.isSupport(RichTextHelper.class)){
                   objArray2 = new Object[i];
                   objArray2[0] = tKText;
                   objArray2[1] = i6;
                   objArray2[i4] = spannableStr;
                   objArray2[i3] = Integer.valueOf(b);
                   objArray2[4] = Integer.valueOf(i1);
                   if (!PatchProxy.applyVoid(objArray2, null, RichTextHelper.class, "9")) {
                   label_0355 :
                      if (("top").equals(i6.s) || ("middle").equals(i6.s)) {
                         i5 = n.b(i6.e);
                         if (i5 <= 0) {
                            i5 = n.b(p0.getFontSize());
                            if (i5 <= 0) {
                               i5 = (int)p0.getView().getTextSize();
                            }
                         }
                         spannableStr.setSpan(new VerticalAlignSpan(n.a(RichTextHelper.b), i5, i6.s), b, i1, 17);
                      }
                   }
                }else {
                   goto label_0355 ;
                }
                if (PatchProxy.isSupport(RichTextHelper.class)) {
                   objArray2 = new Object[i];
                   objArray2[0] = tKText;
                   objArray2[1] = i6;
                   objArray2[i4] = spannableStr;
                   objArray2[3] = Integer.valueOf(b);
                   objArray2[4] = Integer.valueOf(i1);
                   if (!PatchProxy.applyVoid(objArray2, null, RichTextHelper.class, "10")) {
                   label_03c0 :
                      if (!TextUtils.isEmpty(i6.r)) {
                         String[] stringArray = (i6.r).split(" ");
                         if (stringArray.length != 4) {
                            a.d(p0.getTKJSContext(), new Exception("text shadow is error "+i6.r));
                         }else {
                            i3 = 3;
                            float[] uofloatArray = new float[i3];
                            i7 = 0;
                            while (i7 < i3) {
                               String str4 = "px";
                               uofloatArray[i7] = (((stringArray[i7]).toLowerCase()).contains(str4))? Float.parseFloat((stringArray[i7]).replace(str4, "")): (float)n.a(Float.parseFloat(stringArray[i7]));
                               i7 = i7 + 1;
                               i3 = 3;
                            }
                            spannableStr.setSpan(new e(uofloatArray[i4], uofloatArray[0], uofloatArray[1], p.c(stringArray[3], p0.getJSContext())), b, i1, 17);
                         }
                      }
                   }
                }else {
                   goto label_03c0 ;
                }
                RichTextHelper$a b1 = i6.b;
                if (b1 != null && (i6.o == null || i6.p == null)) {
                   i5 = 17;
                   spannableStr.setSpan(new ForegroundColorSpan(p.b(b1)), b, i1, i5);
                }else {
                   i5 = 17;
                }
                e = i6.c;
                if (e != null) {
                   spannableStr.setSpan(new BackgroundColorSpan(p.b(e)), b, i1, i5);
                }
                if (PatchProxy.isSupport(RichTextHelper.class)) {
                   Object[] objArray3 = new Object[5];
                   objArray3[0] = tKText;
                   objArray3[1] = i6;
                   objArray3[i4] = spannableStr;
                   objArray3[3] = Integer.valueOf(b);
                   objArray3[4] = Integer.valueOf(i1);
                   if (!PatchProxy.applyVoid(objArray3, null, RichTextHelper.class, "18")) {
                   label_0498 :
                      if (!TextUtils.isEmpty(i6.d) && !TextUtils.isEmpty(p0.getRootDir())) {
                         str1 = (p0.getRootDir()).concat(i6.d);
                         String str2 = ".ttf";
                         String str3 = ".otf";
                         Typeface typeface1 = ((i6.d).endsWith(str2) || (i6.d).endsWith(str3))? e.c().d(i6.d, 0, p0.getContext().getAssets(), str1): null;
                         if (typeface1 == null) {
                            typeface1 = e.c().d(i6.d+str2, 0, p0.getContext().getAssets(), (p0.getRootDir()).concat(i6.d+str2));
                         }
                         if (typeface1 == null) {
                            typeface1 = e.c().d(i6.d+str3, 0, p0.getContext().getAssets(), (p0.getRootDir()).concat(i6.d+str3));
                         }
                         if (typeface1 != null) {
                            spannableStr.setSpan(new CustomTypefaceSpan(null, typeface1), b, i1, 17);
                         }
                      }
                   }
                }else {
                   goto label_0498 ;
                }
                if (PatchProxy.isSupport(RichTextHelper.class)) {
                   objArray2 = new Object[]{tKText,i6,spannableStr,Integer.valueOf(b),Integer.valueOf(i1),uod};
                   if (!PatchProxy.applyVoid(objArray2, null, RichTextHelper.class, "19")) {
                   label_058e :
                      b1 = i6.u;
                      if (b1 != null && !b1.isEmpty()) {
                         str1 = i6.u.get("src");
                         obj2 = i6.u.get("fileName");
                         if (!TextUtils.isEmpty(obj2)) {
                            Typeface typeface = e.c().b(obj2, 0);
                            if (typeface != null) {
                               spannableStr.setSpan(new CustomTypefaceSpan(null, typeface), b, i1, 17);
                            }else {
                               a.b(p0.getContext(), str1, obj2, new e(spannableStr, b, i1, uod));
                            }
                         }
                      }
                   }
                }else {
                   goto label_058e ;
                }
                b1 = i6.e;
                if (b1 <= null) {
                   i5 = p0.getFontSize();
                }
                if (b1 > 0) {
                   f1 = (float)b1 * RichTextHelper.a;
                   spannableStr.setSpan(new AbsoluteSizeSpan((int)f1), b, i1, 17);
                }
                f uof = -1;
                if (PatchProxy.isSupport(RichTextHelper.class)) {
                   Object[] objArray4 = new Object[]{tKText,i6,spannableStr,Integer.valueOf(b),Integer.valueOf(i1)};
                   obj1 = null;
                   if (!PatchProxy.applyVoid(objArray4, obj1, RichTextHelper.class, "11")) {
                   label_061d :
                      if (!TextUtils.isEmpty(i6.f)) {
                         b1 = i6.f;
                         obj2 = PatchProxy.applyOneRefs(b1, obj1, RichTextHelper.class, "16");
                         if (obj2 != PatchProxyResult.class) {
                            i5 = obj2.intValue();
                         }else if(b1.length() == 3 && (b1.endsWith("00") && (b1.charAt(0) <= '9' && b1.charAt(0) >= '1'))){
                            i5 = b1.charAt(0) - 48;
                            i5 = i5 * 100;
                         }else {
                         label_0660 :
                            i5 = -1;
                         }
                      }else {
                         goto label_0660 ;
                      }
                      StyleSpan styleSpan = (i5 >= 500 || ("bold").equals(i6.f))? 1: null;
                      i4 = (!TextUtils.isEmpty(i6.g) && (i6.g).equalsIgnoreCase("italic"))? 1: 0;
                      if (styleSpan && i4) {
                         spannableStr.setSpan(new StyleSpan(3), b, i1, 17);
                      }else {
                         i3 = 17;
                         if (styleSpan != null) {
                            spannableStr.setSpan(new StyleSpan(1), b, i1, i3);
                         }else if(i4){
                            i4 = 2;
                            spannableStr.setSpan(new StyleSpan(i4), b, i1, i3);
                         label_06b2 :
                            if (PatchProxy.isSupport(RichTextHelper.class)) {
                               obj1 = new Object[5];
                               obj1[0] = tKText;
                               obj1[1] = i6;
                               obj1[i4] = spannableStr;
                               obj1[3] = Integer.valueOf(b);
                               obj1[4] = Integer.valueOf(i1);
                               if (!PatchProxy.applyVoid(obj1, null, RichTextHelper.class, "12")) {
                               label_06da :
                                  if (!TextUtils.isEmpty(i6.h)) {
                                     b1 = i6.h;
                                     Objects.requireNonNull(b1);
                                     switch (b1.hashCode()){
                                         case 0xba27e9ec:
                                           if (b1.equals("line-through")) {
                                              uof = 0;
                                           }
                                           break;
                                         case 0xc2c9c6cc:
                                           if (b1.equals("underline")) {
                                              uof = 1;
                                           }
                                           break;
                                         case 0x33af38:
                                           if (b1.equals("none")) {
                                              uof = 2;
                                           }
                                           break;
                                         default:
                                     }
                                     switch (uof){
                                         case 0:
                                           RichTextHelper.b(spannableStr, b, i1);
                                           spannableStr.setSpan(new StrikethroughSpan(), b, i1, 17);
                                           break;
                                         case 1:
                                           RichTextHelper.a(spannableStr, b, i1);
                                           spannableStr.setSpan(new UnderlineSpan(), b, i1, 17);
                                           break;
                                         case 2:
                                           RichTextHelper.a(spannableStr, b, i1);
                                           RichTextHelper.b(spannableStr, b, i1);
                                           break;
                                         default:
                                     }
                                  }
                               }
                            }else {
                               goto label_06da ;
                            }
                            if (PatchProxy.isSupport(RichTextHelper.class)) {
                               objArray4 = new Object[]{tKText,i6,spannableStr,Integer.valueOf(b),Integer.valueOf(i1)};
                               if (!PatchProxy.applyVoid(objArray4, null, RichTextHelper.class, "15")) {
                               label_075e :
                                  if (TextUtils.isEmpty(i6.i) && i6.m) {
                                     b1 = i6.v;
                                     if (b1 > null) {
                                        i5 = b1 + b;
                                        i4 = 1;
                                        i5 = i5 - i4;
                                        i3 = i5 + 1;
                                        spannableStr.setSpan(new f(n.a(i6.m)), i5, i3, 17);
                                        i5 = i6.v - i4;
                                        i6.v = i5;
                                     }
                                  }
                                  if (TextUtils.isEmpty(i6.i) && i6.l - null) {
                                     b1 = i6.w;
                                     if (b1 > null) {
                                        i5 = i1 - b1;
                                        i = i5 + 1;
                                        spannableStr.setSpan(new f(n.a(i6.l)), i5, i, 17);
                                        i5 = i6.w - 1;
                                        i6.w = i5;
                                     }
                                  }
                               }
                            }else {
                               goto label_075e ;
                            }
                            if (TextUtils.isEmpty(i6.i) && i6.n - null) {
                               spannableStr.setSpan(new OffsetYSpan(n.a(i6.n)), b, i1, 17);
                            }
                            if (PatchProxy.isSupport(RichTextHelper.class)) {
                               objArray2 = new Object[]{tKText,i6,spannableStr,Integer.valueOf(b),Integer.valueOf(i1)};
                               if (PatchProxy.applyVoid(objArray2, null, RichTextHelper.class, "20")) {
                                  goto label_0875 ;
                               }
                            }
                            if (!i6.t - null || !TextUtils.isEmpty(i6.i)) {
                               goto label_0875 ;
                            }else {
                               b1 = i6.e;
                               if (b1 <= null) {
                                  i5 = p0.getFontSize();
                                  if (i5 <= 0) {
                                     i5 = n.e(p0.getView().getTextSize());
                                  }
                               }
                               float f2 = i6.t / (float)i5;
                               b uob = new b(f2);
                               spannableStr.setSpan(uob, b, i1, 17);
                               b1 = i6.t;
                               if (b1 > 0) {
                                  e = i6.v;
                                  if (e > null) {
                                     RichTextHelper$a w = i6.w;
                                     if (w > null) {
                                        i = e + b;
                                        i = i - 1;
                                        i3 = i1 - w;
                                        f1 = b1 / 2.00f;
                                        i5 = n.a(f1);
                                        b = - i5;
                                        obj = new f(b);
                                        b = i + 1;
                                        i7 = 17;
                                        spannableStr.setSpan(obj, i, b, i7);
                                        uof = new f(i5);
                                        i5 = i3 + 1;
                                        spannableStr.setSpan(uof, i3, i5, i7);
                                        i = 1;
                                        i5 = i6.v - i;
                                        i6.v = i5;
                                        i5 = i6.w - i;
                                        i6.w = i5;
                                     label_0877 :
                                        b = 1;
                                        objArray = null;
                                     }
                                  }
                               }
                            }
                         }
                      }
                   }
                }else {
                   obj1 = null;
                   goto label_061d ;
                }
                i4 = 2;
                goto label_06b2 ;
             }else {
                i4 = 2;
                i = 5;
                i3 = 3;
                goto label_032f ;
             }
             i = 1;
             goto label_0877 ;
          }
          if (uod != null) {
             uod.a(spannableStr);
          }
          return;
       }
    }
    public static RichTextHelper$a d(TKText p0,Map p1){
       Object obj = p1;
       RichTextHelper richTextHelp = RichTextHelper.class;
       Object obj1 = PatchProxy.applyTwoRefs(p0, obj, null, richTextHelp, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = obj.get("text");
       Object obj2 = obj.get("color");
       Object obj3 = obj.get("backgroundColor");
       Object obj4 = obj.get("fontFamily");
       Object obj5 = obj.get("fontFace");
       Object obj6 = obj.get("fontSize");
       Object obj7 = obj.get("fontWeight");
       Object obj8 = obj.get("fontStyle");
       Object obj9 = obj.get("textDecoration");
       Object obj10 = obj.get("image");
       Object obj11 = obj.get("imageWidth");
       Object obj12 = obj.get("imageHeight");
       Object obj13 = obj.get("marginRight");
       JsValueRef obj14 = obj.get("marginLeft");
       RichTextHelper richTextHelp1 = richTextHelp;
       Object obj15 = obj.get("offsetY");
       Object obj16 = obj.get("href");
       Object obj17 = obj.get("hrefColor");
       Object obj18 = obj.get("onclick");
       Object obj19 = obj.get("textShadow");
       Object obj20 = obj.get("verticalAlign");
       RichTextHelper$a uoa = new RichTextHelper$a();
       p1 = obj.get("letterSpacing");
       if (obj1 instanceof String) {
          uoa.a = obj1;
       }
       if (obj2 instanceof String) {
          uoa.b = obj2;
       }
       if (obj3 instanceof String) {
          uoa.c = obj3;
       }
       if (obj4 instanceof String) {
          uoa.d = obj4;
       }
       if (obj5 instanceof Map) {
          uoa.u = obj5;
       }
       if (obj7 instanceof String) {
          uoa.f = obj7;
       }
       if (obj8 instanceof String) {
          uoa.g = obj8;
       }
       if (obj9 instanceof String) {
          uoa.h = obj9;
          if (!TextUtils.isEmpty(obj9)) {
             RichTextHelper.c = true;
          }
       }
       uoa.e = 0;
       if (obj6 instanceof Number) {
          uoa.e = obj6.intValue();
       }
       if (obj10 instanceof String) {
          uoa.i = obj10;
       }
       if (obj11 instanceof Number) {
          uoa.j = obj11.intValue();
       }
       if (obj12 instanceof Number) {
          uoa.k = obj12.intValue();
       }
       if (obj13 instanceof Number) {
          uoa.l = obj13.floatValue();
       }
       if (obj14 instanceof Number) {
          uoa.m = obj14.floatValue();
       }
       obj14 = obj15;
       if (obj14 instanceof Number) {
          uoa.n = obj14.floatValue();
       }
       obj14 = obj16;
       if (obj14 instanceof String) {
          uoa.o = obj14;
       }
       obj14 = obj17;
       if (obj14 instanceof String) {
          uoa.p = obj14;
       }
       obj14 = obj18;
       if (obj14 instanceof V8Function) {
          y.c(uoa.q);
          obj14 = y.b(obj14, richTextHelp1);
          uoa.q = obj14;
          p0.addJSValueRef(obj14);
       }
       Object obj21 = obj19;
       if (obj21 instanceof String) {
          uoa.r = obj21;
       }
       obj21 = obj20;
       if (obj21 instanceof String) {
          uoa.s = obj21;
       }
       obj21 = p1;
       if (obj21 instanceof Number) {
          uoa.t = obj21.floatValue();
       }
       return uoa;
    }
}
