package com.kwai.library.widget.viewpager.GridViewPager;
import androidx.viewpager.widget.ViewPager;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.library.widget.viewpager.GridViewPager$c;
import android.view.ViewGroup;
import ll8.c$b;
import android.content.res.TypedArray;
import java.util.ArrayList;
import java.util.List;
import com.kwai.library.widget.viewpager.GridViewPager$a;
import androidx.viewpager.widget.ViewPager$j;
import com.kwai.library.widget.viewpager.GridViewPager$b;
import android.app.Activity;
import android.widget.BaseAdapter;
import android.view.View;
import java.lang.Math;
import java.lang.Object;
import com.kwai.library.widget.viewpager.GridViewPager$BGGridView;
import android.widget.ListAdapter;
import com.kwai.library.widget.viewpager.GridViewPager$d;
import com.kwai.library.widget.viewpager.GridViewPager$e;
import h3.a;
import android.view.MotionEvent;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import androidx.viewpager.widget.ViewPager$LayoutParams;
import android.os.Parcelable;
import android.os.Bundle;
import java.lang.String;
import android.database.DataSetObserver;
import android.widget.TextView;

public class GridViewPager extends ViewPager	// class@000a6b
{
    public List b;
    public int c;
    public int d;
    public float e;
    public float f;
    public float g;
    public float h;
    public BaseAdapter i;
    public View j;
    public int k;
    public int l;
    public int m;
    public GridViewPager$e n;
    public ViewPager$j o;
    public DataSetObserver p;

    public void GridViewPager(Context p0){
       super(p0, null);
    }
    public void GridViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = null;
       this.c = 0;
       this.d = 0;
       this.e = 0;
       this.f = 0;
       this.g = 0;
       this.h = 0;
       this.j = null;
       this.k = 0;
       this.l = 0;
       int i = -1;
       this.m = i;
       this.p = new GridViewPager$c(this);
       if (p1 != null) {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p1, c$b.a1);
          int indexCount = typedArray.getIndexCount();
          int i1 = 0;
          int i2 = 3;
          while (i1 < indexCount) {
             int index = typedArray.getIndex(i1);
             if (index == 4) {
                this.d = typedArray.getInt(index, i);
             }else if(index == 8){
                this.c = typedArray.getInt(index, i);
             }else if(index == i2){
                this.g = typedArray.getDimension(index, 0);
             }else if(index == 0.00f){
                this.h = typedArray.getDimension(index, 0);
             }else {
                float f = 0xbf800000;
                if (index == 0.00f) {
                   this.e = typedArray.getDimension(index, f);
                }else if(index == 0.00f){
                   this.f = typedArray.getDimension(index, f);
                }else if(!index){
                   this.setPadding(typedArray.getDimensionPixelSize(index, 0), typedArray.getDimensionPixelSize(index, 0), typedArray.getDimensionPixelSize(index, 0), typedArray.getDimensionPixelSize(index, 0));
                }else if(index == 1){
                   this.k = typedArray.getDimensionPixelSize(index, 0);
                }else if(index == 2){
                   this.l = typedArray.getDimensionPixelSize(index, 0);
                }
             }
             i1 = i1 + 1;
          }
          if (this.d <= null && this.e <= 0) {
             this.d = 2;
          }
          if (this.c <= null && this.f <= 0) {
             this.c = i2;
          }
          typedArray.recycle();
       }
       this.b = new ArrayList();
       return;
    }
    private int getClientWidth(){
       return ((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight());
    }
    public int getPageCount(){
       return this.b.size();
    }
    public int getPageSize(){
       return (this.d * this.c);
    }
    public int getSelection(){
       return (this.getCurrentItem() * this.getPageSize());
    }
    public void i(boolean p0){
       if (p0) {
          this.setOverScrollMode(2);
          this.setPageTransformer(false, new GridViewPager$a(this));
       }else {
          this.setOverScrollMode(false);
          this.setPageTransformer(false, new GridViewPager$b(this));
       }
       return;
    }
    public boolean j(){
       boolean requestedOri = this.getContext().getRequestedOrientation();
       requestedOri = (requestedOri && (requestedOri == 8 || requestedOri == 6))? true: false;
       return requestedOri;
    }
    public void k(){
       GridViewPager tj;
       GridViewPager$BGGridView uBGGridView;
       int i = this.d * this.c;
       if (i <= 0) {
          return;
       }
       int i1 = 0;
       if (!this.i.getCount()) {
          this.b.clear();
          tj = this.j;
          if (tj != null) {
             tj.setVisibility(i1);
          }
       }else {
          tj = this.j;
          if (tj != null) {
             tj.setVisibility(8);
          }
       }
       int i2 = this.i.getCount() / i;
       if (!(this.i.getCount() % i)) {
          i2 = i2 - 1;
       }
       int i3 = this.b.size() - 1;
       while (i1 <= Math.max(i3, i2)) {
          if (i1 <= i3 && i1 <= i2) {
             uBGGridView = this.b.get(i1);
             if (uBGGridView.getAdapter() != null) {
                int i4 = this.d * this.c;
                if (uBGGridView.getAdapter().getCount() == i4) {
                   uBGGridView.getAdapter().notifyDataSetChanged();
                label_007f :
                   this.b.set(i1, uBGGridView);
                }
             }
             uBGGridView.setAdapter(new GridViewPager$d(this, i1, i, this.i));
             goto label_007f ;
          }else if(i1 > i3 && i1 <= i2){
             uBGGridView = new GridViewPager$BGGridView(this);
             uBGGridView.setAdapter(new GridViewPager$d(this, i1, i, this.i));
             this.b.add(uBGGridView);
          }else if(i1 > i2 && i1 <= i3){
             int i5 = i2 + 1;
             this.b.remove(i5);
          }
          i1 = i1 + 1;
       }
       GridViewPager tn = this.n;
       if (tn == null) {
          GridViewPager$e uoe = new GridViewPager$e(this);
          this.n = uoe;
          super.setAdapter(uoe);
       }else {
          tn.q();
       }
       tn = this.m;
       if (tn >= null) {
          this.setSelection(tn);
       }
       return;
    }
    public final MotionEvent l(MotionEvent p0){
       p0.setLocation((p0.getY() * 2.00f), (p0.getX() / 2.00f));
       return p0;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       if (!this.j()) {
          return super.onInterceptTouchEvent(p0);
       }
       this.l(p0);
       this.l(p0);
       return super.onInterceptTouchEvent(p0);
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       GridViewPager td = this.d;
       GridViewPager tc = this.c;
       if (this.e > 0) {
          GridViewPager tg = this.g;
          this.d = (int)Math.floor((double)(((((float)View$MeasureSpec.getSize(p0) + tg) - (float)this.k) - (float)this.l) / (this.e + tg)));
       }
       if (this.f > 0) {
          GridViewPager th = this.h;
          this.c = (int)Math.floor((double)(((float)View$MeasureSpec.getSize(p1) + th) / (this.f + th)));
       }
       if (tc != this.c || td != this.d) {
          this.k();
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       super.onPageScrolled(p0, p1, p2);
       if (this.o != null) {
          p0 = this.getScrollX();
          int childCount = this.getChildCount();
          p2 = 0;
          while (p2 < childCount) {
             View childAt = this.getChildAt(p2);
             if (childAt.getLayoutParams().a == null) {
                int i = childAt.getLeft() - p0;
                float f = (float)i / (float)this.getClientWidth();
                this.o.a(childAt, f);
             }
             p2++;
          }
       }
       return;
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (p0 instanceof Bundle) {
          this.m = p0.getInt("selection");
          p0 = p0.getParcelable("instanceState");
       }
       super.onRestoreInstanceState(p0);
       return;
    }
    public Parcelable onSaveInstanceState(){
       Bundle uBundle = new Bundle();
       uBundle.putParcelable("instanceState", super.onSaveInstanceState());
       uBundle.putInt("selection", this.getSelection());
       return uBundle;
    }
    public boolean onTouchEvent(MotionEvent p0){
       if (!this.j()) {
          return super.onTouchEvent(p0);
       }
       this.l(p0);
       return super.onTouchEvent(p0);
    }
    public void setAdapter(BaseAdapter p0){
       GridViewPager ti = this.i;
       if (ti != null) {
          ti.unregisterDataSetObserver(this.p);
       }
       this.i = p0;
       p0.registerDataSetObserver(this.p);
       this.b.clear();
       this.n = null;
       this.k();
       return;
    }
    public void setColumnNumber(int p0){
       this.d = p0;
    }
    public void setEmptyView(TextView p0){
       this.j = p0;
    }
    public void setPadding(int p0,int p1,int p2,int p3){
       this.k = p0;
       this.l = p2;
       super.setPadding(0, p1, 0, p3);
    }
    public void setPageTransformer(boolean p0,ViewPager$j p1){
       super.setPageTransformer(p0, null);
       this.o = p1;
    }
    public void setRowMargin(float p0){
       this.h = p0;
    }
    public void setRowNumber(int p0){
       this.c = p0;
    }
    public void setSelection(int p0){
       int pageSize = this.getPageSize();
       if (this.i == null || pageSize <= 0) {
          this.m = p0;
          return;
       }else {
          this.m = -1;
          this.setCurrentItem((p0 / pageSize), true);
          return;
       }
    }
}
