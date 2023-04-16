package jf1.d0$a;
import android.text.style.ClickableSpan;
import com.kuaishou.live.common.core.component.comments.model.PurchaseInfoMessage;
import o81.f;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class d0$a extends ClickableSpan	// class@002b64
{
    public final WeakReference b;
    public final PurchaseInfoMessage c;

    public void d0$a(PurchaseInfoMessage p0,f p1){
       super();
       this.c = p0;
       this.b = new WeakReference(p1);
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0$a.class, "1")) {
          return;
       }
       f uof = this.b.get();
       if (uof != null) {
          uof.b(this.c, p0);
       }
       return;
    }
}
