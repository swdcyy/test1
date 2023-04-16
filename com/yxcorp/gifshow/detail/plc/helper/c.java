package com.yxcorp.gifshow.detail.plc.helper.c;
import android.os.Environment;
import java.lang.String;
import java.io.File;
import java.util.HashMap;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import android.app.Activity;
import com.yxcorp.download.b;
import java.lang.Object;
import tkd.b;
import tkd.d;
import nl9.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.download.DownloadManager;
import android.content.Intent;
import java.lang.StringBuilder;
import android.os.Build$VERSION;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import ekd.w0;
import com.kuaishou.tuna_logger.KsLogTunaPlcTag;
import java.util.List;
import com.yxcorp.gifshow.detail.plc.helper.b;
import msd.a;
import java.lang.Throwable;
import c15.b;
import com.yxcorp.gifshow.commercial.model.ApkDownloadTaskInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.gifshow.detail.plc.helper.c$a;
import mu8.o;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Map;
import com.yxcorp.gifshow.detail.plc.adapter.b;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.yxcorp.gifshow.commercial.model.AdDownloaderType;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.net.NetworkInfo;
import ekd.p0;
import f4a.c;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;
import nz6.a;

public class c	// class@001675
{
    public int a;
    public PlcEntryDataAdapter b;
    public Activity c;
    public b d;
    public static final String e;
    public static final Map f;

    static {
       c.e = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
       c.f = new HashMap();
    }
    public void c(PlcEntryDataAdapter p0,Activity p1,b p2){
       super();
       this.a = -1;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       d.a(0x4bd38ddd).by();
    }
    public void a(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "5")) {
          return;
       }
       DownloadManager.n().B(p0, this.d);
       return;
    }
    public void b(String p0){
       Uri uriForFile;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "9")) {
          return;
       }
       try{
          DownloadManager.C("tuna_plc", "");
          Intent intent = new Intent("android.intent.action.VIEW");
          File uFile = new File(c.e+File.separator+p0);
          if (Build$VERSION.SDK_INT >= 24) {
             uriForFile = FileProvider.getUriForFile(a.a().a(), a.a().a().getPackageName()+".fileprovider", uFile);
             intent.addFlags(1);
          }else {
             uriForFile = w0.c(uFile);
          }
          intent.addFlags(0x10000000);
          intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
          a.b().startActivity(intent);
       }catch(java.lang.Exception e5){
          b.e(KsLogTunaPlcTag.PLC.appendTag("ApkDownloadManager"), b.b, e5);
       }
       return;
    }
    public final int c(Activity p0,ApkDownloadTaskInfo p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0.intValue();
       }
       DownloadTask$DownloadRequest uDownloadReq = new DownloadTask$DownloadRequest(this.b.getDownloadUrl());
       uDownloadReq.setDownloadTaskType(DownloadTask$DownloadTaskType.IMMEDIATE);
       uDownloadReq.setDestinationDir(c.e);
       uDownloadReq.setDestinationFileName(this.b.getFileName());
       uDownloadReq.setNotificationVisibility(3);
       uDownloadReq.setBizInfo(":ks-components:tuna-plc-base", "tuna_plc", null);
       uDownloadReq.setIsPhotoAdDownloadRequest();
       boolean b = true;
       uDownloadReq.setNeedCDNReport(b);
       uDownloadReq.setInstallCallListener(new c$a(this));
       int i = 0;
       b[] uobArray = new b[i];
       int i1 = DownloadManager.n().E(uDownloadReq, uobArray);
       this.a(i1);
       String str = this.b.getPhoto().getPhotoId()+"_"+i1;
       Map f = c.f;
       b uob = f.get(str);
       if (uob == null) {
          uob = new b(this.b.getPhoto(), this.b.getPlcEntryStyleInfo());
          f.put(str, uob);
       }
       b[] uobArray1 = new b[]{this.d,uob};
       DownloadManager.n().b(i1, uobArray1);
       d.a(0x4bd38ddd).g30(i1, uDownloadReq, p1, AdDownloaderType.DOWNLOAD_FULL_SPEED).subscribe(Functions.d(), Functions.d());
       return i1;
    }
    public final void d(Activity p0,ApkDownloadTaskInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "3")) {
          return;
       }
       NetworkInfo networkInfo = p0.e(a.b());
       if (networkInfo != null && !networkInfo.getType()) {
          a.c(R.string.arg_RES_7f1039a1, new int[2]{R.string.arg_RES_7f10081a,0x7f1004b4}, p0, new c(this, p0, p1)).show();
       }else {
          DownloadManager.n().A(p0);
          this.a = this.c(p0, p1);
       }
       return;
    }
}
