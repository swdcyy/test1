package com.tachikoma.component.network.TKNetwork;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ln8.a;
import java.lang.Boolean;
import com.tachikoma.core.bridge.c;
import pp8.a;
import com.tkruntime.v8.V8;
import lp8.e;
import oo8.p;
import java.util.HashMap;
import java.lang.Integer;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.core.bridge.d;
import tx4.w;
import no8.e;
import oo8.q;
import com.tkruntime.v8.JsValueRef;
import com.tachikoma.core.component.network.TKNetResponse;
import com.tachikoma.core.component.network.TKNetErrorInfo;
import java.lang.Long;
import com.google.gson.Gson;
import com.tachikoma.core.bridge.a$b;
import java.util.concurrent.Executor;
import com.tachikoma.core.bridge.a;
import co8.c;
import java.lang.Runnable;
import co8.d;
import iq8.x;
import zp8.a;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tkruntime.v8.V8Function;
import java.lang.Throwable;
import wp8.a;
import com.tachikoma.core.component.TKBaseNativeModule$DestroyReason;
import com.tkruntime.v8.V8Value;
import com.tachikoma.component.network.a;
import iq8.o;
import com.tachikoma.component.network.b;

public class TKNetwork extends TKBaseNativeModule	// class@000d15
{
    public String businessName;
    public Map f;
    public String fileKey;
    public boolean g;
    public p h;
    public Map headers;
    public long i;
    public int isAddCommonParameters;
    public int isAddExtraParameters;
    public String localFilePath;
    public String method;
    public String paramString;
    public Map params;
    public Map parts;
    public int timeout;
    public boolean upload;
    public String url;

    public void TKNetwork(f p0){
       super(p0);
       this.g = false;
       this.h = null;
       this.i = 0;
       this.isAddExtraParameters = 1;
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, TKNetwork.class, "2")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       if (a.c.booleanValue() && !this.getJSContext().k()) {
          a.n().g(this.getJSContext().h(), this.getJSContext().g().sessionId, this.i, "cancel", "cancel", Boolean.TRUE);
       }
       this.g = true;
       this.f().cancel();
       return;
    }
    public final void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKNetwork.class, "21")) {
          return;
       }
       if (a.c.booleanValue() && !this.getJSContext().k()) {
          HashMap hashMap = new HashMap();
          hashMap.put("url", this.url);
          hashMap.put("method", this.method);
          hashMap.put("params", this.params);
          hashMap.put("paramString", this.paramString);
          hashMap.put("headers", this.headers);
          hashMap.put("timeout", Integer.valueOf(this.timeout));
          hashMap.put("businessName", this.businessName);
          hashMap.put("isAddCommonParameters", Integer.valueOf(this.isAddCommonParameters));
          hashMap.put("upload", Boolean.valueOf(this.upload));
          hashMap.put("localFilePath", this.localFilePath);
          hashMap.put("parts", this.parts);
          hashMap.put("fileKey", this.fileKey);
          a.n().h(this.getJSContext().h(), this.getJSContext().g().sessionId, this.i, p0, hashMap);
       }
       return;
    }
    public final Map e(){
       w obj = PatchProxy.apply(null, this, TKNetwork.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.f == null) {
          this.f = new HashMap();
          obj = this.getTKJSContext().i();
          if (obj != null) {
             this.f.put("tkBundleId", obj.b);
             this.f.put("tkBundleVersionCode", Integer.valueOf(obj.d));
          }
       }
       return this.f;
    }
    public final p f(){
       Object obj = PatchProxy.apply(null, this, TKNetwork.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.h == null) {
          this.h = e.b().e.a();
       }
       return this.h;
    }
    public final void g(long p0,String p1,JsValueRef p2,TKNetResponse p3,TKNetErrorInfo p4){
       Object obj = this;
       object oobject = p2;
       object oobject1 = p3;
       object oobject2 = p4;
       TKNetwork tKNetwork = TKNetwork.class;
       if (PatchProxy.isSupport(tKNetwork)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),p1,oobject,oobject1,oobject2};
          if (PatchProxy.applyVoid(objArray, obj, tKNetwork, "4")) {
             return;
          }
       }
       if (oobject == null || (oobject1 == null && oobject2 == null)) {
          a.i("tachikoma", "response is null and errorInfo is null");
          return;
       }else {
          String str = "";
          String str1 = (oobject1 != null)? new Gson().q(oobject1): str;
          if (oobject2 != null) {
             str = new Gson().q(oobject2);
          }
          if (a.c.booleanValue() && !this.getJSContext().k()) {
             String str2 = this.getJSContext().h();
             V8 v8 = this.getJSContext().g().sessionId;
             long l = p0;
             String str3 = p1;
             a.n().g(str2, v8, l, str3, "response", str1);
             a.n().g(str2, v8, l, str3, "error", str);
          }
          if (this.getTKJSContext().j()) {
             a.b(0, this.getTKJSContext().b().f()).execute(new c(obj, str1, str, oobject));
          }else {
             x.f(new d(obj, str1, str, oobject));
          }
          return;
       }
    }
    public final void h(String p0,String p1,JsValueRef p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TKNetwork.class, "5")) {
          return;
       }
       if (this.g != null) {
          return;
       }
       if (y.a(p2.get())) {
          Object[] objArray = new Object[]{p0,p1};
          p2.get().call(null, objArray);
       }
       y.c(p2);
       return;
    }
    public void onDestroy(TKBaseNativeModule$DestroyReason p0,boolean p1){
       TKNetwork tKNetwork = TKNetwork.class;
       if (PatchProxy.isSupport(tKNetwork) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, tKNetwork, "19")) {
          return;
       }
       super.onDestroy(p0, p1);
       this.cancel();
       return;
    }
    public void request(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKNetwork.class, "1")) {
          return;
       }
       if (a.c.booleanValue()) {
          this.i = a.n().m();
          this.d("request");
       }
       this.g = false;
       if (this.isAddExtraParameters != null) {
          this.f().j(this.e());
       }
       o.a(new a(this, y.b(p0, this)));
       return;
    }
    public void setAddCommonParameters(int p0){
       TKNetwork tKNetwork = TKNetwork.class;
       if (PatchProxy.isSupport(tKNetwork) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKNetwork, "13")) {
          return;
       }
       if (a.c.booleanValue()) {
          this.isAddCommonParameters = p0;
       }
       this.f().e(p0);
       return;
    }
    public void setBusinessName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKNetwork.class, "12")) {
          return;
       }
       if (a.c.booleanValue()) {
          this.businessName = p0;
       }
       this.f().i(p0);
       return;
    }
    public void setFileKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKNetwork.class, "17")) {
          return;
       }
       if (a.c.booleanValue()) {
          this.fileKey = p0;
       }
       this.f().n(p0);
       return;
    }
    public void setHeaders(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKNetwork.class, "10")) {
          return;
       }
       if (a.c.booleanValue()) {
          this.headers = p0;
       }
       this.f().b(p0);
       return;
    }
    public void setLocalFilePath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKNetwork.class, "15")) {
          return;
       }
       if (a.c.booleanValue()) {
          this.localFilePath = p0;
       }
       this.f().m(p0);
       return;
    }
    public void setMethod(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKNetwork.class, "7")) {
          return;
       }
       if (a.c.booleanValue()) {
          this.method = p0;
       }
       this.f().o(p0);
       return;
    }
    public void setParamString(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKNetwork.class, "9")) {
          return;
       }
       if (a.c.booleanValue()) {
          this.paramString = p0;
       }
       this.f().l(p0);
       return;
    }
    public void setParams(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKNetwork.class, "8")) {
          return;
       }
       if (a.c.booleanValue()) {
          this.params = p0;
       }
       this.f().a(p0);
       return;
    }
    public void setParts(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKNetwork.class, "16")) {
          return;
       }
       if (a.c.booleanValue()) {
          this.parts = p0;
       }
       this.f().k(p0);
       return;
    }
    public void setTimeout(int p0){
       TKNetwork tKNetwork = TKNetwork.class;
       if (PatchProxy.isSupport(tKNetwork) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, tKNetwork, "11")) {
          return;
       }
       if (a.c.booleanValue()) {
          this.timeout = p0;
       }
       this.f().h(p0);
       return;
    }
    public void setUpload(boolean p0){
       TKNetwork tKNetwork = TKNetwork.class;
       if (PatchProxy.isSupport(tKNetwork) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, tKNetwork, "14")) {
          return;
       }
       if (a.c.booleanValue()) {
          this.upload = p0;
       }
       this.f().c(p0);
       return;
    }
    public void setUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKNetwork.class, "6")) {
          return;
       }
       if (a.c.booleanValue()) {
          this.url = p0;
       }
       this.f().g(p0);
       return;
    }
    public void sourceRequest(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKNetwork.class, "3")) {
          return;
       }
       if (a.c.booleanValue()) {
          this.i = a.n().m();
          this.d("sourceRequest");
       }
       this.g = false;
       if (this.isAddExtraParameters != null) {
          this.f().j(this.e());
       }
       o.a(new b(this, y.b(p0, this)));
       return;
    }
}
