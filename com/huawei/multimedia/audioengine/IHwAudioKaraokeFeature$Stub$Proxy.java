package com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature$Stub$Proxy;
import com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature;
import android.os.IBinder;
import java.lang.Object;
import java.lang.String;
import android.os.Parcel;

public class IHwAudioKaraokeFeature$Stub$Proxy implements IHwAudioKaraokeFeature	// class@0006bd
{
    public IBinder a;

    public void IHwAudioKaraokeFeature$Stub$Proxy(IBinder p0){
       super();
       this.a = p0;
    }
    public int a(String p0,int p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
       parcel.writeString(p0);
       parcel.writeInt(p1);
       this.a.transact(4, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return parcel1.readInt();
    }
    public int a(boolean p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
       int i = (p0)? 1: 0;
       parcel.writeInt(i);
       this.a.transact(2, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return parcel1.readInt();
    }
    public void a(String p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
       parcel.writeString(p0);
       this.a.transact(5, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public boolean a(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
       int i = 0;
       this.a.transact(1, parcel, parcel1, i);
       parcel1.readException();
       if (parcel1.readInt()) {
          i = true;
       }
       parcel1.recycle();
       parcel.recycle();
       return i;
    }
    public IBinder asBinder(){
       return this.a;
    }
    public int b(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
       this.a.transact(3, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return parcel1.readInt();
    }
}
