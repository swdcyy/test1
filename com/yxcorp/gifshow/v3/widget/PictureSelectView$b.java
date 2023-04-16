package com.yxcorp.gifshow.v3.widget.PictureSelectView$b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.v3.widget.PictureSelectView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Runnable;
import android.view.ViewGroup;
import axc.x;
import t36.f$a;
import t36.f;
import com.yxcorp.gifshow.v3.widget.e;

public class PictureSelectView$b extends RecyclerView$r	// class@001658
{
    public final PictureSelectView a;

    public void PictureSelectView$b(PictureSelectView p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       PictureSelectView$b uob = PictureSelectView$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       if (!p1) {
          this.a.P = false;
       }
       PictureSelectView$b ta = this.a;
       if (p1 == ta.Q) {
          return;
       }else {
          ta.Q = p1;
          boolean b = (p1 == 1 || p1 == 2)? true: false;
          ta.O = b;
          if (!p1) {
             ta.L = false;
             ta = this.a;
             if (ta.M != null) {
                ta.O(false);
             }else if(ta.K == null){
                ta = this.a;
                if (ta.N == null) {
                   ta.B.post(ta.S);
                }
             }
             this.a.I.s0(new x(this));
             this.a.Y();
             ta = this.a;
             ta.M = false;
             ta.N = false;
          }
          if (p1 == 1) {
             this.a.I.s0(e.a);
          }
          if (p0.getScrollState() != 2) {
             p0.K = false;
          }
          return;
       }
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(PictureSelectView$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, PictureSelectView$b.class, "2")) {
          return;
       }
       if (this.a.K == null) {
          this.a.Y();
       }
       return;
    }
}
