package com.swmansion.rnscreens.ScreenStackFragment;
import com.swmansion.rnscreens.ScreenFragment;
import ze.p;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenContainer;
import com.swmansion.rnscreens.ScreenStack;
import androidx.fragment.app.Fragment;
import java.lang.IllegalStateException;
import java.lang.String;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.swmansion.rnscreens.ScreenStackFragment$NotifyingCoordinatorLayout;
import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import android.view.ViewGroup$LayoutParams;
import com.google.android.material.appbar.AppBarLayout;
import android.widget.LinearLayout;
import com.google.android.material.appbar.AppBarLayout$LayoutParams;

public class ScreenStackFragment extends ScreenFragment	// class@000cb1
{
    public AppBarLayout c;
    public Toolbar d;
    public boolean e;
    public static final float f;

    static {
       ScreenStackFragment.f = p.c(4.00f);
    }
    public void ScreenStackFragment(Screen p0){
       super(p0);
    }
    public void Vg(){
       super.Vg();
       this.Yg();
    }
    public boolean Xg(){
       ScreenContainer container = this.b.getContainer();
       if (!container instanceof ScreenStack) {
          throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
       }
       if (container.getRootScreen() != this.Ug()) {
          return true;
       }
       Fragment parentFragme = this.getParentFragment();
       if (parentFragme instanceof ScreenStackFragment) {
          return parentFragme.Xg();
       }
       return false;
    }
    public final void Yg(){
       ViewParent parent = this.getView().getParent();
       if (parent instanceof ScreenStack && parent.n == null) {
          parent.n();
       }
       return;
    }
    public void dismiss(){
       ScreenContainer container = this.b.getContainer();
       if (!container instanceof ScreenStack) {
          throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
       }
       container.m(this);
       return;
    }
    public Animation onCreateAnimation(int p0,boolean p1,int p2){
       if (p1 && !p0) {
          this.Yg();
       }
       return null;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       ScreenStackFragment$NotifyingCoordinatorLayout notifyingCoo = new ScreenStackFragment$NotifyingCoordinatorLayout(this.getContext(), this);
       int i = -1;
       CoordinatorLayout$LayoutParams layoutParams = new CoordinatorLayout$LayoutParams(i, i);
       layoutParams.o(new AppBarLayout$ScrollingViewBehavior());
       this.b.setLayoutParams(layoutParams);
       ScreenFragment tb = this.b;
       ScreenFragment.Wg(tb);
       notifyingCoo.addView(tb);
       AppBarLayout uAppBarLayou = new AppBarLayout(this.getContext());
       this.c = uAppBarLayou;
       uAppBarLayou.setBackgroundColor(0);
       this.c.setLayoutParams(new AppBarLayout$LayoutParams(i, -2));
       notifyingCoo.addView(this.c);
       if (this.e != null) {
          this.c.setTargetElevation(0);
       }
       ScreenStackFragment td = this.d;
       if (td != null) {
          ScreenFragment.Wg(td);
          this.c.addView(td);
       }
       return notifyingCoo;
    }
}
