package com.kuaishou.gifshow.kuaishan.logic.b;
import io.reactivex.g;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.String;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$a;
import com.kuaishou.gifshow.kuaishan.utils.e;
import java.lang.Integer;
import brd.g;
import java.util.List;
import com.kuaishou.gifshow.kuaishan.logic.b$b;
import com.kuaishou.gifshow.kuaishan.logic.b$a;
import erd.f;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.PostBaseResourceDownloadHelper$a;

public final class b implements g	// class@001a02
{
    public final KSTemplateDetailInfo b;
    public final boolean c;
    public final String d;

    public void b(KSTemplateDetailInfo p0,boolean p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       KSDownloadHelperX$a o = KSDownloadHelperX.o;
       if (o.e(this.b)) {
          e.w("Has local cached template zip");
          p0.onNext(Integer.valueOf(100));
          p0.onComplete();
          return;
       }else {
          b tb = this.b;
          o.g(tb.mFileMd5CheckList, tb.getUniqueIdentifier());
          p0.setCancellable(new b$a(this));
          e.w("Download template zip starts, templateId="+this.b.mTemplateId+", "+"with downloadSourceType: "+this.d);
          o.a().i(this.b, this.d, new b$b(p0));
          return;
       }
    }
}
