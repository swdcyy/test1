package com.kwai.live.gzone.accompanyplay.edit.j0$b;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.edit.j0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;

public class j0$b implements View$OnClickListener	// class@000bfb
{
    public final j0 b;

    public void j0$b(j0 p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0$b.class, "1")) {
          return;
       }
       if (this.b.u.isSelected()) {
          this.b.Z8(false, false);
       }
       return;
    }
}
