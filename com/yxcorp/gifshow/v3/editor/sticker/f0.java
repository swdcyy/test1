package com.yxcorp.gifshow.v3.editor.sticker.f0;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper;
import com.yxcorp.gifshow.v3.editor.sticker.f0$a;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import qkd.c;
import fg6.a;
import com.yxcorp.gifshow.v3.editor.sticker.jsonmodel.StickerJsonInfo;
import com.google.gson.Gson;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import java.util.List;
import java.util.Collection;
import ekd.q;
import faa.a;
import q87.c;
import itc.k3;
import ekd.b0;
import com.yxcorp.gifshow.util.BitmapUtil;
import android.widget.ProgressBar;
import brd.a0;
import itc.k1;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import itc.i1;
import erd.a;
import com.yxcorp.gifshow.v3.editor.sticker.f0$b;
import java.io.File;
import wkd.b;
import j80.c;
import com.yxcorp.gifshow.v3.editor.sticker.h1;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$InfoWithResource;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$a;
import gq.a;
import java.util.Map;
import lnc.k6;
import lnc.j6;
import lq.f;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$c;
import com.yxcorp.gifshow.v3.editor.sticker.f0$c;

public class f0 extends PostBaseResourceDownloadHelper	// class@00124a
{

    public void f0(){
       super();
    }
    public void f0(f0$a p0){
       super();
    }
    public static void h(StickerDetailInfo p0){
       Object[] objArray;
       f0 uof0 = f0.class;
       StickerJsonInfo obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, uof0, "12")) {
          return;
       }
       long l = System.currentTimeMillis();
       if (p0 == null) {
          return;
       }
       if (p0.isStickerNeedLoadInfoJson()) {
          String str = PatchProxy.applyOneRefs(p0, obj, uof0, "13");
          if (str != PatchProxyResult.class) {
          }else {
             str = f0.m(p0)+"info.json";
          }
          str = c.l(str);
          try{
             obj = a.a.h(str, StickerJsonInfo.class);
          }catch(java.lang.Exception e4){
             PostUtils.D("StickerDownloadHelper", "fillStickerDetailInfoFromJson", e4);
          }
          if (obj != null && (!q.f(obj.getShapes()) && !StickerDetailInfo.isInteractiveSticker(p0))) {
             p0.setStickerJsonInfo(obj);
             objArray = new Object[0];
             a.D().w("StickerDownloadHelper", "fillStickerDetailInfoFromJson dynamic sticker need fill param. jsonString:"+str+",stickerJsonInfo:"+obj+",stickerDetailInfo:"+p0, objArray);
          }
       }
    label_0093 :
       if (p0.isStickerNeedDecodeDimension()) {
          boolean b = (p0.mStickerType == 2)? true: false;
          b0 uob0 = BitmapUtil.E(k3.t(p0, b));
          p0.setResourceWidthFromDecode(uob0.a);
          p0.setResourceHeightFromDecode(uob0.b);
          Object[] objArray1 = new Object[0];
          a.D().w("StickerDownloadHelper", "fillStickerDetailInfoFromJson normal sticker need fill param stickerDetailInfo:"+p0+",stickerDimension:"+uob0, objArray1);
       }
       objArray = new Object[0];
       a.D().w("StickerDownloadHelper", "fillStickerDetailInfoFromJson stickerDetailInfo:"+p0+",costDuration:"+(System.currentTimeMillis() - l), objArray);
       return;
    }
    public static a0 i(StickerDetailInfo p0,ProgressBar p1){
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, null, f0.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p0.isStickerNeedLoadInfoJson() && !p0.isStickerNeedDecodeDimension()) {
          return a0.B(p0);
       }
       int i = 0;
       if (p1 != null) {
          p1.setVisibility(i);
       }
       obj = new Object[i];
       a.D().w("StickerDownloadHelper", "fillStickerDetailInfoFromJsonObservable need load info.json stickerDetailInfo:"+p0, obj);
       return a0.y(new k1(p0)).T(d.c).G(d.a).m(new i1(p1));
    }
    public static f0 j(){
       return f0$b.a;
    }
    public static String k(StickerDetailInfo p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f0 uof0 = f0.class;
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, uof0, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "";
       File uFile = PatchProxy.apply(null, null, uof0, "7");
       if (uFile != patchProxyRe) {
       }else {
          uFile = b.a(-1504323719).h(".sticker_library_resource");
       }
       String separator = File.separator;
       return obj+uFile.getAbsolutePath()+separator+p0.mGroupId+separator;
    }
    public static String l(StickerDetailInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return h1.g(p0)+".zip";
    }
    public static String m(StickerDetailInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f0.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f0.k(p0)+h1.g(p0)+File.separator;
    }
    public static boolean n(StickerDetailInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, f0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (q.f(p0.mResourceUrls)) {
          return b;
       }
       if (p0.mStickerType == -2) {
          return b;
       }
       return new File(f0.m(p0), "info.json").exists();
    }
    public void b(String p0,String p1,PostBaseResourceDownloadHelper$InfoWithResource p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f0.class, "4")) {
       }else {
          new File(p0+p1).delete();
          new File(f0.m(p2)).delete();
       }
       return;
    }
    public void c(List p0,PostBaseResourceDownloadHelper$a p1,PostBaseResourceDownloadHelper$InfoWithResource p2,boolean p3){
       String this;
       if (!PatchProxy.isSupport(f0.class) || !PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, f0.class, "3")) {
          String str = f0.k(p2);
          this = f0.l(p2);
          int i = 0;
          Object[] objArray = new Object[i];
          String str1 = "PostBaseResourceDownloadHelper";
          a.D().s(str1, "addDownloadTask: info="+p2, objArray);
          if (this.b.containsKey(p2.getId()) && !p3) {
             Object[] objArray1 = new Object[i];
             a.D().A(str1, "addDownloadTask: ignore this, mDownloadIds contains "+p2.getId(), objArray1);
          }else {
             this.b.put(p2.getId(), p2.getId());
             j6 oj6 = new j6(this, p0, str, this, p3, p2, p1);
             a0.y(new k6(this, str, this, p2)).T(d.c).G(d.a).R(v9, f.b);
          }
       }
       return;
    }
    public String d(){
       return "EDIT_STICKER";
    }
    public PostBaseResourceDownloadHelper$c e(PostBaseResourceDownloadHelper$InfoWithResource p0){
       PostBaseResourceDownloadHelper$c uoc = PatchProxy.applyOneRefs(p0, this, f0.class, "5");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = this.a.get(p0.getId());
          if (uoc == null) {
             uoc = new f0$c(this, p0, null);
          }
       }
       return uoc;
    }
    public void g(StickerDetailInfo p0,PostBaseResourceDownloadHelper$a p1,boolean p2){
       if (PatchProxy.isSupport(f0.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, f0.class, "1")) {
          return;
       }
       this.c(p0.getResourceUrls(), new f0$a(this, p1), p0, p2);
       return;
    }
}
