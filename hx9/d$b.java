package hx9.d$b;
import android.view.View$OnClickListener;
import hx9.d;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.tabs.panel.h$b;
import tkd.b;
import tkd.d;
import um5.b;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import tyc.q4;

public final class d$b implements View$OnClickListener	// class@002729
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "1")) {
          return;
       }
       if (!this.b.V8()) {
          this.b.a9();
          d.a(-2119626676).nv("COLLECTION", Integer.valueOf((int)d.b9(this.b).numberOfCollects()), d.b9(this.b));
       }else {
          d x = this.b.x;
          if (x == null) {
             a.S("mCommentPanelHostFragment");
          }
          q4.e(x.t());
       }
       return;
    }
}
