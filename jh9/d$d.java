package jh9.d$d;
import android.view.View$OnClickListener;
import jh9.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.core.view.ViewKt;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import kotlin.jvm.internal.a;

public final class d$d implements View$OnClickListener	// class@002ad9
{
    public final d b;

    public void d$d(d p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$d.class, "1")) {
          return;
       }
       d t = this.b.t;
       if (t != null) {
          ViewKt.g(t, false);
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("is_clicked_close_ktv_guide", true);
       g.a(uEditor);
       d$d tb = this.b;
       d r = tb.r;
       if (r == null) {
          a.S("postTemplateHeaderView");
       }
       tb.R8(r, d.D);
       return;
    }
}
