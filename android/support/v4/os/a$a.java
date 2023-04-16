package android.support.v4.os.a$a;
import android.support.v4.os.a;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import android.support.v4.os.a$a$a;
import android.os.Parcel;
import android.os.Bundle;
import java.lang.Object;
import android.os.Parcelable$Creator;
import android.support.v4.os.ResultReceiver$b;

public abstract class a$a extends Binder implements a	// class@00040d
{

    public void a$a(){
       super();
       this.attachInterface(this, "android.support.v4.os.IResultReceiver");
    }
    public static a L1(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("android.support.v4.os.IResultReceiver");
       if (iInterface != null && iInterface instanceof a) {
          return iInterface;
       }
       return new a$a$a(p0);
    }
    public static a M1(){
       return a$a$a.b;
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       if (p0 != 1) {
          if (p0 != 0x5f4e5446) {
             return super.onTransact(p0, p1, p2, p3);
          }else {
             p2.writeString("android.support.v4.os.IResultReceiver");
             return 1;
          }
       }else {
          p1.enforceInterface("android.support.v4.os.IResultReceiver");
          p0 = p1.readInt();
          Bundle uBundle = (p1.readInt())? Bundle.CREATOR.createFromParcel(p1): null;
          this.W0(p0, uBundle);
          return 1;
       }
    }
}
