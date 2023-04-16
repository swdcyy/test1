package com.kuaishou.gifshow.kuaishan.logic.j0;
import io.reactivex.g;
import com.kuaishou.gifshow.kuaishan.logic.KSResourceDownloader;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import mca.a;
import java.lang.String;
import com.kuaishou.gifshow.kuaishan.utils.e;
import java.lang.Integer;
import brd.g;
import java.lang.Throwable;
import com.kwai.feature.post.api.feature.kuaishan.model.KSException;
import java.lang.StringBuilder;
import com.kuaishou.gifshow.kuaishan.logic.k0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import u80.e;
import q87.c;
import java.util.concurrent.ConcurrentHashMap;
import com.kuaishou.gifshow.kuaishan.logic.KSResourceDownloader$b;
import com.yxcorp.gifshow.util.resource.n$c;
import com.yxcorp.gifshow.util.resource.n;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
import boc.b;
import com.yxcorp.gifshow.util.resource.p;
import java.lang.Float;
import java.util.Collection;
import com.yxcorp.gifshow.util.resource.FontCategory;
import com.yxcorp.gifshow.util.resource.CommonCategory;
import com.kwai.framework.plugin.downloader.PluginDownloadExtension;
import java.util.List;
import java.util.ArrayList;
import com.kwai.plugin.dva.Dva;
import x80.v0;
import java.lang.Runnable;
import t45.c;
import x80.u0;
import erd.f;

public final class j0 implements g	// class@001a54
{
    public final KSResourceDownloader b;
    public final KSTemplateDetailInfo c;

    public void j0(KSResourceDownloader p0,KSTemplateDetailInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       Iterator iterator;
       Object[] objArray2;
       j0 tb = this.b;
       j0 tc = this.c;
       Objects.requireNonNull(tb);
       a.u();
       KSResourceDownloader g = KSResourceDownloader.g;
       g.e(tc);
       if (!g.g(tc)) {
          e.w("No resource need to be downloaded, skip");
          a.B();
          p0.onNext(Integer.valueOf(100));
          p0.onComplete();
       }else {
          g = KSResourceDownloader.g;
          k0 ok0 = new k0(tb, p0, tc);
          Objects.requireNonNull(g);
          KSResourceDownloader kSResourceDo = KSResourceDownloader.class;
          if (!PatchProxy.applyVoidTwoRefs(tc, ok0, g, kSResourceDo, "2")) {
             Object[] objArray = new Object[0];
             e.D().s("KSResourceDownloader", "startDownload\(\) called with: detailInfo = ["+tc.mTemplateId+"]", objArray);
             if (g.f.containsKey(tc.mTemplateId)) {
                Object[] objArray1 = new Object[0];
                e.D().A("KSResourceDownloader", "startDownload: already has a download", objArray1);
                e.w("Download resource already in process");
             }else {
                g.e.put(tc.mTemplateId, ok0);
                KSResourceDownloader$b uob = new KSResourceDownloader$b(g, tc);
                g.f.put(tc.mTemplateId, uob);
                n.a(uob);
                ConcurrentHashMap uConcurrentH = new ConcurrentHashMap();
                CopyOnWriteArrayList uCopyOnWrite = g.b.get(tc.mTemplateId);
                float f = 0;
                if (uCopyOnWrite != null && !uCopyOnWrite.isEmpty()) {
                   iterator = uCopyOnWrite.iterator();
                   while (iterator.hasNext()) {
                      b uob1 = iterator.next();
                      if (uob1 != null && !p.h(uob1)) {
                         objArray2 = new Object[0];
                         e.D().s("KSResourceDownloader", "startDownload:"+uob1, objArray2);
                         e.w("Downloading magic model: "+uob1.getResourceName());
                         uConcurrentH.put(uob1.getResourceName(), Float.valueOf(f));
                         n.l(uob1);
                      }
                   }
                }
                iterator = g.a.values().iterator();
                while (iterator.hasNext()) {
                   FontCategory uFontCategor = iterator.next();
                   objArray2 = new Object[0];
                   e.D().s("KSResourceDownloader", "start download font: "+uFontCategor.getResourceName(), objArray2);
                   e.w("Downloading font: "+uFontCategor.getResourceName());
                   uConcurrentH.put(uFontCategor.getResourceName(), Float.valueOf(f));
                   n.l(uFontCategor);
                }
                uCopyOnWrite = g.c.get(tc.mTemplateId);
                if (uCopyOnWrite != null && uCopyOnWrite.size() > 0) {
                   PluginDownloadExtension.k.b(uCopyOnWrite);
                   ArrayList uArrayList = new ArrayList();
                   int i = 0;
                   while (i < uCopyOnWrite.size()) {
                      if (!Dva.instance().isLoaded(uCopyOnWrite.get(i))) {
                         uArrayList.add(uCopyOnWrite.get(i));
                         e.w("Downloading lib: "+uCopyOnWrite.get(i));
                      }
                      i = i + 1;
                   }
                   if (!uArrayList.isEmpty()) {
                      Object[] objArray3 = new Object[0];
                      e.D().s("KSResourceDownloader", "start download libs", objArray3);
                      uConcurrentH.put("libs", Float.valueOf(f));
                      String[] stringArray = new String[0];
                      stringArray = uArrayList.toArray(stringArray);
                      if (!PatchProxy.applyVoidTwoRefs(tc, stringArray, g, kSResourceDo, "12")) {
                         c.a(new v0(g, stringArray, tc));
                      }
                   }else {
                      Object[] objArray4 = new Object[0];
                      e.D().s("KSResourceDownloader", "libs all downloaded", objArray4);
                   }
                }
                g.d.put(tc.mTemplateId, uConcurrentH);
             }
          }
          p0.onNext(Integer.valueOf(0));
          p0.setCancellable(new u0(tc));
       }
       return;
    }
}
