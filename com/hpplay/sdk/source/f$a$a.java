package com.hpplay.sdk.source.f$a$a;
import com.hpplay.sdk.source.f;
import android.os.IBinder;
import java.lang.Object;
import java.lang.String;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import android.os.Parcel;

public class f$a$a implements f	// class@00066d
{
    public IBinder a;

    public void f$a$a(IBinder p0){
       super();
       this.a = p0;
    }
    public IBinder asBinder(){
       return this.a;
    }
    public String getInterfaceDescriptor(){
       return "com.hpplay.sdk.source.ParceResultListener";
    }
    public void onParceResult(int p0,LelinkServiceInfo p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.ParceResultListener");
       parcel.writeInt(p0);
       if (p1 != null) {
          parcel.writeInt(1);
          p1.writeToParcel(parcel, 0);
       }else {
          parcel.writeInt(0);
       }
       this.a.transact(1, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
       return;
    }
}
