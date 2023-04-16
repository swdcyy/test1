package com.facebook.react.views.picker.ReactDialogPickerManager$$PropsSetter;
import com.facebook.react.uimanager.k$e;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.uimanager.ViewManager;
import android.view.View;
import com.facebook.react.views.picker.ReactDialogPickerManager;
import com.facebook.react.views.picker.ReactPicker;
import java.util.Objects;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Double;
import com.facebook.react.views.picker.ReactPickerManager;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Integer;
import java.lang.Boolean;

public class ReactDialogPickerManager$$PropsSetter implements k$e	// class@0013d0
{

    public void ReactDialogPickerManager$$PropsSetter(){
       super();
    }
    public void getProperties(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactDialogPickerManager$$PropsSetter.class, "2")) {
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
       p0.put("color", "Color");
       p0.put("elevation", "number");
       p0.put("enabled", "boolean");
       p0.put("importantForAccessibility", "String");
       p0.put("items", "Array");
       p0.put("nativeID", "String");
       p0.put("opacity", "number");
       p0.put("prompt", "String");
       p0.put("renderToHardwareTextureAndroid", "boolean");
       p0.put("rotation", "number");
       p0.put("scaleX", "number");
       p0.put("scaleY", "number");
       p0.put("selected", "number");
       p0.put("testID", "String");
       p0.put("transform", "Array");
       p0.put("translateX", "number");
       p0.put("translateY", "number");
       p0.put("zIndex", "number");
       return;
    }
    public void setProperty(ViewManager p0,View p1,String p2,Object p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, ReactDialogPickerManager$$PropsSetter.class, "1")) {
       }else {
          Objects.requireNonNull(p2);
          int i = -1;
          boolean b = false;
          boolean b1 = true;
          switch (p2.hashCode()){
              case 0x995d38ca:
                if (p2.equals("translateX")) {
                   i = 0;
                }
                break;
              case 0x995d38cb:
                if (p2.equals("translateY")) {
                   i = 1;
                }
                break;
              case 0xa00f8b41:
                if (p2.equals("enabled")) {
                   i = 2;
                }
                break;
              case 0xb477f80b:
                if (p2.equals("opacity")) {
                   i = 3;
                }
                break;
              case 0xc5995964:
                if (p2.equals("prompt")) {
                   i = 4;
                }
                break;
              case 0xc9de204e:
                if (p2.equals("scaleX")) {
                   i = 5;
                }
                break;
              case 0xc9de204f:
                if (p2.equals("scaleY")) {
                   i = 6;
                }
                break;
              case 0xcbb7712d:
                if (p2.equals("testID")) {
                   i = 7;
                }
                break;
              case 0xd4677478:
                if (p2.equals("zIndex")) {
                   i = 8;
                }
                break;
              case 0xf9f0bcf5:
                if (p2.equals("accessibilityHint")) {
                   i = 9;
                }
                break;
              case 0xf9f55ee4:
                if (p2.equals("accessibilityRole")) {
                   i = 10;
                }
                break;
              case 0xfb2db0ed:
                if (p2.equals("renderToHardwareTextureAndroid")) {
                   i = 11;
                }
                break;
              case 0xfd990f7e:
                if (p2.equals("rotation")) {
                   i = 12;
                }
                break;
              case 0xffbd2e5d:
                if (p2.equals("elevation")) {
                   i = 13;
                }
                break;
              case 0x22936ee:
                if (p2.equals("accessibilityLiveRegion")) {
                   i = 14;
                }
                break;
              case 0x5a72f63:
                if (p2.equals("color")) {
                   i = 15;
                }
                break;
              case 0x5fde7c0:
                if (p2.equals("items")) {
                   i = 16;
                }
                break;
              case 0x2c861b47:
                if (p2.equals("importantForAccessibility")) {
                   i = 17;
                }
                break;
              case 0x3ebe6b6c:
                if (p2.equals("transform")) {
                   i = 18;
                }
                break;
              case 0x445b6e46:
                if (p2.equals("accessibilityLabel")) {
                   i = 19;
                }
                break;
              case 0x44c6b3e3:
                if (p2.equals("accessibilityState")) {
                   i = 20;
                }
                break;
              case 0x44e880c3:
                if (p2.equals("accessibilityValue")) {
                   i = 21;
                }
                break;
              case 0x4705f29b:
                if (p2.equals("selected")) {
                   i = 22;
                }
                break;
              case 0x4cb7f6d5:
                if (p2.equals("backgroundColor")) {
                   i = 23;
                }
                break;
              case 0x59bdabcf:
                if (p2.equals("accessibilityActions")) {
                   i = 24;
                }
                break;
              case 0x79eeaf72:
                if (p2.equals("nativeID")) {
                   i = 25;
                }
                break;
              default:
          }
       label_0177 :
          float f = 0x3f800000;
          float f1 = 0;
          switch (i){
              case 0:
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setTranslateX(p1, f1);
                break;
              case 1:
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setTranslateY(p1, f1);
                break;
              case 2:
                if (p3 != null) {
                   b1 = p3.booleanValue();
                }
                p0.setEnabled(p1, b1);
                break;
              case 3:
                if (p3 != null) {
                   f = p3.floatValue();
                }
                p0.setOpacity(p1, f);
                break;
              case 4:
                p0.setPrompt(p1, p3);
                break;
              case 5:
                if (p3 != null) {
                   f = p3.floatValue();
                }
                p0.setScaleX(p1, f);
                break;
              case 6:
                if (p3 != null) {
                   f = p3.floatValue();
                }
                p0.setScaleY(p1, f);
                break;
              case 7:
                p0.setTestId(p1, p3);
                break;
              case 8:
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setZIndex(p1, f1);
                break;
              case 9:
                p0.setAccessibilityHint(p1, p3);
                break;
              case 10:
                p0.setAccessibilityRole(p1, p3);
                break;
              case 11:
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                p0.setRenderToHardwareTexture(p1, b);
                break;
              case 12:
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setRotation(p1, f1);
                break;
              case 13:
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setElevation(p1, f1);
                break;
              case 14:
                p0.setAccessibilityLiveRegion(p1, p3);
                break;
              case 15:
                Integer integer = (p3 == null)? null: Integer.valueOf(p3.intValue());
                p0.setColor(p1, integer);
                break;
              case 16:
                p0.setItems(p1, p3);
                break;
              case 17:
                p0.setImportantForAccessibility(p1, p3);
                break;
              case 18:
                p0.setTransform(p1, p3);
                break;
              case 19:
                p0.setAccessibilityLabel(p1, p3);
                break;
              case 20:
                p0.setViewState(p1, p3);
                break;
              case 21:
                p0.setAccessibilityValue(p1, p3);
                break;
              case 22:
                if (p3 != null) {
                   b = p3.intValue();
                }
                p0.setSelected(p1, b);
                break;
              case 23:
                if (p3 != null) {
                   b = p3.intValue();
                }
                p0.setBackgroundColor(p1, b);
                break;
              case 24:
                p0.setAccessibilityActions(p1, p3);
                break;
              case 25:
                p0.setNativeId(p1, p3);
                break;
              default:
          }
       }
       return;
    }
}
