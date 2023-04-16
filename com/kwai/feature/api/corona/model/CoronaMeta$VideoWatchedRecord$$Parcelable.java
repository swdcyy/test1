package com.kwai.feature.api.corona.model.CoronaMeta$VideoWatchedRecord$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.corona.model.CoronaMeta$VideoWatchedRecord$$Parcelable$a;
import com.kwai.feature.api.corona.model.CoronaMeta$VideoWatchedRecord;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.QPhoto$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class CoronaMeta$VideoWatchedRecord$$Parcelable implements Parcelable, d	// class@000df9
{
    public CoronaMeta$VideoWatchedRecord videoWatchedRecord$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaMeta$VideoWatchedRecord$$Parcelable.CREATOR = new CoronaMeta$VideoWatchedRecord$$Parcelable$a();
    }
    public void CoronaMeta$VideoWatchedRecord$$Parcelable(CoronaMeta$VideoWatchedRecord p0){
       super();
       this.videoWatchedRecord$$0 = p0;
    }
    public static CoronaMeta$VideoWatchedRecord read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CoronaMeta$VideoWatchedRecord videoWatched = new CoronaMeta$VideoWatchedRecord();
          p1.f(p1.g(), videoWatched);
          int i1 = p0.readInt();
          boolean b = false;
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(QPhoto$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          videoWatched.mWatchedPhotoList = list;
          if (p0.readInt() == 1) {
             b = true;
          }
          videoWatched.mEnableRecordWatchRecord = b;
          p1.f(i, videoWatched);
          return videoWatched;
       }
    }
    public static void write(CoronaMeta$VideoWatchedRecord p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          CoronaMeta$VideoWatchedRecord mWatchedPhot = p0.mWatchedPhotoList;
          if (mWatchedPhot == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mWatchedPhot.size());
             Iterator iterator = p0.mWatchedPhotoList.iterator();
             while (iterator.hasNext()) {
                QPhoto$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mEnableRecordWatchRecord);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaMeta$VideoWatchedRecord getParcel(){
       return this.videoWatchedRecord$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaMeta$VideoWatchedRecord$$Parcelable.write(this.videoWatchedRecord$$0, p0, p1, new a());
    }
}
