package com.kwai.feature.post.api.reedit.ReEditAfterDeleteOperator$g;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.PostUtils;

public final class ReEditAfterDeleteOperator$g implements g	// class@001433
{
    public static final ReEditAfterDeleteOperator$g b;

    static {
       ReEditAfterDeleteOperator$g.b = new ReEditAfterDeleteOperator$g();
    }
    public void ReEditAfterDeleteOperator$g(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReEditAfterDeleteOperator$g.class, "1")) {
       }else {
          a.m(p0);
          PostUtils.D("ReEditAfterDeleteOperator", "showDeleteDialog, go to reedit after delete", p0);
       }
       return;
    }
}
