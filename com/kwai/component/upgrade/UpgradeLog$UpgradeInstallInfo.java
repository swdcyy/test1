package com.kwai.component.upgrade.UpgradeLog$UpgradeInstallInfo;
import java.io.Serializable;
import java.lang.Object;

public class UpgradeLog$UpgradeInstallInfo implements Serializable	// class@000bfa
{
    public int mCurrentVersion;
    public int mNewVersion;
    public int mOldVersion;
    public int mResult;

    public void UpgradeLog$UpgradeInstallInfo(int p0,int p1,int p2,int p3){
       super();
       this.mResult = p0;
       this.mOldVersion = p1;
       this.mNewVersion = p2;
       this.mCurrentVersion = p3;
    }
}
