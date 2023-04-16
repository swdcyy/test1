package com.yxcorp.gifshow.photo.download.utils.e;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Environment;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.StringBuilder;
import java.lang.System;
import com.kwai.chat.components.utils.a;
import java.lang.Boolean;
import brd.t;
import axb.b;
import jxb.i;
import cjd.e;
import erd.o;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import t45.d;
import kxb.g;
import erd.g;
import crd.b;
import kxb.h;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.photo.download.utils.e$a;
import e17.i;
import com.kuaishou.android.model.mix.PhotoMeta;
import wkd.b;
import zwb.a;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.photo.download.utils.d;

public class e	// class@000f26
{

    public void e(){
       super();
    }
    public static File a(){
       File obj = PatchProxy.apply(null, null, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera");
       if (obj.exists()) {
          return obj;
       }
       return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
    }
    public static File b(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(e.a(), p0.getPhotoId()+System.currentTimeMillis()+".jpg");
    }
    public static File c(QPhoto p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, uoe, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       File uFile = e.a();
       String str = PatchProxy.applyOneRefs(p0, null, uoe, "8");
       if (str != patchProxyRe) {
       }else {
          str = a.c(p0.getPhotoId())+".mp4";
       }
       return new File(uFile, str);
    }
    public static boolean d(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && p0.isMine())? true: false;
       return b;
    }
    public static boolean e(File p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && (p0.getAbsolutePath()).endsWith(".mp4"))? true: false;
       return b;
    }
    public static void f(t p0,b p1,QPhoto p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, e.class, "2")) {
          return;
       }
       t ot = i.d(p2);
       if (ot != null) {
          if (p1 != null) {
             ot.map(new e()).subscribeOn(b.b(c.c())).observeOn(d.a).doOnNext(new g(p1)).subscribe();
          }
       }else {
          p0.map(new e()).subscribeOn(b.b(c.c())).observeOn(d.a).doOnNext(new h(p1)).subscribe(Functions.d(), new e$a(p1, p2));
       }
       return;
    }
    public static void g(QPhoto p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, e.class, "1")) {
          return;
       }
       if (!p0.isAllowPhotoDownload() && !e.d(p0)) {
          i.a(R.style.arg_RES_7f11066a, 0x7f100ecc);
       }else if(p0.getPhotoMeta() != null && p0.getPhotoMeta().mPostWorkInfoId >= null){
          e.f(i.e(p0), p1, p0);
       }else {
          e.f(b.a(-258426948).d(p0.getPhotoId(), QCurrentUser.ME.getId(), p0.getSource(), null, 0), p1, p0);
       }
       return;
    }
    public static t h(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || p0.isAllowPhotoDownload()) {
          return t.just(Boolean.FALSE);
       }
       return b.a(-258426948).d(p0.getPhotoId(), QCurrentUser.ME.getId(), p0.getSource(), null, 0).map(new e()).map(d.b);
    }
}
