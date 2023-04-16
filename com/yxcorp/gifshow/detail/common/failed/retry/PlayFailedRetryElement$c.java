package com.yxcorp.gifshow.detail.common.failed.retry.PlayFailedRetryElement$c;
import qp7.b1;
import com.yxcorp.gifshow.detail.common.failed.retry.PlayFailedRetryElement;
import java.lang.Object;
import qp7.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Runnable;
import ekd.k1;
import wkd.b;
import com.yxcorp.gifshow.detail.util.retrylog.a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Objects;
import java.util.HashMap;
import com.yxcorp.gifshow.detail.util.retrylog.PlayFailedRetryLog;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.ArrayList;
import com.yxcorp.gifshow.detail.util.retrylog.PlayFailedRetryLog$PlayError;
import com.yxcorp.gifshow.detail.util.retrylog.PlayFailedRetryLog$Retry;
import java.lang.System;
import uw9.o;
import java.lang.StringBuilder;
import fg6.a;
import com.google.gson.Gson;
import q87.c;
import k2b.u1;
import p5a.e;
import de5.a;
import p5a.c;
import java.util.BitSet;

public class PlayFailedRetryElement$c implements b1	// class@001405
{
    public final PlayFailedRetryElement a;

    public void PlayFailedRetryElement$c(PlayFailedRetryElement p0){
       this.a = p0;
       super();
    }
    public void a(){
       a1.a(this);
    }
    public void b(){
       a1.g(this);
    }
    public void c(boolean p0){
    }
    public void d(boolean p0){
    }
    public void e(boolean p0){
       Iterator iterator;
       int i1;
       long l;
       int i2;
       int i3;
       int i4;
       int i5;
       int i6;
       int i8;
       Gson a;
       String obj = this;
       PlayFailedRetryElement$c uoc = PlayFailedRetryElement$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), obj, uoc, "2")) {
          return;
       }
       obj.a.s0();
       uoc = obj.a;
       boolean b = false;
       uoc.F = b;
       uoc.L = b;
       if (uoc.E != null) {
          uoc.q0();
       }
       k1.m(obj.a.O);
       a uoa = b.a(0x5091ceb9);
       String photoId = obj.a.C.getPhotoId();
       String userName = obj.a.C.getUserName();
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoidTwoRefs(photoId, userName, uoa, a.class, "8") && a.b) {
          PlayFailedRetryLog playFailedRe = uoa.a.get(photoId);
          if (playFailedRe != null) {
             PlayFailedRetryLog playErrors = playFailedRe.playErrors;
             int i = 0;
             if (!q.f(playErrors)) {
                iterator = playErrors.iterator();
                while (iterator.hasNext()) {
                   PlayFailedRetryLog$PlayError playError = iterator.next();
                   PlayFailedRetryLog$PlayError retrys = playError.retrys;
                   if (!q.f(retrys)) {
                      i1 = retrys.size() - 1;
                      if (!retrys.get(i1).endRetryTime - i) {
                         l = System.currentTimeMillis() - playError.showTime;
                         playError.totalTime = l;
                      }else {
                         i1 = retrys.size() - 1;
                         l = retrys.get(i1).endRetryTime - playError.showTime;
                         playError.totalTime = l;
                      }
                      playError.totalRetryCnt = retrys.size();
                      i1 = retrys.size() - 1;
                      playError.finalSuccess = retrys.get(i1).isSuccess;
                   }else {
                      long l1 = System.currentTimeMillis() - playError.showTime;
                      playError.totalTime = l1;
                      playError.totalRetryCnt = b;
                      playError.finalSuccess = b;
                   }
                }
             }
             playErrors = playFailedRe.playErrors;
             if (!q.f(playErrors)) {
                i2 = playErrors.size();
                if (playErrors.get((playErrors.size() - 1)).finalSuccess == null) {
                   i = playErrors.get((playErrors.size() - 1)).totalTime;
                }
                iterator = playErrors.iterator();
                i3 = 0;
                i1 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                int i7 = 0;
                while (iterator.hasNext()) {
                   PlayFailedRetryLog$PlayError retrys1 = iterator.next().retrys;
                   if (!q.f(retrys1)) {
                      i3 = i3 + retrys1.size();
                      Iterator iterator1 = retrys1.iterator();
                      while (iterator1.hasNext()) {
                         obj = iterator1.next();
                         Iterator iterator2 = iterator1;
                         PlayFailedRetryLog$Retry isManual = obj.isManual;
                         if (isManual != null) {
                            i4 = i4 + 1;
                         }else {
                            i1 = i1 + 1;
                         }
                         if (obj.isSuccess != null) {
                            i5 = i5 + 1;
                            if (isManual != null) {
                               i7 = i7 + 1;
                            }else {
                               i6 = i6 + 1;
                            }
                         }
                         iterator1 = iterator2;
                      }
                   }
                   Object obj1 = null;
                }
                i8 = i7;
             }else {
                i8 = 0;
                i2 = 0;
                i3 = 0;
                i1 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
             }
             playFailedRe.playErrorCnt = i2;
             playFailedRe.retryCnt = i3;
             playFailedRe.autoRetryCnt = i1;
             playFailedRe.manualRetryCnt = i4;
             playFailedRe.retryFailStayTime = i;
             playFailedRe.successCnt = i5;
             playFailedRe.autoRetrySuccessCnt = i6;
             playFailedRe.manualRetrySuccessCnt = i8;
             a = a.a;
             Object[] objArray = new Object[0];
             o.C().w("PlayFailedRetryLogHelper", userName+"::"+a.q(playFailedRe), objArray);
             obj = a.q(playFailedRe);
             u1.R("VIDEO_PLAY_FAILED_RETRY_LOG", obj, 14);
             if (!PatchProxy.applyVoidOneRefs(photoId, uoa, a.class, "7")) {
                uoa.a.remove(photoId);
             }
          }
       }
       return;
    }
    public void f(boolean p0){
       PlayFailedRetryElement$c uoc = PlayFailedRetryElement$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "1")) {
          return;
       }
       PlayFailedRetryElement$c ta = this.a;
       ta.F = true;
       if (ta.y.getPlayer().i() == 2) {
          this.a.r0("become attach,do retry");
          this.a.I.set(4);
          ta = this.a;
          ta.L = false;
          ta.p0(0);
       }
       return;
    }
    public void g(){
       a1.e(this);
    }
    public void h(){
       a1.c(this);
    }
}
