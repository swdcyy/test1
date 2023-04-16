package gj7.a$a;
import gj7.a;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import gj7.a$a$a;
import android.os.IBinder;
import android.os.Parcel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import gj7.b;
import gj7.b$a;

public abstract class a$a extends Binder implements a	// class@00259b
{
    public static final int a;

    public void a$a(){
       super();
       this.attachInterface(this, "com.kwai.plugin.dva.install.contract.PluginInstallServiceContract");
    }
    public static a L1(){
       return a$a$a.b;
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       String obj;
       int i = p0;
       if (PatchProxy.isSupport(a$a.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), p1, p2, Integer.valueOf(p3), this, a$a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = "com.kwai.plugin.dva.install.contract.PluginInstallServiceContract";
       if (i != true) {
          if (i != 2) {
             if (i != 3) {
                if (i != 0x5f4e5446) {
                   return super.onTransact(p0, p1, p2, p3);
                }else {
                   p2.writeString(obj);
                   return true;
                }
             }else {
                p1.enforceInterface(obj);
                this.H1(p1.readString(), p1.readInt(), b$a.L1(p1.readStrongBinder()));
                p2.writeNoException();
                return true;
             }
          }else {
             p1.enforceInterface(obj);
             this.N0(p1.readString(), p1.readInt(), p1.readString(), p1.readString(), b$a.L1(p1.readStrongBinder()));
             p2.writeNoException();
             return true;
          }
       }else {
          p1.enforceInterface(obj);
          this.z1(p1.readString(), p1.readInt(), p1.readString(), p1.readString(), b$a.L1(p1.readStrongBinder()));
          p2.writeNoException();
          return true;
       }
    }
}
