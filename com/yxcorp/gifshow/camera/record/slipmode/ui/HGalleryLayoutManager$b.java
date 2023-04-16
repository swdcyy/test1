package com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import androidx.recyclerview.widget.p;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$e;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$g;

public class HGalleryLayoutManager$b extends RecyclerView$r	// class@000f25
{
    public int a;
    public boolean b;
    public final HGalleryLayoutManager c;

    public void HGalleryLayoutManager$b(HGalleryLayoutManager p0){
       this.c = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       HGalleryLayoutManager k;
       HGalleryLayoutManager$b uob = HGalleryLayoutManager$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "2")) {
          return;
       }
       this.a = p1;
       boolean b = true;
       if (!p1) {
          View view = this.c.l.h(p0.getLayoutManager());
          boolean b1 = false;
          if (view != null) {
             int position = p0.getLayoutManager().getPosition(view);
             HGalleryLayoutManager$b tc = this.c;
             HGalleryLayoutManager h = tc.h;
             if (position != h) {
                HGalleryLayoutManager i = tc.i;
                if (i != null) {
                   i.setSelected(b1);
                }
                this.c.i = view;
                view.setSelected(b);
                uob = this.c;
                uob.h = position;
                k = uob.k;
                if (k != null) {
                   k.a(p0, view, position);
                }
             }else {
                k = tc.k;
                if (k != null && this.b != null) {
                   this.b = b1;
                   k.a(p0, view, h);
                }
             }
          }else {
             Object[] objArray = new Object[b1];
             a.D().A("HGalleryLayoutManager", "onScrollStateChanged: snap null", objArray);
          }
       }else if(p1 == b){
          p0.r = b;
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(HGalleryLayoutManager$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, HGalleryLayoutManager$b.class, "1")) {
          return;
       }
       boolean b = false;
       if (this.a == true) {
          HGalleryLayoutManager$b tc = this.c;
          HGalleryLayoutManager j = tc.j;
          if (j != null && tc.r != null) {
             j.a(tc.h);
             tc.r = b;
          }
       }
       View view = this.c.l.h(p0.getLayoutManager());
       if (view != null) {
          HGalleryLayoutManager$b tc1 = this.c;
          if (tc1.i == null) {
             tc1.i = view;
             view.setSelected(true);
          }
          int position = p0.getLayoutManager().getPosition(view);
          HGalleryLayoutManager$b tc2 = this.c;
          if (position != tc2.h) {
             HGalleryLayoutManager i = tc2.i;
             if (i != null) {
                i.setSelected(b);
             }
             this.c.i = view;
             view.setSelected(true);
             tc2 = this.c;
             tc2.h = position;
             if (this.a == null) {
                i = tc2.k;
                if (i != null) {
                   i.a(p0, view, position);
                   b = true;
                }
             }
          }
       label_007b :
          if (this.a != null && !b) {
             this.b = true;
          }
       }
    label_0083 :
       return;
    }
}
