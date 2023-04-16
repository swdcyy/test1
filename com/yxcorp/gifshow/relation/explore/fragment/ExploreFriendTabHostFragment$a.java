package com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendTabHostFragment$a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendTabHostFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import java.util.Objects;
import android.animation.ArgbEvaluator;
import java.util.List;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import dac.b0;
import java.lang.Runnable;
import android.widget.RelativeLayout;
import k2b.e0;
import hcc.g;
import android.widget.LinearLayout;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.view.View;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import android.graphics.drawable.Drawable;

public class ExploreFriendTabHostFragment$a implements ViewPager$i	// class@001802
{
    public final ExploreFriendTabHostFragment b;

    public void ExploreFriendTabHostFragment$a(ExploreFriendTabHostFragment p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
       int this;
       int color;
       if (PatchProxy.isSupport(ExploreFriendTabHostFragment$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, ExploreFriendTabHostFragment$a.class, "1")) {
          return;
       }
       if (this.b.Sh()) {
          ExploreFriendTabHostFragment$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.isSupport(ExploreFriendTabHostFragment.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), tb, ExploreFriendTabHostFragment.class, "8")) {
             ArgbEvaluator uArgbEvaluat = new ArgbEvaluator();
             List list = tb.nh();
             int i = 0x7f0617b3;
             this = 0x7f061a2a;
             if (p0 == tb.Rh()) {
                color = tb.getResources().getColor(this);
                i = tb.getResources().getColor(i);
             }else {
                i = tb.getResources().getColor(this);
                color = tb.getResources().getColor(i);
             }
             tb.B.post(new b0(tb, list, uArgbEvaluat.evaluate(p1, Integer.valueOf(color), Integer.valueOf(i)).intValue()));
          }
       }
       ExploreFriendTabHostFragment$a tb1 = this.b;
       if (tb1.H != null) {
          tb1.Uh(p0);
          p0.H = false;
       }
       return;
    }
    public void onPageSelected(int p0){
       ExploreFriendTabHostFragment$a tb;
       ExploreFriendTabHostFragment$a uoa = ExploreFriendTabHostFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       uoa = this.b;
       g.b(uoa, uoa.Qh(uoa.xh(p0)), 5);
       if (this.b.Sh()) {
          TextView childAt = this.b.t.getTabsContainer().getChildAt(p0);
          if (childAt != null) {
             childAt.setTextSize(1, 17.00f);
          }
          if (this.b.u.getCurrentItem() == this.b.Rh()) {
             tb = this.b;
             tb.Vh(R.color.arg_RES_7f060a2e, 0x7f061ad6, tb.C, tb.D);
          }else {
             tb = this.b;
             tb.Vh(R.color.arg_RES_7f061f54, 0x7f060ae6, tb.E, tb.F);
          }
       }else {
          this.b.Uh(p0);
       }
       return;
    }
}
