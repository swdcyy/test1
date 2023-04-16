package com.kuaishou.merchant.bridgecenter.params.MerchantTroubleShootingLogParams;
import com.kuaishou.merchant.bridgecenter.params.MerchantDebugLoggerParams;

public class MerchantTroubleShootingLogParams extends MerchantDebugLoggerParams	// class@001626
{
    public List batchLogs;
    public String error;
    public boolean isMarkNodeSuccess;
    public int logLevel;
    public int rootTag;
    public long timeStamp;
    public String tsComponentId;
    public String tsPageId;
    public static final long serialVersionUID = 0x372b7ed3f6823701;

    public void MerchantTroubleShootingLogParams(){
       super();
    }
}
