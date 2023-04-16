package com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$e;
import io.reactivex.g;
import com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import b26.c;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import b26.d;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$Status;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import qkd.b;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$e$a;
import java.lang.Runnable;
import ekd.k1;
import b26.b$a;
import brd.g;
import java.lang.Throwable;
import com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$e$b;
import erd.f;
import com.yxcorp.gifshow.encode.plugin.CompressAndEncodePluginImpl$e$c;
import c26.a;

public final class CompressAndEncodePluginImpl$e implements g	// class@000d42
{
    public final CompressAndEncodePluginImpl b;
    public final int c;
    public final String d;
    public final AtomicReference e;

    public void CompressAndEncodePluginImpl$e(CompressAndEncodePluginImpl p0,int p1,String p2,AtomicReference p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CompressAndEncodePluginImpl$e.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       if (p0.isDisposed()) {
          return;
       }
       EncodeInfo uEncodeInfo = this.b.p70().c3(this.c);
       if (uEncodeInfo != null && uEncodeInfo.getStatus() == EncodeInfo$Status.COMPLETE) {
          if (!TextUtils.n(this.d, uEncodeInfo.getOutputPath())) {
             File uFile = new File(this.d);
             if (uFile.exists()) {
                b.q(uFile);
             }
             StringBuilder str = "waitEncodeProgress\(\) "+this.d+' '+uFile;
             b.W(new File(uEncodeInfo.getOutputPath()), uFile);
             k1.o(new CompressAndEncodePluginImpl$e$a(uFile));
          }
          p0.onNext(new b$a(new File(this.d), 0x3f800000, true));
          p0.onComplete();
          return;
       }else if(uEncodeInfo == null){
          p0.onError(new Throwable());
          return;
       }else {
          p0.setCancellable(new CompressAndEncodePluginImpl$e$b(this, uEncodeInfo));
          this.e.set(new CompressAndEncodePluginImpl$e$c(this, p0));
          this.b.p70().Tk(this.e.get());
          return;
       }
    }
}
