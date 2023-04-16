package com.swmansion.rnscreens.ScreenFragment;
import androidx.fragment.app.Fragment;
import java.lang.IllegalStateException;
import java.lang.String;
import com.swmansion.rnscreens.Screen;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.Class;
import com.facebook.react.bridge.NativeModule;
import df.c;
import kn8.b;
import df.b;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.swmansion.rnscreens.ScreenContainer;
import kn8.c;

public class ScreenFragment extends Fragment	// class@000caa
{
    public Screen b;

    public void ScreenFragment(){
       super();
       throw new IllegalStateException("Screen fragments should never be restored");
    }
    public void ScreenFragment(Screen p0){
       super();
       this.b = p0;
    }
    public static View Wg(View p0){
       ViewParent parent = p0.getParent();
       if (parent != null) {
          parent.endViewTransition(p0);
          parent.removeView(p0);
       }
       p0.setVisibility(0);
       return p0;
    }
    public Screen Ug(){
       return this.b;
    }
    public void Vg(){
       this.b.getContext().getNativeModule(UIManagerModule.class).getEventDispatcher().c(new b(this.b.getId()));
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       FrameLayout uFrameLayout = new FrameLayout(this.getContext());
       this.b.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       ScreenFragment tb = this.b;
       ScreenFragment.Wg(tb);
       uFrameLayout.addView(tb);
       return uFrameLayout;
    }
    public void onDestroy(){
       super.onDestroy();
       ScreenContainer container = this.b.getContainer();
       if (container == null || !container.e(this)) {
          this.b.getContext().getNativeModule(UIManagerModule.class).getEventDispatcher().c(new c(this.b.getId()));
       }
       return;
    }
}
