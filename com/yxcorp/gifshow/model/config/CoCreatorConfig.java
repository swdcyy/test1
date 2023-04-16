package com.yxcorp.gifshow.model.config.CoCreatorConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class CoCreatorConfig implements Serializable	// class@001eb6
{
    public Map mCoCreateRoleMap;
    public String mCoCreateTimeAlertText;
    public int mCoCreateTimesQuota;
    public int mCoCreatorCountMax;
    public int mCoCreatorCountMin;
    public boolean mShowCoCreateEntrance;
    public static final long serialVersionUID = 0xd8d7d4194e0427b0;

    public void CoCreatorConfig(){
       super();
       this.mCoCreatorCountMin = 1;
       this.mCoCreatorCountMax = 30;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, CoCreatorConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "CoCreatorConfig{mCoCreateTimesQuota="+this.mCoCreateTimesQuota+", mCoCreateTimeAlertText=\'"+this.mCoCreateTimeAlertText+'''+", mShowCoCreateEntrance="+this.mShowCoCreateEntrance+", mCoCreateRoleMap="+this.mCoCreateRoleMap+'}';
    }
}
