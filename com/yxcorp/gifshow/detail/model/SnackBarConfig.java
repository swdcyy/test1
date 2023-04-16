package com.yxcorp.gifshow.detail.model.SnackBarConfig;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class SnackBarConfig	// class@00158a
{
    public final int mDayLimit;
    public final boolean mEnablePicture;
    public final int mMonthLimit;
    public final int mNewFollowTriggerCount;
    public final String mTitle;
    public final String mToast;
    public final int mWeekLimit;

    public final String a(){
       return this.mTitle;
    }
    public final String b(){
       return this.mToast;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SnackBarConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof SnackBarConfig && (a.g(this.mTitle, p0.mTitle) && (a.g(this.mToast, p0.mToast) && (this.mEnablePicture == p0.mEnablePicture && (this.mNewFollowTriggerCount == p0.mNewFollowTriggerCount && (this.mDayLimit == p0.mDayLimit && (this.mWeekLimit == p0.mWeekLimit && this.mMonthLimit == p0.mMonthLimit)))))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       SnackBarConfig obj = PatchProxy.apply(null, this, SnackBarConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mTitle;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       SnackBarConfig tmToast = this.mToast;
       if (tmToast != null) {
          i = tmToast.hashCode();
       }
       i1 = (i1 + i) * 31;
       SnackBarConfig tmEnablePict = this.mEnablePicture;
       if (tmEnablePict != null) {
          tmEnablePict = 1;
       }
       return (((((((((i1 + tmEnablePict) * 31) + this.mNewFollowTriggerCount) * 31) + this.mDayLimit) * 31) + this.mWeekLimit) * 31) + this.mMonthLimit);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SnackBarConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SnackBarConfig\(mTitle="+this.mTitle+", mToast="+this.mToast+", mEnablePicture="+this.mEnablePicture+", mNewFollowTriggerCount="+this.mNewFollowTriggerCount+", mDayLimit="+this.mDayLimit+", mWeekLimit="+this.mWeekLimit+", mMonthLimit="+this.mMonthLimit+"\)";
    }
}
