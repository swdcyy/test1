package com.yxcorp.gifshow.init.module.a1;
import java.lang.Runnable;
import com.yxcorp.gifshow.init.module.UpdateConfigModule;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.a;
import android.content.Context;
import ekd.p0;
import sxa.n0;
import com.kuaishou.android.model.response.ConfigResponse;
import t45.c;

public final class a1 implements Runnable	// class@0019b0
{
    public final UpdateConfigModule b;

    public void a1(UpdateConfigModule p0){
       this.b = p0;
    }
    public final void run(){
       a1 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidWithListener(null, tb, UpdateConfigModule.class, "12")) {
       }else if(p0.F(a.B)){
          UpdateConfigModule q = tb.q;
          if (q != null) {
             c.a(new n0(tb, q));
             tb.q = null;
          }
       }
       PatchProxy.onMethodExit(UpdateConfigModule.class, "12");
       return;
    }
}
