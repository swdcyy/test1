package com.facebook.react.views.deractors.KdsViewGroup;
import com.facebook.react.views.view.ReactViewGroup;
import android.content.Context;
import com.facebook.react.views.deractors.BackgroundDecorViewManager;

public class KdsViewGroup extends ReactViewGroup	// class@0013b1
{
    public BackgroundDecorViewManager b;

    public void KdsViewGroup(Context p0){
       super(p0);
       this.b = null;
       this.b = new BackgroundDecorViewManager();
    }
    public BackgroundDecorViewManager getBackgroundDecorViewManager(){
       return this.b;
    }
}
