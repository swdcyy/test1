package n90.i;
import erd.g;
import com.kuaishou.gifshow.kuaishan.logic.o1;
import java.lang.Object;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import com.kuaishou.gifshow.kuaishan.utils.e;

public final class i implements g	// class@0026e5
{
    public final o1 b;

    public void i(o1 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          e.w("Build kuaishan draft for template: "+this.b.k0().mTemplateId+" completed.");
       }
       return;
    }
}
