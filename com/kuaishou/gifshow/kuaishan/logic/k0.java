package com.kuaishou.gifshow.kuaishan.logic.k0;
import com.kuaishou.gifshow.kuaishan.logic.KSResourceDownloader$c;
import com.kuaishou.gifshow.kuaishan.logic.KSResourceDownloader;
import brd.v;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import java.lang.Integer;
import brd.g;
import com.kuaishou.gifshow.kuaishan.utils.e;
import mca.a;
import java.lang.Throwable;
import com.kwai.feature.post.api.feature.kuaishan.model.KSException;
import java.lang.StringBuilder;

public class k0 implements KSResourceDownloader$c	// class@001a57
{
    public final v a;
    public final KSTemplateDetailInfo b;
    public final KSResourceDownloader c;

    public void k0(KSResourceDownloader p0,v p1,KSTemplateDetailInfo p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(float p0){
       k0 ok0 = k0.class;
       if (PatchProxy.isSupport(ok0) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ok0, "1")) {
          return;
       }
       int i = (int)(p0 * 100.00f);
       this.a.onNext(Integer.valueOf(i));
       if (i >= 100) {
          e.w("Download resources completed");
          a.B();
          this.a.onComplete();
       }
       return;
    }
    public void onFailed(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k0.class, "2")) {
          return;
       }
       e.v(objArray, "Download resources failed，资源下载出错，请联系客户端开发同学排查");
       this.a.onError(new KSException(-5, "download detailInfo="+this.b));
       return;
    }
}
