package com.tencent.open.b.h$6;
import java.lang.Runnable;
import com.tencent.open.b.h;
import java.lang.String;
import java.util.Map;
import java.lang.Object;
import com.tencent.open.b.f;
import java.lang.StringBuilder;
import com.tencent.open.log.SLog;
import com.tencent.open.a.a;
import com.tencent.open.a.b;
import java.lang.Throwable;

public class h$6 implements Runnable	// class@000f50
{
    public final String a;
    public final Map b;
    public final h c;

    public void h$6(h p0,String p1,Map p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void run(){
       int i = 0;
       try{
          int i1 = f.a();
          if (!i1) {
             i1 = 3;
          }
          SLog.d("openSDK_LOG.ReportManager", "-->httpRequest, retryCount: "+i1);
       label_001e :
          i = i + 1;
          try{
             SLog.i("openSDK_LOG.ReportManager", "-->httpRequest, statusCode: "+a.a().a(this.a, this.b).d());
          }catch(java.net.SocketTimeoutException e3){
             SLog.e("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest SocketTimeoutException:", e3);
             if (i >= i1) {
             }else {
                goto label_001e ;
             }
          }catch(java.lang.Exception e1){
             try{
                SLog.e("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest Exception:", e1);
             }catch(java.lang.Exception e1){
                SLog.e("openSDK_LOG.ReportManager", "-->httpRequest, exception in serial executor:", e1);
             }
          }
          return;
       }catch(java.lang.Exception e1){
       }
    }
}
