package com.yxcorp.gifshow.message.init.a;
import erd.g;
import com.yxcorp.gifshow.message.init.IMInitModule;
import java.lang.Object;
import eda.l;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import hdb.o;
import o56.d;
import t45.d;
import com.yxcorp.gifshow.message.init.b;
import java.lang.Runnable;
import crd.b;
import brd.z;

public final class a implements g	// class@001d4c
{
    public final IMInitModule b;

    public void a(IMInitModule p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       StringBuilder str;
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, IMInitModule.class, "8")) {
       }else if(p0 == null){
          str = "login event null";
       }else {
          str = "";
          boolean b = (p0.b != null || p0.d != null)? true: false;
          str = str+b+"switchAccount";
       }
       o.e(str);
       if (d.i) {
          d.c.d(new b(tb, p0));
       }
       return;
    }
}
