package com.kwai.library.widget.recyclerview.SnappyRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import m17.a;
import android.view.MotionEvent;

public final class SnappyRecyclerView extends RecyclerView	// class@0009b9
{
    public boolean b;

    public void SnappyRecyclerView(Context p0){
       super(p0);
       this.b = false;
    }
    public void SnappyRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = false;
    }
    public void SnappyRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = false;
    }
    public boolean fling(int p0,int p1){
       if (!this.getLayoutManager() instanceof a) {
          return super.fling(p0, p1);
       }
       if (this.b != null) {
          return false;
       }
       super.smoothScrollToPosition(this.getLayoutManager().J(p0, p1));
       return true;
    }
    public boolean onTouchEvent(MotionEvent p0){
       boolean b = super.onTouchEvent(p0);
       RecyclerView$LayoutManager layoutManage = this.getLayoutManager();
       if (layoutManage instanceof a && (p0.getAction() == 1 || (p0.getAction() == 3 && (!this.getScrollState() && this.b == null)))) {
          this.smoothScrollToPosition(layoutManage.u());
       }
    label_002d :
       return b;
    }
    public void setDisableSnappy(boolean p0){
       this.b = p0;
    }
}
