package com.kuaishou.merchant.api.core.model.MerchantLivePlayConfig$Task;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class MerchantLivePlayConfig$Task implements Serializable	// class@001534
{
    public long mRanMills;
    public int mType;
    public int mValue;
    public static final long serialVersionUID = 0x20c90be299b944b5;

    public void MerchantLivePlayConfig$Task(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MerchantLivePlayConfig$Task.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Task{mType="+this.mType+", mValue="+this.mValue+", mRanMills="+this.mRanMills+'}';
    }
}
