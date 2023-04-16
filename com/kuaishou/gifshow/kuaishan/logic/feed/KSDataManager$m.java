package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$m;
import erd.g;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u80.e;
import java.lang.StringBuilder;
import w46.b;

public final class KSDataManager$m implements g	// class@001a29
{
    public final KSTemplateDetailInfo b;

    public void KSDataManager$m(KSTemplateDetailInfo p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$m.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          e.D().t("KSDataManager", "deleteKSTemplateCollection\(\) fail, templateInfo="+this.b, objArray);
       }
       return;
    }
}
