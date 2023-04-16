package android.support.v4.app.a$a$a;
import android.support.v4.app.a;
import android.os.IBinder;
import java.lang.Object;
import java.lang.String;
import android.os.Parcel;
import android.support.v4.app.a$a;
import android.app.Notification;

public class a$a$a implements a	// class@0003b0
{
    public IBinder a;
    public static a b;

    public void a$a$a(IBinder p0){
       super();
       this.a = p0;
    }
    public void Q(String p0,int p1,String p2){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
       parcel.writeString(p0);
       parcel.writeInt(p1);
       parcel.writeString(p2);
       if (!this.a.transact(2, parcel, null, 1) && a$a.M1() != null) {
          a$a.M1().Q(p0, p1, p2);
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
    public void j1(String p0,int p1,String p2,Notification p3){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
       parcel.writeString(p0);
       parcel.writeInt(p1);
       parcel.writeString(p2);
       int i = 0;
       if (p3 != null) {
          parcel.writeInt(1);
          p3.writeToParcel(parcel, i);
       }else {
          parcel.writeInt(i);
       }
       if (!this.a.transact(1, parcel, null, 1) && a$a.M1() != null) {
          a$a.M1().j1(p0, p1, p2, p3);
          parcel.recycle();
          return;
       }else {
          parcel.recycle();
          return;
       }
    }
    public void v1(String p0){
       Parcel parcel = Parcel.obtain();
       parcel.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
       parcel.writeString(p0);
       if (!this.a.transact(3, parcel, null, 1) && a$a.M1() != null) {
          a$a.M1().v1(p0);
          parcel.recycle();
          return;
       }else {
          parcel.recycle();
          return;
       }
    }
}
