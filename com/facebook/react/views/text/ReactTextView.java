package com.facebook.react.views.text.ReactTextView;
import ze.s;
import androidx.appcompat.widget.AppCompatTextView;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import android.text.TextUtils$TruncateAt;
import bg.d;
import android.view.View;
import android.widget.TextView;
import android.text.BoringLayout$Metrics;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cb.a;
import android.os.Build$VERSION;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import com.facebook.react.bridge.ReactContext;
import w0.u;
import android.content.ContextWrapper;
import android.text.Spannable;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import android.text.Spanned;
import yf.t;
import java.lang.Boolean;
import java.lang.Integer;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import android.text.Layout;
import yf.u;
import java.util.ArrayList;
import yd.e;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.text.ReactTextView$a;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.Arguments;
import java.util.Iterator;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.bridge.JavaScriptModule;
import java.lang.StringBuilder;
import android.text.StaticLayout;
import yf.o;
import java.lang.Runnable;
import ze.p;
import java.lang.Float;
import java.lang.Number;
import yf.l;
import java.lang.ArrayIndexOutOfBoundsException;
import yf.n;
import android.text.util.Linkify;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import java.lang.Math;

public class ReactTextView extends AppCompatTextView implements s	// class@001410
{
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public TextUtils$TruncateAt k;
    public boolean l;
    public int m;
    public boolean n;
    public d o;
    public Spannable p;
    public Field q;
    public static final ViewGroup$LayoutParams r;

    static {
       ReactTextView.r = new ViewGroup$LayoutParams(0, 0);
    }
    public void ReactTextView(Context p0){
       super(p0);
       this.i = 0;
       this.j = Integer.MAX_VALUE;
       this.k = TextUtils$TruncateAt.END;
       this.l = false;
       this.m = 0;
       this.q = null;
       this.o = new d(this);
       this.g = this.getGravity() & 0x800007;
       this.h = this.getGravity() & 0x70;
    }
    public final BoringLayout$Metrics getBoringMetrics(){
       Object[] objArray = null;
       Class obj = PatchProxy.apply(objArray, this, ReactTextView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.q == null) {
          obj = this.getClass().getSuperclass();
          String str = "ReactNative";
          if (obj == null) {
             a.x(str, "ReactTextView.getBoringMetrics: father class is null");
             return objArray;
          }else {
             obj = obj.getSuperclass();
             if (obj == null) {
                a.x(str, "ReactTextView.getBoringMetrics: grandfather class is null");
                return objArray;
             }else if(Build$VERSION.SDK_INT >= 28){
                Class[] uClassArray = new Class[]{String.class};
                Method declaredMeth = Class.class.getDeclaredMethod("getDeclaredField", uClassArray);
                declaredMeth.setAccessible(1);
                Object[] objArray1 = new Object[]{"mBoring"};
                this.q = declaredMeth.invoke(obj, objArray1);
             }else {
                this.q = obj.getDeclaredField("mBoring");
             }
          }
       }
       this.q.setAccessible(1);
       return this.q.get(this);
    }
    public final ReactContext getReactContext(){
       ReactContext baseContext;
       Context obj = PatchProxy.apply(null, this, ReactTextView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getContext();
       if (obj instanceof u) {
          baseContext = obj.getBaseContext();
       }
       return baseContext;
    }
    public Spannable getSpanned(){
       return this.p;
    }
    public boolean hasOverlappingRendering(){
       return false;
    }
    public void invalidateDrawable(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactTextView.class, "11")) {
          return;
       }
       if (this.f != null && this.getText() instanceof Spanned) {
          Spanned text = this.getText();
          int i = 0;
          t[] spans = text.getSpans(i, text.length(), t.class);
          int len = spans.length;
          while (i < len) {
             if (spans[i].a() == p0) {
                this.invalidate();
             }
             i = i + 1;
          }
       }
       super.invalidateDrawable(p0);
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, ReactTextView.class, "14")) {
          return;
       }
       super.onAttachedToWindow();
       if (this.f != null && this.getText() instanceof Spanned) {
          Spanned text = this.getText();
          int i = 0;
          t[] spans = text.getSpans(i, text.length(), t.class);
          int len = spans.length;
          for (; i < len; i = i + 1) {
             spans[i].d();
          }
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, ReactTextView.class, "12")) {
          return;
       }
       super.onDetachedFromWindow();
       if (this.f != null && this.getText() instanceof Spanned) {
          Spanned text = this.getText();
          int i = 0;
          t[] spans = text.getSpans(i, text.length(), t.class);
          int len = spans.length;
          for (; i < len; i = i + 1) {
             spans[i].e();
          }
       }
       return;
    }
    public void onFinishTemporaryDetach(){
       if (PatchProxy.applyVoid(null, this, ReactTextView.class, "15")) {
          return;
       }
       super.onFinishTemporaryDetach();
       if (this.f != null && this.getText() instanceof Spanned) {
          Spanned text = this.getText();
          int i = 0;
          t[] spans = text.getSpans(i, text.length(), t.class);
          int len = spans.length;
          for (; i < len; i = i + 1) {
             spans[i].f();
          }
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i5;
       int i6;
       NativeModule nativeModule1;
       int i7;
       int i8;
       float f1;
       Object obj = this;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(ReactTextView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, obj, ReactTextView.class, "7")) {
             return;
          }
       }
       if (!this.getText() instanceof Spanned) {
          return;
       }else {
          ReactContext reactContext = this.getReactContext();
          if (!reactContext.hasCatalystInstance()) {
             return;
          }else {
             NativeModule nativeModule = reactContext.getNativeModule(UIManagerModule.class);
             CharSequence uCharSequenc = this.getText();
             Layout layout = this.getLayout();
             Object[] objArray1 = uCharSequenc.getSpans(i1, uCharSequenc.length(), u.class);
             ArrayList uArrayList = (obj.n != null)? new ArrayList(objArray1.length): null;
             ArrayList uArrayList1 = uArrayList;
             int i2 = p3 - p1;
             int i3 = p4 - p2;
             int len = objArray1.length;
             int i4 = 0;
             while (i4 < len) {
                object oobject = objArray1[i4];
                View view = nativeModule.resolveView(oobject.b());
                if (e.r && view == null) {
                   i5 = i4;
                   i6 = len;
                   i1 = i3;
                   i = i2;
                   nativeModule1 = nativeModule;
                   i7 = 1;
                }else {
                   int spanStart = uCharSequenc.getSpanStart(oobject);
                   i1 = layout.getLineForOffset(spanStart);
                   i5 = (layout.getEllipsisCount(i1) > 0)? 1: 0;
                   if (i5) {
                      i = layout.getLineStart(i1) + layout.getEllipsisStart(i1);
                      if (spanStart >= i) {
                      label_00c3 :
                         i5 = i4;
                         i6 = len;
                         i1 = i3;
                         i = i2;
                         nativeModule1 = nativeModule;
                         i8 = 8;
                         i7 = 1;
                      label_0186 :
                         view.setVisibility(i8);
                         if (obj.n != null) {
                            uArrayList1.add(this.p(8, spanStart, -1, -1, -1, -1));
                         }
                      }
                   }
                   if (i1 < obj.j) {
                      if (spanStart >= layout.getLineEnd(i1)) {
                         goto label_00c3 ;
                      }else {
                         i = oobject.c();
                         i8 = oobject.a();
                         i5 = i4;
                         i4 = layout.isRtlCharAt(spanStart);
                         i6 = len;
                         nativeModule1 = nativeModule;
                         float f = (layout.getParagraphDirection(i1) == -1)? Float.MIN_VALUE: 0;
                         int i9 = uCharSequenc.length() - 1;
                         if (spanStart == i9) {
                            if (f) {
                               len = i2 - (int)layout.getLineWidth(i1);
                            }else {
                               len = (int)layout.getLineRight(i1);
                            label_0131 :
                               len = len - i;
                            }
                         }else if(f == i4){
                            f1 = Float.MIN_VALUE;
                         }else {
                            f1 = 0;
                         }
                         f1 = (f1)? layout.getPrimaryHorizontal(spanStart): layout.getSecondaryHorizontal(spanStart);
                         i9 = (int)f1;
                         if (f) {
                            len = (int)layout.getLineRight(i1) - i9;
                            len = i2 - len;
                         }else {
                            len = i9;
                         }
                         if (i4) {
                            goto label_0131 ;
                         }
                         i4 = (i4)? this.getTotalPaddingRight(): this.getTotalPaddingLeft();
                         len = len + i4;
                         i4 = p1 + len;
                         i9 = this.getTotalPaddingTop() + layout.getLineBaseline(i1);
                         i9 = i9 - i8;
                         i1 = p2 + i9;
                         f = (i2 <= len || i3 <= i9)? 1: 0;
                         len = (f)? 8: 0;
                         i = i + i4;
                         i9 = i1 + i8;
                         view.setVisibility(len);
                         view.layout(i4, i1, i, i9);
                         if (obj.n != null) {
                            i1 = i3;
                            i = i2;
                            uArrayList1.add(this.p(len, spanStart, i4, i1, i, i9));
                         }else {
                            i1 = i3;
                            i = i2;
                         }
                      }
                   }else {
                      i5 = i4;
                      i6 = len;
                      i1 = i3;
                      i = i2;
                      nativeModule1 = nativeModule;
                      i8 = 8;
                      goto label_0186 ;
                   }
                }
                i4 = i5 + 1;
                i2 = i;
                i3 = i1;
                len = i6;
                nativeModule = nativeModule1;
                i1 = 0;
             }
             if (obj.n != null) {
                Collections.sort(uArrayList1, new ReactTextView$a(obj));
                WritableArray writableArra = Arguments.createArray();
                Iterator iterator = uArrayList1.iterator();
                while (iterator.hasNext()) {
                   writableArra.pushMap(iterator.next());
                }
                WritableMap writableMap = Arguments.createMap();
                writableMap.putArray("inlineViews", writableArra);
                reactContext.getJSModule(RCTEventEmitter.class).receiveEvent(this.getId(), "topInlineViewLayout", writableMap);
             }
             return;
          }
       }
    }
    public void onMeasure(int p0,int p1){
       BoringLayout$Metrics boringMetric;
       Layout layout;
       if (PatchProxy.isSupport(ReactTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ReactTextView.class, "3")) {
          return;
       }
       boolean a0 = e.a0;
       Object obj = null;
       if (a0) {
          boringMetric = this.getBoringMetrics();
          layout = this.getLayout();
       }else {
          boringMetric = obj;
          layout = boringMetric;
       }
       super.onMeasure(p0, p1);
       if (a0 && !PatchProxy.applyVoidTwoRefs(boringMetric, layout, this, ReactTextView.class, "4")) {
          BoringLayout$Metrics boringMetric1 = this.getBoringMetrics();
          Layout layout1 = this.getLayout();
          StringBuilder str = PatchProxy.applyOneRefs(layout1, obj, ReactTextView.class, "5");
          if (str != PatchProxyResult.class) {
          }else {
             str = "";
             for (int i = 0; i < layout1.getLineCount(); i = i + 1) {
                if (i > 0) {
                   str = str+"\t";
                }
                str = str+layout1.getLineStart(i);
             }
             str = str;
          }
          Object obj1 = str;
          a.x("ReactNative", "ReactTextView.reportTextCutIfNeed: originBoring="+boringMetric+" boring="+boringMetric1+" originLayout="+layout+" layout="+layout1+" layoutLineCount="+layout1.getLineCount()+" layoutStarts="+obj1+" layoutWidth="+layout1.getWidth()+" layoutHeight="+layout1.getHeight());
          if (boringMetric1 != null && (boringMetric1 != boringMetric && (layout1 instanceof StaticLayout && layout1 != layout))) {
             CharSequence text = this.getText();
             if (text != null && text.length() > 0) {
                ReactContext reactContext = this.getReactContext();
                o oo = new o(this, reactContext, text, layout1.getLineCount(), boringMetric1.width, obj1);
                reactContext.runOnNativeModulesQueueThread(layout1);
             }
          }
       }
    label_00fc :
       return;
    }
    public void onStartTemporaryDetach(){
       if (PatchProxy.applyVoid(null, this, ReactTextView.class, "13")) {
          return;
       }
       super.onStartTemporaryDetach();
       if (this.f != null && this.getText() instanceof Spanned) {
          Spanned text = this.getText();
          int i = 0;
          t[] spans = text.getSpans(i, text.length(), t.class);
          int len = spans.length;
          for (; i < len; i = i + 1) {
             spans[i].g();
          }
       }
       return;
    }
    public final WritableMap p(int p0,int p1,int p2,int p3,int p4,int p5){
       WritableMap obj;
       if (PatchProxy.isSupport(ReactTextView.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          obj = PatchProxy.apply(objArray, this, ReactTextView.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = Arguments.createMap();
       if (p0 == 8) {
          obj.putString("visibility", "gone");
          obj.putInt("index", p1);
       }else if(!p0){
          obj.putString("visibility", "visible");
          obj.putInt("index", p1);
          obj.putDouble("left", (double)p.a((float)p2));
          obj.putDouble("top", (double)p.a((float)p3));
          obj.putDouble("right", (double)p.a((float)p4));
          obj.putDouble("bottom", (double)p.a((float)p5));
       }else {
          obj.putString("visibility", "unknown");
          obj.putInt("index", p1);
       }
       return obj;
    }
    public void q(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ReactTextView.class, "19")) {
          return;
       }
       if (this.j != Integer.MAX_VALUE && this.l == null) {
          objArray = this.k;
       }
       this.setEllipsize(objArray);
       return;
    }
    public int reactTagForTouch(float p0,float p1){
       CharSequence obj;
       if (PatchProxy.isSupport(ReactTextView.class)) {
          obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, ReactTextView.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = this.getText();
       int id = this.getId();
       int i = (int)p0;
       int i1 = (int)p1;
       Layout layout = this.getLayout();
       if (layout == null) {
          return id;
       }else {
          i1 = layout.getLineForVertical(i1);
          int i2 = (int)layout.getLineLeft(i1);
          int i3 = (int)layout.getLineRight(i1);
          if (obj instanceof Spanned && (i >= i2 && i <= i3)) {
             CharSequence uCharSequenc = obj;
             i = (float)i;
             try{
                i = layout.getOffsetForHorizontal(i1, i);
                l[] spans = uCharSequenc.getSpans(i, i, l.class);
                if (spans != null) {
                   int i4 = obj.length();
                   int i5 = 0;
                   while (i5 < spans.length) {
                      i3 = uCharSequenc.getSpanStart(spans[i5]);
                      int spanEnd = uCharSequenc.getSpanEnd(spans[i5]);
                      if (spanEnd > i) {
                         spanEnd = spanEnd - i3;
                         if (spanEnd <= i4) {
                            id = spans[i5].a();
                            i4 = spanEnd;
                         }
                      }
                      i5 = i5 + 1;
                   }
                }
             }catch(java.lang.ArrayIndexOutOfBoundsException e7){
                a.g("ReactNative", "Crash in HorizontalMeasurementProvider: "+e7.getMessage());
             }
          }
       }
    }
    public void setAdjustFontSizeToFit(boolean p0){
       this.l = p0;
    }
    public void setBackgroundColor(int p0){
       if (PatchProxy.isSupport(ReactTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactTextView.class, "20")) {
          return;
       }
       this.o.b(p0);
       return;
    }
    public void setBorderRadius(float p0){
       if (PatchProxy.isSupport(ReactTextView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ReactTextView.class, "23")) {
          return;
       }
       this.o.d(p0);
       return;
    }
    public void setBorderStyle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactTextView.class, "25")) {
          return;
       }
       this.o.f(p0);
       return;
    }
    public void setEllipsizeLocation(TextUtils$TruncateAt p0){
       this.k = p0;
    }
    public void setGravityHorizontal(int p0){
       ReactTextView tg;
       if (PatchProxy.isSupport(ReactTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactTextView.class, "16")) {
          return;
       }
       if (!p0) {
          tg = this.g;
       }
       this.setGravity((tg | ((this.getGravity() & 0xf8) & -8388616)));
       return;
    }
    public void setGravityVertical(int p0){
       ReactTextView th;
       if (PatchProxy.isSupport(ReactTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactTextView.class, "17")) {
          return;
       }
       if (!p0) {
          th = this.h;
       }
       this.setGravity((th | (this.getGravity() & 0x8f)));
       return;
    }
    public void setLinkifyMask(int p0){
       this.m = p0;
    }
    public void setNotifyOnInlineViewLayout(boolean p0){
       this.n = p0;
    }
    public void setNumberOfLines(int p0){
       if (PatchProxy.isSupport(ReactTextView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ReactTextView.class, "18")) {
          return;
       }
       if (!p0) {
          p0 = Integer.MAX_VALUE;
       }
       this.j = p0;
       int i = 1;
       if (p0 != i) {
          i = false;
       }
       this.setSingleLine(i);
       this.setMaxLines(this.j);
       return;
    }
    public void setSpanned(Spannable p0){
       this.p = p0;
    }
    public void setText(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactTextView.class, "8")) {
          return;
       }
       this.f = p0.a();
       if (this.getLayoutParams() == null) {
          this.setLayoutParams(ReactTextView.r);
       }
       Spannable spannable = p0.j();
       ReactTextView tm = this.m;
       if (tm > null) {
          Linkify.addLinks(spannable, tm);
          this.setMovementMethod(LinkMovementMethod.getInstance());
       }
       this.setText(spannable);
       float f = p0.e();
       float f1 = p0.g();
       float f2 = p0.f();
       float f3 = p0.d();
       int i = 0xbf800000;
       if (f - i && ((v5 = f3 - i) && (f2 - i && v5))) {
          this.setPadding((int)Math.floor((double)f), (int)Math.floor((double)f1), (int)Math.floor((double)f2), (int)Math.floor((double)f3));
       }
    label_006c :
       int i1 = p0.k();
       if (this.i != i1) {
          this.i = i1;
       }
       this.setGravityHorizontal(this.i);
       i1 = Build$VERSION.SDK_INT;
       if (i1 >= 23 && this.getBreakStrategy() != p0.l()) {
          this.setBreakStrategy(p0.l());
       }
       if (i1 >= 26 && this.getJustificationMode() != p0.c()) {
          this.setJustificationMode(p0.c());
       }
       this.requestLayout();
       return;
    }
    public boolean verifyDrawable(Drawable p0){
       Spanned obj = PatchProxy.applyOneRefs(p0, this, ReactTextView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.f != null && this.getText() instanceof Spanned) {
          obj = this.getText();
          int i = 0;
          t[] spans = obj.getSpans(i, obj.length(), t.class);
          int len = spans.length;
          while (i < len) {
             if (spans[i].a() == p0) {
                return true;
             }
             i = i + 1;
          }
       }
       return super.verifyDrawable(p0);
    }
}
