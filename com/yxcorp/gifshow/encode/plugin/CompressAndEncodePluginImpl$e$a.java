package com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$e$a;
import java.lang.Runnable;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import android.content.Context;
import qkd.a;

public final class CompressAndEncodePluginImpl$e$a implements Runnable	// class@000d3e
{
    public final File b;

    public void CompressAndEncodePluginImpl$e$a(File p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, CompressAndEncodePluginImpl$e$a.class, "1")) {
          return;
       }
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       a.c(uoc.a(), this.b);
       return;
    }
}
