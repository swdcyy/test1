package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$g;
import erd.g;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u80.e;
import java.lang.StringBuilder;
import w46.b;

public final class KSDataManager$g implements g	// class@001a1d
{
    public final ArrayList b;

    public void KSDataManager$g(ArrayList p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$g.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          e.D().t("KSDataManager", "addKSTemplateCollection\(\) fail, templateIds="+this.b, objArray);
       }
       return;
    }
}
