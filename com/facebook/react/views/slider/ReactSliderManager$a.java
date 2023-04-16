package com.facebook.react.views.slider.ReactSliderManager$a;
import android.widget.SeekBar$OnSeekBarChangeListener;
import java.lang.Object;
import android.widget.SeekBar;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import df.c;
import vf.a;
import com.facebook.react.views.slider.ReactSlider;
import df.b;
import vf.b;

public final class ReactSliderManager$a implements SeekBar$OnSeekBarChangeListener	// class@0013f5
{

    public void ReactSliderManager$a(){
       super();
    }
    public void onProgressChanged(SeekBar p0,int p1,boolean p2){
       if (PatchProxy.isSupport(ReactSliderManager$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, ReactSliderManager$a.class, "1")) {
          return;
       }
       p0.getContext().getNativeModule(UIManagerModule.class).getEventDispatcher().c(new a(p0.getId(), p0.c(p1), p2));
       return;
    }
    public void onStartTrackingTouch(SeekBar p0){
    }
    public void onStopTrackingTouch(SeekBar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactSliderManager$a.class, "2")) {
          return;
       }
       p0.getContext().getNativeModule(UIManagerModule.class).getEventDispatcher().c(new b(p0.getId(), p0.c(p0.getProgress())));
       return;
    }
}
