package com.facebook.react.views.slider.ReactSliderManager;
import jf.y;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.views.slider.ReactSliderManager$a;
import com.facebook.react.views.slider.ReactSliderManager$b;
import jf.x;
import ze.b;
import ze.n0;
import android.view.View;
import com.facebook.react.views.slider.ReactSlider;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.widget.SeekBar;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.views.slider.ReactSliderManager$ReactSliderShadowNode;
import ze.x;
import android.content.Context;
import android.util.AttributeSet;
import a2.a;
import a2.i0;
import ze.c1;
import java.util.Map;
import vd.d;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.yoga.YogaMeasureMode;
import java.lang.Float;
import java.lang.Number;
import android.view.View$MeasureSpec;
import ze.p;
import lg.f;
import java.lang.Boolean;
import java.lang.Integer;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.PorterDuff$Mode;
import java.lang.Double;
import com.facebook.react.uimanager.BaseViewManager;

public class ReactSliderManager extends SimpleViewManager implements y	// class@0013f7
{
    public final c1 mDelegate;
    public static final SeekBar$OnSeekBarChangeListener ON_CHANGE_LISTENER;
    public static ReactSliderManager$b sAccessibilityDelegate;

    static {
       ReactSliderManager.ON_CHANGE_LISTENER = new ReactSliderManager$a();
       ReactSliderManager.sAccessibilityDelegate = new ReactSliderManager$b();
    }
    public void ReactSliderManager(){
       super();
       this.mDelegate = new x(this);
    }
    public void addEventEmitters(n0 p0,View p1){
       this.addEventEmitters(p0, p1);
    }
    public void addEventEmitters(n0 p0,ReactSlider p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactSliderManager.class, "12")) {
          return;
       }
       p1.setOnSeekBarChangeListener(ReactSliderManager.ON_CHANGE_LISTENER);
       return;
    }
    public LayoutShadowNode createShadowNodeInstance(){
       Object obj = PatchProxy.apply(null, this, ReactSliderManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReactSliderManager$ReactSliderShadowNode(null);
    }
    public x createShadowNodeInstance(){
       return this.createShadowNodeInstance();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReactSlider createViewInstance(n0 p0){
       ReactSlider obj = PatchProxy.applyOneRefs(p0, this, ReactSliderManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ReactSlider(p0, null, 0x101007b);
       i0.s0(obj, ReactSliderManager.sAccessibilityDelegate);
       return obj;
    }
    public c1 getDelegate(){
       return this.mDelegate;
    }
    public Map getExportedCustomDirectEventTypeConstants(){
       Object obj = PatchProxy.apply(null, this, ReactSliderManager.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.d("topSlidingComplete", d.d("registrationName", "onSlidingComplete"));
    }
    public String getName(){
       return "RCTSlider";
    }
    public Class getShadowNodeClass(){
       return ReactSliderManager$ReactSliderShadowNode.class;
    }
    public long measure(Context p0,ReadableMap p1,ReadableMap p2,ReadableMap p3,float p4,YogaMeasureMode p5,float p6,YogaMeasureMode p7){
       if (PatchProxy.isSupport(ReactSliderManager.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Float.valueOf(p4),p5,Float.valueOf(p6),p7};
          p1 = PatchProxy.apply(objArray, this, ReactSliderManager.class, "14");
          if (p1 != PatchProxyResult.class) {
             return p1.longValue();
          }
       }
       ReactSlider reactSlider = new ReactSlider(p0, null, 0x101007b);
       reactSlider.measure(View$MeasureSpec.makeMeasureSpec(-2, 0), View$MeasureSpec.makeMeasureSpec(-2, 0));
       return f.a(p.a((float)reactSlider.getMeasuredWidth()), p.a((float)reactSlider.getMeasuredHeight()));
    }
    public void setDisabled(View p0,boolean p1){
       this.setDisabled(p0, p1);
    }
    public void setDisabled(ReactSlider p0,boolean p1){
    }
    public void setEnabled(View p0,boolean p1){
       this.setEnabled(p0, p1);
    }
    public void setEnabled(ReactSlider p0,boolean p1){
       ReactSliderManager reactSliderM = ReactSliderManager.class;
       if (PatchProxy.isSupport(reactSliderM) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactSliderM, "3")) {
          return;
       }
       p0.setEnabled(p1);
       return;
    }
    public void setMaximumTrackImage(View p0,ReadableMap p1){
       this.setMaximumTrackImage(p0, p1);
    }
    public void setMaximumTrackImage(ReactSlider p0,ReadableMap p1){
    }
    public void setMaximumTrackTintColor(View p0,Integer p1){
       this.setMaximumTrackTintColor(p0, p1);
    }
    public void setMaximumTrackTintColor(ReactSlider p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactSliderManager.class, "10")) {
          return;
       }
       Drawable uDrawable = p0.getProgressDrawable().getCurrent().findDrawableByLayerId(0x1020000);
       if (p1 == null) {
          uDrawable.clearColorFilter();
       }else {
          uDrawable.setColorFilter(p1.intValue(), PorterDuff$Mode.SRC_IN);
       }
       return;
    }
    public void setMaximumValue(View p0,double p1){
       this.setMaximumValue(p0, p1);
    }
    public void setMaximumValue(ReactSlider p0,double p1){
       ReactSliderManager reactSliderM = ReactSliderManager.class;
       if (PatchProxy.isSupport(reactSliderM) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, reactSliderM, "6")) {
          return;
       }
       p0.setMaxValue(p1);
       return;
    }
    public void setMinimumTrackImage(View p0,ReadableMap p1){
       this.setMinimumTrackImage(p0, p1);
    }
    public void setMinimumTrackImage(ReactSlider p0,ReadableMap p1){
    }
    public void setMinimumTrackTintColor(View p0,Integer p1){
       this.setMinimumTrackTintColor(p0, p1);
    }
    public void setMinimumTrackTintColor(ReactSlider p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactSliderManager.class, "9")) {
          return;
       }
       Drawable uDrawable = p0.getProgressDrawable().getCurrent().findDrawableByLayerId(0x102000d);
       if (p1 == null) {
          uDrawable.clearColorFilter();
       }else {
          uDrawable.setColorFilter(p1.intValue(), PorterDuff$Mode.SRC_IN);
       }
       return;
    }
    public void setMinimumValue(View p0,double p1){
       this.setMinimumValue(p0, p1);
    }
    public void setMinimumValue(ReactSlider p0,double p1){
       ReactSliderManager reactSliderM = ReactSliderManager.class;
       if (PatchProxy.isSupport(reactSliderM) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, reactSliderM, "5")) {
          return;
       }
       p0.setMinValue(p1);
       return;
    }
    public void setStep(View p0,double p1){
       this.setStep(p0, p1);
    }
    public void setStep(ReactSlider p0,double p1){
       ReactSliderManager reactSliderM = ReactSliderManager.class;
       if (PatchProxy.isSupport(reactSliderM) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, reactSliderM, "7")) {
          return;
       }
       p0.setStep(p1);
       return;
    }
    public void setTestID(View p0,String p1){
       this.setTestID(p0, p1);
    }
    public void setTestID(ReactSlider p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactSliderManager.class, "11")) {
          return;
       }
       super.setTestId(p0, p1);
       return;
    }
    public void setThumbImage(View p0,ReadableMap p1){
       this.setThumbImage(p0, p1);
    }
    public void setThumbImage(ReactSlider p0,ReadableMap p1){
    }
    public void setThumbTintColor(View p0,Integer p1){
       this.setThumbTintColor(p0, p1);
    }
    public void setThumbTintColor(ReactSlider p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactSliderManager.class, "8")) {
          return;
       }
       if (p1 == null) {
          p0.getThumb().clearColorFilter();
       }else {
          p0.getThumb().setColorFilter(p1.intValue(), PorterDuff$Mode.SRC_IN);
       }
       return;
    }
    public void setTrackImage(View p0,ReadableMap p1){
       this.setTrackImage(p0, p1);
    }
    public void setTrackImage(ReactSlider p0,ReadableMap p1){
    }
    public void setValue(View p0,double p1){
       this.setValue(p0, p1);
    }
    public void setValue(ReactSlider p0,double p1){
       ReactSliderManager reactSliderM = ReactSliderManager.class;
       if (PatchProxy.isSupport(reactSliderM) && PatchProxy.applyVoidTwoRefs(p0, Double.valueOf(p1), this, reactSliderM, "4")) {
          return;
       }
       p0.setOnSeekBarChangeListener(null);
       p0.setValue(p1);
       p0.setOnSeekBarChangeListener(ReactSliderManager.ON_CHANGE_LISTENER);
       return;
    }
}
