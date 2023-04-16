package com.yxcorp.gifshow.postwork.e;
import java.lang.Object;
import java.util.HashMap;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.System;
import com.yxcorp.gifshow.postwork.b;
import java.lang.Runnable;
import f0c.l;
import f0c.k;
import pr3.a;
import pr3.a$a;
import lnc.u1;
import crd.b;
import lnc.b9;
import m56.f;
import m56.g;

public final class e	// class@0010c8
{
    public final Map a;
    public b b;
    public final boolean c;
    public b d;
    public b e;
    public static final e f;

    static {
       e.f = new e();
    }
    public void e(){
       super();
       this.a = new HashMap();
       boolean b = a.t().d("post_event_upload", false);
       this.c = b;
       Object[] objArray = new Object[false];
       a.D().w("PostStuckDetector", "PostStuckDetector: mEnable="+b, objArray);
    }
    public static e a(){
       return e.f;
    }
    public static String b(PostEncodeInfo p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, null, e.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          return p0.getSessionId();
       }
       obj = new Object[0];
       a.D().A("PostStuckDetector", "getSessionIdByEncodeInfo, encodeInfo is null", obj);
       return "";
    }
    public static String c(UploadInfo p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, null, e.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          return p0.getSessionId();
       }
       obj = new Object[0];
       a.D().A("PostStuckDetector", "getSessionIdByUploadId, uploadInfo is null", obj);
       return "";
    }
    public void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "6")) {
          return;
       }
       b uob = new b(this, p0, p1, System.currentTimeMillis());
       this.g(v0);
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "14")) {
          return;
       }
       this.g(new l(this, p0));
       return;
    }
    public final void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "22")) {
          return;
       }
       this.g(new k(this, p0));
       return;
    }
    public final void g(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "5")) {
          return;
       }
       if (this.c == null) {
          return;
       }
       a.a.execute(p0);
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, e.class, "11")) {
          return;
       }
       u1.b(this);
       b9.a(this.d);
       this.d = null;
       b9.a(this.e);
       this.e = null;
       if (this.b == null) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PostStuckDetector", "stopHeartBeat: ", objArray);
       this.b.dispose();
       this.b = null;
       return;
    }
    public void onEventMainThread(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "18")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PostStuckDetector", "OnAppBackgroundEvent: "+p0, objArray);
       this.f("on_app_background_event");
       return;
    }
    public void onEventMainThread(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "17")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("PostStuckDetector", "OnAppForegroundEvent: "+p0, objArray);
       this.f("on_app_foreground_event");
       return;
    }
}
