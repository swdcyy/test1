package com.yxcorp.gifshow.featured.feedprefetcher.config.DisablePrefetchPeriodConfig$Period;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Random;
import java.lang.StringBuilder;
import pea.b;
import java.lang.Number;
import java.lang.Long;
import java.lang.Boolean;
import java.util.Calendar;

public class DisablePrefetchPeriodConfig$Period implements Serializable	// class@000fb0
{
    public String end;
    public Integer mEndInt;
    public int mRandomPeriod;
    public Integer mStartInt;
    public String start;

    public void DisablePrefetchPeriodConfig$Period(){
       super();
    }
    public final Integer a(String p0,int p1){
       String str = ":";
       if (PatchProxy.isSupport(DisablePrefetchPeriodConfig$Period.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, DisablePrefetchPeriodConfig$Period.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       try{
          String[] stringArray = p0.split(str);
          int i1 = 1;
          if (p1 > 0) {
             i1 = this.b(stringArray[i1]) + new Random().nextInt(p1);
             int i2 = this.b(stringArray[i]);
             b.e("Period end:"+((i1 / 60) + i2)+str+(i1 % 60));
             return Integer.valueOf((((i2 + (i1 / 60)) * 60) + (i1 % 60)));
          }else {
             return Integer.valueOf(((this.b(stringArray[i]) * 60) + this.b(stringArray[i1])));
          }
       }catch(java.lang.Exception e0){
          return Integer.valueOf(i);
       }
    }
    public final int b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, DisablePrefetchPeriodConfig$Period.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0.startsWith("0")) {
          return Integer.parseInt(p0.substring(1));
       }
       return Integer.parseInt(p0);
    }
    public String getEnd(){
       return this.end;
    }
    public String getStart(){
       return this.start;
    }
    public boolean inPeriod(long p0){
       Calendar obj;
       if (PatchProxy.isSupport(DisablePrefetchPeriodConfig$Period.class)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, DisablePrefetchPeriodConfig$Period.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 0;
       if (this.mStartInt == null) {
          this.mStartInt = this.a(this.start, i);
       }
       if (this.mEndInt == null) {
          this.mEndInt = this.a(this.end, this.mRandomPeriod);
       }
       obj = Calendar.getInstance();
       obj.setTimeInMillis(p0);
       int i1 = (obj.get(11) * 60) + obj.get(12);
       if (i1 >= this.mStartInt.intValue() && i1 <= this.mEndInt.intValue()) {
          i = true;
       }
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, DisablePrefetchPeriodConfig$Period.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{["+this.start+", "+this.end+"], random:"+this.mRandomPeriod+'}';
    }
}
