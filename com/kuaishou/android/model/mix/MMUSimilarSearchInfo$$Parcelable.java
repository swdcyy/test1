package com.kuaishou.android.model.mix.MMUSimilarSearchInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.MMUSimilarSearchInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.MMUSimilarSearchInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.List;
import java.util.Iterator;

public class MMUSimilarSearchInfo$$Parcelable implements Parcelable, d	// class@000d17
{
    public MMUSimilarSearchInfo mMUSimilarSearchInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       MMUSimilarSearchInfo$$Parcelable.CREATOR = new MMUSimilarSearchInfo$$Parcelable$a();
    }
    public void MMUSimilarSearchInfo$$Parcelable(MMUSimilarSearchInfo p0){
       super();
       this.mMUSimilarSearchInfo$$0 = p0;
    }
    public static MMUSimilarSearchInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          MMUSimilarSearchInfo mMUSimilarSe = new MMUSimilarSearchInfo();
          p1.f(p1.g(), mMUSimilarSe);
          int i1 = p0.readInt();
          List list = null;
          if (i1 >= 0) {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                List list1 = (p0.readInt() < 0)? list: Integer.valueOf(p0.readInt());
                uArrayList.add(list1);
             }
             list = uArrayList;
          }
          mMUSimilarSe.mHasCommodityPicIndexes = list;
          p1.f(i, mMUSimilarSe);
          return mMUSimilarSe;
       }
    }
    public static void write(MMUSimilarSearchInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          MMUSimilarSearchInfo mHasCommodit = p0.mHasCommodityPicIndexes;
          if (mHasCommodit == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mHasCommodit.size());
             Iterator iterator = p0.mHasCommodityPicIndexes.iterator();
             while (iterator.hasNext()) {
                Integer integer = iterator.next();
                if (integer == null) {
                   p1.writeInt(-1);
                }else {
                   p1.writeInt(1);
                   p1.writeInt(integer.intValue());
                }
             }
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public MMUSimilarSearchInfo getParcel(){
       return this.mMUSimilarSearchInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       MMUSimilarSearchInfo$$Parcelable.write(this.mMUSimilarSearchInfo$$0, p0, p1, new a());
    }
}
