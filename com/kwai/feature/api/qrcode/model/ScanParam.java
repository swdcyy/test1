package com.kwai.feature.api.qrcode.model.ScanParam;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class ScanParam implements Serializable	// class@001077
{
    public String mActivityType;
    public boolean mIsForceCloseScanPage;
    public boolean mIsNeedCallBack;
    public String mScanPageSource;
    public List mTargetHandlerActionList;
    public static final long serialVersionUID = 0x8787e7c07e53d66;

    public void ScanParam(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ScanParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ScanParam{mScanPageSource=\'"+this.mScanPageSource+'''+", mActivityType=\'"+this.mActivityType+'''+", mIsNeedCallBack="+this.mIsNeedCallBack+", mTargetHandlerActionList="+this.mTargetHandlerActionList+", mIsForceCloseScanPage="+this.mIsForceCloseScanPage+'}';
    }
}
