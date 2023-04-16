package com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager$loadResourceById$1$a;
import dr3.a;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager$loadResourceById$1;
import com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialDetailInfoItem;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zq3.b;
import com.kuaishou.liveclient.resourcemanager.LiveMaterialResourceManager;
import gr3.a;
import gr3.a$a;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import java.io.File;
import com.kuaishou.liveclient.resourcemanager.apiservices.model.MaterialDetailExtraInfo;
import hr3.a;

public final class LiveMaterialResourceManager$loadResourceById$1$a implements a	// class@001051
{
    public final LiveMaterialResourceManager$loadResourceById$1 a;
    public final MaterialDetailInfoItem b;

    public void LiveMaterialResourceManager$loadResourceById$1$a(LiveMaterialResourceManager$loadResourceById$1 p0,MaterialDetailInfoItem p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMaterialResourceManager$loadResourceById$1$a.class, "2")) {
          return;
       }
       LiveMaterialResourceManager$loadResourceById$1$a ta = this.a;
       ta.this$0.d(ta.$listener, p0, p1);
       LiveMaterialResourceManager$loadResourceById$1$a ta1 = this.a;
       a.a.d(ta1.$resourceId, 2, ta1.$loadSource);
       return;
    }
    public void b(LiveMaterialResourceDownloadTask p0){
       LiveMaterialResourceManager$loadResourceById$1$a ta;
       LiveMaterialResourceManager$loadResourceById$1$a ta1;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMaterialResourceManager$loadResourceById$1$a.class, "1")) {
          return;
       }
       a.p(p0, "task");
       String str = p0.g();
       LiveMaterialResourceManager$loadResourceById$1 oloadResourc = 1;
       LiveMaterialResourceManager$loadResourceById$1 oloadResourc1 = (str == null || !str.length())? 1: null;
       int i = 2;
       Throwable throwable = null;
       if (oloadResourc1) {
          ta = this.a;
          ta.this$0.d(ta.$listener, "111006", throwable);
          ta1 = this.a;
          a.a.d(ta1.$resourceId, i, ta1.$loadSource);
       }else {
          a uoa = this.a.this$0.a(this.b.getExtParams(), new File(str));
          if (uoa != null) {
             LiveMaterialResourceManager$loadResourceById$1$a ta2 = this.a;
             a.a.d(ta2.$resourceId, oloadResourc, ta2.$loadSource);
             ta1 = this.a;
             ta1.this$0.e(ta1.$listener, uoa);
          }else {
             ta1 = this.a;
             a.a.d(ta1.$resourceId, i, ta1.$loadSource);
             ta = this.a;
             ta.this$0.d(ta.$listener, "111006", throwable);
          }
       }
       return;
    }
}
