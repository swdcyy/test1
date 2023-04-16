package com.horcrux.svg.SvgViewManager;
import com.facebook.react.views.view.ReactViewManager;
import android.util.SparseArray;
import java.util.HashMap;
import java.lang.Object;
import com.horcrux.svg.SvgView;
import com.facebook.react.bridge.ReactApplicationContext;
import yd.e;
import android.content.Context;
import android.view.ViewGroup;
import ze.n0;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Integer;
import java.lang.Runnable;
import android.view.View;
import com.facebook.react.views.view.ReactViewGroup;
import android.content.ContextWrapper;
import android.app.Application;
import com.horcrux.svg.SvgViewManager$1;
import android.app.Application$ActivityLifecycleCallbacks;
import java.lang.ref.WeakReference;
import com.facebook.react.bridge.ReactContext;
import java.lang.String;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.ViewGroupManager;

public class SvgViewManager extends ReactViewManager	// class@0005f9
{
    public Application$ActivityLifecycleCallbacks mActivityLifecycleCallbacks;
    public WeakReference mApplication;
    public static final Object mLock;
    public static final HashMap mRunnableTagToContextId;
    public static final SparseArray mTagToRunnable;
    public static final SparseArray mTagToSvgView;
    public static final Object mViewLock;

    static {
       SvgViewManager.mTagToSvgView = new SparseArray();
       SvgViewManager.mTagToRunnable = new SparseArray();
       SvgViewManager.mRunnableTagToContextId = new HashMap();
       SvgViewManager.mLock = new Object();
       SvgViewManager.mViewLock = new Object();
    }
    public void SvgViewManager(){
       super();
    }
    public static void dropView(int p0){
       Object mViewLock = SvgViewManager.mViewLock;
       _monitor_enter(mViewLock);
       SvgViewManager.mTagToSvgView.remove(p0);
       _monitor_exit(mViewLock);
    }
    public static SvgView getSvgViewByTag(int p0){
       Object mViewLock = SvgViewManager.mViewLock;
       _monitor_enter(mViewLock);
       _monitor_exit(mViewLock);
       return SvgViewManager.mTagToSvgView.get(p0);
    }
    public static void onReactContextDestroy(ReactApplicationContext p0){
       if (e.j) {
          Iterator mViewLock = SvgViewManager.mViewLock;
          _monitor_enter(mViewLock);
          int i = SvgViewManager.mTagToSvgView.size() - 1;
          while (i >= 0) {
             SparseArray mTagToSvgVie = SvgViewManager.mTagToSvgView;
             SvgView svgView = mTagToSvgVie.get(mTagToSvgVie.keyAt(i));
             if (svgView != null && (svgView.getContext() instanceof n0 && p0 == svgView.getContext().b())) {
                mTagToSvgVie.removeAt(i);
             }
          label_0036 :
             i = i - 1;
          }
          _monitor_exit(mViewLock);
          Object mLock = SvgViewManager.mLock;
          _monitor_enter(mLock);
          mViewLock = SvgViewManager.mRunnableTagToContextId.entrySet().iterator();
          while (mViewLock.hasNext()) {
             Map$Entry uEntry = mViewLock.next();
             if (uEntry.getValue().intValue() == p0.hashCode()) {
                SvgViewManager.mTagToRunnable.remove(uEntry.getKey().intValue());
                SvgViewManager.mRunnableTagToContextId.remove(uEntry.getKey());
             }
          }
          _monitor_exit(mLock);
       }
       return;
    }
    public static void runWhenViewIsAvailable(int p0,Runnable p1,int p2){
       Object mLock = SvgViewManager.mLock;
       _monitor_enter(mLock);
       SvgViewManager.mTagToRunnable.put(p0, p1);
       SvgViewManager.mRunnableTagToContextId.put(Integer.valueOf(p0), Integer.valueOf(p2));
       _monitor_exit(mLock);
    }
    public static void setSvgView(int p0,SvgView p1){
       SparseArray mViewLock = SvgViewManager.mViewLock;
       _monitor_enter(mViewLock);
       SvgViewManager.mTagToSvgView.put(p0, p1);
       _monitor_exit(mViewLock);
       p1 = SvgViewManager.mLock;
       _monitor_enter(p1);
       mViewLock = SvgViewManager.mTagToRunnable;
       Runnable runnable = mViewLock.get(p0);
       if (runnable != null) {
          runnable.run();
          mViewLock.delete(p0);
          SvgViewManager.mRunnableTagToContextId.remove(Integer.valueOf(p0));
       }
       _monitor_exit(p1);
       return;
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReactViewGroup createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public SvgView createViewInstance(n0 p0){
       if (this.mActivityLifecycleCallbacks == null) {
          Context applicationC = p0.getApplicationContext();
          if (applicationC instanceof Application) {
             SvgViewManager$1 u1 = new SvgViewManager$1(this);
             this.mActivityLifecycleCallbacks = u1;
             applicationC.registerActivityLifecycleCallbacks(u1);
             this.mApplication = new WeakReference(applicationC);
          }
       }
       return new SvgView(p0);
    }
    public String getName(){
       return "RNSVGSvgView";
    }
    public boolean needsCustomLayoutForChildren(){
       return true;
    }
    public void onCatalystInstanceDestroy(){
       super.onCatalystInstanceDestroy();
       SvgViewManager tmApplicatio = this.mApplication;
       if (tmApplicatio != null && tmApplicatio.get() != null) {
          this.mApplication.get().unregisterActivityLifecycleCallbacks(this.mActivityLifecycleCallbacks);
       }
       return;
    }
    public void onDropViewInstance(View p0){
       this.onDropViewInstance(p0);
    }
    public void onDropViewInstance(ReactViewGroup p0){
       super.onDropViewInstance(p0);
       SvgViewManager.mTagToSvgView.remove(p0.getId());
    }
    public void setAlign(SvgView p0,String p1){
       p0.setAlign(p1);
    }
    public void setBbHeight(SvgView p0,Dynamic p1){
       p0.setBbHeight(p1);
    }
    public void setBbWidth(SvgView p0,Dynamic p1){
       p0.setBbWidth(p1);
    }
    public void setColor(SvgView p0,Integer p1){
       p0.setTintColor(p1);
    }
    public void setMeetOrSlice(SvgView p0,int p1){
       p0.setMeetOrSlice(p1);
    }
    public void setMinX(SvgView p0,float p1){
       p0.setMinX(p1);
    }
    public void setMinY(SvgView p0,float p1){
       p0.setMinY(p1);
    }
    public void setTintColor(SvgView p0,Integer p1){
       p0.setTintColor(p1);
    }
    public void setVbHeight(SvgView p0,float p1){
       p0.setVbHeight(p1);
    }
    public void setVbWidth(SvgView p0,float p1){
       p0.setVbWidth(p1);
    }
    public void updateExtraData(View p0,Object p1){
       this.updateExtraData(p0, p1);
    }
    public void updateExtraData(ViewGroup p0,Object p1){
       this.updateExtraData(p0, p1);
    }
    public void updateExtraData(ReactViewGroup p0,Object p1){
       super.updateExtraData(p0, p1);
       p0.invalidate();
    }
}
