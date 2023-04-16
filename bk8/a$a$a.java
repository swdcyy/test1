package bk8.a$a$a;
import bk8.a;
import android.os.IBinder;
import java.lang.Object;
import java.lang.String;
import android.os.Parcel;

public class a$a$a implements a	// class@000423
{
    public IBinder a;
    public String b;

    public void a$a$a(IBinder p0){
       super();
       this.b = "omediatestkey";
       this.a = p0;
    }
    public String C1(String p0,String p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.oppo.omedia.IOMediaService");
       if (p1 == null) {
          parcel.writeString("omediatestkey");
       }else {
          parcel.writeString(p1);
       }
       parcel.writeString(p0);
       this.a.transact(1, parcel, parcel1, 0);
       parcel1.readException();
       p0 = parcel1.readString();
       parcel1.recycle();
       parcel.recycle();
       if (p0 != null) {
          this.b = p1;
       }
       return p0;
    }
    public String D0(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.oppo.omedia.IOMediaService");
       parcel.writeString(this.b);
       this.a.transact(3, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return parcel1.readString();
    }
    public String X0(String p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.oppo.omedia.IOMediaService");
       parcel.writeString(this.b);
       parcel.writeString(p0);
       this.a.transact(2, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return parcel1.readString();
    }
    public boolean Y(String p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.oppo.omedia.IOMediaService");
       parcel.writeString(this.b);
       parcel.writeString(p0);
       int i = 0;
       this.a.transact(4, parcel, parcel1, i);
       parcel1.readException();
       if (parcel1.readInt()) {
          i = true;
       }
       parcel1.recycle();
       parcel.recycle();
       return i;
    }
    public IBinder asBinder(){
       return this.a;
    }
}
