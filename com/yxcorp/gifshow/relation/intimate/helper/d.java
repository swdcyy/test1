package com.yxcorp.gifshow.relation.intimate.helper.d;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import ji5.b;
import android.app.Application;
import o56.a;
import bbc.t;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.b$a;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class d implements g	// class@001909
{
    public final g b;

    public void d(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       b.c(p0, "/rest/n/intimate/relation/approve", "intimate");
       if (tb != null) {
          tb.accept(p0);
       }
       ExceptionHandler.handleException(a.b(), p0, new t(p0));
       return;
    }
}
