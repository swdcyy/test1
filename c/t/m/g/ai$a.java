package c.t.m.g.ai$a;
import c.t.m.g.ai;
import android.os.IBinder;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.os.Parcel;
import java.lang.Throwable;
import c.t.m.g.bt;
import android.os.Build$VERSION;
import android.content.ContentResolver;
import android.provider.Settings$Global;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class ai$a implements ai	// class@000bbe
{
    public IBinder a;
    public Context b;

    public void ai$a(IBinder p0,Context p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public String a(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
       this.a.transact(1, parcel, parcel1, 0);
       parcel1.readException();
       String str = parcel1.readString();
       parcel.recycle();
       parcel1.recycle();
       return str;
    }
    public IBinder asBinder(){
       return this.a;
    }
    public boolean b(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       int i = 1;
       parcel.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
       this.a.transact(i, parcel, parcel1, 0);
       parcel1.readException();
       if (!parcel1.readInt()) {
          i = false;
       }
       parcel.recycle();
       parcel1.recycle();
       return i;
    }
    public String c(){
       String str = "get oaid failed";
       if (Build$VERSION.SDK_INT >= 24) {
          String str1 = Settings$Global.getString(this.b.getContentResolver(), "pps_oaid");
          String str2 = Settings$Global.getString(this.b.getContentResolver(), "pps_track_limit");
          if (TextUtils.isEmpty(str1) || TextUtils.isEmpty(str2)) {
             str = str1;
          }
       }else {
          str = null;
       }
       return str;
    }
}
