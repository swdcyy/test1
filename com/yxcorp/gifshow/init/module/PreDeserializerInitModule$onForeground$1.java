package com.yxcorp.gifshow.init.module.PreDeserializerInitModule$onForeground$1;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;

public final class PreDeserializerInitModule$onForeground$1 implements Runnable	// class@001999
{
    public static final PreDeserializerInitModule$onForeground$1 b;

    static {
       PreDeserializerInitModule$onForeground$1.b = new PreDeserializerInitModule$onForeground$1();
    }
    public void PreDeserializerInitModule$onForeground$1(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, PreDeserializerInitModule$onForeground$1.class, "1")) {
          return;
       }
       d.a(0x2e5315fc);
       PatchProxy.onMethodExit(PreDeserializerInitModule$onForeground$1.class, "1");
       return;
    }
}
