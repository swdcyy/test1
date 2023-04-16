package com.kwai.live.gzone.accompanyplay.edit.j0$a;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.edit.j0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.edit.m;

public class j0$a implements View$OnClickListener	// class@000bfa
{
    public final j0 b;

    public void j0$a(j0 p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0$a.class, "1")) {
          return;
       }
       j0$a tb = this.b;
       boolean b = (tb.F.q != null)? true: false;
       tb.Z8(false, b);
       return;
    }
}
