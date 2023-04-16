package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$o0;
import erd.g;
import java.util.List;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u80.e;
import java.lang.StringBuilder;
import q87.c;

public final class KSDataManager$o0 implements g	// class@001a2c
{
    public final int b;
    public final List c;

    public void KSDataManager$o0(int p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$o0.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          e.D().w("KSDataManager", "reportViewedTemplates success, type: "+this.b+", list: "+this.c, objArray);
       }
       return;
    }
}
