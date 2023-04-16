package com.kwai.component.upgrade.UpgradeLog$UpgradeBaseInfo;
import java.io.Serializable;
import bkd.b;
import java.lang.Object;

public class UpgradeLog$UpgradeBaseInfo implements Serializable	// class@000bf6
{
    public final boolean mIsHuidu;
    public final boolean mUserRequest;
    public final int mVersionCode;
    public final String mVersionName;

    public void UpgradeLog$UpgradeBaseInfo(b p0,boolean p1){
       super();
       this.mUserRequest = p1;
       if (p0 != null) {
          this.mIsHuidu = p0.c ^ 0x01;
          this.mVersionName = p0.k;
          this.mVersionCode = p0.l;
       }else {
          this.mIsHuidu = false;
          this.mVersionName = "";
          this.mVersionCode = 0;
       }
       return;
    }
}
