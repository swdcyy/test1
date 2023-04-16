package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$p0;
import erd.g;
import java.util.List;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u80.e;
import java.lang.StringBuilder;
import w46.b;

public final class KSDataManager$p0 implements g	// class@001a2e
{
    public final int b;
    public final List c;

    public void KSDataManager$p0(int p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$p0.class, "1")) {
       }else {
          e.D().e("KSDataManager", "reportViewedTemplates failed, type: "+this.b+", list: "+this.c, p0);
       }
       return;
    }
}
