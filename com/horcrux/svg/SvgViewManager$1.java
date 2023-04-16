package com.horcrux.svg.SvgViewManager$1;
import android.app.Application$ActivityLifecycleCallbacks;
import com.horcrux.svg.SvgViewManager;
import java.lang.Object;
import android.app.Activity;
import android.os.Bundle;
import android.util.SparseArray;
import com.horcrux.svg.SvgView;
import android.content.Context;
import android.view.ViewGroup;

public class SvgViewManager$1 implements Application$ActivityLifecycleCallbacks	// class@0005f8
{
    public final SvgViewManager this$0;

    public void SvgViewManager$1(SvgViewManager p0){
       this.this$0 = p0;
       super();
    }
    public void onActivityCreated(Activity p0,Bundle p1){
    }
    public void onActivityDestroyed(Activity p0){
       Object mViewLock = SvgViewManager.mViewLock;
       _monitor_enter(mViewLock);
       int i = 0;
       SparseArray mTagToSvgVie = SvgViewManager.mTagToSvgView;
       while (i < mTagToSvgVie.size()) {
          SvgView svgView = mTagToSvgVie.get(mTagToSvgVie.keyAt(i));
          if (svgView != null && svgView.getContext() == p0) {
             mTagToSvgVie.removeAt(i);
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
