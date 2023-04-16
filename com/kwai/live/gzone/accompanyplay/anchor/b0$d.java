package com.kwai.live.gzone.accompanyplay.anchor.b0$d;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.anchor.b0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.CheckBox;

public class b0$d implements View$OnClickListener	// class@000afb
{
    public final b0 b;

    public void b0$d(b0 p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0$d.class, "1")) {
          return;
       }
       b0 c = this.b.C;
       c.setChecked((c.isChecked() ^ 0x01));
       return;
    }
}
