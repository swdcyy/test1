package com.kwai.live.gzone.accompanyplay.anchor.k$b;
import java.lang.Runnable;
import com.kwai.live.gzone.accompanyplay.anchor.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.EditText;

public class k$b implements Runnable	// class@000b1d
{
    public final k b;

    public void k$b(k p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, k$b.class, "1")) {
          return;
       }
       this.b.p.requestFocus();
       return;
    }
}
