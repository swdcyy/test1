package com.kuaishou.live.lite.anchorinfo.bottombar.c$b;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.lite.anchorinfo.bottombar.c;
import z1.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c$b extends m	// class@001e4e
{
    public final a c;
    public final c d;

    public void c$b(c p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       this.c.accept(null);
       return;
    }
}
