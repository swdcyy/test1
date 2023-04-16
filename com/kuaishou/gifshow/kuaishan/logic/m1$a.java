package com.kuaishou.gifshow.kuaishan.logic.m1$a;
import com.kwai.video.clipkit.mv.ClipTemplateDownloadService;
import com.kuaishou.gifshow.kuaishan.logic.m1;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import java.util.Objects;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$a;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.video.clipkit.mv.ClipTemplateDownloadListener;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper;
import com.kwai.video.clipkit.mv.ClipTemplateDownloadConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import w46.b;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import java.util.ArrayList;
import android.util.Pair;
import com.yxcorp.gifshow.model.CDNUrl;
import x80.i;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$c;
import java.lang.System;
import java.util.Map;
import gb7.c;

public class m1$a implements ClipTemplateDownloadService	// class@001a5e
{
    public final m1 a;

    public void m1$a(m1 p0){
       this.a = p0;
       super();
    }
    public void cancel(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m1$a.class, "2")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       e.D().w("KuaiShanManager", "ClipTemplateDownloadService: cancel invoked with id = "+p0, objArray);
       KSDownloadHelperX kSDownloadHe = KSDownloadHelperX.class;
       if (!PatchProxy.applyVoidOneRefs(p0, null, kSDownloadHe, "35")) {
          KSDownloadHelperX$a o = KSDownloadHelperX.o;
          Objects.requireNonNull(o);
          if (!PatchProxy.applyVoidOneRefs(p0, o, KSDownloadHelperX$a.class, "15")) {
             String str = "taskId";
             a.p(p0, str);
             KSDownloadHelperX kSDownloadHe1 = o.a();
             Objects.requireNonNull(kSDownloadHe1);
             if (!PatchProxy.applyVoidOneRefs(p0, kSDownloadHe1, kSDownloadHe, "9")) {
                a.p(p0, str);
                Object[] objArray1 = new Object[i];
                e.D().s("KS_Hodor", "cancelSharedResDownload : "+p0, objArray1);
                List list = kSDownloadHe1.m(p0);
                if (list != null) {
                   Iterator iterator = list.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().onCancel();
                   }
                }
                String str1 = kSDownloadHe1.g.get(p0);
                if (str1 != null) {
                   kSDownloadHe1.h.remove(str1);
                   str1 = kSDownloadHe1.g.remove(p0);
                }
                kSDownloadHe1.b.b(p0);
             }
          }
       }
       return;
    }
    public void download(ClipTemplateDownloadConfig p0,ClipTemplateDownloadListener p1){
       boolean b;
       KSDownloadHelperX kSDownloadHe = KSDownloadHelperX.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m1$a.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "KuaiShanManager";
       e.D().w(str, "ClipTemplateDownloadService: download invoked with filename = "+p0.fileName, objArray);
       m1$a ta = this.a;
       Objects.requireNonNull(ta);
       KSDownloadHelperX obj = PatchProxy.applyOneRefs(p0, ta, m1.class, "2");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          objArray = new Object[i];
          e.D().w(str, "verifyClipTemplateDownloadConfig\(\) called with: config = ["+p0+"]", objArray);
          ClipTemplateDownloadConfig resourceCdnU = p0.resourceCdnUrls;
          b = (resourceCdnU == null || (!resourceCdnU.isEmpty() && (TextUtils.x(p0.fileName) || (!TextUtils.x(p0.fileSaveFolder) && (!p0.needUnzip.booleanValue() || !TextUtils.x(p0.unzipFolder))))))? true: false;
       }
       if (!b) {
          Object[] objArray1 = new Object[i];
          e.D().t(str, "ClipTemplateDownloadService: invalid clipTemplateDownloadConfig", objArray1);
          return;
       }else {
          obj = KSDownloadHelperX.l();
          Objects.requireNonNull(obj);
          i oi = PatchProxy.applyOneRefs(p0, obj, kSDownloadHe, "12");
          if (oi != patchProxyRe) {
          }else {
             a.p(p0, "config");
             ArrayList uArrayList1 = new ArrayList();
             Iterator iterator = p0.resourceCdnUrls.iterator();
             while (iterator.hasNext()) {
                Pair pair = iterator.next();
                uArrayList1.add(new CDNUrl(pair.first, pair.second));
             }
             oi = new i(uArrayList1, p0);
          }
          if (!PatchProxy.applyVoidTwoRefs(oi, p1, null, kSDownloadHe, "34")) {
             KSDownloadHelperX$a o = KSDownloadHelperX.o;
             Objects.requireNonNull(o);
             if (!PatchProxy.applyVoidTwoRefs(oi, p1, o, KSDownloadHelperX$a.class, "14")) {
                String str1 = "downloadConfig";
                a.p(oi, str1);
                String str2 = "listener";
                a.p(p1, str2);
                KSDownloadHelperX kSDownloadHe1 = o.a();
                Objects.requireNonNull(kSDownloadHe1);
                if (!PatchProxy.applyVoidTwoRefs(oi, p1, kSDownloadHe1, kSDownloadHe, "8")) {
                   a.p(oi, str1);
                   a.p(p1, str2);
                   Object[] objArray2 = new Object[i];
                   e.D().s("KS_Hodor", "downloadSharedRes : "+oi.getFileName(), objArray2);
                   KSDownloadHelperX$c uoc = new KSDownloadHelperX$c(kSDownloadHe1);
                   str1 = "";
                   str2 = oi.getFileName();
                   if (str2 == null) {
                      str2 = "";
                   }
                   str1 = str1+str2+String.valueOf(System.currentTimeMillis());
                   kSDownloadHe1.g.put(oi.getId(), str1);
                   if (kSDownloadHe1.h.contains(str1)) {
                      kSDownloadHe1 = kSDownloadHe1.h.get(str1);
                      a.m(kSDownloadHe1);
                      kSDownloadHe1.add(p1);
                   }else {
                      ArrayList uArrayList = new ArrayList();
                      uArrayList.add(p1);
                      kSDownloadHe1.h.put(str1, uArrayList);
                      kSDownloadHe1.b.d(oi, uoc);
                   }
                   p1.onStart(oi.getId());
                }
             }
          }
          return;
       }
    }
}
