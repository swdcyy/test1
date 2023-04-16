package com.kwai.library.widget.viewpager.GridViewPager$d;
import android.widget.BaseAdapter;
import com.kwai.library.widget.viewpager.GridViewPager;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup;

public class GridViewPager$d extends BaseAdapter	// class@000a69
{
    public int b;
    public int c;
    public BaseAdapter d;
    public final GridViewPager e;

    public void GridViewPager$d(GridViewPager p0,int p1,int p2,BaseAdapter p3){
       this.e = p0;
       super();
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public int getCount(){
       GridViewPager$d tc = this.c;
       if (!(this.d.getCount() % tc)) {
          return tc;
       }
       GridViewPager$d tc1 = this.c;
       if (this.b < (this.d.getCount() / tc1)) {
          return tc1;
       }
       return (this.d.getCount() % this.c);
    }
    public Object getItem(int p0){
       return this.d.getItem(((this.b * this.c) + p0));
    }
    public long getItemId(int p0){
       return this.d.getItemId(((this.b * this.c) + p0));
    }
    public View getView(int p0,View p1,ViewGroup p2){
       return this.d.getView(((this.b * this.c) + p0), p1, p2);
    }
}
