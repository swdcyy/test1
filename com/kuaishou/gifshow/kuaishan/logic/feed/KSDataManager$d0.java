package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$d0;
import erd.g;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.kuaishan.logic.feed.e;
import t36.f$a;
import t36.f;

public final class KSDataManager$d0 implements g	// class@001a16
{
    public final KSDataManager b;
    public final Ref$ObjectRef c;

    public void KSDataManager$d0(KSDataManager p0,Ref$ObjectRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$d0.class, "1")) {
       }else {
          this.b.s0(new e(this, p0));
       }
       return;
    }
}
