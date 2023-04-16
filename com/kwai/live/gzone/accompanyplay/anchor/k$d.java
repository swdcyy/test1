package com.kwai.live.gzone.accompanyplay.anchor.k$d;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.anchor.k;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.kwai.library.widget.popup.common.c;
import f37.o0;

public class k$d implements View$OnClickListener	// class@000b1f
{
    public final k b;

    public void k$d(k p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$d.class, "1")) {
          return;
       }
       k$d tb = this.b;
       if (tb.w != null) {
          o0.m(tb.u(), this.b.w);
       }
       return;
    }
}
