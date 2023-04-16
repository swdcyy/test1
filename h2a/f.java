package h2a.f;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import h2a.g;
import java.lang.Object;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.StringBuilder;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$h;
import h2a.e;
import java.lang.Runnable;
import android.view.View;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$m;

public class f implements BaseEditorFragment$c	// class@002546
{
    public final g a;

    public void f(g p0){
       this.a = p0;
       super();
    }
    public void a(BaseEditorFragment$g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.a.q.setText(p0.c);
       g p = this.a.p;
       StringBuilder str = "";
       int i = (TextUtils.x(p0.c))? 0: (p0.c).length();
       p.setText(str+i+"/"+100);
       return;
    }
    public void c(BaseEditorFragment$h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       if (p0.c != null && p0.a == -1) {
          g r = this.a.r;
          if (r != null) {
             r.postDelayed(new e(this), 50);
          }
       }
       return;
    }
    public void d(BaseEditorFragment$m p0){
    }
}
