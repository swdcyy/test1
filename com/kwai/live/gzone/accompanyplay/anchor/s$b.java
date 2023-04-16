package com.kwai.live.gzone.accompanyplay.anchor.s$b;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.anchor.s;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class s$b implements View$OnClickListener	// class@000b32
{
    public final s b;

    public void s$b(s p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$b.class, "1")) {
          return;
       }
       this.b.S8(true);
       return;
    }
}
