package com.kwai.social.startup.relation.model.AccountFreezeConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class AccountFreezeConfig implements Serializable	// class@0018ac
{
    public String mFreezeUrl;
    public String mUnFreezeUrl;
    public static final long serialVersionUID = 0x877f80e68245f520;

    public void AccountFreezeConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AccountFreezeConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AccountFreezeConfig{mFreezeUrl=\'"+this.mFreezeUrl+'''+", mUnFreezeUrl=\'"+this.mUnFreezeUrl+'''+'}';
    }
}
