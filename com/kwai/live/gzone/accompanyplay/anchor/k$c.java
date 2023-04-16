package com.kwai.live.gzone.accompanyplay.anchor.k$c;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.anchor.k;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.EditText;

public class k$c implements View$OnClickListener	// class@000b1e
{
    public final k b;

    public void k$c(k p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$c.class, "1")) {
          return;
       }
       this.b.p.setText("");
       return;
    }
}
