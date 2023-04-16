package com.yxcorp.gifshow.notice.krn.m$a;
import lg.e;
import com.yxcorp.gifshow.notice.krn.m;
import java.lang.Object;
import lg.g;
import com.facebook.yoga.YogaMeasureMode;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import od.a;
import android.text.Spannable;
import android.text.Layout;
import java.util.Objects;
import java.lang.Integer;
import android.text.SpannableStringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.text.StaticLayout;
import android.text.Layout$Alignment;
import android.text.TextPaint;
import java.lang.StringBuilder;
import java.lang.Math;
import java.lang.Exception;
import android.text.SpannableString;
import com.yxcorp.gifshow.notice.krn.m$b;
import com.yxcorp.gifshow.notice.krn.SocialReactTextShadowNode$3;
import com.yxcorp.gifshow.util.ColorURLSpan;
import android.net.Uri;
import lg.f;

public class m$a implements e	// class@0021ad
{
    public final m b;

    public void m$a(m p0){
       this.b = p0;
       super();
    }
    public long a(g p0,float p1,YogaMeasureMode p2,float p3,YogaMeasureMode p4){
       m obj1;
       SpannableStringBuilder spannableStr1;
       Object obj = this;
       float f = p1;
       object oobject = p2;
       m$a uoa = m$a.class;
       int i = 0;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),oobject,Float.valueOf(p3),p4};
          obj1 = PatchProxy.apply(objArray, obj, uoa, "1");
          if (obj1 != PatchProxyResult.class) {
             return obj1.longValue();
          }
       }
       uoa = obj.b;
       if (uoa.o != null && uoa.u == null) {
          uoa.u = true;
          int i1 = 0;
          while (i1 < obj.b.o.size()) {
             ReadableMap map = obj.b.o.getMap(i1);
             if (map != null) {
                String str = "type";
                if (map.hasKey(str)) {
                   str = map.getString(str);
                   if (("Text").equals(str)) {
                      obj.b.f(map, (int)f, i);
                   }
                   if (("Image").equals(str)) {
                      obj.b.e(map, i);
                   }
                }
             }
             i1 = i1 + 1;
          }
       }
       obj1 = obj.b.s;
       a.d(obj1, "Spannable element has not been prepared in onBeforeLayout");
       Layout layout = obj.b.i(obj1, f, oobject);
       m$a b = obj.b;
       m r = b.r;
       if (r >= null) {
          b.q = r;
          Objects.requireNonNull(b);
          if (!PatchProxy.isSupport(m.class) || !PatchProxy.applyVoidThreeRefs(obj1, Integer.valueOf(r), layout, b, m.class, "3")) {
             TextPaint o = m.O;
             if (!obj1 instanceof SpannableStringBuilder || (layout == null || (r <= null || (!TextUtils.x(obj1) && layout.getWidth() > 0)))) {
                StaticLayout staticLayout = new StaticLayout(obj1, o, layout.getWidth(), Layout$Alignment.ALIGN_NORMAL, 0x3f800000, 0, false);
                if (v7.getLineCount() > r) {
                   int i2 = (int)Math.ceil((double)Layout.getDesiredWidth("..."+b.c, o));
                   int width = layout.getWidth();
                   int i3 = r - 1;
                   int lineStart = v7.getLineStart(i3);
                   CharSequence uCharSequenc = obj1.subSequence(lineStart, v7.getLineEnd(i3));
                   if (10 == uCharSequenc.charAt((uCharSequenc.length() - 1))) {
                      uCharSequenc = uCharSequenc.subSequence(i, (uCharSequenc.length() - 1));
                   }
                   float f1 = o.measureText(uCharSequenc.toString());
                   float f2 = (float)i2;
                   f1 = f1 + f2;
                   while (f1 - (float)width > 0 && (width > 0 && uCharSequenc.length() > 0)) {
                      lineStart = uCharSequenc.length() - 1;
                      uCharSequenc = uCharSequenc.subSequence(i, lineStart);
                      f1 = o.measureText(uCharSequenc.toString());
                   }
                   try{
                      while (uCharSequenc.length() > 0) {
                         int i4 = uCharSequenc.length() - 1;
                         char c = uCharSequenc.charAt(i4);
                         i4 = (c && (c != 9 && (c != 10 && (c != 13 && (c < ' ' || (c > 0xd7ff && (c < 0xe000 || c > 0xfffd)))))))? 1: 0;
                         if (i4 && obj1.length() > uCharSequenc.length()) {
                            i4 = uCharSequenc.length() - 1;
                            if (!m.h(uCharSequenc.charAt(i4), obj1.charAt(uCharSequenc.length()))) {
                               i4 = uCharSequenc.length() - 1;
                               uCharSequenc = uCharSequenc.subSequence(i, i4);
                            }
                         }
                      }
                   }catch(java.lang.Exception e0){
                      e0.printStackTrace();
                   }
                label_01c4 :
                   SpannableStringBuilder spannableStr = new SpannableStringBuilder(uCharSequenc);
                   spannableStr.append("...");
                   spannableStr.append(b.c);
                   if (r > 1) {
                      spannableStr1 = new SpannableStringBuilder(obj1.subSequence(i, v7.getLineEnd((r - 2))));
                      spannableStr1.append(spannableStr);
                   }else {
                      spannableStr1 = new SpannableStringBuilder(spannableStr);
                   }
                   SpannableString spannableStr2 = new SpannableString(spannableStr1);
                   m$b uob = new m$b(b);
                   SocialReactTextShadowNode$3 u3 = new SocialReactTextShadowNode$3(b, "", "");
                   u3.m(1);
                   u3.g(uob.b(Uri.EMPTY));
                   u3.l(uob.c(Uri.EMPTY));
                   spannableStr2.setSpan(u3, (spannableStr1.length() - b.c.length()), spannableStr1.length(), 33);
                   b.s = spannableStr2;
                }
             }
          }
       }
       m q = obj.b.q;
       if (q != -1 && q < layout.getLineCount()) {
          return f.b(layout.getWidth(), layout.getLineBottom((obj.b.q - 1)));
       }else {
          return f.b(layout.getWidth(), layout.getHeight());
       }
    }
}
