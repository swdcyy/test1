package com.huawei.multimedia.audioengine.IHwAudioEngine$Stub;
import com.huawei.multimedia.audioengine.IHwAudioEngine;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import com.huawei.multimedia.audioengine.IHwAudioEngine$Stub$Proxy;
import android.os.Parcel;
import java.util.List;

public abstract class IHwAudioEngine$Stub extends Binder implements IHwAudioEngine	// class@0006bb
{

    public void IHwAudioEngine$Stub(){
       super();
       this.attachInterface(this, "com.huawei.multimedia.audioengine.IHwAudioEngine");
    }
    public static IHwAudioEngine a(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("com.huawei.multimedia.audioengine.IHwAudioEngine");
       if (iInterface != null && iInterface instanceof IHwAudioEngine) {
          return iInterface;
       }
       return new IHwAudioEngine$Stub$Proxy(p0);
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                if (p0 != 0x5f4e5446) {
                   return super.onTransact(p0, p1, p2, p3);
                }
                p2.writeString("com.huawei.multimedia.audioengine.IHwAudioEngine");
                return 1;
             }else {
                p1.enforceInterface("com.huawei.multimedia.audioengine.IHwAudioEngine");
                this.a(p1.readString(), p1.readString());
                p2.writeNoException();
                return 1;
             }
          }else {
             p1.enforceInterface("com.huawei.multimedia.audioengine.IHwAudioEngine");
             p2.writeNoException();
             p2.writeInt(this.a(p1.readInt()));
             return 1;
          }
       }else {
          p1.enforceInterface("com.huawei.multimedia.audioengine.IHwAudioEngine");
          p2.writeNoException();
          p2.writeList(this.a());
          return 1;
       }
    }
}
