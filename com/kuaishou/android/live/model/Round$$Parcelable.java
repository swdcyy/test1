package com.kuaishou.android.live.model.Round$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.live.model.Round$$Parcelable$a;
import com.kuaishou.android.live.model.Round;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.live.model.Horse;
import com.kuaishou.android.live.model.Horse$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class Round$$Parcelable implements Parcelable, d	// class@000834
{
    public Round round$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       Round$$Parcelable.CREATOR = new Round$$Parcelable$a();
    }
    public void Round$$Parcelable(Round p0){
       super();
       this.round$$0 = p0;
    }
    public static Round read(Parcel p0,a p1){
       long[] olongArray;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          Round round = new Round();
          p1.f(p1.g(), round);
          int i1 = p0.readInt();
          List list = null;
          boolean b = false;
          if (i1 < 0) {
             olongArray = list;
          }else {
             olongArray = new long[i1];
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                olongArray[i3] = p0.readLong();
             }
          }
          round.mBarriers = olongArray;
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                list.add(Horse$$Parcelable.read(p0, p1));
             }
          }
          round.mHorses = list;
          round.mPolicy = p0.readInt();
          round.mCost = p0.readLong();
          if (p0.readInt() == 1) {
             b = true;
          }
          round.mSuccess = b;
          round.mTimeout = p0.readLong();
          round.mStartRealTime = p0.readLong();
          round.mStartTime = p0.readLong();
          round.mTag = p0.readString();
          p1.f(i, round);
          return round;
       }
    }
    public static void write(Round p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          Round mBarriers = p0.mBarriers;
          if (mBarriers == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBarriers.length);
             mBarriers = p0.mBarriers;
             int len = mBarriers.length;
             for (int i2 = 0; i2 < len; i2 = i2 + 1) {
                p1.writeLong(mBarriers[i2]);
             }
          }
          mBarriers = p0.mHorses;
          if (mBarriers == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mBarriers.size());
             Iterator iterator = p0.mHorses.iterator();
             while (iterator.hasNext()) {
                Horse$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mPolicy);
          p1.writeLong(p0.mCost);
          p1.writeInt(p0.mSuccess);
          p1.writeLong(p0.mTimeout);
          p1.writeLong(p0.mStartRealTime);
          p1.writeLong(p0.mStartTime);
          p1.writeString(p0.mTag);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public Round getParcel(){
       return this.round$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       Round$$Parcelable.write(this.round$$0, p0, p1, new a());
    }
}
