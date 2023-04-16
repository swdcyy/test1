package com.yxcorp.gifshow.camera.record.music.g$a;
import java.lang.Object;
import nsd.u;
import t16.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.model.music.Music;
import com.kwai.feature.post.api.music.data.MusicSource;
import brd.t;
import java.lang.String;
import com.yxcorp.gifshow.model.Lyrics;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import kqb.b0;
import kotlin.jvm.internal.a;
import ojd.f;
import com.kwai.framework.network.util.HttpDownloadUtil;
import kqb.g0;
import java.io.InputStreamReader;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import ok.c;
import java.nio.charset.Charset;
import java.io.Reader;
import qkd.c;
import android.os.SystemClock;
import k2b.g;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MusicDetailPackage;
import k2b.b2;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CdnResourceLoadStatEvent;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import java.lang.Exception;
import java.io.IOException;
import java.lang.Throwable;
import java.lang.Boolean;
import android.content.Intent;
import com.yxcorp.gifshow.camera.record.music.g$a$e;
import io.reactivex.g;
import com.yxcorp.gifshow.camera.record.music.g$a$d;
import com.yxcorp.gifshow.camera.record.music.g$a$f;
import com.yxcorp.gifshow.camera.record.music.g$a$a;
import erd.o;
import com.yxcorp.gifshow.camera.record.music.g$a$b;
import com.yxcorp.gifshow.camera.record.music.g$a$c;
import brd.w;
import java.io.Serializable;
import ekd.j0;
import java.lang.CharSequence;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import java.util.List;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.music.utils.e;
import android.net.Uri;
import qkd.b;
import ekd.w0;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.gifshow.camera.record.music.n$d;
import lnc.r5;
import android.graphics.Bitmap;
import ekd.a0;
import j80.c;
import com.yxcorp.gifshow.media.util.h;
import j8c.a;
import com.yxcorp.gifshow.camera.record.music.g;
import w46.b;
import com.yxcorp.gifshow.music.utils.d;
import q87.c;

public final class g$a	// class@000e7e
{

    public void g$a(){
       super();
    }
    public void g$a(u p0){
       super();
    }
    public static t e(g$a p0,a p1,GifshowActivity p2,Music p3,boolean p4,MusicSource p5,int p6,Object p7){
       int i;
       p5 = (p6 & 0x10)? MusicSource.UNKNOWN: 0;
       return p0.d(p1, p2, p3, p4, p5);
    }
    public final Lyrics a(int p0,String[] p1,Music p2){
       File obj;
       Lyrics lyrics1;
       if (PatchProxy.isSupport(g$a.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, g$a.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Lyrics lyrics = null;
       if (p0 >= p1.length) {
          return lyrics;
       }else {
          obj = b0.e(p2);
          if (obj != null) {
             String str = "MusicURLUtils.getLyricsC\x20\x02ile\(music\) ?: return null\x00";
             try{
                a.o(obj, str);
                HttpDownloadUtil.a(p1[p0], obj, lyrics, 0x2710);
                lyrics1 = new g0().b(c.k(new InputStreamReader(new BufferedInputStream(super(obj)), c.c)));
             }catch(java.lang.Exception e0){
                lyrics1++;
                lyrics1 = this.a(lyrics1, p1, p2);
             }
             return lyrics1;
          }else {
             return lyrics;
          }
       }
    }
    public final void b(String p0,File p1,Music p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, g$a.class, "3")) {
          return;
       }
       HttpDownloadUtil.a(p0, p1, null, 0x2710);
       long l = SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime();
       g og = new g();
       og.n(5);
       og.b(p1.length());
       og.d(p1.length());
       og.q(p1.length());
       og.r(TextUtils.k(p0));
       og.k(1);
       og.l(l);
       og.s(u1.k());
       ClientContent$MusicDetailPackage musicDetailP = b2.a(p2);
       og.o = musicDetailP;
       if (musicDetailP != null) {
          musicDetailP.name = "";
       }
       og.p(l);
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       statPackage.cdnResourceLoadStatEvent = og.a();
       b.a(0x4b316083).j(statPackage);
       return;
    }
    public final void c(int p0,String[] p1,File p2,Exception p3,Music p4){
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
             return;
          }
       }
       if (p0 < p1.length) {
          try{
             this.b(p1[p0], p2, p4);
          }catch(java.lang.Exception e13){
             this.c((p0 + 1), p1, p2, e13, p4);
          }
          return;
       }else {
          throw new IOException("Download music failed", p3);
       }
    }
    public final t d(a p0,GifshowActivity p1,Music p2,boolean p3,MusicSource p4){
       Intent[] obj;
       g$a uoa = g$a.class;
       Integer integer = Integer.valueOf(1);
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, uoa, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "param");
       a.p(p1, "activity");
       a.p(p2, "music");
       a.p(p4, "musicSource");
       obj = new Intent[1];
       t ot = t.create(new g$a$e(p2, p0));
       a.o(ot, "Observable.create { emit¡­     }\)\n        }\n      }");
       t ot1 = t.create(new g$a$f(obj, p3));
       a.o(ot1, "Observable.create { emit¡­tter.onComplete\(\)\n      }");
       ot = t.concat(t.just(integer).flatMap(new g$a$a(ot)), t.just(integer).flatMap(new g$a$b(t.create(new g$a$d(p1, p2, p4, obj)))), t.just(integer).flatMap(new g$a$c(ot1)));
       a.o(ot, "Observable.concat\(Observ¡­ap { processObservable }\)");
       return ot;
    }
    public final void f(Intent p0,Music p1){
       Lyrics lyrics;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g$a.class, "4")) {
          return;
       }
       a.p(p0, "data");
       a.p(p1, "music");
       if (j0.e(p0, "lyrics") != null) {
          return;
       }
       if (!TextUtils.x(p1.mLyrics)) {
          lyrics = new g0().b(p1.mLyrics);
       }else {
          String[] stringArray = e0.b(p1.mLrcUrls, p1.mLrcUrl);
          a.o(stringArray, "CDNUtil.convertToUrls\(mu¡­.mLrcUrls, music.mLrcUrl\)");
          lyrics = this.a(0, stringArray, p1);
       }
       if (lyrics != null && !lyrics.mLines.isEmpty()) {
          SerializableHook.putExtra(p0, "lyrics", lyrics);
       }
       return;
    }
    public final void g(Intent p0,Music p1){
       long this;
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g$a.class, str)) {
          return;
       }
       a.p(p0, "data");
       a.p(p1, "music");
       boolean b = false;
       if (!PatchProxy.applyVoidOneRefs(p1, null, e.class, str) && p1 != null) {
          e.b(b, e0.b(p1.mLrcUrls, p1.mLrcUrl), p1);
       }
       if (p0.getData() != null) {
          return;
       }else {
          File uFile = b0.h(p1);
          if (!b.S(uFile) && uFile != null) {
             String[] stringArray = e0.b(p1.mUrls, p1.mUrl);
             a.o(stringArray, "CDNUtil.convertToUrls\(music.mUrls, music.mUrl\)");
             this.c(0, stringArray, uFile, null, p1);
          }
          p0.setData(w0.c(uFile));
          this = 0;
          if (b.S(uFile)) {
             a.m(uFile);
             if (uFile.length() - this > 0) {
             label_009f :
                return;
             }
          }
          StringBuilder str1 = "Download successfully but file has no content. file exists ? : ";
          if (uFile != null && uFile.exists()) {
             b = true;
          }
          str1 = str1+b+", file length : ";
          if (uFile != null) {
             this = uFile.length();
          }
          ExceptionHandler.handleCaughtException(new Exception(str1+this));
          goto label_009f ;
       }
    }
    public final n$d h(Intent p0,Music p1){
       Object[] objArray;
       String str1;
       String str2;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, g$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "data");
       obj = "";
       n$d uod = null;
       if (p1 == null) {
          return uod;
       }
       String str = "cover_bitmap";
       if (j0.g(p0, str)) {
          Bitmap uBitmap = r5.b().d(j0.f(p0, str));
          int i = 0;
          if (uBitmap == null || uBitmap.isRecycled()) {
             objArray = new Object[i];
             a.D().w(g.d, "musicCoverBitmap isRecycled ", objArray);
             return new n$d(uod, obj);
          }else if(TextUtils.x(p1.getId())){
             str1 = a0.c(p1.mName);
             str2 = "DigestUtils.md5Hex\(music.mName\)";
          }else {
             str1 = p1.getId();
             str2 = "music.id";
          }
          a.o(str1, str2);
          str1 = b.a(-1504323719).o().toString()+"/tmpOperationMusicCover"+str1+".png";
          File uFile = new File(str1);
          if (uFile.exists()) {
             uFile.delete();
          }
          int i1 = 10;
          try{
             h.d(uBitmap, str1, i1);
             obj = str1;
          }catch(java.io.IOException e8){
             Object[] objArray1 = new Object[1];
             objArray1[i] = "save capture music cover file failed";
             a.D().u(g.d, e8, objArray1);
          }
          uod = d.b(uBitmap);
          objArray = new Object[i];
          a.D().w(g.d, "saveMusicCover circleMusicCoverBitmap = "+uod+' '+"musicCoverBitmap = "+uBitmap+" coverFilePathResult = "+obj, objArray);
       }
       return new n$d(uod, obj);
    }
}
