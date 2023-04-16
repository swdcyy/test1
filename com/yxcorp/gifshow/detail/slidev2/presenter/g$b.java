package com.yxcorp.gifshow.detail.slidev2.presenter.g$b;
import android.view.ViewGroup$OnHierarchyChangeListener;
import android.view.View$OnLayoutChangeListener;
import z1.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import b8a.t;
import java.lang.Runnable;

public final class g$b implements ViewGroup$OnHierarchyChangeListener, View$OnLayoutChangeListener	// class@0019ae
{
    public final a b;
    public final int c;
    public View d;
    public ViewGroup e;

    public void g$b(a p0){
       super();
       this.c = 0x7f0a2908;
       this.b = p0;
    }
    public void onChildViewAdded(View p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g$b.class, "3")) {
          return;
       }
       if (p1.getId() == this.c) {
          this.d = p1;
          p1.addOnLayoutChangeListener(this);
       }
       return;
    }
    public void onChildViewRemoved(View p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g$b.class, "4")) {
          return;
       }
       g$b td = this.d;
       if (p1 == td) {
          td.removeOnLayoutChangeListener(this);
          this.d = null;
       }
       return;
    }
    public void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(g$b.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, g$b.class, "5")) {
             return;
          }
       }
       if ((p3 - p1) > 0 && (p4 - p2) > 0) {
          p0.post(new t(this, p0));
          p0.removeOnLayoutChangeListener(this);
       }
       return;
    }
}
