package com.kuaishou.live.lite.anchorinfo.bottombar.c$c;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.lite.anchorinfo.bottombar.c;
import z1.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c$c extends m	// class@001e4f
{
    public final a c;
    public final c d;

    public void c$c(c p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$c.class, "1")) {
          return;
       }
       this.c.accept(null);
       return;
    }
}
