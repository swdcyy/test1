package com.hpplay.sdk.source.d$a;
import com.hpplay.sdk.source.d;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import com.hpplay.sdk.source.d$a$a;
import android.os.Parcel;

public abstract class d$a extends Binder implements d	// class@000668
{

    public void d$a(){
       super();
       this.attachInterface(this, "com.hpplay.sdk.source.LelinkPlayListener");
    }
    public static d asInterface(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("com.hpplay.sdk.source.LelinkPlayListener");
       if (iInterface != null && iInterface instanceof d) {
          return iInterface;
       }
       return new d$a$a(p0);
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       String str = "com.hpplay.sdk.source.LelinkPlayListener";
       if (p0 != 0x5f4e5446) {
          switch (p0){
              case 1:
                p1.enforceInterface(str);
                this.onLoading();
                p2.writeNoException();
                return true;
              case 2:
                p1.enforceInterface(str);
                this.onStart();
                p2.writeNoException();
                return true;
              case 3:
                p1.enforceInterface(str);
                this.onPause();
                p2.writeNoException();
                return true;
              case 4:
                p1.enforceInterface(str);
                this.onCompletion();
                p2.writeNoException();
                return true;
              case 5:
                p1.enforceInterface(str);
                this.onStop();
                p2.writeNoException();
                return true;
              case 6:
                p1.enforceInterface(str);
                this.onSeekComplete(p1.readInt());
                p2.writeNoException();
                return true;
              case 7:
                p1.enforceInterface(str);
                this.onInfo(p1.readInt(), p1.readInt());
                p2.writeNoException();
                return true;
              case 8:
                p1.enforceInterface(str);
                this.onError(p1.readInt(), p1.readInt());
                p2.writeNoException();
                return true;
              case 9:
                p1.enforceInterface(str);
                this.onVolumeChanged(p1.readFloat());
                p2.writeNoException();
                return true;
              case 10:
                p1.enforceInterface(str);
                this.onPositionUpdate(p1.readLong(), p1.readLong());
                p2.writeNoException();
                return true;
              default:
                return super.onTransact(p0, p1, p2, p3);
          }
       }else {
          p2.writeString(str);
          return true;
       }
    }
}
