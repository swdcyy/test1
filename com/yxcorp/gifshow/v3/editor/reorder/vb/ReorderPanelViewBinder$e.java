package com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder$e;
import com.yxcorp.gifshow.widget.u;
import com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.reorder.vm.ReorderViewModel;
import uwc.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.lifecycle.LiveData;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import di0.b;
import zsc.b;
import android.util.Pair;
import kotlin.jvm.internal.a;
import dtc.e;
import t36.f$a;
import t36.f;
import atc.a;
import java.lang.StringBuilder;
import androidx.lifecycle.MutableLiveData;
import btc.b;
import k2b.s;

public final class ReorderPanelViewBinder$e extends u	// class@0011b2
{
    public final ReorderPanelViewBinder c;

    public void ReorderPanelViewBinder$e(ReorderPanelViewBinder p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       Object[] objArray2;
       int b;
       int i2;
       b a;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, ReorderPanelViewBinder$e.class, str)) {
          return;
       }
       ReorderPanelViewBinder$e tc = this.c;
       if (tc.m == null) {
          return;
       }
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, ReorderPanelViewBinder.class, str)) {
          int i = 0;
          Object[] objArray1 = new Object[i];
          a.D().w("ReorderPanelViewBinder", "> doDelete\(\)", objArray1);
          tc.k = 3;
          ReorderPanelViewBinder q = tc.q;
          Objects.requireNonNull(q);
          ReorderViewModel reorderViewM = ReorderViewModel.class;
          if (!PatchProxy.applyVoid(objArray, q, reorderViewM, "3")) {
             Object[] objArray3 = new Object[i];
             a.D().w("ReorderViewModel", "> onDelete\(\)", objArray3);
             if (!q.i.C0()) {
                objArray2 = new Object[i];
                a.D().w("ReorderViewModel", "do picture action on illegal state", objArray2);
             }else {
                AtomicInteger obj = PatchProxy.apply(objArray, q, reorderViewM, "8");
                int i1 = 1;
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else if(q.r0() > 2 && q.i.C0()){
                   b = true;
                }else {
                   b = false;
                }
                if (b) {
                   obj = q.b.getValue();
                   b = (obj != null)? obj.get(): -1;
                   if (b < 0) {
                      i1.c(new RuntimeException("onDelete error curIndex small than 0"));
                   }else if(b == (q.f.v() - i1)){
                      i2 = b - 1;
                   }else {
                      i2 = b;
                   }
                   b uob = q.f.u(b);
                   if (uob != null) {
                      Pair pair = q.i.E0(uob.b());
                      if (q.g == null) {
                         Pair first = pair.first;
                         a.o(first, "deleteResult.first");
                         if (!first.booleanValue()) {
                            i1 = false;
                         }
                      }
                      q.g = i1;
                      q.k.s0(new e(pair, b, uob));
                      q.m.a(uob.b());
                      q.n(i2);
                      objArray1 = new Object[i];
                      a.D().w("ReorderViewModel", "onDelete curIndex:"+b+", deletedReorderData:"+uob+", deleteResult:"+pair, objArray1);
                   }else {
                      i1.c(new RuntimeException("onDelete error deletedReorderData is null"));
                   }
                }else {
                   ReorderViewModel c = q.c;
                   Objects.requireNonNull(c, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Boolean>");
                   c.setValue(Boolean.TRUE);
                }
                a = b.a;
                Objects.requireNonNull(a);
                if (!PatchProxy.applyVoid(objArray, a, b.class, "2")) {
                   s.h("DELETE_PICTURE");
                }
                objArray2 = new Object[i];
                a.D().w("ReorderViewModel", "onDelete", objArray2);
             }
          }
          objArray2 = new Object[i];
          a.D().w("ReorderPanelViewBinder", "doDelete", objArray2);
       }
       return;
    }
}
