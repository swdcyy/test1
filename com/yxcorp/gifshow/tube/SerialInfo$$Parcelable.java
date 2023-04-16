package com.yxcorp.gifshow.tube.SerialInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.tube.SerialInfo$$Parcelable$a;
import com.yxcorp.gifshow.tube.SerialInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.tube.SerialInfo$SplitEntranceDescription;
import com.yxcorp.gifshow.tube.SerialInfo$SplitEntranceDescription$$Parcelable;
import com.yxcorp.gifshow.tube.SerialInfo$ClusterSerialCount;
import com.yxcorp.gifshow.tube.SerialInfo$ClusterSerialCount$$Parcelable;
import com.yxcorp.gifshow.tube.SerialInfo$RightTopCorner;
import com.yxcorp.gifshow.tube.SerialInfo$RightTopCorner$$Parcelable;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.model.CDNUrl$$Parcelable;

public class SerialInfo$$Parcelable implements Parcelable, d	// class@001de2
{
    public SerialInfo serialInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SerialInfo$$Parcelable.CREATOR = new SerialInfo$$Parcelable$a();
    }
    public void SerialInfo$$Parcelable(SerialInfo p0){
       super();
       this.serialInfo$$0 = p0;
    }
    public static SerialInfo read(Parcel p0,a p1){
       CDNUrl[] uCDNUrlArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          SerialInfo serialInfo = new SerialInfo();
          p1.f(p1.g(), serialInfo);
          serialInfo.mSplitEntranceDescription = SerialInfo$SplitEntranceDescription$$Parcelable.read(p0, p1);
          serialInfo.mSerialId = p0.readString();
          serialInfo.mMmuIpCover = p0.readString();
          serialInfo.mClusterSerialCount = SerialInfo$ClusterSerialCount$$Parcelable.read(p0, p1);
          serialInfo.mAdoptionType = p0.readInt();
          serialInfo.mEpisodeCount = p0.readInt();
          serialInfo.mCollectName = p0.readString();
          serialInfo.mTubeCopyrightInfo = p0.readString();
          serialInfo.mModuleTitle = p0.readString();
          serialInfo.mRightTopCorner = SerialInfo$RightTopCorner$$Parcelable.read(p0, p1);
          serialInfo.mType = p0.readInt();
          serialInfo.mDetailPhotoTags = p0.readString();
          serialInfo.mLatestSeen = p0.readString();
          boolean i1 = p0.readInt();
          boolean b = false;
          if (i1 < 0) {
             uCDNUrlArray = null;
          }else {
             CDNUrl[] uCDNUrlArray1 = new CDNUrl[i1];
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uCDNUrlArray1[i2] = CDNUrl$$Parcelable.read(p0, p1);
             }
             uCDNUrlArray = uCDNUrlArray1;
          }
          serialInfo.mTvLandscapeCover = uCDNUrlArray;
          i1 = (p0.readInt() == 1)? true: false;
          serialInfo.isSerialCluster = i1;
          serialInfo.mPanelTitle = p0.readString();
          serialInfo.mTitle = p0.readString();
          serialInfo.mEntranceDescription = p0.readString();
          serialInfo.mBusinessType = p0.readInt();
          serialInfo.mPanelDescription = p0.readString();
          serialInfo.mExpTag = p0.readString();
          serialInfo.mLatestDescription = p0.readString();
          if (p0.readInt() == 1) {
             b = true;
          }
          serialInfo.isCollected = b;
          p1.f(i, serialInfo);
          return serialInfo;
       }
    }
    public static void write(SerialInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          SerialInfo$SplitEntranceDescription$$Parcelable.write(p0.mSplitEntranceDescription, p1, p2, p3);
          p1.writeString(p0.mSerialId);
          p1.writeString(p0.mMmuIpCover);
          SerialInfo$ClusterSerialCount$$Parcelable.write(p0.mClusterSerialCount, p1, p2, p3);
          p1.writeInt(p0.mAdoptionType);
          p1.writeInt(p0.mEpisodeCount);
          p1.writeString(p0.mCollectName);
          p1.writeString(p0.mTubeCopyrightInfo);
          p1.writeString(p0.mModuleTitle);
          SerialInfo$RightTopCorner$$Parcelable.write(p0.mRightTopCorner, p1, p2, p3);
          p1.writeInt(p0.mType);
          p1.writeString(p0.mDetailPhotoTags);
          p1.writeString(p0.mLatestSeen);
          SerialInfo mTvLandscape = p0.mTvLandscapeCover;
          if (mTvLandscape == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mTvLandscape.length);
             mTvLandscape = p0.mTvLandscapeCover;
             i1 = mTvLandscape.length;
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                CDNUrl$$Parcelable.write(mTvLandscape[i2], p1, p2, p3);
             }
          }
          p1.writeInt(p0.isSerialCluster);
          p1.writeString(p0.mPanelTitle);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mEntranceDescription);
          p1.writeInt(p0.mBusinessType);
          p1.writeString(p0.mPanelDescription);
          p1.writeString(p0.mExpTag);
          p1.writeString(p0.mLatestDescription);
          p1.writeInt(p0.isCollected);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SerialInfo getParcel(){
       return this.serialInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SerialInfo$$Parcelable.write(this.serialInfo$$0, p0, p1, new a());
    }
}
