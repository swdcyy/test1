package com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement$g;
import erd.g;
import com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Number;
import java.util.Objects;
import java.lang.Long;
import tkd.b;
import tkd.d;
import wjc.l;
import com.yxcorp.gifshow.entity.QPhoto;
import rx9.g;
import wjc.l$b;
import qp7.x0;
import qp7.b;
import iq7.j;

public final class ProgressPreviewElement$g implements g	// class@0013bd
{
    public final ProgressPreviewElement b;

    public void ProgressPreviewElement$g(ProgressPreviewElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProgressPreviewElement$g.class, "1")) {
       }else {
          ProgressPreviewElement$g tb = this.b;
          a.o(p0, "it");
          p0 = CollectionsKt___CollectionsKt.Y2(p0);
          a.o(p0, "it.last\(\)");
          long l = p0.longValue();
          Objects.requireNonNull(tb);
          p0 = ProgressPreviewElement.class;
          if (!PatchProxy.isSupport(p0) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), tb, p0, "9")) {
             p0 = d.a(0x46ffacbc);
             ProgressPreviewElement z = tb.z;
             String str = "mPhoto";
             if (z == null) {
                a.S(str);
             }
             if (p0.qa(z.getPhotoId()) && p0.i3()) {
                z = tb.z;
                if (z == null) {
                   a.S(str);
                }
                p0.kR(z.getPhotoId(), l, new g(tb));
             }else {
                tb.E().g(true);
             }
          }
       }
       return;
    }
}
