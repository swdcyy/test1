package com.kwai.component.photo.detail.slide.model.GeneralBottomBarInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.component.photo.detail.slide.model.GeneralBottomBarInfo$$Parcelable$a;
import com.kwai.component.photo.detail.slide.model.GeneralBottomBarInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.component.photo.detail.slide.model.GeneralBottomBarInfo$BottomStyleInfo;
import com.kwai.component.photo.detail.slide.model.GeneralBottomBarInfo$BottomStyleInfo$$Parcelable;
import java.util.HashMap;
import xwd.b;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class GeneralBottomBarInfo$$Parcelable implements Parcelable, d	// class@000a63
{
    public GeneralBottomBarInfo generalBottomBarInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       GeneralBottomBarInfo$$Parcelable.CREATOR = new GeneralBottomBarInfo$$Parcelable$a();
    }
    public void GeneralBottomBarInfo$$Parcelable(GeneralBottomBarInfo p0){
       super();
       this.generalBottomBarInfo$$0 = p0;
    }
    public static GeneralBottomBarInfo read(Parcel p0,a p1){
       Map map;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          GeneralBottomBarInfo generalBotto = new GeneralBottomBarInfo();
          p1.f(p1.g(), generalBotto);
          generalBotto.mFeedType = p0.readString();
          generalBotto.mId = p0.readString();
          generalBotto.mBottomBizType = p0.readInt();
          generalBotto.mBottomStyleInfo = GeneralBottomBarInfo$BottomStyleInfo$$Parcelable.read(p0, p1);
          int i1 = p0.readInt();
          if (i1 < 0) {
             map = null;
          }else {
             HashMap hashMap = new HashMap(b.a(i1));
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                hashMap.put(p0.readString(), p0.readString());
             }
             map = hashMap;
          }
          generalBotto.mEventTrackData = map;
          p1.f(i, generalBotto);
          return generalBotto;
       }
    }
    public static void write(GeneralBottomBarInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mFeedType);
          p1.writeString(p0.mId);
          p1.writeInt(p0.mBottomBizType);
          GeneralBottomBarInfo$BottomStyleInfo$$Parcelable.write(p0.mBottomStyleInfo, p1, p2, p3);
          GeneralBottomBarInfo mEventTrackD = p0.mEventTrackData;
          if (mEventTrackD == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mEventTrackD.size());
             Iterator iterator = p0.mEventTrackData.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                p1.writeString(uEntry.getValue());
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public GeneralBottomBarInfo getParcel(){
       return this.generalBottomBarInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       GeneralBottomBarInfo$$Parcelable.write(this.generalBottomBarInfo$$0, p0, p1, new a());
    }
}
