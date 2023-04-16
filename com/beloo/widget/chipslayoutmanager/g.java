package com.beloo.widget.chipslayoutmanager.g;
import com.beloo.widget.chipslayoutmanager.f;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
import t9.m;
import com.beloo.widget.chipslayoutmanager.f$a;
import t9.g;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import java.lang.Integer;
import android.content.Context;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import androidx.recyclerview.widget.RecyclerView$x;
import com.beloo.widget.chipslayoutmanager.g$a;

public class g extends f	// class@000f14
{
    public ChipsLayoutManager e;

    public void g(ChipsLayoutManager p0,m p1,f$a p2){
       super(p0, p1, p2);
       this.e = p0;
    }
    public boolean a(){
       this.d.u();
       if (this.e.getChildCount() <= 0) {
          return false;
       }
       int decoratedTop = this.e.getDecoratedTop(this.d.b());
       int decoratedBot = this.e.getDecoratedBottom(this.d.a());
       if (!this.d.B().intValue() && (this.d.D().intValue() == (this.e.getItemCount() - 1) && (decoratedTop >= this.e.getPaddingTop() && decoratedBot <= (this.e.getHeight() - this.e.getPaddingBottom())))) {
          return false;
       }
       return this.e.b();
    }
    public boolean b(){
       return false;
    }
    public RecyclerView$x c(Context p0,int p1,int p2,AnchorViewState p3){
       g$a uoa = new g$a(this, p0, p3, p1, p2);
       return v6;
    }
    public void q(int p0){
       this.e.offsetChildrenVertical(p0);
    }
}
