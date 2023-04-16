package ki7.a$a;
import ki7.a;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import ki7.a$a$a;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ki7.b;
import ki7.b$a;
import android.content.Intent;
import android.os.Parcelable$Creator;

public abstract class a$a extends Binder implements a	// class@002b71
{
    public static final int a;

    public void a$a(){
       super();
       this.attachInterface(this, "com.kwai.plugin.dva.component.service.ServiceConnectContract");
    }
    public static a L1(){
       return a$a$a.b;
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       if (PatchProxy.isSupport(a$a.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, p2, Integer.valueOf(p3), this, a$a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       Intent intent = null;
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                if (p0 != 4) {
                   if (p0 != 0x5f4e5446) {
                      return super.onTransact(p0, p1, p2, p3);
                   }else {
                      p2.writeString("com.kwai.plugin.dva.component.service.ServiceConnectContract");
                      return 1;
                   }
                }else {
                   p1.enforceInterface("com.kwai.plugin.dva.component.service.ServiceConnectContract");
                   this.P(p1.readInt(), b$a.L1(p1.readStrongBinder()));
                   p2.writeNoException();
                   return 1;
                }
             }else {
                p1.enforceInterface("com.kwai.plugin.dva.component.service.ServiceConnectContract");
                this.S0(p1.readInt(), b$a.L1(p1.readStrongBinder()));
                p2.writeNoException();
                return 1;
             }
          }else {
             p1.enforceInterface("com.kwai.plugin.dva.component.service.ServiceConnectContract");
             p0 = p1.readInt();
             if (p1.readInt()) {
                intent = Intent.CREATOR.createFromParcel(p1);
             }
             p2.writeNoException();
             p2.writeInt(this.R(p0, intent));
             return 1;
          }
       }else {
          p1.enforceInterface("com.kwai.plugin.dva.component.service.ServiceConnectContract");
          p0 = p1.readInt();
          if (p1.readInt()) {
             intent = Intent.CREATOR.createFromParcel(p1);
          }
          p2.writeNoException();
          p2.writeStrongBinder(this.U0(p0, intent));
          return 1;
       }
    }
}
