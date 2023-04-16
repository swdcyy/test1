package com.swmansion.rnscreens.ScreenStackFragment$NotifyingCoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.content.Context;
import com.swmansion.rnscreens.ScreenFragment;
import android.view.View;

public class ScreenStackFragment$NotifyingCoordinatorLayout extends CoordinatorLayout	// class@000cb0
{
    public final ScreenFragment z;

    public void ScreenStackFragment$NotifyingCoordinatorLayout(Context p0,ScreenFragment p1){
       super(p0);
       this.z = p1;
    }
    public void onAnimationEnd(){
       super.onAnimationEnd();
       this.z.Vg();
    }
}
