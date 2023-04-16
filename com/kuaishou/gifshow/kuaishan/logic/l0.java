package com.kuaishou.gifshow.kuaishan.logic.l0;
import com.kwai.plugin.dva.work.c$c;
import com.kuaishou.gifshow.kuaishan.logic.KSResourceDownloader;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u80.e;
import java.lang.Throwable;
import w46.b;
import com.kuaishou.gifshow.kuaishan.logic.KSResourceDownloader$Status;
import java.lang.Float;
import java.lang.StringBuilder;
import q87.c;
import sj7.d;
import java.util.List;

public class l0 implements c$c	// class@001a5a
{
    public final KSTemplateDetailInfo a;
    public final KSResourceDownloader b;

    public void l0(KSResourceDownloader p0,KSTemplateDetailInfo p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l0.class, "3")) {
          return;
       }
       e.D().e("KSResourceDownloader", "onFail: ", p0);
       this.b.a(this.a, KSResourceDownloader$Status.FAILED, 0);
       return;
    }
    public void onProgress(float p0){
       l0 ol0 = l0.class;
       if (PatchProxy.isSupport(ol0) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ol0, "1")) {
          return;
       }
       p0 = p0 / 100.00f;
       Object[] objArray = new Object[0];
       e.D().y("KSResourceDownloader", "so onProgress "+p0, objArray);
       this.b.a(this.a, KSResourceDownloader$Status.DOWNLOADING, p0);
       return;
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l0.class, "2")) {
       }else {
          Object[] objArray = new Object[0];
          e.D().t("KSResourceDownloader", "onLoad: "+p0.size(), objArray);
          this.b.a(this.a, KSResourceDownloader$Status.SUCCESS, 0x3f800000);
       }
       return;
    }
}
