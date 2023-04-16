package com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder$c;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ysc.a;
import java.lang.Integer;
import g9c.a;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import zsc.b;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class ReorderPanelViewBinder$c implements Observer	// class@0011b0
{
    public final ReorderPanelViewBinder b;

    public void ReorderPanelViewBinder$c(ReorderPanelViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       int i3;
       if (PatchProxy.applyVoidOneRefs(p0, this, ReorderPanelViewBinder$c.class, "1")) {
       }else {
          ReorderPanelViewBinder i = this.b.i;
          int i1 = p0.get();
          Objects.requireNonNull(i);
          a uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), i, uoa, "7")) {
             int i2 = 0;
             if (i1 < 0 || i1 >= i.e.size()) {
                Object[] objArray = new Object[i2];
                a.D().w("ReorderImageAdapter", "pos: "+i1+" is illegal!", objArray);
             }else {
                Iterator obj = PatchProxy.apply(null, i, uoa, "8");
                if (obj != PatchProxyResult.class) {
                   i3 = obj.intValue();
                }else {
                   uoa = i.e;
                   a.o(uoa, "mList");
                   obj = uoa.iterator();
                   Boolean uBoolean = -1;
                   int i4 = 0;
                   while (obj.hasNext()) {
                      Object obj1 = obj.next();
                      int i5 = i4 + 1;
                      if (i4 < 0) {
                         CollectionsKt__CollectionsKt.W();
                      }
                      if ((obj1.b()).equals(i.g)) {
                         uBoolean = i4;
                      }
                      i4 = i5;
                   }
                   i3 = uBoolean;
                }
                if (i3 > -1) {
                   i.m0(i3, Boolean.TRUE);
                }
                i.g = i.e.get(i1).b();
                i.m0(i1, Boolean.TRUE);
             }
          }
          this.b.D(p0.get());
          a.o(p0, "it");
          this.b.E(p0);
       }
       return;
    }
}
