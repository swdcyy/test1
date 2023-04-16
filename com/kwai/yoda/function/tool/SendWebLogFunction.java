package com.kwai.yoda.function.tool.SendWebLogFunction;
import ay7.a;
import com.kwai.yoda.function.tool.SendWebLogFunction$a;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import yz7.r;
import com.kwai.yoda.function.tool.SendWebLogFunction$SendPerformanceLogParams;
import yz7.e;
import java.util.List;
import java.lang.Integer;
import java.util.Collection;
import nz7.e;
import com.kwai.yoda.session.logger.batch.HybridBatchDataItem;
import com.kwai.yoda.bridge.YodaException;

public final class SendWebLogFunction extends a	// class@00122e
{
    public static final SendWebLogFunction$a d;

    static {
       SendWebLogFunction.d = new SendWebLogFunction$a(null);
    }
    public void SendWebLogFunction(){
       super();
    }
    public String c(){
       return "sendWebLog";
    }
    public String d(){
       return "tool";
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       SendWebLogFunction$SendPerformanceLogParams sendPerforma;
       Integer integer;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, SendWebLogFunction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          throw new YodaException(0x1e850, "client status error: webview is null.");
       }
       obj = 0;
       StringBuilder str = (p1 == null || !p1.length())? 1: null;
       if (!str) {
          String str1 = "SendWebLogFunction";
          r.h(str1, "SendWebLogFunction, params:"+p1);
          try{
             str = 0;
             sendPerforma = e.a(p1, SendWebLogFunction$SendPerformanceLogParams.class);
          }catch(java.lang.Exception e0){
             sendPerforma = str;
          }
          if (sendPerforma != null) {
             StringBuilder str2 = "SendWebLogFunction, size:";
             SendWebLogFunction$SendPerformanceLogParams dataList = sendPerforma.dataList;
             if (dataList != null) {
                integer = Integer.valueOf(dataList.size());
             }
             r.h(str1, str2+integer);
             SendWebLogFunction$SendPerformanceLogParams dataList1 = sendPerforma.dataList;
             if (dataList1 == null || dataList1.isEmpty()) {
                obj = 1;
             }
             if (!obj) {
                e.a(p0.getSessionLogger(), sendPerforma.dataList, null, "H5", false, 10, null);
                FunctionResultParams uFunctionRes = new FunctionResultParams();
                uFunctionRes.mResult = 1;
                return uFunctionRes;
             }else {
                throw new YodaException(0x1e84f, "The Input is invalid: root params should be object.");
             }
          }else {
             throw new YodaException(0x1e84f, "The Input is invalid: root params should be object.");
          }
       }else {
          throw new YodaException(0x1e84f, "The Input is invalid: root params should be object.");
       }
    }
}
