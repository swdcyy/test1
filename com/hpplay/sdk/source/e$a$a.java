package com.hpplay.sdk.source.e$a$a;
import com.hpplay.sdk.source.e;
import android.os.IBinder;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import android.os.Parcel;

public class e$a$a implements e	// class@00066a
{
    public IBinder a;

    public void e$a$a(IBinder p0){
       super();
       this.a = p0;
    }
    public IBinder asBinder(){
       return this.a;
    }
    public String getInterfaceDescriptor(){
       return "com.hpplay.sdk.source.OnLineCheckListener";
    }
    public void onResult(int p0,List p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.OnLineCheckListener");
       parcel.writeInt(p0);
       parcel.writeTypedList(p1);
       this.a.transact(1, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
}