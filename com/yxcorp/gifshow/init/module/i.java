package com.yxcorp.gifshow.init.module.i;
import xfd.a$b;
import java.lang.Object;
import com.yxcorp.gifshow.init.module.DFPInitModule;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Application;
import o56.a;
import android.content.Context;
import h30.a;
import oe6.a;

public final class i implements a$b	// class@0019c5
{
    public static final i a;

    static {
       i.a = new i();
    }
    public void i(){
       super();
    }
    public final Object apply(){
       String str = PatchProxy.applyWithListener(null, null, DFPInitModule.class, "10");
       if (str != PatchProxyResult.class) {
       }else if(TextUtils.x(DFPInitModule.s) && !a.f(a.b())){
          str = a.j();
          PatchProxy.onMethodExit(DFPInitModule.class, "10");
       }else {
          str = DFPInitModule.s;
          PatchProxy.onMethodExit(DFPInitModule.class, "10");
       }
       return str;
    }
}
