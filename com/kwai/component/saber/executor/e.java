package com.kwai.component.saber.executor.e;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.saber.executor.c;
import com.kwai.component.saber.executor.b;
import java.util.Map;
import com.kwai.component.saber.executor.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import rg5.c;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import pg5.a;
import ic5.a$a;
import erd.g;
import crd.b;
import java.lang.IllegalArgumentException;
import com.kwai.robust.PatchProxyResult;
import android.net.Uri;
import com.kwai.component.saber.executor.WebSocketSpManager;
import com.kwai.component.saber.executor.WebSocketSpManager$a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.kwai.component.saber.executor.g;
import com.kwai.component.saber.executor.d;
import com.kwai.component.saber.executor.e$a;
import java.util.concurrent.atomic.AtomicInteger;
import pg5.h;
import pg5.c;
import rg5.b;
import pg5.e;
import fg6.a;
import com.google.gson.Gson;
import com.kwai.component.saber.executor.f;
import java.lang.Integer;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import okhttp3.WebSocket;

public class e	// class@000b31
{
    public final String a;
    public final String b;
    public final String c;
    public g d;
    public String e;
    public static e f;
    public static Map g;

    static {
       e.g = new HashMap();
       e uoe = e.class;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, objArray, uoe, str)) {
       }else if(PatchProxy.applyVoid(objArray, objArray, c.class, str)){
          str = "kst.msg.request-device-info";
          b a = b.a;
          if (!PatchProxy.applyVoidTwoRefs(str, a, objArray, uoe, "2")) {
             if (!e.g.containsKey(str)) {
                e.g.put(str, a);
             }else {
                throw new IllegalArgumentException("MessageHandler for kst.msg.request-device-info has been registered");
             }
          }
          RxBus.f.g(c.class, RxBus$ThreadMode.MAIN).subscribe(new a(a.a));
       }
    }
    public void e(){
       super();
       this.a = "key_WebSocket_StartUp";
       this.b = "key_WebSocket_Url";
       this.c = "1";
       this.e = "";
    }
    public static e a(){
       e uoe = e.class;
       Object obj = PatchProxy.apply(null, null, uoe, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (e.f == null) {
          _monitor_enter(uoe);
          if (e.f == null) {
             e.f = new e();
          }
          _monitor_exit(uoe);
       }
       return e.f;
    }
    public void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "5")) {
          return;
       }
       this.e = Uri.parse(p0).getHost();
       String str = "key_WebSocket_StartUp";
       if (p1 == null) {
          WebSocketSpManager.c.a().a(str, "-1");
       }
       if (p1 != null) {
          WebSocketSpManager$a c = WebSocketSpManager.c;
          c.a().a(str, p1);
          WebSocketSpManager webSocketSpM = c.a();
          str = "key_WebSocket_Url";
          Objects.requireNonNull(webSocketSpM);
          if (!PatchProxy.applyVoidTwoRefs(str, p0, webSocketSpM, WebSocketSpManager.class, "3")) {
             a.p(str, "urlKey");
             a.p(p0, "url");
             g.a(webSocketSpM.a.edit().putString(str, p0));
          }
       }
       g og = new g();
       this.d = og;
       og.b = d.a;
       e$a uoa = new e$a(this);
       Objects.requireNonNull(og);
       if (!PatchProxy.applyVoidTwoRefs(p0, uoa, og, g.class, "1")) {
          og.a(p0, new h(og, uoa, new AtomicInteger(3), p0));
       }
       return;
    }
    public void c(b p0,e p1){
       g a;
       int andIncrement;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "6")) {
          return;
       }
       e td = this.d;
       String str = a.a.q(p0);
       Objects.requireNonNull(td);
       String str1 = "3";
       if (!PatchProxy.applyVoidTwoRefs(str, p1, td, g.class, str1)) {
          a = td.a;
          Objects.requireNonNull(a);
          f uof = f.class;
          if (!PatchProxy.applyVoidTwoRefs(str, p1, a, uof, str1)) {
             try{
                andIncrement = a.e.getAndIncrement();
                a.f.put(Integer.valueOf(andIncrement), p1);
                f b = a.b;
                if (b == null) {
                   a.a(andIncrement, new IllegalStateException("WebSocket connection no longer valid"));
                }else if(b.send(str)){
                   str = "发送成功";
                }else {
                   str = "发送失败";
                }
                if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(andIncrement), str, a, uof, "5")) {
                   b = a.f.get(Integer.valueOf(andIncrement));
                   if (b != null) {
                      a.f.remove(Integer.valueOf(andIncrement));
                      b.onSuccess(str);
                   }
                }
             }catch(java.lang.Exception e6){
                a.a(andIncrement, e6);
             }
          }
       }
    }
}
