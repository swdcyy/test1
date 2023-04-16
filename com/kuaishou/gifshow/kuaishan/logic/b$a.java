package com.kuaishou.gifshow.kuaishan.logic.b$a;
import erd.f;
import com.kuaishou.gifshow.kuaishan.logic.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.kuaishou.gifshow.kuaishan.utils.e;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.util.HashMap;

public final class b$a implements f	// class@0019fe
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public final void cancel(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       e.w("Download template zip cancelled for id="+this.a.b.mTemplateId);
       if (this.a.c != null) {
          b$a ta = this.a;
          KSDownloadHelperX.o.a().g(ta.b, ta.d);
       }else {
          KSDownloadHelperX kSDownloadHe = KSDownloadHelperX.o.a();
          b b = this.a.b;
          Objects.requireNonNull(kSDownloadHe);
          if (!PatchProxy.applyVoidOneRefs(b, kSDownloadHe, KSDownloadHelperX.class, "11")) {
             a.p(b, "downloadInfo");
             kSDownloadHe.c.remove(b.mTemplateId);
          }
       }
       return;
    }
}
