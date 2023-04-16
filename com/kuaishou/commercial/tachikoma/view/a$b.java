package com.kuaishou.commercial.tachikoma.view.a$b;
import android.view.View$OnClickListener;
import com.kuaishou.commercial.tachikoma.view.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k00.d;

public class a$b implements View$OnClickListener	// class@001692
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
          return;
       }
       this.b.a.setMuted((this.b.a.a() ^ 0x01));
       this.b.f(3000);
       return;
    }
}
