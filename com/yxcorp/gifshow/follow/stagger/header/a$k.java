package com.yxcorp.gifshow.follow.stagger.header.a$k;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.header.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import xl8.b;
import com.yxcorp.gifshow.follow.common.data.FeedsLiveResponse;
import via.g;
import java.lang.Iterable;
import ok.o;
import qk.y;
import java.util.List;
import yia.b;
import g9c.a;
import yia.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class a$k implements g	// class@0011b6
{
    public final a b;

    public void a$k(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$k.class, "1")) {
       }else {
          a.p(p0, "unFollowUserId");
          a$k tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, a.class, "12")) {
             FeedsLiveResponse obj = tb.y.a();
             a.m(obj);
             obj = obj.mQPhotos;
             int i = y.o(obj, new g(p0));
             if (i != -1) {
                obj.remove(i);
                a z = tb.z;
                if (z != null && !PatchProxy.applyVoidOneRefs(p0, z, b.class, "3")) {
                   int i1 = y.o(z.e, new a(p0));
                   if (i1 != -1) {
                      z.e.remove(i1);
                      z.k0();
                   }
                }
                p0 = tb.z;
                if (p0 != null && p0.R0() == true) {
                   tb.a9();
                }
             }
          }
       }
       return;
    }
}
