package com.tencent.open.b.h$4;
import java.lang.Runnable;
import com.tencent.open.b.h;
import java.lang.Object;
import java.util.Map;
import android.content.Context;
import com.tencent.open.utils.f;
import java.lang.String;
import com.tencent.open.utils.g;
import java.lang.StringBuilder;
import com.tencent.open.log.SLog;
import com.tencent.open.a.a;
import com.tencent.open.a.b;
import com.tencent.open.b.g;
import java.lang.Throwable;
import java.util.List;

public class h$4 implements Runnable	// class@000f4e
{
    public final h a;

    public void h$4(h p0){
       this.a = p0;
       super();
    }
    public void run(){
       String str = "report_cgi";
       String str1 = "openSDK_LOG.ReportManager";
       try{
          Map map = this.a.c();
          if (map == null || map.isEmpty()) {
             return;
          }
          int i = g.a(f.a(), null).a("Common_HttpRetryCount");
          if (!i) {
             i = 3;
          }
          SLog.d(str1, "-->doReportCgi, retryCount: "+i);
          int i1 = 0;
          int i2 = 0;
       label_003e :
          i2 = i2 + 1;
          try{
             int i3 = a.a().b("https://wspeed.qq.com/w.cgi", map).d();
             SLog.i(str1, "-->doReportCgi, statusCode: "+i3);
             if (i3 == 200) {
                g.a().b(str);
                i1 = 1;
             }
          }catch(java.net.SocketTimeoutException e7){
             SLog.e(str1, "-->doReportCgi, doupload exception", e7);
             if (i2 < i) {
             }
          }catch(java.lang.Exception e3){
             SLog.e(str1, "-->doReportCgi, doupload exception", e3);
          }catch(java.lang.Exception e0){
             SLog.e(str1, "-->doReportCgi, doupload exception out.", e0);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
