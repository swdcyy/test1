package com.yxcorp.gifshow.activity.preview.b;
import io.reactivex.g;
import com.yxcorp.gifshow.encode.EncodeRequest$a;
import java.lang.Object;
import brd.v;
import com.yxcorp.gifshow.encode.EncodeRequest;
import tkd.b;
import tkd.d;
import b26.c;
import c26.b;
import b26.d;
import com.yxcorp.gifshow.log.PostLogger;
import java.lang.String;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import com.yxcorp.gifshow.activity.preview.e;
import pca.d0;
import c26.d;
import jw8.e;
import erd.f;

public final class b implements g	// class@001360
{
    public final EncodeRequest$a b;

    public void b(EncodeRequest$a p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       b tb = this.b;
       tb.h(false);
       EncodeRequest uEncodeReque = tb.a();
       c uoc = d.a(0x2e6e89ac);
       int i = uoc.r7(uEncodeReque);
       PostLogger postLogger = new PostLogger().c("PreviewEncodeUtil");
       postLogger.k(uEncodeReque.getSessionId());
       PostLogger postLogger1 = postLogger.h(PostSubTaskEvent.ENCODE_EVENT);
       postLogger1.j(PostLogger$Status.BEGIN).i(String.valueOf(i)).f("generateEncodeInfo").g("generateEncodeInfo").d();
       d.a(0x66204fb9).E5(new e(p0, uoc, i));
       d.a(0x66204fb9).Oy(i);
       p0.setCancellable(new e(uoc, i));
    }
}
