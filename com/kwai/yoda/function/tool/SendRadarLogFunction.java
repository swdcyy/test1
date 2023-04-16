package com.kwai.yoda.function.tool.SendRadarLogFunction;
import ay7.a;
import com.kwai.yoda.function.tool.SendRadarLogFunction$a;
import nsd.u;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.kwai.yoda.function.tool.SendRadarLogFunction$SendPageLogParams;
import yz7.e;
import nz7.e;
import java.util.List;
import com.kwai.yoda.session.logger.batch.HybridBatchDataItem;
import com.kwai.yoda.function.tool.SendRadarLogFunction$SendPageLogResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.yoda.session.logger.batch.HybridBatchDataWebItem;
import com.kwai.yoda.session.logger.HybridDataItem;
import kotlin.jvm.internal.a;
import java.util.Collection;
import sz7.l;
import com.kwai.yoda.bridge.YodaException;

public final class SendRadarLogFunction extends a	// class@00122b
{
    public static final SendRadarLogFunction$a d;

    static {
       SendRadarLogFunction.d = new SendRadarLogFunction$a(null);
    }
    public void SendRadarLogFunction(){
       super();
    }
    public String c(){
       return "sendRadarLog";
    }
    public String d(){
       return "tool";
    }
    public boolean g(){
       return true;
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       SendRadarLogFunction$SendPageLogParams sendPageLogP1;
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, SendRadarLogFunction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          throw new YodaException(0x1e850, "client status error: webview is null.");
       }
       int i = 1;
       SendRadarLogFunction$SendPageLogParams sendPageLogP = (p1 == null || !p1.length())? 1: null;
       String str = "The Input is invalid: root params should be object.";
       int i1 = 0x1e84f;
       if (!sendPageLogP) {
          try{
             sendPageLogP1 = e.a(p1, SendRadarLogFunction$SendPageLogParams.class);
          }catch(java.lang.Exception e0){
             sendPageLogP1 = null;
          }
          if (sendPageLogP1 != null) {
             SendRadarLogFunction$SendPageLogParams dataList = sendPageLogP1.dataList;
             if (dataList != null) {
                e.a(p0.getSessionLogger(), dataList, null, "H5", false, 2, null);
             }
             SendRadarLogFunction$SendPageLogResult sendPageLogR = new SendRadarLogFunction$SendPageLogResult();
             sendPageLogR.mResult = e0;
             sendPageLogP1 = sendPageLogP1.dataList;
             if (sendPageLogP1 != null) {
                obj = new ArrayList();
                Iterator iterator = sendPageLogP1.iterator();
                while (iterator.hasNext()) {
                   Object obj1 = iterator.next();
                   if (a.g(obj1.getKey(), "error")) {
                      obj.add(obj1);
                   }
                }
                iterator = obj.iterator();
                while (iterator.hasNext()) {
                   HybridBatchDataWebItem hybridBatchD = iterator.next();
                   if (hybridBatchD != null) {
                      Object dimension = hybridBatchD.getDimension();
                      if (dimension != null) {
                         p0.getSessionLogger().k().b().add(dimension);
                      }
                   }
                }
             }
             return sendPageLogR;
          }else {
             throw new YodaException(i1, str);
          }
       }else {
          throw new YodaException(i1, str);
       }
    }
}
