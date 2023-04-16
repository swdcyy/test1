package com.horcrux.svg.RenderableViewManager$$PropsSetter;
import com.facebook.react.uimanager.k$e;
import java.lang.Object;
import java.util.Map;
import com.facebook.react.uimanager.ViewManager;
import android.view.View;
import java.lang.String;
import com.horcrux.svg.RenderableViewManager;
import com.horcrux.svg.VirtualView;
import java.util.Objects;
import com.facebook.react.uimanager.BaseViewManager;
import com.horcrux.svg.RenderableView;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.Dynamic;
import java.lang.Boolean;
import java.lang.Double;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

public class RenderableViewManager$$PropsSetter implements k$e	// class@0005bf
{

    public void RenderableViewManager$$PropsSetter(){
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
       p0.put("zIndex", "number");
    }
    public void setProperty(ViewManager p0,View p1,String p2,Object p3){
       this.setProperty(p0, p1, p2, p3);
    }
    public void setProperty(RenderableViewManager p0,VirtualView p1,String p2,Object p3){
       Objects.requireNonNull(p2);
       int i = 1;
       boolean b = false;
       int i1 = -1;
       switch (p2.hashCode()){
           case 0x995d38ca:
             if (p2.equals("translateX")) {
                i1 = 0;
             }
             break;
           case 0x995d38cb:
             if (p2.equals("translateY")) {
                i1 = 1;
             }
             break;
           case 0xb477f80b:
             if (p2.equals("opacity")) {
                i1 = 2;
             }
             break;
           case 0xbf8d97c1:
             if (p2.equals("matrix")) {
                i1 = 3;
             }
             break;
           case 0xc4c25ea1:
             if (p2.equals("propList")) {
                i1 = 4;
             }
             break;
           case 0xc8565a41:
             if (p2.equals("markerEnd")) {
                i1 = 5;
             }
             break;
           case 0xc85677ae:
             if (p2.equals("markerMid")) {
                i1 = 6;
             }
             break;
           case 0xc9de204e:
             if (p2.equals("scaleX")) {
                i1 = 7;
             }
             break;
           case 0xc9de204f:
             if (p2.equals("scaleY")) {
                i1 = 8;
             }
             break;
           case 0xcad57638:
             if (p2.equals("stroke")) {
                i1 = 9;
             }
             break;
           case 0xcbb7712d:
             if (p2.equals("testID")) {
                i1 = 10;
             }
             break;
           case 0xd4677478:
             if (p2.equals("zIndex")) {
                i1 = 11;
             }
             break;
           case 0xd48a871f:
             if (p2.equals("fillRule")) {
                i1 = 12;
             }
             break;
           case 0xe72c2ab3:
             if (p2.equals("strokeOpacity")) {
                i1 = 13;
             }
             break;
           case 0xee81a9b6:
             if (p2.equals("pointerEvents")) {
                i1 = 14;
             }
             break;
           case 0xf9f0bcf5:
             if (p2.equals("accessibilityHint")) {
                i1 = 15;
             }
             break;
           case 0xf9f55ee4:
             if (p2.equals("accessibilityRole")) {
                i1 = 16;
             }
             break;
           case 0xfb2db0ed:
             if (p2.equals("renderToHardwareTextureAndroid")) {
                i1 = 17;
             }
             break;
           case 0xfcccf108:
             if (p2.equals("fillOpacity")) {
                i1 = 18;
             }
             break;
           case 0xfd57cafd:
             if (p2.equals("strokeDashoffset")) {
                i1 = 19;
             }
             break;
           case 0xfd990f7e:
             if (p2.equals("rotation")) {
                i1 = 20;
             }
             break;
           case 0xffbd2e5d:
             if (p2.equals("elevation")) {
                i1 = 21;
             }
             break;
           case 0x2ff583:
             if (p2.equals("fill")) {
                i1 = 22;
             }
             break;
           case 0x3306ec:
             if (p2.equals("mask")) {
                i1 = 23;
             }
             break;
           case 0x337a8b:
             if (p2.equals("name")) {
                i1 = 24;
             }
             break;
           case 0x22936ee:
             if (p2.equals("accessibilityLiveRegion")) {
                i1 = 25;
             }
             break;
           case 0x4b3162e:
             if (p2.equals("strokeMiterlimit")) {
                i1 = 26;
             }
             break;
           case 0x63a48b4:
             if (p2.equals("vectorEffect")) {
                i1 = 27;
             }
             break;
           case 0xcf0d448:
             if (p2.equals("markerStart")) {
                i1 = 28;
             }
             break;
           case 0x17f096af:
             if (p2.equals("strokeDasharray")) {
                i1 = 29;
             }
             break;
           case 0x2c861b47:
             if (p2.equals("importantForAccessibility")) {
                i1 = 30;
             }
             break;
           case 0x36b25395:
             if (p2.equals("clipPath")) {
                i1 = 31;
             }
             break;
           case 0x36b3866c:
             if (p2.equals("clipRule")) {
                i1 = 32;
             }
             break;
           case 0x3d3f8e06:
             if (p2.equals("strokeLinecap")) {
                i1 = 33;
             }
             break;
           case 0x3ebe6b6c:
             if (p2.equals("transform")) {
                i1 = 34;
             }
             break;
           case 0x445b6e46:
             if (p2.equals("accessibilityLabel")) {
                i1 = 35;
             }
             break;
           case 0x44c6b3e3:
             if (p2.equals("accessibilityState")) {
                i1 = 36;
             }
             break;
           case 0x44e880c3:
             if (p2.equals("accessibilityValue")) {
                i1 = 37;
             }
             break;
           case 0x4cb7f6d5:
             if (p2.equals("backgroundColor")) {
                i1 = 38;
             }
             break;
           case 0x4ccfd1e9:
             if (p2.equals("onLayout")) {
                i1 = 39;
             }
             break;
           case 0x59bdabcf:
             if (p2.equals("accessibilityActions")) {
                i1 = 40;
             }
             break;
           case 0x63a518c2:
             if (p2.equals("display")) {
                i1 = 41;
             }
             break;
           case 0x6ab59576:
             if (p2.equals("strokeLinejoin")) {
                i1 = 42;
             }
             break;
           case 0x6e2146f6:
             if (p2.equals("responsible")) {
                i1 = 43;
             }
             break;
           case 0x72aeea6e:
             if (p2.equals("strokeWidth")) {
                i1 = 44;
             }
             break;
           case 0x79eeaf72:
             if (p2.equals("nativeID")) {
                i1 = 45;
             }
             break;
           default:
       }
    label_027a :
       float f = 0x3f800000;
       float f1 = 0;
       switch (i1){
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
                f = p3.floatValue();
             }
             p0.setOpacity(p1, f);
             break;
           case 3:
             p0.setMatrix(p1, new DynamicFromObject(p3));
             break;
           case 4:
             p0.setPropList(p1, p3);
             break;
           case 5:
             p0.setMarkerEnd(p1, p3);
             break;
           case 6:
             p0.setMarkerMid(p1, p3);
             break;
           case 7:
             if (p3 != null) {
                f = p3.floatValue();
             }
             p0.setScaleX(p1, f);
             break;
           case 8:
             if (p3 != null) {
                f = p3.floatValue();
             }
             p0.setScaleY(p1, f);
             break;
           case 9:
             p0.setStroke(p1, new DynamicFromObject(p3));
             break;
           case 10:
             p0.setTestId(p1, p3);
             break;
           case 11:
             if (p3 != null) {
                f1 = p3.floatValue();
             }
             p0.setZIndex(p1, f1);
             break;
           case 12:
             if (p3 != null) {
                i = p3.intValue();
             }
             p0.setFillRule(p1, i);
             break;
           case 13:
             if (p3 != null) {
                f = p3.floatValue();
             }
             p0.setStrokeOpacity(p1, f);
             break;
           case 14:
             p0.setPointerEvents(p1, p3);
             break;
           case 15:
             p0.setAccessibilityHint(p1, p3);
             break;
           case 16:
             p0.setAccessibilityRole(p1, p3);
             break;
           case 17:
             if (p3 != null) {
                b = p3.booleanValue();
             }
             p0.setRenderToHardwareTexture(p1, b);
             break;
           case 18:
             if (p3 != null) {
                f = p3.floatValue();
             }
             p0.setFillOpacity(p1, f);
             break;
           case 19:
             if (p3 != null) {
                f1 = p3.floatValue();
             }
             p0.setStrokeDashoffset(p1, f1);
             break;
           case 20:
             if (p3 != null) {
                f1 = p3.floatValue();
             }
             p0.setRotation(p1, f1);
             break;
           case 21:
             if (p3 != null) {
                f1 = p3.floatValue();
             }
             p0.setElevation(p1, f1);
             break;
           case 22:
             p0.setFill(p1, new DynamicFromObject(p3));
             break;
           case 23:
             p0.setMask(p1, p3);
             break;
           case 24:
             p0.setName(p1, p3);
             break;
           case 25:
             p0.setAccessibilityLiveRegion(p1, p3);
             break;
           case 26:
             f = (p3 == null)? 4.00f: p3.floatValue();
             p0.setStrokeMiterlimit(p1, f);
             break;
           case 27:
             if (p3 != null) {
                b = p3.intValue();
             }
             p0.setVectorEffect(p1, b);
             break;
           case 28:
             p0.setMarkerStart(p1, p3);
             break;
           case 29:
             p0.setStrokeDasharray(p1, p3);
             break;
           case 30:
             p0.setImportantForAccessibility(p1, p3);
             break;
           case 31:
             p0.setClipPath(p1, p3);
             break;
           case 32:
             if (p3 != null) {
                b = p3.intValue();
             }
             p0.setClipRule(p1, b);
             break;
           case '!':
             if (p3 != null) {
                i = p3.intValue();
             }
             p0.setStrokeLinecap(p1, i);
             break;
           case '"':
             p0.setTransform(p1, new DynamicFromObject(p3));
             break;
           case '#':
             p0.setAccessibilityLabel(p1, p3);
             break;
           case '$':
             p0.setViewState(p1, p3);
             break;
           case '%':
             p0.setAccessibilityValue(p1, p3);
             break;
           case '&':
             if (p3 != null) {
                b = p3.intValue();
             }
             p0.setBackgroundColor(p1, b);
             break;
           case 39:
             if (p3 != null) {
                b = p3.booleanValue();
             }
             p0.setOnLayout(p1, b);
             break;
           case '(':
             p0.setAccessibilityActions(p1, p3);
             break;
           case ')':
             p0.setDisplay(p1, p3);
             break;
           case '*':
             if (p3 != null) {
                i = p3.intValue();
             }
             p0.setStrokeLinejoin(p1, i);
             break;
           case '+':
             if (p3 != null) {
                b = p3.booleanValue();
             }
             p0.setResponsible(p1, b);
             break;
           case ',':
             p0.setStrokeWidth(p1, new DynamicFromObject(p3));
             break;
           case '-':
             p0.setNativeId(p1, p3);
             break;
           default:
       }
       return;
    }
}
