package com.kwai.library.widget.deprecated.HorizontalListView$d;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.kwai.library.widget.deprecated.HorizontalListView;
import android.view.MotionEvent;
import android.widget.Scroller;
import com.kwai.library.widget.deprecated.HorizontalListView$OnScrollStateChangedListener$ScrollState;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemLongClickListener;
import android.widget.ListAdapter;
import java.lang.Boolean;
import java.lang.Math;
import e2.c;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View$OnClickListener;

public class HorizontalListView$d extends GestureDetector$SimpleOnGestureListener	// class@000917
{
    public final HorizontalListView b;

    public void HorizontalListView$d(HorizontalListView p0){
       this.b = p0;
       super();
    }
    public boolean onDown(MotionEvent p0){
       HorizontalListView$d tb = this.b;
       tb.B = tb.b.isFinished() ^ 1;
       tb.b.forceFinished(1);
       tb.setCurrentScrollState(HorizontalListView$OnScrollStateChangedListener$ScrollState.SCROLL_STATE_IDLE);
       tb.n();
       if (tb.B == null) {
          int i = tb.e((int)p0.getX(), (int)p0.getY());
          if (i >= 0) {
             View childAt = tb.getChildAt(i);
             tb.j = childAt;
             if (childAt != null) {
                childAt.setPressed(1);
                tb.refreshDrawableState();
             }
          }
       }
       return 1;
    }
    public boolean onFling(MotionEvent p0,MotionEvent p1,float p2,float p3){
       HorizontalListView$d tb = this.b;
       tb.b.fling(tb.n, 0, (int)(- p2), 0, 0, tb.p, 0, 0);
       tb.setCurrentScrollState(HorizontalListView$OnScrollStateChangedListener$ScrollState.SCROLL_STATE_FLING);
       tb.requestLayout();
       return true;
    }
    public void onLongPress(MotionEvent p0){
       this.b.n();
       int i = this.b.e((int)p0.getX(), (int)p0.getY());
       if (i >= 0) {
          HorizontalListView$d tb = this.b;
          if (tb.B == null) {
             View childAt = tb.getChildAt(i);
             AdapterView$OnItemLongClickListener onItemLongCl = this.b.getOnItemLongClickListener();
             if (onItemLongCl != null) {
                HorizontalListView$d tb1 = this.b;
                int i1 = tb1.q + i;
                if (onItemLongCl.onItemLongClick(tb1, childAt, i1, tb1.f.getItemId(i1))) {
                   this.b.performHapticFeedback(0);
                }
             }
          }
       }
       return;
    }
    public boolean onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       this.b.k(Boolean.TRUE);
       this.b.setCurrentScrollState(HorizontalListView$OnScrollStateChangedListener$ScrollState.SCROLL_STATE_TOUCH_SCROLL);
       this.b.n();
       HorizontalListView$d tb = this.b;
       tb.n = tb.n + (int)p2;
       int i = Math.round(p2);
       if (tb.y != null && tb.z != null) {
          int i1 = tb.m + i;
          HorizontalListView b = tb.b;
          if (b == null || b.isFinished()) {
             if (i1 < 0) {
                tb.y.f(((float)Math.abs(i) / (float)tb.getRenderWidth()));
                if (!tb.z.c()) {
                   tb.z.h();
                }
             }else if(i1 > tb.p){
                tb.z.f(((float)Math.abs(i) / (float)tb.getRenderWidth()));
                if (!tb.y.c()) {
                   tb.y.h();
                }
             }
          }
       }
       this.b.requestLayout();
       return true;
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       this.b.n();
       AdapterView$OnItemClickListener onItemClickL = this.b.getOnItemClickListener();
       int i = this.b.e((int)p0.getX(), (int)p0.getY());
       if (i >= 0) {
          HorizontalListView$d tb = this.b;
          if (tb.B == null) {
             View childAt = tb.getChildAt(i);
             HorizontalListView$d tb1 = this.b;
             int i1 = tb1.q + i;
             if (onItemClickL != null) {
                onItemClickL.onItemClick(tb1, childAt, i1, tb1.f.getItemId(i1));
                return true;
             }
          }
       }
       HorizontalListView$d tb2 = this.b;
       HorizontalListView d = tb2.D;
       if (d != null && tb2.B == null) {
          d.onClick(tb2);
       }
       return false;
    }
}
