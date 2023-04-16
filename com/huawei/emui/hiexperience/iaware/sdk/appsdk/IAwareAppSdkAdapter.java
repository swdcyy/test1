package com.huawei.emui.hiexperience.iaware.sdk.appsdk.IAwareAppSdkAdapter;
import java.lang.Object;
import java.lang.String;
import com.huawei.emui.hiexperience.iaware.sdk.appsdk.IAwareAppSdk$AppCallBack;
import android.os.Process;
import com.huawei.emui.hiexperience.iaware.sdk.appsdk.IAwareAppSdkAdapter$SDKCallback;
import android.os.Parcel;
import android.os.IBinder;
import java.lang.StringBuilder;

public class IAwareAppSdkAdapter	// class@0006b0
{
    public boolean isRegistedSuccess;
    public IAwareAppSdk$AppCallBack mAppCbk;
    public String mPackageName;
    public IAwareAppSdkAdapter$SDKCallback mSdkCbk;
    public int myPid;
    public static int INTERFACE_ID_REGISTER_APP_CALLBACK = 9;
    public static int INTERFACE_ID_REPORT_DATA = 1;

    public void IAwareAppSdkAdapter(){
       super();
       this.mAppCbk = null;
       this.mSdkCbk = null;
       this.mPackageName = "";
       this.myPid = 0;
       this.isRegistedSuccess = false;
    }
    public boolean registerAppCallback(String p0,IAwareAppSdk$AppCallBack p1){
       this.mAppCbk = p1;
       this.mPackageName = p0;
       this.myPid = Process.myPid();
       if (this.mAppCbk != null && this.mSdkCbk == null) {
          IAwareAppSdkAdapter$SDKCallback sDKCallback = new IAwareAppSdkAdapter$SDKCallback(this);
          this.mSdkCbk = sDKCallback;
          this.isRegistedSuccess = this.registerSdkCallback(p0, sDKCallback);
       }
       return this.isRegistedSuccess;
    }
    public final boolean registerSdkCallback(String p0,IAwareAppSdkAdapter$SDKCallback p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeString(p0);
       parcel.writeStrongBinder(p1);
       parcel1.recycle();
       parcel.recycle();
       boolean b = (parcel1.readInt() > 0)? true: false;
       return b;
    }
    public void reportScene(String p0){
       if (this.isRegistedSuccess == null) {
          return;
       }
       Parcel parcel = Parcel.obtain();
       parcel.writeInt(3009);
       parcel.writeLong(0);
       parcel.writeString(String.valueOf(1)+"&&"+this.myPid+"&&"+this.mPackageName+"&&"+p0);
       parcel.recycle();
       return;
    }
    public void reportVip(String p0){
       if (this.isRegistedSuccess == null) {
          return;
       }
       Parcel parcel = Parcel.obtain();
       parcel.writeInt(3010);
       parcel.writeLong(0);
       parcel.writeString(String.valueOf(1)+"&&"+this.myPid+"&&"+this.mPackageName+"&&"+p0);
       parcel.recycle();
       return;
    }
}
