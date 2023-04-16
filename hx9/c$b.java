package hx9.c$b;
import android.view.View$OnClickListener;
import hx9.c;
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

public final class c$b implements View$OnClickListener	// class@002725
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$b.class, "1")) {
          return;
       }
       if (!this.b.V8()) {
          this.b.a9();
          e.a.a("LIKE_AREA", c.b9(this.b).numberOfLike(), c.b9(this.b));
       }else {
          c x = this.b.x;
          if (x == null) {
             a.S("mCommentPanelHostFragment");
          }
          q4.e(x.t());
       }
       return;
    }
}
