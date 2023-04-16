package com.kwai.video.wayne.player.logreport.KSTimeSlice;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class KSTimeSlice	// class@000d3a
{
    public long end;
    public long start;

    public void KSTimeSlice(){
       super();
    }
    public boolean contains(KSTimeSlice p0){
       boolean b;
       KSTimeSlice start = p0.start;
       KSTimeSlice tstart = this.start;
       if (start - tstart >= 0) {
          KSTimeSlice tend = this.end;
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
    public KSTimeSlice copy(){
       KSTimeSlice obj = PatchProxy.apply(null, this, KSTimeSlice.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new KSTimeSlice();
       obj.start = this.start;
       obj.end = this.end;
       return obj;
    }
    public boolean endIntersects(KSTimeSlice p0){
       boolean b;
       KSTimeSlice tstart = this.start;
       if (p0.start - tstart < 0) {
          KSTimeSlice end = p0.end;
          if (end - tstart >= 0 && end - this.end <= 0) {
             b = true;
          label_0017 :
             return b;
          }
       }
       b = false;
       goto label_0017 ;
    }
    public boolean startIntersects(KSTimeSlice p0){
       boolean b;
       KSTimeSlice start = p0.start;
       if (start - this.start >= 0) {
          KSTimeSlice tend = this.end;
          if (start - tend <= 0 && p0.end - tend > 0) {
             b = true;
          label_0017 :
             return b;
          }
       }
       b = false;
       goto label_0017 ;
    }
    public boolean tryMerge(KSTimeSlice p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KSTimeSlice.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.startIntersects(p0)) {
          this.end = p0.end;
          return true;
       }else if(this.endIntersects(p0)){
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
