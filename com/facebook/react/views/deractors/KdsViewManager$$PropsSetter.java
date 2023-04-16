package com.facebook.react.views.deractors.KdsViewManager$$PropsSetter;
import com.facebook.react.uimanager.k$e;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.uimanager.ViewManager;
import android.view.View;
import com.facebook.react.views.deractors.KdsViewManager;
import com.facebook.react.views.view.ReactViewGroup;
import java.util.Objects;
import com.facebook.react.views.deractors.KdsViewGroup;
import java.lang.Double;
import java.lang.Integer;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Boolean;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.views.view.ReactClippingViewManager;

public class KdsViewManager$$PropsSetter implements k$e	// class@0013b2
{

    public void KdsViewManager$$PropsSetter(){
       super();
    }
    public void getProperties(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KdsViewManager$$PropsSetter.class, "2")) {
          return;
       }
       p0.put("accessibilityActions", "Array");
       p0.put("accessibilityHint", "String");
       p0.put("accessibilityLabel", "String");
       p0.put("accessibilityLiveRegion", "String");
       p0.put("accessibilityRole", "String");
       p0.put("accessibilityState", "Map");
       p0.put("accessibilityValue", "Map");
       p0.put("accessible", "boolean");
       p0.put("backfaceVisibility", "String");
       p0.put("backgroundColor", "Color");
       p0.put("backgroundImage", "Array");
       p0.put("borderBottomColor", "Color");
       p0.put("borderBottomEndRadius", "number");
       p0.put("borderBottomLeftRadius", "number");
       p0.put("borderBottomRightRadius", "number");
       p0.put("borderBottomStartRadius", "number");
       p0.put("borderBottomWidth", "number");
       p0.put("borderColor", "Color");
       p0.put("borderEndColor", "Color");
       p0.put("borderEndWidth", "number");
       p0.put("borderLeftColor", "Color");
       p0.put("borderLeftWidth", "number");
       p0.put("borderRadius", "number");
       p0.put("borderRightColor", "Color");
       p0.put("borderRightWidth", "number");
       p0.put("borderStartColor", "Color");
       p0.put("borderStartWidth", "number");
       p0.put("borderStyle", "String");
       p0.put("borderTopColor", "Color");
       p0.put("borderTopEndRadius", "number");
       p0.put("borderTopLeftRadius", "number");
       p0.put("borderTopRightRadius", "number");
       p0.put("borderTopStartRadius", "number");
       p0.put("borderTopWidth", "number");
       p0.put("borderWidth", "number");
       p0.put("collapsable", "boolean");
       p0.put("elevation", "number");
       p0.put("focusable", "boolean");
       p0.put("hasTVPreferredFocus", "boolean");
       p0.put("hitSlop", "Map");
       p0.put("importantForAccessibility", "String");
       p0.put("nativeBackgroundAndroid", "Map");
       p0.put("nativeForegroundAndroid", "Map");
       p0.put("nativeID", "String");
       p0.put("needsOffscreenAlphaCompositing", "boolean");
       p0.put("nextFocusDown", "number");
       p0.put("nextFocusForward", "number");
       p0.put("nextFocusLeft", "number");
       p0.put("nextFocusRight", "number");
       p0.put("nextFocusUp", "number");
       p0.put("opacity", "number");
       p0.put("overflow", "String");
       p0.put("pointerEvents", "String");
       p0.put("removeClippedSubviews", "boolean");
       p0.put("renderToHardwareTextureAndroid", "boolean");
       p0.put("rotation", "number");
       p0.put("scaleX", "number");
       p0.put("scaleY", "number");
       p0.put("testID", "String");
       p0.put("transform", "Array");
       p0.put("translateX", "number");
       p0.put("translateY", "number");
       p0.put("zIndex", "number");
       return;
    }
    public void setProperty(ViewManager p0,View p1,String p2,Object p3){
       int i1;
       float f2;
       String str = p2;
       KdsViewManager kdsViewManag = p0;
       KdsViewGroup kdsViewGroup = p1;
       if (PatchProxy.applyVoidFourRefs(kdsViewManag, kdsViewGroup, p2, p3, this, KdsViewManager$$PropsSetter.class, "1")) {
       }else {
          Objects.requireNonNull(p2);
          boolean b = false;
          int i = -1;
          switch (p2.hashCode()){
              case 0x896977f3:
                if (!str.equals("borderRightColor")) {
                label_038f :
                   i1 = -1;
                }else {
                   i1 = 0;
                }
                break;
              case 0x8a807656:
                if (!str.equals("borderRightWidth")) {
                   goto label_038f ;
                }else {
                   i1 = 1;
                }
                break;
              case 0x995d38ca:
                if (!str.equals("translateX")) {
                   goto label_038f ;
                }else {
                   i1 = 2;
                }
                break;
              case 0x995d38cb:
                if (!str.equals("translateY")) {
                   goto label_038f ;
                }else {
                   i1 = 3;
                }
                break;
              case 0x9acd69f6:
                if (!str.equals("backfaceVisibility")) {
                   goto label_038f ;
                }else {
                   i1 = 4;
                }
                break;
              case 0xa854f75a:
                if (!str.equals("borderTopColor")) {
                   goto label_038f ;
                }else {
                   i1 = 5;
                }
                break;
              case 0xa96bf5bd:
                if (!str.equals("borderTopWidth")) {
                   goto label_038f ;
                }else {
                   i1 = 6;
                }
                break;
              case 0xb1044d12:
                if (!str.equals("collapsable")) {
                   goto label_038f ;
                }else {
                   i1 = 7;
                }
                break;
              case 0xb1fc682c:
                if (!str.equals("borderBottomColor")) {
                   goto label_038f ;
                }else {
                   i1 = 8;
                }
                break;
              case 0xb313668f:
                if (!str.equals("borderBottomWidth")) {
                   goto label_038f ;
                }else {
                   i1 = 9;
                }
                break;
              case 0xb477f80b:
                if (!str.equals("opacity")) {
                   goto label_038f ;
                }else {
                   i1 = 10;
                }
                break;
              case 0xb6cd31e2:
                if (!str.equals("borderTopLeftRadius")) {
                   goto label_038f ;
                }else {
                   i1 = 11;
                }
                break;
              case 0xbbf79bb6:
                if (!str.equals("accessible")) {
                   goto label_038f ;
                }else {
                   i1 = 12;
                }
                break;
              case 0xbd1d7e4b:
                if (!str.equals("borderTopStartRadius")) {
                   goto label_038f ;
                }else {
                   i1 = 13;
                }
                break;
              case 0xc9de204e:
                if (!str.equals("scaleX")) {
                   goto label_038f ;
                }else {
                   i1 = 14;
                }
                break;
              case 0xc9de204f:
                if (!str.equals("scaleY")) {
                   goto label_038f ;
                }else {
                   i1 = 15;
                }
                break;
              case 0xcbb7712d:
                if (!str.equals("testID")) {
                   goto label_038f ;
                }else {
                   i1 = 16;
                }
                break;
              case 0xcc4d899d:
                if (!str.equals("borderBottomStartRadius")) {
                   goto label_038f ;
                }else {
                   i1 = 17;
                }
                break;
              case 0xd4677478:
                if (!str.equals("zIndex")) {
                   goto label_038f ;
                }else {
                   i1 = 18;
                }
                break;
              case 0xd77e6a93:
                if (!str.equals("hasTVPreferredFocus")) {
                   goto label_038f ;
                }else {
                   i1 = 19;
                }
                break;
              case 0xda5bf7e7:
                if (!str.equals("nextFocusDown")) {
                   goto label_038f ;
                }else {
                   i1 = 20;
                }
                break;
              case 0xda5f734c:
                if (!str.equals("nextFocusLeft")) {
                   goto label_038f ;
                }else {
                   i1 = 21;
                }
                break;
              case 0xe32e85c4:
                if (!str.equals("borderTopEndRadius")) {
                   goto label_038f ;
                }else {
                   i1 = 22;
                }
                break;
              case 0xee81a9b6:
                if (!str.equals("pointerEvents")) {
                   goto label_038f ;
                }else {
                   i1 = 23;
                }
                break;
              case 0xf0f92be9:
                if (!str.equals("removeClippedSubviews")) {
                   goto label_038f ;
                }else {
                   i1 = 24;
                }
                break;
              case 0xf18f28d0:
                if (!str.equals("borderLeftColor")) {
                   goto label_038f ;
                }else {
                   i1 = 25;
                }
                break;
              case 0xf2a62733:
                if (!str.equals("borderLeftWidth")) {
                   goto label_038f ;
                }else {
                   i1 = 26;
                }
                break;
              case 0xf72d3d96:
                if (!str.equals("borderBottomEndRadius")) {
                   goto label_038f ;
                }else {
                   i1 = 27;
                }
                break;
              case 0xf9764455:
                if (!str.equals("nativeForegroundAndroid")) {
                   goto label_038f ;
                }else {
                   i1 = 28;
                }
                break;
              case 0xf9f0bcf5:
                if (!str.equals("accessibilityHint")) {
                   goto label_038f ;
                }else {
                   i1 = 29;
                }
                break;
              case 0xf9f55ee4:
                if (!str.equals("accessibilityRole")) {
                   goto label_038f ;
                }else {
                   i1 = 30;
                }
                break;
              case 0xfb2db0ed:
                if (!str.equals("renderToHardwareTextureAndroid")) {
                   goto label_038f ;
                }else {
                   i1 = 31;
                }
                break;
              case 0xfd990f7e:
                if (!str.equals("rotation")) {
                   goto label_038f ;
                }else {
                   i1 = 32;
                }
                break;
              case 0xffbd2e5d:
                if (!str.equals("elevation")) {
                   goto label_038f ;
                }else {
                   i1 = 33;
                }
                break;
              case 0x22936ee:
                if (!str.equals("accessibilityLiveRegion")) {
                   goto label_038f ;
                }else {
                   i1 = 34;
                }
                break;
              case 0x13dfc885:
                if (!str.equals("borderTopRightRadius")) {
                   goto label_038f ;
                }else {
                   i1 = 35;
                }
                break;
              case 0x1e013d60:
                if (!str.equals("nextFocusForward")) {
                   goto label_038f ;
                }else {
                   i1 = 36;
                }
                break;
              case 0x1f91b402:
                if (!str.equals("overflow")) {
                   goto label_038f ;
                }else {
                   i1 = 37;
                }
                break;
              case 0x22a57450:
                if (!str.equals("borderBottomLeftRadius")) {
                   goto label_038f ;
                }else {
                   i1 = 38;
                }
                break;
              case 0x230fd3d7:
                if (!str.equals("borderBottomRightRadius")) {
                   goto label_038f ;
                }else {
                   i1 = 39;
                }
                break;
              case 0x2762ef20:
                if (!str.equals("nextFocusUp")) {
                   goto label_038f ;
                }else {
                   i1 = 40;
                }
                break;
              case 0x2b158697:
                if (!str.equals("borderColor")) {
                   goto label_038f ;
                }else {
                   i1 = 41;
                }
                break;
              case 0x2bf974e5:
                if (!str.equals("borderStyle")) {
                   goto label_038f ;
                }else {
                   i1 = 42;
                }
                break;
              case 0x2c2c84fa:
                if (!str.equals("borderWidth")) {
                   goto label_038f ;
                }else {
                   i1 = 43;
                }
                break;
              case 0x2c861b47:
                if (!str.equals("importantForAccessibility")) {
                   goto label_038f ;
                }else {
                   i1 = 44;
                }
                break;
              case 0x373ef02d:
                if (!str.equals("hitSlop")) {
                   goto label_038f ;
                }else {
                   i1 = 45;
                }
                break;
              case 0x3ebe6b6c:
                if (!str.equals("transform")) {
                   goto label_038f ;
                }else {
                   i1 = 46;
                }
                break;
              case 0x445b6e46:
                if (!str.equals("accessibilityLabel")) {
                   goto label_038f ;
                }else {
                   i1 = 47;
                }
                break;
              case 0x44c6b3e3:
                if (!str.equals("accessibilityState")) {
                   goto label_038f ;
                }else {
                   i1 = 48;
                }
                break;
              case 0x44e880c3:
                if (!str.equals("accessibilityValue")) {
                   goto label_038f ;
                }else {
                   i1 = 49;
                }
                break;
              case 0x48c2f394:
                if (!str.equals("borderEndColor")) {
                   goto label_038f ;
                }else {
                   i1 = 50;
                }
                break;
              case 0x49d9f1f7:
                if (!str.equals("borderEndWidth")) {
                   goto label_038f ;
                }else {
                   i1 = 51;
                }
                break;
              case 0x4cb7f6d5:
                if (!str.equals("backgroundColor")) {
                   goto label_038f ;
                }else {
                   i1 = 52;
                }
                break;
              case 0x4d0b70cd:
                if (!str.equals("backgroundImage")) {
                   goto label_038f ;
                }else {
                   i1 = 53;
                }
                break;
              case 0x506afbde:
                if (!str.equals("borderRadius")) {
                   goto label_038f ;
                }else {
                   i1 = 54;
                }
                break;
              case 0x59bdabcf:
                if (!str.equals("accessibilityActions")) {
                   goto label_038f ;
                }else {
                   i1 = 55;
                }
                break;
              case 0x6118be32:
                if (!str.equals("focusable")) {
                   goto label_038f ;
                }else {
                   i1 = 56;
                }
                break;
              case 0x636835e4:
                if (!str.equals("needsOffscreenAlphaCompositing")) {
                   goto label_038f ;
                }else {
                   i1 = 57;
                }
                break;
              case 0x682c2a0a:
                if (!str.equals("nativeBackgroundAndroid")) {
                   goto label_038f ;
                }else {
                   i1 = 58;
                }
                break;
              case 0x71e55777:
                if (!str.equals("nextFocusRight")) {
                   goto label_038f ;
                }else {
                   i1 = 59;
                }
                break;
              case 0x79eeaf72:
                if (!str.equals("nativeID")) {
                   goto label_038f ;
                }else {
                   i1 = 60;
                }
                break;
              case 0x7e5af16d:
                if (!str.equals("borderStartColor")) {
                   goto label_038f ;
                }else {
                   i1 = 61;
                }
                break;
              case 0x7f71efd0:
                if (!str.equals("borderStartWidth")) {
                   goto label_038f ;
                }else {
                   i1 = 62;
                }
                break;
              default:
                goto label_038f ;
          }
          float f = 0x3f800000;
          float f1 = 0;
          Integer integer = null;
          switch (i1){
              case 0:
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                kdsViewManag.setBorderColor(kdsViewGroup, 2, integer);
                break;
              case 1:
                f2 = (p3 == null)? Float.NaN: p3.floatValue();
                kdsViewManag.setBorderWidth(kdsViewGroup, 2, f2);
                break;
              case 2:
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                kdsViewManag.setTranslateX(kdsViewGroup, f1);
                break;
              case 3:
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                kdsViewManag.setTranslateY(kdsViewGroup, f1);
                break;
              case 4:
                kdsViewManag.setBackfaceVisibility(kdsViewGroup, p3);
                break;
              case 5:
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                kdsViewManag.setBorderColor(kdsViewGroup, 3, integer);
                break;
              case 6:
                f2 = (p3 == null)? Float.NaN: p3.floatValue();
                kdsViewManag.setBorderWidth(kdsViewGroup, 3, f2);
                break;
              case 7:
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                kdsViewManag.setCollapsable(kdsViewGroup, b);
                break;
              case 8:
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                kdsViewManag.setBorderColor(kdsViewGroup, 4, integer);
                break;
              case 9:
                f2 = (p3 == null)? Float.NaN: p3.floatValue();
                kdsViewManag.setBorderWidth(kdsViewGroup, 4, f2);
                break;
              case 10:
                if (p3 != null) {
                   f = p3.floatValue();
                }
                kdsViewManag.setOpacity(kdsViewGroup, f);
                break;
              case 11:
                f2 = (p3 == null)? Float.NaN: p3.floatValue();
                kdsViewManag.setBorderRadius(kdsViewGroup, 1, f2);
                break;
              case 12:
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                kdsViewManag.setAccessible(kdsViewGroup, b);
                break;
              case 13:
                f2 = (p3 == null)? Float.NaN: p3.floatValue();
                kdsViewManag.setBorderRadius(kdsViewGroup, 5, f2);
                break;
              case 14:
                if (p3 != null) {
                   f = p3.floatValue();
                }
                kdsViewManag.setScaleX(kdsViewGroup, f);
                break;
              case 15:
                if (p3 != null) {
                   f = p3.floatValue();
                }
                kdsViewManag.setScaleY(kdsViewGroup, f);
                break;
              case 16:
                kdsViewManag.setTestId(kdsViewGroup, p3);
                break;
              case 17:
                f2 = (p3 == null)? Float.NaN: p3.floatValue();
                kdsViewManag.setBorderRadius(kdsViewGroup, 7, f2);
                break;
              case 18:
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                kdsViewManag.setZIndex(kdsViewGroup, f1);
                break;
              case 19:
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                kdsViewManag.setTVPreferredFocus(kdsViewGroup, b);
                break;
              case 20:
                if (p3 != null) {
                   i = p3.intValue();
                }
                kdsViewManag.nextFocusDown(kdsViewGroup, i);
                break;
              case 21:
                if (p3 != null) {
                   i = p3.intValue();
                }
                kdsViewManag.nextFocusLeft(kdsViewGroup, i);
                break;
              case 22:
                f2 = (p3 == null)? Float.NaN: p3.floatValue();
                kdsViewManag.setBorderRadius(kdsViewGroup, 6, f2);
                break;
              case 23:
                kdsViewManag.setPointerEvents(kdsViewGroup, p3);
                break;
              case 24:
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                kdsViewManag.setRemoveClippedSubviews(kdsViewGroup, b);
                break;
              case 25:
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                kdsViewManag.setBorderColor(kdsViewGroup, 1, integer);
                break;
              case 26:
                f2 = (p3 == null)? Float.NaN: p3.floatValue();
                kdsViewManag.setBorderWidth(kdsViewGroup, 1, f2);
                break;
              case 27:
                f2 = (p3 == null)? Float.NaN: p3.floatValue();
                kdsViewManag.setBorderRadius(kdsViewGroup, 8, f2);
                break;
              case 28:
                kdsViewManag.setNativeForeground(kdsViewGroup, p3);
                break;
              case 29:
                kdsViewManag.setAccessibilityHint(kdsViewGroup, p3);
                break;
              case 30:
                kdsViewManag.setAccessibilityRole(kdsViewGroup, p3);
                break;
              case 31:
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                kdsViewManag.setRenderToHardwareTexture(kdsViewGroup, b);
                break;
              case 32:
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                kdsViewManag.setRotation(kdsViewGroup, f1);
                break;
              case '!':
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                kdsViewManag.setElevation(kdsViewGroup, f1);
                break;
              case '"':
                kdsViewManag.setAccessibilityLiveRegion(kdsViewGroup, p3);
                break;
              case '#':
                f2 = (p3 == null)? Float.NaN: p3.floatValue();
                kdsViewManag.setBorderRadius(kdsViewGroup, 2, f2);
                break;
              case '$':
                if (p3 != null) {
                   i = p3.intValue();
                }
                kdsViewManag.nextFocusForward(kdsViewGroup, i);
                break;
              case '%':
                kdsViewManag.setOverflow(kdsViewGroup, p3);
                break;
              case '&':
                f2 = (p3 == null)? Float.NaN: p3.floatValue();
                kdsViewManag.setBorderRadius(kdsViewGroup, 4, f2);
                break;
              case 39:
                f2 = (p3 == null)? Float.NaN: p3.floatValue();
                kdsViewManag.setBorderRadius(kdsViewGroup, 3, f2);
                break;
              case '(':
                if (p3 != null) {
                   i = p3.intValue();
                }
                kdsViewManag.nextFocusUp(kdsViewGroup, i);
                break;
              case ')':
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                kdsViewManag.setBorderColor(kdsViewGroup, b, integer);
                break;
              case '*':
                kdsViewManag.setBorderStyle(kdsViewGroup, p3);
                break;
              case '+':
                f2 = (p3 == null)? Float.NaN: p3.floatValue();
                kdsViewManag.setBorderWidth(kdsViewGroup, b, f2);
                break;
              case ',':
                kdsViewManag.setImportantForAccessibility(kdsViewGroup, p3);
                break;
              case '-':
                kdsViewManag.setHitSlop(kdsViewGroup, p3);
                break;
              case '.':
                kdsViewManag.setTransform(kdsViewGroup, p3);
                break;
              case '/':
                kdsViewManag.setAccessibilityLabel(kdsViewGroup, p3);
                break;
              case '0':
                kdsViewManag.setViewState(kdsViewGroup, p3);
                break;
              case '1':
                kdsViewManag.setAccessibilityValue(kdsViewGroup, p3);
                break;
              case '2':
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                kdsViewManag.setBorderColor(kdsViewGroup, 6, integer);
                break;
              case '3':
                f2 = (p3 == null)? Float.NaN: p3.floatValue();
                kdsViewManag.setBorderWidth(kdsViewGroup, 6, f2);
                break;
              case '4':
                if (p3 != null) {
                   b = p3.intValue();
                }
                kdsViewManag.setBackgroundColor(kdsViewGroup, b);
                break;
              case '5':
                kdsViewManag.setBackgroundImage(kdsViewGroup, p3);
                break;
              case '6':
                f2 = (p3 == null)? Float.NaN: p3.floatValue();
                kdsViewManag.setBorderRadius(kdsViewGroup, b, f2);
                break;
              case '7':
                kdsViewManag.setAccessibilityActions(kdsViewGroup, p3);
                break;
              case '8':
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                kdsViewManag.setFocusable(kdsViewGroup, b);
                break;
              case '9':
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                kdsViewManag.setNeedsOffscreenAlphaCompositing(kdsViewGroup, b);
                break;
              case ':':
                kdsViewManag.setNativeBackground(kdsViewGroup, p3);
                break;
              case ';':
                if (p3 != null) {
                   i = p3.intValue();
                }
                kdsViewManag.nextFocusRight(kdsViewGroup, i);
                break;
              case '<':
                kdsViewManag.setNativeId(kdsViewGroup, p3);
                break;
              case '=':
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                kdsViewManag.setBorderColor(kdsViewGroup, 5, integer);
                break;
              case '>':
                f2 = (p3 == null)? Float.NaN: p3.floatValue();
                kdsViewManag.setBorderWidth(kdsViewGroup, 5, f2);
                break;
              default:
          }
       }
       return;
    }
}
