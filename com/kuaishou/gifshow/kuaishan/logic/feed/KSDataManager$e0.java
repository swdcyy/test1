package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$e0;
import erd.g;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import java.lang.String;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import u80.e;
import java.lang.StringBuilder;
import w46.b;
import kotlin.jvm.internal.a;

public final class KSDataManager$e0 implements g	// class@001a18
{
    public final KSDataManager b;
    public final String c;
    public final String d;
    public final Ref$ObjectRef e;

    public void KSDataManager$e0(KSDataManager p0,String p1,String p2,Ref$ObjectRef p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$e0.class, "1")) {
       }else {
          e.D().e("KSDataManager", "fetchTemplatesForDeepLink templateId="+this.c+", "+"groupId="+this.d+", Exception: ", p0);
          a.o(p0, "it");
          this.b.T(this.e.element, p0, true);
       }
       return;
    }
}
