package com.kwai.video.minecraft.model.TimeTransform;
import com.kwai.video.minecraft.model.ModelBase;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.NativeObjectManager;
import com.kwai.video.minecraft.model.RationalTime;
import com.kwai.video.minecraft.model.TimeRange;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;

public class TimeTransform extends ModelBase	// class@000a23
{

    public void TimeTransform(){
       super();
       long l = this.native_create();
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void TimeTransform(long p0){
       super();
       this.nativeRef = p0;
       NativeObjectManager.register(this, p0);
    }
    public void TimeTransform(RationalTime p0){
       super();
       long l = this.native_create_with_rationalTime(p0);
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void TimeTransform(RationalTime p0,double p1){
       super();
       long l = this.native_create_with_rationalTime_scale(p0, p1);
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public void TimeTransform(RationalTime p0,double p1,double p2){
       super();
       long l = this.native_create_with_rationalTime_scale_rate(p0, p1, p2);
       this.nativeRef = l;
       NativeObjectManager.register(this, l);
    }
    public static native RationalTime native_appliedToRationalTime(long p0,RationalTime p1);
    public static native TimeRange native_appliedToTimeRange(long p0,TimeRange p1);
    public static native TimeTransform native_appliedToTimeTransform(long p0,TimeTransform p1);
    public static native TimeTransform native_clone(long p0);
    public static native void native_destroy(long p0);
    public static native boolean native_isEqualToTimeTransform(long p0,TimeTransform p1);
    public static native RationalTime native_offset(long p0);
    public static native double native_rate(long p0);
    public static native double native_scale(long p0);
    public RationalTime appliedToRationalTime(RationalTime p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeTransform.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TimeTransform.native_appliedToRationalTime(this.nativeRef, p0);
    }
    public TimeRange appliedToTimeRange(TimeRange p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeTransform.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TimeTransform.native_appliedToTimeRange(this.nativeRef, p0);
    }
    public TimeTransform appliedToTimeTransform(TimeTransform p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeTransform.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TimeTransform.native_appliedToTimeTransform(this.nativeRef, p0);
    }
    public TimeTransform clone(){
       Object obj = PatchProxy.apply(null, this, TimeTransform.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TimeTransform.native_clone(this.nativeRef);
    }
    public Object clone(){
       return this.clone();
    }
    public boolean isEqualToTimeTransform(TimeTransform p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeTransform.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TimeTransform.native_isEqualToTimeTransform(this.nativeRef, p0);
    }
    public native final long native_create();
    public native final long native_create_with_rationalTime(RationalTime p0);
    public native final long native_create_with_rationalTime_scale(RationalTime p0,double p1);
    public native final long native_create_with_rationalTime_scale_rate(RationalTime p0,double p1,double p2);
    public RationalTime offset(){
       Object obj = PatchProxy.apply(null, this, TimeTransform.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TimeTransform.native_offset(this.nativeRef);
    }
    public double rate(){
       Object obj = PatchProxy.apply(null, this, TimeTransform.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return TimeTransform.native_rate(this.nativeRef);
    }
    public double scale(){
       Object obj = PatchProxy.apply(null, this, TimeTransform.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return TimeTransform.native_scale(this.nativeRef);
    }
}
