package g6.b;
import g6.a;
import java.lang.Object;
import e6.c;
import e6.b;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import java.util.HashMap;
import java.util.Map;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import b7.a;
import e6.a;
import java.lang.String;
import x6.a;
import java.lang.StringBuilder;

public class b implements a	// class@00204a
{
    public static a a;
    public static a b;

    public void b(){
       super();
    }
    public b a(c p0){
       DataReportRequest uDataReportR = new DataReportRequest();
       b uob = null;
       String str = "dynamicKey";
       String str1 = "apdidToken";
       if (p0 == null) {
          uDataReportR = uob;
       }else {
          uDataReportR.os = p0.a;
          uDataReportR.rpcVersion = p0.j;
          uDataReportR.bizType = "1";
          HashMap hashMap = new HashMap();
          uDataReportR.bizData = hashMap;
          hashMap.put("apdid", p0.b);
          uDataReportR.bizData.put(str1, p0.c);
          uDataReportR.bizData.put("umidToken", p0.d);
          uDataReportR.bizData.put(str, p0.e);
          uDataReportR.deviceData = p0.f;
       }
       DataReportResult uDataReportR1 = b.b.a(uDataReportR);
       b uob1 = new b();
       if (uDataReportR1 != null) {
          uob1.a = uDataReportR1.success;
          uob1.b = uDataReportR1.resultCode;
          uDataReportR1 = uDataReportR1.resultData;
          if (uDataReportR1 != null) {
             uob1.c = uDataReportR1.get("apdid");
             uob1.d = uDataReportR1.get(str1);
             uob1.g = uDataReportR1.get(str);
             uob1.h = uDataReportR1.get("timeInterval");
             uob1.i = uDataReportR1.get("webrtcUrl");
             uob1.j = "";
             String str2 = uDataReportR1.get("drmSwitch");
             if (a.e(str2)) {
                if (str2.length() > 0) {
                   uob1.e = str2.charAt(0);
                }
                if (str2.length() >= 3) {
                   uob1.f = str2.charAt(2);
                }
             }
             str2 = "apse_degrade";
             if (uDataReportR1.containsKey(str2)) {
                uob1.k = uDataReportR1.get(str2);
             }
          }
          uob = uob1;
       }
       return uob;
    }
    public boolean logCollect(String p0){
       return b.b.logCollect(p0);
    }
}
