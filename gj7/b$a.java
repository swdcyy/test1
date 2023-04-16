package gj7.b$a;
import gj7.b;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gj7.b$a$a;
import android.os.Parcel;
import java.lang.Integer;
import java.lang.Boolean;

public abstract class b$a extends Binder implements b	// class@00259e
{

    public void b$a(){
       super();
       this.attachInterface(this, "com.kwai.plugin.dva.install.contract.PluginInstallServiceContractListener");
    }
    public static b L1(IBinder p0){
       Object obj = null;
       IInterface obj1 = PatchProxy.applyOneRefs(p0, obj, b$a.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = p0.queryLocalInterface("com.kwai.plugin.dva.install.contract.PluginInstallServiceContractListener");
       if (obj1 != null && obj1 instanceof b) {
          return obj1;
       }
       return new b$a$a(p0);
    }
    public static b M1(){
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
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                if (p0 != 4) {
                   if (p0 != 5) {
                      if (p0 != 0x5f4e5446) {
                         return super.onTransact(p0, p1, p2, p3);
                      }else {
                         p2.writeString("com.kwai.plugin.dva.install.contract.PluginInstallServiceContractListener");
                         return 1;
                      }
                   }else {
                      p1.enforceInterface("com.kwai.plugin.dva.install.contract.PluginInstallServiceContractListener");
                      this.onProgress(p1.readFloat());
                      p2.writeNoException();
                      return 1;
                   }
                }else {
                   p1.enforceInterface("com.kwai.plugin.dva.install.contract.PluginInstallServiceContractListener");
                   this.onCancel();
                   p2.writeNoException();
                   return 1;
                }
             }else {
                p1.enforceInterface("com.kwai.plugin.dva.install.contract.PluginInstallServiceContractListener");
                this.onFail(p1.readInt(), p1.readString());
                p2.writeNoException();
                return 1;
             }
          }else {
             p1.enforceInterface("com.kwai.plugin.dva.install.contract.PluginInstallServiceContractListener");
             this.d();
             p2.writeNoException();
             return 1;
          }
       }else {
          p1.enforceInterface("com.kwai.plugin.dva.install.contract.PluginInstallServiceContractListener");
          this.onStart();
          p2.writeNoException();
          return 1;
       }
    }
}
