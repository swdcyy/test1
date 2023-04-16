package com.yxcorp.gifshow.log.utils.FeedLogCtxLenConfigManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.log.model.FeedLogCtxLenConfig;
import k2b.x1;
import com.yxcorp.gifshow.log.n;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public class FeedLogCtxLenConfigManager	// class@001b51
{
    public static final String TAG = "FeedLogCtxLenConfigManager";
    public static FeedLogCtxLenConfig sFeedLogCtxLenConfig;

    public void FeedLogCtxLenConfigManager(){
       super();
    }
    public static int getClientParamsKeyMaxLen(){
       Object obj = PatchProxy.apply(null, null, FeedLogCtxLenConfigManager.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return FeedLogCtxLenConfigManager.getFeedLogCtxLenConfig().clientParamsKeyMaxLen;
    }
    public static int getClientParamsMaxCount(){
       Object obj = PatchProxy.apply(null, null, FeedLogCtxLenConfigManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return FeedLogCtxLenConfigManager.getFeedLogCtxLenConfig().clientParamsMaxCount;
    }
    public static int getClientParamsValueMaxLen(){
       Object obj = PatchProxy.apply(null, null, FeedLogCtxLenConfigManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return FeedLogCtxLenConfigManager.getFeedLogCtxLenConfig().clientParamsValueMaxLen;
    }
    public static FeedLogCtxLenConfig getFeedLogCtxLenConfig(){
       FeedLogCtxLenConfig obj = PatchProxy.apply(null, null, FeedLogCtxLenConfigManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (FeedLogCtxLenConfigManager.sFeedLogCtxLenConfig == null) {
          obj = n.A1().a();
          FeedLogCtxLenConfigManager.sFeedLogCtxLenConfig = obj;
          if (obj != null) {
             Log.g("FeedLogCtxLenConfigManager", "lon config = "+FeedLogCtxLenConfigManager.sFeedLogCtxLenConfig);
          }
       }
       if (FeedLogCtxLenConfigManager.sFeedLogCtxLenConfig == null) {
          FeedLogCtxLenConfigManager.sFeedLogCtxLenConfig = new FeedLogCtxLenConfig();
       }
       return FeedLogCtxLenConfigManager.sFeedLogCtxLenConfig;
    }
    public static int getFeedLogCtxMaxLength(){
       Object obj = PatchProxy.apply(null, null, FeedLogCtxLenConfigManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return FeedLogCtxLenConfigManager.getFeedLogCtxLenConfig().feedLogCtxMaxLen;
    }
    public static int getStidIdMaxLen(){
       Object obj = PatchProxy.apply(null, null, FeedLogCtxLenConfigManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return FeedLogCtxLenConfigManager.getFeedLogCtxLenConfig().stidIdMaxLen;
    }
}
