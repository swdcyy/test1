package com.swmansion.rnscreens.ScreenStackViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import android.view.ViewGroup;
import android.view.View;
import com.swmansion.rnscreens.ScreenStack;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenContainer;
import java.lang.IllegalArgumentException;
import java.lang.String;
import ze.n0;
import android.content.Context;

public class ScreenStackViewManager extends ViewGroupManager	// class@000cb9
{

    public void ScreenStackViewManager(){
       super();
    }
    public void addView(ViewGroup p0,View p1,int p2){
       this.addView(p0, p1, p2);
    }
    public void addView(ScreenStack p0,View p1,int p2){
       if (!p1 instanceof Screen) {
          throw new IllegalArgumentException("Attempt attach child that is not of type RNScreen");
       }
       p0.b(p1, p2);
       return;
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ScreenStack createViewInstance(n0 p0){
       return new ScreenStack(p0);
    }
    public View getChildAt(ViewGroup p0,int p1){
       return this.getChildAt(p0, p1);
    }
    public View getChildAt(ScreenStack p0,int p1){
       return p0.d(p1);
    }
    public int getChildCount(ViewGroup p0){
       return this.getChildCount(p0);
    }
    public int getChildCount(ScreenStack p0){
       return p0.getScreenCount();
    }
    public String getName(){
       return "RNSScreenStack";
    }
    public boolean needsCustomLayoutForChildren(){
       return true;
    }
    public final void prepareOutTransition(Screen p0){
       this.startTransitionRecursive(p0);
    }
    public void removeViewAt(ViewGroup p0,int p1){
       this.removeViewAt(p0, p1);
    }
    public void removeViewAt(ScreenStack p0,int p1){
       this.prepareOutTransition(p0.d(p1));
       p0.j(p1);
    }
    public final void startTransitionRecursive(ViewGroup p0){
       int childCount = p0.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = p0.getChildAt(i);
          p0.startViewTransition(childAt);
          if (childAt instanceof ViewGroup) {
             this.startTransitionRecursive(childAt);
          }
          i = i + 1;
       }
       return;
    }
}
