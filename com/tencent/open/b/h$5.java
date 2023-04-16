package com.tencent.open.b.h$5;
import java.lang.Runnable;
import com.tencent.open.b.h;
import java.lang.Object;
import java.util.Map;
import java.lang.StringBuilder;
import java.lang.String;
import com.tencent.open.log.SLog;
import com.tencent.open.b.f;
import android.os.SystemClock;
import com.tencent.open.a.a;
import com.tencent.open.a.b;
import org.json.JSONObject;
import com.tencent.open.utils.k;
import java.io.IOException;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.b.g;
import java.util.List;
import java.lang.Throwable;

public class h$5 implements Runnable	// class@000f4f
{
    public final h a;

    public void h$5(h p0){
       this.a = p0;
       super();
    }
    public void run(){
       boolean i4;
       int i5;
       int i6;
       int i7;
       long l2;
       long l3;
       long l4;
       h$5 u5 = this;
       String str = "openSDK_LOG.ReportManager";
       try{
          Map map = u5.a.d();
          if (map == null) {
             return;
          }
          SLog.d(str, "-->doReportVia, params: "+map.toString());
          int i = f.a();
          long l = SystemClock.elapsedRealtime();
          int i1 = 0;
          int i2 = 0;
          while (true) {
             int i3 = i1 + 1;
             try{
                b uob = a.a().b("https://appsupport.qq.com/cgi-bin/appstage/mstats_batch_report", map);
                SLog.i(str, "-->reportVia: statusCode "+uob.d());
                JSONObject jSONObject = k.d(uob.a());
                long l1 = (long)uob.c();
                i4 = uob.b();
                i5 = i3;
                try{
                   long l5 = (long)i4;
                   if (uob.d() != 200) {
                      i2 = uob.d();
                      l2 = l;
                      l3 = l5;
                      l4 = l1;
                   label_00c5 :
                      i4 = false;
                      break ;
                   }else {
                      try{
                         i1 = jSONObject.getInt("ret");
                      }catch(org.json.JSONException e0){
                         i1 = -4;
                      }catch(java.io.IOException e0){
                      }catch(java.lang.Exception e0){
                         i6 = 0;
                         i2 = -6;
                         i1 = i;
                         i7 = i6;
                      }
                   }
                }catch(java.net.SocketTimeoutException e0){
                   i6 = 0;
                   l = SystemClock.elapsedRealtime();
                   i2 = -8;
                }catch(org.json.JSONException e0){
                   i6 = 0;
                   i7 = i6;
                   i1 = i5;
                   i2 = -4;
                }catch(java.io.IOException e0){
                }
                i6 = 0;
                i2 = HttpUtils.getErrorCodeFromException(e0);
             }catch(java.net.SocketTimeoutException e0){
                i5 = i3;
                goto label_00b3 ;
             }catch(org.json.JSONException e0){
                i5 = i3;
                goto label_00aa ;
             }catch(java.io.IOException e0){
                i5 = i3;
                goto label_00a1 ;
             }catch(java.lang.Exception e0){
             }catch(java.lang.Exception e0){
                SLog.e(str, "-->doReportVia, exception in serial executor.", e0);
             }
             return;
          }
          u5.a.a("mapp_apptrace_sdk", l2, l4, l3, i2, null, false);
          String str1 = "report_via";
          if (i4) {
             g.a().b(str1);
          }else {
             g.a().a(str1, u5.a.d);
          }
          u5.a.d.clear();
          SLog.i(str, "-->doReportVia, uploadSuccess: "+i4+" resultCode: "+i2);
          goto label_0116 ;
       }catch(java.lang.Exception e0){
       }
    }
}
