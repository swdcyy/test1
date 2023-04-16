package com.hpplay.sdk.source.f$a;
import com.hpplay.sdk.source.f;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import com.hpplay.sdk.source.f$a$a;
import android.os.Parcel;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import java.lang.Object;
import android.os.Parcelable$Creator;

public abstract class f$a extends Binder implements f	// class@00066e
{

    public void f$a(){
       super();
       this.attachInterface(this, "com.hpplay.sdk.source.ParceResultListener");
    }
    public static f asInterface(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("com.hpplay.sdk.source.ParceResultListener");
       if (iInterface != null && iInterface instanceof f) {
          return iInterface;
       }
       return new f$a$a(p0);
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       if (p0 != 1) {
          if (p0 != 0x5f4e5446) {
             return super.onTransact(p0, p1, p2, p3);
          }else {
             p2.writeString("com.hpplay.sdk.source.ParceResultListener");
             return 1;
          }
       }else {
          p1.enforceInterface("com.hpplay.sdk.source.ParceResultListener");
          p0 = p1.readInt();
          LelinkServiceInfo lelinkServic = (p1.readInt())? LelinkServiceInfo.CREATOR.createFromParcel(p1): null;
          this.onParceResult(p0, lelinkServic);
          p2.writeNoException();
          return 1;
       }
    }
}
