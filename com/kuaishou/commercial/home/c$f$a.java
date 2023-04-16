package com.kuaishou.commercial.home.c$f$a;
import java.lang.Runnable;
import com.kuaishou.commercial.home.c$f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.commercial.home.c;
import android.widget.ImageView;

public class c$f$a implements Runnable	// class@0014dd
{
    public final c$f b;

    public void c$f$a(c$f p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, c$f$a.class, "1")) {
          return;
       }
       c p = this.b.b.p;
       if (p != null) {
          p.setVisibility(8);
       }
       return;
    }
}
