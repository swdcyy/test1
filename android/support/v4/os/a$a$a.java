package android.support.v4.os.a$a$a;
import android.support.v4.os.a;
import android.os.IBinder;
import java.lang.Object;
import android.os.Bundle;
import android.os.Parcel;
import java.lang.String;
import android.support.v4.os.a$a;

public class a$a$a implements a	// class@00040c
{
    public IBinder a;
    public static a b;

    public void a$a$a(IBinder p0){
       super();
       this.a = p0;
    }
    public void W0(int p0,Bundle p1){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.os.IResultReceiver");
       parcel.writeInt(p0);
       int i = 0;
       if (p1 != null) {
          parcel.writeInt(1);
          p1.writeToParcel(parcel, i);
       }else {
          parcel.writeInt(i);
       }
       if (!this.a.transact(1, parcel, null, 1) && a$a.M1() != null) {
          a$a.M1().W0(p0, p1);
          parcel.recycle();
          return;
       }else {
          parcel.recycle();
          return;
       }
    }
    public IBinder asBinder(){
       return this.a;
    }
}
