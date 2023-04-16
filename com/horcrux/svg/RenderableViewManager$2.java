package com.horcrux.svg.RenderableViewManager$2;
import android.app.Application$ActivityLifecycleCallbacks;
import com.horcrux.svg.RenderableViewManager;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import android.util.SparseArray;
import com.horcrux.svg.RenderableView;
import android.content.Context;
import android.view.ViewGroup;

public class RenderableViewManager$2 implements Application$ActivityLifecycleCallbacks	// class@0005c1
{
    public final RenderableViewManager this$0;

    public void RenderableViewManager$2(RenderableViewManager p0){
       this.this$0 = p0;
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
    }
    public void onActivityDestroyed(Activity p0){
       Object mViewLock = RenderableViewManager.mViewLock;
       _monitor_enter(mViewLock);
       int i = 0;
       SparseArray mTagToRender = RenderableViewManager.mTagToRenderableView;
       while (i < mTagToRender.size()) {
          RenderableView renderableVi = mTagToRender.get(mTagToRender.keyAt(i));
          if (renderableVi != null && renderableVi.getContext() == p0) {
             mTagToRender.removeAt(i);
          }
          i = i + 1;
       }
       _monitor_exit(mViewLock);
       return;
    }
    public void onActivityPaused(Activity p0){
    }
    public void onActivityResumed(Activity p0){
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public void onActivityStarted(Activity p0){
    }
    public void onActivityStopped(Activity p0){
    }
}
