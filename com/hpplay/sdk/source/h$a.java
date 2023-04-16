package com.hpplay.sdk.source.h$a;
import com.hpplay.sdk.source.h;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import com.hpplay.sdk.source.h$a$a;
import android.os.Parcel;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import java.lang.Object;
import android.os.Parcelable$Creator;
import com.hpplay.sdk.source.g;
import com.hpplay.sdk.source.g$a;
import com.hpplay.sdk.source.e;
import com.hpplay.sdk.source.e$a;
import java.util.ArrayList;
import java.util.List;
import com.hpplay.sdk.source.api.LelinkPlayerInfo;
import com.hpplay.sdk.source.f;
import com.hpplay.sdk.source.f$a;
import com.hpplay.sdk.source.c;
import com.hpplay.sdk.source.c$a;
import com.hpplay.sdk.source.d;
import com.hpplay.sdk.source.d$a;
import com.hpplay.sdk.source.a;
import com.hpplay.sdk.source.a$a;

public abstract class h$a extends Binder implements h	// class@000674
{

    public void h$a(){
       super();
       this.attachInterface(this, "com.hpplay.sdk.source.SDKInterface");
    }
    public static h asInterface(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("com.hpplay.sdk.source.SDKInterface");
       if (iInterface != null && iInterface instanceof h) {
          return iInterface;
       }
       return new h$a$a(p0);
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       String str;
       if (p0 != 0x5f4e5446) {
          LelinkServiceInfo lelinkServic = null;
          boolean b = false;
          switch (p0){
              case 1:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                str = p1.readString();
                String str1 = p1.readString();
                if (p1.readInt()) {
                   b = true;
                }
                p2.writeNoException();
                p2.writeInt(this.loadLePatch(str, str1, b));
                return true;
                break;
              case 2:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                this.initSdkWithUserId(p1.readString(), p1.readString(), p1.readString(), p1.readString(), p1.readString());
                p2.writeNoException();
                return true;
              case 3:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                if (p1.readInt()) {
                   b = true;
                }
                this.setDebugMode(b);
                p2.writeNoException();
                return true;
                break;
              case 4:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                this.setLelinkServiceInfoListener(a$a.asInterface(p1.readStrongBinder()));
                p2.writeNoException();
                return true;
              case 5:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                this.setLelinkPlayListenerListener(d$a.asInterface(p1.readStrongBinder()));
                p2.writeNoException();
                return true;
              case 6:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                this.setConnectStatusListener(c$a.asInterface(p1.readStrongBinder()));
                p2.writeNoException();
                return true;
              case 7:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                this.setParceResultListener(f$a.asInterface(p1.readStrongBinder()));
                p2.writeNoException();
                return true;
              case 8:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                boolean b1 = (p1.readInt())? true: false;
                if (p1.readInt()) {
                   b = true;
                }
                this.browse(b1, b);
                p2.writeNoException();
                return true;
                break;
              case 9:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                this.seekTo(p1.readInt());
                p2.writeNoException();
                return true;
              case 10:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                this.stopBrowse();
                p2.writeNoException();
                return true;
              case 11:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                if (p1.readInt()) {
                   lelinkServic = LelinkServiceInfo.CREATOR.createFromParcel(p1);
                }
                this.connect(lelinkServic);
                p2.writeNoException();
                return true;
                break;
              case 12:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                if (p1.readInt()) {
                   lelinkServic = LelinkServiceInfo.CREATOR.createFromParcel(p1);
                }
                p2.writeNoException();
                p2.writeInt(this.disConnect(lelinkServic));
                return true;
                break;
              case 13:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                p2.writeNoException();
                p2.writeTypedList(this.getConnectInfos());
                return true;
              case 14:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                str = p1.readString();
                p3 = p1.readInt();
                if (p1.readInt()) {
                   b = true;
                }
                this.startPlayMedia(str, p3, b);
                p2.writeNoException();
                return true;
                break;
              case 15:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                if (p1.readInt()) {
                   lelinkServic = LelinkPlayerInfo.CREATOR.createFromParcel(p1);
                }
                this.startPlayMediaForPlayerInfo(lelinkServic);
                p2.writeNoException();
                return true;
                break;
              case 16:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                if (p1.readInt()) {
                   lelinkServic = LelinkServiceInfo.CREATOR.createFromParcel(p1);
                }
                str = p1.readString();
                p3 = p1.readInt();
                if (p1.readInt()) {
                   b = true;
                }
                this.startPlayMediaImmed(lelinkServic, str, p3, b);
                p2.writeNoException();
                return true;
                break;
              case 17:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                if (p1.readInt()) {
                   lelinkServic = LelinkPlayerInfo.CREATOR.createFromParcel(p1);
                }
                this.startMirrorForPlayerInfo(lelinkServic);
                p2.writeNoException();
                return true;
                break;
              case 18:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                this.resume();
                p2.writeNoException();
                return true;
              case 19:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                this.pause();
                p2.writeNoException();
                return true;
              case 20:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                this.addVolume();
                p2.writeNoException();
                return true;
              case 21:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                this.subVolume();
                p2.writeNoException();
                return true;
              case 22:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                this.setVolume(p1.readInt());
                p2.writeNoException();
                return true;
              case 23:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                this.stopPlay();
                p2.writeNoException();
                return true;
              case 24:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                this.setOption(p1.readInt(), p1.readString());
                p2.writeNoException();
                return true;
              case 25:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                this.startOnlineCheck(e$a.asInterface(p1.readStrongBinder()), p1.createTypedArrayList(LelinkServiceInfo.CREATOR));
                p2.writeNoException();
                return true;
              case 26:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                this.setAuthListener(g$a.asInterface(p1.readStrongBinder()));
                p2.writeNoException();
                return true;
              case 27:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                this.addQRCodeToLelinkServiceInfo(p1.readString());
                p2.writeNoException();
                return true;
              case 28:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                this.addPinCodeToLelinkServiceInfo(p1.readString());
                p2.writeNoException();
                return true;
              case 29:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                if (p1.readInt()) {
                   b = true;
                }
                this.setSystemApp(b);
                p2.writeNoException();
                return true;
                break;
              case 30:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                if (p1.readInt()) {
                   lelinkServic = LelinkServiceInfo.CREATOR.createFromParcel(p1);
                }
                p2.writeNoException();
                p2.writeInt(this.canPlayScreen(lelinkServic));
                return true;
                break;
              case 31:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                if (p1.readInt()) {
                   lelinkServic = LelinkServiceInfo.CREATOR.createFromParcel(p1);
                }
                p2.writeNoException();
                p2.writeInt(this.canPlayLocalMedia(lelinkServic));
                return true;
                break;
              case 32:
                p1.enforceInterface("com.hpplay.sdk.source.SDKInterface");
                p2.writeNoException();
                p2.writeInt(this.getOption(p1.readInt()));
                return true;
              default:
                return super.onTransact(p0, p1, p2, p3);
          }
       }else {
          p2.writeString("com.hpplay.sdk.source.SDKInterface");
          return true;
       }
    }
}
