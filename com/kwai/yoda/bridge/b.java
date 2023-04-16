package com.kwai.yoda.bridge.b;
import io.reactivex.g;
import com.kwai.yoda.bridge.c;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import rx7.d;
import com.kuaishou.webkit.ValueCallback;
import com.kuaishou.webkit.extension.KsWebExtensionStatics;
import com.kwai.middleware.azeroth.Azeroth2;
import android.content.Context;
import yb7.n;
import java.lang.StringBuilder;
import java.lang.String;
import yz7.r;
import rx7.b0;
import java.lang.System;
import brd.g;

public final class b implements g	// class@001189
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       v ov = p0;
       b b = this.b;
       Objects.requireNonNull(b);
       boolean b1 = KsWebExtensionStatics.requestResourceDump(0, new d(b, ov));
       if (!b1) {
          long l = c.d() - n.a(Azeroth2.B.d());
          r.h("LoadEventLogger", "getMemoryFromSystemUtils:"+l);
          b0 uob0 = new b0(System.currentTimeMillis(), l, 0, b.b(), b.c());
          ov.onNext(b1);
          p0.onComplete();
       }
       return;
    }
}
