package com.kwai.live.gzone.bridge.a$c;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.bridge.a;
import f55.g;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class a$c implements View$OnClickListener	// class@000c76
{
    public final g b;
    public final a c;

    public void a$c(a p0,g p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
          return;
       }
       this.c.Oa(this.b, 0, R.string.arg_RES_7f104fc9);
       return;
    }
}
