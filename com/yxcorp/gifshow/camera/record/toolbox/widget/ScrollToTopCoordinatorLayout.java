package com.yxcorp.gifshow.camera.record.toolbox.widget.ScrollToTopCoordinatorLayout;
import tyc.p4;
import com.yxcorp.gifshow.widget.NestedListenerCoordinatorLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.ScrollView;
import a2.f0;
import androidx.viewpager.widget.ViewPager;
import h3.a;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.Fragment;
import tyc.q4$a;

public final class ScrollToTopCoordinatorLayout extends NestedListenerCoordinatorLayout implements p4	// class@000f6d
{

    public void ScrollToTopCoordinatorLayout(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void ScrollToTopCoordinatorLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void ScrollToTopCoordinatorLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
    }
    public void ScrollToTopCoordinatorLayout(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0x7f040257;
       }
       super(p0, p1, p2);
       return;
    }
    public void O2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ScrollToTopCoordinatorLayout.class, "1")) {
          return;
       }
       this.Z(this);
       if (!PatchProxy.applyVoid(objArray, this, ScrollToTopCoordinatorLayout.class, "3")) {
          AppBarLayout uAppBarLayou = this.findViewById(R.id.app_bar_layout);
          if (uAppBarLayou != null) {
             uAppBarLayou.p(true, true);
          }
       }
       return;
    }
    public final void Z(View p0){
       int currentItem;
       Fragment uFragment;
       if (PatchProxy.applyVoidOneRefs(p0, this, ScrollToTopCoordinatorLayout.class, "2")) {
          return;
       }
       int i = 0;
       if (p0 instanceof RecyclerView) {
          p0.scrollToPosition(i);
       }else if(p0 instanceof ScrollView){
          p0.fullScroll(33);
       }else if(p0 instanceof f0){
          p0.scrollTo(i, i);
       }
       if (!p0 instanceof ViewGroup) {
          return;
       }else if(p0 instanceof ViewPager){
          ViewPager viewPager = p0;
          a adapter = viewPager.getAdapter();
          currentItem = viewPager.getCurrentItem();
          if (adapter instanceof FragmentPagerAdapter) {
             if (adapter.j() <= 0) {
                return;
             }else {
                uFragment = adapter.z(currentItem);
                a.o(uFragment, "adapter.getItem\(currentPosition\)");
                if (uFragment.getView() != null) {
                   this.Z(uFragment.getView());
                }
                return;
             }
          }else if(adapter instanceof q4$a){
             uFragment = adapter.a(currentItem);
             if (uFragment != null && uFragment.getView() != null) {
                this.Z(uFragment.getView());
             }
             return;
          }
       }
       currentItem = p0.getChildCount();
       for (; i < currentItem; i = i + 1) {
          this.Z(p0.getChildAt(i));
       }
       return;
    }
}
