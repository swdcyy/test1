package com.kwai.video.wayne.player.logreport.KPMidTrace;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import org.json.JSONObject;
import java.lang.System;
import android.os.SystemClock;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.robust.PatchProxyResult;

public final class KPMidTrace	// class@000d39
{
    public long initTime;
    public JSONObject jsonTrace;
    public JSONObject jsonVseTrace;
    public long mCallFirstFrameTimestamp;
    public long mCallOnPreparedTimestamp;
    public long mCallPrepareTimestamp;
    public long mCallStartTimestamp;
    public long mUpdateVideoContextTimestamp;
    public long vseInitTime;

    public void KPMidTrace(){
       super();
    }
    public final void addKV(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KPMidTrace.class, "6")) {
          return;
       }
       a.p(p0, "key");
       a.p(p1, "value");
       KPMidTrace tjsonTrace = this.jsonTrace;
       if (tjsonTrace == null) {
          a.S("jsonTrace");
       }
       if (tjsonTrace != null) {
          tjsonTrace.put(p0, p1);
       }
       return;
    }
    public final void addStamp(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KPMidTrace.class, "3")) {
          return;
       }
       a.p(p0, "stamp");
       if (("prepareAsync").equals(p0)) {
          this.mCallPrepareTimestamp = System.currentTimeMillis();
       }else if(("start").equals(p0)){
          this.mCallStartTimestamp = System.currentTimeMillis();
       }else if(("prepared").equals(p0)){
          this.mCallOnPreparedTimestamp = System.currentTimeMillis();
       }else if(("rendered").equals(p0)){
          this.mCallFirstFrameTimestamp = System.currentTimeMillis();
       }
       KPMidTrace tjsonTrace = this.jsonTrace;
       if (tjsonTrace == null) {
          a.S("jsonTrace");
       }
       if (tjsonTrace != null) {
          tjsonTrace.put(p0, (SystemClock.elapsedRealtime() - this.initTime));
       }
       return;
    }
    public final void addVseKV(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KPMidTrace.class, "4")) {
          return;
       }
       a.p(p0, "key");
       a.p(p1, "value");
       KPMidTrace tjsonVseTrac = this.jsonVseTrace;
       if (tjsonVseTrac == null) {
          a.S("jsonVseTrace");
       }
       if (tjsonVseTrac != null) {
          tjsonVseTrac.put(p0, p1);
       }
       return;
    }
    public final void addVseKV(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KPMidTrace.class, "5")) {
          return;
       }
       if (p0 != null) {
          Iterator iterator = p0.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             KPMidTrace tjsonVseTrac = this.jsonVseTrace;
             if (tjsonVseTrac == null) {
                a.S("jsonVseTrace");
             }
             tjsonVseTrac.put(uEntry.getKey(), uEntry.getValue());
          }
       }
       return;
    }
    public final String appendAfterJsonStr(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, KPMidTrace.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "jsonStr";
       try{
          a.p(p0, obj);
          JSONObject jSONObject = new JSONObject(p0);
          String str = "KPMID";
          KPMidTrace tjsonTrace = this.jsonTrace;
          if (tjsonTrace == null) {
             a.S("jsonTrace");
          }
          jSONObject.put(str, tjsonTrace);
          jSONObject.put("MidWareType", "Wayne");
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
    public final long getMCallFirstFrameTimestamp(){
       return this.mCallFirstFrameTimestamp;
    }
    public final long getMCallOnPreparedTimestamp(){
       return this.mCallOnPreparedTimestamp;
    }
    public final long getMCallPrepareTimestamp(){
       return this.mCallPrepareTimestamp;
    }
    public final long getMCallStartTimestamp(){
       return this.mCallStartTimestamp;
    }
    public final long getMUpdateVideoContextTimestamp(){
       return this.mUpdateVideoContextTimestamp;
    }
    public final String getStrTrace(){
       Object[] objArray = null;
       KPMidTrace obj = PatchProxy.apply(objArray, this, KPMidTrace.class, "7");
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
       KPMidTrace obj = PatchProxy.apply(objArray, this, KPMidTrace.class, "8");
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
       if (PatchProxy.applyVoid(null, this, KPMidTrace.class, "1")) {
          return;
       }
       this.initTime = SystemClock.elapsedRealtime();
       this.jsonTrace = new JSONObject();
       return;
    }
    public final void initVseTrace(){
       if (PatchProxy.applyVoid(null, this, KPMidTrace.class, "2")) {
          return;
       }
       this.vseInitTime = SystemClock.elapsedRealtime();
       this.jsonVseTrace = new JSONObject();
       return;
    }
    public final void setMCallFirstFrameTimestamp(long p0){
       this.mCallFirstFrameTimestamp = p0;
    }
    public final void setMCallOnPreparedTimestamp(long p0){
       this.mCallOnPreparedTimestamp = p0;
    }
    public final void setMCallPrepareTimestamp(long p0){
       this.mCallPrepareTimestamp = p0;
    }
    public final void setMCallStartTimestamp(long p0){
       this.mCallStartTimestamp = p0;
    }
    public final void setMUpdateVideoContextTimestamp(long p0){
       this.mUpdateVideoContextTimestamp = p0;
    }
}
