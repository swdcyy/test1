package com.horcrux.svg.SvgViewManager$$PropsSetter;
import com.facebook.react.uimanager.k$e;
import java.lang.Object;
import java.util.Map;
import com.facebook.react.uimanager.ViewManager;
import android.view.View;
import java.lang.String;
import com.horcrux.svg.SvgViewManager;
import com.facebook.react.views.view.ReactViewGroup;
import java.util.Objects;
import java.lang.Double;
import com.facebook.react.views.view.ReactViewManager;
import java.lang.Integer;
import com.facebook.react.uimanager.BaseViewManager;
import com.horcrux.svg.SvgView;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Boolean;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.views.view.ReactClippingViewManager;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.Dynamic;

public class SvgViewManager$$PropsSetter implements k$e	// class@0005f7
{

    public void SvgViewManager$$PropsSetter(){
       super();
    }
    public void getProperties(Map p0){
       p0.put("accessibilityActions", "Array");
       p0.put("accessibilityHint", "String");
       p0.put("accessibilityLabel", "String");
       p0.put("accessibilityLiveRegion", "String");
       p0.put("accessibilityRole", "String");
       p0.put("accessibilityState", "Map");
       p0.put("accessibilityValue", "Map");
       p0.put("accessible", "boolean");
       p0.put("align", "String");
       p0.put("backfaceVisibility", "String");
       p0.put("backgroundColor", "Color");
       p0.put("bbHeight", "Dynamic");
       p0.put("bbWidth", "Dynamic");
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
       p0.put("color", "number");
       p0.put("elevation", "number");
       p0.put("focusable", "boolean");
       p0.put("hasTVPreferredFocus", "boolean");
       p0.put("hitSlop", "Map");
       p0.put("importantForAccessibility", "String");
       p0.put("meetOrSlice", "number");
       p0.put("minX", "number");
       p0.put("minY", "number");
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
       p0.put("tintColor", "number");
       p0.put("transform", "Array");
       p0.put("translateX", "number");
       p0.put("translateY", "number");
       p0.put("vbHeight", "number");
       p0.put("vbWidth", "number");
       p0.put("zIndex", "number");
    }
    public void setProperty(ViewManager p0,View p1,String p2,Object p3){
       this.setProperty(p0, p1, p2, p3);
    }
    public void setProperty(SvgViewManager p0,ReactViewGroup p1,String p2,Object p3){
       int i1;
       Integer integer1;
       float f2;
       SvgViewManager svgViewManag = p0;
       SvgView svgView = p1;
       String str = p2;
       Object obj = p3;
       Objects.requireNonNull(p2);
       int i = -1;
       boolean b = false;
       switch (p2.hashCode()){
           case 0x84f35987:
             if (str.equals("bbHeight")) {
                i1 = 0;
             }else {
             }
             break;
           case 0x896977f3:
             if (str.equals("borderRightColor")) {
                i1 = 1;
             }else {
             }
             break;
           case 0x8a807656:
             if (str.equals("borderRightWidth")) {
                i1 = 2;
             }else {
             }
             break;
           case 0x995d38ca:
             if (str.equals("translateX")) {
                i1 = 3;
             }else {
             }
             break;
           case 0x995d38cb:
             if (str.equals("translateY")) {
                i1 = 4;
             }else {
             }
             break;
           case 0x9acd69f6:
             if (str.equals("backfaceVisibility")) {
                i1 = 5;
             }else {
             }
             break;
           case 0xa28adaf3:
             if (str.equals("vbHeight")) {
                i1 = 6;
             }else {
             }
             break;
           case 0xa854f75a:
             if (str.equals("borderTopColor")) {
                i1 = 7;
             }else {
             }
             break;
           case 0xa96bf5bd:
             if (str.equals("borderTopWidth")) {
                i1 = 8;
             }else {
             }
             break;
           case 0xb1044d12:
             if (str.equals("collapsable")) {
                i1 = 9;
             }else {
             }
             break;
           case 0xb1fc682c:
             if (str.equals("borderBottomColor")) {
                i1 = 10;
             }else {
             }
             break;
           case 0xb313668f:
             if (str.equals("borderBottomWidth")) {
                i1 = 11;
             }else {
             }
             break;
           case 0xb477f80b:
             if (str.equals("opacity")) {
                i1 = 12;
             }else {
             }
             break;
           case 0xb6cd31e2:
             if (str.equals("borderTopLeftRadius")) {
                i1 = 13;
             }else {
             }
             break;
           case 0xbbf79bb6:
             if (str.equals("accessible")) {
                i1 = 14;
             }else {
             }
             break;
           case 0xbd1d7e4b:
             if (str.equals("borderTopStartRadius")) {
                i1 = 15;
             }else {
             }
             break;
           case 0xc9de204e:
             if (str.equals("scaleX")) {
                i1 = 16;
             }else {
             }
             break;
           case 0xc9de204f:
             if (str.equals("scaleY")) {
                i1 = 17;
             }else {
             }
             break;
           case 0xcbb7712d:
             if (str.equals("testID")) {
                i1 = 18;
             }else {
             }
             break;
           case 0xcc4d899d:
             if (str.equals("borderBottomStartRadius")) {
                i1 = 19;
             }else {
             }
             break;
           case 0xd4677478:
             if (str.equals("zIndex")) {
                i1 = 20;
             }else {
             }
             break;
           case 0xd77e6a93:
             if (str.equals("hasTVPreferredFocus")) {
                i1 = 21;
             }else {
             }
             break;
           case 0xda5bf7e7:
             if (str.equals("nextFocusDown")) {
                i1 = 22;
             }else {
             }
             break;
           case 0xda5f734c:
             if (str.equals("nextFocusLeft")) {
                i1 = 23;
             }else {
             }
             break;
           case 0xe32e85c4:
             if (str.equals("borderTopEndRadius")) {
                i1 = 24;
             }else {
             }
             break;
           case 0xec58d966:
             if (str.equals("bbWidth")) {
                i1 = 25;
             }else {
             }
             break;
           case 0xee81a9b6:
             if (str.equals("pointerEvents")) {
                i1 = 26;
             }else {
             }
             break;
           case 0xf0f92be9:
             if (str.equals("removeClippedSubviews")) {
                i1 = 27;
             }else {
             }
             break;
           case 0xf18f28d0:
             if (str.equals("borderLeftColor")) {
                i1 = 28;
             }else {
             }
             break;
           case 0xf2a62733:
             if (str.equals("borderLeftWidth")) {
                i1 = 29;
             }else {
             }
             break;
           case 0xf72d3d96:
             if (str.equals("borderBottomEndRadius")) {
                i1 = 30;
             }else {
             }
             break;
           case 0xf9764455:
             if (str.equals("nativeForegroundAndroid")) {
                i1 = 31;
             }else {
             }
             break;
           case 0xf9f0bcf5:
             if (str.equals("accessibilityHint")) {
                i1 = 32;
             }else {
             }
             break;
           case 0xf9f55ee4:
             if (str.equals("accessibilityRole")) {
                i1 = 33;
             }else {
             }
             break;
           case 0xfb2db0ed:
             if (str.equals("renderToHardwareTextureAndroid")) {
                i1 = 34;
             }else {
             }
             break;
           case 0xfd990f7e:
             if (str.equals("rotation")) {
                i1 = 35;
             }else {
             }
             break;
           case 0xffbd2e5d:
             if (str.equals("elevation")) {
                i1 = 36;
             }else {
             }
             break;
           case 0x332446:
             if (str.equals("minX")) {
                i1 = 37;
             }else {
             }
             break;
           case 0x332447:
             if (str.equals("minY")) {
                i1 = 38;
             }else {
             }
             break;
           case 0x22936ee:
             if (str.equals("accessibilityLiveRegion")) {
                i1 = 39;
             }else {
             }
             break;
           case 0x5899705:
             if (str.equals("align")) {
                i1 = 40;
             }else {
             }
             break;
           case 0x5a72f63:
             if (str.equals("color")) {
                i1 = 41;
             }else {
             }
             break;
           case 0xe557a7a:
             if (str.equals("vbWidth")) {
                i1 = 42;
             }else {
             }
             break;
           case 0x13dfc885:
             if (str.equals("borderTopRightRadius")) {
                i1 = 43;
             }else {
             }
             break;
           case 0x1e013d60:
             if (str.equals("nextFocusForward")) {
                i1 = 44;
             }else {
             }
             break;
           case 0x1f91b402:
             if (str.equals("overflow")) {
                i1 = 45;
             }else {
             }
             break;
           case 0x22a57450:
             if (str.equals("borderBottomLeftRadius")) {
                i1 = 46;
             }else {
             }
             break;
           case 0x230fd3d7:
             if (str.equals("borderBottomRightRadius")) {
                i1 = 47;
             }else {
             }
             break;
           case 0x2762ef20:
             if (str.equals("nextFocusUp")) {
                i1 = 48;
             }else {
             }
             break;
           case 0x2b158697:
             if (str.equals("borderColor")) {
                i1 = 49;
             }else {
             }
             break;
           case 0x2bf974e5:
             if (str.equals("borderStyle")) {
                i1 = 50;
             }else {
             }
             break;
           case 0x2c2c84fa:
             if (str.equals("borderWidth")) {
                i1 = 51;
             }else {
             }
             break;
           case 0x2c861b47:
             if (str.equals("importantForAccessibility")) {
                i1 = 52;
             }else {
             }
             break;
           case 0x373ef02d:
             if (str.equals("hitSlop")) {
                i1 = 53;
             }else {
             }
             break;
           case 0x3ebe6b6c:
             if (str.equals("transform")) {
                i1 = 54;
             }else {
             }
             break;
           case 0x445b6e46:
             if (str.equals("accessibilityLabel")) {
                i1 = 55;
             }else {
             }
             break;
           case 0x44c6b3e3:
             if (str.equals("accessibilityState")) {
                i1 = 56;
             }else {
             }
             break;
           case 0x44e880c3:
             if (str.equals("accessibilityValue")) {
                i1 = 57;
             }else {
             }
             break;
           case 0x48c2f394:
             if (str.equals("borderEndColor")) {
                i1 = 58;
             }else {
             }
             break;
           case 0x49d9f1f7:
             if (str.equals("borderEndWidth")) {
                i1 = 59;
             }else {
             }
             break;
           case 0x4cb7f6d5:
             if (str.equals("backgroundColor")) {
                i1 = 60;
             }else {
             }
             break;
           case 0x4f219128:
             if (str.equals("tintColor")) {
                i1 = 61;
             }else {
             }
             break;
           case 0x506afbde:
             if (str.equals("borderRadius")) {
                i1 = 62;
             }else {
             }
             break;
           case 0x59bdabcf:
             if (str.equals("accessibilityActions")) {
                i1 = 63;
             }else {
             }
             break;
           case 0x6118be32:
             if (str.equals("focusable")) {
                i1 = 64;
             }else {
             }
             break;
           case 0x636835e4:
             if (str.equals("needsOffscreenAlphaCompositing")) {
                i1 = 65;
             }else {
             }
             break;
           case 0x682c2a0a:
             if (str.equals("nativeBackgroundAndroid")) {
                i1 = 66;
             }else {
             }
             break;
           case 0x71baeb28:
             if (str.equals("meetOrSlice")) {
                i1 = 67;
             }else {
             }
             break;
           case 0x71e55777:
             if (str.equals("nextFocusRight")) {
                i1 = 68;
             }else {
             }
             break;
           case 0x79eeaf72:
             if (str.equals("nativeID")) {
                i1 = 69;
             }else {
             }
             break;
           case 0x7e5af16d:
             if (str.equals("borderStartColor")) {
                i1 = 70;
             }else {
             }
             break;
           case 0x7f71efd0:
             if (str.equals("borderStartWidth")) {
                i1 = 71;
             }else {
             }
             break;
           default:
             i1 = -1;
       }
       float f = 0x3f800000;
       float f1 = 0;
       Integer integer = null;
       switch (i1){
           case 0:
             svgViewManag.setBbHeight(svgView, new DynamicFromObject(obj));
             break;
           case 1:
             if (obj != null) {
                integer = Integer.valueOf(obj.intValue());
             }
             integer1 = integer;
             svgViewManag.setBorderColor(svgView, 2, integer1);
             break;
           case 2:
             f2 = (obj == null)? Float.NaN: obj.floatValue();
             svgViewManag.setBorderWidth(svgView, 2, f2);
             break;
           case 3:
             if (obj != null) {
                f1 = obj.floatValue();
             }
             svgViewManag.setTranslateX(svgView, f1);
             break;
           case 4:
             if (obj != null) {
                f1 = obj.floatValue();
             }
             svgViewManag.setTranslateY(svgView, f1);
             break;
           case 5:
             svgViewManag.setBackfaceVisibility(svgView, obj);
             break;
           case 6:
             if (obj != null) {
                f1 = obj.floatValue();
             }
             svgViewManag.setVbHeight(svgView, f1);
             break;
           case 7:
             if (obj != null) {
                integer = Integer.valueOf(obj.intValue());
             }
             integer1 = integer;
             svgViewManag.setBorderColor(svgView, 3, integer1);
             break;
           case 8:
             f2 = (obj == null)? Float.NaN: obj.floatValue();
             svgViewManag.setBorderWidth(svgView, 3, f2);
             break;
           case 9:
             if (obj != null) {
                b = obj.booleanValue();
             }
             svgViewManag.setCollapsable(svgView, b);
             break;
           case 10:
             if (obj != null) {
                integer = Integer.valueOf(obj.intValue());
             }
             integer1 = integer;
             svgViewManag.setBorderColor(svgView, 4, integer1);
             break;
           case 11:
             f2 = (obj == null)? Float.NaN: obj.floatValue();
             svgViewManag.setBorderWidth(svgView, 4, f2);
             break;
           case 12:
             if (obj != null) {
                f = obj.floatValue();
             }
             svgViewManag.setOpacity(svgView, f);
             break;
           case 13:
             f2 = (obj == null)? Float.NaN: obj.floatValue();
             svgViewManag.setBorderRadius(svgView, 1, f2);
             break;
           case 14:
             if (obj != null) {
                b = obj.booleanValue();
             }
             svgViewManag.setAccessible(svgView, b);
             break;
           case 15:
             f2 = (obj == null)? Float.NaN: obj.floatValue();
             svgViewManag.setBorderRadius(svgView, 5, f2);
             break;
           case 16:
             if (obj != null) {
                f = obj.floatValue();
             }
             svgViewManag.setScaleX(svgView, f);
             break;
           case 17:
             if (obj != null) {
                f = obj.floatValue();
             }
             svgViewManag.setScaleY(svgView, f);
             break;
           case 18:
             svgViewManag.setTestId(svgView, obj);
             break;
           case 19:
             f2 = (obj == null)? Float.NaN: obj.floatValue();
             svgViewManag.setBorderRadius(svgView, 7, f2);
             break;
           case 20:
             if (obj != null) {
                f1 = obj.floatValue();
             }
             svgViewManag.setZIndex(svgView, f1);
             break;
           case 21:
             if (obj != null) {
                b = obj.booleanValue();
             }
             svgViewManag.setTVPreferredFocus(svgView, b);
             break;
           case 22:
             if (obj != null) {
                i = obj.intValue();
             }
             svgViewManag.nextFocusDown(svgView, i);
             break;
           case 23:
             if (obj != null) {
                i = obj.intValue();
             }
             svgViewManag.nextFocusLeft(svgView, i);
             break;
           case 24:
             f2 = (obj == null)? Float.NaN: obj.floatValue();
             svgViewManag.setBorderRadius(svgView, 6, f2);
             break;
           case 25:
             svgViewManag.setBbWidth(svgView, new DynamicFromObject(obj));
             break;
           case 26:
             svgViewManag.setPointerEvents(svgView, obj);
             break;
           case 27:
             if (obj != null) {
                b = obj.booleanValue();
             }
             svgViewManag.setRemoveClippedSubviews(svgView, b);
             break;
           case 28:
             if (obj != null) {
                integer = Integer.valueOf(obj.intValue());
             }
             integer1 = integer;
             svgViewManag.setBorderColor(svgView, 1, integer1);
             break;
           case 29:
             f2 = (obj == null)? Float.NaN: obj.floatValue();
             svgViewManag.setBorderWidth(svgView, 1, f2);
             break;
           case 30:
             f2 = (obj == null)? Float.NaN: obj.floatValue();
             svgViewManag.setBorderRadius(svgView, 8, f2);
             break;
           case 31:
             svgViewManag.setNativeForeground(svgView, obj);
             break;
           case 32:
             svgViewManag.setAccessibilityHint(svgView, obj);
             break;
           case '!':
             svgViewManag.setAccessibilityRole(svgView, obj);
             break;
           case '"':
             if (obj != null) {
                b = obj.booleanValue();
             }
             svgViewManag.setRenderToHardwareTexture(svgView, b);
             break;
           case '#':
             if (obj != null) {
                f1 = obj.floatValue();
             }
             svgViewManag.setRotation(svgView, f1);
             break;
           case '$':
             if (obj != null) {
                f1 = obj.floatValue();
             }
             svgViewManag.setElevation(svgView, f1);
             break;
           case '%':
             if (obj != null) {
                f1 = obj.floatValue();
             }
             svgViewManag.setMinX(svgView, f1);
             break;
           case '&':
             if (obj != null) {
                f1 = obj.floatValue();
             }
             svgViewManag.setMinY(svgView, f1);
             break;
           case 39:
             svgViewManag.setAccessibilityLiveRegion(svgView, obj);
             break;
           case '(':
             svgViewManag.setAlign(svgView, obj);
             break;
           case ')':
             if (obj != null) {
                integer = Integer.valueOf(obj.intValue());
             }
             integer1 = integer;
             svgViewManag.setColor(svgView, integer1);
             break;
           case '*':
             if (obj != null) {
                f1 = obj.floatValue();
             }
             svgViewManag.setVbWidth(svgView, f1);
             break;
           case '+':
             f2 = (obj == null)? Float.NaN: obj.floatValue();
             svgViewManag.setBorderRadius(svgView, 2, f2);
             break;
           case ',':
             if (obj != null) {
                i = obj.intValue();
             }
             svgViewManag.nextFocusForward(svgView, i);
             break;
           case '-':
             svgViewManag.setOverflow(svgView, obj);
             break;
           case '.':
             f2 = (obj == null)? Float.NaN: obj.floatValue();
             svgViewManag.setBorderRadius(svgView, 4, f2);
             break;
           case '/':
             f2 = (obj == null)? Float.NaN: obj.floatValue();
             svgViewManag.setBorderRadius(svgView, 3, f2);
             break;
           case '0':
             if (obj != null) {
                i = obj.intValue();
             }
             svgViewManag.nextFocusUp(svgView, i);
             break;
           case '1':
             if (obj != null) {
                integer = Integer.valueOf(obj.intValue());
             }
             integer1 = integer;
             svgViewManag.setBorderColor(svgView, b, integer1);
             break;
           case '2':
             svgViewManag.setBorderStyle(svgView, obj);
             break;
           case '3':
             f2 = (obj == null)? Float.NaN: obj.floatValue();
             svgViewManag.setBorderWidth(svgView, b, f2);
             break;
           case '4':
             svgViewManag.setImportantForAccessibility(svgView, obj);
             break;
           case '5':
             svgViewManag.setHitSlop(svgView, obj);
             break;
           case '6':
             svgViewManag.setTransform(svgView, obj);
             break;
           case '7':
             svgViewManag.setAccessibilityLabel(svgView, obj);
             break;
           case '8':
             svgViewManag.setViewState(svgView, obj);
             break;
           case '9':
             svgViewManag.setAccessibilityValue(svgView, obj);
             break;
           case ':':
             if (obj != null) {
                integer = Integer.valueOf(obj.intValue());
             }
             integer1 = integer;
             svgViewManag.setBorderColor(svgView, 6, integer1);
             break;
           case ';':
             f2 = (obj == null)? Float.NaN: obj.floatValue();
             svgViewManag.setBorderWidth(svgView, 6, f2);
             break;
           case '<':
             if (obj != null) {
                b = obj.intValue();
             }
             svgViewManag.setBackgroundColor(svgView, b);
             break;
           case '=':
             if (obj != null) {
                integer = Integer.valueOf(obj.intValue());
             }
             integer1 = integer;
             svgViewManag.setTintColor(svgView, integer1);
             break;
           case '>':
             f2 = (obj == null)? Float.NaN: obj.floatValue();
             svgViewManag.setBorderRadius(svgView, b, f2);
             break;
           case '?':
             svgViewManag.setAccessibilityActions(svgView, obj);
             break;
           case '@':
             if (obj != null) {
                b = obj.booleanValue();
             }
             svgViewManag.setFocusable(svgView, b);
             break;
           case 'A':
             if (obj != null) {
                b = obj.booleanValue();
             }
             svgViewManag.setNeedsOffscreenAlphaCompositing(svgView, b);
             break;
           case 'B':
             svgViewManag.setNativeBackground(svgView, obj);
             break;
           case 'C':
             if (obj != null) {
                b = obj.intValue();
             }
             svgViewManag.setMeetOrSlice(svgView, b);
             break;
           case 'D':
             if (obj != null) {
                i = obj.intValue();
             }
             svgViewManag.nextFocusRight(svgView, i);
             break;
           case 'E':
             svgViewManag.setNativeId(svgView, obj);
             break;
           case 'F':
             if (obj != null) {
                integer = Integer.valueOf(obj.intValue());
             }
             integer1 = integer;
             svgViewManag.setBorderColor(svgView, 5, integer1);
             break;
           case 'G':
             f2 = (obj == null)? Float.NaN: obj.floatValue();
             svgViewManag.setBorderWidth(svgView, 5, f2);
             break;
           default:
       }
       return;
    }
}
