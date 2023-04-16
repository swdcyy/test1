package com.kuaishou.live.redpacket.feature.common.popup.skin.prefetch.downloader.f;
import com.kuaishou.live.redpacket.feature.common.popup.skin.prefetch.downloader.a;
import wo3.c;
import java.lang.Object;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zo3.d;
import java.lang.StringBuilder;
import java.io.File;
import zo3.c;
import java.security.MessageDigest;
import java.lang.Integer;
import vo3.a;
import xo3.a;
import t45.d;
import wo3.a;
import java.lang.Runnable;
import crd.b;
import brd.z;
import com.kuaishou.live.redpacket.feature.common.popup.skin.prefetch.downloader.ResourceDownloadFailType;
import java.lang.Throwable;
import com.kuaishou.live.redpacket.feature.common.popup.skin.prefetch.downloader.a$a;
import java.lang.Long;
import java.lang.System;
import uo3.e;
import java.lang.Number;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import tc.h;
import com.facebook.cache.common.CacheKey;
import java.lang.RuntimeException;
import vc.j;
import com.facebook.cache.disk.f;
import sa.a;
import sa.b;
import qkd.b;
import java.io.IOException;

public class f implements a	// class@000f4c
{
    public final String a;
    public final Context b;
    public final String c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public a h;
    public final int i;

    public void f(c p0){
       super();
       this.i = a.t().a("liveResourcePrefetchMethodType", 2);
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
       this.d = p0.d;
       this.e = p0.e;
       this.f = p0.f;
       this.g = p0.g;
    }
    public String a(CDNUrl[] p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       String str = null;
       if (!d.b(p0)) {
          return str;
       }
       try{
          int i = 0;
          String path = p0[i].getPath();
          StringBuilder str1 = this.c+File.separator;
          Object obj1 = PatchProxy.applyOneRefs(path, str, c.class, "3");
          if (obj1 != patchProxyRe) {
             str = obj1;
          }else {
             MessageDigest instance = MessageDigest.getInstance("MD5");
             instance.update(path.getBytes());
             byte[] uobyteArray = instance.digest();
             StringBuilder str2 = "";
             int len = uobyteArray.length;
             for (; i < len; i = i + 1) {
                byte b = uobyteArray[i];
                if (b < 0) {
                   b = b + 256;
                }
                if (b < 16) {
                   str2 = str2+"0";
                }
                str2 = str2+Integer.toHexString(b);
             }
             str = str2;
          }
          return str1+str+".webp";
       }catch(java.lang.Exception e0){
       }
    }
    public void b(a p0){
       this.h = p0;
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       d.c.d(new a(this, p0));
       return;
    }
    public void clear(){
    }
    public void d(long p0,ResourceDownloadFailType p1,Throwable p2,a$a p3,a p4){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uof, "11")) {
             return;
          }
       }
       String message = (p2 != null)? p2.getMessage(): p1.getMessage();
       if (p3 != null) {
          p3.b(p4, p1, message, p2, this.f(p0));
       }
       String str = "download fail , error = "+message+", costTime: "+(System.currentTimeMillis() - p0)+"ms, mEnableCdnTransform: "+this.e+", config: "+p4.toString();
       this.g(str);
       e.c(str);
       return;
    }
    public void e(String p0,long p1,String p2,a$a p3,a p4){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{p0,Long.valueOf(p1),p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uof, "10")) {
             return;
          }
       }
       if (p3 != null) {
          p3.a(p4, p2, this.f(p1));
       }
       this.g(p0+", costTime: "+(System.currentTimeMillis() - p1)+", config: "+p4.toString());
       return;
    }
    public final long f(long p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uof, "12");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return (System.currentTimeMillis() - p0);
    }
    public final void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "14")) {
          return;
       }
       e.a(this.a, "ResourceDownLoader", p0);
       return;
    }
    public void h(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "13")) {
          return;
       }
       e.b(this.a, "ResourceDownLoader", p0);
       return;
    }
    public void i(long p0,ImageRequest p1,String p2,a$a p3,a p4){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uof, "4")) {
             return;
          }
       }
       String str = null;
       CacheKey uCacheKey = Fresco.getImagePipeline().getCacheKeyFactory().b(p1, str);
       if (uCacheKey == null) {
          this.d(p0, ResourceDownloadFailType.SAVE_FRESCO_CACHE_KEY_NOT_EXIST, new RuntimeException("save webp anim to disk error, cacheKey not exist"), p3, p4);
          return;
       }else {
          uof = this.h;
          if (uof != null && uof.e(p2)) {
             this.e("save webp anim to disk success cause local file already exist", p0, p2, p3, p4);
             return;
          }else {
             a uoa = j.j().l().c(uCacheKey);
             if (!uoa instanceof b) {
                ResourceDownloadFailType sAVE_FRESCO_ = ResourceDownloadFailType.SAVE_FRESCO_CACHE_NOT_EXIST;
                p2 = "save webp anim to disk error, BinaryResource not exist, resource = ";
                if (uoa != null) {
                   str = uoa.toString();
                }
                this.d(p0, sAVE_FRESCO_, new RuntimeException(p2+str), p3, p4);
                return;
             }else {
                try{
                   File uFile = uoa.c();
                   if (uFile != null && (uFile.exists() && uFile.length() - null > 0)) {
                      b.g(uFile, new File(p2));
                      this.e("save webp anim cache file to disk success", p0, p2, p3, p4);
                   }
                }catch(java.io.IOException e12){
                   e12.printStackTrace();
                   this.d(p0, ResourceDownloadFailType.SAVE_IO_ERROR, new RuntimeException("save webp anim cache file to disk error, "+e12.getMessage()), p3, p4);
                }
                return;
             }
          }
       }
    }
}
