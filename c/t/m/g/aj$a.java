package c.t.m.g.aj$a;
import c.t.m.g.aj;
import android.os.Binder;
import android.os.Parcel;
import java.lang.String;

public abstract class aj$a extends Binder implements aj	// class@000bc1
{

    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                if (p0 != 4) {
                   if (p0 != 5) {
                      if (p0 != 0x5f4e5446) {
                         return super.onTransact(p0, p1, p2, p3);
                      }
                      p2.writeString("com.zui.deviceidservice.IDeviceidInterface");
                      return 1;
                   }else {
                      p1.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                      p2.writeNoException();
                      p2.writeString(this.b(p1.readString()));
                      return 1;
                   }
                }else {
                   p1.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                   p2.writeNoException();
                   p2.writeString(this.a(p1.readString()));
                   return 1;
                }
             }else {
                p1.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
                p2.writeNoException();
                p2.writeInt(this.c());
                return 1;
             }
          }else {
             p1.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
             p2.writeNoException();
             p2.writeString(this.b());
             return 1;
          }
       }else {
          p1.enforceInterface("com.zui.deviceidservice.IDeviceidInterface");
          p2.writeNoException();
          p2.writeString(this.a());
          return 1;
       }
    }
}
