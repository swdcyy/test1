package com.kwai.live.gzone.accompanyplay.anchor.s$a;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.anchor.s;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class s$a implements View$OnClickListener	// class@000b31
{
    public final s b;

    public void s$a(s p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$a.class, "1")) {
          return;
       }
       this.b.S8(false);
       return;
    }
}
