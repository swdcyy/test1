package com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveMerchantForbiddenConfig;
import java.io.Serializable;
import java.lang.Object;

public class LiveConfigStartupResponse$LiveMerchantForbiddenConfig implements Serializable	// class@001056
{
    public boolean mDisableMerchantForbiddenWhenChat;
    public boolean mDisableMerchantForbiddenWhenPk;
    public boolean mDisableNewVersionMirror;
    public static final long serialVersionUID = 0x6d69778d98cd1cbe;

    public void LiveConfigStartupResponse$LiveMerchantForbiddenConfig(){
       super();
       this.mDisableMerchantForbiddenWhenPk = false;
       this.mDisableMerchantForbiddenWhenChat = false;
       this.mDisableNewVersionMirror = false;
    }
}
