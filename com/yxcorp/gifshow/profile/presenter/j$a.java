package com.yxcorp.gifshow.profile.presenter.j$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.presenter.j;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.n0;
import i4c.y0;
import java.util.Objects;
import ja5.c;
import ja5.c$a;
import com.yxcorp.gifshow.util.rx.RxBus;
import i3c.i;

public class j$a extends m	// class@00144e
{
    public final j c;

    public void j$a(j p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "1")) {
          return;
       }
       if (this.c.C.isLoading() && this.c.C.g()) {
          this.c.C.p0();
       }
       j$a tc = this.c;
       j b = tc.B;
       y0 oy0 = new y0(this);
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidThreeRefs(p0, b, oy0, tc, c.class, "4")) {
          tc.S8(p0, b, oy0, -1);
       }
       RxBus.f.b(new i());
       return;
    }
}
