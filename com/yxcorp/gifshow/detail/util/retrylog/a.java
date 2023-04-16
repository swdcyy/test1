package com.yxcorp.gifshow.detail.util.retrylog.a;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import com.yxcorp.gifshow.detail.util.retrylog.PlayFailedRetryLog$Retry;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.yxcorp.gifshow.detail.util.retrylog.PlayFailedRetryLog;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.ArrayList;
import com.yxcorp.gifshow.detail.util.retrylog.PlayFailedRetryLog$PlayError;
import java.lang.Math;
import java.lang.System;

public class a	// class@001a37
{
    public final HashMap a;
    public static final boolean b;

    static {
       a.b = a.t().d("enableVideoPlayFailedRetryLog", true);
    }
    public void a(){
       super();
       this.a = new HashMap();
    }
    public void a(String p0,long p1,PlayFailedRetryLog$Retry p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), p2, this, a.class, "6")) {
          return;
       }
       if (!a.b) {
          return;
       }
       if (this.a.containsKey(p0)) {
          PlayFailedRetryLog playFailedRe = this.a.get(p0);
          if (playFailedRe != null) {
             playFailedRe = playFailedRe.playErrors;
             if (!q.f(playFailedRe)) {
                Iterator iterator = playFailedRe.iterator();
                while (iterator.hasNext()) {
                   PlayFailedRetryLog$PlayError playError = iterator.next();
                   if (playError != null) {
                      long l = playError.positionId - p1;
                      if (Math.abs(l) - 1000 <= 0) {
                         if (!q.f(playError.retrys)) {
                            PlayFailedRetryLog$PlayError retrys = playError.retrys;
                            PlayFailedRetryLog$Retry retry = retrys.get((retrys.size() - 1));
                            retry.isSuccess = p2.isSuccess;
                            retry.retryFailHodorErrorCode = p2.retryFailHodorErrorCode;
                            retry.retryFailPlayerErrorCode = p2.retryFailPlayerErrorCode;
                            p1 = System.currentTimeMillis();
                            retry.endRetryTime = p1;
                            retry.retryTime = p1 - retry.startRetryTime;
                            break ;
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
