package com.frog.engine.network.download.FrogDownloadClient$a;
import okhttp3.Callback;
import com.frog.engine.network.download.FrogDownloadCallBack;
import java.lang.String;
import com.frog.engine.network.download.FrogDownloadTask;
import java.lang.Object;
import okhttp3.Call;
import java.io.IOException;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.frog.engine.network.perflogger.KsFrogPerfReportManager;
import com.frog.engine.network.download.FrogDownloadClient;
import java.util.Map;
import okhttp3.Response;
import okhttp3.ResponseBody;
import java.lang.Exception;
import com.frog.engine.internal.FrogLog;
import java.lang.Boolean;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Closeable;
import java.lang.StringBuilder;

public final class FrogDownloadClient$a implements Callback	// class@00154a
{
    public final long a;
    public final FrogDownloadCallBack b;
    public final String c;
    public final long d;
    public final FrogDownloadTask e;

    public void FrogDownloadClient$a(long p0,FrogDownloadCallBack p1,String p2,long p3,FrogDownloadTask p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void onFailure(Call p0,IOException p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FrogDownloadClient$a.class, "1")) {
          return;
       }
       if (KsFrogPerfReportManager.instance().isHttpPerfEnable()) {
          KsFrogPerfReportManager.instance().reportHttpPerfEx(this.a, p1);
       }
       FrogDownloadClient$a tb = this.b;
       if (tb != null) {
          tb.onFail(p1.getMessage());
       }
       FrogDownloadClient.sNeedDownloadCall.remove(this.c);
       return;
    }
    public void onResponse(Call p0,Response p1){
       long l1;
       FrogDownloadClient$a b;
       FrogDownloadClient$a b1;
       Closeable uCloseable;
       Closeable uCloseable1;
       FileOutputStream uFileOutputS;
       long l3;
       Object obj = this;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, FrogDownloadClient$a.class, "2")) {
          return;
       }
       if (KsFrogPerfReportManager.instance().isHttpPerfEnable()) {
          KsFrogPerfReportManager.instance().reportLogObject(obj.a);
       }
       long l = 0;
       try{
          l1 = p1.body().contentLength();
          FrogDownloadClient$a d = obj.d;
          if (d - l > 0 && (d - l1) - l < 0) {
             b = obj.b;
             if (b != null) {
                b.onFail("not enough storage space");
             }
             return;
          }
       }catch(java.lang.Exception e0){
          FrogLog.e("FrogDownloadClient", e0);
       }
       Map sNeedDownloa = FrogDownloadClient.sNeedDownloadSeqNo;
       _monitor_enter(sNeedDownloa);
       if (Boolean.FALSE.equals(FrogDownloadClient.sNeedDownloadSeqNo.get(obj.c))) {
          p0.cancel();
          FrogDownloadClient.sNeedDownloadCall.remove(obj.c);
          b = obj.b;
          if (b != null) {
             b.onFail("cancel already");
          }
          _monitor_exit(sNeedDownloa);
          return;
       }else {
          _monitor_exit(sNeedDownloa);
          ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
          try{
             l1 = 0;
             if (p1.body() != null && p1.isSuccessful()) {
                byte[] uobyteArray = new byte[2048];
                InputStream inputStream = p1.body().byteStream();
                try{
                   long l2 = p1.body().contentLength();
                   if (!TextUtils.isEmpty(obj.e.getFilePath())) {
                      uFileOutputS = new FileOutputStream(new File(obj.e.getFilePath()));
                   }
                   ByteArrayOutputStream uByteArrayOu1 = new ByteArrayOutputStream();
                   try{
                      while (true) {
                         int i1 = inputStream.read(uobyteArray);
                         if (i1 != -1) {
                            int i2 = 0;
                            if (uFileOutputS != null) {
                               uFileOutputS.write(uobyteArray, i2, i1);
                            }
                            uByteArrayOu1.write(uobyteArray, i2, i1);
                            l = l + (long)i1;
                            float f = (float)l * 0x3f800000;
                            f = f / (float)l2;
                            f = f * 100.00f;
                            int i3 = (int)f;
                            sNeedDownloa = FrogDownloadClient.sNeedDownloadSeqNo;
                            _monitor_enter(sNeedDownloa);
                            if (Boolean.FALSE.equals(FrogDownloadClient.sNeedDownloadSeqNo.get(obj.c))) {
                               p0.cancel();
                               FrogDownloadClient.sNeedDownloadCall.remove(obj.c);
                               b = obj.b;
                               if (b != null) {
                                  b.onFail("cancel already");
                                  break ;
                               }
                               break ;
                            }else {
                               _monitor_exit(sNeedDownloa);
                               FrogDownloadClient$a b2 = obj.b;
                               if (b2 != null) {
                                  l3 = l2;
                                  b2.onProcessUpdate(i3, l, l2);
                               }else {
                                  l3 = l2;
                               }
                               l2 = l3;
                            }
                         }else if(uFileOutputS != null){
                            uFileOutputS.flush();
                         }
                         uByteArrayOu1.flush();
                         try{
                            String str = "FrogDownloadClient";
                            FrogLog.d(str, " downloadSuccess seqNo:"+obj.c);
                            uCloseable = uFileOutputS;
                            uCloseable1 = inputStream;
                            uByteArrayOu = uByteArrayOu1;
                         }catch(java.lang.Exception e0){
                            uByteArrayOu = uByteArrayOu1;
                         }
                      }
                      _monitor_exit(sNeedDownloa);
                      FrogDownloadClient.closeQuietly(inputStream);
                      FrogDownloadClient.closeQuietly(uFileOutputS);
                      FrogDownloadClient.closeQuietly(uByteArrayOu1);
                      return;
                   }catch(java.lang.Exception e0){
                   }
                }catch(java.lang.Exception e0){
                }
             }else {
                uCloseable = l1;
             }
             b = obj.b;
             if (b != null) {
                b.onResult(p1.code());
             }
             FrogDownloadClient.sNeedDownloadCall.remove(obj.c);
          }catch(java.lang.Exception e0){
             int i = l1;
          }
          FrogDownloadClient.closeQuietly(uCloseable1);
          FrogDownloadClient.closeQuietly(uCloseable);
          FrogDownloadClient.closeQuietly(uByteArrayOu);
          return;
       }
    }
}
