package com.kuaishou.live.lite.util.viewupdater.PosRandomChangeLinearLayout$a$b;
import java.lang.Runnable;
import com.kuaishou.live.lite.util.viewupdater.PosRandomChangeLinearLayout$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.util.viewupdater.PosRandomChangeLinearLayout;
import z1.a;

public final class PosRandomChangeLinearLayout$a$b implements Runnable	// class@000ba0
{
    public final PosRandomChangeLinearLayout$a b;
    public final View c;

    public void PosRandomChangeLinearLayout$a$b(PosRandomChangeLinearLayout$a p0,View p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PosRandomChangeLinearLayout$a$b.class, "1")) {
          return;
       }
       PosRandomChangeLinearLayout f = this.b.b.f;
       if (f != null) {
          f.accept(this.c);
       }
       return;
    }
}
