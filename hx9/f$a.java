package hx9.f$a;
import android.view.View$OnClickListener;
import hx9.f;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.tabs.panel.h$b;
import hx9.e;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import tyc.q4;

public final class f$a implements View$OnClickListener	// class@00272d
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       if (!this.b.V8()) {
          this.b.a9();
          f$a tb = this.b;
          e.a.a("VIEW_AREA", (int)tb.x, tb.y);
       }
       f w = this.b.w;
       if (w == null) {
          a.S("mCommentPanelHostFragment");
       }
       q4.e(w.t());
       return;
    }
}
