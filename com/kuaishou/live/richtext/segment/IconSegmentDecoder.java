package com.kuaishou.live.richtext.segment.IconSegmentDecoder;
import lnc.a1;
import cp3.f;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import com.kuaishou.live.richtext.segment.IconSegmentDecoder$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.ref.SoftReference;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentIconSegment;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$TextStyle;
import android.util.LruCache;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.content.res.Resources;
import com.kuaishou.live.richtext.tools.a;
import android.graphics.drawable.NinePatchDrawable;
import com.kuaishou.live.richtext.segment.IconSegmentDecoder$HollowTextView;
import android.content.Context;
import android.widget.TextView;
import android.graphics.Typeface;
import cp3.c;
import android.view.ViewGroup$LayoutParams;
import android.text.TextPaint;
import android.graphics.Rect;
import android.graphics.Paint;
import java.lang.Math;
import java.lang.Integer;
import java.lang.Number;
import android.view.View$MeasureSpec;
import android.view.View;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;

public class IconSegmentDecoder	// class@000f73
{
    public final f a;
    public final IconSegmentDecoder$a b;
    public final boolean c;
    public static final int d;
    public static final int e;

    static {
       IconSegmentDecoder.d = a1.e(0x3f800000);
       IconSegmentDecoder.e = a1.e(72.00f);
    }
    public void IconSegmentDecoder(f p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       super();
       this.a = p0;
       Object[] objArray = null;
       IconSegmentDecoder$a uoa = PatchProxy.apply(objArray, objArray, IconSegmentDecoder$a.class, "1");
       if (uoa != patchProxyRe) {
       }else if(IconSegmentDecoder$a.a == null){
          IconSegmentDecoder$a.a = new SoftReference(new IconSegmentDecoder$a());
       }
       uoa = IconSegmentDecoder$a.a.get();
       if (uoa == null) {
          uoa = new IconSegmentDecoder$a();
          IconSegmentDecoder$a.a = new SoftReference(uoa);
       }
       this.b = uoa;
       uoa = PatchProxy.apply(objArray, objArray, IconSegmentDecoder.class, "9");
       boolean b = (uoa != patchProxyRe)? uoa.booleanValue(): a.t().u("SOURCE_LIVE").d("enableFixedRichTextPadding", false);
       this.c = b;
       return;
    }
    public Drawable a(LiveCommentRichText$CommentIconSegment p0){
       Drawable uDrawable1;
       LiveCommentRichText$CommentIconSegment uCommentIcon;
       LiveCommentRichText$CommentIconSegment uCommentIcon1;
       Drawable uDrawable3;
       ViewGroup$LayoutParams this;
       TextPaint textPaint;
       ViewGroup$LayoutParams layoutParams;
       int i1;
       IconSegmentDecoder$HollowTextView hollowTextVi1;
       LiveCommentRichText$CommentIconSegment uCommentIcon2;
       Drawable uDrawable4;
       Bitmap uBitmap;
       BitmapDrawable uBitmapDrawa1;
       Object obj = this;
       IconSegmentDecoder$HollowTextView obj1 = p0;
       String obj2 = PatchProxy.applyOneRefs(obj1, obj, IconSegmentDecoder.class, "1");
       if (obj2 != PatchProxyResult.class) {
          return obj2;
       }
       Drawable uDrawable = null;
       if (TextUtils.x(obj1.resPackId) || TextUtils.x(obj1.iconPath)) {
          return uDrawable;
       }
       if (!TextUtils.x(obj1.text) && obj1.textStyle == null) {
          return uDrawable;
       }
       obj2 = PatchProxy.applyOneRefs(obj1, uDrawable, IconSegmentDecoder.class, "7");
       if (obj2 != PatchProxyResult.class) {
       }else {
          obj2 = obj1.resPackId+obj1.iconPath;
          if (!TextUtils.x(obj1.text)) {
             LiveCommentRichText$CommentIconSegment textStyle1 = obj1.textStyle;
             if (textStyle1 != null) {
                obj2 = obj2+obj1.text+textStyle1.color+textStyle1.fontFamily+textStyle1.shadowColor+textStyle1.fontSize;
             }
          }
          obj2 = obj2;
       }
       Object obj3 = obj2;
       BitmapDrawable uBitmapDrawa = obj.b.get(obj3);
       if (uBitmapDrawa == null) {
          uBitmapDrawa = PatchProxy.applyOneRefs(obj1, obj, IconSegmentDecoder.class, "2");
          if (uBitmapDrawa != PatchProxyResult.class) {
          }else {
             uBitmapDrawa = PatchProxy.applyOneRefs(obj1, obj, IconSegmentDecoder.class, "3");
             if (uBitmapDrawa != PatchProxyResult.class) {
             }else {
                obj2 = obj.a.a(obj1.resPackId, obj1.iconPath);
                if (obj2 == null) {
                   uDrawable1 = uDrawable;
                label_00d1 :
                   int i = 0;
                   if (uDrawable1 instanceof BitmapDrawable) {
                      uDrawable = uDrawable1;
                   }else if(!TextUtils.x(obj1.text) && uDrawable1 instanceof NinePatchDrawable){
                      Drawable uDrawable2 = uDrawable1;
                      LiveCommentRichText$CommentIconSegment text = obj1.text;
                      LiveCommentRichText$CommentIconSegment textStyle = obj1.textStyle;
                      LiveCommentRichText$CommentIconSegment enableStretc = obj1.enableStretch;
                      if (PatchProxy.isSupport(IconSegmentDecoder.class)) {
                         uCommentIcon = enableStretc;
                         uCommentIcon1 = textStyle;
                         p0 = text;
                         uDrawable3 = uDrawable2;
                         obj1 = PatchProxy.applyFourRefs(uDrawable2, text, textStyle, Boolean.valueOf(enableStretc), this, IconSegmentDecoder.class, "4");
                         if (obj1 != PatchProxyResult.class) {
                            uDrawable = obj1;
                         }
                      }else {
                         uCommentIcon = enableStretc;
                         uCommentIcon1 = textStyle;
                         p0 = text;
                         uDrawable3 = uDrawable2;
                      }
                      if (!(uCommentIcon1.color & 0x11000000)) {
                         obj1 = new IconSegmentDecoder$HollowTextView(a1.c());
                      }else {
                         TextView textView = new TextView(a1.c());
                         LiveCommentRichText$TextStyle shadowColor = uCommentIcon1.shadowColor;
                         if (shadowColor != null) {
                            textView.setShadowLayer((float)IconSegmentDecoder.d, 0, 0, shadowColor);
                         }
                      }
                      IconSegmentDecoder$HollowTextView hollowTextVi = obj1;
                      try{
                         hollowTextVi.setTypeface(c.b(uCommentIcon1.fontFamily), c.a(uCommentIcon1.fontFamily));
                      }catch(java.lang.IndexOutOfBoundsException e0){
                      }
                      hollowTextVi.setTextSize(i, (float)(uCommentIcon1.fontSize * 3));
                      int intrinsicHei = uDrawable3.getIntrinsicHeight();
                      this = (uCommentIcon != null)? new ViewGroup$LayoutParams(-2, intrinsicHei): new ViewGroup$LayoutParams(uDrawable3.getIntrinsicWidth(), intrinsicHei);
                      TextPaint paint = hollowTextVi.getPaint();
                      if (PatchProxy.isSupport(IconSegmentDecoder.class)) {
                         textPaint = paint;
                         layoutParams = this;
                         i1 = intrinsicHei;
                         hollowTextVi1 = hollowTextVi;
                         uCommentIcon2 = PatchProxy.applyFourRefs(p0, uDrawable3, paint, Boolean.valueOf(uCommentIcon), this, IconSegmentDecoder.class, "6");
                         if (uCommentIcon2 != PatchProxyResult.class) {
                            uDrawable4 = uDrawable3;
                         label_023c :
                            IconSegmentDecoder$HollowTextView hollowTextVi2 = hollowTextVi1;
                            hollowTextVi2.setLayoutParams(layoutParams);
                            hollowTextVi2.setGravity(17);
                            hollowTextVi2.setTextColor(uCommentIcon1.color);
                            hollowTextVi2.setBackground(uDrawable4);
                            hollowTextVi2.setText(uCommentIcon2);
                            if (PatchProxy.isSupport(IconSegmentDecoder.class)) {
                               uBitmap = PatchProxy.applyTwoRefs(hollowTextVi2, Integer.valueOf(i1), null, IconSegmentDecoder.class, "5");
                               if (uBitmap != PatchProxyResult.class) {
                               }else {
                               label_0269 :
                                  hollowTextVi2.measure(View$MeasureSpec.makeMeasureSpec(0, 0), View$MeasureSpec.makeMeasureSpec(i1, 0x40000000));
                                  int measuredHeig = hollowTextVi2.getMeasuredHeight();
                                  int measuredWidt = hollowTextVi2.getMeasuredWidth();
                                  if (measuredWidt > (measuredHeig * 100)) {
                                     uBitmap = Bitmap.createBitmap(1, 1, Bitmap$Config.ARGB_8888);
                                  }else {
                                     uBitmap = Bitmap.createBitmap(measuredWidt, measuredHeig, Bitmap$Config.ARGB_8888);
                                     Canvas uCanvas = new Canvas(uBitmap);
                                     uCanvas.scale(0x3f800000, 0x3f800000);
                                     hollowTextVi2.layout(0, 0, hollowTextVi2.getMeasuredWidth(), hollowTextVi2.getMeasuredHeight());
                                     hollowTextVi2.draw(uCanvas);
                                  }
                               }
                            }else {
                               goto label_0269 ;
                            }
                            uBitmapDrawa1 = new BitmapDrawable(a1.m(), uBitmap);
                         }
                      }else {
                         textPaint = paint;
                         layoutParams = this;
                         i1 = intrinsicHei;
                         hollowTextVi1 = hollowTextVi;
                      }
                      Rect rect = new Rect();
                      uDrawable4 = uDrawable3;
                      uDrawable4.getPadding(rect);
                      int i2 = rect.right + rect.left;
                      uCommentIcon2 = p0;
                      int i3 = (int)textPaint.measureText(uCommentIcon2);
                      int i4 = Math.max((uDrawable4.getIntrinsicWidth() - i2), i3);
                      if (uCommentIcon != null) {
                         if (PatchProxy.isSupport(IconSegmentDecoder.class)) {
                            Object obj4 = PatchProxy.applyOneRefs(Integer.valueOf(i2), obj, IconSegmentDecoder.class, "8");
                            if (obj4 != PatchProxyResult.class) {
                               i2 = obj4.intValue();
                            }else if(obj.c != null){
                               i2 = a1.e((((float)i2 * 0x3f800000) / 3.00f));
                            }
                         }else {
                            goto label_01f3 ;
                         }
                         i4 = Math.min((IconSegmentDecoder.e - i2), i4);
                      }
                      if (i3 > i4) {
                         String str = "...";
                         i4 = i4 - (int)textPaint.measureText(str);
                         intrinsicHei = uCommentIcon2.length();
                         while (i3 > i4 && intrinsicHei > 1) {
                            intrinsicHei = intrinsicHei - 1;
                            String str1 = uCommentIcon2.substring(0, intrinsicHei);
                            i3 = (int)textPaint.measureText(str1);
                            intrinsicHei = str1.length();
                            str1 = str1+str;
                         }
                      }
                      text = uCommentIcon2;
                      uCommentIcon2 = text;
                      goto label_023c ;
                   }else {
                      uBitmapDrawa1 = null;
                   }
                   if (uDrawable != null) {
                      uDrawable.setBounds(0, 0, a1.e((((float)uDrawable1.getIntrinsicWidth() * 0x3f800000) / 3.00f)), a1.e((((float)uDrawable1.getIntrinsicHeight() * 0x3f800000) / 3.00f)));
                   }
                   uBitmapDrawa = uDrawable;
                }else if(TextUtils.x(obj1.text)){
                   uBitmapDrawa = new BitmapDrawable(a1.m(), BitmapFactory.decodeFile(obj2));
                }else if(a.d(obj1.iconPath)){
                   uDrawable4 = a.b(a1.m(), obj2);
                }else {
                   uDrawable4 = uDrawable;
                }
             }
             uDrawable1 = uBitmapDrawa;
             goto label_00d1 ;
          }
       }
       if (uBitmapDrawa != null) {
          obj.b.put(obj3, uBitmapDrawa);
       }
       return uBitmapDrawa;
    }
}
