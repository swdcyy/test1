package com.hpplay.sdk.source.g$a$a;
import com.hpplay.sdk.source.g;
import android.os.IBinder;
import java.lang.Object;
import java.lang.String;
import android.os.Parcel;

public class g$a$a implements g	// class@000670
{
    public IBinder a;

    public void g$a$a(IBinder p0){
       super();
       this.a = p0;
    }
    public IBinder asBinder(){
       return this.a;
    }
    public String getInterfaceDescriptor(){
       return "com.hpplay.sdk.source.PcAuthListener";
    }
    public void onAuthFailed(int p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.PcAuthListener");
       parcel.writeInt(p0);
       this.a.transact(2, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public void onAuthSuccess(String p0,String p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.PcAuthListener");
       parcel.writeString(p0);
       parcel.writeString(p1);
       this.a.transact(1, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
}
