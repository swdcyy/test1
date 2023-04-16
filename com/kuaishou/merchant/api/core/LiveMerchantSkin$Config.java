package com.kuaishou.merchant.api.core.LiveMerchantSkin$Config;
import java.io.Serializable;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import qkd.b;
import com.google.gson.Gson;
import java.lang.Throwable;
import com.yxcorp.utility.Log;

public class LiveMerchantSkin$Config implements Serializable	// class@001505
{
    public String[] mActionBackgroundColors;
    public String mActionTextColor;
    public String mActivityColor;
    public int mPageBackgroundTopMargin;
    public String mPageTitleColor;
    public static final long serialVersionUID = 0x8227a7d116195247;

    public void LiveMerchantSkin$Config(){
       super();
    }
    public static LiveMerchantSkin$Config parse(File p0){
       LiveMerchantSkin$Config obj = PatchProxy.applyOneRefs(p0, null, LiveMerchantSkin$Config.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveMerchantSkin$Config();
       if (p0.exists()) {
          try{
             obj = a.a.h(b.f0(p0), LiveMerchantSkin$Config.class);
          }catch(java.lang.Exception e3){
             Log.e("LiveMerchantSkin", "Config parse fail", e3);
          }
       }
    }
}
