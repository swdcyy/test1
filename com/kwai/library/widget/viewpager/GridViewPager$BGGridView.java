package com.kwai.library.widget.viewpager.GridViewPager$BGGridView;
import android.widget.AdapterView;
import com.kwai.library.widget.viewpager.GridViewPager;
import android.content.Context;
import android.view.ViewGroup;
import com.kwai.library.widget.viewpager.GridViewPager$BGGridView$a;
import android.widget.ListAdapter;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.Adapter;
import android.view.View$MeasureSpec;
import android.database.DataSetObserver;

public class GridViewPager$BGGridView extends AdapterView	// class@000a65
{
    public ListAdapter b;
    public DataSetObserver c;
    public final GridViewPager d;

    public void GridViewPager$BGGridView(GridViewPager p0){
       this.d = p0;
       super(p0.getContext());
       this.c = new GridViewPager$BGGridView$a(this);
    }
    public void a(){
       int childCount = this.getChildCount();
       int count = this.b.getCount();
       for (int i = 0; i < childCount && i < count; i = i + 1) {
          this.b.getView(i, this.getChildAt(i), this);
       }
       for (i = childCount; i < count; i = i + 1) {
          this.addViewInLayout(this.b.getView(i, null, this), i, new ViewGroup$LayoutParams(0, 0));
       }
       childCount = childCount - count;
       if (childCount > 0) {
          this.removeViewsInLayout(count, childCount);
       }
       return;
    }
    public Adapter getAdapter(){
       return this.getAdapter();
    }
    public ListAdapter getAdapter(){
       return this.b;
    }
    public int getPaddingLeft(){
       return this.d.k;
    }
    public int getPaddingRight(){
       return this.d.l;
    }
    public View getSelectedView(){
       if (this.getChildCount() > 0) {
          return this.getChildAt(0);
       }
       return null;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int childCount = this.getChildCount();
       p1 = this.getPaddingTop();
       p2 = 0;
       p3 = 0;
       while (p2 < childCount) {
          GridViewPager$BGGridView td = this.d;
          int i = td.d * td.c;
          if (p2 < i) {
             View childAt = this.getChildAt(p2);
             i = p2 % this.d.d;
             if (!i) {
                p3 = this.getPaddingLeft();
             }
             ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
             int i1 = layoutParams.width + p3;
             int i2 = layoutParams.height + p1;
             childAt.layout(p3, p1, i1, i2);
             GridViewPager$BGGridView td1 = this.d;
             float f = (float)layoutParams.width + td1.g;
             float f1 = (float)p3 + f;
             f = td1.d - 1;
             if (i == f) {
                f = (float)layoutParams.height + td1.h;
                float f2 = (float)p1 + f;
                f2 = (int)f2;
             }
             p2++;
          }else {
             break ;
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       GridViewPager$BGGridView td = this.d;
       int i = (int)((((float)View$MeasureSpec.getSize(p0) - (td.g * (float)(td.d - 1))) - (float)this.getPaddingLeft()) - (float)this.getPaddingRight()) / this.d.d;
       GridViewPager$BGGridView td1 = this.d;
       GridViewPager c = td1.c;
       int i1 = (int)((float)View$MeasureSpec.getSize(p1) - (td1.h * (float)(c - 1))) / c;
       for (int i2 = 0; i2 < this.getChildCount(); i2 = i2 + 1) {
          View childAt = this.getChildAt(i2);
          ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
          layoutParams.width = i;
          layoutParams.height = i1;
          childAt.measure(View$MeasureSpec.makeMeasureSpec(i, 0x40000000), View$MeasureSpec.makeMeasureSpec(i1, 0x40000000));
       }
       this.setMeasuredDimension(AdapterView.getDefaultSize(this.getSuggestedMinimumWidth(), p0), AdapterView.getDefaultSize(this.getSuggestedMinimumHeight(), p1));
       return;
    }
    public void setAdapter(Adapter p0){
       this.setAdapter(p0);
    }
    public void setAdapter(ListAdapter p0){
       GridViewPager$BGGridView tb = this.b;
       if (tb != null) {
          GridViewPager$BGGridView tc = this.c;
          if (tc != null) {
             tb.unregisterDataSetObserver(tc);
          }
       }
       this.b = p0;
       p0.registerDataSetObserver(this.c);
       this.a();
       return;
    }
    public void setSelection(int p0){
    }
}
