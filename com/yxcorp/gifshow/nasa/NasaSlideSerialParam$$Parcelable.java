package com.yxcorp.gifshow.nasa.NasaSlideSerialParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.nasa.NasaSlideSerialParam$$Parcelable$a;
import com.yxcorp.gifshow.nasa.NasaSlideSerialParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Class;
import org.parceler.a;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.QPhoto$$Parcelable;
import java.lang.Long;
import java.lang.Integer;

public class NasaSlideSerialParam$$Parcelable implements Parcelable, d	// class@0020c7
{
    public NasaSlideSerialParam nasaSlideSerialParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       NasaSlideSerialParam$$Parcelable.CREATOR = new NasaSlideSerialParam$$Parcelable$a();
    }
    public void NasaSlideSerialParam$$Parcelable(NasaSlideSerialParam p0){
       super();
       this.nasaSlideSerialParam$$0 = p0;
    }
    public static NasaSlideSerialParam read(Parcel p0,a p1){
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
          NasaSlideSerialParam nasaSlideSer = a.a(NasaSlideSerialParam.class, uClassArray, objArray);
          p1.f(p1.g(), nasaSlideSer);
          boolean b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideSerialParam.class, nasaSlideSer, "mIsFromProfileSerialBtnOrItem", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideSerialParam.class, nasaSlideSer, "mIsAutoShowPanel", Boolean.valueOf(b));
          b = (p0.readInt() == 1)? true: false;
          a.d(NasaSlideSerialParam.class, nasaSlideSer, "mIsClusterSerial", Boolean.valueOf(b));
          a.d(NasaSlideSerialParam.class, nasaSlideSer, "mSerialId", p0.readString());
          b = (p0.readInt() == 1)? true: false;
          nasaSlideSer.mLogReported = b;
          a.d(NasaSlideSerialParam.class, nasaSlideSer, "mContinueSessionID", p0.readString());
          if (p0.readInt() == 1) {
             i1 = true;
          }
          a.d(NasaSlideSerialParam.class, nasaSlideSer, "mIsFromScheme", Boolean.valueOf(i1));
          a.d(NasaSlideSerialParam.class, nasaSlideSer, "mCommercialActiveCallback", p0.readString());
          nasaSlideSer.mPreCommercialPhoto = QPhoto$$Parcelable.read(p0, p1);
          a.d(NasaSlideSerialParam.class, nasaSlideSer, "mCreateTimeStamp", Long.valueOf(p0.readLong()));
          nasaSlideSer.mFlowPresenterStartTimeStamp = p0.readLong();
          nasaSlideSer.mViewRenderCompleteTimeStamp = p0.readLong();
          a.d(NasaSlideSerialParam.class, nasaSlideSer, "mSerialType", Integer.valueOf(p0.readInt()));
          nasaSlideSer.mNetApiStartTimeStamp = p0.readLong();
          a.d(NasaSlideSerialParam.class, nasaSlideSer, "mSerialContext", p0.readString());
          a.d(NasaSlideSerialParam.class, nasaSlideSer, "mPhotoPage", p0.readString());
          nasaSlideSer.mNetApiStopTimeStamp = p0.readLong();
          p1.f(i, nasaSlideSer);
          return nasaSlideSer;
       }
    }
    public static void write(NasaSlideSerialParam p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mIsFromProfileSerialBtnOrItem);
          p1.writeInt(p0.mIsAutoShowPanel);
          p1.writeInt(p0.mIsClusterSerial);
          p1.writeString(p0.mSerialId);
          p1.writeInt(p0.mLogReported);
          p1.writeString(p0.mContinueSessionID);
          p1.writeInt(p0.mIsFromScheme);
          p1.writeString(p0.mCommercialActiveCallback);
          QPhoto$$Parcelable.write(p0.mPreCommercialPhoto, p1, p2, p3);
          p1.writeLong(p0.mCreateTimeStamp);
          p1.writeLong(p0.mFlowPresenterStartTimeStamp);
          p1.writeLong(p0.mViewRenderCompleteTimeStamp);
          p1.writeInt(p0.mSerialType);
          p1.writeLong(p0.mNetApiStartTimeStamp);
          p1.writeString(p0.mSerialContext);
          p1.writeString(p0.mPhotoPage);
          p1.writeLong(p0.mNetApiStopTimeStamp);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public NasaSlideSerialParam getParcel(){
       return this.nasaSlideSerialParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       NasaSlideSerialParam$$Parcelable.write(this.nasaSlideSerialParam$$0, p0, p1, new a());
    }
}
