package com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature$Stub;
import com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature$Stub$Proxy;
import android.os.Parcel;

public abstract class IHwAudioKaraokeFeature$Stub extends Binder implements IHwAudioKaraokeFeature	// class@0006be
{

    public void IHwAudioKaraokeFeature$Stub(){
       super();
       this.attachInterface(this, "com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
    }
    public static IHwAudioKaraokeFeature a(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
       if (iInterface != null && iInterface instanceof IHwAudioKaraokeFeature) {
          return iInterface;
       }
       return new IHwAudioKaraokeFeature$Stub$Proxy(p0);
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                if (p0 != 4) {
                   if (p0 != 5) {
                      if (p0 != 0x5f4e5446) {
                         return super.onTransact(p0, p1, p2, p3);
                      }else {
                         p2.writeString("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                         return 1;
                      }
                   }else {
                      p1.enforceInterface("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                      this.a(p1.readString());
                      p2.writeNoException();
                      return 1;
                   }
                }else {
                   p1.enforceInterface("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                   p2.writeNoException();
                   p2.writeInt(this.a(p1.readString(), p1.readInt()));
                   return 1;
                }
             }else {
                p1.enforceInterface("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
                p2.writeNoException();
                p2.writeInt(this.b());
                return 1;
             }
          }else {
             p1.enforceInterface("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
             boolean b = (p1.readInt())? true: false;
             p2.writeNoException();
             p2.writeInt(this.a(b));
             return 1;
          }
       }else {
          p1.enforceInterface("com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature");
          p2.writeNoException();
          p2.writeInt(this.a());
          return 1;
       }
    }
}
