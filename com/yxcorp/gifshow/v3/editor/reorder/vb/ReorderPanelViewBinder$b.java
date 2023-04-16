package com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder$b;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder;
import java.lang.Object;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.kotlin.livedata.ListHolder$UpdateType;
import ctc.a;
import java.lang.Enum;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import g9c.a;
import java.util.List;
import java.util.Collection;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import ysc.a$b;
import android.view.View;
import java.lang.Float;
import btc.a;
import zsc.b;

public final class ReorderPanelViewBinder$b implements Observer	// class@0011af
{
    public final ReorderPanelViewBinder b;

    public void ReorderPanelViewBinder$b(ReorderPanelViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReorderPanelViewBinder$b.class, "1")) {
       }else {
          int i = p0.b();
          ListHolder$UpdateType updateType = p0.e();
          if (updateType != null) {
             int i1 = a.a[updateType.ordinal()];
             int i2 = 0;
             int i3 = 1;
             if (i1 != i3) {
                if (i1 != 2) {
                   if (i1 != 3) {
                      if (i1 == 4) {
                         if (a.g(p0.d(), Integer.valueOf(i3))) {
                            this.b.i.M0();
                            this.b.i.L0(p0.c());
                         }else {
                            int i4 = p0.f();
                            while (i2 < i4) {
                               a$b uob = this.b.c.findViewHolderForLayoutPosition(i2);
                               if (uob != null) {
                                  uob.a();
                               }
                               i2 = i2 + 1;
                            }
                         }
                      }
                   }else {
                      this.b.i.J0(i, p0.c().get(i));
                   }
                }else {
                   p0 = this.b.c.findViewHolderForLayoutPosition(i);
                   Float uFloat = null;
                   p0 = (p0 != null)? p0.itemView: uFloat;
                   Float uFloat1 = (p0 != null)? Float.valueOf((float)(p0.getHeight() >> i3)): uFloat;
                   if (p0 != null) {
                      uFloat = Float.valueOf((float)(p0.getWidth() >> i3));
                   }
                   if (uFloat != null && uFloat1 != null) {
                      p0 = this.b.l;
                      if (p0 != null) {
                         p0.v = uFloat.floatValue();
                         p0.w = uFloat1.floatValue();
                      }
                   }
                   this.b.i.S0(i);
                }
             }else {
                p0 = p0.c().get(i);
                a$b uob1 = this.b.c.findViewHolderForLayoutPosition(i);
                this.b.i.Q0().set(i, p0);
                if (uob1 != null) {
                   uob1.b(p0, i2);
                }
             }
          }
       }
       return;
    }
}
