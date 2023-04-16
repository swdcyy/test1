package com.kwai.chat.kwailink.g$a;
import com.kwai.chat.kwailink.g;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import com.kwai.chat.kwailink.g$a$a;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public abstract class g$a extends Binder implements g	// class@000a55
{

    public void g$a(){
       super();
       this.attachInterface(this, "com.kwai.chat.kwailink.ISelfCallback");
    }
    public static g L1(){
       return g$a$a.b;
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       if (PatchProxy.isSupport(g$a.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, p2, Integer.valueOf(p3), this, g$a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                if (p0 != 0x5f4e5446) {
                   return super.onTransact(p0, p1, p2, p3);
                }else {
                   p2.writeString("com.kwai.chat.kwailink.ISelfCallback");
                   return 1;
                }
             }else {
                p1.enforceInterface("com.kwai.chat.kwailink.ISelfCallback");
                this.X(p1.readLong());
                p2.writeNoException();
                return 1;
             }
          }else {
             p1.enforceInterface("com.kwai.chat.kwailink.ISelfCallback");
             this.R0(p1.readString());
             p2.writeNoException();
             return 1;
          }
       }else {
          p1.enforceInterface("com.kwai.chat.kwailink.ISelfCallback");
          this.A0(p1.readLong());
          p2.writeNoException();
          return 1;
       }
    }
}
