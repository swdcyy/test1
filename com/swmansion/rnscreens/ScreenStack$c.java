package com.swmansion.rnscreens.ScreenStack$c;
import java.lang.Runnable;
import com.swmansion.rnscreens.ScreenStack;
import com.swmansion.rnscreens.ScreenStackFragment;
import java.lang.Object;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.ScreenFragment;
import android.view.ViewGroup;

public class ScreenStack$c implements Runnable	// class@000cad
{
    public final ScreenStackFragment b;
    public final ScreenStack c;

    public void ScreenStack$c(ScreenStack p0,ScreenStackFragment p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       this.b.Ug().bringToFront();
    }
}
