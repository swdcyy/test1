package com.yxcorp.gifshow.relation.intimate.helper.b;
import erd.g;
import com.yxcorp.gifshow.model.IntimateRelationDialogParams;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import ji5.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import lx5.d;
import android.app.Application;
import o56.a;
import bbc.r;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.b$a;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class b implements g	// class@001907
{
    public final IntimateRelationDialogParams b;
    public final g c;

    public void b(IntimateRelationDialogParams p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       b tc = this.c;
       b.c(p0, "/rest/n/intimate/relation/propose", "intimate");
       RxBus.f.b(new d(this.b.mTargetId, false));
       if (tc != null) {
          tc.accept(p0);
       }
       ExceptionHandler.handleException(a.b(), p0, new r(p0));
       return;
    }
}