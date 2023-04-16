package com.yxcorp.gifshow.homepage.menu.redesign.c$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.homepage.menu.redesign.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;

public class c$c implements Runnable	// class@001780
{
    public final c b;

    public void c$c(c p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, c$c.class, "1")) {
          return;
       }
       c w = this.b.w;
       w.smoothScrollTo(0, w.getBottom(), 300);
       return;
    }
}
