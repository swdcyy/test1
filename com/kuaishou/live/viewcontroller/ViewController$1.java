package com.kuaishou.live.viewcontroller.ViewController$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import eq3.b;
import java.lang.Enum;
import java.util.Objects;
import androidx.lifecycle.ViewModelStore;
import android.view.View;
import android.view.ViewGroup;

public final class ViewController$1 implements LifecycleEventObserver	// class@000fe0
{
    public final ViewController b;

    public void ViewController$1(ViewController p0){
       this.b = p0;
       super();
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       ViewController$1 tb;
       ViewController c;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ViewController$1.class, "1")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "event");
       Object[] objArray = null;
       switch (b.a[p1.ordinal()]){
           case 1:
             this.b.F2();
             break;
           case 2:
             this.b.L2();
             break;
           case 3:
             this.b.M2();
             break;
           case 4:
             this.b.K2();
             break;
           case 5:
             tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoid(objArray, tb, ViewController.class, "17")) {
                tb.N2();
                c = tb.c;
                if (c != null) {
                   c.cancelPendingInputEvents();
                }
             }
             break;
           case 6:
             tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoid(objArray, tb, ViewController.class, "18")) {
                tb.h.clear();
                tb.J2();
                ViewController c1 = tb.c;
                if (c1 != null) {
                   c = tb.b;
                   if (c != null) {
                      c.removeView(c1);
                   }
                }
             }
             break;
           default:
       }
    label_0076 :
       return;
    }
}
