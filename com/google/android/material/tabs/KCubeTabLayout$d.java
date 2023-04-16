package com.google.android.material.tabs.KCubeTabLayout$d;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.google.android.material.tabs.KCubeTabLayout;
import com.google.android.material.tabs.TabLayout$f;
import wq6.h;
import android.view.MotionEvent;
import yq6.d;
import wq6.f;
import qn5.a;
import com.google.android.material.tabs.c;
import java.lang.Boolean;
import yq6.a;
import msd.l;
import java.lang.Object;
import com.google.android.material.tabs.TabLayout$TabView;

public class KCubeTabLayout$d extends GestureDetector$SimpleOnGestureListener	// class@0016b7
{
    public final TabLayout$f b;
    public final h c;
    public final KCubeTabLayout d;

    public void KCubeTabLayout$d(KCubeTabLayout p0,TabLayout$f p1,h p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public boolean onDoubleTap(MotionEvent p0){
       return this.d.r.d().d(this.c, a.d, c.b, Boolean.FALSE).booleanValue();
    }
    public boolean onDown(MotionEvent p0){
       return true;
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       this.b.h.performClick();
       return true;
    }
}
