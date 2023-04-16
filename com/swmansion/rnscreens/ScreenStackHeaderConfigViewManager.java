package com.swmansion.rnscreens.ScreenStackHeaderConfigViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import android.view.ViewGroup;
import android.view.View;
import com.swmansion.rnscreens.ScreenStackHeaderConfig;
import com.swmansion.rnscreens.ScreenStackHeaderSubview;
import java.lang.Object;
import java.util.ArrayList;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import java.lang.String;
import ze.n0;
import android.content.Context;
import com.facebook.react.uimanager.BaseViewManager;

public class ScreenStackHeaderConfigViewManager extends ViewGroupManager	// class@000cb5
{

    public void ScreenStackHeaderConfigViewManager(){
       super();
    }
    public void addView(ViewGroup p0,View p1,int p2){
       this.addView(p0, p1, p2);
    }
    public void addView(ScreenStackHeaderConfig p0,View p1,int p2){
       if (!p1 instanceof ScreenStackHeaderSubview) {
          throw new JSApplicationCausedNativeException("Config children should be of type RNSScreenStackHeaderSubview");
       }
       p0.b.add(p2, p1);
       p0.a();
       return;
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ScreenStackHeaderConfig createViewInstance(n0 p0){
       return new ScreenStackHeaderConfig(p0);
    }
    public View getChildAt(ViewGroup p0,int p1){
       return this.getChildAt(p0, p1);
    }
    public View getChildAt(ScreenStackHeaderConfig p0,int p1){
       return p0.b.get(p1);
    }
    public int getChildCount(ViewGroup p0){
       return this.getChildCount(p0);
    }
    public int getChildCount(ScreenStackHeaderConfig p0){
       return p0.getConfigSubviewsCount();
    }
    public String getName(){
       return "RNSScreenStackHeaderConfig";
    }
    public boolean needsCustomLayoutForChildren(){
       return true;
    }
    public void onAfterUpdateTransaction(View p0){
       this.onAfterUpdateTransaction(p0);
    }
    public void onAfterUpdateTransaction(ScreenStackHeaderConfig p0){
       super.onAfterUpdateTransaction(p0);
       p0.b();
    }
    public void onDropViewInstance(View p0){
       this.onDropViewInstance(p0);
    }
    public void onDropViewInstance(ScreenStackHeaderConfig p0){
       p0.k = true;
    }
    public void removeAllViews(ViewGroup p0){
       this.removeAllViews(p0);
    }
    public void removeAllViews(ScreenStackHeaderConfig p0){
       p0.b.clear();
       p0.a();
    }
    public void removeViewAt(ViewGroup p0,int p1){
       this.removeViewAt(p0, p1);
    }
    public void removeViewAt(ScreenStackHeaderConfig p0,int p1){
       p0.b.remove(p1);
       p0.a();
    }
    public void setBackButtonInCustomView(ScreenStackHeaderConfig p0,boolean p1){
       p0.setBackButtonInCustomView(p1);
    }
    public void setBackgroundColor(View p0,int p1){
       this.setBackgroundColor(p0, p1);
    }
    public void setBackgroundColor(ScreenStackHeaderConfig p0,int p1){
       p0.setBackgroundColor(p1);
    }
    public void setColor(ScreenStackHeaderConfig p0,int p1){
       p0.setTintColor(p1);
    }
    public void setHidden(ScreenStackHeaderConfig p0,boolean p1){
       p0.setHidden(p1);
    }
    public void setHideBackButton(ScreenStackHeaderConfig p0,boolean p1){
       p0.setHideBackButton(p1);
    }
    public void setHideShadow(ScreenStackHeaderConfig p0,boolean p1){
       p0.setHideShadow(p1);
    }
    public void setTitle(ScreenStackHeaderConfig p0,String p1){
       p0.setTitle(p1);
    }
    public void setTitleColor(ScreenStackHeaderConfig p0,int p1){
       p0.setTitleColor(p1);
    }
    public void setTitleFontFamily(ScreenStackHeaderConfig p0,String p1){
       p0.setTitleFontFamily(p1);
    }
    public void setTitleFontSize(ScreenStackHeaderConfig p0,float p1){
       p0.setTitleFontSize(p1);
    }
}
