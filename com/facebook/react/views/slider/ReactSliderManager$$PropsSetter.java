package com.facebook.react.views.slider.ReactSliderManager$$PropsSetter;
import com.facebook.react.uimanager.k$e;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.uimanager.ViewManager;
import android.view.View;
import com.facebook.react.views.slider.ReactSliderManager;
import com.facebook.react.views.slider.ReactSlider;
import java.util.Objects;
import com.facebook.react.uimanager.BaseViewManager;
import java.lang.Double;
import java.lang.Integer;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Boolean;

public class ReactSliderManager$$PropsSetter implements k$e	// class@0013f2
{

    public void ReactSliderManager$$PropsSetter(){
       super();
    }
    public void getProperties(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactSliderManager$$PropsSetter.class, "2")) {
          return;
       }
       p0.put("accessibilityActions", "Array");
       p0.put("accessibilityHint", "String");
       p0.put("accessibilityLabel", "String");
       p0.put("accessibilityLiveRegion", "String");
       p0.put("accessibilityRole", "String");
       p0.put("accessibilityState", "Map");
       p0.put("accessibilityValue", "Map");
       p0.put("backgroundColor", "Color");
       p0.put("elevation", "number");
       p0.put("enabled", "boolean");
       p0.put("importantForAccessibility", "String");
       p0.put("maximumTrackTintColor", "Color");
       p0.put("maximumValue", "number");
       p0.put("minimumTrackTintColor", "Color");
       p0.put("minimumValue", "number");
       p0.put("nativeID", "String");
       p0.put("opacity", "number");
       p0.put("renderToHardwareTextureAndroid", "boolean");
       p0.put("rotation", "number");
       p0.put("scaleX", "number");
       p0.put("scaleY", "number");
       p0.put("step", "number");
       p0.put("testID", "String");
       p0.put("thumbTintColor", "Color");
       p0.put("transform", "Array");
       p0.put("translateX", "number");
       p0.put("translateY", "number");
       p0.put("value", "number");
       p0.put("zIndex", "number");
       return;
    }
    public void setProperty(ViewManager p0,View p1,String p2,Object p3){
       double this;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, ReactSliderManager$$PropsSetter.class, "1")) {
       }else {
          Objects.requireNonNull(p2);
          int i = -1;
          boolean b = false;
          boolean b1 = true;
          switch (p2.hashCode()){
              case 0x8eb64e5d:
                if (p2.equals("maximumTrackTintColor")) {
                   i = 0;
                }
                break;
              case 0x995d38ca:
                if (p2.equals("translateX")) {
                   i = 1;
                }
                break;
              case 0x995d38cb:
                if (p2.equals("translateY")) {
                   i = 2;
                }
                break;
              case 0xa00f8b41:
                if (p2.equals("enabled")) {
                   i = 3;
                }
                break;
              case 0xb477f80b:
                if (p2.equals("opacity")) {
                   i = 4;
                }
                break;
              case 0xc31d2fcb:
                if (p2.equals("minimumTrackTintColor")) {
                   i = 5;
                }
                break;
              case 0xc9de204e:
                if (p2.equals("scaleX")) {
                   i = 6;
                }
                break;
              case 0xc9de204f:
                if (p2.equals("scaleY")) {
                   i = 7;
                }
                break;
              case 0xcbb7712d:
                if (p2.equals("testID")) {
                   i = 8;
                }
                break;
              case 0xd4677478:
                if (p2.equals("zIndex")) {
                   i = 9;
                }
                break;
              case 0xf9f0bcf5:
                if (p2.equals("accessibilityHint")) {
                   i = 10;
                }
                break;
              case 0xf9f55ee4:
                if (p2.equals("accessibilityRole")) {
                   i = 11;
                }
                break;
              case 0xfb2db0ed:
                if (p2.equals("renderToHardwareTextureAndroid")) {
                   i = 12;
                }
                break;
              case 0xfd990f7e:
                if (p2.equals("rotation")) {
                   i = 13;
                }
                break;
              case 0xffbd2e5d:
                if (p2.equals("elevation")) {
                   i = 14;
                }
                break;
              case 0x3606cc:
                if (p2.equals("step")) {
                   i = 15;
                }
                break;
              case 0x22936ee:
                if (p2.equals("accessibilityLiveRegion")) {
                   i = 16;
                }
                break;
              case 0x6ac9171:
                if (p2.equals("value")) {
                   i = 17;
                }
                break;
              case 0x2accbf31:
                if (p2.equals("maximumValue")) {
                   i = 18;
                }
                break;
              case 0x2c861b47:
                if (p2.equals("importantForAccessibility")) {
                   i = 19;
                }
                break;
              case 0x3ebe6b6c:
                if (p2.equals("transform")) {
                   i = 20;
                }
                break;
              case 0x445b6e46:
                if (p2.equals("accessibilityLabel")) {
                   i = 21;
                }
                break;
              case 0x44c6b3e3:
                if (p2.equals("accessibilityState")) {
                   i = 22;
                }
                break;
              case 0x44e880c3:
                if (p2.equals("accessibilityValue")) {
                   i = 23;
                }
                break;
              case 0x4713ea03:
                if (p2.equals("minimumValue")) {
                   i = 24;
                }
                break;
              case 0x4cb7f6d5:
                if (p2.equals("backgroundColor")) {
                   i = 25;
                }
                break;
              case 0x59bdabcf:
                if (p2.equals("accessibilityActions")) {
                   i = 26;
                }
                break;
              case 0x71fbaff2:
                if (p2.equals("thumbTintColor")) {
                   i = 27;
                }
                break;
              case 0x79eeaf72:
                if (p2.equals("nativeID")) {
                   i = 28;
                }
                break;
              default:
          }
       label_01a1 :
          int i1 = 0x3f800000;
          this = 0;
          Integer integer = null;
          float f = 0;
          switch (i){
              case 0:
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                p0.setMaximumTrackTintColor(p1, integer);
                break;
              case 1:
                if (p3 != null) {
                   f = p3.floatValue();
                }
                p0.setTranslateX(p1, f);
                break;
              case 2:
                if (p3 != null) {
                   f = p3.floatValue();
                }
                p0.setTranslateY(p1, f);
                break;
              case 3:
                if (p3 != null) {
                   b1 = p3.booleanValue();
                }
                p0.setEnabled(p1, b1);
                break;
              case 4:
                if (p3 != null) {
                   i1 = p3.floatValue();
                }
                p0.setOpacity(p1, i1);
                break;
              case 5:
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                p0.setMinimumTrackTintColor(p1, integer);
                break;
              case 6:
                if (p3 != null) {
                   i1 = p3.floatValue();
                }
                p0.setScaleX(p1, i1);
                break;
              case 7:
                if (p3 != null) {
                   i1 = p3.floatValue();
                }
                p0.setScaleY(p1, i1);
                break;
              case 8:
                p0.setTestId(p1, p3);
                break;
              case 9:
                if (p3 != null) {
                   f = p3.floatValue();
                }
                p0.setZIndex(p1, f);
                break;
              case 10:
                p0.setAccessibilityHint(p1, p3);
                break;
              case 11:
                p0.setAccessibilityRole(p1, p3);
                break;
              case 12:
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                p0.setRenderToHardwareTexture(p1, b);
                break;
              case 13:
                if (p3 != null) {
                   f = p3.floatValue();
                }
                p0.setRotation(p1, f);
                break;
              case 14:
                if (p3 != null) {
                   f = p3.floatValue();
                }
                p0.setElevation(p1, f);
                break;
              case 15:
                if (p3 != null) {
                   this = p3.doubleValue();
                }
                p0.setStep(p1, this);
                break;
              case 16:
                p0.setAccessibilityLiveRegion(p1, p3);
                break;
              case 17:
                if (p3 != null) {
                   this = p3.doubleValue();
                }
                p0.setValue(p1, this);
                break;
              case 18:
                double d = (p3 == null)? 0x3ff0000000000000: p3.doubleValue();
                p0.setMaximumValue(p1, d);
                break;
              case 19:
                p0.setImportantForAccessibility(p1, p3);
                break;
              case 20:
                p0.setTransform(p1, p3);
                break;
              case 21:
                p0.setAccessibilityLabel(p1, p3);
                break;
              case 22:
                p0.setViewState(p1, p3);
                break;
              case 23:
                p0.setAccessibilityValue(p1, p3);
                break;
              case 24:
                if (p3 != null) {
                   this = p3.doubleValue();
                }
                p0.setMinimumValue(p1, this);
                break;
              case 25:
                if (p3 != null) {
                   b = p3.intValue();
                }
                p0.setBackgroundColor(p1, b);
                break;
              case 26:
                p0.setAccessibilityActions(p1, p3);
                break;
              case 27:
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                p0.setThumbTintColor(p1, integer);
                break;
              case 28:
                p0.setNativeId(p1, p3);
                break;
              default:
          }
       }
       return;
    }
}
