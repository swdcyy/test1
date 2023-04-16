package com.huawei.emui.hiexperience.iaware.sdk.gamesdk.IAwareGameSdk;
import java.lang.Object;
import com.huawei.emui.hiexperience.iaware.sdk.gamesdk.IAwareGameSdk$1;
import java.lang.String;
import com.huawei.emui.hiexperience.iaware.sdk.gamesdk.IAwareGameSdk$GameCallBack;
import com.huawei.emui.hiexperience.iaware.sdk.gamesdk.IAwareGameSdkAdapter;

public class IAwareGameSdk	// class@0006b3
{
    public IAwareGameSdk$GameCallBack gameCbk;
    public IAwareGameSdkAdapter mIAwareGameSdkAdapter;
    public String mPhoneInfo;

    public void IAwareGameSdk(){
       super();
       this.mPhoneInfo = "";
       this.mIAwareGameSdkAdapter = null;
       this.gameCbk = new IAwareGameSdk$1(this);
    }
    public String getPhoneInfo(){
       return this.mPhoneInfo;
    }
    public boolean registerGame(String p0){
       return this.registerGame(p0, this.gameCbk);
    }
    public boolean registerGame(String p0,IAwareGameSdk$GameCallBack p1){
       boolean b = false;
       if (p0 == null || (p0.length() > 0 && p0.length() <= 256)) {
          if (p1 == null) {
             return b;
          }else if(this.mIAwareGameSdkAdapter == null){
             IAwareGameSdkAdapter iAwareGameSd = new IAwareGameSdkAdapter();
             this.mIAwareGameSdkAdapter = iAwareGameSd;
             return iAwareGameSd.registerGameCallback(p0, p1);
          }
       }
       return b;
    }
    public void updateGameAppInfo(String p0){
       if (p0 == null || (p0.length() > 0 && p0.length() <= 256)) {
          IAwareGameSdk tmIAwareGame = this.mIAwareGameSdkAdapter;
          if (tmIAwareGame != null) {
             tmIAwareGame.reportData(p0);
          }
       }
       return;
    }
}
