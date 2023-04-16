package knd.m;
import java.lang.Object;
import jb7.a;
import com.yxcrop.gifshow.v3.editor.text_v2.model.TTSVoiceModelV2;
import java.lang.String;
import java.lang.Class;
import com.kwai.middleware.resourcemanager.ResourceSdk;
import kb7.a;
import jb7.b;
import jod.e;
import java.util.List;
import nsd.u;
import knd.h;
import android.app.Application;
import o56.a;
import kotlin.jvm.internal.a;
import android.content.Context;
import knd.k;
import rwc.j;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import faa.a;
import q87.c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.StringBuilder;
import com.kwai.video.stannis.Stannis;
import com.kwai.chat.sdk.signal.f;
import j85.e;
import knd.j;
import zt7.d;
import java.io.FileOutputStream;
import java.io.File;
import crd.b;
import brd.v;
import knd.m$a;
import java.util.Iterator;
import java.lang.Iterable;
import jod.d;
import wnd.g;
import knd.k$b;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$a;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$PostTaskState;
import com.yxcorp.gifshow.v3.editor.PostTaskManager;
import com.kwai.robust.PatchProxyResult;
import brd.a0;
import t45.d;
import brd.z;
import knd.l;
import erd.a;
import knd.n;
import erd.o;
import knd.o;
import knd.p;
import erd.g;
import msd.l;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import brd.t;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import knd.m$b;
import knd.m$c;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTTSInfo;
import knd.m$d;
import java.lang.Boolean;
import brd.g;
import com.yxcorp.gifshow.player.KsAudioPlayer;
import knd.i;
import com.yxcorp.gifshow.player.KsAudioPlayer$c;
import wnc.a;
import w46.b;
import knd.j$a;
import com.kwai.video.stannis.observers.DataReadyObserver;

public final class m	// class@0017f4
{
    public final a a;
    public final b b;
    public final e c;
    public final h d;
    public final k e;
    public b f;
    public j g;

    public void m(){
       super();
       a uoa = new a("TTS", 1, TTSVoiceModelV2.class);
       this.a = uoa;
       this.b = ResourceSdk.d(ResourceSdk.f, uoa, null, 2, null);
       e uoe = new e("", null, -1, -1, 2, null);
       this.c = uoa;
       Application uApplication = a.b();
       a.o(uApplication, "AppEnv.getAppContext\(\)");
       this.d = new h(uApplication);
       this.e = new k();
       this.g = new j(null);
    }
    public final void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, m.class, "5")) {
          return;
       }
       m te = this.e;
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoid(objArray, te, k.class, "7")) {
          Object[] objArray1 = new Object[0];
          a.D().w("TTSDownloadManagerV2", "cancel: ", objArray1);
          te.i.set(true);
       }
       this.c();
       return;
    }
    public final void b(){
       h f;
       String str = "2";
       if (PatchProxy.applyVoid(null, this, m.class, str)) {
          return;
       }
       m td = this.d;
       Objects.requireNonNull(td);
       String str1 = "destroy: ";
       if (!PatchProxy.applyVoid(null, td, h.class, "7")) {
          Object[] objArray1 = new Object[0];
          a.D().w("TTSAuditionManagerV2", str1+td, objArray1);
          td.n();
          td.o();
          f = td.f;
          String str2 = "mStannis";
          if (f == null) {
             a.S(str2);
          }
          f.clearAllAudioBuffer();
          f = td.f;
          if (f == null) {
             a.S(str2);
          }
          f.uninitStannisEngine(td.g);
          f.e().w(td.e());
          td.f().p();
          td.f().a();
          td.m = null;
          td.i = null;
          td.c = null;
          td.k(null);
       }
       td = this.e;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoid(null, td, k.class, str)) {
          Object[] objArray = new Object[0];
          a.D().w("TTSDownloadManagerV2", str1+td, objArray);
          f.e().w(td.e());
          td.f().p();
          if (!td.f().c()) {
             td.f().h();
             File uFile = td.c();
             a.m(uFile);
             td.b(td.d(), uFile);
          }
          td.f().a();
          td.j = null;
          td.i.set(0);
          td.g = null;
          td.m();
       }
       this.c();
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, m.class, "10")) {
          return;
       }
       m tf = this.f;
       if (tf != null && !tf.isDisposed()) {
          tf.dispose();
       }
       return;
    }
    public final void d(v p0,List p1){
       m om = m.class;
       k ok = k.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, om, "6")) {
          return;
       }
       a.p(p0, "emitter");
       a.p(p1, "taskDataList");
       this.d.n();
       m te = this.e;
       Objects.requireNonNull(te);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, te, ok, "9")) {
          Object[] objArray4 = new Object[0];
          a.D().w("TTSDownloadManagerV2", "resetTTS: ", objArray4);
          te.f().h();
       }
       te = this.e;
       m$a uoa = new m$a(this, p0);
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoidOneRefs(uoa, te, ok, "10")) {
          Object[] objArray3 = new Object[0];
          a.D().w("TTSDownloadManagerV2", "setTTSListener", objArray3);
          te.h = uoa;
       }
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          d uod = iterator.next();
          m te1 = this.e;
          Objects.requireNonNull(te1);
          if (PatchProxy.applyVoidOneRefs(uod, te1, ok, "3")) {
             continue ;
          }
          a.p(uod, "taskData");
          Object[] objArray1 = new Object[0];
          a.D().w("TTSDownloadManagerV2", "startTtsDownloadTask: taskData = "+uod, objArray1);
          te1.i.set(0);
          te1.f.b(new k$b(te1, g.a.b(uod.d(), uod.c(), uod.g()), uod));
       }
       this.c();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = PatchProxy.applyTwoRefs(p0, p1, this, om, "7");
       if (uob != patchProxyRe) {
       }else {
          om = this.e;
          Objects.requireNonNull(om);
          a0 uoa0 = PatchProxy.apply(objArray, om, ok, "4");
          if (uoa0 != patchProxyRe) {
          }else {
             Object[] objArray2 = new Object[0];
             a.D().w("TTSDownloadManagerV2", "waitAllTaskComplete: ", objArray2);
             uoa0 = om.f.j().G(d.a).m(l.b);
             a.o(uoa0, "mPostTaskManager.waitAll¡­ download task finish\"\) }");
          }
          uob = uoa0.C(new n(this, p1)).R(new o(this, p0, p1), new p(p0));
          a.o(uob, "mTTSDownloadManager.wait¡­ror\(throwable\)\n        }\)");
       }
       this.f = uob;
       return;
    }
    public final j e(){
       return this.g;
    }
    public final void f(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "11")) {
          return;
       }
       a.p(p0, "consumer");
       this.b.a(CachePolicy.CACHE_THEN_NETWORK).observeOn(d.a).subscribe(new m$b(this, p0), new m$c(p0));
       return;
    }
    public final void g(v p0,String p1,DraftTTSInfo p2){
       Object[] objArray1;
       h h;
       h oh = h.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, m.class, "4")) {
          return;
       }
       a.p(p0, "emitter");
       String str = "text";
       a.p(p1, str);
       a.p(p2, "draftTTSInfo");
       this.d.n();
       m td = this.d;
       m$d uod = new m$d(p0);
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoidOneRefs(uod, td, oh, "11")) {
          Object[] objArray5 = new Object[0];
          a.D().w("TTSAuditionManagerV2", "setTtsListener", objArray5);
          td.l = uod;
       }
       if (g.a.g(p2.d(), p2.c())) {
          p0.onNext(Boolean.TRUE);
          p0.onComplete();
       }else {
          m td1 = this.d;
          Objects.requireNonNull(td1);
          if (!PatchProxy.applyVoidTwoRefs(p1, p2, td1, oh, "9")) {
             a.p(p1, str);
             a.p(p2, "taskData");
             Object[] objArray = new Object[0];
             a.D().w("TTSAuditionManagerV2", "startAudition taskData = "+p2, objArray);
             td1.n();
             td1.d = ((float)p2.g() * 0x3f800000) / (float)200;
             if (td1.h(p2.b())) {
                objArray1 = new Object[0];
                a.D().w("TTSAuditionManagerV2", "startAudition: using KSAudioPlayer", objArray1);
                File uFile = td1.c();
                a.m(uFile);
                KsAudioPlayer ksAudioPlaye = new KsAudioPlayer(uFile.getAbsolutePath(), 0, Integer.MAX_VALUE, td1.g());
                td1.h = ksAudioPlaye;
                ksAudioPlaye.r(new i(td1));
                h = td1.h;
                if (h != null) {
                   h.v();
                }
             }else if(!a.a()){
                objArray1 = new Object[0];
                a.D().t("TTSAuditionManagerV2", "startAudition :network disconnected", objArray1);
                h = td1.l;
                if (h != null) {
                   h.b();
                }
             }else {
                Object[] objArray2 = new Object[0];
                a.D().w("TTSAuditionManagerV2", "startAudition: using stannis", objArray2);
                td1.k = true;
                Object[] objArray3 = null;
                if (!PatchProxy.applyVoid(objArray3, td1, oh, "2")) {
                   int i = 1280;
                   h f = td1.f;
                   if (f == null) {
                      a.S("mStannis");
                   }
                   i = f.startPipeline(i, td1.j, td1.i);
                   if (i) {
                      Object[] objArray4 = new Object[0];
                      a.D().w("TTSAuditionManagerV2", "startPipeline failed! result="+i, objArray4);
                   }
                }
                File uFile1 = td1.c();
                a.m(uFile1);
                td1.k(td1.i(uFile1));
                if (!PatchProxy.applyVoid(objArray3, td1, oh, "8")) {
                   objArray3 = new Object[0];
                   a.D().w("TTSAuditionManagerV2", "resetTTS: ", objArray3);
                   td1.f().h();
                }
                td1.f().n(p2.d());
                td1.f().m(p2.c());
                td1.f().g(p1);
             }
          }
       }
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       this.d.n();
       return;
    }
}
