package h61.a;
import java.util.HashMap;
import java.lang.Object;
import com.kuaishou.android.live.model.LiveStreamModel$WinterOlympicSimpleLive;
import lnc.i3;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import k2b.u1;
import java.util.Map;
import java.lang.System;
import java.lang.Long;
import java.lang.Number;

public class a	// class@002627
{
    public static final Map a;

    static {
       a.a = new HashMap();
    }
    public void a(){
       super();
    }
    public static i3 a(boolean p0,LiveStreamModel$WinterOlympicSimpleLive p1){
       i3 obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, null, uoa, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = i3.f();
       String str = (p0)? "TRUE": "FALSE";
       obj.d("success", str);
       if (p1 != null) {
          obj.d("webUrl", p1.mWebUrl);
       }
       return obj;
    }
    public static void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "14")) {
          return;
       }
       u1.R(p0, p1, 32);
       return;
    }
    public static void c(boolean p0,String p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, null, uoa, "11")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("imageUrl", p1);
       String str = (p0)? "TRUE": "FALSE";
       oi3.d("success", str);
       a.b("OLYMPIC_LIVE_PREVIEW_IMG", oi3.e());
       return;
    }
    public static void d(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uoa, "6")) {
          return;
       }
       i3 oi3 = i3.f();
       String str = (p0)? "TRUE": "FALSE";
       oi3.d("success", str);
       a.b("OLYMPIC_PREVIEW_CHANGE_BG_IMAGE", oi3.e());
       return;
    }
    public static void e(String p0,i3 p1){
       Map a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "10")) {
          return;
       }
       a = a.a;
       if (a.containsKey(p0)) {
          if (p1 == null) {
             p1 = i3.f();
          }
          p1.c("duration", Long.valueOf((System.currentTimeMillis() - a.remove(p0).longValue())));
          a.b(p0, p1.e());
       }
       return;
    }
    public static void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "9")) {
          return;
       }
       a.a.put(p0, Long.valueOf(System.currentTimeMillis()));
       return;
    }
    public static void g(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uoa, "5")) {
          return;
       }
       i3 oi3 = i3.f();
       String str = (p0)? "TRUE": "FALSE";
       oi3.d("success", str);
       a.b("OLYMPIC_LIVE_X_STREAM_LOAD_IMG", oi3.e());
       return;
    }
}
