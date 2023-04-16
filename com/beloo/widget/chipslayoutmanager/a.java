package com.beloo.widget.chipslayoutmanager.a;
import com.beloo.widget.chipslayoutmanager.d;
import t9.g;
import p9.a;
import t9.m;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$t;
import java.lang.Integer;
import java.util.Iterator;
import p9.a$a;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import java.lang.Math;
import com.beloo.widget.chipslayoutmanager.a$a;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.util.SparseArray;

public class a implements d	// class@000f07
{
    public g a;
    public a b;
    public m c;
    public int d;

    public void a(g p0,a p1,m p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public int a(RecyclerView$t p0){
       int i = Integer.MAX_VALUE;
       Integer integer = Integer.valueOf(i);
       Integer integer1 = Integer.valueOf(Integer.MIN_VALUE);
       Iterator iterator = this.b.iterator();
       Iterator iterator1 = iterator;
       int i1 = 0;
       while (iterator1.hasNext()) {
          View view = iterator1.next();
          RecyclerView$LayoutParams layoutParams = view.getLayoutParams();
          if (!layoutParams.isItemRemoved()) {
             int i2 = p0.f(layoutParams.getViewLayoutPosition());
             if (i2 < this.a.B().intValue() || i2 > this.a.D().intValue()) {
                i1 = 1;
             }
          }
          if (layoutParams.isItemRemoved() || i1) {
             int i3 = this.d + 1;
             this.d = i3;
             integer = Integer.valueOf(Math.min(integer.intValue(), this.c.d(view)));
             integer1 = Integer.valueOf(Math.max(integer1.intValue(), this.c.c(view)));
          }
       }
       if (integer.intValue() != i) {
          i1 = integer1.intValue() - integer.intValue();
       }
       return i1;
    }
    public int b(){
       return this.d;
    }
    public a$a c(RecyclerView$t p0){
       a$a uoa = new a$a(this);
       Iterator iterator = p0.k().iterator();
       while (iterator.hasNext()) {
          RecyclerView$ViewHolder itemView = iterator.next().itemView;
          RecyclerView$LayoutParams layoutParams = itemView.getLayoutParams();
          if (!layoutParams.isItemRemoved()) {
             if (layoutParams.getViewAdapterPosition() < this.a.B().intValue()) {
                uoa.a.put(layoutParams.getViewAdapterPosition(), itemView);
             }else if(layoutParams.getViewAdapterPosition() > this.a.D().intValue()){
                uoa.b.put(layoutParams.getViewAdapterPosition(), itemView);
             }
          }
       }
       return uoa;
    }
    public void reset(){
       this.d = 0;
    }
}
