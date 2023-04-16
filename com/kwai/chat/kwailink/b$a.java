package com.kwai.chat.kwailink.b$a;
import com.kwai.chat.kwailink.b;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import com.kwai.chat.kwailink.b$a$a;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public abstract class b$a extends Binder implements b	// class@000a1f
{

    public void b$a(){
       super();
       this.attachInterface(this, "com.kwai.chat.kwailink.ILinkEventCallback");
    }
    public static b L1(){
       return b$a$a.b;
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       if (PatchProxy.isSupport(b$a.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, p2, Integer.valueOf(p3), this, b$a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 != 0x5f4e5446) {
          switch (p0){
              case 1:
                p1.enforceInterface("com.kwai.chat.kwailink.ILinkEventCallback");
                this.h();
                p2.writeNoException();
                return true;
              case 2:
                p1.enforceInterface("com.kwai.chat.kwailink.ILinkEventCallback");
                this.v();
                p2.writeNoException();
                return true;
              case 3:
                p1.enforceInterface("com.kwai.chat.kwailink.ILinkEventCallback");
                this.C(p1.readInt(), p1.readInt());
                p2.writeNoException();
                return true;
              case 4:
                p1.enforceInterface("com.kwai.chat.kwailink.ILinkEventCallback");
                this.f();
                p2.writeNoException();
                return true;
              case 5:
                p1.enforceInterface("com.kwai.chat.kwailink.ILinkEventCallback");
                this.i(p1.readInt(), p1.readString());
                p2.writeNoException();
                return true;
              case 6:
                p1.enforceInterface("com.kwai.chat.kwailink.ILinkEventCallback");
                this.k();
                p2.writeNoException();
                return true;
              case 7:
                p1.enforceInterface("com.kwai.chat.kwailink.ILinkEventCallback");
                this.A(p1.readInt());
                p2.writeNoException();
                return true;
              case 8:
                p1.enforceInterface("com.kwai.chat.kwailink.ILinkEventCallback");
                this.B();
                p2.writeNoException();
                return true;
              default:
                return super.onTransact(p0, p1, p2, p3);
          }
       }else {
          p2.writeString("com.kwai.chat.kwailink.ILinkEventCallback");
          return true;
       }
    }
}
