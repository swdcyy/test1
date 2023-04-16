package bwc.d;
import android.view.View$OnClickListener;
import bwc.e;
import com.yxcorp.gifshow.v3.mixed.model.b;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.yxcorp.gifshow.v3.mixed.MixImporterFragment;
import android.content.Intent;
import android.app.Activity;
import com.yxcorp.gifshow.v3.mixed.MixImporterActivity;
import hwc.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class d implements View$OnClickListener	// class@0004a6
{
    public final e b;
    public final b c;

    public void d(e p0,b p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       d tb = this.b;
       d tc = this.c;
       Objects.requireNonNull(tb);
       if (tc.v != null) {
       }else {
          tc.v = true;
          tb.q.j.setResult(0, new Intent());
          tb.q.j.finish();
          if (!PatchProxy.applyVoid(null, null, c.class, "4")) {
             c.a("close");
          }
       }
       return;
    }
}
