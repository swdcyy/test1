package com.kuaishou.growth.pendant.debugtool.console.a;
import android.view.View$OnClickListener;
import com.kuaishou.growth.pendant.debugtool.console.ConsoleAdapter$a;
import ke0.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import msd.l;

public final class a implements View$OnClickListener	// class@000658
{
    public final ConsoleAdapter$a b;
    public final a c;

    public void a(ConsoleAdapter$a p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.b.b.invoke(this.c);
       return;
    }
}
