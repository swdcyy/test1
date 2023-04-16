package a90.f;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import j80.c;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.model.TextGenerateJsonData;
import java.util.List;
import java.lang.CharSequence;
import java.lang.Integer;
import android.text.SpannableString;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.feature.post.api.mediascene.MediaSceneAssetContent$RichTextAttrInfo;
import com.yxcorp.utility.TextUtils;
import u80.e;
import q87.c;
import kotlin.jvm.internal.a;
import kotlin.text.StringsKt__StringsKt;
import android.text.style.AbsoluteSizeSpan;
import a90.g;
import qkd.b;
import android.graphics.Typeface;
import ekd.d0;
import android.os.Build$VERSION;
import android.text.style.TypefaceSpan;
import android.text.style.StyleSpan;
import java.util.Map;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import trd.t0;
import java.util.LinkedHashMap;
import fg6.a;
import qkd.c;
import com.kuaishou.gifshow.kuaishan.mediascene.asset.TextStickerUtils$getTextGenerateJsonDataMap$jsonDataList$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import a90.a;
import a90.d;
import java.util.Objects;
import z80.c;
import com.yxcorp.gifshow.util.v;
import lnc.a1;
import com.kwai.feature.post.api.feature.kuaishan.model.KuaiShanAssetTag;
import android.graphics.Paint$Align;
import java.lang.Float;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import z80.a;
import h90.d;
import h90.e;
import a90.c;
import nsd.u;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.text.TextPaint;
import java.lang.Number;
import android.graphics.Paint$FontMetrics;
import android.graphics.Paint;
import com.yxcorp.gifshow.util.AdvEditUtil;
import com.yxcorp.gifshow.util.BitmapUtil;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import o56.a;
import xf6.l;
import a90.b;
import java.lang.System;
import ekd.k1;
import o56.c;
import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import a90.e;
import android.view.View$MeasureSpec;

public final class f	// class@000104
{
    public static final f a;

    static {
       f.a = new f();
    }
    public void f(){
       super();
    }
    public static final File a(){
       File obj = PatchProxy.apply(null, null, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(-1504323719).h(".post_text_stickers");
       if (!obj.exists()) {
          obj.mkdirs();
       }
       return obj;
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, f.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("media_scene_font_padding_fix", false);
    }
    public final CharSequence c(TextGenerateJsonData p0,List p1,String p2,int p3){
       SpannableString obj;
       String this;
       if (PatchProxy.isSupport(f.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), this, f.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new SpannableString(p0.getContent());
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          MediaSceneAssetContent$RichTextAttrInfo richTextAttr = iterator.next();
          if (TextUtils.x(richTextAttr.mContent)) {
             Object[] objArray = new Object[0];
             e.D().A("CommonSceneDataLoader", "richTextAttrInfo has empty content", objArray);
          }else {
             this = p0.getContent();
             a.o(this, "textGenerateJsonData.content");
             MediaSceneAssetContent$RichTextAttrInfo mContent = richTextAttr.mContent;
             a.o(mContent, "attrInfo.mContent");
             int i = StringsKt__StringsKt.i3(this, mContent, 0, false, 6, null);
             if (i < 0) {
                continue ;
             }else {
                int i1 = (richTextAttr.mContent).length() + i;
                int this1 = 33;
                if (richTextAttr.mTextSize > null) {
                   int i2 = richTextAttr.mTextSize * p3;
                   obj.setSpan(new AbsoluteSizeSpan(i2), i, i1, this1);
                   obj.setSpan(new g(richTextAttr.mLeadingOffset), i, i1, this1);
                }
                if (TextUtils.x(richTextAttr.mFont)) {
                   continue ;
                }else {
                   File uFile = new File(p2, richTextAttr.mFont);
                   if (b.S(uFile)) {
                      Typeface typeface = d0.b(uFile);
                      if (Build$VERSION.SDK_INT >= 28) {
                         obj.setSpan(new TypefaceSpan(typeface), i, i1, this1);
                      }else {
                         obj.setSpan(new StyleSpan(1), i, i1, this1);
                      }
                   }
                }
             }
          }
       }
       return obj;
    }
    public final Map d(List p0,String p1,boolean p2){
       Map obj1;
       f obj2;
       Object[] objArray1;
       int i1;
       String obj3;
       String str4;
       c obj4;
       LinkedHashMap linkedHashMa;
       Iterator iterator;
       LinkedHashMap linkedHashMa1;
       String str5;
       String str6;
       f obj5;
       float f;
       Bitmap uBitmap;
       c b;
       TextPaint textPaint;
       String str7;
       int i2;
       String obj6;
       int i3;
       float f1;
       float f2;
       String objArray21;
       File uFile1;
       File objArray21;
       File obj7;
       int this;
       TextGenerateJsonData textGenerate2;
       Object obj8;
       int i4;
       int i5;
       LinkedHashMap linkedHashMa3;
       String str8;
       PatchProxyResult patchProxyRe1;
       f uof2;
       String str9;
       String str10;
       LinkedHashMap linkedHashMa4;
       int i6;
       long l;
       int i9;
       File obj9;
       LinkedHashMap linkedHashMa5;
       f uof = this;
       List list = p0;
       a obj = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof1 = f.class;
       if (PatchProxy.isSupport(uof1)) {
          obj1 = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, f.class, "3");
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       a.p(list, "textConfigs");
       a.p(obj, "templateDir");
       String str = "4";
       obj1 = PatchProxy.applyOneRefs(obj, uof, uof1, str);
       String str1 = "CommonSceneDataLoader";
       if (obj1 != patchProxyRe) {
       }else {
          obj9 = new File(obj, "tmp.json");
          obj3 = "dirPath=";
          if (!obj9.exists()) {
             PostUtils.D(str1, "getTextGenerateJsonData: tmp.json not exits,"+obj3+obj, new IllegalArgumentException());
             obj1 = t0.z();
          }else {
             str10 = obj9.getAbsolutePath();
             try{
                linkedHashMa5 = new LinkedHashMap();
                Iterator obj10 = a.a.i(c.l(str10), new TextStickerUtils$getTextGenerateJsonDataMap$jsonDataList$1().getType());
                a.o(obj10, "Gsons.KWAI_GSON.fromJson¡­nData>>\(\) {}.type\n      \)");
                obj10 = obj10.iterator();
                while (obj10.hasNext()) {
                   TextGenerateJsonData textGenerate3 = obj10.next();
                   str7 = textGenerate3.getId();
                   a.o(str7, "it.id");
                   linkedHashMa5.put(str7, textGenerate3);
                }
             }catch(com.google.gson.JsonSyntaxException e0){
                PostUtils.D(str1, "getTextGenerateJsonDataMap\(\) parse tmp.json failed. "+obj3+obj, e0);
             }
             obj1 = linkedHashMa5;
          }
       }
       int i = 0;
       if (obj1.isEmpty()) {
          Object[] objArray = new Object[i];
          e.D().A(str1, "generateTextPicWithConfig:  textGenerateJsonDataList is null ,templateDir= "+obj, objArray);
          a uoa = a.class;
          Map map = PatchProxy.applyTwoRefs(list, obj, uof, uof1, "10");
          if (map != patchProxyRe) {
          }else if(p0.isEmpty()){
             objArray1 = new Object[i];
             e.D().w(str1, "generateTextPicturesWithDefaultConfig\(\) no textconfigs, "+"templateDir="+obj, objArray1);
             map = t0.z();
          }else {
             map = new LinkedHashMap();
             Iterator Canvas objArray2 = p0.iterator();
             while (objArray2.hasNext()) {
                d uod = objArray2.next();
                obj = a.b;
                String str2 = uod.c();
                Objects.requireNonNull(obj);
                File uFile = PatchProxy.applyOneRefs(str2, obj, uoa, "6");
                if (uFile != patchProxyRe) {
                }else {
                   a.p(str2, "text");
                   uFile = new File(c.j.w(), v.h(str2));
                }
                i1 = a1.a(R.color.arg_RES_7f060182);
                str2 = uod.a();
                Object[] objArray3 = null;
                if (a.g(str2, KuaiShanAssetTag.DATE_DAY.getAssetTag())) {
                   obj3 = PatchProxy.apply(objArray3, obj, uoa, str);
                   if (obj3 != patchProxyRe) {
                      uFile = obj3;
                   }else {
                      uFile = new File(c.j.w(), "date_day.png");
                   }
                }else if(a.g(str2, KuaiShanAssetTag.DATE_MONTH.getAssetTag())){
                   obj7 = PatchProxy.apply(objArray3, obj, uoa, "3");
                   if (obj7 != patchProxyRe) {
                      uFile = obj7;
                   }else {
                      uFile = new File(c.j.w(), "date_month.png");
                   }
                }else if(a.g(str2, KuaiShanAssetTag.DATE_YEAR.getAssetTag())){
                   obj7 = PatchProxy.apply(objArray3, obj, uoa, "2");
                   if (obj7 != patchProxyRe) {
                      uFile = obj7;
                   }else {
                      uFile = new File(c.j.w(), "date_year.png");
                   }
                }else if(a.g(str2, KuaiShanAssetTag.TITLE.getAssetTag())){
                   obj7 = PatchProxy.apply(objArray3, obj, uoa, "5");
                   if (obj7 != patchProxyRe) {
                   }else {
                      obj7 = new File(c.j.w(), "username.png");
                   }
                   uFile = obj7;
                   i1 = a1.a(R.color.arg_RES_7f0606da);
                }
                objArray3 = new Object[i];
                e.D().w(str1, "generateTextPicturesWithDefaultConfig\(\) generate text picture,"+" config="+uod, objArray3);
                obj3 = uod.c();
                str2 = uod.a();
                Paint$Align cENTER = Paint$Align.CENTER;
                String str3 = str;
                str4 = str1;
                if (PatchProxy.isSupport(uoa)) {
                   Object[] objArray4 = new Object[6];
                   objArray4[i] = obj3;
                   objArray4[1] = Float.valueOf(34.00f);
                   objArray4[2] = str2;
                   objArray4[3] = uFile;
                   objArray4[4] = Integer.valueOf(i1);
                   objArray4[5] = cENTER;
                   obj4 = PatchProxy.apply(objArray4, obj, uoa, "8");
                   if (obj4 != patchProxyRe) {
                      uFile = obj4;
                      linkedHashMa = map;
                      iterator = objArray2;
                      objArray3 = null;
                   label_047b :
                      str = uFile.getAbsolutePath();
                      obj2 = this;
                      a.o(str, "path");
                      linkedHashMa1 = linkedHashMa;
                      linkedHashMa1.put(obj2.e(uod.a(), uod.c()), str);
                      objArray2 = iterator;
                      map = linkedHashMa1;
                      uof = obj2;
                      str = str3;
                      str1 = str4;
                      i = 0;
                   }
                }
                a.p(obj3, "content");
                a.p(str2, "assetTag");
                a.p(uFile, "dstFile");
                a.p(cENTER, "textAlign");
                obj4 = c.j;
                o1 oo1 = obj4.t();
                str5 = PatchProxy.applyOneRefs(oo1, obj, uoa, "9");
                if (str5 != patchProxyRe) {
                   linkedHashMa = map;
                   iterator = objArray2;
                }else {
                   linkedHashMa = map;
                   iterator = objArray2;
                   objArray1 = new Object[0];
                   objArray21 = "MediaSceneAssetHelper";
                   a.D().w(objArray21, "getFontPath invoked", objArray1);
                   if (oo1 != null) {
                      uFile1 = new File(oo1.C0().a);
                      if (!uFile1.isDirectory()) {
                         PostUtils.D(objArray21, "Template folder for templateId: "+oo1.w0()+" does not "+"exist in path: "+uFile1.getAbsolutePath(), new IllegalArgumentException("template folder does not exist"));
                      }else {
                         objArray21 = new File(uFile1, "font.ttf");
                         if (objArray21.exists()) {
                            str5 = objArray21.getAbsolutePath();
                         }
                      }
                   }
                   str6 = null;
                label_030a :
                   e uoe = obj.a(str2, obj4.t());
                   e uoe1 = (uoe != null)? uoe.u: 0;
                   e uoe2 = (uoe != null)? uoe.v: 0;
                   c uoc = new c(obj3, 34.00f, uoe1, uoe2, cENTER, str6, Integer.valueOf(i1), false, 128, null);
                   obj5 = null;
                   f = 0xbf800000;
                   if (PatchProxy.isSupport(uoa)) {
                      uBitmap = PatchProxy.applyThreeRefs(map, obj5, Float.valueOf(f), obj, a.class, "12");
                      if (uBitmap != patchProxyRe) {
                         objArray3 = null;
                      label_0466 :
                         if (uFile.exists()) {
                            b.q(uFile);
                         }
                         BitmapUtil.O(uBitmap, uFile.getAbsolutePath(), 100);
                         uBitmap.recycle();
                         goto label_047b ;
                      }
                   }
                   uBitmap = Bitmap.createBitmap(map.e(), map.c(), Bitmap$Config.ARGB_8888);
                   objArray2 = new Canvas(uBitmap);
                   c g = map.g;
                   Paint$Align uAlign = map.a();
                   b = map.b;
                   if (PatchProxy.isSupport(uoa)) {
                      textPaint = PatchProxy.applyThreeRefs(g, uAlign, Float.valueOf(b), obj, a.class, "14");
                      if (textPaint != patchProxyRe) {
                         str5 = 7;
                      label_03b3 :
                         str7 = map.d();
                         i2 = (int)f;
                         if (PatchProxy.isSupport(uoa)) {
                            obj6 = PatchProxy.applyThreeRefs(textPaint, str7, Integer.valueOf(i2), obj, a.class, "13");
                            if (obj6 != patchProxyRe) {
                               f = obj6.floatValue();
                            }else {
                            label_03d9 :
                               f1 = textPaint.measureText(str7);
                               if (i2 > 0) {
                                  f = (float)i2;
                                  if (f - f1 < 0) {
                                     f = f / f1;
                                     f = f * textPaint.getTextSize();
                                  }
                               }
                               f = textPaint.getTextSize();
                            }
                         }else {
                            goto label_03d9 ;
                         }
                         textPaint.setTextSize(f);
                         obj3 = map.b();
                         if (obj3 != null) {
                            textPaint.setTypeface(d0.b(new File(obj3)));
                         }
                         obj3 = map.b();
                         i3 = (obj3 == null || !obj3.length())? 1: 0;
                         if (i3) {
                            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
                         }
                         if (map.a() == Paint$Align.CENTER) {
                            f = (float)map.e() / 2.00f;
                            objArray2.translate(f, 0);
                         }else {
                            f1 = 0;
                            if (map.a() == Paint$Align.RIGHT) {
                               objArray2.translate((float)map.e(), f1);
                            }
                         }
                         f1 = - textPaint.getFontMetrics().ascent;
                         f2 = (float)map.c() - AdvEditUtil.f(textPaint);
                         f2 = f2 / (float)2;
                         f1 = f1 + f2;
                         objArray2.drawText(map.d(), 0, f1, textPaint);
                         a.o(uBitmap, "textBitmap");
                         goto label_0466 ;
                      }
                   }
                   textPaint = new TextPaint(7);
                   textPaint.setAntiAlias(true);
                   i1 = (g != null)? g.intValue(): 0xff000000;
                   textPaint.setColor(i1);
                   textPaint.setTextAlign(uAlign);
                   textPaint.setTextSize(b);
                   goto label_03b3 ;
                }
                str6 = str5;
                goto label_030a ;
             }
             linkedHashMa1 = map;
          }
          obj2 = uof;
          return map;
       }else {
          str4 = str1;
          obj2 = uof;
          LinkedHashMap linkedHashMa2 = new LinkedHashMap();
          i1 = p0.size();
          this = 0;
          while (this < i1) {
             d uod1 = list.get(this);
             TextGenerateJsonData textGenerate = obj1.get(uod1.b);
             if (textGenerate == null) {
                textGenerate = CollectionsKt___CollectionsKt.k2(obj1.values());
             }
             TextGenerateJsonData textGenerate1 = textGenerate;
             textGenerate1.setContent(uod1.c());
             obj6 = obj2.e(uod1.a(), uod1.c());
             if (!p2) {
                obj5 = 1;
             }else {
                str5 = "scaleOfTextToBitmap";
                if (a.d()) {
                   i3 = l.e("key_text_bitmap_scale", 0);
                   if (i3 <= 0) {
                      i9 = a.t().a(str5, 1);
                   }
                }else {
                   i9 = a.t().a(str5, 1);
                }
                i = i9;
             label_0519 :
                if (uod1.b() == null) {
                   if (PatchProxy.isSupport(uof1)) {
                      obj8 = obj1;
                      textGenerate2 = textGenerate1;
                      i4 = this;
                      i5 = i1;
                      linkedHashMa3 = linkedHashMa2;
                      str = PatchProxy.applyThreeRefs(textGenerate1, p1, Integer.valueOf(i), this, f.class, "9");
                      if (str != patchProxyRe) {
                         str8 = obj6;
                         patchProxyRe1 = patchProxyRe;
                         uof2 = uof1;
                         str9 = str4;
                      label_0553 :
                         linkedHashMa2 = 0;
                      label_06dd :
                         str10 = str;
                         obj6 = str8;
                         linkedHashMa4 = linkedHashMa3;
                         i6 = this;
                      }
                   }else {
                      obj8 = obj1;
                      textGenerate2 = textGenerate1;
                      i4 = this;
                      i5 = i1;
                      linkedHashMa3 = linkedHashMa2;
                      obj9 = 7;
                   }
                   str = f.a().getAbsolutePath()+'/'+textGenerate2.getKey(obj)+".png";
                   if (b.S(new File(str))) {
                      Object[] objArray5 = new Object[0];
                      objArray21 = str4;
                      e.D().w(objArray21, "textToTextPicturePath use valid file:"+str, objArray5);
                      str9 = objArray21;
                      str8 = obj6;
                      patchProxyRe1 = patchProxyRe;
                      uof2 = uof1;
                      goto label_0553 ;
                   }else {
                      i1 = textGenerate2.getW() * i;
                      int i8 = textGenerate2.getH() * i;
                      Bitmap uBitmap1 = Bitmap.createBitmap(i1, i8, Bitmap$Config.ARGB_8888);
                      Canvas uCanvas = new Canvas(uBitmap1);
                      patchProxyRe1 = patchProxyRe;
                      uof2 = uof1;
                      TextPaint textPaint1 = new TextPaint(7);
                      textPaint1.setAntiAlias(true);
                      str8 = obj6;
                      l = System.currentTimeMillis();
                      textPaint1.setShadowLayer((float)textGenerate2.getShadowRadius(), textGenerate2.getShadowOffsetX(), textGenerate2.getShadowOffsetY(), TextUtils.J(textGenerate2.getShadowColor(), -1));
                      textPaint1.setColor(TextUtils.J(textGenerate2.getColor(), -1));
                      textPaint1.setTextAlign(textGenerate2.getTextAlign());
                      f2 = (float)textGenerate2.getFontSize() * (float)i;
                      textPaint1.setTextSize(f2);
                      String letterSpacin = textGenerate2.getLetterSpacing();
                      a.o(letterSpacin, "textGenerateJsonData.letterSpacing");
                      f2 = Float.parseFloat(letterSpacin) * 0x3f800000;
                      f2 = f2 / textPaint1.measureText("°¡");
                      textPaint1.setLetterSpacing(f2);
                      if (!TextUtils.n(textGenerate2.getFontFileName(), "system")) {
                         uFile1 = new File(obj, textGenerate2.getFontFileName());
                         obj7 = new File(obj, "font.ttf");
                         Typeface typeface = (uFile1.isFile())? d0.b(uFile1): d0.b(obj7);
                         textPaint1.setTypeface(typeface);
                      }
                      if (textGenerate2.getTextAlign() == Paint$Align.CENTER) {
                         i2 = 2;
                         f2 = (float)i1 / (float)i2;
                         uCanvas.translate(f2, 0);
                      }else {
                         i2 = 2;
                         float f5 = 0;
                         if (textGenerate2.getTextAlign() == Paint$Align.RIGHT) {
                            uCanvas.translate((float)i1, f5);
                         }else {
                            i9 = 6;
                         label_0687 :
                            float f3 = - textPaint1.getFontMetrics().ascent;
                            float f4 = (float)i8 - AdvEditUtil.f(textPaint1);
                            f4 = f4 / (float)i2;
                            f3 = f3 + f4;
                            uCanvas.drawText(textGenerate2.getContent(), (float)i9, f3, textPaint1);
                            BitmapUtil.O(uBitmap1, str, 100);
                            uBitmap1.recycle();
                            Object[] objArray6 = new Object[0];
                            str9 = str4;
                            e.D().w(str9, "textToTextPicturePath cost:"+k1.t(l)+","+"textGenerateJsonData:"+textGenerate2+",textBitmapFilePath:"+str, objArray6);
                            goto label_06dd ;
                         }
                      }
                      i9 = 0;
                      goto label_0687 ;
                   }
                }else {
                   obj8 = obj1;
                   i4 = this;
                   i5 = i1;
                   patchProxyRe1 = patchProxyRe;
                   uof2 = uof1;
                   str9 = str4;
                   i6 = this;
                   str10 = i6.g(textGenerate1, uod1.b(), obj, i);
                   linkedHashMa4 = linkedHashMa2;
                }
                linkedHashMa4.put(obj6, str10);
                int i7 = i4 + 1;
                this = i7;
                obj2 = i6;
                linkedHashMa2 = linkedHashMa4;
                str4 = str9;
                i1 = i5;
                patchProxyRe = patchProxyRe1;
                uof1 = uof2;
                obj1 = obj8;
                list = p0;
             }
             i = obj5;
             textGenerate2 = 1;
             goto label_0519 ;
          }
          return linkedHashMa2;
       }
    }
    public final String e(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "assetTag");
       a.p(p1, "content");
       return '{'+p0+"}_{"+p1+'}';
    }
    public final String f(b p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "ellipsis: "+p0.b()+", "+"maxLines:"+p0.c()+", "+"isFakeBold: "+p0.d()+", "+"attrInfoList:";
       Iterator iterator = p0.a().iterator();
       while (iterator.hasNext()) {
          MediaSceneAssetContent$RichTextAttrInfo richTextAttr = iterator.next();
          obj = obj+"[content: "+richTextAttr.mContent+", "+"font: "+richTextAttr.mFont+", "+"size:"+richTextAttr.mTextSize+"],"+"leadingOffset:"+richTextAttr.mLeadingOffset;
       }
       String str = v.h(obj);
       a.o(str, "MD5Utils.md5\(stringKeyBuilder.toString\(\)\)");
       return str;
    }
    public final String g(TextGenerateJsonData p0,b p1,String p2,int p3){
       String obj;
       float this;
       TextUtils$TruncateAt eND;
       TextPaint paint;
       if (PatchProxy.isSupport(f.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, p2, Integer.valueOf(p3), this, f.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = f.a().getAbsolutePath()+'/'+p0.getKey(p2)+"_"+this.f(p1)+".png";
       if (b.S(new File(obj))) {
          Object[] objArray = new Object[0];
          e.D().w("CommonSceneDataLoader", "textToTextPicturePath use valid file:"+obj, objArray);
          return obj;
       }else {
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          TextView textView = a.c(LayoutInflater.from(uoc.a()), R.layout.arg_RES_7f0d023c, null, 0).findViewById(R.id.custom_text_view);
          a.o(textView, "textView");
          int i = p1.b();
          int i1 = 2;
          this = Float.MIN_VALUE;
          if (i) {
             if (i != this) {
                eND = (i != i1)? TextUtils$TruncateAt.END: TextUtils$TruncateAt.START;
             }else {
                eND = TextUtils$TruncateAt.MIDDLE;
             }
          }else {
             eND = TextUtils$TruncateAt.END;
          }
          textView.setEllipsize(eND);
          Paint$Align textAlign = p0.getTextAlign();
          int i2 = 19;
          if (textAlign != null) {
             i = e.a[textAlign.ordinal()];
             if (i != this) {
                if (i != i1 && i == 3) {
                   i2 = 21;
                }
             }else {
                i2 = 17;
             }
          }
          textView.setGravity(i2);
          textView.setMaxLines(p1.c());
          textView.setTextColor(TextUtils.J(p0.getColor(), -1));
          textView.setShadowLayer((float)p0.getShadowRadius(), p0.getShadowOffsetX(), p0.getShadowOffsetY(), TextUtils.J(p0.getShadowColor(), -1));
          textView.setTextSize(0, ((float)p0.getFontSize() * (float)p3));
          String letterSpacin = p0.getLetterSpacing();
          a.o(letterSpacin, "textGenerateJsonData.letterSpacing");
          textView.setLetterSpacing(((Float.parseFloat(letterSpacin) * 0x3f800000) / textView.getPaint().measureText("°¡")));
          if (Build$VERSION.SDK_INT >= 28) {
             textView.setLineHeight((p0.getLineHeight() * p3));
          }
          if (!TextUtils.n(p0.getFontFileName(), "system")) {
             File uFile = new File(p2, p0.getFontFileName());
             File uFile1 = new File(p2, "font.ttf");
             Typeface typeface = (uFile.isFile())? d0.b(uFile): d0.b(uFile1);
             textView.setTypeface(typeface);
          }
          letterSpacin = "textView.paint";
          if (this.b()) {
             paint = textView.getPaint();
             a.o(paint, letterSpacin);
             Paint$FontMetrics fontMetrics = paint.getFontMetrics();
             textView.setPadding(0, (int)(fontMetrics.top - fontMetrics.ascent), 0, (int)(fontMetrics.descent - fontMetrics.bottom));
          }
          paint = textView.getPaint();
          a.o(paint, letterSpacin);
          paint.setFakeBoldText(p1.d());
          textView.setText(this.c(p0, p1.a(), p2, p3));
          textView.measure(View$MeasureSpec.makeMeasureSpec((p0.getW() * p3), 0x40000000), View$MeasureSpec.makeMeasureSpec((p0.getH() * p3), 0x40000000));
          textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
          Bitmap uBitmap = Bitmap.createBitmap(textView.getMeasuredWidth(), textView.getMeasuredHeight(), Bitmap$Config.ARGB_8888);
          a.o(uBitmap, "Bitmap.createBitmap\(text¡­ Bitmap.Config.ARGB_8888\)");
          textView.draw(new Canvas(uBitmap));
          BitmapUtil.O(uBitmap, obj, 100);
          uBitmap.recycle();
          return obj;
       }
    }
}
