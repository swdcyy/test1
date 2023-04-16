package com.kwai.chat.kwailink.f$a;
import com.kwai.chat.kwailink.f;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import com.kwai.chat.kwailink.f$a$a;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public abstract class f$a extends Binder implements f	// class@000a52
{

    public void f$a(){
       super();
       this.attachInterface(this, "com.kwai.chat.kwailink.IPushNotifierCallback");
    }
    public static f L1(){
       return f$a$a.b;
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       if (PatchProxy.isSupport(f$a.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, p2, Integer.valueOf(p3), this, f$a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 != 1) {
          if (p0 != 0x5f4e5446) {
             return super.onTransact(p0, p1, p2, p3);
          }else {
             p2.writeString("com.kwai.chat.kwailink.IPushNotifierCallback");
             return 1;
          }
       }else {
          p1.enforceInterface("com.kwai.chat.kwailink.IPushNotifierCallback");
          this.w1(p1.readString());
          p2.writeNoException();
          return 1;
       }
    }
}
