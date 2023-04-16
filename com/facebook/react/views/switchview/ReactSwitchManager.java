package com.facebook.react.views.switchview.ReactSwitchManager;
import jf.m;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.views.switchview.ReactSwitchManager$a;
import jf.l;
import ze.b;
import com.facebook.react.views.switchview.ReactSwitch;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.CompoundButton;
import ze.n0;
import android.view.View;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.views.switchview.ReactSwitchManager$ReactSwitchShadowNode;
import ze.x;
import android.content.Context;
import androidx.appcompat.widget.SwitchCompat;
import ze.c1;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.yoga.YogaMeasureMode;
import java.lang.Float;
import java.lang.Number;
import android.view.View$MeasureSpec;
import ze.p;
import lg.f;
import com.facebook.react.bridge.ReadableArray;
import java.util.Objects;
import java.lang.Integer;

public class ReactSwitchManager extends SimpleViewManager implements m	// class@001401
{
    public final c1 mDelegate;
    public static final CompoundButton$OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER;

    static {
       ReactSwitchManager.ON_CHECKED_CHANGE_LISTENER = new ReactSwitchManager$a();
    }
    public void ReactSwitchManager(){
       super();
       this.mDelegate = new l(this);
    }
    public static void setValueInternal(ReactSwitch p0,boolean p1){
       ReactSwitchManager reactSwitchM = ReactSwitchManager.class;
       if (PatchProxy.isSupport(reactSwitchM) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, reactSwitchM, "15")) {
          return;
       }
       p0.setOnCheckedChangeListener(null);
       p0.setOn(p1);
       p0.setOnCheckedChangeListener(ReactSwitchManager.ON_CHECKED_CHANGE_LISTENER);
       return;
    }
    public void addEventEmitters(n0 p0,View p1){
       this.addEventEmitters(p0, p1);
    }
    public void addEventEmitters(n0 p0,ReactSwitch p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactSwitchManager.class, "13")) {
          return;
       }
       p1.setOnCheckedChangeListener(ReactSwitchManager.ON_CHECKED_CHANGE_LISTENER);
       return;
    }
    public LayoutShadowNode createShadowNodeInstance(){
       Object obj = PatchProxy.apply(null, this, ReactSwitchManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReactSwitchManager$ReactSwitchShadowNode(null);
    }
    public x createShadowNodeInstance(){
       return this.createShadowNodeInstance();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReactSwitch createViewInstance(n0 p0){
       ReactSwitch obj = PatchProxy.applyOneRefs(p0, this, ReactSwitchManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ReactSwitch(p0);
       obj.setShowText(false);
       return obj;
    }
    public c1 getDelegate(){
       return this.mDelegate;
    }
    public String getName(){
       return "AndroidSwitch";
    }
    public Class getShadowNodeClass(){
       return ReactSwitchManager$ReactSwitchShadowNode.class;
    }
    public long measure(Context p0,ReadableMap p1,ReadableMap p2,ReadableMap p3,float p4,YogaMeasureMode p5,float p6,YogaMeasureMode p7){
       if (PatchProxy.isSupport(ReactSwitchManager.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Float.valueOf(p4),p5,Float.valueOf(p6),p7};
          p1 = PatchProxy.apply(objArray, this, ReactSwitchManager.class, "14");
          if (p1 != PatchProxyResult.class) {
             return p1.longValue();
          }
       }
       ReactSwitch reactSwitch = new ReactSwitch(p0);
       reactSwitch.setShowText(0);
       reactSwitch.measure(View$MeasureSpec.makeMeasureSpec(0, 0), View$MeasureSpec.makeMeasureSpec(0, 0));
       return f.a(p.a((float)reactSwitch.getMeasuredWidth()), p.a((float)reactSwitch.getMeasuredHeight()));
    }
    public void receiveCommand(View p0,String p1,ReadableArray p2){
       this.receiveCommand(p0, p1, p2);
    }
    public void receiveCommand(ReactSwitch p0,String p1,ReadableArray p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ReactSwitchManager.class, "12")) {
          return;
       }
       Objects.requireNonNull(p1);
       if (p1.equals("setNativeValue")) {
          int i = 0;
          if (p2 != null && p2.getBoolean(i)) {
             i = true;
          }
          ReactSwitchManager.setValueInternal(p0, i);
       }
       return;
    }
    public void setDisabled(View p0,boolean p1){
       this.setDisabled(p0, p1);
    }
    public void setDisabled(ReactSwitch p0,boolean p1){
       ReactSwitchManager reactSwitchM = ReactSwitchManager.class;
       if (PatchProxy.isSupport(reactSwitchM) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactSwitchM, "3")) {
          return;
       }
       p0.setEnabled((p1 ^ 0x01));
       return;
    }
    public void setEnabled(View p0,boolean p1){
       this.setEnabled(p0, p1);
    }
    public void setEnabled(ReactSwitch p0,boolean p1){
       ReactSwitchManager reactSwitchM = ReactSwitchManager.class;
       if (PatchProxy.isSupport(reactSwitchM) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactSwitchM, "4")) {
          return;
       }
       p0.setEnabled(p1);
       return;
    }
    public void setNativeValue(View p0,boolean p1){
       this.setNativeValue(p0, p1);
    }
    public void setNativeValue(ReactSwitch p0,boolean p1){
    }
    public void setOn(View p0,boolean p1){
       this.setOn(p0, p1);
    }
    public void setOn(ReactSwitch p0,boolean p1){
       ReactSwitchManager reactSwitchM = ReactSwitchManager.class;
       if (PatchProxy.isSupport(reactSwitchM) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactSwitchM, "5")) {
          return;
       }
       ReactSwitchManager.setValueInternal(p0, p1);
       return;
    }
    public void setThumbColor(View p0,Integer p1){
       this.setThumbColor(p0, p1);
    }
    public void setThumbColor(ReactSwitch p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactSwitchManager.class, "8")) {
          return;
       }
       p0.setThumbColor(p1);
       return;
    }
    public void setThumbTintColor(View p0,Integer p1){
       this.setThumbTintColor(p0, p1);
    }
    public void setThumbTintColor(ReactSwitch p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactSwitchManager.class, "7")) {
          return;
       }
       this.setThumbColor(p0, p1);
       return;
    }
    public void setTrackColorForFalse(View p0,Integer p1){
       this.setTrackColorForFalse(p0, p1);
    }
    public void setTrackColorForFalse(ReactSwitch p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactSwitchManager.class, "9")) {
          return;
       }
       p0.setTrackColorForFalse(p1);
       return;
    }
    public void setTrackColorForTrue(View p0,Integer p1){
       this.setTrackColorForTrue(p0, p1);
    }
    public void setTrackColorForTrue(ReactSwitch p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactSwitchManager.class, "10")) {
          return;
       }
       p0.setTrackColorForTrue(p1);
       return;
    }
    public void setTrackTintColor(View p0,Integer p1){
       this.setTrackTintColor(p0, p1);
    }
    public void setTrackTintColor(ReactSwitch p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactSwitchManager.class, "11")) {
          return;
       }
       p0.setTrackColor(p1);
       return;
    }
    public void setValue(View p0,boolean p1){
       this.setValue(p0, p1);
    }
    public void setValue(ReactSwitch p0,boolean p1){
       ReactSwitchManager reactSwitchM = ReactSwitchManager.class;
       if (PatchProxy.isSupport(reactSwitchM) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactSwitchM, "6")) {
          return;
       }
       ReactSwitchManager.setValueInternal(p0, p1);
       return;
    }
}
