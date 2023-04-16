package com.kwai.framework.network.degrade.h$b;
import com.kwai.framework.network.degrade.e$b;
import java.lang.Object;
import com.kwai.framework.network.degrade.h$a;
import com.yxcorp.gifshow.retrofit.degrade.DegradeConfig$UrlDegrade;
import okhttp3.Request;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.RequestBody;
import okhttp3.FormBody;

public final class h$b implements e$b	// class@0017c2
{

    public void h$b(){
       super();
    }
    public void h$b(h$a p0){
       super();
    }
    public String a(DegradeConfig$UrlDegrade p0,Request p1,String p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, h$b.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       if (!p1.body() instanceof FormBody) {
          return null;
       }
       FormBody uFormBody = p1.body();
       int i = uFormBody.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return null;
          }
          if (p2.equals(uFormBody.name(i1))) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return uFormBody.value(i1);
    }
}
