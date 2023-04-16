package com.kuaishou.tuna_core.button.d;
import io.reactivex.g;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import pv5.a;
import android.app.Application;
import o56.a;
import com.kuaishou.tuna_core.button.d$a;
import android.content.Context;
import ov5.c;

public final class d implements g	// class@0010bb
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       d.a(-867089262).tU(a.b(), new d$a(p0));
       return;
    }
}
