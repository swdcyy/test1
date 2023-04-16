package com.kuaishou.ark.rtx.widget.RTXNative;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import android.content.res.Resources;
import cw9.c;
import java.lang.reflect.Field;
import java.lang.Integer;
import java.lang.Float;
import android.util.DisplayMetrics;
import java.lang.Boolean;
import android.telephony.TelephonyManager;
import java.util.Map;
import java.util.HashMap;
import rr.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.WindowManager;
import android.view.Display;
import android.content.res.Configuration;
import com.tkruntime.v8.V8ObjectProxy;
import com.kuaishou.ark.rtx.widget.RTXNative$a;
import com.tachikoma.core.bridge.c;
import com.tkruntime.v8.V8;
import com.tkruntime.v8.V8Object;
import com.tkruntime.v8.V8Value;
import java.lang.System;
import com.kuaishou.ark.rtx.widget.RTXNative$b;
import com.tachikoma.core.bridge.d;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Function;
import java.lang.Throwable;
import wp8.a;
import tx4.y;

public class RTXNative extends TKBaseNativeModule	// class@000f97
{
    public String appKpn;
    public String appVersion;
    public RTXNative$b f;
    public V8ObjectProxy g;
    public JsValueRef h;
    public static Boolean sIsPad;
    public static int sStatusBarHeight;

    public void RTXNative(f p0){
       super(p0);
       this.appKpn = "";
       this.appVersion = "";
    }
    public static int getStatusBarHeight(Context p0){
       int i;
       int i1;
       RTXNative rTXNative = RTXNative.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, rTXNative, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       String str = "status_bar_height";
       int identifier = p0.getResources().getIdentifier(str, "dimen", "android");
       if (identifier > 0) {
          i = c.b(p0.getResources(), identifier);
       }else {
          Class uClass = Class.forName("com.android.internal.R$dimen");
          Object obj2 = uClass.newInstance();
          Field field = uClass.getField(str);
          field.setAccessible(true);
          i = c.b(p0.getResources(), Integer.parseInt(field.get(obj2).toString()));
       }
       if (i <= 0) {
          float f = 25.00f;
          if (PatchProxy.isSupport(rTXNative)) {
             Object obj1 = PatchProxy.applyTwoRefs(p0, Float.valueOf(f), null, rTXNative, "8");
             if (obj1 != PatchProxyResult.class) {
                i1 = obj1.intValue();
             label_0083 :
                i = i1;
             }
          }
          i1 = (int)((f * c.c(p0.getResources()).density) + 0x3f000000);
          goto label_0083 ;
       }
       return i;
    }
    public static boolean isPad(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RTXNative.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!p0.getSystemService("phone").getPhoneType())? true: false;
       return b;
    }
    public Map dimension(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Context obj = PatchProxy.applyOneRefs(p0, this, RTXNative.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.getContext();
       HashMap hashMap = new HashMap();
       Object obj1 = PatchProxy.applyThreeRefs(p0, obj, hashMap, null, a.class, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = null;
          if (!TextUtils.isEmpty(p0) && obj != null) {
             DisplayMetrics uDisplayMetr = c.c(obj.getResources());
             if (!PatchProxy.applyVoidOneRefs(obj, obj1, a.class, "2")) {
                DisplayMetrics uDisplayMetr1 = new DisplayMetrics();
                a.a = uDisplayMetr1;
                uDisplayMetr1.setTo(c.c(obj.getResources()));
                c.d(obj.getSystemService("window").getDefaultDisplay(), a.a);
             }
             Configuration fontScale = obj.getResources().getConfiguration().fontScale;
             if (p0.equals("window")) {
                obj1 = a.a(uDisplayMetr, (double)fontScale, hashMap);
             }else {
                obj1 = a.a(a.a, (double)fontScale, hashMap);
             }
          }
       }
       return obj1;
    }
    public V8ObjectProxy getRTXEnv(){
       Object obj = PatchProxy.apply(null, this, RTXNative.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.g == null) {
          this.g = new RTXNative$a(this, this.getJSContext().g(), "RTXNative-rtxEnv");
          if (this.getJsObj() != null) {
             this.getJsObj().add("rtxEnv", this.g);
          }
       }
       return this.g;
    }
    public void notifyLayout(){
       if (PatchProxy.applyVoid(null, this, RTXNative.class, "2")) {
          return;
       }
       RTXNative tf = this.f;
       if (tf != null) {
          tf.b(System.currentTimeMillis());
       }
       return;
    }
    public void registerAppInfo(String p0,String p1){
       this.appKpn = p0;
       this.appVersion = p1;
    }
    public void registerInterface(RTXNative$b p0){
       this.f = p0;
    }
    public void render(V8Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXNative.class, "3")) {
          return;
       }
       this.getTKJSContext().k(p0);
       RTXNative tf = this.f;
       if (tf != null) {
          tf.a();
       }
       return;
    }
    public void runApplication(String p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RTXNative.class, "6")) {
          return;
       }
       RTXNative th = this.h;
       if (th != null && (th.get() != null && (!this.isDestroy() && p1 != null))) {
          Object[] objArray = new Object[]{p0,p1};
          this.h.get().call(null, objArray);
       }
    label_0038 :
       return;
    }
    public void setRunApplication(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXNative.class, "4")) {
          return;
       }
       if (this.h != null) {
          return;
       }
       this.h = y.b(p0, this);
       return;
    }
}
