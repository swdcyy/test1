package com.yxcorp.gifshow.bottom.sheet.BottomSheetParams;
import java.lang.Object;
import lnc.a1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Throwable;
import com.yxcorp.gifshow.bottom.sheet.f;
import java.lang.Long;
import java.lang.StringBuilder;

public final class BottomSheetParams	// class@001c61
{
    public boolean mBackPressCancelable;
    public int mBackgroundColor;
    public float mBackgroundDimAmount;
    public int mBottomMargin;
    public int mContainerLayout;
    public int mContentHeight;
    public boolean mDragDisable;
    public int mExpandAnimDuration;
    public boolean mIsSoftInputEnabled;
    public final boolean mIsStateless;
    public boolean mNeedPageLogger;
    public boolean mOutsideCancelable;
    public long mSurviveTimeMs;

    public void BottomSheetParams(boolean p0){
       super();
       this.mSurviveTimeMs = 100;
       this.mContainerLayout = 0x7f0d0122;
       this.mContentHeight = -2;
       this.mBackgroundDimAmount = 0x3f800000;
       this.mBackgroundColor = a1.a(0x7f061c12);
       this.mOutsideCancelable = true;
       this.mBackPressCancelable = true;
       this.mBottomMargin = 0;
       this.mExpandAnimDuration = 132;
       this.mIsStateless = p0;
    }
    public static BottomSheetParams ofStateful(){
       BottomSheetParams obj = PatchProxy.apply(null, null, BottomSheetParams.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new BottomSheetParams(false);
       obj.setSurviveTimeMs(1000);
       return obj;
    }
    public static BottomSheetParams ofStateless(){
       BottomSheetParams obj = PatchProxy.apply(null, null, BottomSheetParams.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new BottomSheetParams(true);
       obj.setSurviveTimeMs(50);
       return obj;
    }
    public BottomSheetParams setBackground(int p0,float p1){
       this.mBackgroundColor = p0;
       this.mBackgroundDimAmount = p1;
       return this;
    }
    public BottomSheetParams setBottomMargin(int p0){
       this.mBottomMargin = p0;
       return this;
    }
    public BottomSheetParams setCancelable(boolean p0,boolean p1){
       this.mOutsideCancelable = p0;
       this.mBackPressCancelable = p1;
       return this;
    }
    public BottomSheetParams setContainerLayout(int p0){
       this.mContainerLayout = p0;
       return this;
    }
    public BottomSheetParams setContentHeight(int p0){
       BottomSheetParams uBottomSheet = BottomSheetParams.class;
       if (PatchProxy.isSupport(uBottomSheet)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uBottomSheet, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 < -2) {
          Object[] objArray = new Object[]{Integer.valueOf(p0)};
          f.e(null, "Content height[%1$s] is invalidate ", objArray);
          p0 = -2;
       }
       this.mContentHeight = p0;
       return this;
    }
    public BottomSheetParams setDragDisable(boolean p0){
       this.mDragDisable = p0;
       return this;
    }
    public BottomSheetParams setExpandAnimDuration(int p0){
       this.mExpandAnimDuration = p0;
       return this;
    }
    public BottomSheetParams setIsSoftInputEnabled(boolean p0){
       this.mIsSoftInputEnabled = p0;
       return this;
    }
    public BottomSheetParams setNeedPageLogger(boolean p0){
       this.mNeedPageLogger = p0;
       return this;
    }
    public BottomSheetParams setSurviveTimeMs(long p0){
       Object[] objArray;
       BottomSheetParams uBottomSheet = BottomSheetParams.class;
       if (PatchProxy.isSupport(uBottomSheet)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uBottomSheet, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.mIsStateless != null) {
          if (p0 - 50 < 0 || p0 - 100 > 0) {
             objArray = new Object[]{Integer.valueOf(50),Integer.valueOf(100)};
             f.e(null, "Stateless survive time should  limit in [%1$s, %2$s]", objArray);
          label_0044 :
             objArray = 100;
          }
       }else if(p0 && p0 - 100 < 0){
          objArray = new Object[]{Long.valueOf(this.mSurviveTimeMs)};
          f.e(null, "Stateful survive time should not limits [%1$s, oo\) or set 0 means can not be destroyed", objArray);
          goto label_0044 ;
       }
       this.mSurviveTimeMs = objArray;
       return this;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, BottomSheetParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BottomSheetParams{mIsStateless="+this.mIsStateless+", mSurviveTimeMs="+this.mSurviveTimeMs+", mNeedPageLogger="+this.mNeedPageLogger+", mContainerLayout="+this.mContainerLayout+", mContentHeight="+this.mContentHeight+", mBackgroundDimAmount="+this.mBackgroundDimAmount+", mBackgroundColor="+this.mBackgroundColor+", mCancelable="+this.mOutsideCancelable+", mCanceledOnTouchOutside="+this.mBackPressCancelable+'}';
    }
}
