package com.kuaishou.android.model.mix.VideoQualityInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.VideoQualityInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.VideoQualityInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.model.mix.ScoreMark;
import com.kuaishou.android.model.mix.ScoreMark$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class VideoQualityInfo$$Parcelable implements Parcelable, d	// class@000e30
{
    public VideoQualityInfo videoQualityInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       VideoQualityInfo$$Parcelable.CREATOR = new VideoQualityInfo$$Parcelable$a();
    }
    public void VideoQualityInfo$$Parcelable(VideoQualityInfo p0){
       super();
       this.videoQualityInfo$$0 = p0;
    }
    public static VideoQualityInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          VideoQualityInfo videoQuality = new VideoQualityInfo();
          p1.f(p1.g(), videoQuality);
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(ScoreMark$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          videoQuality.mScoreMarkList = list;
          videoQuality.surveyId = p0.readString();
          videoQuality.mTitle = p0.readString();
          videoQuality.mType = p0.readString();
          p1.f(i, videoQuality);
          return videoQuality;
       }
    }
    public static void write(VideoQualityInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          VideoQualityInfo mScoreMarkLi = p0.mScoreMarkList;
          if (mScoreMarkLi == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mScoreMarkLi.size());
             Iterator iterator = p0.mScoreMarkList.iterator();
             while (iterator.hasNext()) {
                ScoreMark$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.surveyId);
          p1.writeString(p0.mTitle);
          p1.writeString(p0.mType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public VideoQualityInfo getParcel(){
       return this.videoQualityInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       VideoQualityInfo$$Parcelable.write(this.videoQualityInfo$$0, p0, p1, new a());
    }
}