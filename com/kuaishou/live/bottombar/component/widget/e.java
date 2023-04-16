package com.kuaishou.live.bottombar.component.widget.e;
import com.kuaishou.live.bottombar.component.widget.c;
import androidx.lifecycle.LifecycleOwner;
import w61.c;
import ok.x;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import o61.b;
import android.widget.GridLayout;
import java.lang.Integer;
import z61.b;
import android.view.View;
import java.util.Map;
import n61.b;
import com.kwai.robust.PatchProxyResult;
import android.widget.GridLayout$LayoutParams;
import android.widget.GridLayout$Spec;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.bottombar.component.widget.a$a;
import android.view.ViewGroup;
import y61.a;
import android.view.LayoutInflater;
import android.content.Context;

public class e extends c	// class@000d4a
{

    public void e(LifecycleOwner p0,c p1,x p2){
       super(p0, p1, p2);
    }
    public void H(boolean p0,List p1,List p2){
       b uob;
       GridLayout$LayoutParams layoutParams;
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, p2, this, e.class, "2")) {
          return;
       }
       if (this.i == null) {
          return;
       }
       if (!q.f(p2)) {
          Iterator iterator = p2.iterator();
          while (iterator.hasNext()) {
             uob = iterator.next();
             if (uob != null) {
                this.E(uob);
             }
          }
       }
       this.i.removeAllViews();
       c ti = this.i;
       int i = p1.size();
       int i1 = i / 5;
       if (i > (i1 * 5)) {
          i1 = i1 + 1;
       }
       ti.setRowCount(i1);
       int i2 = 0;
       while (i2 < p1.size()) {
          uob = p1.get(i2);
          if (uob != null) {
             c uoc = this.i;
             if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidThreeRefs(uoc, uob, Integer.valueOf(i2), this, e.class, "3")) {
                b uob1 = this.C(uob);
                if (uob1 != null) {
                   View view = uob.f();
                   if (view != null) {
                      b.a(uob1.mFeatureId, view, this.e);
                      b uob2 = this.e.get(Integer.valueOf(uob1.mFeatureId));
                      if (PatchProxy.isSupport(e.class)) {
                         layoutParams = PatchProxy.applyOneRefs(Integer.valueOf(i2), this, e.class, "4");
                         if (layoutParams != PatchProxyResult.class) {
                         label_00d0 :
                            uoc.addView(view, layoutParams);
                            c tl = this.l;
                            if (tl != null) {
                               tl.a(uob);
                            }
                            if (uob2 == null) {
                               this.G(uob1);
                               this.e.put(Integer.valueOf(uob1.mFeatureId), uob);
                            }
                         }
                      }
                      layoutParams = new GridLayout$LayoutParams();
                      int i3 = i2 % 5;
                      layoutParams.columnSpec = GridLayout.spec(i3);
                      i3 = i2 / 5;
                      layoutParams.rowSpec = GridLayout.spec(i3);
                      goto label_00d0 ;
                   }
                }
             }
          }
          i2++;
       }
       return;
    }
    public int[] I1(boolean p0,int p1,int p2){
       c obj;
       if (PatchProxy.isSupport(e.class)) {
          obj = PatchProxy.applyThreeRefs(Boolean.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, e.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.i;
       if (obj == null) {
          return null;
       }else {
          View view = b.b(obj, p1);
          if (view == null) {
             return null;
          }else {
             return a.a(view, p2);
          }
       }
    }
    public ViewGroup t(LayoutInflater p0,ViewGroup p1){
       GridLayout gridLayout = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "1");
       if (gridLayout != PatchProxyResult.class) {
       }else {
          gridLayout = new GridLayout(p1.getContext());
          gridLayout.setColumnCount(5);
          gridLayout.setUseDefaultMargins(false);
       }
       return gridLayout;
    }
}
