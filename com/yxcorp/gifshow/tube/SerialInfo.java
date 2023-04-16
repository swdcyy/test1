package com.yxcorp.gifshow.tube.SerialInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;
import ok.k;

public class SerialInfo implements Serializable	// class@001df0
{
    public boolean isCollected;
    public boolean isSerialCluster;
    public int mAdoptionType;
    public int mBusinessType;
    public SerialInfo$ClusterSerialCount mClusterSerialCount;
    public String mCollectName;
    public String mDetailPhotoTags;
    public String mEntranceDescription;
    public int mEpisodeCount;
    public String mExpTag;
    public String mLatestDescription;
    public String mLatestSeen;
    public String mMmuIpCover;
    public String mModuleTitle;
    public String mPanelDescription;
    public String mPanelTitle;
    public SerialInfo$RightTopCorner mRightTopCorner;
    public String mSerialId;
    public SerialInfo$SplitEntranceDescription mSplitEntranceDescription;
    public String mTitle;
    public String mTubeCopyrightInfo;
    public CDNUrl[] mTvLandscapeCover;
    public int mType;
    public static int ADOPTION_TYPE_COMMON = 2;
    public static int ADOPTION_TYPE_THEATRE = 3;
    public static final long serialVersionUID = 0x1423561c53807cb0;

    public void SerialInfo(){
       super();
       this.mExpTag = "";
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SerialInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p0 instanceof SerialInfo) {
          return false;
       }
       return TextUtils.equals(p0.mSerialId, this.mSerialId);
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, SerialInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (TextUtils.isEmpty(this.mSerialId)) {
          return super.hashCode();
       }
       obj = new Object[]{this.mSerialId};
       return k.b(obj);
    }
}
