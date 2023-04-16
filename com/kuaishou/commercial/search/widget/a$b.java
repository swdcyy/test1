package com.kuaishou.commercial.search.widget.a$b;
import o07.d$a;
import com.kuaishou.commercial.search.widget.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.View;

public final class a$b implements d$a	// class@001577
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void a(int p0){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       uob = this.b;
       uob.E = true;
       uob.s = p0;
       a z = uob.z;
       if (z != null) {
          a$b tb = this.b;
          tb.R8(z.getTranslationY(), (- ((float)p0 + tb.p)));
       }
       return;
    }
    public void b(int p0){
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "2")) {
          return;
       }
       a$b tb = this.b;
       tb.E = false;
       a z = tb.z;
       if (z != null) {
          uob = this.b;
          uob.R8(z.getTranslationY(), (- uob.q));
       }
       return;
    }
}
