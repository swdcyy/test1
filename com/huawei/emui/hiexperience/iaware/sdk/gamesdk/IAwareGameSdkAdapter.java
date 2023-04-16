package com.huawei.emui.hiexperience.iaware.sdk.gamesdk.IAwareGameSdkAdapter;
import java.lang.Object;
import java.lang.String;
import com.huawei.emui.hiexperience.iaware.sdk.gamesdk.IAwareGameSdk$GameCallBack;
import android.os.Process;
import com.huawei.emui.hiexperience.iaware.sdk.gamesdk.IAwareGameSdkAdapter$SDKCallback;
import android.os.Parcel;
import android.os.IBinder;
import java.lang.StringBuilder;

public class IAwareGameSdkAdapter	// class@0006b5
{
    public boolean isRegistedSuccess;
    public IAwareGameSdk$GameCallBack mGameCbk;
    public String mPackageName;
    public IAwareGameSdkAdapter$SDKCallback mSdkCbk;
    public int myPid;
    public static int INTERFACE_ID_REGISTER_GAME_CALLBACK = 4;
    public static int INTERFACE_ID_REPORT_DATA = 1;

    public void IAwareGameSdkAdapter(){
       super();
       this.mGameCbk = null;
       this.mSdkCbk = null;
       this.mPackageName = "";
       this.myPid = 0;
       this.isRegistedSuccess = false;
    }
    public boolean registerGameCallback(String p0,IAwareGameSdk$GameCallBack p1){
       this.mGameCbk = p1;
       this.mPackageName = p0;
       this.myPid = Process.myPid();
       if (this.mGameCbk != null && this.mSdkCbk == null) {
          this.mSdkCbk = new IAwareGameSdkAdapter$SDKCallback(this);
          this.isRegistedSuccess = this.registerSdkCallback(p0, this.mSdkCbk);
       }
       return this.isRegistedSuccess;
    }
    public final boolean registerSdkCallback(String p0,IAwareGameSdkAdapter$SDKCallback p1){
       Parcel parcel = Parcel.obtain();
       Parcel parcel1 = Parcel.obtain();
       parcel.writeString(p0);
       parcel.writeStrongBinder(p1);
       parcel1.recycle();
       parcel.recycle();
       boolean b = (parcel1.readInt() > 0)? true: false;
       return b;
    }
    public void reportData(String p0){
       if (this.isRegistedSuccess == null) {
          return;
       }
       Parcel parcel = Parcel.obtain();
       parcel.writeInt(3005);
       parcel.writeLong(0);
       parcel.writeString(String.valueOf(1)+"&&"+this.mPackageName+"&&"+this.myPid+"&&"+p0);
       parcel.recycle();
       return;
    }
}
