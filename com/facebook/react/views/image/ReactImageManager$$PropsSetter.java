package com.facebook.react.views.image.ReactImageManager$$PropsSetter;
import com.facebook.react.uimanager.k$e;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.uimanager.ViewManager;
import android.view.View;
import com.facebook.react.views.image.ReactImageManager;
import com.facebook.react.views.image.ReactImageView;
import java.util.Objects;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Double;
import java.lang.Integer;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Boolean;

public class ReactImageManager$$PropsSetter implements k$e	// class@0013b9
{

    public void ReactImageManager$$PropsSetter(){
       super();
    }
    public void getProperties(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactImageManager$$PropsSetter.class, "2")) {
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
       p0.put("blurRadius", "number");
       p0.put("borderBottomLeftRadius", "number");
       p0.put("borderBottomRightRadius", "number");
       p0.put("borderColor", "Color");
       p0.put("borderRadius", "number");
       p0.put("borderTopLeftRadius", "number");
       p0.put("borderTopRightRadius", "number");
       p0.put("borderWidth", "number");
       p0.put("defaultSrc", "String");
       p0.put("elevation", "number");
       p0.put("fadeDuration", "number");
       p0.put("headers", "Map");
       p0.put("importantForAccessibility", "String");
       p0.put("loadingIndicatorSrc", "String");
       p0.put("nativeID", "String");
       p0.put("opacity", "number");
       p0.put("overlayColor", "Color");
       p0.put("progressiveRenderingEnabled", "boolean");
       p0.put("renderToHardwareTextureAndroid", "boolean");
       p0.put("resizeMethod", "String");
       p0.put("resizeMode", "String");
       p0.put("rotation", "number");
       p0.put("scaleX", "number");
       p0.put("scaleY", "number");
       p0.put("shouldNotifyLoadEvents", "boolean");
       p0.put("src", "Array");
       p0.put("testID", "String");
       p0.put("tintColor", "Color");
       p0.put("transform", "Array");
       p0.put("translateX", "number");
       p0.put("translateY", "number");
       p0.put("zIndex", "number");
       return;
    }
    public void setProperty(ViewManager p0,View p1,String p2,Object p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, ReactImageManager$$PropsSetter.class, "1")) {
       }else {
          Objects.requireNonNull(p2);
          int i = -1;
          int i1 = 0;
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
              case 0xa1b502b5:
                if (p2.equals("resizeMethod")) {
                   i = 2;
                }
                break;
              case 0xaadf5fd9:
                if (p2.equals("blurRadius")) {
                   i = 3;
                }
                break;
              case 0xb477f80b:
                if (p2.equals("opacity")) {
                   i = 4;
                }
                break;
              case 0xb6cd31e2:
                if (p2.equals("borderTopLeftRadius")) {
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
              case 0xf43e4c30:
                if (p2.equals("fadeDuration")) {
                   i = 10;
                }
                break;
              case 0xf7bfd4b1:
                if (p2.equals("loadingIndicatorSrc")) {
                   i = 11;
                }
                break;
              case 0xf9f0bcf5:
                if (p2.equals("accessibilityHint")) {
                   i = 12;
                }
                break;
              case 0xf9f55ee4:
                if (p2.equals("accessibilityRole")) {
                   i = 13;
                }
                break;
              case 0xfb2db0ed:
                if (p2.equals("renderToHardwareTextureAndroid")) {
                   i = 14;
                }
                break;
              case 0xfd990f7e:
                if (p2.equals("rotation")) {
                   i = 15;
                }
                break;
              case 0xffbd2e5d:
                if (p2.equals("elevation")) {
                   i = 16;
                }
                break;
              case 0x1bde4:
                if (p2.equals("src")) {
                   i = 17;
                }
                break;
              case 0x22936ee:
                if (p2.equals("accessibilityLiveRegion")) {
                   i = 18;
                }
                break;
              case 0xa010d9b:
                if (p2.equals("shouldNotifyLoadEvents")) {
                   i = 19;
                }
                break;
              case 0xf7e2cf3:
                if (p2.equals("overlayColor")) {
                   i = 20;
                }
                break;
              case 0x13dfc885:
                if (p2.equals("borderTopRightRadius")) {
                   i = 21;
                }
                break;
              case 0x22a57450:
                if (p2.equals("borderBottomLeftRadius")) {
                   i = 22;
                }
                break;
              case 0x230fd3d7:
                if (p2.equals("borderBottomRightRadius")) {
                   i = 23;
                }
                break;
              case 0x28733be3:
                if (p2.equals("defaultSrc")) {
                   i = 24;
                }
                break;
              case 0x2b158697:
                if (p2.equals("borderColor")) {
                   i = 25;
                }
                break;
              case 0x2c2c84fa:
                if (p2.equals("borderWidth")) {
                   i = 26;
                }
                break;
              case 0x2c861b47:
                if (p2.equals("importantForAccessibility")) {
                   i = 27;
                }
                break;
              case 0x2f676f86:
                if (p2.equals("headers")) {
                   i = 28;
                }
                break;
              case 0x3252e0c0:
                if (p2.equals("progressiveRenderingEnabled")) {
                   i = 29;
                }
                break;
              case 0x3ebe6b6c:
                if (p2.equals("transform")) {
                   i = 30;
                }
                break;
              case 0x445b6e46:
                if (p2.equals("accessibilityLabel")) {
                   i = 31;
                }
                break;
              case 0x44c6b3e3:
                if (p2.equals("accessibilityState")) {
                   i = 32;
                }
                break;
              case 0x44e880c3:
                if (p2.equals("accessibilityValue")) {
                   i = 33;
                }
                break;
              case 0x4cb7f6d5:
                if (p2.equals("backgroundColor")) {
                   i = 34;
                }
                break;
              case 0x4f219128:
                if (p2.equals("tintColor")) {
                   i = 35;
                }
                break;
              case 0x506afbde:
                if (p2.equals("borderRadius")) {
                   i = 36;
                }
                break;
              case 0x59bdabcf:
                if (p2.equals("accessibilityActions")) {
                   i = 37;
                }
                break;
              case 0x79eeaf72:
                if (p2.equals("nativeID")) {
                   i = 38;
                }
                break;
              case 0x7a2cd077:
                if (p2.equals("resizeMode")) {
                   i = 39;
                }
                break;
              default:
          }
       label_023e :
          float f = 0x3f800000;
          Integer integer = null;
          float f1 = Float.NaN;
          float f2 = 0;
          switch (i){
              case 0:
                if (p3 != null) {
                   f2 = p3.floatValue();
                }
                p0.setTranslateX(p1, f2);
                break;
              case 1:
                if (p3 != null) {
                   f2 = p3.floatValue();
                }
                p0.setTranslateY(p1, f2);
                break;
              case 2:
                p0.setResizeMethod(p1, p3);
                break;
              case 3:
                if (p3 != null) {
                   f2 = p3.floatValue();
                }
                p0.setBlurRadius(p1, f2);
                break;
              case 4:
                if (p3 != null) {
                   f = p3.floatValue();
                }
                p0.setOpacity(p1, f);
                break;
              case 5:
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderRadius(p1, 1, f1);
                break;
              case 6:
                if (p3 != null) {
                   f = p3.floatValue();
                }
                p0.setScaleX(p1, f);
                break;
              case 7:
                if (p3 != null) {
                   f = p3.floatValue();
                }
                p0.setScaleY(p1, f);
                break;
              case 8:
                p0.setTestId(p1, p3);
                break;
              case 9:
                if (p3 != null) {
                   f2 = p3.floatValue();
                }
                p0.setZIndex(p1, f2);
                break;
              case 10:
                if (p3 != null) {
                   i1 = p3.intValue();
                }
                p0.setFadeDuration(p1, i1);
                break;
              case 11:
                p0.setLoadingIndicatorSource(p1, p3);
                break;
              case 12:
                p0.setAccessibilityHint(p1, p3);
                break;
              case 13:
                p0.setAccessibilityRole(p1, p3);
                break;
              case 14:
                if (p3 != null) {
                   i1 = p3.booleanValue();
                }
                p0.setRenderToHardwareTexture(p1, i1);
                break;
              case 15:
                if (p3 != null) {
                   f2 = p3.floatValue();
                }
                p0.setRotation(p1, f2);
                break;
              case 16:
                if (p3 != null) {
                   f2 = p3.floatValue();
                }
                p0.setElevation(p1, f2);
                break;
              case 17:
                p0.setSource(p1, p3);
                break;
              case 18:
                p0.setAccessibilityLiveRegion(p1, p3);
                break;
              case 19:
                if (p3 != null) {
                   i1 = p3.booleanValue();
                }
                p0.setLoadHandlersRegistered(p1, i1);
                break;
              case 20:
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                p0.setOverlayColor(p1, integer);
                break;
              case 21:
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderRadius(p1, 2, f1);
                break;
              case 22:
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderRadius(p1, 4, f1);
                break;
              case 23:
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderRadius(p1, 3, f1);
                break;
              case 24:
                p0.setDefaultSource(p1, p3);
                break;
              case 25:
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                p0.setBorderColor(p1, integer);
                break;
              case 26:
                if (p3 != null) {
                   f2 = p3.floatValue();
                }
                p0.setBorderWidth(p1, f2);
                break;
              case 27:
                p0.setImportantForAccessibility(p1, p3);
                break;
              case 28:
                p0.setHeaders(p1, p3);
                break;
              case 29:
                if (p3 != null) {
                   i1 = p3.booleanValue();
                }
                p0.setProgressiveRenderingEnabled(p1, i1);
                break;
              case 30:
                p0.setTransform(p1, p3);
                break;
              case 31:
                p0.setAccessibilityLabel(p1, p3);
                break;
              case 32:
                p0.setViewState(p1, p3);
                break;
              case '!':
                p0.setAccessibilityValue(p1, p3);
                break;
              case '"':
                if (p3 != null) {
                   i1 = p3.intValue();
                }
                p0.setBackgroundColor(p1, i1);
                break;
              case '#':
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                p0.setTintColor(p1, integer);
                break;
              case '$':
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderRadius(p1, i1, f1);
                break;
              case '%':
                p0.setAccessibilityActions(p1, p3);
                break;
              case '&':
                p0.setNativeId(p1, p3);
                break;
              case 39:
                p0.setResizeMode(p1, p3);
                break;
              default:
          }
       }
       return;
    }
}
