package com.kuaishou.live.audience.component.comments.editor.asr.b$b;
import zx0.a;
import com.kuaishou.live.audience.component.comments.editor.asr.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import e17.i$b;
import e17.i;
import android.view.Window;
import android.view.View;
import android.view.ViewGroup;

public class b$b implements a	// class@000aa2
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b$b.class, "1")) {
          return;
       }
       if ((SystemClock.elapsedRealtime() - this.a.E) - TimeUnit.SECONDS.toMillis(1) > 0) {
          if (this.a.q.getDialog() != null) {
             i$b uob = i.m();
             uob.l(true);
             uob.x(R.string.arg_RES_7f101e22);
             uob.p(R.drawable.arg_RES_7f082462);
             uob.n(this.a.q.getDialog().getWindow().getDecorView());
             i.z(uob);
          }
          this.a.E = SystemClock.elapsedRealtime();
       }
       this.a.V8();
       return;
    }
}
