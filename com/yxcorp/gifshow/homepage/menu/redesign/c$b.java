package com.yxcorp.gifshow.homepage.menu.redesign.c$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.homepage.menu.redesign.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.core.widget.NestedScrollView;

public class c$b implements Runnable	// class@00177f
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, c$b.class, "1")) {
          return;
       }
       this.b.w.fullScroll(33);
       return;
    }
}
