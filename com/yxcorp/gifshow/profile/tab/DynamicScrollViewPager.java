package com.yxcorp.gifshow.profile.tab.DynamicScrollViewPager;
import com.yxcorp.gifshow.recycler.widget.NestedScrollViewPager;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import tyc.q4$a;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView;
import ukd.a;

public class DynamicScrollViewPager extends NestedScrollViewPager	// class@0015bf
{

    public void DynamicScrollViewPager(Context p0){
       super(p0);
    }
    public void DynamicScrollViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void f(int p0,int p1){
       if (PatchProxy.isSupport(DynamicScrollViewPager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, DynamicScrollViewPager.class, "1")) {
          return;
       }
       super.f(p0, p1);
       a adapter = this.getAdapter();
       if (adapter instanceof q4$a) {
          Fragment uFragment = adapter.a(this.getCurrentItem());
          if (uFragment instanceof RecyclerFragment) {
             RecyclerView recyclerView = uFragment.h0();
             if (recyclerView != null) {
                recyclerView.scrollBy(p0, p1);
             }
          }
       }
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, DynamicScrollViewPager.class, "2")) {
          return;
       }
       a adapter = this.getAdapter();
       if (adapter instanceof q4$a) {
          Fragment uFragment = adapter.a(this.getCurrentItem());
          if (uFragment instanceof RecyclerFragment && uFragment.h0() != null) {
             uFragment.h0().stopNestedScroll(1);
          }
       }
       return;
    }
    public void setInitSelectItem(int p0){
       if (PatchProxy.isSupport(DynamicScrollViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DynamicScrollViewPager.class, "3")) {
          return;
       }
       a.o(this, "mCurItem", Integer.valueOf(p0));
       return;
    }
}
