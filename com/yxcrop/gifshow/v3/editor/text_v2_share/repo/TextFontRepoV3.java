package com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3;
import java.lang.Object;
import crd.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3$fontConfigFetcher$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3$fontDownloader$2;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Integer;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Iterator;
import java.lang.Iterable;
import bod.a;
import com.yxcorp.gifshow.postfont.repo.FontDownloadHelper;
import kotlin.jvm.internal.a;
import bod.b;
import brd.v;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.ArrayList;
import java.util.Collection;
import brd.g;
import com.yxcorp.gifshow.postfont.repo.RemoteFontRepo;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import brd.t;
import t45.d;
import brd.z;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3$a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.repo.TextFontRepoV3$b;
import erd.g;
import crd.b;

public final class TextFontRepoV3	// class@000bdf
{
    public final a a;
    public final p b;
    public final p c;
    public final CopyOnWriteArrayList d;
    public Integer e;

    public void TextFontRepoV3(){
       super();
       this.a = new a();
       this.b = s.c(TextFontRepoV3$fontConfigFetcher$2.INSTANCE);
       this.c = s.c(TextFontRepoV3$fontDownloader$2.INSTANCE);
       this.d = new CopyOnWriteArrayList();
       this.e = Integer.valueOf(0);
    }
    public final boolean a(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextFontRepoV3.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          if (!iterator.next().c()) {
             break ;
          }
       }
       return false;
    }
    public final FontDownloadHelper b(){
       Object obj = PatchProxy.apply(null, this, TextFontRepoV3.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public final a c(String p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, TextFontRepoV3.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          obj = this.d.iterator();
          while (obj.hasNext()) {
             a uoa = obj.next();
             if (a.g(uoa.getId(), p0)) {
                a.o(uoa, "it");
                b.a(uoa);
                return uoa;
             }
          }
       }
       return null;
    }
    public synchronized final void d(v p0,Integer p1){
       TextFontRepoV3 textFontRepo = TextFontRepoV3.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, textFontRepo, "3")) {
          return;
       }
       a.p(p0, "emitter");
       Object[] objArray = new Object[0];
       a.D().w("TextFontRepo", "loadFontConfig groupType:"+p1+", lastGroupType:"+this.e, objArray);
       if (this.d.size() > 0 && a.g(this.e, p1)) {
          Object[] objArray1 = new Object[0];
          a.D().w("TextFontRepo", "loadFontConfig from cache: "+this.d.size(), objArray1);
          Iterator iterator = this.d.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             a.o(uoa, "it");
             b.a(uoa);
          }
          p0.onNext(new ArrayList(this.d));
          p0.onComplete();
          return;
       }else {
          this.e = p1;
          TextFontRepoV3 ta = this.a;
          Object obj = PatchProxy.apply(null, this, textFontRepo, "1");
          if (obj == PatchProxyResult.class) {
             obj = this.b.getValue();
          }
          ta.c(obj.a(CachePolicy.CACHE_ELSE_NETWORK, p1).subscribeOn(d.c).observeOn(d.a).subscribe(new TextFontRepoV3$a(this, p0), new TextFontRepoV3$b(p0)));
          return;
       }
    }
}
