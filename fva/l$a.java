package fva.l$a;
import android.view.View$OnClickListener;
import fva.l;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import dva.a;
import com.kwai.written.view.IWrittenLayout;
import fva.k;
import k2b.e0;

public final class l$a implements View$OnClickListener	// class@002a0e
{
    public final l b;

    public void l$a(l p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$a.class, "1")) {
          return;
       }
       RxBus.f.b(new a(true));
       this.b.q.l1().setVisibility(8);
       k.a.a("FOLD", this.b.r);
       return;
    }
}
