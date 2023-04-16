package com.facebook.react.views.slider.ReactSliderManager$b;
import a2.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import b2.d$a;
import android.view.View;
import android.os.Bundle;
import com.facebook.react.views.slider.ReactSliderManager;
import android.widget.SeekBar;
import android.widget.SeekBar$OnSeekBarChangeListener;

public class ReactSliderManager$b extends a	// class@0013f6
{

    public void ReactSliderManager$b(){
       super();
    }
    public static boolean l(int p0){
       ReactSliderManager$b uob = ReactSliderManager$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (p0 != d$a.q.b() && (p0 == d$a.r.b() || p0 == d$a.L.b()))? true: false;
       return b;
    }
    public boolean h(View p0,int p1,Bundle p2){
       if (PatchProxy.isSupport(ReactSliderManager$b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, ReactSliderManager$b.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (ReactSliderManager$b.l(p1)) {
          ReactSliderManager.ON_CHANGE_LISTENER.onStartTrackingTouch(p0);
       }
       boolean b = super.h(p0, p1, p2);
       if (ReactSliderManager$b.l(p1)) {
          ReactSliderManager.ON_CHANGE_LISTENER.onStopTrackingTouch(p0);
       }
       return b;
    }
}
