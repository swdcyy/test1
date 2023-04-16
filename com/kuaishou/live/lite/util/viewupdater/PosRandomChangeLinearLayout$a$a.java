package com.kuaishou.live.lite.util.viewupdater.PosRandomChangeLinearLayout$a$a;
import java.lang.Runnable;
import com.kuaishou.live.lite.util.viewupdater.PosRandomChangeLinearLayout$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.util.viewupdater.PosRandomChangeLinearLayout;
import z1.a;

public final class PosRandomChangeLinearLayout$a$a implements Runnable	// class@000b9f
{
    public final PosRandomChangeLinearLayout$a b;
    public final View c;

    public void PosRandomChangeLinearLayout$a$a(PosRandomChangeLinearLayout$a p0,View p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PosRandomChangeLinearLayout$a$a.class, "1")) {
          return;
       }
       PosRandomChangeLinearLayout e = this.b.b.e;
       if (e != null) {
          e.accept(this.c);
       }
       return;
    }
}
