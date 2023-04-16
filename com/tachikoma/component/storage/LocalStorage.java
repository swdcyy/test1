package com.tachikoma.component.storage.LocalStorage;
import gx4.d;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import ln8.a;
import java.lang.Boolean;
import rp8.a;
import com.tachikoma.core.bridge.c;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import no8.a;
import java.util.Map;
import com.tkruntime.v8.JsValueRef;
import com.tachikoma.component.storage.LocalStorage$e;
import java.lang.Runnable;
import iq8.x;
import com.tachikoma.core.bridge.d;
import com.tachikoma.component.storage.LocalStorage$d;
import iq8.o;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.google.gson.Gson;
import ho8.a;
import java.lang.Throwable;
import wp8.a;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.V8Value;
import tx4.y;
import com.tachikoma.component.storage.LocalStorage$b;
import java.lang.StringBuilder;
import ekd.e0;
import android.content.Context;
import java.lang.Integer;
import com.tachikoma.component.storage.LocalStorage$c;
import com.tachikoma.component.storage.LocalStorage$a;

public class LocalStorage extends TKBaseNativeModule implements d	// class@000d2d
{
    public List f;

    public void LocalStorage(f p0){
       super(p0);
       if (a.c.booleanValue()) {
          a uoa = a.g();
          String str = this.getJSContext().h();
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoidThreeRefs(str, "disk", this, uoa, a.class, "3") && a.c.booleanValue()) {
             uoa.c.put(str, this);
          }
       }
       return;
    }
    public void callback(boolean p0,JsValueRef p1,Object p2,Map p3){
       if (PatchProxy.isSupport(LocalStorage.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), p1, p2, p3, this, LocalStorage.class, "7")) {
          return;
       }
       if (this.isDestroy()) {
          return;
       }
       LocalStorage$e uoe = new LocalStorage$e(this, p1, p0, p2, p3);
       x.f(v0);
       return;
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, LocalStorage.class, "5")) {
          return;
       }
       o.a(new LocalStorage$d(this, this.getTKJSContext().e()));
       return;
    }
    public final List d(){
       Object obj = PatchProxy.apply(null, this, LocalStorage.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f == null) {
          this.f = new ArrayList();
       }
       return this.f;
    }
    public Map getAll(){
       SharedPreferences obj = PatchProxy.apply(null, this, LocalStorage.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.c.booleanValue()) {
          obj = this.getPreferences(this.getTKJSContext().e());
          if (obj != null && (obj.getAll() != null && !obj.getAll().isEmpty())) {
             HashMap hashMap = new HashMap();
             Iterator iterator = obj.getAll().keySet().iterator();
             while (iterator.hasNext()) {
                String str = iterator.next();
                String str1 = obj.getString(str, "");
                if (!TextUtils.x(str1)) {
                   Map map = a.a().h(str1, Map.class);
                   if (map != null) {
                      hashMap.put(str, map.get("data"));
                   }
                }
             }
             return hashMap;
          }
       }
       return null;
    }
    public void getItem(String p0,V8Function p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalStorage.class, "2")) {
          return;
       }
       JsValueRef jsValueRef = y.b(p1, this);
       this.d().add(jsValueRef);
       o.a(new LocalStorage$b(this, this.getTKJSContext().e(), p0, jsValueRef));
       return;
    }
    public SharedPreferences getPreferences(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LocalStorage.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return e0.a(e0.b, p0+"_kds_native_storage", 0);
    }
    public void onFailure(boolean p0,JsValueRef p1,String p2){
       if (PatchProxy.isSupport(LocalStorage.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, LocalStorage.class, "6")) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("code", Integer.valueOf(0));
       hashMap.put("message", p2);
       this.callback(p0, p1, null, hashMap);
       return;
    }
    public void onGetSuccess(Object p0,JsValueRef p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LocalStorage.class, "3")) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("code", Integer.valueOf(1));
       hashMap.put("message", "success");
       this.callback(1, p1, p0, hashMap);
       return;
    }
    public void removeItem(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocalStorage.class, "4")) {
          return;
       }
       o.a(new LocalStorage$c(this, this.getTKJSContext().e(), p0));
       return;
    }
    public void setItem(String p0,Object p1,V8Function p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LocalStorage.class, "1")) {
          return;
       }
       JsValueRef jsValueRef = y.b(p2, this);
       this.d().add(jsValueRef);
       LocalStorage$a uoa = new LocalStorage$a(this, this.getTKJSContext().e(), p1, p0, jsValueRef);
       o.a(this.getTKJSContext());
       return;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, LocalStorage.class, "8")) {
          return;
       }
       if (a.c.booleanValue()) {
          a uoa = a.g();
          String str = this.getJSContext().h();
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoidOneRefs(str, uoa, a.class, "4") && a.c.booleanValue()) {
             uoa.c.remove(str);
             uoa.d.remove(str);
          }
       }
       super.unRetainAllJsObj();
       LocalStorage tf = this.f;
       if (tf != null && tf.size() > 0) {
          Iterator iterator = this.f.iterator();
          while (iterator.hasNext()) {
             y.c(iterator.next());
          }
       }
       this.f.clear();
       return;
    }
}
