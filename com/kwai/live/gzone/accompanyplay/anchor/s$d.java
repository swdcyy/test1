package com.kwai.live.gzone.accompanyplay.anchor.s$d;
import u07.u;
import com.kwai.live.gzone.accompanyplay.anchor.s;
import android.app.Activity;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class s$d implements u	// class@000b34
{
    public final Activity b;
    public final s c;

    public void s$d(s p0,Activity p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, s$d.class, "1")) {
          return;
       }
       this.c.P8(this.b, false);
       return;
    }
}
