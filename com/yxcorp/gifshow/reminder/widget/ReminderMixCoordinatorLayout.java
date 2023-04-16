package com.yxcorp.gifshow.reminder.widget.ReminderMixCoordinatorLayout;
import o17.c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import ofc.d;
import com.google.android.material.appbar.AppBarLayout$c;

public class ReminderMixCoordinatorLayout extends CoordinatorLayout implements c	// class@001af9
{
    public boolean z;

    public void ReminderMixCoordinatorLayout(Context p0){
       super(p0);
       this.z = true;
    }
    public void ReminderMixCoordinatorLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.z = true;
    }
    public void ReminderMixCoordinatorLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.z = true;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, ReminderMixCoordinatorLayout.class, "1")) {
          return;
       }
       super.onFinishInflate();
       View childAt = this.getChildAt(0);
       if (childAt instanceof AppBarLayout) {
          childAt.c(new d(this));
       }
       return;
    }
    public boolean r(){
       return this.z;
    }
}
