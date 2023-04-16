package com.kuaishou.krn.page.c$a;
import android.view.View$OnClickListener;
import com.kuaishou.krn.page.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.page.c$b;

public final class c$a implements View$OnClickListener	// class@000912
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       c c = this.b.c;
       if (c != null) {
          c.setVisibility(8);
       }
       this.b.f.a();
       return;
    }
}
