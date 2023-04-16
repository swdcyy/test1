package com.kwai.chat.kwailink.i$a;
import com.kwai.chat.kwailink.i;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import com.kwai.chat.kwailink.i$a$a;
import android.os.IBinder;
import android.os.Parcel;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import android.os.Parcelable$Creator;
import com.kwai.chat.kwailink.config.KwaiLinkDefaultServerInfo;
import com.kwai.chat.kwailink.data.PacketData;
import com.kwai.chat.kwailink.c$a;
import com.kwai.chat.kwailink.c;
import com.kwai.chat.kwailink.c$a$a;
import com.kwai.chat.kwailink.h$a;
import com.kwai.chat.kwailink.h;
import com.kwai.chat.kwailink.h$a$a;
import com.kwai.chat.kwailink.data.HttpRequest;
import com.kwai.chat.kwailink.a$a;
import com.kwai.chat.kwailink.a;
import com.kwai.chat.kwailink.a$a$a;
import com.kwai.chat.kwailink.data.PassThroughRequest;
import com.kwai.chat.kwailink.e$a;
import com.kwai.chat.kwailink.e;
import com.kwai.chat.kwailink.e$a$a;
import com.kwai.chat.kwailink.f$a;
import com.kwai.chat.kwailink.f;
import com.kwai.chat.kwailink.f$a$a;
import com.kwai.chat.kwailink.g$a;
import com.kwai.chat.kwailink.g;
import com.kwai.chat.kwailink.g$a$a;
import com.kwai.chat.kwailink.b$a;
import com.kwai.chat.kwailink.b;
import com.kwai.chat.kwailink.b$a$a;
import com.kwai.chat.kwailink.d$a;
import com.kwai.chat.kwailink.d;
import com.kwai.chat.kwailink.d$a$a;

public abstract class i$a extends Binder implements i	// class@000a5b
{
    public static final int a;

    public void i$a(){
       super();
       this.attachInterface(this, "com.kwai.chat.kwailink.IService");
    }
    public static i L1(){
       return i$a$a.b;
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       String obj;
       IBinder iBinder;
       IInterface obj1;
       Object obj2;
       PassThroughRequest this;
       int i1;
       IInterface iInterface;
       String str2;
       int i2;
       int i = p0;
       Parcel parcel = p2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(i$a.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, p2, Integer.valueOf(p3), this, i$a.class, "2");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = "com.kwai.chat.kwailink.IService";
       if (i != 0x5f4e5446) {
          boolean b = false;
          String str = "1";
          String str1 = null;
          switch (i){
              case 1:
                p1.enforceInterface(obj);
                if (p1.readInt()) {
                   b = true;
                }
                this.S(b, p1.readString(), p1.readString(), p1.readString());
                p2.writeNoException();
                return true;
                break;
              case 2:
                p1.enforceInterface(obj);
                iBinder = p1.readStrongBinder();
                obj1 = PatchProxy.applyOneRefs(iBinder, str1, d$a.class, str);
                if (obj1 != patchProxyRe) {
                   str1 = obj1;
                }else if(iBinder == null){
                   obj1 = iBinder.queryLocalInterface("com.kwai.chat.kwailink.IPacketReceiveCallback");
                   str1 = (obj1 != null && obj1 instanceof d)? obj1: new d$a$a(iBinder);
                }
                this.b1(str1);
                p2.writeNoException();
                return true;
                break;
              case 3:
                p1.enforceInterface(obj);
                iBinder = p1.readStrongBinder();
                obj2 = PatchProxy.applyOneRefs(iBinder, str1, b$a.class, str);
                if (obj2 != patchProxyRe) {
                   str1 = obj2;
                }else if(iBinder == null){
                   obj1 = iBinder.queryLocalInterface("com.kwai.chat.kwailink.ILinkEventCallback");
                   str1 = (obj1 != null && obj1 instanceof b)? obj1: new b$a$a(iBinder);
                }
                this.z0(str1);
                p2.writeNoException();
                return true;
                break;
              case 4:
                p1.enforceInterface(obj);
                iBinder = p1.readStrongBinder();
                obj2 = PatchProxy.applyOneRefs(iBinder, str1, g$a.class, str);
                if (obj2 != patchProxyRe) {
                   str1 = obj2;
                }else if(iBinder == null){
                   obj1 = iBinder.queryLocalInterface("com.kwai.chat.kwailink.ISelfCallback");
                   str1 = (obj1 != null && obj1 instanceof g)? obj1: new g$a$a(iBinder);
                }
                this.s0(str1);
                p2.writeNoException();
                return true;
                break;
              case 5:
                p1.enforceInterface(obj);
                iBinder = p1.readStrongBinder();
                obj2 = PatchProxy.applyOneRefs(iBinder, str1, f$a.class, str);
                if (obj2 != patchProxyRe) {
                   str1 = obj2;
                }else if(iBinder == null){
                   obj1 = iBinder.queryLocalInterface("com.kwai.chat.kwailink.IPushNotifierCallback");
                   str1 = (obj1 != null && obj1 instanceof f)? obj1: new f$a$a(iBinder);
                }
                this.s1(str1);
                p2.writeNoException();
                return true;
                break;
              case 6:
                p1.enforceInterface(obj);
                this = (p1.readInt())? PassThroughRequest.CREATOR.createFromParcel(p1): str1;
                i1 = p1.readInt();
                i = p1.readInt();
                iBinder = p1.readStrongBinder();
                iInterface = PatchProxy.applyOneRefs(iBinder, str1, e$a.class, str);
                if (iInterface != patchProxyRe) {
                }else if(iBinder == null){
                   str2 = str1;
                label_0294 :
                   i2 = (p1.readInt())? 1: 0;
                   this.a1(this, i1, i, str2, i2);
                   p2.writeNoException();
                   return true;
                }else {
                   iInterface = iBinder.queryLocalInterface("com.kwai.chat.kwailink.IPassThroughCallback");
                   if (iInterface != null && iInterface instanceof e) {
                   }else {
                      iInterface = new e$a$a(iBinder);
                   }
                }
                str2 = iInterface;
                goto label_0294 ;
                break;
              case 7:
                p1.enforceInterface(obj);
                HttpRequest this1 = (p1.readInt())? HttpRequest.CREATOR.createFromParcel(p1): str1;
                i1 = p1.readInt();
                i = p1.readInt();
                iBinder = p1.readStrongBinder();
                iInterface = PatchProxy.applyOneRefs(iBinder, str1, a$a.class, str);
                if (iInterface != patchProxyRe) {
                }else if(iBinder == null){
                   str2 = str1;
                label_0239 :
                   i2 = (p1.readInt())? 1: 0;
                   this.i0(this1, i1, i, str2, i2);
                   p2.writeNoException();
                   return true;
                }else {
                   iInterface = iBinder.queryLocalInterface("com.kwai.chat.kwailink.IHttpCallback");
                   if (iInterface != null && iInterface instanceof a) {
                   }else {
                      a$a$a uoa$a = new a$a$a(iBinder);
                   }
                }
                str2 = iInterface;
                goto label_0239 ;
                break;
              case 8:
                p1.enforceInterface(obj);
                PacketData this2 = (p1.readInt())? PacketData.CREATOR.createFromParcel(p1): str1;
                i1 = p1.readInt();
                i = p1.readInt();
                iBinder = p1.readStrongBinder();
                iInterface = PatchProxy.applyOneRefs(iBinder, str1, h$a.class, str);
                if (iInterface != patchProxyRe) {
                }else if(iBinder == null){
                   str2 = str1;
                label_01de :
                   i2 = (p1.readInt())? 1: 0;
                   this.l1(this2, i1, i, str2, i2);
                   p2.writeNoException();
                   return true;
                }else {
                   iInterface = iBinder.queryLocalInterface("com.kwai.chat.kwailink.ISendPacketCallback");
                   if (iInterface != null && iInterface instanceof h) {
                   }else {
                      h$a$a uoa$a1 = new h$a$a(iBinder);
                   }
                }
                str2 = iInterface;
                goto label_01de ;
                break;
              case 9:
                p1.enforceInterface(obj);
                this.f1(p1.readInt());
                p2.writeNoException();
                return true;
              case 10:
                p1.enforceInterface(obj);
                p2.writeNoException();
                parcel.writeInt(this.u());
                return true;
              case 11:
                p1.enforceInterface(obj);
                p2.writeNoException();
                parcel.writeInt(this.K());
                return true;
              case 12:
                p1.enforceInterface(obj);
                p2.writeNoException();
                parcel.writeInt(this.M());
                return true;
              case 13:
                p1.enforceInterface(obj);
                iBinder = p1.readStrongBinder();
                obj2 = PatchProxy.applyOneRefs(iBinder, str1, c$a.class, str);
                if (obj2 != patchProxyRe) {
                   str1 = obj2;
                }else if(iBinder == null){
                   obj1 = iBinder.queryLocalInterface("com.kwai.chat.kwailink.ILogoffCallback");
                   str1 = (obj1 != null && obj1 instanceof c)? obj1: new c$a$a(iBinder);
                }
                this.o0(str1);
                p2.writeNoException();
                return true;
                break;
              case 14:
                p1.enforceInterface(obj);
                this.p1();
                p2.writeNoException();
                return true;
              case 15:
                p1.enforceInterface(obj);
                this.h0(p1.readString());
                p2.writeNoException();
                return true;
              case 16:
                p1.enforceInterface(obj);
                this.o();
                p2.writeNoException();
                return true;
              case 17:
                p1.enforceInterface(obj);
                if (p1.readInt()) {
                   str1 = PacketData.CREATOR.createFromParcel(p1);
                }
                this.t1(str1);
                p2.writeNoException();
                return true;
                break;
              case 18:
                p1.enforceInterface(obj);
                obj = p1.readString();
                if (p1.readInt()) {
                   str1 = KwaiLinkDefaultServerInfo.CREATOR.createFromParcel(p1);
                }
                this.Z(obj, str1);
                p2.writeNoException();
                return true;
                break;
              case 19:
                p1.enforceInterface(obj);
                this.c(p1.readString());
                p2.writeNoException();
                return true;
              case 20:
                p1.enforceInterface(obj);
                p2.writeNoException();
                parcel.writeString(this.W());
                return true;
              case 21:
                p1.enforceInterface(obj);
                if (p1.readInt()) {
                   str1 = ClientAppInfo.CREATOR.createFromParcel(p1);
                }
                this.d0(str1);
                p2.writeNoException();
                return true;
                break;
              case 22:
                p1.enforceInterface(obj);
                p2.writeNoException();
                parcel.writeLong(this.t());
                return true;
              case 23:
                p1.enforceInterface(obj);
                p2.writeNoException();
                parcel.writeInt(this.getAppId());
                return true;
              case 24:
                p1.enforceInterface(obj);
                this.K1(p1.readInt());
                p2.writeNoException();
                return true;
              case 25:
                p1.enforceInterface(obj);
                this.U(p1.readString());
                p2.writeNoException();
                return true;
              case 26:
                p1.enforceInterface(obj);
                p2.writeNoException();
                parcel.writeString(this.q());
                return true;
              case 27:
                p1.enforceInterface(obj);
                p2.writeNoException();
                parcel.writeInt(this.H());
                return true;
              case 28:
                p1.enforceInterface(obj);
                p2.writeNoException();
                parcel.writeString(this.getUserId());
                return true;
              default:
                return super.onTransact(p0, p1, p2, p3);
          }
       }else {
          parcel.writeString(obj);
          return true;
       }
    }
}
