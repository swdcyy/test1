package com.facebook.react.uimanager.BaseViewManager;
import ze.b;
import com.facebook.react.uimanager.ViewManager;
import java.lang.Math;
import com.facebook.react.uimanager.b$a;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Object;
import java.util.Map;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ze.p;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import com.facebook.react.bridge.ReadableArray;
import ze.p0;
import java.lang.Boolean;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import java.lang.CharSequence;
import android.view.ViewTreeObserver;
import com.facebook.react.uimanager.BaseViewManager$b;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.facebook.react.uimanager.b;
import android.util.DisplayMetrics;
import ze.c;
import vd.d$b;
import vd.d;
import cb.a;
import a2.i0;
import com.facebook.react.uimanager.ReactAccessibilityDelegate$AccessibilityRole;
import hf.a;
import java.util.Iterator;
import java.util.List;
import hf.a$b;
import java.util.Set;
import java.util.Map$Entry;
import hf.a$a;
import android.graphics.Paint;
import yd.e;
import com.facebook.react.uimanager.BaseViewManager$a;
import a2.a;
import com.facebook.react.uimanager.ViewGroupManager;
import android.view.ViewParent;
import ze.b0;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import java.util.ArrayList;
import com.facebook.react.bridge.Dynamic;
import android.content.Context;
import java.lang.Iterable;
import android.text.TextUtils;

public abstract class BaseViewManager extends ViewManager implements b	// class@001314
{
    public static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    public static b$a sMatrixDecompositionContext;
    public static final Map sStateDescription;
    public static double[] sTransformDecompositionArray;

    static {
       BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = (float)Math.sqrt(5.00f);
       BaseViewManager.sMatrixDecompositionContext = new b$a();
       double[] uodoubleArra = new double[16];
       BaseViewManager.sTransformDecompositionArray = uodoubleArra;
       HashMap hashMap = new HashMap();
       BaseViewManager.sStateDescription = hashMap;
       hashMap.put("busy", Integer.valueOf(R.string.arg_RES_7f104a95));
       hashMap.put("expanded", Integer.valueOf(R.string.arg_RES_7f104a97));
       hashMap.put("collapsed", Integer.valueOf(R.string.arg_RES_7f104a96));
    }
    public void BaseViewManager(){
       super();
    }
    public static void resetTransformProperty(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, BaseViewManager.class, "21")) {
          return;
       }
       p0.setTranslationX(p.c(0));
       p0.setTranslationY(p.c(0));
       p0.setRotation(0);
       p0.setRotationX(0);
       p0.setRotationY(0);
       p0.setScaleX(0x3f800000);
       p0.setScaleY(0x3f800000);
       p0.setCameraDistance(0);
       return;
    }
    public static float sanitizeFloatPropertyValue(float p0){
       BaseViewManager uBaseViewMan = BaseViewManager.class;
       if (PatchProxy.isSupport(uBaseViewMan)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), null, uBaseViewMan, "20");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       float f = Float.MAX_VALUE;
       float f1 = -340282346638528860000000000000000000000.00f;
       if (p0 - f1 >= 0 && p0 - f <= 0) {
          return p0;
       }else if(p0 - f1 < 0 || !p0 - 0xff800000){
          return f1;
       }else if(p0 - f > 0 || !p0 - Float.POSITIVE_INFINITY){
          return f;
       }else if(Float.isNaN(p0)){
          return 0;
       }else {
          throw new IllegalStateException("Invalid float property value: "+p0);
       }
    }
    public static void setTransformProperty(View p0,ReadableArray p1){
       int b;
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, BaseViewManager.class, "19")) {
          return;
       }
       BaseViewManager.sMatrixDecompositionContext.reset();
       Object obj1 = PatchProxy.applyOneRefs(p1, obj, p0.class, "2");
       BaseViewManager$b uob = 1;
       int i = 0;
       if (obj1 != PatchProxyResult.class) {
          b = obj1.booleanValue();
       }else {
          b = p1.size();
          int i1 = 0;
          while (true) {
             if (i1 < b) {
                ReadableMap map = p1.getMap(i1);
                String str = map.keySetIterator().nextKey();
                if (("translate").equals(str)) {
                   ReadableArray array = map.getArray(str);
                   if (array == null) {
                   label_00aa :
                      b = false;
                      break ;
                   }else {
                      ReadableType str1 = ReadableType.String;
                      if (array.getType(i) != str1 || ((array.getString(i)).contains("%") || (array.getType(uob) == str1 && (array.getString(uob)).contains("%")))) {
                      label_008a :
                         b = true;
                         break ;
                      }
                   }
                }else if(("translateX").equals(str)){
                   if (map.getType(str) == ReadableType.String && (map.getString(str)).contains("%")) {
                      goto label_008a ;
                   }
                }else if(("translateY").equals(str) && (map.getType(str) == ReadableType.String && (map.getString(str)).contains("%"))){
                   goto label_008a ;
                }
                i1 = i1 + 1;
             }else {
                goto label_00aa ;
             }
          }
       }
       if (b) {
          p0.getViewTreeObserver().addOnPreDrawListener(new BaseViewManager$b(p0, p1));
       }else {
          p0.b(p0.getWidth(), p0.getHeight(), p1, BaseViewManager.sTransformDecompositionArray);
          b.k(BaseViewManager.sTransformDecompositionArray, BaseViewManager.sMatrixDecompositionContext);
          p0.setTranslationX(p.c(BaseViewManager.sanitizeFloatPropertyValue((float)BaseViewManager.sMatrixDecompositionContext.translation[i])));
          p0.setTranslationY(p.c(BaseViewManager.sanitizeFloatPropertyValue((float)BaseViewManager.sMatrixDecompositionContext.translation[uob])));
          p0.setRotation(BaseViewManager.sanitizeFloatPropertyValue((float)BaseViewManager.sMatrixDecompositionContext.rotationDegrees[2]));
          p0.setRotationX(BaseViewManager.sanitizeFloatPropertyValue((float)BaseViewManager.sMatrixDecompositionContext.rotationDegrees[i]));
          p0.setRotationY(BaseViewManager.sanitizeFloatPropertyValue((float)BaseViewManager.sMatrixDecompositionContext.rotationDegrees[uob]));
          p0.setScaleX(BaseViewManager.sanitizeFloatPropertyValue((float)BaseViewManager.sMatrixDecompositionContext.scale[i]));
          p0.setScaleY(BaseViewManager.sanitizeFloatPropertyValue((float)BaseViewManager.sMatrixDecompositionContext.scale[uob]));
       }
       b$a perspective = BaseViewManager.sMatrixDecompositionContext.perspective;
       if (perspective.length > 2) {
          float f = (float)perspective[2];
          if (!f) {
             f = 0.00f;
          }
          p0.setCameraDistance(BaseViewManager.sanitizeFloatPropertyValue((((c.d().density * c.d().density) * (0xbf800000 / f)) * BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER)));
       }
       return;
    }
    public Map getExportedCustomDirectEventTypeConstants(){
       d$b obj = PatchProxy.apply(null, this, BaseViewManager.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.a();
       obj.b("topAccessibilityAction", d.d("registrationName", "onAccessibilityAction"));
       return obj.a();
    }
    public final void logUnsupportedPropertyWarning(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseViewManager.class, "30")) {
          return;
       }
       Object[] objArray = new Object[]{this.getName(),p0};
       a.z("ReactNative", "%s doesn\'t support property \'%s\'", objArray);
       return;
    }
    public void onAfterUpdateTransaction(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseViewManager.class, "23")) {
          return;
       }
       super.onAfterUpdateTransaction(p0);
       this.updateViewAccessibility(p0);
       return;
    }
    public void setAccessibilityActions(View p0,ReadableArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseViewManager.class, "15")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       p0.setTag(R.id.accessibility_actions, p1);
       return;
    }
    public void setAccessibilityHint(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseViewManager.class, "11")) {
          return;
       }
       p0.setTag(R.id.accessibility_hint, p1);
       this.updateViewContentDescription(p0);
       return;
    }
    public void setAccessibilityLabel(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseViewManager.class, "10")) {
          return;
       }
       p0.setTag(R.id.accessibility_label, p1);
       this.updateViewContentDescription(p0);
       return;
    }
    public void setAccessibilityLiveRegion(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseViewManager.class, "18")) {
          return;
       }
       if (p1 == null || p1.equals("none")) {
          i0.t0(p0, 0);
       }else if(p1.equals("polite")){
          i0.t0(p0, 1);
       }else if(p1.equals("assertive")){
          i0.t0(p0, 2);
       }
       return;
    }
    public void setAccessibilityRole(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseViewManager.class, "12")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       p0.setTag(R.id.accessibility_role, ReactAccessibilityDelegate$AccessibilityRole.fromValue(p1));
       return;
    }
    public void setAccessibilityValue(View p0,ReadableMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseViewManager.class, "16")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       p0.setTag(R.id.accessibility_value, p1);
       if (p1.hasKey("text")) {
          this.updateViewContentDescription(p0);
       }
       return;
    }
    public void setBackgroundColor(View p0,int p1){
       BaseViewManager uBaseViewMan = BaseViewManager.class;
       if (PatchProxy.isSupport(uBaseViewMan) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uBaseViewMan, "1")) {
          return;
       }
       p0.setBackgroundColor(p1);
       return;
    }
    public void setBorderBottomLeftRadius(View p0,float p1){
       if (PatchProxy.isSupport(BaseViewManager.class) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, BaseViewManager.class, "26")) {
          return;
       }
       this.logUnsupportedPropertyWarning("borderBottomLeftRadius");
       return;
    }
    public void setBorderBottomRightRadius(View p0,float p1){
       if (PatchProxy.isSupport(BaseViewManager.class) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, BaseViewManager.class, "27")) {
          return;
       }
       this.logUnsupportedPropertyWarning("borderBottomRightRadius");
       return;
    }
    public void setBorderRadius(View p0,float p1){
       if (PatchProxy.isSupport(BaseViewManager.class) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, BaseViewManager.class, "25")) {
          return;
       }
       this.logUnsupportedPropertyWarning("borderRadius");
       return;
    }
    public void setBorderTopLeftRadius(View p0,float p1){
       if (PatchProxy.isSupport(BaseViewManager.class) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, BaseViewManager.class, "28")) {
          return;
       }
       this.logUnsupportedPropertyWarning("borderTopLeftRadius");
       return;
    }
    public void setBorderTopRightRadius(View p0,float p1){
       if (PatchProxy.isSupport(BaseViewManager.class) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, BaseViewManager.class, "29")) {
          return;
       }
       this.logUnsupportedPropertyWarning("borderTopRightRadius");
       return;
    }
    public void setElevation(View p0,float p1){
       BaseViewManager uBaseViewMan = BaseViewManager.class;
       if (PatchProxy.isSupport(uBaseViewMan) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uBaseViewMan, "5")) {
          return;
       }
       i0.A0(p0, p.c(p1));
       return;
    }
    public void setImportantForAccessibility(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseViewManager.class, "17")) {
          return;
       }
       if (p1 == null || p1.equals("auto")) {
          i0.D0(p0, 0);
       }else if(p1.equals("yes")){
          i0.D0(p0, 1);
       }else if(p1.equals("no")){
          i0.D0(p0, 2);
       }else if(p1.equals("no-hide-descendants")){
          i0.D0(p0, 4);
       }
       return;
    }
    public void setNativeId(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseViewManager.class, "9")) {
          return;
       }
       p0.setTag(R.id.view_tag_native_id, p1);
       if (!PatchProxy.applyVoidOneRefs(p0, null, a.class, "7")) {
          p1 = a.b(p0);
          if (p1 != null) {
             Iterator iterator = a.a.iterator();
             while (iterator.hasNext()) {
                a$b uob = iterator.next();
                if (p1.equals(uob.a())) {
                   uob.b(p0);
                   iterator.remove();
                }
             }
             iterator = a.b.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                Set value = uEntry.getValue();
                if (value != null && value.contains(p1)) {
                   uEntry.getKey().a(p0, p1);
                }
             }
          }
       }
       return;
    }
    public void setOpacity(View p0,float p1){
       BaseViewManager uBaseViewMan = BaseViewManager.class;
       if (PatchProxy.isSupport(uBaseViewMan) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uBaseViewMan, "4")) {
          return;
       }
       p0.setAlpha(p1);
       return;
    }
    public void setRenderToHardwareTexture(View p0,boolean p1){
       BaseViewManager uBaseViewMan = BaseViewManager.class;
       if (PatchProxy.isSupport(uBaseViewMan) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uBaseViewMan, "7")) {
          return;
       }
       int i = (p1)? 2: 0;
       p0.setLayerType(i, null);
       return;
    }
    public void setRotation(View p0,float p1){
       p0.setRotation(p1);
    }
    public void setScaleX(View p0,float p1){
       p0.setScaleX(p1);
    }
    public void setScaleY(View p0,float p1){
       p0.setScaleY(p1);
    }
    public void setTestId(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseViewManager.class, "8")) {
          return;
       }
       p0.setTag(R.id.react_test_id, p1);
       p0.setTag(p1);
       if (e.V) {
          i0.s0(p0, new BaseViewManager$a(this, p1));
       }
       return;
    }
    public void setTransform(View p0,ReadableArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseViewManager.class, "3")) {
          return;
       }
       if (p1 == null) {
          BaseViewManager.resetTransformProperty(p0);
       }else {
          BaseViewManager.setTransformProperty(p0, p1);
       }
       return;
    }
    public void setTranslateX(View p0,float p1){
       p0.setTranslationX(p.c(p1));
    }
    public void setTranslateY(View p0,float p1){
       p0.setTranslationY(p.c(p1));
    }
    public void setViewState(View p0,ReadableMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseViewManager.class, "13")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       p0.setTag(R.id.accessibility_state, p1);
       p0.setSelected(false);
       p0.setEnabled(true);
       ReadableMapKeySetIterator readableMapK = p1.keySetIterator();
       while (readableMapK.hasNextKey()) {
          String str = readableMapK.nextKey();
          if (!str.equals("busy") && !str.equals("expanded")) {
             String str1 = "checked";
             if (!str.equals(str1) || p1.getType(str1) != ReadableType.String) {
                if (p0.isAccessibilityFocused()) {
                   p0.sendAccessibilityEvent(true);
                }
             }
          }
          this.updateViewContentDescription(p0);
          break ;
       }
       return;
    }
    public void setZIndex(View p0,float p1){
       BaseViewManager uBaseViewMan = BaseViewManager.class;
       if (PatchProxy.isSupport(uBaseViewMan) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uBaseViewMan, "6")) {
          return;
       }
       ViewGroupManager.setViewZIndex(p0, Math.round(p1));
       ViewParent parent = p0.getParent();
       if (parent instanceof b0) {
          parent.updateDrawingOrder();
       }
       return;
    }
    public void updateReuseViewPropsStart(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseViewManager.class, "2")) {
          return;
       }
       p0.setBackgroundColor(0);
       p0.setAlpha(0x3f800000);
       BaseViewManager.resetTransformProperty(p0);
       return;
    }
    public final void updateViewAccessibility(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseViewManager.class, "22")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, ReactAccessibilityDelegate.class, "7") && (!i0.S(p0) && (p0.getTag(0x7f0a0062) == null && (p0.getTag(0x7f0a0063) != null || p0.getTag(0x7f0a003f) != null)))) {
          i0.s0(p0, new ReactAccessibilityDelegate());
       }
    label_0042 :
       return;
    }
    public final void updateViewContentDescription(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseViewManager.class, "14")) {
          return;
       }
       String tag = p0.getTag(R.id.accessibility_label);
       ReadableMap tag1 = p0.getTag(R.id.accessibility_state);
       String tag2 = p0.getTag(R.id.accessibility_hint);
       ArrayList uArrayList = new ArrayList();
       ReadableMap tag3 = p0.getTag(R.id.accessibility_value);
       if (tag != null) {
          uArrayList.add(tag);
       }
       if (tag1 != null) {
          ReadableMapKeySetIterator readableMapK = tag1.keySetIterator();
          while (readableMapK.hasNextKey()) {
             String str = readableMapK.nextKey();
             Dynamic dynamic = tag1.getDynamic(str);
             if (str.equals("checked") && (dynamic.getType() == ReadableType.String && (dynamic.asString()).equals("mixed"))) {
                uArrayList.add(p0.getContext().getString(R.string.arg_RES_7f104a98));
             }else if(str.equals("busy") && (dynamic.getType() == ReadableType.Boolean && dynamic.asBoolean())){
                uArrayList.add(p0.getContext().getString(R.string.arg_RES_7f104a95));
             }else if(str.equals("expanded") && dynamic.getType() == ReadableType.Boolean){
                Context context = p0.getContext();
                int i = (dynamic.asBoolean())? 0x7f104a97: 0x7f104a96;
                uArrayList.add(context.getString(i));
             }
          }
       }
       if (tag3 != null) {
          tag = "text";
          if (tag3.hasKey(tag)) {
             Dynamic dynamic1 = tag3.getDynamic(tag);
             if (dynamic1 != null && dynamic1.getType() == ReadableType.String) {
                uArrayList.add(dynamic1.asString());
             }
          }
       }
       if (tag2 != null) {
          uArrayList.add(tag2);
       }
       if (uArrayList.size() > 0) {
          p0.setContentDescription(TextUtils.join(", ", uArrayList));
       }
       return;
    }
}
