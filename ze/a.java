package ze.a;
import ze.c1;
import ze.b;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Double;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Boolean;

public abstract class a implements c1	// class@0031e9
{
    public final b a;

    public void a(b p0){
       super();
       this.a = p0;
    }
    public void a(View p0,String p1,Object p2){
       float this;
       a ta;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "1")) {
          return;
       }
       Objects.requireNonNull(p1);
       int i = -1;
       boolean b = false;
       switch (p1.hashCode()){
           case 0x995d38ca:
             if (p1.equals("translateX")) {
                i = 0;
             }
             break;
           case 0x995d38cb:
             if (p1.equals("translateY")) {
                i = 1;
             }
             break;
           case 0xb477f80b:
             if (p1.equals("opacity")) {
                i = 2;
             }
             break;
           case 0xb6cd31e2:
             if (p1.equals("borderTopLeftRadius")) {
                i = 3;
             }
             break;
           case 0xc9de204e:
             if (p1.equals("scaleX")) {
                i = 4;
             }
             break;
           case 0xc9de204f:
             if (p1.equals("scaleY")) {
                i = 5;
             }
             break;
           case 0xcbb7712d:
             if (p1.equals("testID")) {
                i = 6;
             }
             break;
           case 0xd4677478:
             if (p1.equals("zIndex")) {
                i = 7;
             }
             break;
           case 0xf9f0bcf5:
             if (p1.equals("accessibilityHint")) {
                i = 8;
             }
             break;
           case 0xf9f55ee4:
             if (p1.equals("accessibilityRole")) {
                i = 9;
             }
             break;
           case 0xfb2db0ed:
             if (p1.equals("renderToHardwareTextureAndroid")) {
                i = 10;
             }
             break;
           case 0xfd990f7e:
             if (p1.equals("rotation")) {
                i = 11;
             }
             break;
           case 0xffbd2e5d:
             if (p1.equals("elevation")) {
                i = 12;
             }
             break;
           case 0x22936ee:
             if (p1.equals("accessibilityLiveRegion")) {
                i = 13;
             }
             break;
           case 0x13dfc885:
             if (p1.equals("borderTopRightRadius")) {
                i = 14;
             }
             break;
           case 0x22a57450:
             if (p1.equals("borderBottomLeftRadius")) {
                i = 15;
             }
             break;
           case 0x230fd3d7:
             if (p1.equals("borderBottomRightRadius")) {
                i = 16;
             }
             break;
           case 0x2c861b47:
             if (p1.equals("importantForAccessibility")) {
                i = 17;
             }
             break;
           case 0x3ebe6b6c:
             if (p1.equals("transform")) {
                i = 18;
             }
             break;
           case 0x445b6e46:
             if (p1.equals("accessibilityLabel")) {
                i = 19;
             }
             break;
           case 0x44c6b3e3:
             if (p1.equals("accessibilityState")) {
                i = 20;
             }
             break;
           case 0x4cb7f6d5:
             if (p1.equals("backgroundColor")) {
                i = 21;
             }
             break;
           case 0x506afbde:
             if (p1.equals("borderRadius")) {
                i = 22;
             }
             break;
           case 0x59bdabcf:
             if (p1.equals("accessibilityActions")) {
                i = 23;
             }
             break;
           case 0x79eeaf72:
             if (p1.equals("nativeID")) {
                i = 24;
             }
             break;
           default:
       }
    label_0162 :
       a uoa = 0x3f800000;
       float f = 0;
       this = Float.NaN;
       switch (i){
           case 0:
             uoa = this.a;
             if (p2 != null) {
                f = p2.floatValue();
             }
             uoa.setTranslateX(p0, f);
             break;
           case 1:
             uoa = this.a;
             if (p2 != null) {
                f = p2.floatValue();
             }
             uoa.setTranslateY(p0, f);
             break;
           case 2:
             ta = this.a;
             if (p2 != null) {
                uoa = p2.floatValue();
             }
             ta.setOpacity(p0, uoa);
             break;
           case 3:
             uoa = this.a;
             if (p2 != null) {
                this = p2.floatValue();
             }
             uoa.setBorderTopLeftRadius(p0, this);
             break;
           case 4:
             ta = this.a;
             if (p2 != null) {
                uoa = p2.floatValue();
             }
             ta.setScaleX(p0, uoa);
             break;
           case 5:
             ta = this.a;
             if (p2 != null) {
                uoa = p2.floatValue();
             }
             ta.setScaleY(p0, uoa);
             break;
           case 6:
             this.a.setTestId(p0, p2);
             break;
           case 7:
             uoa = this.a;
             if (p2 != null) {
                f = p2.floatValue();
             }
             uoa.setZIndex(p0, f);
             break;
           case 8:
             this.a.setAccessibilityHint(p0, p2);
             break;
           case 9:
             this.a.setAccessibilityRole(p0, p2);
             break;
           case 10:
             uoa = this.a;
             if (p2 != null) {
                b = p2.booleanValue();
             }
             uoa.setRenderToHardwareTexture(p0, b);
             break;
           case 11:
             uoa = this.a;
             if (p2 != null) {
                f = p2.floatValue();
             }
             uoa.setRotation(p0, f);
             break;
           case 12:
             uoa = this.a;
             if (p2 != null) {
                f = p2.floatValue();
             }
             uoa.setElevation(p0, f);
             break;
           case 13:
             this.a.setAccessibilityLiveRegion(p0, p2);
             break;
           case 14:
             uoa = this.a;
             if (p2 != null) {
                this = p2.floatValue();
             }
             uoa.setBorderTopRightRadius(p0, this);
             break;
           case 15:
             uoa = this.a;
             if (p2 != null) {
                this = p2.floatValue();
             }
             uoa.setBorderBottomLeftRadius(p0, this);
             break;
           case 16:
             uoa = this.a;
             if (p2 != null) {
                this = p2.floatValue();
             }
             uoa.setBorderBottomRightRadius(p0, this);
             break;
           case 17:
             this.a.setImportantForAccessibility(p0, p2);
             break;
           case 18:
             this.a.setTransform(p0, p2);
             break;
           case 19:
             this.a.setAccessibilityLabel(p0, p2);
             break;
           case 20:
             this.a.setViewState(p0, p2);
             break;
           case 21:
             uoa = this.a;
             if (p2 != null) {
                b = p2.intValue();
             }
             uoa.setBackgroundColor(p0, b);
             break;
           case 22:
             uoa = this.a;
             if (p2 != null) {
                this = p2.floatValue();
             }
             uoa.setBorderRadius(p0, this);
             break;
           case 23:
             this.a.setAccessibilityActions(p0, p2);
             break;
           case 24:
             this.a.setNativeId(p0, p2);
             break;
           default:
       }
       return;
    }
}
