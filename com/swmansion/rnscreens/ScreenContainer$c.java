package com.swmansion.rnscreens.ScreenContainer$c;
import java.lang.Runnable;
import com.swmansion.rnscreens.ScreenContainer;
import androidx.fragment.app.e;
import java.lang.Object;

public class ScreenContainer$c implements Runnable	// class@000ca7
{
    public final e b;
    public final ScreenContainer c;

    public void ScreenContainer$c(ScreenContainer p0,e p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       ScreenContainer$c tc = this.c;
       if (tc.e == this.b) {
          tc.e = null;
       }
       return;
    }
}
