package com.kuaishou.liveclient.resourcemanager.download.LiveMaterialResourceDownloadManager$downloadMaterialResource$1$a;
import cr3.d;
import com.kuaishou.liveclient.resourcemanager.download.LiveMaterialResourceDownloadManager$downloadMaterialResource$1;
import cr3.a;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask$TaskState;
import java.util.concurrent.ConcurrentHashMap;
import com.kuaishou.liveclient.resourcemanager.download.LiveMaterialResourceDownloadManager;

public final class LiveMaterialResourceDownloadManager$downloadMaterialResource$1$a extends d	// class@001072
{
    public final LiveMaterialResourceDownloadManager$downloadMaterialResource$1 c;

    public void LiveMaterialResourceDownloadManager$downloadMaterialResource$1$a(LiveMaterialResourceDownloadManager$downloadMaterialResource$1 p0,a p1){
       this.c = p0;
       super(null);
    }
    public void b(LiveMaterialResourceDownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMaterialResourceDownloadManager$downloadMaterialResource$1$a.class, "2")) {
          return;
       }
       a.p(p0, "task");
       super.b(p0);
       p0.n(LiveMaterialResourceDownloadTask$TaskState.FAILED);
       p0.j();
       this.c.this$0.b().remove(p0.h());
       return;
    }
    public void c(LiveMaterialResourceDownloadTask p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMaterialResourceDownloadManager$downloadMaterialResource$1$a.class, "1")) {
          return;
       }
       a.p(p0, "task");
       super.c(p0);
       p0.n(LiveMaterialResourceDownloadTask$TaskState.FINISH);
       p0.j();
       this.c.this$0.b().remove(p0.h());
       return;
    }
}
