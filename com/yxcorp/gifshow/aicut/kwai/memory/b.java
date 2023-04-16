package com.yxcorp.gifshow.aicut.kwai.memory.b;
import erd.o;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$p;
import o69.a;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import i79.e;
import java.util.Collection;
import tkd.b;
import tkd.d;
import h69.h;
import java.util.List;
import o69.c;
import com.yxcorp.gifshow.aicut.api.AICutStyle;
import java.lang.Iterable;
import i79.b;
import java.util.ArrayList;
import com.yxcorp.gifshow.models.QMedia;
import h69.g;
import java.lang.StringBuilder;
import w46.b;
import i79.a;
import q87.c;
import kotlin.collections.CollectionsKt___CollectionsKt;
import elb.p0;
import java.lang.Number;
import usd.q;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import com.yxcorp.gifshow.aicut.KwaiAICutStyle;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo;
import nsd.u;
import qrd.l1;

public final class b implements o	// class@001967
{
    public final AICutAnnualMemoryProject$p b;
    public final a c;

    public void b(AICutAnnualMemoryProject$p p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       e uoe1;
       e a;
       Object[] obj;
       b uob = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          a.p(p0, "sceneResults");
          Iterator iterator = this.b.b.c0.entrySet().iterator();
          e uoe = 1;
          int i = 0;
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             uoe1 = p0.get(uEntry.getKey());
             if (uoe1 != null) {
                e value = uEntry.getValue();
                value.j = uoe1.j;
                value.i = uoe1.i;
                value.h = uoe1.h;
                value.k = uoe1.k;
                a = value.a;
                if (a != null && !a.isEmpty()) {
                   uoe = null;
                }
                if (uoe) {
                   value.a = uoe1.a;
                }
             }
          }
          if (this.b.b.c0.isEmpty()) {
             this.b.b.c0.putAll(p0);
          }
          b tb = this.b;
          AICutStyle mLocalDir = tb.c.mLocalDir;
          a.o(mLocalDir, "style.mLocalDir");
          p0 = d.a(-1595266550).yt(this.b.b.M(), tb.b.c0, mLocalDir).iterator();
          String str = "AICutAnnualMemoryProject";
          while (p0.hasNext()) {
             uob = p0.next();
             Iterator iterator1 = this.b.b.W0().iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   obj = iterator1.next();
                   if (!a.g(obj.e().get(i).path, uob.e().get(i).path)) {
                      continue ;
                   }
                }else {
                   obj = null;
                }
                if (obj == null) {
                   obj = new Object[i];
                   g.D().t(str, "observableDownloadStyleMusic\(\) cant find originMedia, path="+uob.e().get(i).path, obj);
                }else {
                   obj.f(uob.c());
                   continue ;
                }
             }
          }
          p0 = this.b.b.W0().iterator();
          while (p0.hasNext()) {
             uob = p0.next();
             String str1 = "constructKSMemoryData\(\) After: media="+uob.e().get(i).path;
             List list = uob.c();
             if (list != null) {
                iterator = list.iterator();
                while (iterator.hasNext()) {
                   a uoa = iterator.next();
                   str1 = str1+", type="+uoa.b()+", customText="+uoa.a();
                }
             }
             obj = new Object[i];
             g.D().w(str, str1, obj);
          }
          p0 = this.b.b.M().iterator();
          while (p0.hasNext()) {
             QMedia qMedia = p0.next();
             uoe1 = this.b.b.c0.get(qMedia.path);
             if (uoe1 != null) {
                uoe1 = uoe1.a;
                if (uoe1 != null) {
                   p0 op0 = CollectionsKt___CollectionsKt.p2(uoe1);
                   if (op0 != null) {
                      List list1 = op0.b();
                      if (list1 != null && (list1.size() == 4 && (qMedia.getWidth() && qMedia.getHeight()))) {
                         float f = list1.get(i).floatValue() + list1.get(2).floatValue();
                         float f1 = (float)2;
                         f = f / f1;
                         float f2 = list1.get(uoe).floatValue() + list1.get(3).floatValue();
                         f2 = f2 / f1;
                         float f3 = (float)q.n(qMedia.getWidth(), qMedia.getHeight()) * 0x3f800000;
                         f3 = f3 / (float)544;
                         f = f * f3;
                         f = f / (float)qMedia.getWidth();
                         qMedia.mExportPositionX = f;
                         f2 = f2 * f3;
                         f2 = f2 / (float)qMedia.getHeight();
                         qMedia.mExportPositionY = f2;
                         obj = new Object[i];
                         g.D().w(str, "media.position\("+qMedia.mExportPositionX+','+qMedia.mExportPositionY+')', obj);
                      }
                   }
                }
             }
          }
          VideoTemplate videoTemplat = new VideoTemplate(0, null, null, null, 15, null);
          v7.setAiCutStyle(this.b.c);
          this.b.b.Y0(v7, this.b.c);
          uob = this.c;
       }
       return uob;
    }
}
