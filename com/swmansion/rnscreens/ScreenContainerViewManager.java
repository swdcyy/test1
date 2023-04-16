package com.swmansion.rnscreens.ScreenContainerViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import android.view.ViewGroup;
import android.view.View;
import com.swmansion.rnscreens.ScreenContainer;
import com.swmansion.rnscreens.Screen;
import java.lang.IllegalArgumentException;
import java.lang.String;
import ze.n0;
import android.content.Context;

public class ScreenContainerViewManager extends ViewGroupManager	// class@000ca9
{

    public void ScreenContainerViewManager(){
       super();
    }
    public void addView(ViewGroup p0,View p1,int p2){
       this.addView(p0, p1, p2);
    }
    public void addView(ScreenContainer p0,View p1,int p2){
       if (!p1 instanceof Screen) {
          throw new IllegalArgumentException("Attempt attach child that is not of type RNScreens");
       }
       p0.b(p1, p2);
       return;
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ScreenContainer createViewInstance(n0 p0){
       return new ScreenContainer(p0);
    }
    public View getChildAt(ViewGroup p0,int p1){
       return this.getChildAt(p0, p1);
    }
    public View getChildAt(ScreenContainer p0,int p1){
       return p0.d(p1);
    }
    public int getChildCount(ViewGroup p0){
       return this.getChildCount(p0);
    }
    public int getChildCount(ScreenContainer p0){
       return p0.getScreenCount();
    }
    public String getName(){
       return "RNSScreenContainer";
    }
    public boolean needsCustomLayoutForChildren(){
       return true;
    }
    public void removeAllViews(ViewGroup p0){
       this.removeAllViews(p0);
    }
    public void removeAllViews(ScreenContainer p0){
       p0.i();
    }
    public void removeViewAt(ViewGroup p0,int p1){
       this.removeViewAt(p0, p1);
    }
    public void removeViewAt(ScreenContainer p0,int p1){
       p0.j(p1);
    }
}
