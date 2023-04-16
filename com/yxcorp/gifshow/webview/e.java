package com.yxcorp.gifshow.webview.e;
import java.util.HashMap;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.j0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.yoda.model.LaunchModel$a;
import com.yxcorp.gifshow.webview.c;
import com.kwai.yoda.model.LaunchModel;
import com.kwai.yoda.Yoda;
import uv8.g1;
import q87.c;
import com.kwai.yoda.cache.YodaXCache;
import com.yxcorp.gifshow.webview.e$a;
import sx7.i;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import com.kwai.robust.PatchProxyResult;
import android.content.ComponentName;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import txc.m;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.lang.reflect.Type;
import java.util.List;
import com.yxcorp.gifshow.util.YodaSwitchHelper$Switch;
import el.a;
import com.kwai.sdk.switchconfig.a;
import java.util.Collections;
import txc.o;
import io7.a;
import android.app.Activity;
import java.lang.Boolean;

public class e	// class@001753
{
    public static final Map a;
    public static Map b;

    static {
       e.a = new HashMap();
    }
    public void e(){
       super();
    }
    public static void a(Intent p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, e.class, "7")) {
          return;
       }
       if (j0.g(p0, "model")) {
          return;
       }
       String str = j0.f(p0, "KEY_URL");
       String str1 = j0.f(p0, "KEY_BIZ_ID");
       if (TextUtils.x(str)) {
          return;
       }
       LaunchModel$a uoa = c.c(str, str1);
       c.f(uoa, p0);
       LaunchModel launchModel = uoa.a();
       if (Yoda.get().hasInit()) {
          Object[] objArray = new Object[0];
          g1.C().w("YodaXCache", "appendYodaParams: prepareWebResourceResponse", objArray);
          YodaXCache.n.t(launchModel, new e$a());
       }
       SerializableHook.putExtra(p0, "model", c.a(launchModel, p0, str));
       return;
    }
    public static Intent b(Context p0,Intent p1){
       KwaiWebViewActivity kwaiWebViewA = KwaiWebViewActivity.class;
       Object obj = null;
       String obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, e.class, "6");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = j0.f(p1, "KEY_URL");
       ComponentName component = p1.getComponent();
       if (component == null) {
          return p1;
       }
       try{
          Class uClass = Class.forName(component.getClassName());
          if (kwaiWebViewA.equals(uClass)) {
             p1.setClass(p0, KwaiYodaWebViewActivity.class);
          }else if(kwaiWebViewA.isAssignableFrom(uClass)){
             m obj2 = PatchProxy.applyOneRefs(uClass, obj, e.class, "8");
             if (obj2 != PatchProxyResult.class) {
                obj = obj2;
             }else {
                obj2 = uClass.getAnnotation(m.class);
                if (obj2 != null) {
                   obj = obj2.target();
                }
             }
             if (obj != null) {
                p1.setClass(p0, obj);
             }else {
                return p1;
             }
          }
          e.a(p1, obj1);
          return p1;
       }catch(java.lang.ClassNotFoundException e0){
       }
    }
    public static Map c(String p0){
       Type[] typeArray1;
       Map obj = PatchProxy.applyOneRefs(p0, null, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e.a;
       Map map = obj.get(p0);
       if (map == null) {
          Type[] typeArray = new Type[]{String.class,a.getParameterized(List.class, typeArray1).getType()};
          typeArray1 = new Type[]{YodaSwitchHelper$Switch.class};
          Type type = a.getParameterized(Map.class, typeArray).getType();
          Map value = a.t().getValue(p0, type, Collections.emptyMap());
          obj.put(p0, value);
          a.t().p(p0, new o(type));
          map = value;
       }
       return map;
    }
    public static void d(Activity p0,Intent p1){
       e uoe = e.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, uoe, "9")) {
          return;
       }
       if (!PatchProxy.isSupport(uoe) || (!PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.FALSE, null, e.class, "10") && p0 != null)) {
          e.b(p0, p1);
       }
       c.i(p0, p1);
       return;
    }
}
