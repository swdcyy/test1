package com.facebook.react.views.deractors.KdsHorizontalScrollView;
import com.facebook.react.views.scroll.ReactHorizontalScrollView;
import android.content.Context;
import com.facebook.react.views.deractors.BackgroundDecorViewManager;

public class KdsHorizontalScrollView extends ReactHorizontalScrollView	// class@0013ab
{
    public BackgroundDecorViewManager D;

    public void KdsHorizontalScrollView(Context p0){
       super(p0);
       this.D = null;
       this.D = new BackgroundDecorViewManager();
    }
    public BackgroundDecorViewManager getBackgroundDecorViewManager(){
       return this.D;
    }
}
