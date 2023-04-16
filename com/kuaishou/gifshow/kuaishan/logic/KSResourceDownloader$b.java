package com.kuaishou.gifshow.kuaishan.logic.KSResourceDownloader$b;
import com.yxcorp.gifshow.util.resource.n$c;
import com.kuaishou.gifshow.kuaishan.logic.KSResourceDownloader;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Object;
import boc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.kuaishan.logic.KSResourceDownloader$Status;
import java.lang.Float;
import java.lang.Throwable;

public class KSResourceDownloader$b implements n$c	// class@0019f6
{
    public final KSTemplateDetailInfo a;
    public final KSResourceDownloader b;

    public void KSResourceDownloader$b(KSResourceDownloader p0,KSTemplateDetailInfo p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSResourceDownloader$b.class, "4")) {
          return;
       }
       this.b.b(this.a, p0, false, KSResourceDownloader$Status.SUCCESS, 0x3f800000);
       return;
    }
    public void b(b p0,float p1){
       KSResourceDownloader$b uob = KSResourceDownloader$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, uob, "1")) {
          return;
       }
       this.b.b(this.a, p0, false, KSResourceDownloader$Status.DOWNLOADING, p1);
       return;
    }
    public void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSResourceDownloader$b.class, "3")) {
          return;
       }
       this.b.b(this.a, p0, false, KSResourceDownloader$Status.FAILED, 0);
       return;
    }
    public void d(b p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSResourceDownloader$b.class, "2")) {
          return;
       }
       this.b.b(this.a, p0, false, KSResourceDownloader$Status.FAILED, 0);
       return;
    }
}
