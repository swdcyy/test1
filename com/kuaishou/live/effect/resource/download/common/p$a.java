package com.kuaishou.live.effect.resource.download.common.p$a;
import com.yxcorp.download.k;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import wz2.a;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.System;
import com.yxcorp.download.DownloadTask;
import java.io.File;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.effect.resource.download.common.f$a;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.String;
import y56.a;
import uz2.b;
import com.kuaishou.live.effect.resource.download.common.p;
import java.lang.StringBuilder;
import android.util.Log;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.effect.resource.download.common.f;
import xz2.a;
import java.util.Objects;
import xz2.a$a;
import kotlin.jvm.internal.a;
import lnc.i3;
import java.lang.Float;
import java.lang.Number;
import com.kuaishou.live.effect.resource.download.switc.LiveEffectDownloadSwitchContainer;
import java.lang.Integer;
import vz2.c0;
import java.lang.Long;
import vz2.j;
import java.util.zip.ZipException;
import java.io.IOException;
import vz2.j$a;
import k2b.u1;
import qkd.b;
import vz2.i;
import com.kuaishou.gifshow.files.a;
import vz2.x;
import java.lang.Runnable;
import t45.c;
import vz2.y;
import a03.a$c;
import a03.a;
import java.util.Iterator;
import vz2.a0;
import k2b.k2;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import java.lang.Enum;
import k2b.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CdnResourceLoadStatEvent;
import com.kwai.video.hodor.ResourceDownloadTask$TaskInfo;
import com.kwai.video.hodor.BaseTaskInfo;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import wkd.b;
import com.yxcorp.gifshow.log.h;

public class p$a extends k	// class@001b46
{
    public final List c;
    public final MagicEmoji$MagicFace d;
    public final a e;
    public final int f;
    public String g;
    public int h;
    public long i;

    public void p$a(MagicEmoji$MagicFace p0,a p1,int p2){
       super();
       this.c = new CopyOnWriteArrayList();
       this.h = 0;
       this.d = p0;
       this.e = p1;
       this.i = System.currentTimeMillis();
       this.f = p2;
    }
    public static void q(p$a p0,DownloadTask p1,File p2,File p3,long p4,Throwable p5){
       a$a a;
       j$a p;
       f$a uoa = new f$a();
       uoa.a = p0.d.mId;
       uoa.b = p1.getUrl();
       uoa.d = p2.getAbsolutePath();
       uoa.f = p3.getAbsolutePath();
       uoa.g = p4;
       uoa.i = p0.h;
       uoa.h = p5;
       float f = 0xbf800000;
       float f1 = (p2.exists())? b.a(a.c(p2)): 0xbf800000;
       uoa.c = f1;
       if (p3.exists()) {
          f = b.a(a.c(p3));
       }
       uoa.e = f;
       Object[] objArray = null;
       String str = "1";
       f uof = PatchProxy.apply(objArray, uoa, f$a.class, str);
       if (uof != PatchProxyResult.class) {
       }else {
          uof = new f(uoa);
       }
       String str1 = "12";
       if (!PatchProxy.applyVoidOneRefs(uof, objArray, a.class, str1)) {
          a = a.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(uof, a, a$a.class, str1)) {
             a.p(uof, "unzipRecord");
             i3 oi3 = i3.f();
             int i = 0;
             String str2 = (uof.h == null)? 1: null;
             str2 = (str2)? "SUCCESS": "FAIL";
             oi3.d("status", str2);
             oi3.d("source", "old");
             oi3.d("download_url", uof.b);
             oi3.c("origin_file_size", Float.valueOf(uof.c));
             oi3.d("origin_file_path", uof.d);
             oi3.c("unzipped_file_size", Float.valueOf(uof.e));
             oi3.d("unzipped_file_path", uof.f);
             oi3.c("effect_switch_type", Integer.valueOf(LiveEffectDownloadSwitchContainer.get().type));
             oi3.d("effect_exp_id", c0.a());
             oi3.c("from", Integer.valueOf(uof.i));
             oi3.d("magic_face_id", uof.a);
             oi3.c("time_cost", Long.valueOf(uof.g));
             p = j.P;
             Throwable throwable = uof.a();
             Objects.requireNonNull(p);
             if (throwable instanceof ZipException) {
                i = 1000;
             }else if(throwable instanceof IOException){
                i = 1001;
             }else if(throwable instanceof Throwable){
                i = 1100;
             }
             oi3.c("code", Integer.valueOf(i));
             Throwable throwable1 = uof.a();
             str = PatchProxy.applyOneRefs(throwable1, p, j$a.class, str);
             if (str != PatchProxyResult.class) {
             }else {
                str = Log.getStackTraceString(throwable1);
                a.o(str, "Log.getStackTraceString\(throwable\)");
             }
             oi3.d("message", str);
             u1.R("LIVE_MAGIC_EFFECT_UNZIP", oi3.toString(), 3);
          }
       }
       if (p5 != null) {
          b.P(p.d, "[blockComplete]: err "+Log.getStackTraceString(p5));
       }
       b.x(p2);
       return;
    }
    public void a(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$a.class, "3")) {
          return;
       }
       File uFile = new File(p0.getTargetFilePath());
       String str = i.e.b()+File.separator+b.c(this.d);
       File uFile1 = new File(str);
       b.m(uFile1);
       a.h(uFile, str);
       x ox = new x(this, p0, uFile, uFile1, (System.currentTimeMillis() - System.currentTimeMillis()), null);
       c.a(v10);
       b.P(p.d, "blockComplete --- targetFile: "+uFile.getAbsolutePath()+"  folderPath: "+str);
       return;
    }
    public void b(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$a.class, "7")) {
          return;
       }
       this.r(p0, null, 2);
       a.b(this.d, p0, "CANCEL", this.h);
       a.a().b("素材下载取消", this.d, this.h);
       return;
    }
    public void c(DownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$a.class, "6")) {
          return;
       }
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          iterator.next().c(this.d, this.e);
       }
       this.c.clear();
       this.r(p0, null, 1);
       a.b(this.d, p0, "SUCCESS", this.h);
       a.a().b("素材下载完成", this.d, this.h);
       return;
    }
    public void e(DownloadTask p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, p$a.class, "5")) {
          return;
       }
       int i = 3;
       this.r(p0, p1, i);
       p$a td = this.d;
       p$a th = this.h;
       a uoa = a.class;
       int i1 = 0;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{td,p0,"FAIL",Integer.valueOf(th),p1};
          if (PatchProxy.applyVoid(objArray, null, uoa, "11")) {
          label_0045 :
             a.a().b("素材下载失败", this.d, this.h);
             Iterator iterator = this.c.iterator();
             while (iterator.hasNext()) {
                i1 = i1 | iterator.next().b(this.d);
             }
             if (!i1) {
                iterator = this.c.iterator();
                while (iterator.hasNext()) {
                   iterator.next().a(this.d, this.e, 0x2718, p1);
                }
                this.c.clear();
             }
             return;
          }
       }
       a.a.b(td, p0, "FAIL", th, p1);
       goto label_0045 ;
    }
    public void k(DownloadTask p0,long p1,long p2){
       if (PatchProxy.isSupport(p$a.class)) {
          PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, p$a.class, "4");
       }
       return;
    }
    public void o(DownloadTask p0){
       a$a a;
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, p$a.class, "2")) {
          return;
       }
       if (p0 != null) {
          p$a td = this.d;
          p$a th = this.h;
          if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(td, p0, Integer.valueOf(th), null, a.class, "9")) {
             a = a.a;
             Objects.requireNonNull(a);
             a$a uoa = a$a.class;
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidThreeRefs(td, p0, Integer.valueOf(th), a, a$a.class, "9")) {
                a.p(td, "magicFace");
                a.p(p0, "task");
                i3 oi3 = i3.f();
                oi3.d("status", "START");
                if (u1.j() == null) {
                   str = "";
                }else {
                   str = u1.j().d;
                   a.o(str, "Logger.getCurrentPage\(\).mPage2");
                }
                oi3.d("current_page", str);
                a.o(oi3, "jsonBuilder");
                if (PatchProxy.isSupport(uoa) && PatchProxy.applyFourRefs(oi3, td, p0, Integer.valueOf(th), a, a$a.class, "13") != PatchProxyResult.class) {
                }else {
                   a.a(oi3, td.mResources);
                   oi3.d("source", "old");
                   oi3.c("from", Integer.valueOf(th));
                   oi3.d("download_url", p0.getUrl());
                   oi3.d("file_path", p0.getDestinationDir());
                   oi3.d("file_name", p0.getFilename());
                   oi3.c("resource_flag", Integer.valueOf(1));
                   oi3.d("task_type", p0.getDownloadTaskType().name());
                   oi3.c("effect_switch_type", Integer.valueOf(LiveEffectDownloadSwitchContainer.get().type));
                   oi3.d("effect_exp_id", c0.a());
                   oi3.d("magic_face_uniqueidentifier", td.getUniqueIdentifier());
                   oi3.d("p2sp_policy", LiveEffectDownloadSwitchContainer.getP2spPolicy());
                   oi3.d("magic_face_id", td.mId);
                }
                u1.R("LIVE_MAGIC_EFFECT_DOWNLOAD", oi3.toString(), 3);
             }
          }
          a.a().b("开始下载素材", this.d, this.h);
       }
       return;
    }
    public final void r(DownloadTask p0,Throwable p1,int p2){
       g this;
       if (PatchProxy.isSupport(p$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, p$a.class, "8")) {
          return;
       }
       long l = System.currentTimeMillis() - this.i;
       g og = new g();
       int id = p0.getId();
       this = g.class;
       if (PatchProxy.isSupport(this)) {
          this = PatchProxy.applyOneRefs(Integer.valueOf(id), og, this, "1");
          if (this != PatchProxyResult.class) {
          label_004a :
             this.n(this.f);
             this.b(p0.getSoFarBytes());
             this.d(p0.getTotalBytes());
             this.q(p0.getTotalBytes());
             p$a tg = (!TextUtils.x(this.g))? this.g: TextUtils.k(this.d.mResource);
             this.r(tg);
             this.h("");
             this.i(false);
             this.k(p2);
             this.l(l);
             this.p(l);
             this.c(p1);
             if (MagicEmoji$MagicFace.isMagicGift(this.d) && !TextUtils.x(this.d.mId)) {
                i3 oi3 = i3.f();
                oi3.d("magic_face_id", this.d.mId);
                og.x = oi3.e();
             }
             ClientStat$CdnResourceLoadStatEvent uCdnResource = og.a();
             ResourceDownloadTask$TaskInfo taskInfo = p0.getTaskInfo();
             if (taskInfo != null) {
                uCdnResource.cdnQosJson = taskInfo.getCdnStatJson();
             }
             ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
             statPackage.cdnResourceLoadStatEvent = uCdnResource;
             b.a(0x4b316083).j(statPackage);
             this.i = System.currentTimeMillis();
             return;
          }
       }
       og.w = String.valueOf(id);
       this = og;
       goto label_004a ;
    }
}
