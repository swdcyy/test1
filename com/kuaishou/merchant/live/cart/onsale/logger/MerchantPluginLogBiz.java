package com.kuaishou.merchant.live.cart.onsale.logger.MerchantPluginLogBiz;
import p74.a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MerchantPluginLogBiz extends Enum implements a	// class@0019ab
{
    public final String mBiz;
    public static final MerchantPluginLogBiz[] $VALUES;
    public static final MerchantPluginLogBiz PLUGIN_TRANSACTION;

    static {
       MerchantPluginLogBiz merchantPlug = new MerchantPluginLogBiz("PLUGIN_TRANSACTION", 0, "PluginTransaction");
       MerchantPluginLogBiz.PLUGIN_TRANSACTION = merchantPlug;
       MerchantPluginLogBiz[] merchantPlug1 = new MerchantPluginLogBiz[]{merchantPlug};
       MerchantPluginLogBiz.$VALUES = merchantPlug1;
    }
    public void MerchantPluginLogBiz(String p0,int p1,String p2){
       super(p0, p1);
       this.mBiz = p2;
    }
    public static MerchantPluginLogBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MerchantPluginLogBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MerchantPluginLogBiz.class, p0);
    }
    public static MerchantPluginLogBiz[] values(){
       Object obj = PatchProxy.apply(null, null, MerchantPluginLogBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MerchantPluginLogBiz.$VALUES.clone();
    }
    public String getBiz(){
       return this.mBiz;
    }
}
