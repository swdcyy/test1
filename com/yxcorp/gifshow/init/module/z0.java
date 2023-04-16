package com.yxcorp.gifshow.init.module.z0;
import java.lang.Runnable;
import com.yxcorp.gifshow.init.module.UpdateConfigModule;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qe6.b;
import sxa.m0;
import com.kuaishou.android.model.response.ConfigResponse;
import t45.c;

public final class z0 implements Runnable	// class@0019e6
{
    public final UpdateConfigModule b;

    public void z0(UpdateConfigModule p0){
       this.b = p0;
    }
    public final void run(){
       z0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidWithListener(null, tb, UpdateConfigModule.class, "10")) {
       }else if(b.b()){
          UpdateConfigModule q = tb.q;
          if (q != null) {
             c.a(new m0(tb, q));
             tb.q = null;
          }
       }
       PatchProxy.onMethodExit(UpdateConfigModule.class, "10");
       return;
    }
}
