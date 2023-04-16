package com.facebook.react.views.deractors.KdsScrollView;
import com.facebook.react.views.scroll.ReactScrollView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.deractors.BackgroundDecorViewManager;
import com.facebook.react.views.scroll.FpsListener;

public class KdsScrollView extends ReactScrollView	// class@0013ae
{
    public BackgroundDecorViewManager D;

    public void KdsScrollView(ReactContext p0){
       super(p0);
       this.D = null;
       this.D = new BackgroundDecorViewManager();
    }
    public void KdsScrollView(ReactContext p0,FpsListener p1){
       super(p0, p1);
       this.D = null;
       this.D = new BackgroundDecorViewManager();
    }
    public BackgroundDecorViewManager getBackgroundDecorViewManager(){
       return this.D;
    }
}
