package androidx.viewpager2.widget.ViewPager2$LinearLayoutManagerImpl;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$t;
import b2.d;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.viewpager2.widget.ViewPager2$e;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;

public class ViewPager2$LinearLayoutManagerImpl extends LinearLayoutManager	// class@000a2a
{
    public final ViewPager2 r;

    public void ViewPager2$LinearLayoutManagerImpl(ViewPager2 p0,Context p1){
       this.r = p0;
       super(p1);
    }
    public void N(RecyclerView$y p0,int[] p1){
       int offscreenPag = this.r.getOffscreenPageLimit();
       if (offscreenPag == -1) {
          super.N(p0, p1);
          return;
       }else {
          int i = this.r.getPageSize() * offscreenPag;
          p1[0] = i;
          p1[1] = i;
          return;
       }
    }
    public void onInitializeAccessibilityNodeInfo(RecyclerView$t p0,RecyclerView$y p1,d p2){
       super.onInitializeAccessibilityNodeInfo(p0, p1, p2);
       this.r.u.j(p2);
    }
    public boolean performAccessibilityAction(RecyclerView$t p0,RecyclerView$y p1,int p2,Bundle p3){
       if (this.r.u.b(p2)) {
          return this.r.u.k(p2);
       }
       return super.performAccessibilityAction(p0, p1, p2, p3);
    }
    public boolean requestChildRectangleOnScreen(RecyclerView p0,View p1,Rect p2,boolean p3,boolean p4){
       return false;
    }
}
