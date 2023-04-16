package com.yxcorp.gifshow.v3.editor.music_v2.network.LyricRepo;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricRepo$a;
import nsd.u;
import java.lang.Object;
import crd.a;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricMaterialConfigHelper;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricMaterialDownloadHelper;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricRepo$pendingEmitterList$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mn9.a;
import brd.v;
import kotlin.jvm.internal.a;
import src.g;
import java.util.Objects;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Integer;
import brd.t;
import d0c.a;
import com.yxcorp.gifshow.postfont.repo.FontDownloadHelper;
import t45.d;
import brd.z;
import trc.p;
import erd.o;
import com.yxcorp.gifshow.v3.editor.music_v2.network.LyricAEResourceDownloader;
import trc.q;
import brd.w;
import trc.m;
import trc.n;
import trc.o;
import erd.g;
import erd.a;
import crd.b;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.concurrent.CopyOnWriteArrayList;
import com.yxcorp.utility.Log;
import java.util.List;
import java.util.Collection;
import java.lang.Boolean;
import com.yxcorp.gifshow.postfont.repo.RemoteFontRepo;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import jb7.b;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import e0c.d;
import trc.k;
import trc.t;
import trc.u;
import brd.g;

public final class LyricRepo	// class@0010ac
{
    public final a a;
    public final LyricMaterialConfigHelper b;
    public final LyricMaterialDownloadHelper c;
    public final List d;
    public boolean e;
    public final p f;
    public static boolean g;
    public static String h;
    public static final LyricRepo$a i;

    static {
       LyricRepo.i = new LyricRepo$a(null);
       LyricRepo.h = "";
    }
    public void LyricRepo(){
       super();
       this.a = new a();
       this.b = new LyricMaterialConfigHelper();
       this.c = new LyricMaterialDownloadHelper();
       this.d = new ArrayList();
       this.f = s.c(LyricRepo$pendingEmitterList$2.INSTANCE);
    }
    public void LyricRepo(u p0){
       super();
       this.a = new a();
       this.b = new LyricMaterialConfigHelper();
       this.c = new LyricMaterialDownloadHelper();
       this.d = new ArrayList();
       this.f = s.c(LyricRepo$pendingEmitterList$2.INSTANCE);
    }
    public static final LyricRepo b(){
       Object obj = PatchProxy.apply(null, null, LyricRepo.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LyricRepo.i.b();
    }
    public final void a(a p0,v p1){
       t ot;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LyricRepo.class, "7")) {
          return;
       }
       String str = "item";
       a.p(p0, str);
       String str1 = "emitter";
       a.p(p1, str1);
       LyricRepo tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, tc, LyricMaterialDownloadHelper.class, "1")) {
          a.p(p0, str);
          a.p(p1, str1);
          Object[] objArray = new Object[0];
          a.D().w("LyricMaterialDownloadHelper", "download item: "+p0, objArray);
          int i = 200;
          if (p0.k()) {
             ot = t.just(Integer.valueOf(i));
          }else {
             a uoa = p0.j();
             ot = (uoa == null)? t.just(Integer.valueOf(-2)): tc.b.a(uoa).subscribeOn(d.c).observeOn(d.a);
          }
          ot = ot.map(new p(tc));
          t ot1 = (p0.b())? t.just(Integer.valueOf(i)): tc.a.a(p0).subscribeOn(d.c).observeOn(d.a);
          tc.c.c(t.concat(ot, ot1.map(new q(tc))).subscribe(new m(p1), new n(p1), new o(p0, p1)));
       }
       return;
    }
    public final g c(String p0){
       g og;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, LyricRepo.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "styleId");
       obj = this.d.iterator();
       do {
          if (obj.hasNext()) {
          }else {
             og = null;
             break ;
          }
          og = obj.next();
       } while (a.g(og.r(), p0));
       return og;
    }
    public final CopyOnWriteArrayList d(){
       Object obj = PatchProxy.apply(null, this, LyricRepo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public final void e(v p0){
       t ot;
       LyricRepo lyricRepo = LyricRepo.class;
       String str = "3";
       if (PatchProxy.applyVoidOneRefs(p0, this, lyricRepo, str)) {
          return;
       }
       a.p(p0, "emitter");
       String str1 = "LyricRepo";
       Log.b(str1, "loadLyricConfig with emitter: "+p0);
       this.d().add(p0);
       if (this.e != null) {
          Log.b(str1, "loadLyricConfig: isFetching return");
          return;
       }else if(this.d.size() > 0){
          Log.b(str1, "loadLyricConfig: use localCache, size: "+this.d.size());
          this.f(new ArrayList(this.d));
          return;
       }else {
          Log.b(str1, "loadLyricConfig: start fetch");
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, this, lyricRepo, "4")) {
             boolean b = true;
             this.e = b;
             LyricRepo ta = this.a;
             LyricRepo tb = this.b;
             Objects.requireNonNull(tb);
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             LyricMaterialConfigHelper lyricMateria = LyricMaterialConfigHelper.class;
             if (PatchProxy.isSupport(lyricMateria)) {
                ot = PatchProxy.applyOneRefs(Boolean.TRUE, tb, lyricMateria, str);
                if (ot != patchProxyRe) {
                label_00ee :
                   ta.c(ot.subscribe(new t(this), new u(this)));
                }
             }
             RemoteFontRepo remoteFontRe = PatchProxy.apply(objArray, tb, lyricMateria, "1");
             if (remoteFontRe == patchProxyRe) {
                remoteFontRe = tb.a.getValue();
             }
             Objects.requireNonNull(remoteFontRe);
             RemoteFontRepo remoteFontRe1 = RemoteFontRepo.class;
             if (PatchProxy.isSupport(remoteFontRe1)) {
                ot = PatchProxy.applyOneRefs(Boolean.TRUE, remoteFontRe, remoteFontRe1, "8");
                if (ot != patchProxyRe) {
                label_00da :
                   ot = ot.observeOn(d.a).flatMap(new k(tb, b));
                   a.o(ot, "remoteFontRepo.fetchConf¡­st\)\n          }\n        }");
                   goto label_00ee ;
                }
             }
             ot = remoteFontRe.d().a(CachePolicy.NETWORK_ELSE_CACHE).observeOn(d.a).map(new d(remoteFontRe));
             a.o(ot, "resourceManager.fetch\(ca¡­     fontConfigList\n    }");
             goto label_00da ;
          }
          return;
       }
    }
    public final void f(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LyricRepo.class, "5")) {
          return;
       }
       Iterator iterator = this.d().iterator();
       while (iterator.hasNext()) {
          v ov = iterator.next();
          ov.onNext(p0);
          ov.onComplete();
       }
       this.d().clear();
       return;
    }
    public final void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LyricRepo.class, "8")) {
          return;
       }
       this.a.dispose();
       LyricRepo tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(objArray, tc, LyricMaterialDownloadHelper.class, "2")) {
          Object[] objArray1 = new Object[0];
          a.D().w("LyricMaterialDownloadHelper", "stop", objArray1);
          tc.c.dispose();
       }
       return;
    }
}
