package com.yxcorp.gifshow.camerasdk.YtechBizLogger$YtechBiz;
import oa9.b;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class YtechBizLogger$YtechBiz extends Enum implements b	// class@001003
{
    public final String mBiz;
    public static final YtechBizLogger$YtechBiz[] $VALUES;
    public static final YtechBizLogger$YtechBiz COMMON;
    public static final YtechBizLogger$YtechBiz YTECH;

    static {
       YtechBizLogger$YtechBiz ytechBiz;
       YtechBizLogger$YtechBiz[] ytechBizArra = new YtechBizLogger$YtechBiz[]{ytechBiz,ytechBiz};
       ytechBiz = new YtechBizLogger$YtechBiz("YTECH", 0, "ytech");
       YtechBizLogger$YtechBiz.YTECH = ytechBiz;
       ytechBiz = new YtechBizLogger$YtechBiz("COMMON", 1, "common");
       YtechBizLogger$YtechBiz.COMMON = ytechBiz;
       YtechBizLogger$YtechBiz.$VALUES = ytechBizArra;
    }
    public void YtechBizLogger$YtechBiz(String p0,int p1,String p2){
       super(p0, p1);
       this.mBiz = p2;
    }
    public static YtechBizLogger$YtechBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, YtechBizLogger$YtechBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(YtechBizLogger$YtechBiz.class, p0);
    }
    public static YtechBizLogger$YtechBiz[] values(){
       Object obj = PatchProxy.apply(null, null, YtechBizLogger$YtechBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return YtechBizLogger$YtechBiz.$VALUES.clone();
    }
    public String getBiz(){
       return this.mBiz;
    }
}
