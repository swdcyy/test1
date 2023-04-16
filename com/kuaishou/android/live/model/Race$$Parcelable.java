package com.kuaishou.android.live.model.Race$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.live.model.Race$$Parcelable$a;
import com.kuaishou.android.live.model.Race;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.live.model.Round;
import com.kuaishou.android.live.model.Round$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class Race$$Parcelable implements Parcelable, d	// class@000830
{
    public Race race$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       Race$$Parcelable.CREATOR = new Race$$Parcelable$a();
    }
    public void Race$$Parcelable(Race p0){
       super();
       this.race$$0 = p0;
    }
    public static Race read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          Race race = new Race();
          p1.f(p1.g(), race);
          int i1 = p0.readInt();
          boolean b = false;
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(Round$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          race.mRounds = list;
          race.mCost = p0.readLong();
          if (p0.readInt() == 1) {
             b = true;
          }
          race.mSuccess = b;
          race.mStartRealTime = p0.readLong();
          race.mStartTime = p0.readLong();
          race.mTag = p0.readString();
          p1.f(i, race);
          return race;
       }
    }
    public static void write(Race p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          Race mRounds = p0.mRounds;
          if (mRounds == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mRounds.size());
             Iterator iterator = p0.mRounds.iterator();
             while (iterator.hasNext()) {
                Round$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeLong(p0.mCost);
          p1.writeInt(p0.mSuccess);
          p1.writeLong(p0.mStartRealTime);
          p1.writeLong(p0.mStartTime);
          p1.writeString(p0.mTag);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public Race getParcel(){
       return this.race$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       Race$$Parcelable.write(this.race$$0, p0, p1, new a());
    }
}
