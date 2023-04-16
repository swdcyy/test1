package com.swmansion.rnscreens.Screen$b;
import com.facebook.react.bridge.GuardedRunnable;
import com.swmansion.rnscreens.Screen;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.Class;
import com.facebook.react.bridge.NativeModule;
import android.view.ViewGroup;

public class Screen$b extends GuardedRunnable	// class@000ca3
{
    public final ReactContext b;
    public final int c;
    public final int d;
    public final Screen e;

    public void Screen$b(Screen p0,ReactContext p1,ReactContext p2,int p3,int p4){
       this.e = p0;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super(p1);
    }
    public void runGuarded(){
       this.b.getNativeModule(UIManagerModule.class).updateNodeSize(this.e.getId(), this.c, this.d);
    }
}
