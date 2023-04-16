package com.kwai.live.gzone.accompanyplay.edit.v$a;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.edit.v;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class v$a implements View$OnClickListener	// class@000c1a
{
    public final v b;

    public void v$a(v p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$a.class, "1")) {
          return;
       }
       this.b.V8(true);
       return;
    }
}
