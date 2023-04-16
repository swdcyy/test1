package com.kuaishou.android.model.mix.PlcEntryStyleInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdData;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData$$Parcelable;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo$$Parcelable;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$BizData;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$BizData$$Parcelable;

public class PlcEntryStyleInfo$$Parcelable implements Parcelable, d	// class@000d6e
{
    public PlcEntryStyleInfo plcEntryStyleInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       PlcEntryStyleInfo$$Parcelable.CREATOR = new PlcEntryStyleInfo$$Parcelable$a();
    }
    public void PlcEntryStyleInfo$$Parcelable(PlcEntryStyleInfo p0){
       super();
       this.plcEntryStyleInfo$$0 = p0;
    }
    public static PlcEntryStyleInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          PlcEntryStyleInfo plcEntryStyl = new PlcEntryStyleInfo();
          p1.f(p1.g(), plcEntryStyl);
          plcEntryStyl.photoPage = p0.readString();
          plcEntryStyl.showPageType = p0.readInt();
          plcEntryStyl.mBizType = p0.readInt();
          plcEntryStyl.mCategoryType = p0.readInt();
          plcEntryStyl.mAdData = p0.readSerializable();
          plcEntryStyl.mCachedTime = p0.readLong();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          plcEntryStyl.mForceShowOldKuaixiang = b;
          plcEntryStyl.mEventTrackData = PlcEntryStyleInfo$EventTrackData$$Parcelable.read(p0, p1);
          plcEntryStyl.mPageType = p0.readInt();
          plcEntryStyl.mStyleInfo = PlcEntryStyleInfo$StyleInfo$$Parcelable.read(p0, p1);
          plcEntryStyl.mBizData = PlcEntryStyleInfo$BizData$$Parcelable.read(p0, p1);
          p1.f(i, plcEntryStyl);
          return plcEntryStyl;
       }
    }
    public static void write(PlcEntryStyleInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.photoPage);
          p1.writeInt(p0.showPageType);
          p1.writeInt(p0.mBizType);
          p1.writeInt(p0.mCategoryType);
          p1.writeSerializable(p0.mAdData);
          p1.writeLong(p0.mCachedTime);
          p1.writeInt(p0.mForceShowOldKuaixiang);
          PlcEntryStyleInfo$EventTrackData$$Parcelable.write(p0.mEventTrackData, p1, p2, p3);
          p1.writeInt(p0.mPageType);
          PlcEntryStyleInfo$StyleInfo$$Parcelable.write(p0.mStyleInfo, p1, p2, p3);
          PlcEntryStyleInfo$BizData$$Parcelable.write(p0.mBizData, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public PlcEntryStyleInfo getParcel(){
       return this.plcEntryStyleInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       PlcEntryStyleInfo$$Parcelable.write(this.plcEntryStyleInfo$$0, p0, p1, new a());
    }
}
