package com.huawei.emui.hiexperience.iaware.sdk.gamesdk.IAwareGameSdkAdapter$SDKCallback;
import android.os.IInterface;
import android.os.Binder;
import com.huawei.emui.hiexperience.iaware.sdk.gamesdk.IAwareGameSdkAdapter;
import java.lang.String;
import android.os.IBinder;
import android.os.Parcel;
import com.huawei.emui.hiexperience.iaware.sdk.gamesdk.IAwareGameSdk$GameCallBack;

public class IAwareGameSdkAdapter$SDKCallback extends Binder implements IInterface	// class@0006b4
{
    public final IAwareGameSdkAdapter this$0;

    public void IAwareGameSdkAdapter$SDKCallback(IAwareGameSdkAdapter p0){
       this.this$0 = p0;
       super();
       this.attachInterface(this, "com.huawei.iaware.sdk.ISDKCallbak");
    }
    public IBinder asBinder(){
       return this;
    }
    public boolean onTransact(int p0,Parcel p1,Parcel p2,int p3){
       IAwareGameSdkAdapter$SDKCallback tthis$0;
       if (p0 < 1 || p0 > 0xffffff) {
          return super.onTransact(p0, p1, p2, p3);
       }
       boolean b = false;
       if (p0 != 1) {
          return b;
       }
       try{
          p1.enforceInterface("com.huawei.iaware.sdk.ISDKCallbak");
          String str = p1.readString();
          tthis$0 = this.this$0;
          if (tthis$0.mGameCbk != null && tthis$0.isRegistedSuccess != null) {
             this.this$0.mGameCbk.getPhoneInfo(str);
          }
          return 1;
       }catch(java.lang.SecurityException e0){
          return tthis$0.mGameCbk;
       }
    }
}
