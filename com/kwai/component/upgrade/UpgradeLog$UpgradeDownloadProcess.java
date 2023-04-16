package com.kwai.component.upgrade.UpgradeLog$UpgradeDownloadProcess;
import com.kwai.component.upgrade.UpgradeLog$UpgradeBaseInfo;
import bkd.b;
import java.lang.String;

public class UpgradeLog$UpgradeDownloadProcess extends UpgradeLog$UpgradeBaseInfo	// class@000bf9
{
    public final long mCost;
    public final String mFailedReason;
    public final int mResult;

    public void UpgradeLog$UpgradeDownloadProcess(b p0,boolean p1,long p2,int p3,String p4){
       super(p0, p1);
       this.mCost = p2;
       this.mResult = p3;
       this.mFailedReason = p4;
    }
}
