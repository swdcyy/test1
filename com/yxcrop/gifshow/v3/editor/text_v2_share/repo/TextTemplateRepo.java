package com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo$a;
import nsd.u;
import java.lang.Object;
import crd.a;
import java.util.concurrent.atomic.AtomicBoolean;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo$textConfigHelper$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo$textDownloadHelper$2;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.HashMap;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo$pendingEmitterList$2;
import orc.f;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.edit.draft.FeatureId$b;
import com.kuaishou.edit.draft.FeatureId;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import java.util.Map;
import mn9.a;
import brd.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateDownloadHelper;
import bod.d;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import d0c.a;
import java.lang.Integer;
import brd.t;
import com.yxcorp.gifshow.postfont.repo.FontDownloadHelper;
import t45.d;
import brd.z;
import lod.s;
import erd.o;
import nuc.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.Sk2cResourceDownloader;
import lod.c;
import io.reactivex.g;
import lod.d;
import erd.g;
import lod.t;
import lod.r;
import brd.w;
import lod.o;
import lod.p;
import lod.q;
import erd.a;
import crd.b;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams;
import java.util.Iterator;
import java.lang.Iterable;
import wnd.h;
import java.lang.Number;
import quc.b;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import bod.c;
import lod.m;
import wnd.j;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo$b;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo$c;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo$d;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateConfigHelper;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo$e;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextTemplateRepo$f;
import java.lang.Throwable;
import brd.g;
import java.util.List;

public final class TextTemplateRepo	// class@000bf7
{
    public final a a;
    public final a b;
    public final AtomicBoolean c;
    public final p d;
    public final p e;
    public final CopyOnWriteArrayList f;
    public final HashMap g;
    public boolean h;
    public final p i;
    public boolean j;
    public static final TextTemplateRepo$a k;

    static {
       TextTemplateRepo.k = new TextTemplateRepo$a(null);
    }
    public void TextTemplateRepo(){
       super();
       this.a = new a();
       this.b = new a();
       this.c = new AtomicBoolean(false);
       this.d = s.c(TextTemplateRepo$textConfigHelper$2.INSTANCE);
       this.e = s.c(TextTemplateRepo$textDownloadHelper$2.INSTANCE);
       this.f = new CopyOnWriteArrayList();
       this.g = new HashMap();
       this.i = s.c(TextTemplateRepo$pendingEmitterList$2.INSTANCE);
       f a = f.a;
       a.o(a, "TextIdFeatureIdConverter.TEXT_ID_FEATURE_ID_MAP");
       FeatureId$b uob = FeatureId.newBuilder();
       uob.a("shadow_01");
       a.put("shadow_01", uob.build());
    }
    public final void a(a p0,boolean p1,v p2){
       t ot;
       t ot1;
       Object obj = p0;
       boolean b = p1;
       Object obj1 = p2;
       if (PatchProxy.isSupport(TextTemplateRepo.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, TextTemplateRepo.class, "7")) {
          return;
       }
       a.p(obj, "item");
       a.p(obj1, "emitter");
       Object[] objArray = new Object[0];
       a.D().w("TextTemplateRepo", "downloadTextTemplate item = "+obj+", downloadFont = "+b, objArray);
       d uod = this.f();
       Objects.requireNonNull(uod);
       if (!PatchProxy.isSupport(TextTemplateDownloadHelper.class) || !PatchProxy.applyVoidThreeRefs(obj, Boolean.valueOf(p1), p2, uod, TextTemplateDownloadHelper.class, "3")) {
          a.p(obj, "item");
          a.p(obj1, "emitter");
          objArray = new Object[0];
          a.D().w("TextTemplateDownloadHelper", "download item: "+obj, objArray);
          Integer integer = -2;
          int i = 200;
          if (!b || obj.c()) {
             ot = t.just(Integer.valueOf(i));
          }else {
             a uoa1 = obj.b();
             if (uoa1 == null) {
                ot = t.just(Integer.valueOf(integer));
             }else {
                FontDownloadHelper uFontDownloa = PatchProxy.apply(null, uod, TextTemplateDownloadHelper.class, "2");
                if (uFontDownloa == PatchProxyResult.class) {
                   uFontDownloa = uod.b.getValue();
                }
                ot = uFontDownloa.a(uoa1).subscribeOn(d.c).observeOn(d.a);
             }
          }
          ot = ot.map(new s(uod));
          if (obj.j()) {
             ot1 = t.just(Integer.valueOf(i));
          }else {
             a uoa = obj.k();
             if (uoa.r() == null || uoa.o() == null) {
                ot1 = t.just(Integer.valueOf(integer));
             }else {
                Sk2cResourceDownloader sk2cResource = uod.b();
                uoa = obj.k();
                Objects.requireNonNull(sk2cResource);
                t ot2 = PatchProxy.applyOneRefs(uoa, sk2cResource, Sk2cResourceDownloader.class, "3");
                if (ot2 != PatchProxyResult.class) {
                }else {
                   a.p(uoa, "config");
                   Object[] objArray1 = new Object[0];
                   a.D().w("Sk2cResourceDownloader", "download: "+uoa.r(), objArray1);
                   z c = d.c;
                   ot1 = t.create(new c(sk2cResource, uoa)).subscribeOn(c).observeOn(c);
                   ot2 = ot1.doOnError(d.b);
                   a.o(ot2, "Observable.create { emit¡­on: ${it.message}\"\)\n    }");
                }
                ot1 = ot2.subscribeOn(d.c).observeOn(d.a);
             }
          }
          uod.c.c(t.concat(ot, ot1.map(new t(uod)), t.create(new r(obj)).subscribeOn(d.c).observeOn(d.a)).subscribe(new o(obj1), new p(obj1), new q(obj1)));
       }
       return;
    }
    public final CopyOnWriteArrayList b(){
       Object obj = PatchProxy.apply(null, this, TextTemplateRepo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getValue();
    }
    public final DynamicTextParams c(String p0){
       Object obj1;
       DynamicTextParams uDynamicText;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, TextTemplateRepo.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "textId");
       obj = this.f.iterator();
       while (true) {
          if (obj.hasNext()) {
             obj1 = obj.next();
             if (!a.g(p0, obj1.k().r())) {
                continue ;
             }
          }else {
             obj1 = null;
          }
          if (obj1 != null) {
             uDynamicText = obj1.g();
             if (uDynamicText != null) {
                break ;
             }
          }
          uDynamicText = h.n();
          break ;
       }
       return uDynamicText;
    }
    public final String d(String p0){
       d uod;
       d uod1;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, TextTemplateRepo.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "textId");
       obj = this.f.iterator();
       while (true) {
          uod = null;
          if (obj.hasNext()) {
             uod1 = obj.next();
             if (!a.g(p0, uod1.k().r())) {
                continue ;
             }
          }else {
             uod1 = uod;
          }
          if (uod1 != null) {
             uod = uod1.g;
             break ;
          }
          break ;
       }
       return uod;
    }
    public final int e(String p0){
       Object obj1;
       int i;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, TextTemplateRepo.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.p(p0, "textId");
       obj = this.f.iterator();
       while (true) {
          if (obj.hasNext()) {
             obj1 = obj.next();
             if (!a.g(p0, obj1.k().r())) {
                continue ;
             }
          }else {
             obj1 = null;
          }
          i = (obj1 == null)? 4097: b.a(obj1.k().c(), true);
          break ;
       }
       return i;
    }
    public final TextTemplateDownloadHelper f(){
       Object obj = PatchProxy.apply(null, this, TextTemplateRepo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public final TextDrawConfigParam g(String p0){
       Object obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TextTemplateRepo textTemplate = TextTemplateRepo.class;
       TextDrawConfigParam obj = PatchProxy.applyOneRefs(p0, this, textTemplate, "15");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "textId");
       obj = this.g.get(p0);
       if (obj != null) {
          return obj;
       }
       TextDrawConfigParam textDrawConf = PatchProxy.applyOneRefs(p0, this, textTemplate, "16");
       if (textDrawConf != patchProxyRe) {
       }else {
          Iterator iterator = this.f.iterator();
          while (true) {
             if (iterator.hasNext()) {
                obj1 = iterator.next();
                if (!a.g(p0, obj1.k().r())) {
                   continue ;
                }
             }else {
                obj1 = null;
             }
             if (obj1 == null) {
                obj1 = m.a();
             }
             textDrawConf = j.a.d(p0, obj1);
          }
       }
       if (textDrawConf != null) {
          this.g.put(p0, textDrawConf);
       }
       return textDrawConf;
    }
    public final boolean h(String p0){
       Object obj1;
       boolean b;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, TextTemplateRepo.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "textId");
       obj = this.f.iterator();
       while (true) {
          if (obj.hasNext()) {
             obj1 = obj.next();
             if (!a.g(p0, obj1.k().r())) {
                continue ;
             }
          }else {
             obj1 = null;
          }
          b = (obj1 == null)? true: false;
          break ;
       }
       return b;
    }
    public synchronized final void i(v p0,boolean p1){
       Object[] objArray;
       TextTemplateRepo textTemplate = TextTemplateRepo.class;
       if (PatchProxy.isSupport(textTemplate) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, textTemplate, "4")) {
          return;
       }
       a.p(p0, "emitter");
       this.b().add(p0);
       int i = 0;
       if (this.h != null) {
          objArray = new Object[i];
          a.D().w("TextTemplateRepo", "loadTextTemplateConfig: isFetching return", objArray);
          return;
       }else {
          boolean b = true;
          if (this.f.size() > b && !p1) {
             objArray = new Object[i];
             a.D().w("TextTemplateRepo", "loadTextTemplateConfig: use localCache, size: "+this.f.size(), objArray);
             this.h = b;
             this.a.c(t.create(new TextTemplateRepo$b(this)).subscribeOn(d.c).observeOn(d.a).subscribe(new TextTemplateRepo$c(this), new TextTemplateRepo$d(this)));
             return;
          }else {
             this.h = b;
             objArray = new Object[i];
             a.D().w("TextTemplateRepo", "loadTextTemplateConfig: use network, networkFirst: "+p1, objArray);
             TextTemplateRepo ta = this.a;
             Object obj = PatchProxy.apply(null, this, textTemplate, "1");
             if (obj == PatchProxyResult.class) {
                obj = this.d.getValue();
             }
             ta.c(obj.b(p1).observeOn(d.a).subscribe(new TextTemplateRepo$e(this), new TextTemplateRepo$f(this)));
             return;
          }
       }
    }
    public final void j(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTemplateRepo.class, "6")) {
          return;
       }
       Iterator iterator = this.b().iterator();
       while (iterator.hasNext()) {
          iterator.next().onError(p0);
       }
       this.b().clear();
       return;
    }
    public final void k(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextTemplateRepo.class, "5")) {
          return;
       }
       Iterator iterator = this.b().iterator();
       while (iterator.hasNext()) {
          v ov = iterator.next();
          ov.onNext(p0);
          ov.onComplete();
       }
       this.b().clear();
       return;
    }
    public final void l(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TextTemplateRepo.class, "9")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       String str = "TextTemplateRepo";
       a.D().w(str, "stopPreDownloadIfNeeded", objArray1);
       this.c.set(true);
       if (this.j != null) {
          objArray1 = new Object[0];
          a.D().w(str, "real stopPreDownload", objArray1);
          TextTemplateDownloadHelper textTemplate = this.f();
          Objects.requireNonNull(textTemplate);
          if (!PatchProxy.applyVoid(objArray, textTemplate, TextTemplateDownloadHelper.class, "5")) {
             objArray1 = new Object[0];
             a.D().w("TextTemplateDownloadHelper", "stop", objArray1);
             textTemplate.b().d();
          }
          this.b.dispose();
          this.j = false;
       }
       return;
    }
}
