package com.kwai.library.widget.viewpager.GridViewPager$e;
import h3.a;
import com.kwai.library.widget.viewpager.GridViewPager;
import android.view.ViewGroup;
import java.lang.Object;
import android.view.View;
import java.util.List;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;

public class GridViewPager$e extends a	// class@000a6a
{
    public final GridViewPager d;

    public void GridViewPager$e(GridViewPager p0){
       this.d = p0;
       super();
    }
    public void h(ViewGroup p0,int p1,Object p2){
       p0.removeView(p2);
    }
    public int j(){
       return this.d.b.size();
    }
    public Object o(ViewGroup p0,int p1){
       p0.addView(this.d.b.get(p1), new LinearLayout$LayoutParams(-1, -2));
       return this.d.b.get(p1);
    }
    public boolean p(View p0,Object p1){
       boolean b = (p0 == p1)? true: false;
       return b;
    }
}
