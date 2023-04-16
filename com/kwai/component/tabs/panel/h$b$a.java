package com.kwai.component.tabs.panel.h$b$a;
import android.view.View$OnClickListener;
import com.kwai.component.tabs.panel.h$b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.tabs.panel.h$c;
import com.kwai.component.tabs.panel.h;

public class h$b$a implements View$OnClickListener	// class@000b80
{
    public final h$b b;

    public void h$b$a(h$b p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$b$a.class, "1")) {
          return;
       }
       h$b$a uob$a = (this.b.v.e() != null && this.b.v.e().a(this.b.V8()))? 1: null;
       if (!uob$a) {
          h$b t = this.b.t;
          if (t != null) {
             t.onClick(p0);
          }
       }
       return;
    }
}
