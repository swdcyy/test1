package com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$f;
import erd.a;
import com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b26.c;
import c26.a;
import b26.d;

public final class CompressAndEncodePluginImpl$f implements a	// class@000d43
{
    public final CompressAndEncodePluginImpl b;
    public final AtomicReference c;

    public void CompressAndEncodePluginImpl$f(CompressAndEncodePluginImpl p0,AtomicReference p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, CompressAndEncodePluginImpl$f.class, "1")) {
          return;
       }
       if (this.c.get() != null) {
          this.b.p70().iL(this.c.get());
       }
       return;
    }
}
