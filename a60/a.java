package a60.a;
import y50.a;
import java.lang.String;
import ur.m;
import java.lang.Object;
import a60.d;
import com.kwai.video.krtc.rtcengine.IRtcEngineEventHandler;
import java.lang.StringBuilder;
import jw4.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.util.Objects;
import com.kwai.video.krtc.rtcengine.RtcEngine;
import java.lang.Boolean;
import z50.b;
import java.util.Set;
import b60.a;
import com.kwai.video.krtc.rtcengine.RtcEngineFileStreamingConfig;
import java.util.ArrayList;
import java.lang.Long;

public class a implements a	// class@00002e
{
    public final m a;
    public final String b;
    public final d c;

    public void a(String p0,m p1){
       super();
       d uod = new d();
       this.c = uod;
       this.b = p0;
       this.a = p1;
       p1.a(uod);
       c.a("Arya5FileStreamEngine", "init with arya:"+p0);
    }
    public int a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       c.a("Arya5FileStreamEngine", "stopFileStream ");
       obj = this.a;
       a tb = this.b;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(tb, obj, m.class, "61");
       int i = (obj1 != patchProxyRe)? obj1.intValue(): obj.a.stopFileStream(tb);
       return i;
    }
    public boolean b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "8");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, m.class, "65");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.a.isFileStreamStarted();
       return b;
    }
    public void c(b p0){
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, str)) {
          return;
       }
       a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(p0, tc, d.class, str)) {
          tc.a.remove(p0);
       }
       return;
    }
    public int d(a p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RtcEngineFileStreamingConfig obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       c.a("Arya5FileStreamEngine", "startFileStream "+p0);
       obj = new RtcEngineFileStreamingConfig();
       obj.savePath = p0.b;
       a ta = this.a;
       a tb = this.b;
       p0 = p0.a;
       Objects.requireNonNull(ta);
       Object obj1 = PatchProxy.applyThreeRefs(tb, p0, obj, ta, m.class, "60");
       int i = (obj1 != patchProxyRe)? obj1.intValue(): ta.a.startFileStream(tb, p0, obj);
       return i;
    }
    public int e(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       c.a("Arya5FileStreamEngine", "resumeFileStream ");
       obj = this.a;
       a tb = this.b;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(tb, obj, m.class, "63");
       int i = (obj1 != patchProxyRe)? obj1.intValue(): obj.a.resumeFileStream(tb);
       return i;
    }
    public void f(b p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, str)) {
          return;
       }
       a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(p0, tc, d.class, str)) {
          tc.a.add(p0);
       }
       return;
    }
    public int g(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       c.a("Arya5FileStreamEngine", "pauseFileStream ");
       obj = this.a;
       a tb = this.b;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(tb, obj, m.class, "62");
       int i = (obj1 != patchProxyRe)? obj1.intValue(): obj.a.pauseFileStream(tb);
       return i;
    }
    public int h(long p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uoa, "7");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       c.a("Arya5FileStreamEngine", "seekFileStreamToMs "+p0);
       uoa = this.a;
       a tb = this.b;
       Objects.requireNonNull(uoa);
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object obj1 = PatchProxy.applyTwoRefs(tb, Long.valueOf(p0), uoa, om, "64");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          label_005b :
             return i;
          }
       }
       i = uoa.a.seekFileStreamToMs(tb, p0);
       goto label_005b ;
    }
    public void release(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "9")) {
          return;
       }
       this.a();
       a tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(objArray, tc, d.class, "6")) {
          tc.a.clear();
       }
       this.a.p(this.c);
       this.a.o();
       c.a("Arya5FileStreamEngine", "file stream engine release ");
       return;
    }
}
