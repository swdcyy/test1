package com.yxcorp.gifshow.log.TimeSlice;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.SystemClock;
import java.lang.Boolean;

public class TimeSlice implements Serializable	// class@001af0
{
    public long end;
    public long start;

    public void TimeSlice(){
       super();
    }
    public boolean contains(TimeSlice p0){
       boolean b;
       TimeSlice start = p0.start;
       TimeSlice tstart = this.start;
       if (start - tstart >= 0) {
          TimeSlice tend = this.end;
          if (start - tend <= 0) {
             start = p0.end;
             if (start - tstart >= 0 && start - tend <= 0) {
                b = true;
             label_001b :
                return b;
             }
          }
       }
       b = false;
       goto label_001b ;
    }
    public TimeSlice copy(){
       TimeSlice obj = PatchProxy.apply(null, this, TimeSlice.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TimeSlice();
       obj.start = this.start;
       obj.end = this.end;
       return obj;
    }
    public void end(){
       if (PatchProxy.applyVoid(null, this, TimeSlice.class, "4")) {
          return;
       }
       this.end = SystemClock.elapsedRealtime();
       return;
    }
    public long getDuration(){
       return (this.end - this.start);
    }
    public boolean intersectsWithEnd(TimeSlice p0){
       boolean b;
       TimeSlice tstart = this.start;
       if (p0.start - tstart < 0) {
          TimeSlice end = p0.end;
          if (end - tstart >= 0 && end - this.end <= 0) {
             b = true;
          label_0017 :
             return b;
          }
       }
       b = false;
       goto label_0017 ;
    }
    public boolean intersectsWithStart(TimeSlice p0){
       boolean b;
       TimeSlice start = p0.start;
       if (start - this.start >= 0) {
          TimeSlice tend = this.end;
          if (start - tend <= 0 && p0.end - tend > 0) {
             b = true;
          label_0017 :
             return b;
          }
       }
       b = false;
       goto label_0017 ;
    }
    public void start(){
       if (PatchProxy.applyVoid(null, this, TimeSlice.class, "3")) {
          return;
       }
       this.start = SystemClock.elapsedRealtime();
       return;
    }
    public boolean tryMerge(TimeSlice p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeSlice.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.intersectsWithStart(p0)) {
          this.end = p0.end;
          return true;
       }else if(this.intersectsWithEnd(p0)){
          this.start = p0.start;
          return true;
       }else if(p0.contains(this)){
          this.start = p0.start;
          this.end = p0.end;
          return true;
       }else {
          return this.contains(p0);
       }
    }
}
