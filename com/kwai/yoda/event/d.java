package com.kwai.yoda.event.d;
import java.util.HashMap;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.event.c;
import com.kwai.yoda.event.a;
import java.util.Objects;
import zx7.b;
import java.util.Set;
import java.util.Collection;
import erd.r;
import erd.g;
import yz7.b;
import com.kwai.yoda.bridge.YodaBaseWebView;
import zx7.d;
import com.kwai.yoda.event.b;
import java.lang.Throwable;
import yz7.r;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import zx7.e;
import com.kwai.yoda.event.EventListenerParameter;
import yz7.k;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge;
import org.json.JSONObject;
import java.util.Map;

public class d	// class@0011c7
{
    public final Set a;
    public final List b;
    public static d c;
    public static Map d;

    static {
       d.d = new HashMap();
    }
    public void d(){
       super();
       this.a = new CopyOnWriteArraySet();
       this.b = new CopyOnWriteArrayList();
    }
    public static d f(){
       d uod = d.class;
       Object obj = PatchProxy.apply(null, null, uod, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (d.c == null) {
          _monitor_enter(uod);
          if (d.c == null) {
             d.c = new d();
          }
          _monitor_exit(uod);
       }
       return d.c;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       d ta = this.a;
       Objects.requireNonNull(ta);
       b.b(ta, c.b, a.b, new b(ta));
       return;
    }
    public void b(YodaBaseWebView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "6")) {
          return;
       }
       try{
          d ta = this.a;
          Objects.requireNonNull(ta);
          b.b(ta, new d(String.valueOf(p0.hashCode())), b.b, new b(ta));
       }catch(java.lang.Exception e4){
          r.e("WebViewEventCommunication", e4);
       }
       return;
    }
    public void c(YodaBaseWebView p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "7")) {
          return;
       }
       this.d(p0, p1, p2, false);
       return;
    }
    public final void d(YodaBaseWebView p0,String p1,String p2,boolean p3){
       Iterator iterator;
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, d.class, "9")) {
          return;
       }
       if (TextUtils.isEmpty(p1)) {
          return;
       }
       if (p3 && !PatchProxy.applyVoidTwoRefs(p1, p2, this, uod, "10")) {
          iterator = this.b.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(p1, p2);
          }
       }
       this.a();
       iterator = this.a.iterator();
       while (iterator.hasNext()) {
          EventListenerParameter uEventListen = iterator.next();
          YodaBaseWebView yodaBaseWebV = uEventListen.getYodaBaseWebView();
          if (yodaBaseWebV != null && (TextUtils.equals(p1, uEventListen.getType()) && (p0 == null || TextUtils.equals(uEventListen.getHybridId(), String.valueOf(p0.hashCode()))))) {
             Object[] objArray = new Object[]{uEventListen.getHybridId(),p1};
             r.h("WebViewEventCommunication", k.a("dispatchEventListener: HybridId = %s , type = %s", objArray));
             yodaBaseWebV.getJavascriptBridge().r(uEventListen.getListener(), p2);
          }
       }
       return;
    }
    public void e(YodaBaseWebView p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "8")) {
          return;
       }
       this.d(p0, p1, p2, true);
       return;
    }
    public synchronized JSONObject g(String p0){
       JSONObject obj = PatchProxy.applyOneRefs(p0, this, d.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.d.get(p0);
       if (obj != null) {
          d.d.remove(p0);
       }
       return obj;
    }
}
