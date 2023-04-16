package com.yxcorp.gifshow.nasa.NasaSlideSerialParam;
import com.yxcorp.gifshow.nasa.NasaSlideSerialParam$b;
import java.lang.Object;
import java.lang.System;
import com.yxcorp.gifshow.nasa.NasaSlideSerialParam$a;

public class NasaSlideSerialParam	// class@0020ca
{
    public final String mCommercialActiveCallback;
    public final String mContinueSessionID;
    public final long mCreateTimeStamp;
    public long mFlowPresenterStartTimeStamp;
    public final boolean mIsAutoShowPanel;
    public final boolean mIsClusterSerial;
    public final boolean mIsFromProfileSerialBtnOrItem;
    public final boolean mIsFromScheme;
    public boolean mLogReported;
    public long mNetApiStartTimeStamp;
    public long mNetApiStopTimeStamp;
    public final String mPhotoPage;
    public QPhoto mPreCommercialPhoto;
    public final String mSerialContext;
    public final String mSerialId;
    public final int mSerialType;
    public long mViewRenderCompleteTimeStamp;

    public void NasaSlideSerialParam(){
       super(new NasaSlideSerialParam$b());
    }
    public void NasaSlideSerialParam(NasaSlideSerialParam$b p0){
       super();
       this.mSerialId = p0.b;
       this.mSerialType = p0.c;
       this.mSerialContext = p0.d;
       this.mPhotoPage = p0.e;
       this.mIsClusterSerial = p0.a;
       this.mContinueSessionID = p0.f;
       this.mCommercialActiveCallback = p0.j;
       this.mIsFromProfileSerialBtnOrItem = p0.g;
       this.mIsAutoShowPanel = p0.h;
       this.mIsFromScheme = p0.i;
       this.mPreCommercialPhoto = p0.k;
       this.mCreateTimeStamp = System.currentTimeMillis();
    }
    public void NasaSlideSerialParam(NasaSlideSerialParam$b p0,NasaSlideSerialParam$a p1){
       super(p0);
    }
}
