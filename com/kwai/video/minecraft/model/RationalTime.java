package com.kwai.video.minecraft.model.RationalTime;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Double;
import java.lang.Boolean;
import java.lang.Number;

public class RationalTime extends ModelBase	// class@000a1f
{

    public void RationalTime(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void RationalTime(double p0,double p1){
       super();
       long l = this.native_create_with_value_rate(p0, p1);
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void RationalTime(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public static RationalTime durationFromStartToEndTime(RationalTime p0,RationalTime p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RationalTime.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RationalTime.native_durationFromStartToEndTime(p0, p1);
    }
    public static RationalTime durationFromStartToInclusiveEndTime(RationalTime p0,RationalTime p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, RationalTime.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RationalTime.native_durationFromStartToInclusiveEndTime(p0, p1);
    }
    public static RationalTime fromFramesWithRate(double p0,double p1){
       RationalTime rationalTime = RationalTime.class;
       if (PatchProxy.isSupport(rationalTime)) {
          Object obj = PatchProxy.applyTwoRefs(Double.valueOf(p0), Double.valueOf(p1), null, rationalTime, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return RationalTime.native_fromFramesWithRate(p0, p1);
    }
    public static RationalTime fromSeconds(double p0){
       RationalTime rationalTime = RationalTime.class;
       if (PatchProxy.isSupport(rationalTime)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), null, rationalTime, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return RationalTime.native_fromSeconds(p0);
    }
    public static RationalTime fromSecondsWithRate(double p0,double p1){
       RationalTime rationalTime = RationalTime.class;
       if (PatchProxy.isSupport(rationalTime)) {
          Object obj = PatchProxy.applyTwoRefs(Double.valueOf(p0), Double.valueOf(p1), null, rationalTime, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return RationalTime.native_fromSecondsWithRate(p0, p1);
    }
    public static boolean isValidTimecodeRate(double p0){
       RationalTime rationalTime = RationalTime.class;
       if (PatchProxy.isSupport(rationalTime)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), null, rationalTime, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return RationalTime.native_isValidTimecodeRate(p0);
    }
    public static native void native_addRationalTime(long p0,RationalTime p1);
    public static native boolean native_almostEqualTo(long p0,RationalTime p1,double p2);
    public static native RationalTime native_clone(long p0);
    public static native int native_compareTo(long p0,RationalTime p1);
    public static native void native_destroy(long p0);
    public static native RationalTime native_durationFromStartToEndTime(RationalTime p0,RationalTime p1);
    public static native RationalTime native_durationFromStartToInclusiveEndTime(RationalTime p0,RationalTime p1);
    public static native RationalTime native_fromFramesWithRate(double p0,double p1);
    public static native RationalTime native_fromSeconds(double p0);
    public static native RationalTime native_fromSecondsWithRate(double p0,double p1);
    public static native boolean native_invalidTime(long p0);
    public static native boolean native_isValidTimecodeRate(double p0);
    public static native double native_nearestValidTimecodeRate(double p0);
    public static native double native_rate(long p0);
    public static native RationalTime native_rescaledToNewRate(long p0,double p1);
    public static native RationalTime native_rescaledToRationalTime(long p0,RationalTime p1);
    public static native void native_subRationalTime(long p0,RationalTime p1);
    public static native int native_toFrames(long p0);
    public static native int native_toFramesWithRate(long p0,double p1);
    public static native double native_toSeconds(long p0);
    public static native String native_toTimeString(long p0);
    public static native double native_value(long p0);
    public static native double native_valueRescaledToNewRate(long p0,double p1);
    public static native double native_valueRescaledToRationalTime(long p0,RationalTime p1);
    public static double nearestValidTimecodeRate(double p0){
       RationalTime rationalTime = RationalTime.class;
       if (PatchProxy.isSupport(rationalTime)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), null, rationalTime, "5");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       return RationalTime.native_nearestValidTimecodeRate(p0);
    }
    public void addRationalTime(RationalTime p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RationalTime.class, "22")) {
          return;
       }
       RationalTime.native_addRationalTime(this.nativeRef, p0);
       return;
    }
    public boolean almostEqualTo(RationalTime p0,double p1){
       RationalTime rationalTime = RationalTime.class;
       if (PatchProxy.isSupport(rationalTime)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), this, rationalTime, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return RationalTime.native_almostEqualTo(this.nativeRef, p0, p1);
    }
    public RationalTime clone(){
       Object obj = PatchProxy.apply(null, this, RationalTime.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RationalTime.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public int compareTo(RationalTime p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RationalTime.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return RationalTime.native_compareTo(this.nativeRef, p0);
    }
    public boolean invalidTime(){
       Object obj = PatchProxy.apply(null, this, RationalTime.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return RationalTime.native_invalidTime(this.nativeRef);
    }
    public native final long native_create();
    public native final long native_create_with_value_rate(double p0,double p1);
    public double rate(){
       Object obj = PatchProxy.apply(null, this, RationalTime.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return RationalTime.native_rate(this.nativeRef);
    }
    public RationalTime rescaledToNewRate(double p0){
       RationalTime rationalTime = RationalTime.class;
       if (PatchProxy.isSupport(rationalTime)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, rationalTime, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return RationalTime.native_rescaledToNewRate(this.nativeRef, p0);
    }
    public RationalTime rescaledToRationalTime(RationalTime p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RationalTime.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RationalTime.native_rescaledToRationalTime(this.nativeRef, p0);
    }
    public void subtrackRationalTime(RationalTime p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RationalTime.class, "23")) {
          return;
       }
       RationalTime.native_subRationalTime(this.nativeRef, p0);
       return;
    }
    public int toFrames(){
       Object obj = PatchProxy.apply(null, this, RationalTime.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return RationalTime.native_toFrames(this.nativeRef);
    }
    public int toFramesWithRate(double p0){
       RationalTime rationalTime = RationalTime.class;
       if (PatchProxy.isSupport(rationalTime)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, rationalTime, "19");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return RationalTime.native_toFramesWithRate(this.nativeRef, p0);
    }
    public double toSeconds(){
       Object obj = PatchProxy.apply(null, this, RationalTime.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return RationalTime.native_toSeconds(this.nativeRef);
    }
    public String toTimeString(){
       Object obj = PatchProxy.apply(null, this, RationalTime.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RationalTime.native_toTimeString(this.nativeRef);
    }
    public double value(){
       Object obj = PatchProxy.apply(null, this, RationalTime.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return RationalTime.native_value(this.nativeRef);
    }
    public double valueRescaledToNewRate(double p0){
       RationalTime rationalTime = RationalTime.class;
       if (PatchProxy.isSupport(rationalTime)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, rationalTime, "14");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       return RationalTime.native_valueRescaledToNewRate(this.nativeRef, p0);
    }
    public double valueRescaledToRationalTime(RationalTime p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RationalTime.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return RationalTime.native_valueRescaledToRationalTime(this.nativeRef, p0);
    }
}
