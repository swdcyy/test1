package com.yxcorp.gifshow.relation.intimate.rn.IntimateRNModel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class IntimateRNModel implements Serializable	// class@001918
{
    public int mIntimateType;
    public String mProposeInfo;
    public boolean mShowStatus;
    public int mSource;
    public String mUserId;
    public String mUserName;
    public static final long serialVersionUID = 0x10c7755f6eb34a6e;

    public void IntimateRNModel(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, IntimateRNModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "IntimateRNModel{mUserId=\'"+this.mUserId+'''+", mShowStatus="+this.mShowStatus+", mUserName=\'"+this.mUserName+'''+", mIntimateType="+this.mIntimateType+", mSource="+this.mSource+'}';
    }
}
