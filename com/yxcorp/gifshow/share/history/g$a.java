package com.yxcorp.gifshow.share.history.g$a;
import erd.g;
import com.yxcorp.gifshow.share.history.g;
import java.lang.Object;
import com.yxcorp.gifshow.share.model.ShareHistoryResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import kp.y1;

public class g$a implements g	// class@001bb4
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
       }else if(p0 != null){
          y1.c(p0.getItems(), p0.getLlsid());
       }
       return;
    }
}
