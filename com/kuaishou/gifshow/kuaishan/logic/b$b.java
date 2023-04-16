package com.kuaishou.gifshow.kuaishan.logic.b$b;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$a;
import brd.v;
import java.lang.Object;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$InfoWithResource;
import java.lang.String;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.kuaishou.gifshow.kuaishan.utils.e;
import java.lang.Integer;
import brd.g;
import java.lang.Throwable;
import com.kwai.feature.post.api.feature.kuaishan.model.KSException;

public final class b$b implements PostBaseResourceDownloadHelper$a	// class@0019ff
{
    public final v a;

    public void b$b(v p0){
       this.a = p0;
       super();
    }
    public void a(PostBaseResourceDownloadHelper$InfoWithResource p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$b.class, "3")) {
       }else {
          a.p(p0, "templateInfo");
          e.w("Download template zip completed for id="+p0.mTemplateId+", path="+p1);
          this.a.onNext(Integer.valueOf(100));
          this.a.onComplete();
       }
       return;
    }
    public void b(PostBaseResourceDownloadHelper$InfoWithResource p0,int p1,int p2){
       if (!PatchProxy.isSupport(b$b.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b$b.class, "1")) {
          a.p(p0, "templateInfo");
          long l = (long)100;
          long l1 = ((long)p1 * l) / (long)p2;
          if (l1 - l < 0) {
             this.a.onNext(Integer.valueOf((int)l1));
          }
       }
       return;
    }
    public void c(PostBaseResourceDownloadHelper$InfoWithResource p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b$b.class, "2")) {
       }else {
          a.p(p0, "templateInfo");
          a.p(p1, "e");
          e.v(p1, "Download template zip failed for id="+p0.mTemplateId+", 资源包zip下载失败，请联系客户端开发同学处理");
          this.a.onError(new KSException(-6, p1.getMessage()));
       }
       return;
    }
}
