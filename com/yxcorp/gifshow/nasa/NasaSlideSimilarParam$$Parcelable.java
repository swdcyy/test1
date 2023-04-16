package com.yxcorp.gifshow.nasa.NasaSlideSimilarParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.nasa.NasaSlideSimilarParam$$Parcelable$a;
import com.yxcorp.gifshow.nasa.NasaSlideSimilarParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Class;
import org.parceler.a;
import java.lang.Boolean;
import com.yxcorp.gifshow.nasa.SimilarPhotoLocation;
import java.lang.Enum;
import java.lang.Integer;

public class NasaSlideSimilarParam$$Parcelable implements Parcelable, d	// class@0020cc
{
    public NasaSlideSimilarParam nasaSlideSimilarParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NasaSlideSimilarParam$$Parcelable.CREATOR = new NasaSlideSimilarParam$$Parcelable$a();
    }
    public void NasaSlideSimilarParam$$Parcelable(NasaSlideSimilarParam p0){
       super();
       this.nasaSlideSimilarParam$$0 = p0;
    }
    public static NasaSlideSimilarParam read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          int i1 = 0;
          Class[] uClassArray = new Class[i1];
          Object[] objArray = new Object[i1];
          NasaSlideSimilarParam nasaSlideSim = a.a(NasaSlideSimilarParam.class, uClassArray, objArray);
          p1.f(p1.g(), nasaSlideSim);
          boolean b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideSimilarParam.class, nasaSlideSim, "mIsSimilarShowPhotoIndex", Boolean.valueOf(b));
          a.d(NasaSlideSimilarParam.class, nasaSlideSim, "mSimilarCardsBarTitle", p0.readString());
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideSimilarParam.class, nasaSlideSim, "mIsClusterSerial", Boolean.valueOf(b));
          a.d(NasaSlideSimilarParam.class, nasaSlideSim, "mSerialId", p0.readString());
          String str = p0.readString();
          Enum uEnum = (str == null)? null: Enum.valueOf(SimilarPhotoLocation.class, str);
          a.d(NasaSlideSimilarParam.class, nasaSlideSim, "mFromLocation", uEnum);
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideSimilarParam.class, nasaSlideSim, "mIsRelatedEpisodes", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideSimilarParam.class, nasaSlideSim, "mIsFromUrl", Boolean.valueOf(b));
          a.d(NasaSlideSimilarParam.class, nasaSlideSim, "mSerialType", Integer.valueOf(p0.readInt()));
          a.d(NasaSlideSimilarParam.class, nasaSlideSim, "mSimilarCardsPanelTitle", p0.readString());
          if (p0.readInt() == 1) {
             i1 = true;
          }
          a.d(NasaSlideSimilarParam.class, nasaSlideSim, "mIsDisableSimilarShowCreatedTime", Boolean.valueOf(i1));
          a.d(NasaSlideSimilarParam.class, nasaSlideSim, "mSerialContext", p0.readString());
          a.d(NasaSlideSimilarParam.class, nasaSlideSim, "mPhotoPage", p0.readString());
          p1.f(i, nasaSlideSim);
          return nasaSlideSim;
       }
    }
    public static void write(NasaSlideSimilarParam p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mIsSimilarShowPhotoIndex);
          p1.writeString(p0.mSimilarCardsBarTitle);
          p1.writeInt(p0.mIsClusterSerial);
          p1.writeString(p0.mSerialId);
          NasaSlideSimilarParam mFromLocatio = p0.mFromLocation;
          String str = (mFromLocatio == null)? null: mFromLocatio.name();
          p1.writeString(str);
          p1.writeInt(p0.mIsRelatedEpisodes);
          p1.writeInt(p0.mIsFromUrl);
          p1.writeInt(p0.mSerialType);
          p1.writeString(p0.mSimilarCardsPanelTitle);
          p1.writeInt(p0.mIsDisableSimilarShowCreatedTime);
          p1.writeString(p0.mSerialContext);
          p1.writeString(p0.mPhotoPage);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NasaSlideSimilarParam getParcel(){
       return this.nasaSlideSimilarParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NasaSlideSimilarParam$$Parcelable.write(this.nasaSlideSimilarParam$$0, p0, p1, new a());
    }
}
