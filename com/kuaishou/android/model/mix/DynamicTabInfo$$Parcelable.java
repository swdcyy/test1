package com.kuaishou.android.model.mix.DynamicTabInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.DynamicTabInfo$$Parcelable$a;
import com.kuaishou.android.model.mix.DynamicTabInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Integer;
import java.io.Serializable;
import com.kuaishou.android.model.mix.DynamicTabInfo$RnConfigInfo;

public class DynamicTabInfo$$Parcelable implements Parcelable, d	// class@000c5d
{
    public DynamicTabInfo dynamicTabInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       DynamicTabInfo$$Parcelable.CREATOR = new DynamicTabInfo$$Parcelable$a();
    }
    public void DynamicTabInfo$$Parcelable(DynamicTabInfo p0){
       super();
       this.dynamicTabInfo$$0 = p0;
    }
    public static DynamicTabInfo read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          DynamicTabInfo uDynamicTabI = new DynamicTabInfo();
          p1.f(p1.g(), uDynamicTabI);
          uDynamicTabI.mRnQueryParams = p0.readString();
          uDynamicTabI.mLogTabName = p0.readString();
          uDynamicTabI.mTabName = p0.readString();
          uDynamicTabI.mPageStyle = p0.readInt();
          Integer integer = (p0.readInt() < 0)? null: Integer.valueOf(p0.readInt());
          uDynamicTabI.mTitleSubCount = integer;
          uDynamicTabI.mRnConfigInfo = p0.readSerializable();
          uDynamicTabI.mTabId = p0.readInt();
          p1.f(i, uDynamicTabI);
          return uDynamicTabI;
       }
    }
    public static void write(DynamicTabInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mRnQueryParams);
          p1.writeString(p0.mLogTabName);
          p1.writeString(p0.mTabName);
          p1.writeInt(p0.mPageStyle);
          if (p0.mTitleSubCount == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(1);
             p1.writeInt(p0.mTitleSubCount.intValue());
          }
          p1.writeSerializable(p0.mRnConfigInfo);
          p1.writeInt(p0.mTabId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public DynamicTabInfo getParcel(){
       return this.dynamicTabInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       DynamicTabInfo$$Parcelable.write(this.dynamicTabInfo$$0, p0, p1, new a());
    }
}
