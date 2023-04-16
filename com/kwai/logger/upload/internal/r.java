package com.kwai.logger.upload.internal.r;
import java.lang.Runnable;
import java.lang.String;
import t87.c;
import java.lang.Object;
import v87.d;
import com.kwai.logger.upload.internal.s;
import v87.a$a;
import v87.a;
import u87.x;
import com.kwai.logger.upload.internal.c;
import java.util.concurrent.atomic.AtomicBoolean;
import t87.d;
import w87.j;
import com.kwai.logger.upload.model.UploadError$Error;
import u87.f;
import a97.h;
import com.kwai.logger.upload.internal.k;
import com.kwai.logger.upload.model.LogStartResponse;
import u87.r;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.util.Base64;
import com.middleware.security.MXSec;
import t38.a;
import com.middleware.security.wrapper.IKSecurityBase;
import com.google.gson.Gson;
import com.kwai.logger.upload.model.StartExtra;
import java.lang.Class;
import java.lang.StringBuilder;
import java.util.List;
import java.lang.Long;
import java.io.File;
import u87.d;
import java.lang.Throwable;
import android.util.Log;
import t87.f;
import android.content.Context;
import a97.c;
import java.lang.System;
import java.util.ArrayList;
import java.util.Iterator;
import t87.a;
import android.os.Environment;
import u87.c;
import u87.b;

public final class r implements Runnable	// class@000edd
{
    public final String b;
    public final String c;
    public final String d;
    public final c e;

    public void r(String p0,String p1,String p2,c p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       StartExtra startExtra;
       String str2;
       a d;
       r or = this;
       a$a uoa = new a$a();
       uoa.d(s.a(or.b, or.c));
       uoa.b(or.d);
       a uoa1 = uoa.a();
       x ox = new x(or.e);
       boolean b = false;
       int b1 = true;
       if (!c.a.compareAndSet(b, b1)) {
          d.a("ObiwanUploader", "LogFileUploader:last task is not finished");
          j.a().h(uoa1.d().a);
          UploadError$Error lAST_TASK_IN = UploadError$Error.LAST_TASK_IN_PROCESS;
          b1 = lAST_TASK_IN.getErrCode();
          j.a().o(uoa1.d().a, b1, lAST_TASK_IN.getErrMsg());
          h.a(new f(ox));
       }else {
          k.c(uoa1, "START");
          c.b = ox;
          LogStartResponse logStartResp = r.a(uoa1);
          c.c = logStartResp;
          if (logStartResp == null || logStartResp.allow == null) {
             UploadError$Error cHECK_BEGIN_ = UploadError$Error.CHECK_BEGIN_FAILED;
             int errCode = cHECK_BEGIN_.getErrCode();
             c.e(errCode, cHECK_BEGIN_.getErrMsg(), uoa1);
          }else {
             logStartResp = logStartResp.extra;
             File uFile = null;
             if (TextUtils.isEmpty(logStartResp)) {
                startExtra = uFile;
             }else {
                byte[] uobyteArray = Base64.decode(logStartResp, b);
                a mXWrapper = MXSec.get().getMXWrapper();
                int i1 = 3;
                mXWrapper.g(i1);
                String str4 = "Obiwan";
                String str5 = "bbd910da-fda5-49e7-8667-f57200dac474";
                if (!TextUtils.isEmpty(str4) && (TextUtils.isEmpty(str5) || uobyteArray == null)) {
                   mXWrapper.f(i1, i1);
                }
                uobyteArray = (mXWrapper.e(i1))? mXWrapper.d().atlasDecrypt(str4, str5, b, uobyteArray): new byte[b];
                startExtra = new Gson().h(new String(uobyteArray), StartExtra.class);
             }
             c.d = startExtra;
             d.a("ObiwanUploader", "Uploader:当前任务类型:"+c.d());
             int i = c.d();
             if (i) {
                long l = 0;
                String str = "_";
                if (i != b1) {
                   long l1 = 2;
                   if (i == l1) {
                      if (c.d.dateRangeList.size() == l1) {
                         try{
                            l1 = c.d.dateRangeList.get(b).longValue();
                            long l2 = c.d.dateRangeList.get(b1).longValue();
                            if (l1 - l2 <= 0) {
                               uFile = d.c(l1, l2);
                            }
                         }catch(java.lang.NullPointerException e0){
                            d.b("ObiwanUploader", "Exception:"+Log.getStackTraceString(e0));
                         }
                      }
                   }
                }else {
                   ArrayList uArrayList = new ArrayList();
                   Iterator iterator = c.d.pathList.iterator();
                   while (iterator.hasNext()) {
                      String str1 = iterator.next();
                      if (!str1.startsWith("/sdcard/Android/data/"+f.d.getPackageName()) && !str1.startsWith("/data/data")) {
                         d = f.c.d;
                         if (d != null) {
                            Iterator iterator2 = d.iterator();
                            while (true) {
                               if (iterator2.hasNext()) {
                                  String str3 = iterator2.next();
                                  if (str1.startsWith(str3)) {
                                     d.a("ObiwanUploader", str1+" | "+str3);
                                  }
                               }
                            }
                            if (!str2) {
                               d.b("ObiwanUploader", "invalid upload path: "+str1);
                            }else {
                               str2 = "/sdcard";
                               if (str1.startsWith(str2)) {
                                  str1 = str1.replaceFirst(str2, Environment.getExternalStorageDirectory().getAbsolutePath());
                               }
                               d.a("ObiwanUploader", "after format path: "+str1);
                               if (!str1.endsWith(f.d.getPackageName())) {
                                  Iterator iterator1 = f.b.iterator();
                                  while (true) {
                                     if (iterator1.hasNext()) {
                                        if (iterator1.next().a(str1)) {
                                           continue ;
                                        }
                                     }else {
                                        str2 = 1;
                                        break ;
                                     }
                                  }
                                  if (!str2) {
                                     d.b("ObiwanUploader", "is not match filter rules");
                                  }else {
                                     File uFile1 = new File(str1);
                                     if (uFile1.length() - l && uFile1.exists()) {
                                        uArrayList.add(uFile1);
                                     }
                                  }
                               }
                               str2 = null;
                               goto label_0263 ;
                            }
                            str2 = 1;
                         }
                         str2 = null;
                         goto label_01fa ;
                      }
                      str2 = 1;
                      goto label_01fa ;
                   }
                   if (!uArrayList.isEmpty()) {
                      File[] uFileArray = new File[b];
                      uFile = d.a(f.d, uArrayList.toArray(uFileArray), -1, uFile);
                   }
                   c.b(uFile, new File(c.d(f.d), System.currentTimeMillis()+str+"custom.zip"), uoa1, 0xc800000);
                }
             }else {
                c.c(uoa1);
             }
          }
       }
       return;
    }
}
