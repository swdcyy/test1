package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$v;
import erd.g;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import u80.e;
import w46.b;
import kotlin.jvm.internal.a;

public final class KSDataManager$v implements g	// class@001a39
{
    public final KSDataManager b;
    public final String c;
    public final boolean d;

    public void KSDataManager$v(KSDataManager p0,String p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$v.class, "1")) {
       }else {
          e.D().e("KSDataManager", "fetchTemplateByGroup: ", p0);
          a.o(p0, "it");
          this.b.T(this.c, p0, this.d);
       }
       return;
    }
}
