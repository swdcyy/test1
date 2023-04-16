package lq8.b;
import cq8.b;
import java.lang.Object;
import gx4.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.plugin.TKBlurImage;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Boolean;
import java.util.Objects;
import cq8.a;
import iq8.r;
import com.tachikoma.core.component.e;
import com.tachikoma.component.imageview.TKImage;
import iq8.a;
import java.lang.Number;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.V8Object;
import com.tkruntime.v8.utils.V8ObjectUtilsQuick;
import java.util.HashMap;

public class b implements b	// class@002d94
{

    public void b(){
       super();
    }
    public Object a(f p0){
       TKBlurImage tKBlurImage = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (tKBlurImage != PatchProxyResult.class) {
       }else {
          tKBlurImage = new TKBlurImage(p0);
       }
       return tKBlurImage;
    }
    public void b(Object p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "6")) {
          return;
       }
       Iterator iterator = p1.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          this.g(p0, key, uEntry.getValue());
       }
       return;
    }
    public boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0xa00f8b41:
             if (p0.equals("enabled")) {
                i = 0;
             }
             break;
           case 0xb02579a4:
             if (p0.equals("onPress")) {
                i = 1;
             }
             break;
           case 0xb73748b8:
             if (p0.equals("disallowParentInterceptTouchEvent")) {
                i = 2;
             }
             break;
           case 0x1bde4:
             if (p0.equals("src")) {
                i = 3;
             }
             break;
           case 0x1c56c:
             if (p0.equals("uri")) {
                i = 4;
             }
             break;
           case 0x4f8d808:
             if (p0.equals("onLongPress")) {
                i = 5;
             }
             break;
           case 0x68b1db1:
             if (p0.equals("style")) {
                i = 6;
             }
             break;
           case 0x4c5ef26e:
             if (p0.equals("pivotPoint")) {
                i = 7;
             }
             break;
           case 0x639e22e8:
             if (p0.equals("disable")) {
                i = 8;
             }
             break;
           case 0x79eeaf72:
             if (p0.equals("nativeID")) {
                i = 9;
             }
             break;
           default:
       }
       switch (i){
           case 0:
           case 2:
           case 3:
           case 4:
           case 5:
           case 6:
           case 7:
           case 8:
           case 9:
           case 1:
           default:
             return false;
       }
       return true;
    }
    public boolean d(String p0){
       return a.h(this, p0);
    }
    public Object e(Object p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p1);
       int i = -1;
       switch (p1.hashCode()){
           case 0xa00f8b41:
             if (p1.equals("enabled")) {
                i = 0;
             }
             break;
           case 0xb02579a4:
             if (p1.equals("onPress")) {
                i = 1;
             }
             break;
           case 0xb73748b8:
             if (p1.equals("disallowParentInterceptTouchEvent")) {
                i = 2;
             }
             break;
           case 0x1bde4:
             if (p1.equals("src")) {
                i = 3;
             }
             break;
           case 0x1c56c:
             if (p1.equals("uri")) {
                i = 4;
             }
             break;
           case 0x4f8d808:
             if (p1.equals("onLongPress")) {
                i = 5;
             }
             break;
           case 0x68b1db1:
             if (p1.equals("style")) {
                i = 6;
             }
             break;
           case 0x4c5ef26e:
             if (p1.equals("pivotPoint")) {
                i = 7;
             }
             break;
           case 0x639e22e8:
             if (p1.equals("disable")) {
                i = 8;
             }
             break;
           case 0x79eeaf72:
             if (p1.equals("nativeID")) {
                i = 9;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             return Boolean.valueOf(p0.enabled);
           case 1:
             return p0.mOnPressListener;
           case 2:
             return Boolean.valueOf(p0.disallowParentInterceptTouchEvent);
           case 3:
             return p0.src;
           case 4:
             return p0.uri;
           case 5:
             return p0.mOnLongPressListener;
           case 6:
             return p0.style;
           case 7:
             return p0.mPivotPoint;
           case 8:
             return Boolean.valueOf(p0.disable);
           case 9:
             return p0.nativeID;
           default:
             r.a();
             return null;
       }
    }
    public Object f(Object p0,String p1,Object[] p2){
       int this;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       e uoe = p0;
       Objects.requireNonNull(p1);
       int i = -1;
       int i1 = 5;
       this = 4;
       int i2 = 3;
       int i3 = 2;
       int i4 = 1;
       int i5 = 0;
       switch (p1.hashCode()){
           case 0x901b6914:
             if (p1.equals("setVisibility")) {
                i = 0;
             }
             break;
           case 0x93e43fb1:
             if (p1.equals("setPlaceholder")) {
                i = 1;
             }
             break;
           case 0x9ec483ef:
             if (p1.equals("setCDNUrls")) {
                i = 2;
             }
             break;
           case 0xa1af6404:
             if (p1.equals("setImageLoadCallback")) {
                i = 3;
             }
             break;
           case 0xa37bdc05:
             if (p1.equals("pauseAnimations")) {
                i = 4;
             }
             break;
           case 0xa6f0dd90:
             if (p1.equals("setUriWith")) {
                i = 5;
             }
             break;
           case 0xb5c23ecc:
             if (p1.equals("setTranslateX")) {
                i = 6;
             }
             break;
           case 0xb5c23ecd:
             if (p1.equals("setTranslateY")) {
                i = 7;
             }
             break;
           case 0xbd9b1578:
             if (p1.equals("setUriWithTintColor")) {
                i = 8;
             }
             break;
           case 0xbddafb2a:
             if (p1.equals("layout")) {
                i = 9;
             }
             break;
           case 0xc0879760:
             if (p1.equals("removeAnimation")) {
                i = 10;
             }
             break;
           case 0xc74465db:
             if (p1.equals("setBlurRadius")) {
                i = 11;
             }
             break;
           case 0xc987ac0c:
             if (p1.equals("setGradientBgColor")) {
                i = 12;
             }
             break;
           case 0xca029622:
             if (p1.equals("setSrc")) {
                i = 13;
             }
             break;
           case 0xca029daa:
             if (p1.equals("setUri")) {
                i = 14;
             }
             break;
           case 0xdab2e64d:
             if (p1.equals("addEventListener")) {
                i = 15;
             }
             break;
           case 0xdfb98f4a:
             if (p1.equals("removeEventListener")) {
                i = 16;
             }
             break;
           case 0xed71657c:
             if (p1.equals("resumeAnimations")) {
                i = 17;
             }
             break;
           case 0xfb854877:
             if (p1.equals("getSize")) {
                i = 18;
             }
             break;
           case 0xfd57451d:
             if (p1.equals("startViewAnimation")) {
                i = 19;
             }
             break;
           case 0x3bf579b:
             if (p1.equals("setRotateX")) {
                i = 20;
             }
             break;
           case 0x3bf579c:
             if (p1.equals("setRotateY")) {
                i = 21;
             }
             break;
           case 0xc307d76:
             if (p1.equals("getLocationOnScreen")) {
                i = 22;
             }
             break;
           case 0x20d5ad87:
             if (p1.equals("removeAllAnimation")) {
                i = 23;
             }
             break;
           case 0x2127345d:
             if (p1.equals("setRotate")) {
                i = 24;
             }
             break;
           case 0x222a7750:
             if (p1.equals("setScaleX")) {
                i = 25;
             }
             break;
           case 0x222a7751:
             if (p1.equals("setScaleY")) {
                i = 26;
             }
             break;
           case 0x24aa1a5d:
             if (p1.equals("setUsedWithCanvas")) {
                i = 27;
             }
             break;
           case 0x28f8d21c:
             if (p1.equals("getOrigin")) {
                i = 28;
             }
             break;
           case 0x3a72e7e3:
             if (p1.equals("addAnimation")) {
                i = 29;
             }
             break;
           case 0x417a59f0:
             if (p1.equals("removeSelf")) {
                i = 30;
             }
             break;
           case 0x43560093:
             if (p1.equals("setImageUri")) {
                i = 31;
             }
             break;
           case 0x5192afe6:
             if (p1.equals("invokeNativeFunctionWithJSONString")) {
                i = 32;
             }
             break;
           case 0x5934e9b5:
             if (p1.equals("_setVNode")) {
                i = 33;
             }
             break;
           case 0x67f06213:
             if (p1.equals("setBackgroundColor")) {
                i = 34;
             }
             break;
           case 0x6c852a39:
             if (p1.equals("observeNextLayout")) {
                i = 35;
             }
             break;
           case 0x75a6ebdd:
             if (p1.equals("setImageIconName")) {
                i = 36;
             }
             break;
           case 0x76511866:
             if (p1.equals("setUrls")) {
                i = 37;
             }
             break;
           default:
       }
    label_0222 :
       p1 = null;
       switch (i){
           case 0:
             uoe.setVisibility(a.a(p2, i5));
             return p1;
           case 1:
             uoe.setPlaceholder(a.a(p2, i5));
             return p1;
           case 2:
             uoe.setCDNUrls(a.a(p2, i5), a.m(a.c(p2, i4)), a.m(a.c(p2, i3)), a.a(p2, i2), a.a(p2, this), a.m(a.c(p2, i1)));
             return p1;
           case 3:
             uoe.setImageLoadCallback(a.a(p2, i5));
             return p1;
           case 4:
             uoe.pauseAnimations();
             return p1;
           case 5:
             uoe.setUriWith(a.a(p2, i5), a.a(p2, i4), a.a(p2, i3));
             return p1;
           case 6:
             uoe.setTranslateX(a.l(a.c(p2, i5)));
             return p1;
           case 7:
             uoe.setTranslateY(a.l(a.c(p2, i5)));
             return p1;
           case 8:
             uoe.setUriWithTintColor(a.a(p2, i5), a.a(p2, i4));
             return p1;
           case 9:
             uoe.layout();
             return p1;
           case 10:
             uoe.removeAnimation(a.a(p2, i5));
             return p1;
           case 11:
             uoe.setBlurRadius(a.m(a.c(p2, i5)));
             return p1;
           case 12:
             uoe.setGradientBgColor(a.a(p2, i5));
             return p1;
           case 13:
             uoe.setSrc(a.a(p2, i5));
             return p1;
           case 14:
             uoe.setUri(a.a(p2, i5));
             return p1;
           case 15:
             uoe.addEventListener(a.a(p2, i5), a.a(p2, i4), a.b(p2, i3).booleanValue());
             return p1;
           case 16:
             uoe.removeEventListener(a.a(p2, i5), a.a(p2, i4));
             return p1;
           case 17:
             uoe.resumeAnimations();
             return p1;
           case 18:
             return uoe.getSize();
           case 19:
             uoe.startViewAnimation(a.a(p2, i5), a.m(a.c(p2, i4)), a.l(a.c(p2, i3)), a.l(a.c(p2, i2)));
             return p1;
           case 20:
             uoe.setRotateX(a.l(a.c(p2, i5)));
             return p1;
           case 21:
             uoe.setRotateY(a.l(a.c(p2, i5)));
             return p1;
           case 22:
             return uoe.getLocationOnScreen();
           case 23:
             uoe.removeAllAnimation();
             return p1;
           case 24:
             uoe.setRotate(a.l(a.c(p2, i5)));
             return p1;
           case 25:
             uoe.setScaleX(a.l(a.c(p2, i5)));
             return p1;
           case 26:
             uoe.setScaleY(a.l(a.c(p2, i5)));
             return p1;
           case 27:
             uoe.setUsedWithCanvas(a.b(p2, i5).booleanValue());
             return p1;
           case 28:
             return uoe.getOrigin();
           case 29:
             uoe.addAnimation(a.a(p2, i5), a.a(p2, i4));
             return p1;
           case 30:
             uoe.removeSelf();
             return p1;
           case 31:
             uoe.setImageUri(a.a(p2, i5), a.a(p2, i4), a.a(p2, i3));
             return p1;
           case 32:
             return uoe.onJSInvokeNativeFunctionWithJSONString(a.a(p2, i5), a.a(p2, i4), a.a(p2, i3));
           case '!':
             uoe.setVNode(a.a(p2, i5));
             return p1;
           case '"':
             uoe.setBackgroundColor(a.a(p2, i5));
             return p1;
           case '#':
             uoe.observeNextLayout(a.a(p2, i5), a.b(p2, i4).booleanValue(), a.b(p2, i3).booleanValue());
             return p1;
           case '$':
             uoe.setImageIconName(a.a(p2, i5), a.a(p2, i4), a.m(a.c(p2, i3)), a.a(p2, i2));
             return p1;
           case '%':
             uoe.setUrls(a.a(p2, i5), a.m(a.c(p2, i4)), a.m(a.c(p2, i3)));
             return p1;
           default:
             r.a();
             return p1;
       }
    }
    public void g(Object p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "7")) {
          return;
       }
       Objects.requireNonNull(p1);
       int i = -1;
       switch (p1.hashCode()){
           case 0x896977f3:
             if (p1.equals("borderRightColor")) {
                i = 0;
             }
             break;
           case 0x8a4d6641:
             if (p1.equals("borderRightStyle")) {
                i = 1;
             }
             break;
           case 0x8a807656:
             if (p1.equals("borderRightWidth")) {
                i = 2;
             }
             break;
           case 0xa854f75a:
             if (p1.equals("borderTopColor")) {
                i = 3;
             }
             break;
           case 0xa938e5a8:
             if (p1.equals("borderTopStyle")) {
                i = 4;
             }
             break;
           case 0xa96bf5bd:
             if (p1.equals("borderTopWidth")) {
                i = 5;
             }
             break;
           case 0xae4f40ce:
             if (p1.equals("gradientBgColor")) {
                i = 6;
             }
             break;
           case 0xb098552e:
             if (p1.equals("background")) {
                i = 7;
             }
             break;
           case 0xb1fc682c:
             if (p1.equals("borderBottomColor")) {
                i = 8;
             }
             break;
           case 0xb2e0567a:
             if (p1.equals("borderBottomStyle")) {
                i = 9;
             }
             break;
           case 0xb313668f:
             if (p1.equals("borderBottomWidth")) {
                i = 10;
             }
             break;
           case 0xb477f80b:
             if (p1.equals("opacity")) {
                i = 11;
             }
             break;
           case 0xb6cd31e2:
             if (p1.equals("borderTopLeftRadius")) {
                i = 12;
             }
             break;
           case 0xb8ceaaa3:
             if (p1.equals("bottomRightRadius")) {
                i = 13;
             }
             break;
           case 0xc84d9cb4:
             if (p1.equals("resize")) {
                i = 14;
             }
             break;
           case 0xca247920:
             if (p1.equals("shadow")) {
                i = 15;
             }
             break;
           case 0xd4677478:
             if (p1.equals("zIndex")) {
                i = 16;
             }
             break;
           case 0xf18f28d0:
             if (p1.equals("borderLeftColor")) {
                i = 17;
             }
             break;
           case 0xf273171e:
             if (p1.equals("borderLeftStyle")) {
                i = 18;
             }
             break;
           case 0xf2a62733:
             if (p1.equals("borderLeftWidth")) {
                i = 19;
             }
             break;
           case 0x13dfc885:
             if (p1.equals("borderTopRightRadius")) {
                i = 20;
             }
             break;
           case 0x22a57450:
             if (p1.equals("borderBottomLeftRadius")) {
                i = 21;
             }
             break;
           case 0x230fd3d7:
             if (p1.equals("borderBottomRightRadius")) {
                i = 22;
             }
             break;
           case 0x2b158697:
             if (p1.equals("borderColor")) {
                i = 23;
             }
             break;
           case 0x2bf974e5:
             if (p1.equals("borderStyle")) {
                i = 24;
             }
             break;
           case 0x2c2c84fa:
             if (p1.equals("borderWidth")) {
                i = 25;
             }
             break;
           case 0x2c4a1ecb:
             if (p1.equals("boxShadow")) {
                i = 26;
             }
             break;
           case 0x4cb7f6d5:
             if (p1.equals("backgroundColor")) {
                i = 27;
             }
             break;
           case 0x4d0b70cd:
             if (p1.equals("backgroundImage")) {
                i = 28;
             }
             break;
           case 0x506afbde:
             if (p1.equals("borderRadius")) {
                i = 29;
             }
             break;
           case 0x5515624f:
             if (p1.equals("backgroundSize")) {
                i = 30;
             }
             break;
           case 0x69314539:
             if (p1.equals("topRightRadius")) {
                i = 31;
             }
             break;
           case 0x698a9404:
             if (p1.equals("bottomLeftRadius")) {
                i = 32;
             }
             break;
           case 0x73b66312:
             if (p1.equals("visibility")) {
                i = 33;
             }
             break;
           case 0x7fbf4eae:
             if (p1.equals("topLeftRadius")) {
                i = 34;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             p0.setBorderRightColor(p2);
             break;
           case 1:
             p0.setBorderRightStyle(p2);
             break;
           case 2:
             p0.setBorderRightWidth(a.k(p2));
             break;
           case 3:
             p0.setBorderTopColor(p2);
             break;
           case 4:
             p0.setBorderTopStyle(p2);
             break;
           case 5:
             p0.setBorderTopWidth(a.k(p2));
             break;
           case 6:
             p0.setGradientBgColor(p2);
             break;
           case 7:
             p0.setBackground(p2);
             break;
           case 8:
             p0.setBorderBottomColor(p2);
             break;
           case 9:
             p0.setBorderBottomStyle(p2);
             break;
           case 10:
             p0.setBorderBottomWidth(a.k(p2));
             break;
           case 11:
             p0.setOpacity(a.k(p2));
             break;
           case 12:
             p0.setBorderTopLeftRadius(a.m(p2));
             break;
           case 13:
             p0.setBottomRightRadius(a.m(p2));
             break;
           case 14:
             p0.setContentMode(p2);
             break;
           case 15:
             p0.setShadow(p2);
             break;
           case 16:
             p0.setZIndex(a.l(p2));
             break;
           case 17:
             p0.setBorderLeftColor(p2);
             break;
           case 18:
             p0.setBorderLeftStyle(p2);
             break;
           case 19:
             p0.setBorderLeftWidth(a.k(p2));
             break;
           case 20:
             p0.setBorderTopRightRadius(a.m(p2));
             break;
           case 21:
             p0.setBorderBottomLeftRadius(a.m(p2));
             break;
           case 22:
             p0.setBorderBottomRightRadius(a.m(p2));
             break;
           case 23:
             p0.setBorderColor(p2);
             break;
           case 24:
             p0.setBorderStyle(p2);
             break;
           case 25:
             p0.setBorderWidth(a.k(p2));
             break;
           case 26:
             p0.setBoxShadow(p2);
             break;
           case 27:
             p0.setBackgroundColor(p2);
             break;
           case 28:
             p0.setBackgroundImage(p2);
             break;
           case 29:
             p0.setBorderRadius(a.m(p2));
             break;
           case 30:
             p0.setBackgroundSize(p2);
             break;
           case 31:
             p0.setTopRightRadius(a.m(p2));
             break;
           case 32:
             p0.setBottomLeftRadius(a.m(p2));
             break;
           case '!':
             p0.setVisibility(p2);
             break;
           case '"':
             p0.setTopLeftRadius(a.m(p2));
             break;
           default:
             r.a();
       }
       return;
    }
    public int h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case 0x901b6914:
             if (p0.equals("setVisibility")) {
                i = 0;
             }
             break;
           case 0x93e43fb1:
             if (p0.equals("setPlaceholder")) {
                i = 1;
             }
             break;
           case 0x9ec483ef:
             if (p0.equals("setCDNUrls")) {
                i = 2;
             }
             break;
           case 0xa1af6404:
             if (p0.equals("setImageLoadCallback")) {
                i = 3;
             }
             break;
           case 0xa37bdc05:
             if (p0.equals("pauseAnimations")) {
                i = 4;
             }
             break;
           case 0xa6f0dd90:
             if (p0.equals("setUriWith")) {
                i = 5;
             }
             break;
           case 0xb5c23ecc:
             if (p0.equals("setTranslateX")) {
                i = 6;
             }
             break;
           case 0xb5c23ecd:
             if (p0.equals("setTranslateY")) {
                i = 7;
             }
             break;
           case 0xbd9b1578:
             if (p0.equals("setUriWithTintColor")) {
                i = 8;
             }
             break;
           case 0xbddafb2a:
             if (p0.equals("layout")) {
                i = 9;
             }
             break;
           case 0xc0879760:
             if (p0.equals("removeAnimation")) {
                i = 10;
             }
             break;
           case 0xc74465db:
             if (p0.equals("setBlurRadius")) {
                i = 11;
             }
             break;
           case 0xc987ac0c:
             if (p0.equals("setGradientBgColor")) {
                i = 12;
             }
             break;
           case 0xca029622:
             if (p0.equals("setSrc")) {
                i = 13;
             }
             break;
           case 0xca029daa:
             if (p0.equals("setUri")) {
                i = 14;
             }
             break;
           case 0xdab2e64d:
             if (p0.equals("addEventListener")) {
                i = 15;
             }
             break;
           case 0xdfb98f4a:
             if (p0.equals("removeEventListener")) {
                i = 16;
             }
             break;
           case 0xed71657c:
             if (p0.equals("resumeAnimations")) {
                i = 17;
             }
             break;
           case 0xfb854877:
             if (p0.equals("getSize")) {
                i = 18;
             }
             break;
           case 0xfd57451d:
             if (p0.equals("startViewAnimation")) {
                i = 19;
             }
             break;
           case 0x3bf579b:
             if (p0.equals("setRotateX")) {
                i = 20;
             }
             break;
           case 0x3bf579c:
             if (p0.equals("setRotateY")) {
                i = 21;
             }
             break;
           case 0xc307d76:
             if (p0.equals("getLocationOnScreen")) {
                i = 22;
             }
             break;
           case 0x20d5ad87:
             if (p0.equals("removeAllAnimation")) {
                i = 23;
             }
             break;
           case 0x2127345d:
             if (p0.equals("setRotate")) {
                i = 24;
             }
             break;
           case 0x222a7750:
             if (p0.equals("setScaleX")) {
                i = 25;
             }
             break;
           case 0x222a7751:
             if (p0.equals("setScaleY")) {
                i = 26;
             }
             break;
           case 0x24aa1a5d:
             if (p0.equals("setUsedWithCanvas")) {
                i = 27;
             }
             break;
           case 0x28f8d21c:
             if (p0.equals("getOrigin")) {
                i = 28;
             }
             break;
           case 0x3a72e7e3:
             if (p0.equals("addAnimation")) {
                i = 29;
             }
             break;
           case 0x417a59f0:
             if (p0.equals("removeSelf")) {
                i = 30;
             }
             break;
           case 0x43560093:
             if (p0.equals("setImageUri")) {
                i = 31;
             }
             break;
           case 0x5192afe6:
             if (p0.equals("invokeNativeFunctionWithJSONString")) {
                i = 32;
             }
             break;
           case 0x5934e9b5:
             if (p0.equals("_setVNode")) {
                i = 33;
             }
             break;
           case 0x67f06213:
             if (p0.equals("setBackgroundColor")) {
                i = 34;
             }
             break;
           case 0x6c852a39:
             if (p0.equals("observeNextLayout")) {
                i = 35;
             }
             break;
           case 0x75a6ebdd:
             if (p0.equals("setImageIconName")) {
                i = 36;
             }
             break;
           case 0x76511866:
             if (p0.equals("setUrls")) {
                i = 37;
             }
             break;
           default:
       }
       switch (i){
           case 0:
           case 2:
           case 3:
           case 4:
           case 5:
           case 6:
           case 7:
           case 8:
           case 9:
           case 10:
           case 11:
           case 12:
           case 13:
           case 14:
           case 15:
           case 16:
           case 17:
           case 19:
           case 20:
           case 21:
           case 23:
           case 24:
           case 25:
           case 26:
           case 27:
           case 29:
           case 30:
           case 31:
           case '!':
           case '"':
           case '#':
           case '$':
           case '%':
           case 1:
             return 1;
           case 18:
           case 28:
           case 32:
           case 22:
             return 2;
           default:
             return 0;
       }
    }
    public String i(){
       return "0";
    }
    public boolean k(Object p0,String p1,Object p2){
       boolean b;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Objects.requireNonNull(p1);
       int i = -1;
       b = false;
       switch (p1.hashCode()){
           case 0xa00f8b41:
             if (p1.equals("enabled")) {
                i = 0;
             }
             break;
           case 0xb02579a4:
             if (p1.equals("onPress")) {
                i = 1;
             }
             break;
           case 0xb73748b8:
             if (p1.equals("disallowParentInterceptTouchEvent")) {
                i = 2;
             }
             break;
           case 0x1bde4:
             if (p1.equals("src")) {
                i = 3;
             }
             break;
           case 0x1c56c:
             if (p1.equals("uri")) {
                i = 4;
             }
             break;
           case 0x4f8d808:
             if (p1.equals("onLongPress")) {
                i = 5;
             }
             break;
           case 0x68b1db1:
             if (p1.equals("style")) {
                i = 6;
             }
             break;
           case 0x4c5ef26e:
             if (p1.equals("pivotPoint")) {
                i = 7;
             }
             break;
           case 0x639e22e8:
             if (p1.equals("disable")) {
                i = 8;
             }
             break;
           case 0x79eeaf72:
             if (p1.equals("nativeID")) {
                i = 9;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             p0.setEnabled(p2.booleanValue());
          label_00f9 :
             b = true;
             break;
           case 1:
             p0.setOnPressListener(V8ObjectUtilsQuick.getValue(p2));
             goto label_00f9 ;
             break;
           case 2:
             p0.setDisallowParentInterceptTouchEvent(p2.booleanValue());
             goto label_00f9 ;
             break;
           case 3:
             p0.setSrc(p2);
             goto label_00f9 ;
             break;
           case 4:
             p0.setUri(p2);
             goto label_00f9 ;
             break;
           case 5:
             p0.setOnLongPressListener(V8ObjectUtilsQuick.getValue(p2));
             goto label_00f9 ;
             break;
           case 6:
             p0.setStyle(V8ObjectUtilsQuick.getValue(p2));
             goto label_00f9 ;
             break;
           case 7:
             p0.setPivotPoint(V8ObjectUtilsQuick.getValue(p2));
             goto label_00f9 ;
             break;
           case 8:
             p0.setDisable(p2.booleanValue());
             goto label_00f9 ;
             break;
           case 9:
             p0.setViewID(p2);
             goto label_00f9 ;
             break;
           default:
             r.a();
       }
       return b;
    }
    public String l(){
       return "src,pivotPoint,onLongPress,enabled,onPress,nativeID,disallowParentInterceptTouchEvent,style,disable,uri,removeSelf,_setVNode,removeAllAnimation,invokeNativeFunctionWithJSONString,setVisibility,setBlurRadius,setGradientBgColor,startViewAnimation,setTranslateX,resumeAnimations,getOrigin,addAnimation,getSize,setCDNUrls,setTranslateY,observeNextLayout,setImageUri,setRotate,setUrls,setUsedWithCanvas,setBackgroundColor,setImageLoadCallback,layout,removeAnimation,setUriWithTintColor,addEventListener,setPlaceholder,setRotateY,setScaleY,getLocationOnScreen,setImageIconName,setUri,removeEventListener,setRotateX,setUriWith,setScaleX,pauseAnimations,setSrc";
    }
}
