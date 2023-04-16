package com.kwai.library.slide.base.widget.e$b;
import xtd.g$a;
import com.kwai.library.slide.base.widget.e;
import com.kwai.library.slide.base.widget.e$b$a;
import java.lang.Float;
import java.lang.Class;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.library.slide.base.widget.e$a;

public class e$b extends g$a	// class@0008ff
{
    public final e d;

    public void e$b(e p0){
       this.d = p0;
       super();
       this.a = new e$b$a(this, Float.class, "translateY", p0);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "1")) {
          return;
       }
       this.b = this.d.l;
       this.c = (float)p0.getHeight();
       this.d.k.g(this.b);
       return;
    }
}
