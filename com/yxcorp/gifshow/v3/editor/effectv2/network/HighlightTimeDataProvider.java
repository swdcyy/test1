package com.yxcorp.gifshow.v3.editor.effectv2.network.HighlightTimeDataProvider;
import mn9.b;
import com.yxcorp.gifshow.v3.editor.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.effectv2.network.HighlightTimeDataProvider$highlightTimeRepo$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import mn9.a;
import hqc.d;
import hqc.f;
import java.util.Collection;
import brd.v;
import iqc.q;
import java.util.Objects;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import brd.t;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import t45.d;
import brd.z;
import iqc.o;
import iqc.p;
import erd.g;
import crd.b;
import mn9.b$a;
import java.lang.Boolean;
import java.lang.IllegalAccessException;
import java.lang.Throwable;
import w46.b;
import iqc.e;
import iqc.f;
import voc.i;
import kotlin.Pair;
import eb7.a;
import iqc.e$a;
import iqc.g;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import gb7.c;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper;
import hqc.g;
import com.yxcorp.gifshow.v3.editor.effectv2.data.HTParam;
import uqc.b;
import com.yxcorp.gifshow.postfont.repo.FontDownloadHelper;

public final class HighlightTimeDataProvider implements b	// class@000f54
{
    public final p a;
    public i b;

    public void HighlightTimeDataProvider(i p0){
       a.p(p0, "editorHelperContract");
       super();
       this.b = p0;
       this.a = s.c(new HighlightTimeDataProvider$highlightTimeRepo$2(this));
    }
    public List a(List p0,Object p1){
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, HighlightTimeDataProvider.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "itemList");
       a.p(p1, "payload");
       Object[] objArray = new Object[0];
       a.D().w("HighlightTimeDataProvider", "traverseAll payload:"+p1, objArray);
       if (!a.g(p1, Integer.valueOf(1))) {
          return p0;
       }
       p1 = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          obj = iterator.next();
          if (obj instanceof d) {
             obj.n().p("");
          }
          p1.add(obj);
       }
       return p1;
    }
    public void b(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HighlightTimeDataProvider.class, "2")) {
          return;
       }
       String str = "emitter";
       a.p(p0, str);
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("HighlightTimeDataProvider", "loadDataList", objArray);
       q oq = this.j();
       Objects.requireNonNull(oq);
       if (!PatchProxy.applyVoidOneRefs(p0, oq, q.class, "1")) {
          a.p(p0, str);
          Object[] objArray1 = new Object[i];
          a.D().w("HighlightTimeRepo", "loadDataList networkFirst:"+oq.d, objArray1);
          q b = oq.b;
          CachePolicy nETWORK_ELSE = (oq.d != null)? CachePolicy.NETWORK_ELSE_CACHE: CachePolicy.CACHE_ONLY;
          b.a(nETWORK_ELSE).subscribeOn(d.c).subscribe(new o(oq, p0), new p(p0));
       }
       return;
    }
    public void c(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HighlightTimeDataProvider.class, "12")) {
          return;
       }
       a.p(p0, "emitter");
       b$a.e(this, p0);
       return;
    }
    public boolean d(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HighlightTimeDataProvider.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "item");
       return this.k(p0);
    }
    public boolean e(a p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, HighlightTimeDataProvider.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "item");
       Object[] objArray = new Object[0];
       a.D().w("HighlightTimeDataProvider", "isItemReady extraData:"+p1, objArray);
       return this.k(p0);
    }
    public void f(a p0,v p1){
       Object obj = p0;
       Pair obj1 = p1;
       String str = "3";
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, this, HighlightTimeDataProvider.class, str)) {
          return;
       }
       a.p(obj, "item");
       String str1 = "emitter";
       a.p(obj1, str1);
       String str2 = "HighlightTimeDataProvider";
       int i = 0;
       if (!obj instanceof d) {
          Object[] objArray = new Object[i];
          a.D().u(str2, new IllegalAccessException("item is not HighlightTimeAdvEffect"), objArray);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          a.D().w(str2, "loadDataItem no extra data", objArray1);
          d uod = this.j();
          Objects.requireNonNull(uod);
          if (!PatchProxy.applyVoidTwoRefs(obj, obj1, uod, q.class, "2")) {
             str2 = "highlightTimeAdvEffect";
             a.p(obj, str2);
             a.p(obj1, str1);
             Object[] objArray2 = new Object[i];
             a.D().w("HighlightTimeRepo", "loadDataItem", objArray2);
             q c = uod.c;
             Objects.requireNonNull(c);
             if (!PatchProxy.applyVoidTwoRefs(obj, obj1, c, e.class, "5")) {
                a.p(obj, str2);
                a.p(obj1, str1);
                objArray2 = new Object[i];
                a.D().w("HighlightTimeDownloadHelper", "download highlightTimeAdvEffect:"+obj, objArray2);
                f uof = new f(c, obj1, obj);
                uof.a("FONT_TASK", i, 4);
                uof.a("HIGHLIGHT_TASK", i, 2);
                uof.a("TEMPLATE_TASK", i, 10);
                uof.a("HIGHLIGHT_PARSE_TASK", i, 1);
                if (!PatchProxy.applyVoidTwoRefs(obj, uof, c, e.class, "6")) {
                   obj1 = c.c(obj.n());
                   Object[] objArray3 = new Object[i];
                   a.D().w("HighlightTimeDownloadHelper", "downloadHighlight preResult"+obj1, objArray3);
                   if (!obj1.getFirst().booleanValue()) {
                      Object[] objArray4 = new Object[i];
                      a.D().w("HighlightTimeDownloadHelper", "downloadHighlight template downloaded", objArray4);
                      obj.n().m(obj1.getSecond());
                      i.h(uof, "HIGHLIGHT_TASK", 100, 0, 4, null);
                      c.e(obj, uof);
                   }else {
                      f uof1 = obj.n();
                      a uoa = PatchProxy.apply(null, c, e.class, str);
                      if (uoa == PatchProxyResult.class) {
                         uoa = c.c.getValue();
                      }
                      uoa.d(new e$a(uof1), new g(c, uof, uof1, obj));
                   }
                }
             }
          }
          return;
       }
    }
    public void g(v p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HighlightTimeDataProvider.class, "9")) {
          return;
       }
       a.p(p0, "emitter");
       a.p(p1, "payload");
       b$a.d(this, p0, p1);
       return;
    }
    public void h(a p0,Object p1,v p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, HighlightTimeDataProvider.class, "10")) {
          return;
       }
       a.p(p0, "item");
       a.p(p2, "emitter");
       b$a.c(this, p0, p1, p2);
       return;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, HighlightTimeDataProvider.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public final i i(){
       return this.b;
    }
    public final q j(){
       Object obj = PatchProxy.apply(null, this, HighlightTimeDataProvider.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final boolean k(a p0){
       boolean b;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d obj = PatchProxy.applyOneRefs(p0, this, HighlightTimeDataProvider.class, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       a.D().w("HighlightTimeDataProvider", "isItemReady item:"+p0, objArray);
       if (!p0 instanceof d) {
          return 0;
       }
       obj = this.j();
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, q.class, "4");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          a.p(p0, "item");
          if (obj.c.c(p0.n()).getFirst().booleanValue()) {
             objArray1 = new Object[0];
             a.D().w("HighlightTimeRepo", "needDownloadResource needDownloadHighlight", objArray1);
          }else {
             boolean b1 = obj.c.d(p0.n());
             if (b1) {
                objArray1 = new Object[0];
                a.D().w("HighlightTimeRepo", "needDownloadResource needParseHighlight", objArray1);
             }else {
                q c = obj.c;
                String str = p0.n().d().a().b();
                Objects.requireNonNull(c);
                Pair pair = PatchProxy.applyOneRefs(str, c, e.class, "13");
                if (pair != patchProxyRe) {
                }else {
                   a.p(str, "fontId");
                   pair = b.a.a(str, c.b());
                }
                pair.getFirst().booleanValue();
                Objects.requireNonNull(obj.c);
                Object[] objArray2 = new Object[0];
                a.D().w("HighlightTimeRepo", "needDownloadResource needDownloadFont:"+b1+", needGenerateKuaishanEffectVideo:"+true, objArray2);
             }
          }
          b = true;
       }
       if (!b) {
          return true;
       }else {
          return 0;
       }
    }
}
