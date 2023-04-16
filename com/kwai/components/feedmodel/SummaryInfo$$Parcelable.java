package com.kwai.components.feedmodel.SummaryInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.components.feedmodel.SummaryInfo$$Parcelable$a;
import com.kwai.components.feedmodel.SummaryInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.io.Serializable;
import com.kwai.components.feedmodel.SummaryInfo$SummaryExtInfo;

public class SummaryInfo$$Parcelable implements Parcelable, d	// class@000c42
{
    public SummaryInfo summaryInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SummaryInfo$$Parcelable.CREATOR = new SummaryInfo$$Parcelable$a();
    }
    public void SummaryInfo$$Parcelable(SummaryInfo p0){
       super();
       this.summaryInfo$$0 = p0;
    }
    public static SummaryInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          SummaryInfo summaryInfo = new SummaryInfo();
          p1.f(p1.g(), summaryInfo);
          summaryInfo.mResultTitle = p0.readString();
          summaryInfo.mSlideTitle = p0.readString();
          summaryInfo.mCommentTitle = p0.readString();
          summaryInfo.mSummaryPosition = p0.readLong();
          summaryInfo.mMaxLines = p0.readInt();
          summaryInfo.mSummaryNote = p0.readString();
          summaryInfo.mExtInfo = p0.readSerializable();
          p1.f(i, summaryInfo);
          return summaryInfo;
       }
    }
    public static void write(SummaryInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mResultTitle);
          p1.writeString(p0.mSlideTitle);
          p1.writeString(p0.mCommentTitle);
          p1.writeLong(p0.mSummaryPosition);
          p1.writeInt(p0.mMaxLines);
          p1.writeString(p0.mSummaryNote);
          p1.writeSerializable(p0.mExtInfo);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SummaryInfo getParcel(){
       return this.summaryInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SummaryInfo$$Parcelable.write(this.summaryInfo$$0, p0, p1, new a());
    }
}
