package ced.m1;
import com.yxcorp.plugin.search.result.hashtag.presenters.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.HorizontalScrollView;
import android.view.View;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import com.google.android.material.appbar.ReboundBehavior;
import com.google.android.material.appbar.CustomAppBarLayoutBehavior;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import ekd.m1;
import com.google.android.material.appbar.AppBarLayout;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import java.lang.Boolean;

public class m1 extends a	// class@000569
{
    public int A;
    public View B;
    public AppBarLayout v;
    public PagerSlidingTabStrip w;
    public View x;
    public TabHostFragment y;
    public boolean z;

    public void m1(){
       super();
    }
    public void E8(){
       CoordinatorLayout$Behavior uBehavior;
       m1 om1 = m1.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, om1, "4")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(objArray, this, om1, "5") && !PatchProxy.applyVoid(objArray, this, om1, "6")) {
          if (this.z != null) {
             this.w.setVisibility(8);
             this.B.setVisibility(8);
             om1 = this.x;
             om1.setPadding(om1.getPaddingLeft(), this.x.getPaddingTop(), this.x.getPaddingRight(), a1.e(15.00f));
             ViewGroup$LayoutParams layoutParams = this.B.getLayoutParams();
             layoutParams.height = a1.e(15.00f);
             this.B.setLayoutParams(layoutParams);
          }else {
             this.w.setVisibility(0);
             this.B.setVisibility(0);
             int i1 = a1.e(56.00f);
             m1 tx = this.x;
             tx.setPadding(tx.getPaddingLeft(), this.x.getPaddingTop(), this.x.getPaddingRight(), i1);
             ViewGroup$LayoutParams layoutParams1 = this.B.getLayoutParams();
             layoutParams1.height = i1;
             this.B.setLayoutParams(layoutParams1);
          }
          float f = 45.00f;
          if (this.A <= a1.e(f)) {
             uBehavior = this.v.getLayoutParams().f();
             if (uBehavior instanceof ReboundBehavior) {
                this.A = uBehavior.b();
             }
          }
          uBehavior = this.v.getLayoutParams().f();
          if (uBehavior instanceof ReboundBehavior) {
             int i = (this.z != null)? this.A - a1.e(f): this.A;
             uBehavior.I(i);
          }
       }
    label_00d8 :
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, m1.class, "3")) {
          return;
       }
       this.w.setTabGravity(17);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m1.class, "1")) {
          return;
       }
       this.v = m1.f(p0, 0x7f0a0225);
       this.w = m1.f(p0, 0x7f0a3cb6);
       this.x = m1.f(p0, 0x7f0a125b);
       this.B = m1.f(p0, 0x7f0a3ce4);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m1.class, "2")) {
          return;
       }
       super.j8();
       this.y = this.r8("FRAGMENT");
       this.z = this.r8("KEY_HIDE_TABS").booleanValue();
       return;
    }
}
