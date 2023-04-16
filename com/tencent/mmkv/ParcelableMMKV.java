package com.tencent.mmkv.ParcelableMMKV;
import android.os.Parcelable;
import com.tencent.mmkv.ParcelableMMKV$1;
import com.tencent.mmkv.MMKV;
import java.lang.Object;
import java.lang.String;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

public final class ParcelableMMKV implements Parcelable	// class@000f28
{
    public int ashmemFD;
    public int ashmemMetaFD;
    public String cryptKey;
    public final String mmapID;
    public static final Parcelable$Creator CREATOR;

    static {
       ParcelableMMKV.CREATOR = new ParcelableMMKV$1();
    }
    public void ParcelableMMKV(MMKV p0){
       super();
       this.ashmemFD = -1;
       this.ashmemMetaFD = -1;
       this.cryptKey = null;
       this.mmapID = p0.mmapID();
       this.ashmemFD = p0.ashmemFD();
       this.ashmemMetaFD = p0.ashmemMetaFD();
       this.cryptKey = p0.cryptKey();
    }
    public void ParcelableMMKV(String p0,int p1,int p2,String p3){
       super();
       this.ashmemFD = -1;
       this.ashmemMetaFD = -1;
       this.cryptKey = null;
       this.mmapID = p0;
       this.ashmemFD = p1;
       this.ashmemMetaFD = p2;
       this.cryptKey = p3;
    }
    public void ParcelableMMKV(String p0,int p1,int p2,String p3,ParcelableMMKV$1 p4){
       super(p0, p1, p2, p3);
    }
    public int describeContents(){
       return 1;
    }
    public MMKV toMMKV(){
       ParcelableMMKV tashmemFD = this.ashmemFD;
       if (tashmemFD >= null) {
          ParcelableMMKV tashmemMetaF = this.ashmemMetaFD;
          if (tashmemMetaF >= null) {
             return MMKV.mmkvWithAshmemFD(this.mmapID, tashmemFD, tashmemMetaF, this.cryptKey);
          }
       }
       return null;
    }
    public void writeToParcel(Parcel p0,int p1){
       try{
          p0.writeString(this.mmapID);
          p1 = p1 | 0x01;
          ParcelFileDescriptor.fromFd(this.ashmemFD).writeToParcel(p0, p1);
          ParcelFileDescriptor.fromFd(this.ashmemMetaFD).writeToParcel(p0, p1);
          ParcelableMMKV tcryptKey = this.cryptKey;
          if (tcryptKey != null) {
             p0.writeString(tcryptKey);
          }
       }catch(java.io.IOException e3){
          e3.printStackTrace();
       }
       return;
    }
}
