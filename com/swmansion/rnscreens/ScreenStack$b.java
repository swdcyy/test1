package com.swmansion.rnscreens.ScreenStack$b;
import androidx.fragment.app.c$b;
import com.swmansion.rnscreens.ScreenStack;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import com.swmansion.rnscreens.ScreenStackFragment;

public class ScreenStack$b extends c$b	// class@000cac
{
    public final ScreenStack a;

    public void ScreenStack$b(ScreenStack p0){
       this.a = p0;
       super();
    }
    public void i(c p0,Fragment p1){
       ScreenStack$b ta = this.a;
       ScreenStack m = ta.m;
       if (m == p1) {
          ta.setupBackHandlerIfNeeded(m);
       }
       return;
    }
}
