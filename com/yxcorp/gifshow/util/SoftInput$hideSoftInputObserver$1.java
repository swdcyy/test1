package com.yxcorp.gifshow.util.SoftInput$hideSoftInputObserver$1;
import androidx.lifecycle.LifecycleEventObserver;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.app.Activity;
import lnc.t9;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public final class SoftInput$hideSoftInputObserver$1 implements LifecycleEventObserver	// class@001f2f
{
    public static final SoftInput$hideSoftInputObserver$1 b;

    static {
       SoftInput$hideSoftInputObserver$1.b = new SoftInput$hideSoftInputObserver$1();
    }
    public void SoftInput$hideSoftInputObserver$1(){
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       a.p(p0, "source");
       a.p(p1, "event");
       if (p1 == Lifecycle$Event.ON_PAUSE) {
          if (p0 instanceof Activity) {
             t9.a(p0);
          }else if(p0 instanceof Fragment){
             a.p(p0, "$this$hideSoftInput");
             FragmentActivity uFragmentAct = p0.requireActivity();
             a.o(uFragmentAct, "requireActivity\(\)");
             t9.a(uFragmentAct);
          }
       }
       return;
    }
}
