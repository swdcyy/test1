package com.huawei.multimedia.audioengine.IHwAudioEngine$Stub$Proxy;
import com.huawei.multimedia.audioengine.IHwAudioEngine;
import android.os.IBinder;
import java.lang.Object;
import java.util.List;
import android.os.Parcel;
import java.lang.String;
import java.lang.Class;
import java.lang.ClassLoader;
import java.util.ArrayList;

public class IHwAudioEngine$Stub$Proxy implements IHwAudioEngine	// class@0006ba
{
    public IBinder a;

    public void IHwAudioEngine$Stub$Proxy(IBinder p0){
       super();
       this.a = p0;
    }
    public List a(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.huawei.multimedia.audioengine.IHwAudioEngine");
       this.a.transact(1, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return parcel1.readArrayList(this.getClass().getClassLoader());
    }
    public void a(String p0,String p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.huawei.multimedia.audioengine.IHwAudioEngine");
       parcel.writeString(p0);
       parcel.writeString(p1);
       this.a.transact(3, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public boolean a(int p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.huawei.multimedia.audioengine.IHwAudioEngine");
       parcel.writeInt(p0);
       int i = 0;
       this.a.transact(2, parcel, parcel1, i);
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
}
