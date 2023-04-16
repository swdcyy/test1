package com.kwai.live.gzone.accompanyplay.audience.n$a;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.audience.n;
import com.kwai.live.gzone.accompanyplay.audience.n$c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;

public class n$a implements View$OnClickListener	// class@000b9a
{
    public int b;
    public n$c c;
    public final n d;

    public void n$a(n p0,int p1,n$c p2){
       this.d = p0;
       super();
       this.c = p2;
       this.b = p1;
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$a.class, "1")) {
          return;
       }
       this.c.a(p0, this.b);
       this.d.o();
       return;
    }
}
