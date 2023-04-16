package com.kuaishou.live.liteend.framework.LiveLiteEndRootViewController$loadPresenterOnLifecycle$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.live.liteend.framework.LiveLiteEndRootViewController;
import androidx.lifecycle.Lifecycle$State;
import gb3.a;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;
import b93.e;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import d93.c;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

public final class LiveLiteEndRootViewController$loadPresenterOnLifecycle$1 implements LifecycleEventObserver	// class@000bc9
{
    public final LiveLiteEndRootViewController b;
    public final Lifecycle$State c;
    public final a d;

    public void LiveLiteEndRootViewController$loadPresenterOnLifecycle$1(LiveLiteEndRootViewController p0,Lifecycle$State p1,a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteEndRootViewController$loadPresenterOnLifecycle$1.class, "1")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "event");
       if (p1.getTargetState() == this.c) {
          LiveLiteEndRootViewController$loadPresenterOnLifecycle$1 td = this.d;
          Activity uActivity = this.b.B2();
          LiveLiteEndRootViewController$loadPresenterOnLifecycle$1 tb = this.b;
          LiveLiteEndRootViewController m = tb.m;
          LiveLiteEndRootViewController j = tb.j;
          if (j == null) {
             a.S("modelManager");
          }
          LiveLiteEndRootViewController k = this.b.k;
          if (k == null) {
             a.S("serviceManager");
          }
          td.o(uActivity, tb, m, j, k);
          p0.getLifecycle().removeObserver(this);
       }
       return;
    }
}
