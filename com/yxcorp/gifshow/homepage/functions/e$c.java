package com.yxcorp.gifshow.homepage.functions.e$c;
import erd.g;
import com.yxcorp.gifshow.homepage.functions.e;
import f55.g;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.homepage.functions.JsGetFeedResult;

public class e$c implements g	// class@0016da
{
    public final g b;
    public final e c;

    public void e$c(e p0,g p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$c.class, "1")) {
       }else {
          this.b.onSuccess(JsGetFeedResult.successResult(p0));
       }
       return;
    }
}
