package com.yxcorp.gifshow.camera.record.autoapply.sample.c;
import lc9.b;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import ra6.a;
import java.lang.StringBuilder;
import lc9.a;
import com.yxcorp.gifshow.camera.record.base.b;
import brd.t;
import java.io.File;
import gq.a;
import q87.c;
import mc9.a;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import java.lang.Number;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Intent;
import android.app.Activity;
import com.kwai.video.hodor.ExportMediaCacheTask;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.download.DownloadManager;
import nc9.b;
import com.yxcorp.gifshow.model.CDNUrl;
import kp.r1;
import com.kuaishou.android.model.feed.VideoFeed;
import com.kuaishou.android.model.mix.VideoMeta;
import tl8.d;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import wd9.a;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.SameFrameInfo;
import com.kuaishou.android.model.mix.FollowShootModel;
import java.util.Collection;
import ekd.q;
import lnc.e0;
import ekd.a0;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import mc9.c;
import io.reactivex.g;
import mc9.l;
import erd.r;
import mc9.h;
import erd.g;
import ic9.a;
import java.lang.Float;
import mc9.i;
import erd.o;
import brd.w;
import mc9.j;
import mc9.g;
import mc9.f;
import erd.a;
import com.yxcorp.gifshow.camera.record.autoapply.sample.SampleDownloadException;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import j8c.a;
import com.yxcorp.gifshow.feed.g;
import com.yxcorp.gifshow.feed.e;
import com.yxcorp.gifshow.camera.record.autoapply.sample.a;
import mc9.k;
import jd.c;
import com.yxcorp.gifshow.entity.QPhoto;
import pm6.a;
import pm6.o;
import mc9.e;

public class c implements b	// class@001d35
{
    public int a;
    public boolean b;
    public int c;
    public File d;
    public BaseFeed e;
    public ExportMediaCacheTask f;
    public final List g;
    public boolean h;
    public String[] i;
    public File j;
    public String[] k;
    public File l;
    public float m;
    public boolean n;

    public void c(){
       super();
       this.g = new CopyOnWriteArrayList();
    }
    public String a(Object p0,int p1,boolean p2){
       String obj;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, c.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = a1.p(R.string.arg_RES_7f103de5);
       if (a.e()) {
          obj = obj+" ";
       }
       if (p1 == 1 || p1 == 2) {
          return this.o(p0, 0, p2);
       }else {
          String str = "\\p{P}";
          if (p1 == 4) {
             return obj+(a1.p(0x7f10375c)).replaceAll(str, "");
          }else if(p1 == 5){
             return obj+(a1.p(0x7f10375f)).replaceAll(str, "");
          }else if(p1 == 7){
             Object[] objArray = new Object[]{obj};
             return obj+String.format(a1.p(0x7f103760), objArray);
          }else {
             return "";
          }
       }
    }
    public void b(Object p0,int p1){
       a.d(this, p0, p1);
    }
    public t c(Object p0,b p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       if (this.d == null || !this.d.exists()) {
          return t.error(new IllegalStateException("export file is not exists!"));
       }
       Object[] objArray = new Object[0];
       a.D().s("SampleProcessor", "apply, mPhoto:"+this.e+" , mExportFile:"+this.d+" , mAction:"+this.a+" , mLrcFile:"+this.j+" , mAccompanyFile:"+this.l, objArray);
       a uoa = new a(this.e, this.d, this.a, this.j, this.l);
       p1.m(a.D());
       return t.just(Boolean.TRUE);
    }
    public int d(Object p0,b p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "8");
       if (p0 != PatchProxyResult.class) {
          return p0.intValue();
       }
       int intExtra = p1.a().getIntent().getIntExtra("source_photo_action", 0);
       if (intExtra != 1) {
          if (intExtra != 2) {
             if (intExtra != 3) {
                return 0;
             }
          }else {
             return 0x7f08013b;
          }
       }
       return 0x7f08013f;
    }
    public void e(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "5")) {
          return;
       }
       p0 = this.f;
       if (p0 != null) {
          p0.cancel();
       }
       p0 = this.g.iterator();
       while (p0.hasNext()) {
          DownloadManager.n().c(p0.next().intValue());
       }
       this.g.clear();
       return;
    }
    public void f(b p0){
    }
    public void g(Object p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "21")) {
          return;
       }
       p0 = this.a;
       String str = "对口型资源";
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                p0 = (p0 != 7)? "": str;
             }else {
                p0 = "k歌合唱资源";
             }
          }else {
             p0 = "同款资源";
          }
       }else {
          p0 = "同框资源";
       }
       if (this.b == null) {
          str = p0;
       }
       b.c(p1, str);
       return;
    }
    public boolean h(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("SampleProcessor", "isNeedDownload, source:"+p0+" , mPhoto:"+this.e+" , mExportFile:"+this.d, objArray);
       if (p0 == this.e && (this.d == null || !this.d.exists())) {
          i = true;
       }
       return i;
    }
    public String i(Object p0,int p1){
       return a.a(this, p0, p1);
    }
    public CDNUrl[] j(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.r(p0)) {
          return r1.F0(p0);
       }
       p0 = new CDNUrl[0];
       return p0;
    }
    public void k(Object p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "6")) {
          return;
       }
       p0 = this.f;
       if (p0 != null) {
          p0.cancel();
       }
       this.f = null;
       p0 = this.g.iterator();
       while (p0.hasNext()) {
          DownloadManager.n().c(p0.next().intValue());
       }
       this.g.clear();
       if (this.d == null && p1.a() != null) {
          p1.a().finish();
       }
       return;
    }
    public t l(Object p0,b p1){
       Object[] objArray;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, uoc, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       int i = 0;
       this.c = i;
       VideoMeta videoMeta = PatchProxy.applyOneRefs(p0, this, uoc, "13");
       i oi = 2;
       boolean b = true;
       if (videoMeta != patchProxyRe) {
       }else {
          c ta = this.a;
          if (ta != b) {
             if (ta != oi) {
                videoMeta = p0.a(VideoMeta.class).mVideoUrls;
             }else if(PostExperimentUtils.g1()){
                videoMeta = this.u(p0);
             }else {
                videoMeta = p0.a(VideoMeta.class).mVideoUrls;
             }
          }else if(PostExperimentUtils.r1()){
             videoMeta = this.u(p0);
          }else {
             videoMeta = p0.a(VideoMeta.class).mVideoUrls;
          }
       }
       this.m = 0;
       this.d = null;
       this.n = b;
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, uoc, "16")) {
          a uoa = p1.d(a.i);
          if (uoa.d != null && uoa.b != null) {
             this.i = uoa.g;
             this.j = uoa.e;
             this.k = uoa.h;
             this.l = uoa.f;
             this.h = i;
          }else {
             SameFrameInfo sameFrameInf = PatchProxy.applyOneRefs(p0, this, uoc, "17");
             if (sameFrameInf != patchProxyRe) {
             }else if(this.a == b && p0.a(PhotoMeta.class).mSameFrameInfo != null){
                sameFrameInf = p0.a(PhotoMeta.class).mSameFrameInfo.mLrcUrls;
             }else if(this.a == oi && p0.a(PhotoMeta.class).mFollowShootModel != null){
                sameFrameInf = p0.a(PhotoMeta.class).mFollowShootModel.mLrcUrls;
             }else {
                sameFrameInf = null;
             }
             if (!q.f(sameFrameInf)) {
                this.i = e0.a(sameFrameInf, null);
                this.j = b.a(0x5f2ddeb4).get(a0.c(this.i[i]));
             }
             this.h = b;
          }
       }
       t ot = PatchProxy.applyTwoRefs(videoMeta, p0, this, uoc, "12");
       if (ot != patchProxyRe) {
       }else {
          ot = t.create(new c(this, videoMeta, p0));
       }
       p0 = ot.retry(new l(this, videoMeta)).doOnNext(new h(this));
       ot = PatchProxy.apply(null, this, uoc, "18");
       if (ot != patchProxyRe) {
       }else if(this.i == null || !this.i.length){
          objArray1 = new Object[i];
          a.D().w("SampleProcessor", "has no lyric.", objArray1);
          ot = t.just(Float.valueOf(a.i));
       }else if(this.j != null && this.j.exists()){
          objArray1 = new Object[i];
          a.D().w("SampleProcessor", "LrcFile is exists.", objArray1);
          ot = t.just(Float.valueOf(a.i));
       }else {
          objArray1 = new Object[i];
          a.D().w("SampleProcessor", "downloadLyric", objArray1);
          ot = this.s(this.i, this.j);
       }
       ot = ot.onErrorResumeNext(new i(this));
       t ot1 = PatchProxy.apply(null, this, uoc, "19");
       if (ot1 != patchProxyRe) {
       }else {
          c tk = this.k;
          if (tk == null || !tk.length) {
             objArray = new Object[i];
             a.D().w("SampleProcessor", "has no accompany.", objArray);
             ot1 = t.just(Float.valueOf(a.i));
          }else {
             tk = this.l;
             if (tk != null && tk.exists()) {
                objArray = new Object[i];
                a.D().w("SampleProcessor", "AccompanyFile is exists.", objArray);
                ot1 = t.just(Float.valueOf(a.i));
             }else {
                objArray = new Object[i];
                a.D().w("SampleProcessor", "downloadAccompany", objArray);
                ot1 = this.s(this.k, this.l);
             }
          }
       }
       return t.merge(p0, ot, ot1).map(new j(this)).doOnError(new g(this)).doOnComplete(new f(this));
    }
    public boolean m(){
       return this.n;
    }
    public t n(Object p0,b p1){
       String id;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (!this.r(p0)) {
          return t.error(new SampleDownloadException("don\'t support "+p0));
       }
       boolean b = false;
       this.b = p1.a().getIntent().getBooleanExtra("isGoToLipSync", b);
       this.a = p1.a().getIntent().getIntExtra("source_photo_action", b);
       if (TextUtils.x(p0.getId())) {
          return t.error(new SampleDownloadException("feed id isEmpty"));
       }
       Object[] objArray = new Object[b];
       a.D().w("SampleProcessor", "obtain feed:"+p0.getId(), objArray);
       id = p0.getId();
       obj = PatchProxy.applyOneRefs(id, null, g.class, "4");
       if (obj != patchProxyRe) {
       }else {
          obj = g.e(id, null).map(e.b);
       }
       return obj.doOnNext(a.b).onErrorResumeNext(new k(this, p0));
    }
    public String o(Object p0,int p1,boolean p2){
       if (PatchProxy.isSupport(c.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, c.class, "10");
          if (p0 != PatchProxyResult.class) {
             return p0;
          }
       }
       p0 = a1.p(R.string.arg_RES_7f103de5);
       if (a.e()) {
          p0 = p0+" ";
       }
       Object[] objArray = new Object[]{Integer.valueOf(p1)};
       return p0+(String.format(a1.p(0x7f10375e), objArray)).replaceAll("\\p{P}", "")+"%";
    }
    public c p(Object p0){
       return a.c(this, p0);
    }
    public t q(Object p0,b p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "2");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!this.r(p0)) {
          return t.error(new SampleDownloadException("don\'t support "+p0));
       }
       Object[] objArray = new Object[0];
       a.D().w("SampleProcessor", "check", objArray);
       QPhoto qPhoto = new QPhoto(p0);
       if (!qPhoto.isPublic() && !qPhoto.isMine()) {
          return t.error(new SampleDownloadException("checkFeed is not public"));
       }
       c ta = this.a;
       boolean b = true;
       if (ta != b) {
          if (ta != 2 && (ta == 7 && !a.a(qPhoto.disableFollowShoot(), qPhoto.isVideoAndNotKtv()))) {
             return t.error(new SampleDownloadException("photo is not all follow shoot"));
          }
       }else if(!o.a(qPhoto, b)){
          return t.error(new SampleDownloadException("photo is not all sameFrame"));
       }
       return t.just(p0);
    }
    public boolean r(Object p0){
       return p0 instanceof VideoFeed;
    }
    public final t s(String[] p0,File p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.create(new e(this, p0, p1));
    }
    public final String t(){
       String str;
       c ta = this.a;
       if (ta != 1) {
          if (ta != 2) {
             if (ta != 3) {
                if (ta != 6) {
                   str = (ta != 8)? "post_re_edit": "post_magic_plc";
                }else {
                   str = "post_recreation";
                }
             }else {
                str = "post_mv_chorus";
             }
          }else {
             str = "post_follow_shoot";
          }
       }else {
          str = "post_same_frame";
       }
       return str;
    }
    public final CDNUrl[] u(BaseFeed p0){
       VideoMeta obj = PatchProxy.applyOneRefs(p0, this, c.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.D().w("SampleProcessor", "use h265 url .", objArray);
       obj = p0.a(VideoMeta.class).mH265Urls;
       if (obj == null || !obj.length) {
          obj = p0.a(VideoMeta.class).mVideoUrls;
       }
       return obj;
    }
}
