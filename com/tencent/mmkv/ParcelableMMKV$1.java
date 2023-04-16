package com.tencent.mmkv.ParcelableMMKV$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.tencent.mmkv.ParcelableMMKV;
import java.lang.String;
import android.os.ParcelFileDescriptor;

public class ParcelableMMKV$1 implements Parcelable$Creator	// class@000f27
{

    public void ParcelableMMKV$1(){
       super();
    }
    public ParcelableMMKV createFromParcel(Parcel p0){
       String str = p0.readString();
       ParcelFileDescriptor parcelFileDe = ParcelFileDescriptor.CREATOR.createFromParcel(p0);
       ParcelFileDescriptor parcelFileDe1 = ParcelFileDescriptor.CREATOR.createFromParcel(p0);
       String str1 = p0.readString();
       if (parcelFileDe == null || parcelFileDe1 == null) {
          return null;
       }
       ParcelableMMKV parcelableMM = new ParcelableMMKV(str, parcelFileDe.detachFd(), parcelFileDe1.detachFd(), str1, 0);
       return p0;
    }
    public Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public ParcelableMMKV[] newArray(int p0){
       ParcelableMMKV[] parcelableMM = new ParcelableMMKV[p0];
       return parcelableMM;
    }
    public Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
