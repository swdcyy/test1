package com.swmansion.rnscreens.Screen;
import android.view.ViewGroup;
import com.swmansion.rnscreens.Screen$a;
import com.facebook.react.bridge.ReactContext;
import android.content.Context;
import com.swmansion.rnscreens.Screen$StackPresentation;
import com.swmansion.rnscreens.Screen$StackAnimation;
import android.view.WindowManager$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.util.SparseArray;
import com.swmansion.rnscreens.ScreenContainer;
import com.swmansion.rnscreens.ScreenFragment;
import android.view.View;
import android.widget.TextView;
import android.view.View$OnAttachStateChangeListener;
import com.swmansion.rnscreens.Screen$b;
import java.lang.Runnable;
import android.graphics.Paint;

public class Screen extends ViewGroup	// class@000ca4
{
    public ScreenFragment b;
    public ScreenContainer c;
    public boolean d;
    public boolean e;
    public Screen$StackPresentation f;
    public Screen$StackAnimation g;
    public boolean h;
    public static View$OnAttachStateChangeListener i;

    static {
       Screen.i = new Screen$a();
    }
    public void Screen(ReactContext p0){
       super(p0);
       this.f = Screen$StackPresentation.PUSH;
       this.g = Screen$StackAnimation.DEFAULT;
       this.h = true;
       this.setLayoutParams(new WindowManager$LayoutParams(2));
    }
    public void dispatchRestoreInstanceState(SparseArray p0){
    }
    public void dispatchSaveInstanceState(SparseArray p0){
    }
    public ScreenContainer getContainer(){
       return this.c;
    }
    public ScreenFragment getFragment(){
       return this.b;
    }
    public Screen$StackAnimation getStackAnimation(){
       return this.g;
    }
    public Screen$StackPresentation getStackPresentation(){
       return this.f;
    }
    public void onAnimationEnd(){
       super.onAnimationEnd();
       Screen tb = this.b;
       if (tb != null) {
          tb.Vg();
       }
       return;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       View focusedChild = this.getFocusedChild();
       if (focusedChild != null) {
          while (focusedChild instanceof ViewGroup) {
             focusedChild = focusedChild.getFocusedChild();
          }
          if (focusedChild instanceof TextView && focusedChild.getShowSoftInputOnFocus()) {
             focusedChild.addOnAttachStateChangeListener(Screen.i);
          }
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (p0) {
          ReactContext context = this.getContext();
          Screen$b uob = new Screen$b(this, context, context, (p3 - p1), (p4 - p2));
          context.runOnNativeModulesQueueThread(p1);
       }
       return;
    }
    public void setActive(boolean p0){
       if (p0 == this.d) {
          return;
       }
       this.d = p0;
       Screen tc = this.c;
       if (tc != null) {
          tc.g();
       }
       return;
    }
    public void setContainer(ScreenContainer p0){
       this.c = p0;
    }
    public void setFragment(ScreenFragment p0){
       this.b = p0;
    }
    public void setGestureEnabled(boolean p0){
       this.h = p0;
    }
    public void setLayerType(int p0,Paint p1){
    }
    public void setStackAnimation(Screen$StackAnimation p0){
       this.g = p0;
    }
    public void setStackPresentation(Screen$StackPresentation p0){
       this.f = p0;
    }
    public void setTransitioning(boolean p0){
       if (this.e == p0) {
          return;
       }
       this.e = p0;
       int i = (p0)? 2: 0;
       super.setLayerType(i, null);
       return;
    }
}
