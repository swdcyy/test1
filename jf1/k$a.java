package jf1.k$a;
import android.text.style.ClickableSpan;
import com.kuaishou.live.common.core.component.comments.model.LiveFansGroupJoinMessage;
import o81.f;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class k$a extends ClickableSpan	// class@002b71
{
    public final WeakReference b;
    public final LiveFansGroupJoinMessage c;

    public void k$a(LiveFansGroupJoinMessage p0,f p1){
       super();
       this.b = new WeakReference(p1);
       this.c = p0;
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "1")) {
          return;
       }
       f uof = this.b.get();
       if (uof != null) {
          uof.b(this.c, p0);
       }
       return;
    }
}
