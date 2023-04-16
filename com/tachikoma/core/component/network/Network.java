package com.tachikoma.core.component.network.Network;
import com.tachikoma.core.component.TKBaseNativeModule;
import java.util.HashMap;
import gx4.f;
import cp8.c;
import com.tachikoma.core.bridge.c;
import java.lang.Object;
import tx4.j;
import oo8.m;
import com.tachikoma.core.bridge.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.JsValueRef;
import tx4.y;
import com.tachikoma.core.component.network.TKHttpMethod;
import com.tachikoma.core.component.network.Network$b;
import tx4.i;
import tx4.v;
import com.tkruntime.v8.V8Object;
import java.lang.Throwable;
import wp8.a;
import tx4.u;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import zp8.a;
import com.tachikoma.core.component.network.Network$a;
import java.util.Map;
import java.lang.Integer;

public class Network extends TKBaseNativeModule	// class@000d7f
{
    public Map bodyParameters;
    public j f;
    public m g;
    public JsValueRef h;
    public Map headers;
    public String host;
    public JsValueRef i;
    public Map parameters;
    public String path;
    public String scheme;
    public int timeoutInterval;
    public Map userInfo;
    public static String METHOD_GET = "GET";
    public static String METHOD_POST = "POST";
    public static HashMap j;
    public static HashMap k;

    static {
       Network.j = new HashMap();
       Network.k = new HashMap();
    }
    public void Network(f p0){
       super(p0);
       this.f = new c();
       j oj = Network.j.get(this.getJSContext());
       if (oj != null) {
          this.f = oj;
       }
       m om = Network.k.get(this.getJSContext());
       if (om != null) {
          this.g = om;
       }
       return;
    }
    public static void registerTKEventListener(d p0,m p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, Network.class, "3")) {
          return;
       }
       if (p0 != null) {
          Network.k.put(p0.b(), p1);
       }
       return;
    }
    public static void removeRequestDelegate(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, Network.class, "2")) {
          return;
       }
       if (p0 != null) {
          Network.j.remove(p0);
       }
       return;
    }
    public static void setRequestDelegate(d p0,j p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, Network.class, "1")) {
          return;
       }
       if (p0 != null && p1 != null) {
          Network.j.put(p0.b(), p1);
       }
       return;
    }
    public static void unRegisterNetworkCallbackInner(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, Network.class, "4")) {
          return;
       }
       if (p0 != null) {
          Network.k.remove(p0);
       }
       return;
    }
    public void get(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Network.class, "14")) {
          return;
       }
       y.c(this.i);
       this.i = y.b(p0, this);
       Network tg = this.g;
       if (tg != null) {
          tg.c(this, TKHttpMethod.GET);
       }
       this.f.f(new Network$b(this, this.i.get()));
       return;
    }
    public void onGetError(v p0,V8Function p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Network.class, "18")) {
          return;
       }
       if (p0 != null && !p1.isReleased()) {
          Object[] objArray = new Object[]{p0.toString()};
          p1.call(null, objArray);
       }
       Network tg = this.g;
       if (tg != null) {
          tg.b(this, TKHttpMethod.GET, p0);
       }
       return;
    }
    public void onGetSuccess(u p0,V8Function p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Network.class, "17")) {
          return;
       }
       if (p0 != null && !p1.isReleased()) {
          String str = p0.a();
          String str1 = "{}";
          String str2 = (TextUtils.isEmpty(str) || p0.equals(str1))? str1: str;
          if (!p1.isReleased()) {
             Object[] objArray = new Object[]{str2};
             p1.call(null, objArray);
          }
          Network tg = this.g;
          if (tg != null) {
             tg.a(this, TKHttpMethod.GET, p0);
          }
       }
    label_0088 :
       return;
    }
    public void onPostError(v p0,V8Function p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Network.class, "16")) {
          return;
       }
       if (p0 != null && !p1.isReleased()) {
          Object[] objArray = new Object[]{p0.toString()};
          p1.call(null, objArray);
       }
       Network tg = this.g;
       if (tg != null) {
          tg.b(this, TKHttpMethod.POST, p0);
       }
       return;
    }
    public void onPostSuccess(u p0,V8Function p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, Network.class, "15")) {
          return;
       }
       if (p0 != null && !p1.isReleased()) {
          String str = p0.a();
          String str1 = (TextUtils.isEmpty(str))? "{}": str;
          if (!p1.isReleased()) {
             Object[] objArray = new Object[]{str1};
             p1.call(null, objArray);
          }
          Network tg = this.g;
          if (tg != null) {
             tg.a(this, TKHttpMethod.POST, p0);
          }
       }
    label_0080 :
       return;
    }
    public void post(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Network.class, "13")) {
          return;
       }
       y.c(this.h);
       this.h = y.b(p0, this);
       Network tg = this.g;
       if (tg != null) {
          tg.c(this, TKHttpMethod.POST);
       }
       this.f.b(new Network$a(this, this.h.get()));
       return;
    }
    public void setBody(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Network.class, "10")) {
          return;
       }
       this.f.g(p0);
       return;
    }
    public void setHeader(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Network.class, "7")) {
          return;
       }
       this.f.j(p0);
       this.headers = p0;
       return;
    }
    public void setHost(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Network.class, "5")) {
          return;
       }
       this.f.h(p0);
       return;
    }
    public void setInterval(int p0){
       Network network = Network.class;
       if (PatchProxy.isSupport(network) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, network, "11")) {
          return;
       }
       this.f.d(p0);
       return;
    }
    public void setParams(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Network.class, "9")) {
          return;
       }
       this.f.a(p0);
       return;
    }
    public void setPath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Network.class, "6")) {
          return;
       }
       this.f.setPath(p0);
       return;
    }
    public void setScheme(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Network.class, "8")) {
          return;
       }
       this.f.c(p0);
       return;
    }
    public void setUserInfo(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Network.class, "12")) {
          return;
       }
       this.f.e(p0);
       return;
    }
}
