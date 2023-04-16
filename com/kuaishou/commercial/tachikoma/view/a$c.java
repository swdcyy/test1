package com.kuaishou.commercial.tachikoma.view.a$c;
import android.view.View$OnClickListener;
import com.kuaishou.commercial.tachikoma.view.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k00.d;

public class a$c implements View$OnClickListener	// class@001693
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
          return;
       }
       this.b.a.start();
       this.b.b();
       this.b.f(3000);
       return;
    }
}
