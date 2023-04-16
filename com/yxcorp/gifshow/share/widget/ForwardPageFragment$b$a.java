package com.yxcorp.gifshow.share.widget.ForwardPageFragment$b$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.widget.ForwardPageFragment$b;
import mhc.p1;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.share.widget.ForwardPageFragment;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import msd.p;
import qrd.l1;

public final class ForwardPageFragment$b$a implements View$OnClickListener	// class@001ce8
{
    public final ForwardPageFragment$b b;
    public final p1 c;
    public final int d;

    public void ForwardPageFragment$b$a(ForwardPageFragment$b p0,p1 p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardPageFragment$b$a.class, "1")) {
          return;
       }
       ForwardPageFragment$b d = this.b.d;
       ForwardPageFragment$b$a tc = this.c;
       a.o(tc, "item");
       ForwardPageFragment$b$a td = this.d;
       Objects.requireNonNull(d);
       if (!PatchProxy.isSupport(ForwardPageFragment.class) || (!PatchProxy.applyVoidTwoRefs(tc, Integer.valueOf(td), d, ForwardPageFragment.class, "5") && !d.isDetached())) {
          ForwardPageFragment d1 = d.d;
          if (d1 != null) {
             d1.invoke(tc, Integer.valueOf(td));
          }
       }
       return;
    }
}
