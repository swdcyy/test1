package com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$e$b;
import erd.f;
import com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$e;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b26.c;
import com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl;
import b26.d;

public final class CompressAndEncodePluginImpl$e$b implements f	// class@000d3f
{
    public final CompressAndEncodePluginImpl$e a;
    public final EncodeInfo b;

    public void CompressAndEncodePluginImpl$e$b(CompressAndEncodePluginImpl$e p0,EncodeInfo p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void cancel(){
       if (PatchProxy.applyVoid(null, this, CompressAndEncodePluginImpl$e$b.class, "1")) {
          return;
       }
       this.a.b.p70().cancel(this.b.getId());
       return;
    }
}
