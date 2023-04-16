package com.kwai.live.gzone.accompanyplay.audience.b0$a;
import com.kwai.live.gzone.accompanyplay.audience.b0$c;
import com.kwai.live.gzone.accompanyplay.audience.b0;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;

public class b0$a implements b0$c	// class@000b68
{
    public final b0 a;

    public void b0$a(b0 p0){
       this.a = p0;
       super();
    }
    public void a(View p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b0$a.class, "1")) {
          return;
       }
       this.a.p.o(p1);
       return;
    }
}
