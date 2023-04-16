package com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.view.ReactClippingViewManager;
import ze.n0;
import android.view.View;
import com.facebook.react.views.view.ReactViewGroup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import java.util.Map;
import java.lang.Integer;
import vd.d;
import com.facebook.react.bridge.ReadableArray;
import ze.p;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.Float;
import lg.d;
import com.facebook.react.views.view.ReactViewManager$a;
import android.view.View$OnClickListener;
import com.facebook.react.bridge.ReadableMap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import bg.c;
import com.facebook.react.uimanager.PointerEvents;
import java.util.Locale;
import java.lang.CharSequence;
import com.facebook.react.uimanager.BaseViewManager;

public class ReactViewManager extends ReactClippingViewManager	// class@00143e
{
    public static final int[] SPACING_TYPES;

    static {
       ReactViewManager.SPACING_TYPES = new int[7]{8,0,2,1,3,4,5};
    }
    public void ReactViewManager(){
       super();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReactViewGroup createViewInstance(n0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ReactViewManager.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReactViewGroup(p0);
    }
    public Map getCommandsMap(){
       Object obj = PatchProxy.apply(null, this, ReactViewManager.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.e("hotspotUpdate", Integer.valueOf(1), "setPressed", Integer.valueOf(2));
    }
    public String getName(){
       return "RCTView";
    }
    public final void handleHotspotUpdate(ReactViewGroup p0,ReadableArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactViewManager.class, "27")) {
          return;
       }
       if (p1 == null || p1.size() != 2) {
          throw new JSApplicationIllegalArgumentException("Illegal number of arguments for \'updateHotspot\' command");
       }
       p0.drawableHotspotChanged(p.b(p1.getDouble(0)), p.b(p1.getDouble(1)));
       return;
    }
    public final void handleSetPressed(ReactViewGroup p0,ReadableArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactViewManager.class, "26")) {
          return;
       }
       if (p1 == null || p1.size() != 1) {
          throw new JSApplicationIllegalArgumentException("Illegal number of arguments for \'setPressed\' command");
       }
       p0.setPressed(p1.getBoolean(0));
       return;
    }
    public void nextFocusDown(ReactViewGroup p0,int p1){
       ReactViewManager reactViewMan = ReactViewManager.class;
       if (PatchProxy.isSupport(reactViewMan) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, reactViewMan, "3")) {
          return;
       }
       p0.setNextFocusDownId(p1);
       return;
    }
    public void nextFocusForward(ReactViewGroup p0,int p1){
       ReactViewManager reactViewMan = ReactViewManager.class;
       if (PatchProxy.isSupport(reactViewMan) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, reactViewMan, "4")) {
          return;
       }
       p0.setNextFocusForwardId(p1);
       return;
    }
    public void nextFocusLeft(ReactViewGroup p0,int p1){
       ReactViewManager reactViewMan = ReactViewManager.class;
       if (PatchProxy.isSupport(reactViewMan) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, reactViewMan, "5")) {
          return;
       }
       p0.setNextFocusLeftId(p1);
       return;
    }
    public void nextFocusRight(ReactViewGroup p0,int p1){
       ReactViewManager reactViewMan = ReactViewManager.class;
       if (PatchProxy.isSupport(reactViewMan) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, reactViewMan, "6")) {
          return;
       }
       p0.setNextFocusRightId(p1);
       return;
    }
    public void nextFocusUp(ReactViewGroup p0,int p1){
       ReactViewManager reactViewMan = ReactViewManager.class;
       if (PatchProxy.isSupport(reactViewMan) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, reactViewMan, "7")) {
          return;
       }
       p0.setNextFocusUpId(p1);
       return;
    }
    public void receiveCommand(View p0,int p1,ReadableArray p2){
       this.receiveCommand(p0, p1, p2);
    }
    public void receiveCommand(View p0,String p1,ReadableArray p2){
       this.receiveCommand(p0, p1, p2);
    }
    public void receiveCommand(ReactViewGroup p0,int p1,ReadableArray p2){
       if (PatchProxy.isSupport(ReactViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ReactViewManager.class, "24")) {
          return;
       }
       if (p1 != 1) {
          if (p1 == 2) {
             this.handleSetPressed(p0, p2);
          }
       }else {
          this.handleHotspotUpdate(p0, p2);
       }
       return;
    }
    public void receiveCommand(ReactViewGroup p0,String p1,ReadableArray p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ReactViewManager.class, "25")) {
          return;
       }
       Objects.requireNonNull(p1);
       if (!p1.equals("setPressed")) {
          if (p1.equals("hotspotUpdate")) {
             this.handleHotspotUpdate(p0, p2);
          }
       }else {
          this.handleSetPressed(p0, p2);
       }
       return;
    }
    public void setAccessible(ReactViewGroup p0,boolean p1){
       ReactViewManager reactViewMan = ReactViewManager.class;
       if (PatchProxy.isSupport(reactViewMan) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactViewMan, "1")) {
          return;
       }
       p0.setFocusable(p1);
       return;
    }
    public void setBackfaceVisibility(ReactViewGroup p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactViewManager.class, "19")) {
          return;
       }
       p0.setBackfaceVisibility(p1);
       return;
    }
    public void setBorderColor(ReactViewGroup p0,int p1,Integer p2){
       if (PatchProxy.isSupport(ReactViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, ReactViewManager.class, "16")) {
          return;
       }
       float f = Float.NaN;
       float f1 = (p2 == null)? Float.NaN: (float)(p2.intValue() & 0xffffff);
       if (p2 != null) {
          f = (float)(p2.intValue() >> 24);
       }
       p0.setBorderColor(ReactViewManager.SPACING_TYPES[p1], f1, f);
       return;
    }
    public void setBorderRadius(ReactViewGroup p0,int p1,float p2){
       if (PatchProxy.isSupport(ReactViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), this, ReactViewManager.class, "8")) {
          return;
       }
       if (!d.a(p2) && p2 < 0) {
          p2 = Float.NaN;
       }
       if (!d.a(p2)) {
          p2 = p.c(p2);
       }
       if (!p1) {
          p0.setBorderRadius(p2);
       }else {
          p1--;
          p0.setBorderRadius(p2, p1);
       }
       return;
    }
    public void setBorderStyle(ReactViewGroup p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactViewManager.class, "9")) {
          return;
       }
       p0.setBorderStyle(p1);
       return;
    }
    public void setBorderWidth(ReactViewGroup p0,int p1,float p2){
       if (PatchProxy.isSupport(ReactViewManager.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Float.valueOf(p2), this, ReactViewManager.class, "15")) {
          return;
       }
       if (!d.a(p2) && p2 < 0) {
          p2 = Float.NaN;
       }
       if (!d.a(p2)) {
          p2 = p.c(p2);
       }
       p0.setBorderWidth(ReactViewManager.SPACING_TYPES[p1], p2);
       return;
    }
    public void setCollapsable(ReactViewGroup p0,boolean p1){
    }
    public void setFocusable(ReactViewGroup p0,boolean p1){
       ReactViewManager reactViewMan = ReactViewManager.class;
       if (PatchProxy.isSupport(reactViewMan) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactViewMan, "17")) {
          return;
       }
       if (p1) {
          p0.setOnClickListener(new ReactViewManager$a(this, p0));
          p0.setFocusable(true);
       }else {
          p0.setOnClickListener(null);
          p0.setClickable(false);
       }
       return;
    }
    public void setHitSlop(ReactViewGroup p0,ReadableMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactViewManager.class, "10")) {
          return;
       }
       if (p1 == null) {
          p0.setHitSlopRect(null);
       }else {
          String str = "left";
          int i = 0;
          int i1 = (p1.hasKey(str))? (int)p.b(p1.getDouble(str)): 0;
          String str1 = "top";
          int i2 = (p1.hasKey(str1))? (int)p.b(p1.getDouble(str1)): 0;
          String str2 = "right";
          int i3 = (p1.hasKey(str2))? (int)p.b(p1.getDouble(str2)): 0;
          String str3 = "bottom";
          if (p1.hasKey(str3)) {
             i = (int)p.b(p1.getDouble(str3));
          }
          p0.setHitSlopRect(new Rect(i1, i2, i3, i));
       }
       return;
    }
    public void setNativeBackground(ReactViewGroup p0,ReadableMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactViewManager.class, "12")) {
          return;
       }
       Drawable uDrawable = (p1 == null)? null: c.a(p0.getContext(), p1);
       p0.setTranslucentBackgroundDrawable(uDrawable);
       return;
    }
    public void setNativeForeground(ReactViewGroup p0,ReadableMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactViewManager.class, "13")) {
          return;
       }
       Drawable uDrawable = (p1 == null)? null: c.a(p0.getContext(), p1);
       p0.setForeground(uDrawable);
       return;
    }
    public void setNeedsOffscreenAlphaCompositing(ReactViewGroup p0,boolean p1){
       ReactViewManager reactViewMan = ReactViewManager.class;
       if (PatchProxy.isSupport(reactViewMan) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactViewMan, "14")) {
          return;
       }
       p0.setNeedsOffscreenAlphaCompositing(p1);
       return;
    }
    public void setOpacity(View p0,float p1){
       this.setOpacity(p0, p1);
    }
    public void setOpacity(ReactViewGroup p0,float p1){
       ReactViewManager reactViewMan = ReactViewManager.class;
       if (PatchProxy.isSupport(reactViewMan) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, reactViewMan, "20")) {
          return;
       }
       p0.setOpacityIfPossible(p1);
       return;
    }
    public void setOverflow(ReactViewGroup p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactViewManager.class, "18")) {
          return;
       }
       p0.setOverflow(p1);
       return;
    }
    public void setPointerEvents(ReactViewGroup p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactViewManager.class, "11")) {
          return;
       }
       if (p1 == null) {
          p0.setPointerEvents(PointerEvents.AUTO);
       }else {
          p0.setPointerEvents(PointerEvents.valueOf((p1.toUpperCase(Locale.US)).replace("-", "_")));
       }
       return;
    }
    public void setTVPreferredFocus(ReactViewGroup p0,boolean p1){
       ReactViewManager reactViewMan = ReactViewManager.class;
       if (PatchProxy.isSupport(reactViewMan) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, reactViewMan, "2")) {
          return;
       }
       if (p1) {
          p0.setFocusable(true);
          p0.setFocusableInTouchMode(true);
          p0.requestFocus();
       }
       return;
    }
    public void setTransform(View p0,ReadableArray p1){
       this.setTransform(p0, p1);
    }
    public void setTransform(ReactViewGroup p0,ReadableArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ReactViewManager.class, "21")) {
          return;
       }
       super.setTransform(p0, p1);
       p0.setBackfaceVisibilityDependantOpacity();
       return;
    }
}
