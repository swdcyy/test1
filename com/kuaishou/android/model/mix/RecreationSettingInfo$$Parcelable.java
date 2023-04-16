package com.kuaishou.android.model.mix.RecreationSettingInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.RecreationSettingInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.RecreationSettingInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.io.Serializable;
import com.kuaishou.android.model.mix.HotAreaInfo;
import java.util.List;
import java.util.Iterator;

public class RecreationSettingInfo$$Parcelable implements Parcelable, d	// class@000de4
{
    public RecreationSettingInfo recreationSettingInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       RecreationSettingInfo$$Parcelable.CREATOR = new RecreationSettingInfo$$Parcelable$a();
    }
    public void RecreationSettingInfo$$Parcelable(RecreationSettingInfo p0){
       super();
       this.recreationSettingInfo$$0 = p0;
    }
    public static RecreationSettingInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          RecreationSettingInfo recreationSe = new RecreationSettingInfo();
          p1.f(p1.g(), recreationSe);
          int i1 = p0.readInt();
          boolean b = false;
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(p0.readSerializable());
             }
             list = uArrayList;
          }
          recreationSe.mHotAreaInfos = list;
          if (p0.readInt() == 1) {
             b = true;
          }
          recreationSe.mIsRecreationPhoto = b;
          p1.f(i, recreationSe);
          return recreationSe;
       }
    }
    public static void write(RecreationSettingInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          RecreationSettingInfo mHotAreaInfo = p0.mHotAreaInfos;
          if (mHotAreaInfo == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mHotAreaInfo.size());
             Iterator iterator = p0.mHotAreaInfos.iterator();
             while (iterator.hasNext()) {
                p1.writeSerializable(iterator.next());
             }
          }
          p1.writeInt(p0.mIsRecreationPhoto);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public RecreationSettingInfo getParcel(){
       return this.recreationSettingInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       RecreationSettingInfo$$Parcelable.write(this.recreationSettingInfo$$0, p0, p1, new a());
    }
}
