package m0.a$a;
import m0.a;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import android.os.Parcel;
import android.content.pm.PackageStats;
import java.lang.Object;
import android.os.Parcelable$Creator;

public abstract class a$a extends Binder implements a	// class@001e24
{

    public void a$a(){
       super();
       this.attachInterface(this, "android.content.pm.IPackageStatsObserver");
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       if (p0 != 1) {
          if (p0 != 0x5f4e5446) {
             return super.onTransact(p0, p1, p2, p3);
          }else {
             p2.writeString("android.content.pm.IPackageStatsObserver");
             return 1;
          }
       }else {
          p1.enforceInterface("android.content.pm.IPackageStatsObserver");
          PackageStats packageStats = (p1.readInt())? PackageStats.CREATOR.createFromParcel(p1): null;
          boolean b = (p1.readInt())? true: false;
          this.O(packageStats, b);
          return 1;
       }
    }
}
