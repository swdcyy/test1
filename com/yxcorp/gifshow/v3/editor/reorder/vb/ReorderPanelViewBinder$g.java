package com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder$g;
import ysc.a$a;
import com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder;
import java.lang.Object;
import zsc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.reorder.vm.ReorderViewModel;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import androidx.lifecycle.LiveData;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class ReorderPanelViewBinder$g implements a$a	// class@0011b4
{
    public final ReorderPanelViewBinder a;

    public void ReorderPanelViewBinder$g(ReorderPanelViewBinder p0){
       this.a = p0;
       super();
    }
    public void a(b p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, ReorderPanelViewBinder$g.class, "1")) {
          return;
       }
       if (p0 != null) {
          ReorderPanelViewBinder q = this.a.q;
          String str = p0.b();
          Objects.requireNonNull(q);
          Object obj = PatchProxy.applyOneRefs(str, q, ReorderViewModel.class, "14");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             a.p(str, "identifier");
             ListHolder value = q.f.getValue();
             if (value != null) {
                List list = value.c();
                if (list != null) {
                   int i1 = 0;
                   Iterator iterator = list.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         Object obj1 = iterator.next();
                         int i2 = i1 + 1;
                         if (i1 < 0) {
                            CollectionsKt__CollectionsKt.W();
                         }
                         if (a.g(obj1.b(), str)) {
                            i = i1;
                         }else {
                            i1 = i2;
                         }
                      }
                   }
                }
             }
             i = -1;
          }
          if (i != -1) {
             ReorderPanelViewBinder$g ta = this.a;
             ta.k = 1;
             ta.q.n(i);
          }
       }
       return;
    }
}
