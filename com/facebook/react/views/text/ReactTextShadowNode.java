package com.facebook.react.views.text.ReactTextShadowNode;
import yf.i;
import android.text.TextPaint;
import com.facebook.react.views.text.ReactTextShadowNode$a;
import com.facebook.react.views.text.ReactTextShadowNode$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import lg.e;
import lg.a;
import java.lang.Iterable;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import od.a;
import android.text.Spanned;
import yf.u;
import java.util.ArrayList;
import java.lang.Integer;
import ze.x;
import java.lang.Number;
import com.facebook.yoga.YogaDirection;
import android.text.BoringLayout$Metrics;
import yf.s;
import java.lang.CharSequence;
import android.text.BoringLayout;
import android.text.Spannable;
import com.facebook.yoga.YogaMeasureMode;
import android.text.Layout;
import java.lang.Float;
import android.text.Layout$Alignment;
import lg.d;
import java.lang.Math;
import android.os.Build$VERSION;
import android.text.StaticLayout;
import android.text.StaticLayout$Builder;
import ze.n;
import com.facebook.react.uimanager.j;
import yf.n;
import com.facebook.react.uimanager.ViewManager;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;

public class ReactTextShadowNode extends i	// class@00140e
{
    public Spannable A;
    public boolean B;
    public String C;
    public int D;
    public int E;
    public final e F;
    public final a G;
    public static final TextPaint H;

    static {
       ReactTextShadowNode.H = new TextPaint(1);
    }
    public void ReactTextShadowNode(){
       super();
       this.C = null;
       this.D = -1;
       this.E = -1;
       ReactTextShadowNode$a uoa = new ReactTextShadowNode$a(this);
       this.F = uoa;
       ReactTextShadowNode$b uob = new ReactTextShadowNode$b(this);
       this.G = uob;
       if (PatchProxy.applyVoid(null, this, ReactTextShadowNode.class, "1")) {
       }else if(!this.isVirtual()){
          this.setMeasureFunction(uoa);
          this.setBaselineFunction(uob);
       }
       return;
    }
    public Iterable calculateLayoutOnChildren(){
       Object[] objArray = null;
       i obj = PatchProxy.apply(objArray, this, ReactTextShadowNode.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.z;
       if (obj != null && !obj.isEmpty()) {
          ReactTextShadowNode tA = this.A;
          a.d(tA, "Spannable element has not been prepared in onBeforeLayout");
          int i = 0;
          u[] spans = tA.getSpans(i, tA.length(), u.class);
          objArray = new ArrayList(spans.length);
          int len = spans.length;
          for (; i < len; i = i + 1) {
             x ox = this.z.get(Integer.valueOf(spans[i].b()));
             ox.calculateLayout();
             objArray.add(ox);
          }
       }
       return objArray;
    }
    public final int d(){
       int i;
       i obj = PatchProxy.apply(null, this, ReactTextShadowNode.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.h;
       if (this.getLayoutDirection() == YogaDirection.RTL) {
          if (obj == 5) {
             i = 3;
          }else if(obj == 3){
             i = 5;
          }
       }
       return i;
    }
    public final BoringLayout$Metrics e(Spanned p0,TextPaint p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, ReactTextShadowNode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p1.setTextSize((float)this.b.c());
       return BoringLayout.isBoring(p0, p1);
    }
    public Layout f(Spannable p0,float p1,YogaMeasureMode p2){
       boolean this;
       StaticLayout staticLayout;
       StaticLayout$Builder uBuilder;
       StaticLayout staticLayout1;
       if (PatchProxy.isSupport(ReactTextShadowNode.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Float.valueOf(p1), p2, this, ReactTextShadowNode.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       TextPaint h = ReactTextShadowNode.H;
       BoringLayout$Metrics metrics = this.e(p0, h);
       float desiredWidth = (metrics == null)? Layout.getDesiredWidth(p0, h): Float.NaN;
       float f = 0;
       this = true;
       int i = 0;
       int i1 = (p2 == YogaMeasureMode.UNDEFINED || p1 - f < 0)? 1: 0;
       Layout$Alignment aLIGN_NORMAL = Layout$Alignment.ALIGN_NORMAL;
       int i2 = this.d();
       if (i2 != this) {
          if (i2 != 3) {
             if (i2 == 5) {
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
       i oi = 0x3f800000;
       if (metrics == null && (i1 || (!d.a(desiredWidth) && desiredWidth - p1 <= 0))) {
          int i3 = (int)Math.ceil((double)desiredWidth);
          i1 = Build$VERSION.SDK_INT;
          if (i1 < 23) {
             staticLayout = new StaticLayout(p0, h, i3, uAlignment, 0x3f800000, 0, this.r);
          }else {
             uBuilder = StaticLayout$Builder.obtain(p0, i, p0.length(), h, i3).setAlignment(uAlignment).setLineSpacing(f, oi).setIncludePad(this.r).setBreakStrategy(this.i).setHyphenationFrequency(this.j);
             if (i1 >= 26) {
                uBuilder.setJustificationMode(this.k);
             }
             if (i1 >= aLIGN_NORMAL) {
                uBuilder.setUseLineSpacingFromFallbacks(this);
             }
             staticLayout1 = uBuilder.build();
          }
       }else if(metrics != null && (i1 || (float)metrics.width - p1 <= 0)){
          staticLayout1 = BoringLayout.make(p0, h, metrics.width, uAlignment, 0x3f800000, null, metrics, this.r);
       }else {
          i1 = Build$VERSION.SDK_INT;
          if (i1 < 23) {
             staticLayout = new StaticLayout(p0, h, (int)p1, uAlignment, 0x3f800000, 0, this.r);
          }else {
             uBuilder = StaticLayout$Builder.obtain(p0, i, p0.length(), h, (int)p1).setAlignment(uAlignment).setLineSpacing(f, oi).setIncludePad(this.r).setBreakStrategy(this.i).setHyphenationFrequency(this.j);
             if (i1 >= aLIGN_NORMAL) {
                uBuilder.setUseLineSpacingFromFallbacks(this);
             }
             staticLayout1 = uBuilder.build();
          }
       }
       return i1;
    }
    public boolean getSelfLayoutFlag(){
       return true;
    }
    public boolean hoistNativeChildren(){
       return true;
    }
    public boolean isVirtualAnchor(){
       return false;
    }
    public void markUpdated(){
       if (PatchProxy.applyVoid(null, this, ReactTextShadowNode.class, "8")) {
          return;
       }
       super.markUpdated();
       super.dirty();
       return;
    }
    public void onBeforeLayout(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactTextShadowNode.class, "7")) {
          return;
       }
       this.A = this.c(this, null, true, p0);
       this.markUpdated();
       return;
    }
    public void onCollectExtraUpdates(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactTextShadowNode.class, "9")) {
          return;
       }
       super.onCollectExtraUpdates(p0);
       ReactTextShadowNode tA = this.A;
       if (tA != null) {
          n on = new n(tA, -1, this.y, this.getPadding(4), this.getPadding(1), this.getPadding(5), this.getPadding(3), this.d(), this.i, this.k);
          p0.h(this.getReactTag(), v0);
       }
       return;
    }
    public void setShouldNotifyOnTextLayout(boolean p0){
       this.B = p0;
    }
    public void synchronouslyUpdateLayoutInfoForKdsList(ViewManager p0,View p1){
       ReactTextShadowNode reactTextSha = ReactTextShadowNode.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, reactTextSha, "12")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, reactTextSha, "11");
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else {
          ReactTextShadowNode tA = this.A;
          if (tA != null) {
             n on = new n(tA, -1, this.y, this.getPadding(4), this.getPadding(1), this.getPadding(5), this.getPadding(3), this.d(), this.i, this.k);
          }
       }
       p0.updateExtraData(p1, objArray);
       return;
    }
}
