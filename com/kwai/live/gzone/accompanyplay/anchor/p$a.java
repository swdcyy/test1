package com.kwai.live.gzone.accompanyplay.anchor.p$a;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.anchor.p;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class p$a implements View$OnClickListener	// class@000b2a
{
    public final p b;

    public void p$a(p p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$a.class, "1")) {
          return;
       }
       this.b.R8();
       return;
    }
}
