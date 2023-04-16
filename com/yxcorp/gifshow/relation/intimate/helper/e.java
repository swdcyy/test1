package com.yxcorp.gifshow.relation.intimate.helper.e;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import ji5.b;
import android.app.Application;
import o56.a;
import bbc.u;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.b$a;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class e implements g	// class@00190a
{
    public final g b;

    public void e(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       b.c(p0, "/rest/n/intimate/relation/change/type/approve", "intimate");
       if (tb != null) {
          tb.accept(p0);
       }
       ExceptionHandler.handleException(a.b(), p0, new u(p0));
       return;
    }
}
