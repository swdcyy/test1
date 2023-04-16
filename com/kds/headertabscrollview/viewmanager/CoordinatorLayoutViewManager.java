package com.kds.headertabscrollview.viewmanager.CoordinatorLayoutViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import android.view.ViewGroup;
import android.view.View;
import com.kds.headertabscrollview.layout.CoordinatorView;
import com.kds.headertabscrollview.layout.AppBarView;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import com.google.android.material.appbar.KdsReboundBehavior;
import java.lang.Object;
import kotlin.TypeCastException;
import java.lang.String;
import ze.n0;
import kotlin.jvm.internal.a;
import android.content.Context;
import java.util.Map;
import vd.d$b;
import vd.d;
import com.kds.headertabscrollview.event.CoordinatorScrollEvent;

public final class CoordinatorLayoutViewManager extends ViewGroupManager	// class@000734
{

    public void CoordinatorLayoutViewManager(){
       super();
    }
    public void addView(ViewGroup p0,View p1,int p2){
       this.addView(p0, p1, p2);
    }
    public void addView(CoordinatorView p0,View p1,int p2){
       super.addView(p0, p1, p2);
       if (p1 instanceof AppBarView) {
          ViewGroup$LayoutParams layoutParams = p1.getLayoutParams();
          if (layoutParams != null) {
             CoordinatorLayout$Behavior uBehavior = layoutParams.f();
             if (uBehavior != null) {
                View view = (p0 != null)? p0.findViewWithTag("ReboundView"): null;
                uBehavior.W(view);
             }else {
                throw new TypeCastException("null cannot be cast to non-null type com.google.android.material.appbar.KdsReboundBehavior");
             }
          }else {
             throw new TypeCastException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
          }
       }
       return;
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public CoordinatorView createViewInstance(n0 p0){
       a.q(p0, "reactContext");
       return new CoordinatorView(p0);
    }
    public Map getExportedCustomDirectEventTypeConstants(){
       d$b uob = d.a();
       CoordinatorScrollEvent oN_HEADER_BO = CoordinatorScrollEvent.ON_HEADER_BOTTOM_OFFSET_CHANGE;
       String str = oN_HEADER_BO.toString();
       uob.b(str, d.d("registrationName", oN_HEADER_BO.toString()));
       oN_HEADER_BO = CoordinatorScrollEvent.ON_REBOUND_OFFSET_CHANGE;
       str = oN_HEADER_BO.toString();
       uob.b(str, d.d("registrationName", oN_HEADER_BO.toString()));
       return uob.a();
    }
    public String getName(){
       return "CoordinatorLayout";
    }
    public boolean needsCustomLayoutForChildren(){
       return true;
    }
}
