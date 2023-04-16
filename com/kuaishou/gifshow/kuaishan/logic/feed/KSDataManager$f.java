package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$f;
import erd.g;
import java.util.ArrayList;
import java.lang.Object;
import i90.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u80.e;
import java.lang.StringBuilder;
import q87.c;

public final class KSDataManager$f implements g	// class@001a1b
{
    public final ArrayList b;

    public void KSDataManager$f(ArrayList p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$f.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          e.D().w("KSDataManager", "addKSTemplateCollection\(\) success, templateIds="+this.b, objArray);
       }
       return;
    }
}
