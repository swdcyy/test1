package com.hpplay.sdk.source.d$a$a;
import com.hpplay.sdk.source.d;
import android.os.IBinder;
import java.lang.Object;
import java.lang.String;
import android.os.Parcel;

public class d$a$a implements d	// class@000667
{
    public IBinder a;

    public void d$a$a(IBinder p0){
       super();
       this.a = p0;
    }
    public IBinder asBinder(){
       return this.a;
    }
    public String getInterfaceDescriptor(){
       return "com.hpplay.sdk.source.LelinkPlayListener";
    }
    public void onCompletion(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.LelinkPlayListener");
       this.a.transact(4, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public void onError(int p0,int p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.LelinkPlayListener");
       parcel.writeInt(p0);
       parcel.writeInt(p1);
       this.a.transact(8, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public void onInfo(int p0,int p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.LelinkPlayListener");
       parcel.writeInt(p0);
       parcel.writeInt(p1);
       this.a.transact(7, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public void onLoading(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.LelinkPlayListener");
       this.a.transact(1, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public void onPause(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.LelinkPlayListener");
       this.a.transact(3, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public void onPositionUpdate(long p0,long p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.LelinkPlayListener");
       parcel.writeLong(p0);
       parcel.writeLong(p1);
       this.a.transact(10, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public void onSeekComplete(int p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.LelinkPlayListener");
       parcel.writeInt(p0);
       this.a.transact(6, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public void onStart(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.LelinkPlayListener");
       this.a.transact(2, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public void onStop(){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.LelinkPlayListener");
       this.a.transact(5, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
    public void onVolumeChanged(float p0){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeInterfaceToken("com.hpplay.sdk.source.LelinkPlayListener");
       parcel.writeFloat(p0);
       this.a.transact(9, parcel, parcel1, 0);
       parcel1.readException();
       parcel1.recycle();
       parcel.recycle();
    }
}
