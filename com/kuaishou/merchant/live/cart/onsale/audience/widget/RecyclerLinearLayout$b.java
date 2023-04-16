package com.kuaishou.merchant.live.cart.onsale.audience.widget.RecyclerLinearLayout$b;
import androidx.recyclerview.widget.RecyclerView$i;
import com.kuaishou.merchant.live.cart.onsale.audience.widget.RecyclerLinearLayout;
import com.kuaishou.merchant.live.cart.onsale.audience.widget.RecyclerLinearLayout$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import java.lang.Integer;

public class RecyclerLinearLayout$b extends RecyclerView$i	// class@0019a6
{
    public final RecyclerLinearLayout a;

    public void RecyclerLinearLayout$b(RecyclerLinearLayout p0){
       this.a = p0;
       super();
    }
    public void RecyclerLinearLayout$b(RecyclerLinearLayout p0,RecyclerLinearLayout$a p1){
       super(p0);
    }
    public void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RecyclerLinearLayout$b.class, "1")) {
          return;
       }
       this.a.removeAllViews();
       RecyclerLinearLayout$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, RecyclerLinearLayout.class, "6") && ta.b != null) {
          int i = 0;
          while (i < ta.b.getItemCount()) {
             RecyclerView$ViewHolder viewHolder = ta.a(i);
             if (viewHolder != null) {
                ta.b.Z(viewHolder, i);
                ta.addView(viewHolder.itemView);
             }
             i = i + 1;
          }
       }
       return;
    }
    public void h(int p0,int p1){
       RecyclerLinearLayout$b uob = RecyclerLinearLayout$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "2")) {
          return;
       }
       this.a.c(p0, p1);
       return;
    }
    public void i(int p0,int p1,Object p2){
       if (PatchProxy.isSupport(RecyclerLinearLayout$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, RecyclerLinearLayout$b.class, "3")) {
          return;
       }
       this.a.c(p0, p1);
       return;
    }
    public void j(int p0,int p1){
       RecyclerLinearLayout$b uob = RecyclerLinearLayout$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "4")) {
          return;
       }
       uob = this.a;
       Objects.requireNonNull(uob);
       if (!PatchProxy.isSupport(RecyclerLinearLayout.class) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), uob, RecyclerLinearLayout.class, "8") && uob.b != null)) {
          p1 = p1 + p0;
          while (p0 < p1) {
             RecyclerView$ViewHolder viewHolder = uob.a(p0);
             if (viewHolder != null) {
                uob.b.Z(viewHolder, p0);
                uob.addView(viewHolder.itemView, p0);
             }
             p0++;
          }
          uob.c(p1, (uob.b.getItemCount() - p1));
       }
       return;
    }
    public void k(int p0,int p1,int p2){
       if (PatchProxy.isSupport(RecyclerLinearLayout$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, RecyclerLinearLayout$b.class, "6")) {
          return;
       }
       this.g();
       return;
    }
    public void l(int p0,int p1){
       RecyclerLinearLayout$b uob = RecyclerLinearLayout$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uob, "5")) {
          return;
       }
       uob = this.a;
       Objects.requireNonNull(uob);
       if (!PatchProxy.isSupport(RecyclerLinearLayout.class) || (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), uob, RecyclerLinearLayout.class, "9") && uob.b != null)) {
          uob.removeViews(p0, p1);
          uob.c(p0, (uob.b.getItemCount() - p0));
       }
       return;
    }
}
