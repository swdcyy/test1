package com.airbnb.android.react.lottie.LottieAnimationViewManager$$PropsSetter;
import com.facebook.react.uimanager.k$e;
import java.lang.Object;
import com.airbnb.android.react.lottie.LottieAnimationViewManager;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.String;
import java.util.Objects;
import java.lang.Boolean;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Double;
import com.facebook.react.bridge.ReadableMap;
import java.util.Map;
import com.facebook.react.uimanager.ViewManager;

public class LottieAnimationViewManager$$PropsSetter implements k$e	// class@000d7b
{

    public void LottieAnimationViewManager$$PropsSetter(){
       super();
    }
    public void a(LottieAnimationViewManager p0,LottieAnimationView p1,String p2,Object p3){
       Objects.requireNonNull(p2);
       boolean b = true;
       boolean b1 = false;
       int i = -1;
       switch (p2.hashCode()){
           case 0x8ce45acc:
             if (p2.equals("imageAssetsFolder")) {
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
           case 0x9d2ec773:
             if (p2.equals("allowSetNativeAutoPlay")) {
                i = 3;
             }
             break;
           case 0xaecfe449:
             if (p2.equals("allowExpImagesLoadedEvent")) {
                i = 4;
             }
             break;
           case 0xb477f80b:
             if (p2.equals("opacity")) {
                i = 5;
             }
             break;
           case 0xbdbc43a3:
             if (p2.equals("sourceJson")) {
                i = 6;
             }
             break;
           case 0xbdbdd146:
             if (p2.equals("sourceName")) {
                i = 7;
             }
             break;
           case 0xbdc0e5f5:
             if (p2.equals("sourceType")) {
                i = 8;
             }
             break;
           case 0xc00a9cc8:
             if (p2.equals("cacheComposition")) {
                i = 9;
             }
             break;
           case 0xc454c22d:
             if (p2.equals("progress")) {
                i = 10;
             }
             break;
           case 0xc9de204e:
             if (p2.equals("scaleX")) {
                i = 11;
             }
             break;
           case 0xc9de204f:
             if (p2.equals("scaleY")) {
                i = 12;
             }
             break;
           case 0xcbb7712d:
             if (p2.equals("testID")) {
                i = 13;
             }
             break;
           case 0xd4677478:
             if (p2.equals("zIndex")) {
                i = 14;
             }
             break;
           case 0xf9f0bcf5:
             if (p2.equals("accessibilityHint")) {
                i = 15;
             }
             break;
           case 0xf9f55ee4:
             if (p2.equals("accessibilityRole")) {
                i = 16;
             }
             break;
           case 0xfb2db0ed:
             if (p2.equals("renderToHardwareTextureAndroid")) {
                i = 17;
             }
             break;
           case 0xfd990f7e:
             if (p2.equals("rotation")) {
                i = 18;
             }
             break;
           case 0xffbd2e5d:
             if (p2.equals("elevation")) {
                i = 19;
             }
             break;
           case 0x32c6a4:
             if (p2.equals("loop")) {
                i = 20;
             }
             break;
           case 0x22936ee:
             if (p2.equals("accessibilityLiveRegion")) {
                i = 21;
             }
             break;
           case 0x6890047:
             if (p2.equals("speed")) {
                i = 22;
             }
             break;
           case 0x2c861b47:
             if (p2.equals("importantForAccessibility")) {
                i = 23;
             }
             break;
           case 0x3ebe6b6c:
             if (p2.equals("transform")) {
                i = 24;
             }
             break;
           case 0x445b6e46:
             if (p2.equals("accessibilityLabel")) {
                i = 25;
             }
             break;
           case 0x44c6b3e3:
             if (p2.equals("accessibilityState")) {
                i = 26;
             }
             break;
           case 0x44e880c3:
             if (p2.equals("accessibilityValue")) {
                i = 27;
             }
             break;
           case 0x47293459:
             if (p2.equals("renderMode")) {
                i = 28;
             }
             break;
           case 0x4cb7f6d5:
             if (p2.equals("backgroundColor")) {
                i = 29;
             }
             break;
           case 0x54138718:
             if (p2.equals("colorFilters")) {
                i = 30;
             }
             break;
           case 0x55bf6d83:
             if (p2.equals("autoPlay")) {
                i = 31;
             }
             break;
           case 0x59bdabcf:
             if (p2.equals("accessibilityActions")) {
                i = 32;
             }
             break;
           case 0x613df3db:
             if (p2.equals("assetsImages")) {
                i = 33;
             }
             break;
           case 0x79eeaf72:
             if (p2.equals("nativeID")) {
                i = 34;
             }
             break;
           case 0x7a2cd077:
             if (p2.equals("resizeMode")) {
                i = 35;
             }
             break;
           case 0x7dd7e061:
             if (p2.equals("enableMergePathsAndroidForKitKatAndAbove")) {
                i = 36;
             }
             break;
           default:
       }
    label_01fc :
       float f = 0x3f800000;
       float f1 = 0;
       switch (i){
           case 0:
             p0.setImageAssetsFolder(p1, p3);
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
                b = p3.booleanValue();
             }
             p0.setAllowSetNativeAutoPlay(p1, b);
             break;
           case 4:
             if (p3 != null) {
                b1 = p3.booleanValue();
             }
             p0.set(p1, b1);
             break;
           case 5:
             if (p3 != null) {
                f = p3.floatValue();
             }
             p0.setOpacity(p1, f);
             break;
           case 6:
             p0.setSourceJson(p1, p3);
             break;
           case 7:
             p0.setSourceName(p1, p3);
             break;
           case 8:
             p0.setSourceType(p1, p3);
             break;
           case 9:
             if (p3 != null) {
                b1 = p3.booleanValue();
             }
             p0.setCacheComposition(p1, b1);
             break;
           case 10:
             if (p3 != null) {
                f1 = p3.floatValue();
             }
             p0.setProgress(p1, f1);
             break;
           case 11:
             if (p3 != null) {
                f = p3.floatValue();
             }
             p0.setScaleX(p1, f);
             break;
           case 12:
             if (p3 != null) {
                f = p3.floatValue();
             }
             p0.setScaleY(p1, f);
             break;
           case 13:
             p0.setTestId(p1, p3);
             break;
           case 14:
             if (p3 != null) {
                f1 = p3.floatValue();
             }
             p0.setZIndex(p1, f1);
             break;
           case 15:
             p0.setAccessibilityHint(p1, p3);
             break;
           case 16:
             p0.setAccessibilityRole(p1, p3);
             break;
           case 17:
             if (p3 != null) {
                b1 = p3.booleanValue();
             }
             p0.setRenderToHardwareTexture(p1, b1);
             break;
           case 18:
             if (p3 != null) {
                f1 = p3.floatValue();
             }
             p0.setRotation(p1, f1);
             break;
           case 19:
             if (p3 != null) {
                f1 = p3.floatValue();
             }
             p0.setElevation(p1, f1);
             break;
           case 20:
             if (p3 != null) {
                b1 = p3.booleanValue();
             }
             p0.setLoop(p1, b1);
             break;
           case 21:
             p0.setAccessibilityLiveRegion(p1, p3);
             break;
           case 22:
             double d = (p3 == null)? 0: p3.doubleValue();
             p0.setSpeed(p1, d);
             break;
           case 23:
             p0.setImportantForAccessibility(p1, p3);
             break;
           case 24:
             p0.setTransform(p1, p3);
             break;
           case 25:
             p0.setAccessibilityLabel(p1, p3);
             break;
           case 26:
             p0.setViewState(p1, p3);
             break;
           case 27:
             p0.setAccessibilityValue(p1, p3);
             break;
           case 28:
             p0.setRenderMode(p1, p3);
             break;
           case 29:
             if (p3 != null) {
                b1 = p3.intValue();
             }
             p0.setBackgroundColor(p1, b1);
             break;
           case 30:
             p0.setColorFilters(p1, p3);
             break;
           case 31:
             if (p3 != null) {
                b1 = p3.booleanValue();
             }
             p0.setAutoPlay(p1, b1);
             break;
           case 32:
             p0.setAccessibilityActions(p1, p3);
             break;
           case '!':
             p0.setAssetsImages(p1, p3);
             break;
           case '"':
             p0.setNativeId(p1, p3);
             break;
           case '#':
             p0.setResizeMode(p1, p3);
             break;
           case '$':
             if (p3 != null) {
                b1 = p3.booleanValue();
             }
             p0.setEnableMergePaths(p1, b1);
             break;
           default:
       }
       return;
    }
    public void getProperties(Map p0){
       p0.put("accessibilityActions", "Array");
       p0.put("accessibilityHint", "String");
       p0.put("accessibilityLabel", "String");
       p0.put("accessibilityLiveRegion", "String");
       p0.put("accessibilityRole", "String");
       p0.put("accessibilityState", "Map");
       p0.put("accessibilityValue", "Map");
       p0.put("allowExpImagesLoadedEvent", "boolean");
       p0.put("allowSetNativeAutoPlay", "boolean");
       p0.put("assetsImages", "Array");
       p0.put("autoPlay", "boolean");
       p0.put("backgroundColor", "Color");
       p0.put("cacheComposition", "boolean");
       p0.put("colorFilters", "Array");
       p0.put("elevation", "number");
       p0.put("enableMergePathsAndroidForKitKatAndAbove", "boolean");
       p0.put("imageAssetsFolder", "String");
       p0.put("importantForAccessibility", "String");
       p0.put("loop", "boolean");
       p0.put("nativeID", "String");
       p0.put("opacity", "number");
       p0.put("progress", "number");
       p0.put("renderMode", "String");
       p0.put("renderToHardwareTextureAndroid", "boolean");
       p0.put("resizeMode", "String");
       p0.put("rotation", "number");
       p0.put("scaleX", "number");
       p0.put("scaleY", "number");
       p0.put("sourceJson", "String");
       p0.put("sourceName", "String");
       p0.put("sourceType", "String");
       p0.put("speed", "number");
       p0.put("testID", "String");
       p0.put("transform", "Array");
       p0.put("translateX", "number");
       p0.put("translateY", "number");
       p0.put("zIndex", "number");
    }
    public void setProperty(ViewManager p0,View p1,String p2,Object p3){
       this.a(p0, p1, p2, p3);
    }
}
