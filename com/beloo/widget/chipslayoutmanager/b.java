package com.beloo.widget.chipslayoutmanager.b;
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
import com.beloo.widget.chipslayoutmanager.b$a;

public class b extends f	// class@000f0b
{
    public ChipsLayoutManager e;

    public void b(ChipsLayoutManager p0,m p1,f$a p2){
       super(p0, p1, p2);
       this.e = p0;
    }
    public boolean a(){
       return false;
    }
    public boolean b(){
       this.d.u();
       if (this.e.getChildCount() <= 0) {
          return false;
       }
       int decoratedLef = this.e.getDecoratedLeft(this.d.o());
       int decoratedRig = this.e.getDecoratedRight(this.d.q());
       if (!this.d.B().intValue() && (this.d.D().intValue() == (this.e.getItemCount() - 1) && (decoratedLef >= this.e.getPaddingLeft() && decoratedRig <= (this.e.getWidth() - this.e.getPaddingRight())))) {
          return false;
       }
       return this.e.b();
    }
    public RecyclerView$x c(Context p0,int p1,int p2,AnchorViewState p3){
       b$a uoa = new b$a(this, p0, p3, p1, p2);
       return v6;
    }
    public void q(int p0){
       this.e.offsetChildrenHorizontal(p0);
    }
}
