package com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder$a;
import tyc.w1;
import com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder;
import tyc.m3;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Objects;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.v3.editor.reorder.vm.ReorderViewModel;
import java.lang.Boolean;
import uwc.b;
import atc.a;
import di0.b;
import zsc.a;
import dtc.f;
import t36.f$a;
import t36.f;
import btc.b;
import k2b.s;
import ctc.c;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class ReorderPanelViewBinder$a extends w1	// class@0011ae
{
    public final ReorderPanelViewBinder p;

    public void ReorderPanelViewBinder$a(ReorderPanelViewBinder p0,m3 p1,int p2){
       this.p = p0;
       super(p1, p2);
    }
    public void B(RecyclerView$ViewHolder p0,int p1){
       int i3;
       ReorderPanelViewBinder reorderPanel1;
       b a;
       Object obj2;
       int i4;
       Object obj = this;
       ReorderPanelViewBinder$a uoa = ReorderPanelViewBinder$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), obj, uoa, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().s("ReorderPanelViewBinder", "onItemMove fromPos: "+obj.e+", toPos: "+obj.f, objArray);
       w1 e = obj.e;
       w1 f = obj.f;
       if (e == f) {
          return;
       }
       ReorderPanelViewBinder$a p = obj.p;
       int i1 = 2;
       p.k = i1;
       Objects.requireNonNull(p);
       ReorderPanelViewBinder reorderPanel = ReorderPanelViewBinder.class;
       if (!PatchProxy.isSupport(reorderPanel) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(e), Integer.valueOf(f), p, reorderPanel, "3")) {
          String str = ", ";
          char c = ')';
          Object[] objArray1 = new Object[i];
          a.D().w("ReorderPanelViewBinder", "> doMove\("+e+str+f+c, objArray1);
          if (e != f) {
             p.k = i1;
             ReorderPanelViewBinder q = p.q;
             int i2 = PostExperimentUtils.p1() ^ 0x01;
             Objects.requireNonNull(q);
             if (!PatchProxy.isSupport(ReorderViewModel.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(e), Integer.valueOf(f), Boolean.valueOf(i2), q, ReorderViewModel.class, "2")) {
                Object[] objArray3 = new Object[i];
                a.D().w("ReorderViewModel", "> onMove\("+e+str+f+str+i2+c, objArray3);
                if (!q.i.C0()) {
                   Object[] objArray4 = new Object[i];
                   a.D().w("ReorderViewModel", "do picture action on illegal state", objArray4);
                }else if(q.g == null){
                   i3 = i2;
                   reorderPanel1 = q;
                   reorderPanel1.g = b.R0(q.i, e, f, false, 4, 0);
                }else {
                   i3 = i2;
                   reorderPanel1 = q;
                   b.R0(reorderPanel1.i, e, f, false, 4, null);
                }
                reorderPanel1.e = true;
                ReorderViewModel m = reorderPanel1.m;
                Objects.requireNonNull(m);
                a uoa1 = a.class;
                if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(e), Integer.valueOf(f), m, uoa1, "5")) {
                   Object obj1 = m.b.u(e);
                   if (e < f) {
                      i2 = e + 1;
                      if (i2 <= f) {
                         obj2 = m.b.u(i2);
                         while (obj2 != null) {
                            i4 = i2 - 1;
                            b.z(m.b, i4, obj2, null, 4, null);
                            break ;
                            i2 = i2 + 1;
                         }
                         if (i2 != f) {
                            goto label_0175 ;
                         }
                      }
                   }else {
                      i2 = e - 1;
                      if (i2 >= f) {
                         obj2 = m.b.u(i2);
                         while (obj2 != null) {
                            i4 = i2 + 1;
                            b.z(m.b, i4, obj2, null, 4, null);
                            break ;
                            i2 = i2 - 1;
                         }
                         if (i2 != f) {
                            goto label_0199 ;
                         }
                      }
                   }
                   if (obj1 != null) {
                      b.z(m.b, f, obj1, null, 4, null);
                   }
                }
                reorderPanel1.k.s0(new f(e, f));
                if (i3) {
                   reorderPanel1.n(f);
                }
                a = b.a;
                Objects.requireNonNull(a);
                if (!PatchProxy.applyVoid(null, a, b.class, "3")) {
                   s.h("CHANGE_PICTURE_INDEX");
                }
                Object[] objArray5 = new Object[0];
                a.D().w("ReorderViewModel", "onMove originAssetIndex:"+e+", newAssetIndex:"+f, objArray5);
             }
             if (PostExperimentUtils.p1()) {
                p.c.postDelayed(new c(p, f), 300);
             }
             Object[] objArray2 = new Object[0];
             a.D().w("ReorderPanelViewBinder", "doMove: start: "+e+", end: "+f, objArray2);
          }
       }
       return;
    }
}
