package com.kuaishou.live.basic.richtext.a;
import java.lang.Object;
import java.util.List;
import java.lang.CharSequence;
import com.kuaishou.live.basic.richtext.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import com.kuaishou.android.live.model.preview.LivePreviewRichTextModel;
import com.kuaishou.android.live.model.preview.LivePreviewRichTextImageInfo;
import java.lang.Integer;
import com.kuaishou.live.basic.richtext.b$a;
import ekd.j;
import lnc.a1;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.u9;
import android.text.style.ReplacementSpan;
import yb.b;
import android.content.res.Resources;
import xb.t$b;
import com.facebook.drawee.generic.RoundingParams;
import yb.a;
import o56.a;
import ac.b;
import android.content.Context;
import cc.a;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import s0d.f;
import s0d.a;
import s0d.e;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import bc.b;
import com.kuaishou.live.basic.richtext.b$b;
import com.kuaishou.android.live.model.preview.LivePreviewRichTextTextInfo;
import com.yxcorp.utility.TextUtils;
import d61.k;
import com.kuaishou.android.live.model.preview.LivePreviewWidgetBackgroundModel;
import android.graphics.Typeface;
import ekd.d0;
import com.kuaishou.live.basic.richtext.c$a;
import android.text.TextUtils;
import java.util.Objects;
import com.kuaishou.live.basic.richtext.c;
import com.kuaishou.live.basic.richtext.LivePreviewSpannable$1;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StrikethroughSpan;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import android.widget.TextView;

public class a	// class@000cfe
{

    public void a(){
       super();
    }
    public static CharSequence a(List p0){
       LivePreviewRichTextImageInfo mVerticalAli;
       LivePreviewRichTextImageInfo livePreviewR1;
       Iterator iterator1;
       LivePreviewRichTextImageInfo livePreviewR2;
       String str2;
       b$a obj1;
       b$a uoa;
       int b;
       t$b a;
       int b1;
       int i;
       b$b uob3;
       b$b f;
       b$a uoa5;
       b uob = b.class;
       String str = "1";
       b obj = PatchProxy.applyOneRefs(p0, null, a.class, str);
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          LivePreviewRichTextModel livePreviewR = iterator.next();
          LivePreviewRichTextModel mImageInfo = livePreviewR.mImageInfo;
          String str1 = "3";
          if (mImageInfo != null) {
             livePreviewR = livePreviewR.mLeftMarginDp;
             LivePreviewRichTextImageInfo mRadiusDp = mImageInfo.mRadiusDp;
             mVerticalAli = mImageInfo.mVerticalAlignment;
             if (PatchProxy.isSupport(a.class)) {
                livePreviewR1 = mVerticalAli;
                iterator1 = iterator;
                livePreviewR2 = mRadiusDp;
                str2 = str;
                str = str1;
                obj1 = PatchProxy.applyFourRefs(mImageInfo, Integer.valueOf(livePreviewR), Integer.valueOf(mRadiusDp), Integer.valueOf(mVerticalAli), 0, a.class, "5");
                if (obj1 != PatchProxyResult.class) {
                   uoa = obj1;
                }else if(mImageInfo != null && (!j.h(mImageInfo.mCDNUrls) && mImageInfo.mHeightDp > null)){
                   LivePreviewRichTextImageInfo mWidthDp = mImageInfo.mWidthDp;
                   if (mWidthDp > null) {
                      b$a uoa2 = new b$a(mImageInfo.mCDNUrls, a1.e((float)mWidthDp), a1.e((float)mImageInfo.mHeightDp));
                      if (livePreviewR > null) {
                         uoa2.d = livePreviewR;
                      }
                      if (livePreviewR2 != null) {
                         uoa2.e = livePreviewR2;
                      }
                      uoa2.f = livePreviewR1;
                      uoa = uoa2;
                   }
                }
                uoa = null;
             }else {
                str2 = str;
                iterator1 = iterator;
                livePreviewR1 = mVerticalAli;
                livePreviewR2 = mRadiusDp;
                str = str1;
                goto label_0074 ;
             }
             if (uoa != null && (PatchProxy.applyVoidOneRefs(uoa, obj, uob, str) || (uoa.b > null && uoa.c > null))) {
                if (uoa.d > null) {
                   obj.a(new u9(a1.e((float)uoa.d)));
                }
                b uob1 = new b(a1.m());
                a = t$b.a;
                uob1.t(a);
                uob1.j(a);
                uob1.p(a);
                b$a e = uoa.e;
                b1 = -1;
                if (e == b1 || e > null) {
                   RoundingParams roundingPara = new RoundingParams();
                   obj1 = uoa.e;
                   if (obj1 == b1) {
                      roundingPara.q(true);
                   }else {
                      roundingPara.n((float)a1.e((float)obj1));
                   }
                   uob1.z(roundingPara);
                }
                a uoa1 = a.d(uob1.a(), a.B);
                d uod = Fresco.newDraweeControllerBuilder();
                uod.v(f.x().r(uoa.a).o(uoa.b, uoa.c).w(), false);
                uoa1.k(uod.e());
                obj.b("\x27\x02\x00");
                i = obj.c() - 1;
                obj.a.c(uoa1, obj.c(), i, uoa.b, uoa.c, false, uoa.f);
             }
          }else {
             str2 = str;
             iterator1 = iterator;
             str = str1;
             LivePreviewRichTextModel mTextInfo = livePreviewR.mTextInfo;
             if (mTextInfo != null) {
                LivePreviewRichTextModel mLeftMarginD = livePreviewR.mLeftMarginDp;
                b$b uob2 = 4;
                Integer integer = 3;
                mVerticalAli = 2;
                if (PatchProxy.isSupport(a.class)) {
                   LivePreviewRichTextTextInfo obj2 = PatchProxy.applyTwoRefs(mTextInfo, Integer.valueOf(mLeftMarginD), null, a.class, "6");
                   if (obj2 != PatchProxyResult.class) {
                      uob3 = obj2;
                   }else if(mTextInfo == null || TextUtils.x(mTextInfo.mText)){
                      uob3 = 0;
                   }else {
                      uob3 = new b$b(mTextInfo.mText);
                      obj2 = mTextInfo.mFontSizeDp;
                      if (obj2 > null) {
                         uob3.c = obj2;
                      }
                      uob3.b = k.b(mTextInfo.mFontColor);
                      obj2 = mTextInfo.mBackgroundInfo;
                      if (obj2 != null && !j.h(obj2.mColorArray)) {
                         uob3.e = mTextInfo.mBackgroundInfo.mColorArray;
                         if (!j.g(mTextInfo.mPaddingsDp)) {
                            uob3.f = mTextInfo.mPaddingsDp;
                         }
                         LivePreviewWidgetBackgroundModel mRadiusDp1 = mTextInfo.mBackgroundInfo.mRadiusDp;
                         if (mRadiusDp1 > null) {
                            uob3.h = mRadiusDp1;
                         }
                      }
                   label_01bf :
                      obj2 = mTextInfo.mFontStyle;
                      if (PatchProxy.isSupport(a.class)) {
                         Typeface typeface = PatchProxy.applyOneRefs(Integer.valueOf(obj2), null, a.class, "7");
                         if (typeface != PatchProxyResult.class) {
                         }else if(obj2 != 1){
                            String str3 = "sans-serif";
                            if (obj2 != mVerticalAli) {
                               String str4 = "alte-din.ttf";
                               if (obj2 != integer) {
                                  try{
                                     if (obj2 != uob2) {
                                        b1 = 0;
                                        uoa5 = 1;
                                     }else {
                                        Typeface typeface1 = d0.a(str4, a1.c());
                                        uoa5 = 1;
                                        typeface = Typeface.create(typeface1, uoa5);
                                     }
                                  }catch(java.lang.IndexOutOfBoundsException e0){
                                     uoa5 = 1;
                                     b1 = 0;
                                  }catch(java.lang.IndexOutOfBoundsException e0){
                                  }
                                  typeface = Typeface.create(str3, b1);
                               }else {
                                  try{
                                     typeface = d0.a(str4, a1.c());
                                  }catch(java.lang.IndexOutOfBoundsException e0){
                                  }
                               }
                            }else {
                               typeface = Typeface.create(str3, 1);
                            }
                         }else {
                            typeface = Typeface.create("sans-serif-medium", 0);
                         }
                      }else {
                         goto label_01d7 ;
                      }
                   }
                }else {
                   goto label_0178 ;
                }
                if (uob3) {
                   c$a uoa3 = c$a.class;
                   if (!PatchProxy.applyVoidOneRefs(uob3, obj, uob, "4") && !TextUtils.isEmpty(uob3.a)) {
                      if (uob3.g > null) {
                         obj.a(new u9(a1.e((float)uob3.g)));
                      }
                      int i1 = obj.c();
                      obj.b(uob3.a);
                      b1 = obj.c();
                      if (!j.h(uob3.e)) {
                         int[] ointArray = new int[uob3.e.length];
                         int i2 = 0;
                         b$b e1 = uob3.e;
                         while (i2 < e1.length) {
                            ointArray[i2] = k.b(e1[i2]);
                            i2 = i2 + 1;
                         }
                         c$a uoa4 = new c$a();
                         str1 = str2;
                         Object obj3 = PatchProxy.applyOneRefs(ointArray, uoa4, uoa3, str1);
                         if (obj3 != PatchProxyResult.class) {
                            uoa4 = obj3;
                         }else if(!j.g(ointArray)){
                            uoa4.h = ointArray;
                         }
                         i = a1.e((float)uob3.c);
                         Objects.requireNonNull(uoa4);
                         if (i > 0) {
                            uoa4.b = i;
                         }
                         f = uob3.f;
                         obj3 = PatchProxy.applyOneRefs(f, uoa4, uoa3, "2");
                         if (obj3 != PatchProxyResult.class) {
                            uoa4 = obj3;
                         }else if(!j.g(f) && f.length >= uob2){
                            uoa4.d = a1.e((float)f[0]);
                            uoa4.f = a1.e((float)f[1]);
                            uoa4.e = a1.e((float)f[mVerticalAli]);
                            uoa4.g = a1.e((float)f[integer]);
                         }
                         uob2 = uob3.b;
                         Objects.requireNonNull(uoa4);
                         if (uob2 != null) {
                            uoa4.a = uob2;
                         }
                         b = a1.e((float)uob3.h);
                         if (b > 0) {
                            uoa4.c = b;
                         }
                         b = null;
                         c uoc = PatchProxy.apply(b, uoa4, uoa3, str);
                         if (uoc != PatchProxyResult.class) {
                         }else {
                            uoc = new c(uoa4);
                         }
                         obj.d(uoc, i1, b1);
                      label_0334 :
                         iterator = iterator1;
                         str = str1;
                      }else {
                         str1 = str2;
                         b = false;
                         if (uob3.b != null) {
                            obj.d(new LivePreviewSpannable$1(obj, uob3.b, uob3), i1, b1);
                         }
                         if (uob3.c > null) {
                            obj.d(new AbsoluteSizeSpan(a1.e((float)uob3.c)), i1, b1);
                         }
                         if (uob3.i != null) {
                            obj.d(new StrikethroughSpan(), i1, b1);
                            goto label_0334 ;
                         }
                      }
                   }
                }
             }
          }
       label_0331 :
          str1 = str2;
          b = false;
          goto label_0334 ;
       }
       return obj.a;
    }
    public static void b(SimpleDraweeSpanTextView p0,CharSequence p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "4")) {
          return;
       }
       if (p1 instanceof b) {
          p0.setDraweeSpanStringBuilder(p1);
       }else {
          p0.setText(p1);
       }
       return;
    }
}
