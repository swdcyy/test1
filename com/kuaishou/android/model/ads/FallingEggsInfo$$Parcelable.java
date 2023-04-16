package com.kuaishou.android.model.ads.FallingEggsInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.ads.FallingEggsInfo$$Parcelable$a;
import com.kuaishou.android.model.ads.FallingEggsInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.android.model.ads.FallingEggsInfo$FallingEggsMaterial;
import com.kuaishou.android.model.ads.FallingEggsInfo$FallingEggsMaterial$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class FallingEggsInfo$$Parcelable implements Parcelable, d	// class@000858
{
    public FallingEggsInfo fallingEggsInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       FallingEggsInfo$$Parcelable.CREATOR = new FallingEggsInfo$$Parcelable$a();
    }
    public void FallingEggsInfo$$Parcelable(FallingEggsInfo p0){
       super();
       this.fallingEggsInfo$$0 = p0;
    }
    public static FallingEggsInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          FallingEggsInfo uFallingEggs = new FallingEggsInfo();
          p1.f(p1.g(), uFallingEggs);
          int i1 = p0.readInt();
          boolean b = false;
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(FallingEggsInfo$FallingEggsMaterial$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          uFallingEggs.mFallingEggsMaterials = list;
          uFallingEggs.mGuideStyle = p0.readInt();
          uFallingEggs.mFallingEggsStyle = p0.readInt();
          if (p0.readInt() == 1) {
             b = true;
          }
          uFallingEggs.mClickDisabled = b;
          p1.f(i, uFallingEggs);
          return uFallingEggs;
       }
    }
    public static void write(FallingEggsInfo p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          FallingEggsInfo mFallingEggs = p0.mFallingEggsMaterials;
          if (mFallingEggs == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mFallingEggs.size());
             Iterator iterator = p0.mFallingEggsMaterials.iterator();
             while (iterator.hasNext()) {
                FallingEggsInfo$FallingEggsMaterial$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeInt(p0.mGuideStyle);
          p1.writeInt(p0.mFallingEggsStyle);
          p1.writeInt(p0.mClickDisabled);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public FallingEggsInfo getParcel(){
       return this.fallingEggsInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       FallingEggsInfo$$Parcelable.write(this.fallingEggsInfo$$0, p0, p1, new a());
    }
}
