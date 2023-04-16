package com.kwai.feature.api.corona.model.CoronaMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.corona.model.CoronaMeta$$Parcelable$a;
import com.kwai.feature.api.corona.model.CoronaMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Boolean;
import java.io.Serializable;
import com.kwai.feature.api.corona.model.CoronaTvFilm;
import com.kwai.feature.api.corona.model.CoronaActivityStrip;
import com.kwai.feature.api.corona.model.CoronaTvSerial;
import java.util.ArrayList;
import com.kwai.feature.api.corona.model.CoronaMeta$CoronaTag;
import com.kwai.feature.api.corona.model.CoronaMeta$CoronaTag$$Parcelable;
import com.kwai.feature.api.corona.model.CoronaMeta$TalkTag;
import com.kwai.feature.api.corona.model.CoronaMeta$TalkTag$$Parcelable;
import com.kuaishou.android.model.mix.HorizontalHolidayEggsInfo;
import com.kuaishou.android.model.mix.HorizontalHolidayEggsInfo$$Parcelable;
import com.kwai.feature.api.corona.model.CoronaTube;
import java.util.List;
import java.util.Iterator;

public class CoronaMeta$$Parcelable implements Parcelable, d	// class@000df1
{
    public CoronaMeta coronaMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       CoronaMeta$$Parcelable.CREATOR = new CoronaMeta$$Parcelable$a();
    }
    public void CoronaMeta$$Parcelable(CoronaMeta p0){
       super();
       this.coronaMeta$$0 = p0;
    }
    public static CoronaMeta read(Parcel p0,a p1){
       Boolean uBoolean;
       boolean b1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          CoronaMeta uCoronaMeta = new CoronaMeta();
          p1.f(p1.g(), uCoronaMeta);
          List list = null;
          boolean b = false;
          if (p0.readInt() < 0) {
             uBoolean = list;
          }else if(p0.readInt() == 1){
             b1 = true;
          }else {
             b1 = false;
          }
          uBoolean = Boolean.valueOf(b1);
          uCoronaMeta.isSpecialPhoto = uBoolean;
          uCoronaMeta.mCoronaTvFilm = p0.readSerializable();
          uCoronaMeta.mCoronaActivityStrip = p0.readSerializable();
          b1 = (p0.readInt() == 1)? true: false;
          uCoronaMeta.isLater = b1;
          uCoronaMeta.mCoronaTvSerial = p0.readSerializable();
          b1 = (p0.readInt() == 1)? true: false;
          uCoronaMeta.isTitleChanged = b1;
          uCoronaMeta.mStartPlaySource = p0.readString();
          b1 = p0.readInt();
          if (b1 >= 0) {
             list = new ArrayList(b1);
             for (int i1 = 0; i1 < b1; i1 = i1 + 1) {
                list.add(CoronaMeta$CoronaTag$$Parcelable.read(p0, p1));
             }
          }
          uCoronaMeta.mCoronaTags = list;
          uCoronaMeta.mTalkTag = CoronaMeta$TalkTag$$Parcelable.read(p0, p1);
          b1 = (p0.readInt() == 1)? true: false;
          uCoronaMeta.isEnterFloatWindowFromLandscape = b1;
          if (p0.readInt() == 1) {
             b = true;
          }
          uCoronaMeta.isWatchComplete = b;
          uCoronaMeta.mHorizontalHolidayEggs = HorizontalHolidayEggsInfo$$Parcelable.read(p0, p1);
          uCoronaMeta.mCoronaTube = p0.readSerializable();
          p1.f(i, uCoronaMeta);
          return uCoronaMeta;
       }
    }
    public static void write(CoronaMeta p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          if (p0.isSpecialPhoto == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(1);
             p1.writeInt(p0.isSpecialPhoto.booleanValue());
          }
          p1.writeSerializable(p0.mCoronaTvFilm);
          p1.writeSerializable(p0.mCoronaActivityStrip);
          p1.writeInt(p0.isLater);
          p1.writeSerializable(p0.mCoronaTvSerial);
          p1.writeInt(p0.isTitleChanged);
          p1.writeString(p0.mStartPlaySource);
          CoronaMeta mCoronaTags = p0.mCoronaTags;
          if (mCoronaTags == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mCoronaTags.size());
             Iterator iterator = p0.mCoronaTags.iterator();
             while (iterator.hasNext()) {
                CoronaMeta$CoronaTag$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          CoronaMeta$TalkTag$$Parcelable.write(p0.mTalkTag, p1, p2, p3);
          p1.writeInt(p0.isEnterFloatWindowFromLandscape);
          p1.writeInt(p0.isWatchComplete);
          HorizontalHolidayEggsInfo$$Parcelable.write(p0.mHorizontalHolidayEggs, p1, p2, p3);
          p1.writeSerializable(p0.mCoronaTube);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public CoronaMeta getParcel(){
       return this.coronaMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       CoronaMeta$$Parcelable.write(this.coronaMeta$$0, p0, p1, new a());
    }
}
