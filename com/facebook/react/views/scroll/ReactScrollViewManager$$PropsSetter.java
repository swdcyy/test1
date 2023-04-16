package com.facebook.react.views.scroll.ReactScrollViewManager$$PropsSetter;
import com.facebook.react.uimanager.k$e;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.uimanager.ViewManager;
import android.view.View;
import com.facebook.react.views.scroll.ReactScrollViewManager;
import com.facebook.react.views.scroll.ReactScrollView;
import java.util.Objects;
import java.lang.Double;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Boolean;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Integer;

public class ReactScrollViewManager$$PropsSetter implements k$e	// class@0013e9
{

    public void ReactScrollViewManager$$PropsSetter(){
       super();
    }
    public void getProperties(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactScrollViewManager$$PropsSetter.class, "2")) {
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
       p0.put("borderBottomColor", "Color");
       p0.put("borderBottomLeftRadius", "number");
       p0.put("borderBottomRightRadius", "number");
       p0.put("borderBottomWidth", "number");
       p0.put("borderColor", "Color");
       p0.put("borderLeftColor", "Color");
       p0.put("borderLeftWidth", "number");
       p0.put("borderRadius", "number");
       p0.put("borderRightColor", "Color");
       p0.put("borderRightWidth", "number");
       p0.put("borderStyle", "String");
       p0.put("borderTopColor", "Color");
       p0.put("borderTopLeftRadius", "number");
       p0.put("borderTopRightRadius", "number");
       p0.put("borderTopWidth", "number");
       p0.put("borderWidth", "number");
       p0.put("decelerationRate", "number");
       p0.put("elevation", "number");
       p0.put("endFillColor", "Color");
       p0.put("fadingEdgeLength", "number");
       p0.put("importantForAccessibility", "String");
       p0.put("nativeID", "String");
       p0.put("nestedScrollEnabled", "boolean");
       p0.put("opacity", "number");
       p0.put("overScrollMode", "String");
       p0.put("overflow", "String");
       p0.put("pagingEnabled", "boolean");
       p0.put("parentPriorityHandlerTouch", "boolean");
       p0.put("persistentScrollbar", "boolean");
       p0.put("removeClippedSubviews", "boolean");
       p0.put("renderToHardwareTextureAndroid", "boolean");
       p0.put("rotation", "number");
       p0.put("scaleX", "number");
       p0.put("scaleY", "number");
       p0.put("scrollEnabled", "boolean");
       p0.put("scrollPerfTag", "String");
       p0.put("sendMomentumEvents", "boolean");
       p0.put("showsVerticalScrollIndicator", "boolean");
       p0.put("snapToEnd", "boolean");
       p0.put("snapToInterval", "number");
       p0.put("snapToOffsets", "Array");
       p0.put("snapToStart", "boolean");
       p0.put("testID", "String");
       p0.put("transform", "Array");
       p0.put("translateX", "number");
       p0.put("translateY", "number");
       p0.put("zIndex", "number");
       return;
    }
    public void setProperty(ViewManager p0,View p1,String p2,Object p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, ReactScrollViewManager$$PropsSetter.class, "1")) {
       }else {
          Objects.requireNonNull(p2);
          int i = -1;
          boolean b = false;
          int i1 = 1;
          switch (p2.hashCode()){
              case 0x896977f3:
                if (p2.equals("borderRightColor")) {
                   i = 0;
                }
                break;
              case 0x8a807656:
                if (p2.equals("borderRightWidth")) {
                   i = 1;
                }
                break;
              case 0x9879cb7d:
                if (p2.equals("snapToStart")) {
                   i = 2;
                }
                break;
              case 0x98ebc3ca:
                if (p2.equals("snapToInterval")) {
                   i = 3;
                }
                break;
              case 0x995d38ca:
                if (p2.equals("translateX")) {
                   i = 4;
                }
                break;
              case 0x995d38cb:
                if (p2.equals("translateY")) {
                   i = 5;
                }
                break;
              case 0xa36da105:
                if (p2.equals("endFillColor")) {
                   i = 6;
                }
                break;
              case 0xa854f75a:
                if (p2.equals("borderTopColor")) {
                   i = 7;
                }
                break;
              case 0xa96bf5bd:
                if (p2.equals("borderTopWidth")) {
                   i = 8;
                }
                break;
              case 0xb13f8604:
                if (p2.equals("overScrollMode")) {
                   i = 9;
                }
                break;
              case 0xb1fc682c:
                if (p2.equals("borderBottomColor")) {
                   i = 10;
                }
                break;
              case 0xb313668f:
                if (p2.equals("borderBottomWidth")) {
                   i = 11;
                }
                break;
              case 0xb477f80b:
                if (p2.equals("opacity")) {
                   i = 12;
                }
                break;
              case 0xb6cd31e2:
                if (p2.equals("borderTopLeftRadius")) {
                   i = 13;
                }
                break;
              case 0xbb646bb4:
                if (p2.equals("scrollEnabled")) {
                   i = 14;
                }
                break;
              case 0xc909fd76:
                if (p2.equals("showsVerticalScrollIndicator")) {
                   i = 15;
                }
                break;
              case 0xc9de204e:
                if (p2.equals("scaleX")) {
                   i = 16;
                }
                break;
              case 0xc9de204f:
                if (p2.equals("scaleY")) {
                   i = 17;
                }
                break;
              case 0xcad351a3:
                if (p2.equals("parentPriorityHandlerTouch")) {
                   i = 18;
                }
                break;
              case 0xcbb7712d:
                if (p2.equals("testID")) {
                   i = 19;
                }
                break;
              case 0xd4677478:
                if (p2.equals("zIndex")) {
                   i = 20;
                }
                break;
              case 0xe20eb615:
                if (p2.equals("pagingEnabled")) {
                   i = 21;
                }
                break;
              case 0xf0f92be9:
                if (p2.equals("removeClippedSubviews")) {
                   i = 22;
                }
                break;
              case 0xf18f28d0:
                if (p2.equals("borderLeftColor")) {
                   i = 23;
                }
                break;
              case 0xf2a62733:
                if (p2.equals("borderLeftWidth")) {
                   i = 24;
                }
                break;
              case 0xf2de6064:
                if (p2.equals("scrollPerfTag")) {
                   i = 25;
                }
                break;
              case 0xf862c3fd:
                if (p2.equals("nestedScrollEnabled")) {
                   i = 26;
                }
                break;
              case 0xf9f0bcf5:
                if (p2.equals("accessibilityHint")) {
                   i = 27;
                }
                break;
              case 0xf9f55ee4:
                if (p2.equals("accessibilityRole")) {
                   i = 28;
                }
                break;
              case 0xfb2db0ed:
                if (p2.equals("renderToHardwareTextureAndroid")) {
                   i = 29;
                }
                break;
              case 0xfd990f7e:
                if (p2.equals("rotation")) {
                   i = 30;
                }
                break;
              case 0xffbd2e5d:
                if (p2.equals("elevation")) {
                   i = 31;
                }
                break;
              case 0x22936ee:
                if (p2.equals("accessibilityLiveRegion")) {
                   i = 32;
                }
                break;
              case 0xcad9ab6:
                if (p2.equals("snapToEnd")) {
                   i = 33;
                }
                break;
              case 0x13dfc885:
                if (p2.equals("borderTopRightRadius")) {
                   i = 34;
                }
                break;
              case 0x1f91b402:
                if (p2.equals("overflow")) {
                   i = 35;
                }
                break;
              case 0x22a57450:
                if (p2.equals("borderBottomLeftRadius")) {
                   i = 36;
                }
                break;
              case 0x230fd3d7:
                if (p2.equals("borderBottomRightRadius")) {
                   i = 37;
                }
                break;
              case 0x2563801c:
                if (p2.equals("fadingEdgeLength")) {
                   i = 38;
                }
                break;
              case 0x2941d979:
                if (p2.equals("sendMomentumEvents")) {
                   i = 39;
                }
                break;
              case 0x2b158697:
                if (p2.equals("borderColor")) {
                   i = 40;
                }
                break;
              case 0x2bf974e5:
                if (p2.equals("borderStyle")) {
                   i = 41;
                }
                break;
              case 0x2c2c84fa:
                if (p2.equals("borderWidth")) {
                   i = 42;
                }
                break;
              case 0x2c861b47:
                if (p2.equals("importantForAccessibility")) {
                   i = 43;
                }
                break;
              case 0x3ebe6b6c:
                if (p2.equals("transform")) {
                   i = 44;
                }
                break;
              case 0x445b6e46:
                if (p2.equals("accessibilityLabel")) {
                   i = 45;
                }
                break;
              case 0x44c6b3e3:
                if (p2.equals("accessibilityState")) {
                   i = 46;
                }
                break;
              case 0x44e880c3:
                if (p2.equals("accessibilityValue")) {
                   i = 47;
                }
                break;
              case 0x4cb7f6d5:
                if (p2.equals("backgroundColor")) {
                   i = 48;
                }
                break;
              case 0x506afbde:
                if (p2.equals("borderRadius")) {
                   i = 49;
                }
                break;
              case 0x59bdabcf:
                if (p2.equals("accessibilityActions")) {
                   i = 50;
                }
                break;
              case 0x723f114f:
                if (p2.equals("persistentScrollbar")) {
                   i = 51;
                }
                break;
              case 0x75feda9b:
                if (p2.equals("snapToOffsets")) {
                   i = 52;
                }
                break;
              case 0x79eeaf72:
                if (p2.equals("nativeID")) {
                   i = 53;
                }
                break;
              case 0x7ee6439f:
                if (p2.equals("decelerationRate")) {
                   i = 54;
                }
                break;
              default:
          }
       label_0310 :
          int i2 = 0x3f800000;
          Integer integer = null;
          float f = 0;
          float f1 = Float.NaN;
          switch (i){
              case 0:
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                p0.setBorderColor(p1, 2, integer);
                break;
              case 1:
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderWidth(p1, 2, f1);
                break;
              case 2:
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                p0.setSnapToStart(p1, b);
                break;
              case 3:
                if (p3 != null) {
                   f = p3.floatValue();
                }
                p0.setSnapToInterval(p1, f);
                break;
              case 4:
                if (p3 != null) {
                   f = p3.floatValue();
                }
                p0.setTranslateX(p1, f);
                break;
              case 5:
                if (p3 != null) {
                   f = p3.floatValue();
                }
                p0.setTranslateY(p1, f);
                break;
              case 6:
                if (p3 != null) {
                   b = p3.intValue();
                }
                p0.setBottomFillColor(p1, b);
                break;
              case 7:
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                p0.setBorderColor(p1, 3, integer);
                break;
              case 8:
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderWidth(p1, 3, f1);
                break;
              case 9:
                p0.setOverScrollMode(p1, p3);
                break;
              case 10:
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                p0.setBorderColor(p1, 4, integer);
                break;
              case 11:
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderWidth(p1, 4, f1);
                break;
              case 12:
                if (p3 != null) {
                   i2 = p3.floatValue();
                }
                p0.setOpacity(p1, i2);
                break;
              case 13:
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderRadius(p1, i1, f1);
                break;
              case 14:
                if (p3 != null) {
                   i1 = p3.booleanValue();
                }
                p0.setScrollEnabled(p1, i1);
                break;
              case 15:
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                p0.setShowsVerticalScrollIndicator(p1, b);
                break;
              case 16:
                if (p3 != null) {
                   i2 = p3.floatValue();
                }
                p0.setScaleX(p1, i2);
                break;
              case 17:
                if (p3 != null) {
                   i2 = p3.floatValue();
                }
                p0.setScaleY(p1, i2);
                break;
              case 18:
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                p0.setParentPriorityHandlerTouch(p1, b);
                break;
              case 19:
                p0.setTestId(p1, p3);
                break;
              case 20:
                if (p3 != null) {
                   f = p3.floatValue();
                }
                p0.setZIndex(p1, f);
                break;
              case 21:
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                p0.setPagingEnabled(p1, b);
                break;
              case 22:
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                p0.setRemoveClippedSubviews(p1, b);
                break;
              case 23:
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                p0.setBorderColor(p1, i1, integer);
                break;
              case 24:
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderWidth(p1, i1, f1);
                break;
              case 25:
                p0.setScrollPerfTag(p1, p3);
                break;
              case 26:
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                p0.setNestedScrollEnabled(p1, b);
                break;
              case 27:
                p0.setAccessibilityHint(p1, p3);
                break;
              case 28:
                p0.setAccessibilityRole(p1, p3);
                break;
              case 29:
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                p0.setRenderToHardwareTexture(p1, b);
                break;
              case 30:
                if (p3 != null) {
                   f = p3.floatValue();
                }
                p0.setRotation(p1, f);
                break;
              case 31:
                if (p3 != null) {
                   f = p3.floatValue();
                }
                p0.setElevation(p1, f);
                break;
              case 32:
                p0.setAccessibilityLiveRegion(p1, p3);
                break;
              case '!':
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                p0.setSnapToEnd(p1, b);
                break;
              case '"':
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderRadius(p1, 2, f1);
                break;
              case '#':
                p0.setOverflow(p1, p3);
                break;
              case '$':
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderRadius(p1, 4, f1);
                break;
              case '%':
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderRadius(p1, 3, f1);
                break;
              case '&':
                if (p3 != null) {
                   b = p3.intValue();
                }
                p0.setFadingEdgeLength(p1, b);
                break;
              case 39:
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                p0.setSendMomentumEvents(p1, b);
                break;
              case '(':
                if (p3 != null) {
                   integer = Integer.valueOf(p3.intValue());
                }
                p0.setBorderColor(p1, b, integer);
                break;
              case ')':
                p0.setBorderStyle(p1, p3);
                break;
              case '*':
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderWidth(p1, b, f1);
                break;
              case '+':
                p0.setImportantForAccessibility(p1, p3);
                break;
              case ',':
                p0.setTransform(p1, p3);
                break;
              case '-':
                p0.setAccessibilityLabel(p1, p3);
                break;
              case '.':
                p0.setViewState(p1, p3);
                break;
              case '/':
                p0.setAccessibilityValue(p1, p3);
                break;
              case '0':
                if (p3 != null) {
                   b = p3.intValue();
                }
                p0.setBackgroundColor(p1, b);
                break;
              case '1':
                if (p3 != null) {
                   f1 = p3.floatValue();
                }
                p0.setBorderRadius(p1, b, f1);
                break;
              case '2':
                p0.setAccessibilityActions(p1, p3);
                break;
              case '3':
                if (p3 != null) {
                   b = p3.booleanValue();
                }
                p0.setPersistentScrollbar(p1, b);
                break;
              case '4':
                p0.setSnapToOffsets(p1, p3);
                break;
              case '5':
                p0.setNativeId(p1, p3);
                break;
              case '6':
                if (p3 != null) {
                   f = p3.floatValue();
                }
                p0.setDecelerationRate(p1, f);
                break;
              default:
          }
       }
       return;
    }
}
