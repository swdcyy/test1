package com.kuaishou.merchant.PreloadContextImpl$mLogger$2$a;
import qa4.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;

public final class PreloadContextImpl$mLogger$2$a implements a	// class@0014c5
{

    public void PreloadContextImpl$mLogger$2$a(){
       super();
    }
    public void e(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PreloadContextImpl$mLogger$2$a.class, "1")) {
          return;
       }
       a.l(MerchantCommonLogBiz.PRELOADER, p0, p1, p2);
       return;
    }
    public void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PreloadContextImpl$mLogger$2$a.class, "2")) {
          return;
       }
       a.s(MerchantCommonLogBiz.PRELOADER, p0, p1);
       return;
    }
}
