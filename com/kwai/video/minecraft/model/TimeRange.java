package com.kwai.video.minecraft.model.TimeRange;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.RationalTime;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Double;

public class TimeRange extends ModelBase	// class@000a22
{

    public void TimeRange(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void TimeRange(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public void TimeRange(RationalTime p0){
       super();
       long l = this.native_create_with_start(p0);
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void TimeRange(RationalTime p0,RationalTime p1){
       super();
       long l = this.native_create_with_start_and_duration(p0, p1);
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public static double defaultEpsilon(){
       Object obj = PatchProxy.apply(null, null, TimeRange.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return TimeRange.native_defaultEpsilon();
    }
    public static native boolean native_beforeRationalTime(long p0,RationalTime p1);
    public static native boolean native_beforeRationalTimeWithEpsilon(long p0,RationalTime p1,double p2);
    public static native boolean native_beforeTimeRange(long p0,TimeRange p1);
    public static native boolean native_beforeTimeRangeWithEpsilon(long p0,TimeRange p1,double p2);
    public static native boolean native_beginsRationalTime(long p0,RationalTime p1);
    public static native boolean native_beginsRationalTimeWithEpsilon(long p0,RationalTime p1,double p2);
    public static native boolean native_beginsTimeRange(long p0,TimeRange p1);
    public static native boolean native_beginsTimeRangeWithEpsilon(long p0,TimeRange p1,double p2);
    public static native TimeRange native_clone(long p0);
    public static native boolean native_containsRationalTime(long p0,RationalTime p1);
    public static native boolean native_containsTimeRange(long p0,TimeRange p1);
    public static native boolean native_containsTimeRangeWithEpsilon(long p0,TimeRange p1,double p2);
    public static native double native_defaultEpsilon();
    public static native void native_destroy(long p0);
    public static native RationalTime native_duration(long p0);
    public static native boolean native_equalToTimeRange(long p0,TimeRange p1);
    public static native boolean native_finishesRationalTime(long p0,RationalTime p1);
    public static native boolean native_finishesRationalTimeWithEpsilon(long p0,RationalTime p1,double p2);
    public static native boolean native_finishesTimeRange(long p0,TimeRange p1);
    public static native boolean native_finishesTimeRangeWithEpsilon(long p0,TimeRange p1,double p2);
    public static native RationalTime native_getExclusiveEndTime(long p0);
    public static native RationalTime native_getInclusiveEndTime(long p0);
    public static native boolean native_intersectsTimeRange(long p0,TimeRange p1);
    public static native boolean native_intersectsTimeRangeWithEpsilon(long p0,TimeRange p1,double p2);
    public static native boolean native_meetsTimeRange(long p0,TimeRange p1);
    public static native boolean native_meetsTimeRangeWithEpsilon(long p0,TimeRange p1,double p2);
    public static native boolean native_overlapsRationalTime(long p0,RationalTime p1);
    public static native boolean native_overlapsTimeRange(long p0,TimeRange p1);
    public static native boolean native_overlapsTimeRangeWithEpsilon(long p0,TimeRange p1,double p2);
    public static native RationalTime native_rationalTimeClamped(long p0,RationalTime p1);
    public static native RationalTime native_startTime(long p0);
    public static native TimeRange native_timeRangeClamped(long p0,TimeRange p1);
    public static native TimeRange native_timeRangeExtendedBy(long p0,TimeRange p1);
    public static native TimeRange native_timeRangeExtendedByDuration(long p0,RationalTime p1);
    public static native TimeRange native_timeRangeFromStartToEndTime(RationalTime p0,RationalTime p1);
    public static native TimeRange native_timeRangeFromStartToInclusiveEndTime(RationalTime p0,RationalTime p1);
    public static TimeRange timeRangeFromStartToEndTime(RationalTime p0,RationalTime p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TimeRange.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TimeRange.native_timeRangeFromStartToEndTime(p0, p1);
    }
    public static TimeRange timeRangeFromStartToInclusiveEndTime(RationalTime p0,RationalTime p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, TimeRange.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TimeRange.native_timeRangeFromStartToInclusiveEndTime(p0, p1);
    }
    public boolean beforeRationalTime(RationalTime p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeRange.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TimeRange.native_beforeRationalTime(this.nativeRef, p0);
    }
    public boolean beforeRationalTimeWithEpsilon(RationalTime p0,double p1){
       TimeRange timeRange = TimeRange.class;
       if (PatchProxy.isSupport(timeRange)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), this, timeRange, "22");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return TimeRange.native_beforeRationalTimeWithEpsilon(this.nativeRef, p0, p1);
    }
    public boolean beforeTimeRange(TimeRange p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeRange.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TimeRange.native_beforeTimeRange(this.nativeRef, p0);
    }
    public boolean beforeTimeRangeWithEpsilon(TimeRange p0,double p1){
       TimeRange timeRange = TimeRange.class;
       if (PatchProxy.isSupport(timeRange)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), this, timeRange, "20");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return TimeRange.native_beforeTimeRangeWithEpsilon(this.nativeRef, p0, p1);
    }
    public boolean beginsRationalTime(RationalTime p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeRange.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TimeRange.native_beginsRationalTime(this.nativeRef, p0);
    }
    public boolean beginsRationalTimeWithEpsilon(RationalTime p0,double p1){
       TimeRange timeRange = TimeRange.class;
       if (PatchProxy.isSupport(timeRange)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), this, timeRange, "28");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return TimeRange.native_beginsRationalTimeWithEpsilon(this.nativeRef, p0, p1);
    }
    public boolean beginsTimeRange(TimeRange p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeRange.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TimeRange.native_beginsTimeRange(this.nativeRef, p0);
    }
    public boolean beginsTimeRangeWithEpsilon(TimeRange p0,double p1){
       TimeRange timeRange = TimeRange.class;
       if (PatchProxy.isSupport(timeRange)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), this, timeRange, "26");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return TimeRange.native_beginsTimeRangeWithEpsilon(this.nativeRef, p0, p1);
    }
    public TimeRange clone(){
       Object obj = PatchProxy.apply(null, this, TimeRange.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TimeRange.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public boolean containsRationalTime(RationalTime p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeRange.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TimeRange.native_containsRationalTime(this.nativeRef, p0);
    }
    public boolean containsTimeRange(TimeRange p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeRange.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TimeRange.native_containsTimeRange(this.nativeRef, p0);
    }
    public boolean containsTimeRangeWithEpsilon(TimeRange p0,double p1){
       TimeRange timeRange = TimeRange.class;
       if (PatchProxy.isSupport(timeRange)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), this, timeRange, "15");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return TimeRange.native_containsTimeRangeWithEpsilon(this.nativeRef, p0, p1);
    }
    public RationalTime duration(){
       Object obj = PatchProxy.apply(null, this, TimeRange.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TimeRange.native_duration(this.nativeRef);
    }
    public boolean equalToTimeRange(TimeRange p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeRange.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TimeRange.native_equalToTimeRange(this.nativeRef, p0);
    }
    public boolean finishesRationalTime(RationalTime p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeRange.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TimeRange.native_finishesRationalTime(this.nativeRef, p0);
    }
    public boolean finishesRationalTimeWithEpsilon(RationalTime p0,double p1){
       TimeRange timeRange = TimeRange.class;
       if (PatchProxy.isSupport(timeRange)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), this, timeRange, "32");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return TimeRange.native_finishesRationalTimeWithEpsilon(this.nativeRef, p0, p1);
    }
    public boolean finishesTimeRange(TimeRange p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeRange.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TimeRange.native_finishesTimeRange(this.nativeRef, p0);
    }
    public boolean finishesTimeRangeWithEpsilon(TimeRange p0,double p1){
       TimeRange timeRange = TimeRange.class;
       if (PatchProxy.isSupport(timeRange)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), this, timeRange, "30");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return TimeRange.native_finishesTimeRangeWithEpsilon(this.nativeRef, p0, p1);
    }
    public RationalTime getExclusiveEndTime(){
       Object obj = PatchProxy.apply(null, this, TimeRange.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TimeRange.native_getExclusiveEndTime(this.nativeRef);
    }
    public RationalTime getInclusiveEndTime(){
       Object obj = PatchProxy.apply(null, this, TimeRange.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TimeRange.native_getInclusiveEndTime(this.nativeRef);
    }
    public boolean intersectsTimeRange(TimeRange p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeRange.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TimeRange.native_intersectsTimeRange(this.nativeRef, p0);
    }
    public boolean intersectsTimeRangeWithEpsilon(TimeRange p0,double p1){
       TimeRange timeRange = TimeRange.class;
       if (PatchProxy.isSupport(timeRange)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), this, timeRange, "34");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return TimeRange.native_intersectsTimeRangeWithEpsilon(this.nativeRef, p0, p1);
    }
    public boolean meetsTimeRange(TimeRange p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeRange.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TimeRange.native_meetsTimeRange(this.nativeRef, p0);
    }
    public boolean meetsTimeRangeWithEpsilon(TimeRange p0,double p1){
       TimeRange timeRange = TimeRange.class;
       if (PatchProxy.isSupport(timeRange)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), this, timeRange, "24");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return TimeRange.native_meetsTimeRangeWithEpsilon(this.nativeRef, p0, p1);
    }
    public native final long native_create();
    public native final long native_create_with_start(RationalTime p0);
    public native final long native_create_with_start_and_duration(RationalTime p0,RationalTime p1);
    public boolean overlapsRationalTime(RationalTime p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeRange.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TimeRange.native_overlapsRationalTime(this.nativeRef, p0);
    }
    public boolean overlapsTimeRange(TimeRange p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeRange.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TimeRange.native_overlapsTimeRange(this.nativeRef, p0);
    }
    public boolean overlapsTimeRangeWithEpsilon(TimeRange p0,double p1){
       TimeRange timeRange = TimeRange.class;
       if (PatchProxy.isSupport(timeRange)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), this, timeRange, "18");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return TimeRange.native_overlapsTimeRangeWithEpsilon(this.nativeRef, p0, p1);
    }
    public RationalTime rationalTimeClamped(RationalTime p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeRange.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TimeRange.native_rationalTimeClamped(this.nativeRef, p0);
    }
    public RationalTime startTime(){
       Object obj = PatchProxy.apply(null, this, TimeRange.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TimeRange.native_startTime(this.nativeRef);
    }
    public TimeRange timeRangeClamped(TimeRange p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeRange.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TimeRange.native_timeRangeClamped(this.nativeRef, p0);
    }
    public TimeRange timeRangeExtendedBy(TimeRange p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeRange.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TimeRange.native_timeRangeExtendedBy(this.nativeRef, p0);
    }
    public TimeRange timeRangeExtendedByDuration(RationalTime p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeRange.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TimeRange.native_timeRangeExtendedByDuration(this.nativeRef, p0);
    }
}
