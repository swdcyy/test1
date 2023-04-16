package com.yxcorp.gifshow.follow.stagger.header.a$g;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.header.a;
import java.lang.Object;
import com.yxcorp.gifshow.follow.common.data.FeedsLiveResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import g9c.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.a;
import java.util.List;
import crd.b;
import lnc.b9;
import via.c;
import java.util.concurrent.Callable;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import via.d;
import erd.a;
import via.e;
import kga.c;

public final class a$g implements g	// class@0011b2
{
    public final a b;

    public void a$g(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$g.class, "1")) {
       }else {
          a$g tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, a.class, "10")) {
             FeedsLiveResponse mQPhotos = (p0 != null)? p0.mQPhotos: null;
             if (mQPhotos == null) {
                tb.a9();
             }else {
                a z = tb.z;
                if (z == null || z.R0() != true) {
                   z = tb.A;
                   if (z == null || z.h()) {
                      b9.a(tb.B);
                      tb.B = t.fromCallable(new c(tb)).delay(100, TimeUnit.MILLISECONDS, d.c).observeOn(d.a).doOnTerminate(new d(tb)).subscribe(new e(tb, p0), c.a);
                   }
                }
                p0 = p0.mQPhotos;
                a.o(p0, "feedsLiveResponse.mQPhotos");
                tb.Y8(p0);
             }
          }
       }
       return;
    }
}
