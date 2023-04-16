package com.kuaishou.live.ad.social.LiveAdLogParamAppender;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import java.lang.String;
import com.kuaishou.live.ad.social.LiveAdConversionTaskDetail$AdInfo;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import vq4.d;
import java.lang.CharSequence;
import android.text.TextUtils;

public class LiveAdLogParamAppender implements AdDataWrapper$AdLogParamAppender	// class@000a04
{
    public final LiveAdConversionTaskDetail$AdInfo mAdInfo;
    public final String mChargeInfo;
    public final long mConversionId;
    public final long mConversionType;
    public final String mExtData;
    public final long mMissionId;
    public final long mOrderId;
    public final long mSceneId;
    public final int mSourceType;
    public final long mTaskId;
    public static final long serialVersionUID = 0x1afacab9d7f8d102;

    public void LiveAdLogParamAppender(int p0,long p1,long p2,long p3,long p4,long p5,long p6,String p7,String p8,LiveAdConversionTaskDetail$AdInfo p9){
       int i = this;
       super();
       i.mSourceType = p0;
       i.mConversionId = p1;
       i.mConversionType = p2;
       i.mSceneId = p3;
       i.mOrderId = p4;
       i.mMissionId = p5;
       i.mTaskId = p6;
       i.mExtData = p7;
       i.mChargeInfo = p8;
       i.mAdInfo = p9;
    }
    public void appendAdLogParam(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAdLogParamAppender.class, "1")) {
          return;
       }
       p0.d = this.mSourceType;
       c f = p0.F;
       f.e0 = this.mConversionId;
       f.l0 = this.mConversionType;
       f.k0 = this.mSceneId;
       p0.w = this.mOrderId;
       p0.T = this.mMissionId;
       p0.U = this.mTaskId;
       if (!TextUtils.isEmpty(this.mExtData)) {
          p0.z = this.mExtData;
       }
       if (!TextUtils.isEmpty(this.mChargeInfo)) {
          p0.c = this.mChargeInfo;
       }
       LiveAdLogParamAppender tmAdInfo = this.mAdInfo;
       if (tmAdInfo != null) {
          p0.b = tmAdInfo.mCreativeId;
          p0.h = tmAdInfo.mLlsid;
       }
       return;
    }
}
