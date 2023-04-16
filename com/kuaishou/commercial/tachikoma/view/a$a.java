package com.kuaishou.commercial.tachikoma.view.a$a;
import android.view.View$OnClickListener;
import com.kuaishou.commercial.tachikoma.view.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class a$a implements View$OnClickListener	// class@001691
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       if (!this.b.k.getVisibility()) {
          return;
       }
       if (!this.b.o.getVisibility()) {
          return;
       }
       this.b.f(3000);
       return;
    }
}
