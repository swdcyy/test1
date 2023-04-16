package com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdEventTrackData$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdEventTrackData$$Parcelable$a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdEventTrackData;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$Track;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$Track$$Parcelable;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TrackInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TrackInfo$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class PlcEntryStyleInfo$AdEventTrackData$$Parcelable implements Parcelable, d	// class@000d76
{
    public PlcEntryStyleInfo$AdEventTrackData adEventTrackData$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PlcEntryStyleInfo$AdEventTrackData$$Parcelable.CREATOR = new PlcEntryStyleInfo$AdEventTrackData$$Parcelable$a();
    }
    public void PlcEntryStyleInfo$AdEventTrackData$$Parcelable(PlcEntryStyleInfo$AdEventTrackData p0){
       super();
       this.adEventTrackData$$0 = p0;
    }
    public static PlcEntryStyleInfo$AdEventTrackData read(Parcel p0,a p1){
       List list1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PlcEntryStyleInfo$AdEventTrackData uAdEventTrac = new PlcEntryStyleInfo$AdEventTrackData();
          p1.f(p1.g(), uAdEventTrac);
          uAdEventTrac.mMissionId = p0.readLong();
          uAdEventTrac.mLiveReservationAuthorId = p0.readLong();
          uAdEventTrac.mLlsid = p0.readLong();
          uAdEventTrac.mReportTrackInfoTime = p0.readLong();
          uAdEventTrac.mPoiId = p0.readLong();
          uAdEventTrac.mPageId = p0.readLong();
          uAdEventTrac.mAdPos = p0.readInt();
          uAdEventTrac.mExtData = p0.readString();
          uAdEventTrac.mTemplateType = p0.readInt();
          uAdEventTrac.mPlcExtData = p0.readString();
          int i1 = p0.readInt();
          List list = null;
          int i2 = 0;
          if (i1 < 0) {
             list1 = list;
          }else {
             list1 = new ArrayList(i1);
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                list1.add(PlcEntryStyleInfo$Track$$Parcelable.read(p0, p1));
             }
          }
          uAdEventTrac.mAdTracks = list1;
          uAdEventTrac.mAdType = p0.readInt();
          uAdEventTrac.mLiveStreamId = p0.readString();
          uAdEventTrac.mLiveStatus = p0.readInt();
          uAdEventTrac.mTrafficSource = p0.readString();
          uAdEventTrac.mAdvertiserUserId = p0.readLong();
          uAdEventTrac.mCreativeId = p0.readLong();
          uAdEventTrac.mOrderSource = p0.readString();
          uAdEventTrac.mTaskId = p0.readLong();
          uAdEventTrac.mSourceType = p0.readInt();
          uAdEventTrac.mSubPageId = p0.readLong();
          uAdEventTrac.mLiveReservationStatus = p0.readInt();
          uAdEventTrac.mGridPos = p0.readInt();
          uAdEventTrac.mOrderId = p0.readLong();
          uAdEventTrac.mLiveReservationId = p0.readString();
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (; i2 < i1; i2 = i2 + 1) {
                list.add(PlcEntryStyleInfo$TrackInfo$$Parcelable.read(p0, p1));
             }
          }
          uAdEventTrac.mAdTrackInfos = list;
          uAdEventTrac.mChargeInfo = p0.readString();
          uAdEventTrac.mCoverId = p0.readLong();
          uAdEventTrac.mAdOperationType = p0.readInt();
          uAdEventTrac.mGridUnitId = p0.readString();
          p1.f(i, uAdEventTrac);
          return uAdEventTrac;
       }
    }
    public static void write(PlcEntryStyleInfo$AdEventTrackData p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeLong(p0.mMissionId);
          p1.writeLong(p0.mLiveReservationAuthorId);
          p1.writeLong(p0.mLlsid);
          p1.writeLong(p0.mReportTrackInfoTime);
          p1.writeLong(p0.mPoiId);
          p1.writeLong(p0.mPageId);
          p1.writeInt(p0.mAdPos);
          p1.writeString(p0.mExtData);
          p1.writeInt(p0.mTemplateType);
          p1.writeString(p0.mPlcExtData);
          PlcEntryStyleInfo$AdEventTrackData mAdTracks = p0.mAdTracks;
          if (mAdTracks == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mAdTracks.size());
             iterator = p0.mAdTracks.iterator();
             while (iterator.hasNext()) {
                PlcEntryStyleInfo$Track$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mAdType);
          p1.writeString(p0.mLiveStreamId);
          p1.writeInt(p0.mLiveStatus);
          p1.writeString(p0.mTrafficSource);
          p1.writeLong(p0.mAdvertiserUserId);
          p1.writeLong(p0.mCreativeId);
          p1.writeString(p0.mOrderSource);
          p1.writeLong(p0.mTaskId);
          p1.writeInt(p0.mSourceType);
          p1.writeLong(p0.mSubPageId);
          p1.writeInt(p0.mLiveReservationStatus);
          p1.writeInt(p0.mGridPos);
          p1.writeLong(p0.mOrderId);
          p1.writeString(p0.mLiveReservationId);
          mAdTracks = p0.mAdTrackInfos;
          if (mAdTracks == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mAdTracks.size());
             iterator = p0.mAdTrackInfos.iterator();
             while (iterator.hasNext()) {
                PlcEntryStyleInfo$TrackInfo$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mChargeInfo);
          p1.writeLong(p0.mCoverId);
          p1.writeInt(p0.mAdOperationType);
          p1.writeString(p0.mGridUnitId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PlcEntryStyleInfo$AdEventTrackData getParcel(){
       return this.adEventTrackData$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PlcEntryStyleInfo$AdEventTrackData$$Parcelable.write(this.adEventTrackData$$0, p0, p1, new a());
    }
}
