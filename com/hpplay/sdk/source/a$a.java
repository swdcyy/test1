package com.hpplay.sdk.source.a$a;
import com.hpplay.sdk.source.a;
import android.os.Binder;
import android.os.IInterface;
import java.lang.String;
import android.os.IBinder;
import com.hpplay.sdk.source.a$a$a;
import android.os.Parcel;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import android.os.Parcelable$Creator;
import java.util.ArrayList;
import java.util.List;

public abstract class a$a extends Binder implements a	// class@000632
{

    public void a$a(){
       super();
       this.attachInterface(this, "com.hpplay.sdk.source.BrowseResultListener");
    }
    public static a asInterface(IBinder p0){
       if (p0 == null) {
          return null;
       }
       IInterface iInterface = p0.queryLocalInterface("com.hpplay.sdk.source.BrowseResultListener");
       if (iInterface != null && iInterface instanceof a) {
          return iInterface;
       }
       return new a$a$a(p0);
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       if (p0 != 1) {
          if (p0 != 0x5f4e5446) {
             return super.onTransact(p0, p1, p2, p3);
          }
          p2.writeString("com.hpplay.sdk.source.BrowseResultListener");
          return 1;
       }else {
          p1.enforceInterface("com.hpplay.sdk.source.BrowseResultListener");
          this.onResult(p1.readInt(), p1.createTypedArrayList(LelinkServiceInfo.CREATOR));
          p2.writeNoException();
          return 1;
       }
    }
}
