package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$l;
import erd.g;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Object;
import i90.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u80.e;
import java.lang.StringBuilder;
import q87.c;

public final class KSDataManager$l implements g	// class@001a27
{
    public final KSTemplateDetailInfo b;

    public void KSDataManager$l(KSTemplateDetailInfo p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$l.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          e.D().w("KSDataManager", "deleteKSTemplateCollection\(\) success, "+"templateInfo="+this.b, objArray);
       }
       return;
    }
}
