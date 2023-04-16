package com.facebook.react.views.text.ReactTextShadowNode$a;
import lg.e;
import com.facebook.react.views.text.ReactTextShadowNode;
import java.lang.Object;
import lg.g;
import com.facebook.yoga.YogaMeasureMode;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import od.a;
import android.text.Spannable;
import android.text.Layout;
import yd.e;
import java.util.Objects;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.BoringLayout$Metrics;
import java.lang.StringBuilder;
import yf.i;
import cb.a;
import yf.s;
import ze.p;
import java.lang.Math;
import com.facebook.react.views.text.ReactAbsoluteSizeSpan;
import android.text.style.AbsoluteSizeSpan;
import ze.n0;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import java.lang.CharSequence;
import android.content.Context;
import com.facebook.react.bridge.WritableArray;
import yf.e;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import java.lang.Throwable;
import com.facebook.react.bridge.ReactSoftException;
import lg.f;

public class ReactTextShadowNode$a implements e	// class@00140c
{
    public final ReactTextShadowNode b;

    public void ReactTextShadowNode$a(ReactTextShadowNode p0){
       this.b = p0;
       super();
    }
    public long a(g p0,float p1,YogaMeasureMode p2,float p3,YogaMeasureMode p4){
       ReactTextShadowNode obj1;
       ReactTextShadowNode$a b;
       Object obj = this;
       float f = p1;
       object oobject = p2;
       object oobject1 = p4;
       ReactTextShadowNode$a uoa = ReactTextShadowNode$a.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),oobject,Float.valueOf(p3),oobject1};
          obj1 = PatchProxy.apply(objArray, obj, uoa, "1");
          if (obj1 != PatchProxyResult.class) {
             return obj1.longValue();
          }
       }
       obj1 = obj.b.A;
       a.d(obj1, "Spannable element has not been prepared in onBeforeLayout");
       Layout layout = obj.b.f(obj1, f, oobject);
       if (e.a0) {
          b = obj.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidTwoRefs(obj1, layout, b, ReactTextShadowNode.class, "3")) {
             BoringLayout$Metrics metrics = b.e(obj1, ReactTextShadowNode.H);
             if (metrics != null) {
                b.E = metrics.width;
                b.D = layout.getLineCount();
                StringBuilder str = "";
                for (int i5 = 0; i5 < layout.getLineCount(); i5 = i5 + 1) {
                   if (i5 > 0) {
                      str = str+"\t";
                   }
                   str = str+layout.getLineStart(i5);
                }
                b.C = str;
                a.x("ReactNative", "ReactTextShadowNode.reportTextCutIfNeed: mLineCount="+b.D+" mBoringWidth= "+b.E+" mNumberOfLines="+b.g+" mLayoutStarts="+b.C+" mTextBreakStrategy="+b.i+" mFontFeatureSettings"+b.x+" mContainsImage="+b.y+" mHyphenationFrequency="+b.j+" mIncludeFontPadding="+b.r+" mAdjustsFontSizeToFit="+b.s+" mTextAlign="+b.h+" layoutWidth="+layout.getWidth()+" layoutHeight="+layout.getHeight()+" mTextAttributes="+b.b+" text="+obj1.toString());
             }
          }
       }
       b = obj.b;
       float f1 = -1.#Rf;
       if (b.s != null) {
          int i2 = obj.b.b.c();
          float f2 = (float)b.b.c();
          int i3 = (int)Math.max((obj.b.t * f2), p.c(4.00f));
          while (i2 > i3 && (obj.b.g == f1 || (layout.getLineCount() > obj.b.g || (oobject1 != YogaMeasureMode.UNDEFINED && (float)layout.getHeight() - p3 > 0)))) {
             i2 = i2 - (int)p.c(0x3f800000);
             float f3 = (float)i2 / f2;
             ReactAbsoluteSizeSpan[] spans = obj1.getSpans(i1, obj1.length(), ReactAbsoluteSizeSpan.class);
             int len = spans.length;
             int i4 = 0;
             while (i4 < len) {
                object oobject2 = spans[i4];
                float f4 = (float)oobject2.getSize() * f3;
                obj1.setSpan(new ReactAbsoluteSizeSpan((int)Math.max(f4, (float)i3)), obj1.getSpanStart(oobject2), obj1.getSpanEnd(oobject2), obj1.getSpanFlags(oobject2));
                obj1.removeSpan(oobject2);
                i4 = i4 + 1;
                f1 = -1;
             }
             layout = obj.b.f(obj1, f, oobject);
             oobject1 = p4;
             i1 = 0;
             f1 = -1.#Rf;
          }
       }
       ReactTextShadowNode$a b1 = obj.b;
       if (b1.B != null) {
          n0 themedContex = b1.getThemedContext();
          WritableMap writableMap = Arguments.createMap();
          writableMap.putArray("lines", e.a(obj1, layout, ReactTextShadowNode.H, themedContex));
          if (themedContex.hasActiveCatalystInstance()) {
             themedContex.getJSModule(RCTEventEmitter.class).receiveEvent(obj.b.getReactTag(), "topTextLayout", writableMap);
          }else {
             ReactSoftException.logSoftException("ReactTextShadowNode", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
          }
       }
       i g = obj.b.g;
       if (g != -1 && g < layout.getLineCount()) {
          return f.b(layout.getWidth(), layout.getLineBottom((obj.b.g - 1)));
       }else {
          return f.b(layout.getWidth(), layout.getHeight());
       }
    }
}
