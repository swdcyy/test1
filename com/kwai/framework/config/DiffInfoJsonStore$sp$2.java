package com.kwai.framework.config.DiffInfoJsonStore$sp$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.framework.config.DiffInfoJsonStore;
import android.content.SharedPreferences;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import android.content.Context;
import vid.b;

public final class DiffInfoJsonStore$sp$2 extends Lambda implements a	// class@0014f9
{
    public final DiffInfoJsonStore this$0;

    public void DiffInfoJsonStore$sp$2(DiffInfoJsonStore p0){
       this.this$0 = p0;
       super(0);
    }
    public final SharedPreferences invoke(){
       Object obj = PatchProxy.apply(null, this, DiffInfoJsonStore$sp$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.c(a.b(), this.this$0.i(), 0);
    }
    public Object invoke(){
       return this.invoke();
    }
}
