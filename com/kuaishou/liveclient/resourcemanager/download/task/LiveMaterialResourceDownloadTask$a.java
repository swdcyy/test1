package com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask$a;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nsd.u;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceLocalFileManager;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceLocalFileManager$a;

public final class LiveMaterialResourceDownloadTask$a	// class@00108a
{
    public List a;
    public List b;
    public DownloadTask$DownloadTaskType c;
    public String d;
    public String e;
    public String f;
    public String g;
    public boolean h;

    public void LiveMaterialResourceDownloadTask$a(){
       super();
       this.a = new CopyOnWriteArrayList();
       this.c = DownloadTask$DownloadTaskType.PRE_DOWNLOAD;
       this.d = "";
       this.e = "";
       this.g = "";
    }
    public final LiveMaterialResourceDownloadTask a(){
       LiveMaterialResourceDownloadTask liveMaterial = LiveMaterialResourceDownloadTask.class;
       Object[] objArray = null;
       LiveMaterialResourceDownloadTask obj = PatchProxy.apply(objArray, this, LiveMaterialResourceDownloadTask$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveMaterialResourceDownloadTask(objArray);
       obj.a.addAll(this.a);
       this.a.clear();
       LiveMaterialResourceDownloadTask$a tc = this.c;
       if (!PatchProxy.applyVoidOneRefs(tc, obj, liveMaterial, "1")) {
          a.p(tc, "<set-?>");
          obj.c = tc;
       }
       tc = this.d;
       if (!PatchProxy.applyVoidOneRefs(tc, obj, liveMaterial, "2")) {
          a.p(tc, "<set-?>");
          obj.d = tc;
       }
       tc = this.e;
       if (!PatchProxy.applyVoidOneRefs(tc, obj, liveMaterial, "3")) {
          a.p(tc, "<set-?>");
          obj.e = tc;
       }
       obj.f = this.f;
       LiveMaterialResourceDownloadTask$a tb = this.b;
       if (tb != null) {
          objArray = new ArrayList(u.Y(tb, 10));
          Iterator iterator = tb.iterator();
          while (iterator.hasNext()) {
             objArray.add(iterator.next().getUrl());
          }
       }
       obj.b = objArray;
       obj.q = this.g;
       obj.r = this.h;
       obj.g = LiveMaterialResourceLocalFileManager.d.a().b(this.d);
       return obj;
    }
    public final LiveMaterialResourceDownloadTask$a b(DownloadTask$DownloadTaskType p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMaterialResourceDownloadTask$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "downloadPriority");
       this.c = p0;
       return this;
    }
    public final LiveMaterialResourceDownloadTask$a c(String p0){
       this.f = p0;
       return this;
    }
    public final LiveMaterialResourceDownloadTask$a d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMaterialResourceDownloadTask$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "resourceId");
       this.d = p0;
       return this;
    }
    public final LiveMaterialResourceDownloadTask$a e(List p0){
       this.b = p0;
       return this;
    }
}
