package com.horcrux.svg.RenderableViewManager$LinearGradientManager$$PropsSetter;
import com.facebook.react.uimanager.k$e;
import java.lang.Object;
import java.util.Map;
import com.facebook.react.uimanager.ViewManager;
import android.view.View;
import java.lang.String;
import com.horcrux.svg.RenderableViewManager$LinearGradientManager;
import com.horcrux.svg.VirtualView;
import java.util.Objects;
import com.facebook.react.uimanager.BaseViewManager;
import com.horcrux.svg.RenderableView;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.Dynamic;
import com.horcrux.svg.RenderableViewManager;
import java.lang.Boolean;
import com.horcrux.svg.LinearGradientView;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Double;
import com.facebook.react.bridge.ReadableMap;

public class RenderableViewManager$LinearGradientManager$$PropsSetter implements k$e	// class@0005d3
{

    public void RenderableViewManager$LinearGradientManager$$PropsSetter(){
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
       p0.put("backgroundColor", "Color");
       p0.put("clipPath", "String");
       p0.put("clipRule", "number");
       p0.put("display", "String");
       p0.put("elevation", "number");
       p0.put("fill", "Dynamic");
       p0.put("fillOpacity", "number");
       p0.put("fillRule", "number");
       p0.put("gradient", "Array");
       p0.put("gradientTransform", "Array");
       p0.put("gradientUnits", "number");
       p0.put("importantForAccessibility", "String");
       p0.put("markerEnd", "String");
       p0.put("markerMid", "String");
       p0.put("markerStart", "String");
       p0.put("mask", "String");
       p0.put("matrix", "Dynamic");
       p0.put("name", "String");
       p0.put("nativeID", "String");
       p0.put("onLayout", "boolean");
       p0.put("opacity", "number");
       p0.put("pointerEvents", "String");
       p0.put("propList", "Array");
       p0.put("renderToHardwareTextureAndroid", "boolean");
       p0.put("responsible", "boolean");
       p0.put("rotation", "number");
       p0.put("scaleX", "number");
       p0.put("scaleY", "number");
       p0.put("stroke", "Dynamic");
       p0.put("strokeDasharray", "Array");
       p0.put("strokeDashoffset", "number");
       p0.put("strokeLinecap", "number");
       p0.put("strokeLinejoin", "number");
       p0.put("strokeMiterlimit", "number");
       p0.put("strokeOpacity", "number");
       p0.put("strokeWidth", "Dynamic");
       p0.put("testID", "String");
       p0.put("transform", "Dynamic");
       p0.put("translateX", "number");
       p0.put("translateY", "number");
       p0.put("vectorEffect", "number");
       p0.put("x1", "Dynamic");
       p0.put("x2", "Dynamic");
       p0.put("y1", "Dynamic");
       p0.put("y2", "Dynamic");
       p0.put("zIndex", "number");
    }
    public void setProperty(ViewManager p0,View p1,String p2,Object p3){
       this.setProperty(p0, p1, p2, p3);
    }
    public void setProperty(RenderableViewManager$LinearGradientManager p0,VirtualView p1,String p2,Object p3){
       Objects.requireNonNull(p2);
       int i = 1;
       int i1 = 0;
       int i2 = -1;
       switch (p2.hashCode()){
           case 0x8cd46e1f:
             if (p2.equals("gradientUnits")) {
                i2 = 0;
             }
             break;
           case 0x995d38ca:
             if (p2.equals("translateX")) {
                i2 = 1;
             }
             break;
           case 0x995d38cb:
             if (p2.equals("translateY")) {
                i2 = 2;
             }
             break;
           case 0xb477f80b:
             if (p2.equals("opacity")) {
                i2 = 3;
             }
             break;
           case 0xbf8d97c1:
             if (p2.equals("matrix")) {
                i2 = 4;
             }
             break;
           case 0xc4c25ea1:
             if (p2.equals("propList")) {
                i2 = 5;
             }
             break;
           case 0xc8565a41:
             if (p2.equals("markerEnd")) {
                i2 = 6;
             }
             break;
           case 0xc85677ae:
             if (p2.equals("markerMid")) {
                i2 = 7;
             }
             break;
           case 0xc9de204e:
             if (p2.equals("scaleX")) {
                i2 = 8;
             }
             break;
           case 0xc9de204f:
             if (p2.equals("scaleY")) {
                i2 = 9;
             }
             break;
           case 0xcad57638:
             if (p2.equals("stroke")) {
                i2 = 10;
             }
             break;
           case 0xcbb7712d:
             if (p2.equals("testID")) {
                i2 = 11;
             }
             break;
           case 0xd4677478:
             if (p2.equals("zIndex")) {
                i2 = 12;
             }
             break;
           case 0xd48a871f:
             if (p2.equals("fillRule")) {
                i2 = 13;
             }
             break;
           case 0xe72c2ab3:
             if (p2.equals("strokeOpacity")) {
                i2 = 14;
             }
             break;
           case 0xee81a9b6:
             if (p2.equals("pointerEvents")) {
                i2 = 15;
             }
             break;
           case 0xf9f0bcf5:
             if (p2.equals("accessibilityHint")) {
                i2 = 16;
             }
             break;
           case 0xf9f55ee4:
             if (p2.equals("accessibilityRole")) {
                i2 = 17;
             }
             break;
           case 0xfb2db0ed:
             if (p2.equals("renderToHardwareTextureAndroid")) {
                i2 = 18;
             }
             break;
           case 0xfcccf108:
             if (p2.equals("fillOpacity")) {
                i2 = 19;
             }
             break;
           case 0xfd57cafd:
             if (p2.equals("strokeDashoffset")) {
                i2 = 20;
             }
             break;
           case 0xfd990f7e:
             if (p2.equals("rotation")) {
                i2 = 21;
             }
             break;
           case 0xffbd2e5d:
             if (p2.equals("elevation")) {
                i2 = 22;
             }
             break;
           case 3769:
             if (p2.equals("x1")) {
                i2 = 23;
             }
             break;
           case 3770:
             if (p2.equals("x2")) {
                i2 = 24;
             }
             break;
           case 3800:
             if (p2.equals("y1")) {
                i2 = 25;
             }
             break;
           case 3801:
             if (p2.equals("y2")) {
                i2 = 26;
             }
             break;
           case 0x2ff583:
             if (p2.equals("fill")) {
                i2 = 27;
             }
             break;
           case 0x3306ec:
             if (p2.equals("mask")) {
                i2 = 28;
             }
             break;
           case 0x337a8b:
             if (p2.equals("name")) {
                i2 = 29;
             }
             break;
           case 0x22936ee:
             if (p2.equals("accessibilityLiveRegion")) {
                i2 = 30;
             }
             break;
           case 0x4b3162e:
             if (p2.equals("strokeMiterlimit")) {
                i2 = 31;
             }
             break;
           case 0x557f730:
             if (p2.equals("gradient")) {
                i2 = 32;
             }
             break;
           case 0x63a48b4:
             if (p2.equals("vectorEffect")) {
                i2 = 33;
             }
             break;
           case 0xcf0d448:
             if (p2.equals("markerStart")) {
                i2 = 34;
             }
             break;
           case 0x17f096af:
             if (p2.equals("strokeDasharray")) {
                i2 = 35;
             }
             break;
           case 0x2c861b47:
             if (p2.equals("importantForAccessibility")) {
                i2 = 36;
             }
             break;
           case 0x36b25395:
             if (p2.equals("clipPath")) {
                i2 = 37;
             }
             break;
           case 0x36b3866c:
             if (p2.equals("clipRule")) {
                i2 = 38;
             }
             break;
           case 0x3d3f8e06:
             if (p2.equals("strokeLinecap")) {
                i2 = 39;
             }
             break;
           case 0x3ebe6b6c:
             if (p2.equals("transform")) {
                i2 = 40;
             }
             break;
           case 0x445b6e46:
             if (p2.equals("accessibilityLabel")) {
                i2 = 41;
             }
             break;
           case 0x44c6b3e3:
             if (p2.equals("accessibilityState")) {
                i2 = 42;
             }
             break;
           case 0x44e880c3:
             if (p2.equals("accessibilityValue")) {
                i2 = 43;
             }
             break;
           case 0x4cb7f6d5:
             if (p2.equals("backgroundColor")) {
                i2 = 44;
             }
             break;
           case 0x4ccfd1e9:
             if (p2.equals("onLayout")) {
                i2 = 45;
             }
             break;
           case 0x59bdabcf:
             if (p2.equals("accessibilityActions")) {
                i2 = 46;
             }
             break;
           case 0x63a518c2:
             if (p2.equals("display")) {
                i2 = 47;
             }
             break;
           case 0x6ab59576:
             if (p2.equals("strokeLinejoin")) {
                i2 = 48;
             }
             break;
           case 0x6ca3aa1c:
             if (p2.equals("gradientTransform")) {
                i2 = 49;
             }
             break;
           case 0x6e2146f6:
             if (p2.equals("responsible")) {
                i2 = 50;
             }
             break;
           case 0x72aeea6e:
             if (p2.equals("strokeWidth")) {
                i2 = 51;
             }
             break;
           case 0x79eeaf72:
             if (p2.equals("nativeID")) {
                i2 = 52;
             }
             break;
           default:
       }
    label_02dc :
       float f = 0x3f800000;
       float f1 = 0;
       switch (i2){
           case 0:
             if (p3 != null) {
                i1 = p3.intValue();
             }
             p0.setGradientUnits(p1, i1);
             break;
           case 1:
             if (p3 != null) {
                f1 = p3.floatValue();
             }
             p0.setTranslateX(p1, f1);
             break;
           case 2:
             if (p3 != null) {
                f1 = p3.floatValue();
             }
             p0.setTranslateY(p1, f1);
             break;
           case 3:
             if (p3 != null) {
                f = p3.floatValue();
             }
             p0.setOpacity(p1, f);
             break;
           case 4:
             p0.setMatrix(p1, new DynamicFromObject(p3));
             break;
           case 5:
             p0.setPropList(p1, p3);
             break;
           case 6:
             p0.setMarkerEnd(p1, p3);
             break;
           case 7:
             p0.setMarkerMid(p1, p3);
             break;
           case 8:
             if (p3 != null) {
                f = p3.floatValue();
             }
             p0.setScaleX(p1, f);
             break;
           case 9:
             if (p3 != null) {
                f = p3.floatValue();
             }
             p0.setScaleY(p1, f);
             break;
           case 10:
             p0.setStroke(p1, new DynamicFromObject(p3));
             break;
           case 11:
             p0.setTestId(p1, p3);
             break;
           case 12:
             if (p3 != null) {
                f1 = p3.floatValue();
             }
             p0.setZIndex(p1, f1);
             break;
           case 13:
             if (p3 != null) {
                i = p3.intValue();
             }
             p0.setFillRule(p1, i);
             break;
           case 14:
             if (p3 != null) {
                f = p3.floatValue();
             }
             p0.setStrokeOpacity(p1, f);
             break;
           case 15:
             p0.setPointerEvents(p1, p3);
             break;
           case 16:
             p0.setAccessibilityHint(p1, p3);
             break;
           case 17:
             p0.setAccessibilityRole(p1, p3);
             break;
           case 18:
             if (p3 != null) {
                i1 = p3.booleanValue();
             }
             p0.setRenderToHardwareTexture(p1, i1);
             break;
           case 19:
             if (p3 != null) {
                f = p3.floatValue();
             }
             p0.setFillOpacity(p1, f);
             break;
           case 20:
             if (p3 != null) {
                f1 = p3.floatValue();
             }
             p0.setStrokeDashoffset(p1, f1);
             break;
           case 21:
             if (p3 != null) {
                f1 = p3.floatValue();
             }
             p0.setRotation(p1, f1);
             break;
           case 22:
             if (p3 != null) {
                f1 = p3.floatValue();
             }
             p0.setElevation(p1, f1);
             break;
           case 23:
             p0.setX1(p1, new DynamicFromObject(p3));
             break;
           case 24:
             p0.setX2(p1, new DynamicFromObject(p3));
             break;
           case 25:
             p0.setY1(p1, new DynamicFromObject(p3));
             break;
           case 26:
             p0.setY2(p1, new DynamicFromObject(p3));
             break;
           case 27:
             p0.setFill(p1, new DynamicFromObject(p3));
             break;
           case 28:
             p0.setMask(p1, p3);
             break;
           case 29:
             p0.setName(p1, p3);
             break;
           case 30:
             p0.setAccessibilityLiveRegion(p1, p3);
             break;
           case 31:
             f = (p3 == null)? 4.00f: p3.floatValue();
             p0.setStrokeMiterlimit(p1, f);
             break;
           case 32:
             p0.setGradient(p1, p3);
             break;
           case '!':
             if (p3 != null) {
                i1 = p3.intValue();
             }
             p0.setVectorEffect(p1, i1);
             break;
           case '"':
             p0.setMarkerStart(p1, p3);
             break;
           case '#':
             p0.setStrokeDasharray(p1, p3);
             break;
           case '$':
             p0.setImportantForAccessibility(p1, p3);
             break;
           case '%':
             p0.setClipPath(p1, p3);
             break;
           case '&':
             if (p3 != null) {
                i1 = p3.intValue();
             }
             p0.setClipRule(p1, i1);
             break;
           case 39:
             if (p3 != null) {
                i = p3.intValue();
             }
             p0.setStrokeLinecap(p1, i);
             break;
           case '(':
             p0.setTransform(p1, new DynamicFromObject(p3));
             break;
           case ')':
             p0.setAccessibilityLabel(p1, p3);
             break;
           case '*':
             p0.setViewState(p1, p3);
             break;
           case '+':
             p0.setAccessibilityValue(p1, p3);
             break;
           case ',':
             if (p3 != null) {
                i1 = p3.intValue();
             }
             p0.setBackgroundColor(p1, i1);
             break;
           case '-':
             if (p3 != null) {
                i1 = p3.booleanValue();
             }
             p0.setOnLayout(p1, i1);
             break;
           case '.':
             p0.setAccessibilityActions(p1, p3);
             break;
           case '/':
             p0.setDisplay(p1, p3);
             break;
           case '0':
             if (p3 != null) {
                i = p3.intValue();
             }
             p0.setStrokeLinejoin(p1, i);
             break;
           case '1':
             p0.setGradientTransform(p1, p3);
             break;
           case '2':
             if (p3 != null) {
                i1 = p3.booleanValue();
             }
             p0.setResponsible(p1, i1);
             break;
           case '3':
             p0.setStrokeWidth(p1, new DynamicFromObject(p3));
             break;
           case '4':
             p0.setNativeId(p1, p3);
             break;
           default:
       }
       return;
    }
}
