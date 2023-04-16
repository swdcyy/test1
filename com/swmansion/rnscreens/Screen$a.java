package com.swmansion.rnscreens.Screen$a;
import android.view.View$OnAttachStateChangeListener;
import java.lang.Object;
import android.view.View;
import android.content.Context;
import java.lang.String;
import android.view.inputmethod.InputMethodManager;
import com.swmansion.rnscreens.Screen;

public final class Screen$a implements View$OnAttachStateChangeListener	// class@000ca2
{

    public void Screen$a(){
       super();
    }
    public void onViewAttachedToWindow(View p0){
       p0.getContext().getSystemService("input_method").showSoftInput(p0, 0);
       p0.removeOnAttachStateChangeListener(Screen.i);
    }
    public void onViewDetachedFromWindow(View p0){
    }
}
