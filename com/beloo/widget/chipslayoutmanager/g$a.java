package com.beloo.widget.chipslayoutmanager.g$a;
import androidx.recyclerview.widget.o;
import com.beloo.widget.chipslayoutmanager.g;
import android.content.Context;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import android.graphics.PointF;
import java.lang.Integer;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$x$a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.animation.LinearInterpolator;
import android.view.animation.Interpolator;

public class g$a extends o	// class@000f13
{
    public final AnchorViewState q;
    public final int r;
    public final int s;
    public final g t;

    public void g$a(g p0,Context p1,AnchorViewState p2,int p3,int p4){
       this.t = p0;
       this.q = p2;
       this.r = p3;
       this.s = p4;
       super(p1);
    }
    public PointF a(int p0){
       float f = (this.r > this.q.c().intValue())? 0x3f800000: 0xbf800000;
       return new PointF(0, f);
    }
    public void o(View p0,RecyclerView$y p1,RecyclerView$x$a p2){
       super.o(p0, p1, p2);
       p2.f(0, (this.t.e.getDecoratedTop(p0) - this.t.e.getPaddingTop()), this.s, new LinearInterpolator());
    }
}