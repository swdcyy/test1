package com.kwai.video.waynelive.wayneplayer.WayneTrace;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import org.json.JSONObject;
import android.os.SystemClock;
import com.kwai.robust.PatchProxyResult;

public final class WayneTrace	// class@000e52
{
    public long initTime;
    public JSONObject jsonTrace;
    public JSONObject jsonVseTrace;
    public long vseInitTime;

    public void WayneTrace(){
       super();
    }
    public final void addKV(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WayneTrace.class, "5")) {
          return;
       }
       a.p(p0, "key");
       a.p(p1, "value");
       WayneTrace tjsonTrace = this.jsonTrace;
       if (tjsonTrace == null) {
          a.S("jsonTrace");
       }
       if (tjsonTrace != null) {
          tjsonTrace.put(p0, p1);
       }
       return;
    }
    public final void addStamp(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneTrace.class, "3")) {
          return;
       }
       a.p(p0, "stamp");
       WayneTrace tjsonTrace = this.jsonTrace;
       if (tjsonTrace == null) {
          a.S("jsonTrace");
       }
       if (tjsonTrace != null) {
          tjsonTrace.put(p0, (SystemClock.elapsedRealtime() - this.initTime));
       }
       return;
    }
    public final void addVseKV(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WayneTrace.class, "4")) {
          return;
       }
       a.p(p0, "key");
       a.p(p1, "value");
       WayneTrace tjsonVseTrac = this.jsonVseTrace;
       if (tjsonVseTrac == null) {
          a.S("jsonVseTrace");
       }
       if (tjsonVseTrac != null) {
          tjsonVseTrac.put(p0, p1);
       }
       return;
    }
    public final String appendAfterJsonStr(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, WayneTrace.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "jsonStr";
       try{
          a.p(p0, obj);
          JSONObject jSONObject = new JSONObject(p0);
          String str = "KPMID";
          WayneTrace tjsonTrace = this.jsonTrace;
          if (tjsonTrace == null) {
             a.S("jsonTrace");
          }
          jSONObject.put(str, tjsonTrace);
          str = "MWInfo";
          tjsonTrace = this.jsonVseTrace;
          if (tjsonTrace == null) {
             a.S("jsonVseTrace");
          }
          jSONObject.put(str, tjsonTrace);
          obj = jSONObject.toString();
          a.o(obj, "jsonObj.toString\(\)");
          return obj;
       }catch(java.lang.Exception e0){
          return p0;
       }
    }
    public final String getStrTrace(){
       Object[] objArray = null;
       WayneTrace obj = PatchProxy.apply(objArray, this, WayneTrace.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.jsonTrace;
       if (obj == null) {
          a.S("jsonTrace");
       }
       if (obj != null) {
          objArray = obj.toString();
       }
       a.o(objArray, "jsonTrace?.toString\(\)");
       return objArray;
    }
    public final String getVseStrTrace(){
       Object[] objArray = null;
       WayneTrace obj = PatchProxy.apply(objArray, this, WayneTrace.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.jsonVseTrace;
       if (obj == null) {
          a.S("jsonVseTrace");
       }
       if (obj != null) {
          objArray = obj.toString();
       }
       a.o(objArray, "jsonVseTrace?.toString\(\)");
       return objArray;
    }
    public final void initTrace(){
       if (PatchProxy.applyVoid(null, this, WayneTrace.class, "1")) {
          return;
       }
       this.initTime = SystemClock.elapsedRealtime();
       this.jsonTrace = new JSONObject();
       return;
    }
    public final void initVseTrace(){
       if (PatchProxy.applyVoid(null, this, WayneTrace.class, "2")) {
          return;
       }
       this.vseInitTime = SystemClock.elapsedRealtime();
       this.jsonVseTrace = new JSONObject();
       return;
    }
}
