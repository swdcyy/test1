package o4.c;
import o4.a;
import android.os.IBinder;
import java.lang.Object;
import java.lang.String;
import android.os.Parcel;
import o4.b;

public class c implements a	// class@002755
{
    public IBinder a;

    public void c(IBinder p0){
       this.a = p0;
    }
    public String a(String p0,String p1,String p2){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken(b.a);
       parcel.writeString(p0);
       parcel.writeString(p1);
       parcel.writeString(p2);
       this.a.transact(1, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return parcel1.readString();
    }
    public IBinder asBinder(){
       return this.a;
    }
}
