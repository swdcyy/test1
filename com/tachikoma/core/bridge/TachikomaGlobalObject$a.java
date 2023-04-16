package com.tachikoma.core.bridge.TachikomaGlobalObject$a;
import com.tkruntime.v8.V8ObjectProxy;
import com.tachikoma.core.bridge.TachikomaGlobalObject;
import com.tkruntime.v8.V8;
import java.lang.String;
import java.lang.Object;
import iq8.n;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Objects;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.util.Map;
import com.tachikoma.core.bridge.CustomEnv;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.utils.V8ObjectUtilsQuick;
import java.lang.Integer;
import com.tkruntime.v8.V8Object;
import java.lang.Double;
import iq8.r;
import no8.e;
import android.os.Build$VERSION;
import java.lang.Float;
import android.content.Context;
import iq8.q;
import android.util.DisplayMetrics;
import java.lang.Number;
import android.app.Activity;
import android.view.WindowManager;
import android.view.Display;
import oo8.t;

public class TachikomaGlobalObject$a extends V8ObjectProxy	// class@000d38
{
    public final TachikomaGlobalObject b;

    public void TachikomaGlobalObject$a(TachikomaGlobalObject p0,V8 p1,String p2){
       this.b = p0;
       super(p1, p2);
    }
    public Object onPropCall(boolean p0,String p1,Object p2){
       Context context;
       DisplayMetrics uDisplayMetr;
       d obj1;
       n on = n.class;
       if (PatchProxy.isSupport(TachikomaGlobalObject$a.class)) {
          p2 = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), p1, p2, this, TachikomaGlobalObject$a.class, "1");
          if (p2 != PatchProxyResult.class) {
             return p2;
          }
       }
       if (TextUtils.isEmpty(p1) || !p0) {
          return V8ObjectProxy.PROP_SET_IGNORE;
       }else {
          Objects.requireNonNull(p1);
          int i = -1;
          switch (p1.hashCode()){
              case 0x851e087d:
                if (p1.equals("availableWidth")) {
                   i = 0;
                }
                break;
              case 0xa393a510:
                if (p1.equals("deviceWidth")) {
                   i = 1;
                }
                break;
              case 0xa714ac1a:
                if (p1.equals("productName")) {
                   i = 2;
                }
                break;
              case 0xab960c36:
                if (p1.equals("engineVersion")) {
                   i = 3;
                }
                break;
              case 0xb512031d:
                if (p1.equals("deviceHeight")) {
                   i = 4;
                }
                break;
              case 0xd0aa704c:
                if (p1.equals("appName")) {
                   i = 5;
                }
                break;
              case 0xd27f48:
                if (p1.equals("statusBarHeight")) {
                   i = 6;
                }
                break;
              case 0x4d40d50:
                if (p1.equals("availableHeight")) {
                   i = 7;
                }
                break;
              case 0x683094a:
                if (p1.equals("scale")) {
                   i = 8;
                }
                break;
              case 0x1fe2c2a6:
                if (p1.equals("appDetailVersion")) {
                   i = 9;
                }
                break;
              case 0x25c247aa:
                if (p1.equals("targetFontScale")) {
                   i = 10;
                }
                break;
              case 0x5875c377:
                if (p1.equals("appVersion")) {
                   i = 11;
                }
                break;
              case 0x6c00fe54:
                if (p1.equals("osVersion")) {
                   i = 12;
                }
                break;
              case 0x6fbd6873:
                if (p1.equals("platform")) {
                   i = 13;
                }
                break;
              case 0x7a994349:
                if (p1.equals("isDebug")) {
                   i = 14;
                }
                break;
              default:
          }
       label_00ef :
          p2 = "2";
          String str = "Android";
          Object obj = null;
          switch (i){
              case 0:
              case 1:
                context = this.b.getContext();
                p1 = PatchProxy.applyOneRefs(context, obj, on, p2);
                if (p1 != PatchProxyResult.class) {
                   i = p1.intValue();
                }else if(!context instanceof Activity){
                   i = n.f(n.c().widthPixels);
                }else {
                   uDisplayMetr = new DisplayMetrics();
                   context.getWindowManager().getDefaultDisplay().getMetrics(uDisplayMetr);
                   i = n.f(uDisplayMetr.widthPixels);
                }
                str = Integer.valueOf(i);
                break;
              case 2:
                str = e.b().a().e();
                if (!TextUtils.isEmpty(str)) {
                   this.add(p1, str);
                }
                break;
              case 3:
                str = "0.9.26";
                this.add(p1, str);
                break;
              case 4:
              case 7:
                context = this.b.getContext();
                p1 = PatchProxy.applyOneRefs(context, obj, on, "3");
                if (p1 != PatchProxyResult.class) {
                   i = p1.intValue();
                }else if(!context instanceof Activity){
                   i = n.f(n.c().heightPixels);
                }else {
                   uDisplayMetr = new DisplayMetrics();
                   context.getWindowManager().getDefaultDisplay().getMetrics(uDisplayMetr);
                   i = n.f(uDisplayMetr.heightPixels);
                }
                str = Integer.valueOf(i);
                break;
              case 5:
                if (TachikomaGlobalObject.sAppName == null) {
                   TachikomaGlobalObject.sAppName = TachikomaGlobalObject.getApplicationName(q.a());
                }
                str = TachikomaGlobalObject.sAppName;
                this.add(p1, str);
                break;
              case 6:
                i = n.f(n.d());
                str = Integer.valueOf(i);
                this.add(p1, i);
                break;
              case 8:
                DisplayMetrics density = n.c().density;
                str = Float.valueOf(density);
                this.add(p1, (double)density);
                break;
              case 9:
              case 11:
                if (TachikomaGlobalObject.sAppVersion == null) {
                   TachikomaGlobalObject.sAppVersion = TachikomaGlobalObject.getApplicationVersion(q.a());
                }
                str = TachikomaGlobalObject.sAppVersion;
                this.add(p1, str);
                break;
              case 10:
                str = Float.valueOf(TachikomaGlobalObject.getAppFontScale());
                break;
              case 12:
                str = Build$VERSION.RELEASE;
                this.add(p1, str);
                break;
              case 13:
                this.add(p1, str);
                break;
              case 14:
                obj1 = PatchProxy.apply(obj, obj, r.class, p2);
                if (obj1 != PatchProxyResult.class) {
                   obj1 = obj1.booleanValue();
                }else if(e.b().e()){
                   obj1 = e.b().f();
                }else {
                   i = 1;
                }
                str = Boolean.valueOf((obj1 ^ 1));
                this.add(p1, str.booleanValue());
                break;
              default:
                obj1 = this.b.getTKJSContext().k;
                if (obj1 != null) {
                   CustomEnv uCustomEnv = obj1.get(p1);
                   if (uCustomEnv != null) {
                      obj = V8ObjectUtilsQuick.toReturnObjectForV8(this.v8, uCustomEnv.value);
                      if (uCustomEnv.isMutable == null) {
                         if (obj instanceof Integer) {
                            this.add(p1, obj.intValue());
                         }else if(obj instanceof Boolean){
                            this.add(p1, obj.booleanValue());
                         }else if(obj instanceof Double){
                            this.add(p1, obj.doubleValue());
                         }else if(obj instanceof String){
                            this.add(p1, obj);
                         }else if(obj instanceof V8Value){
                            this.add(p1, obj);
                         }
                      }
                   }
                }
                return obj;
          }
          return V8ObjectUtilsQuick.toReturnObjectForV8(this.v8, str);
       }
    }
}
