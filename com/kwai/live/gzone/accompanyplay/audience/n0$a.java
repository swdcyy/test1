package com.kwai.live.gzone.accompanyplay.audience.n0$a;
import com.yxcorp.gifshow.widget.m;
import com.kwai.live.gzone.accompanyplay.audience.n0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.live.gzone.accompanyplay.audience.n;
import com.kwai.live.gzone.widget.e$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.accompanyplay.audience.o0;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.live.gzone.widget.e;
import com.kwai.live.gzone.accompanyplay.audience.n$b;
import lnc.a1;
import com.kwai.live.gzone.accompanyplay.audience.LiveGzoneAudienceAccompanyState;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import java.util.ArrayList;
import ekd.j;
import java.util.List;
import java.util.Iterator;
import k37.p1;
import k37.v0;
import com.kwai.live.gzone.accompanyplay.audience.n$c;
import com.kwai.library.widget.popup.common.c;
import f37.b0;

public class n0$a extends m	// class@000b9d
{
    public final n0 c;

    public void n0$a(n0 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0$a.class, "1")) {
          return;
       }
       n0$a tc = this.c;
       Objects.requireNonNull(tc);
       String str = "4";
       if (!PatchProxy.applyVoidOneRefs(p0, tc, n0.class, str)) {
          n on = new n(new e$a(tc.getActivity()));
          on.i0(new o0(tc, on));
          n$b[] uobArray = new n$b[]{new n$b(0x7f080cd1, a1.p(0x7f1023bb), 1, 1),new n$b(0x7f080cd0, a1.p(0x7f1023bc), 2, 1),new n$b(0x7f080cd4, a1.p(0x7f102329), 3, tc.r.j().a())};
          ArrayList uArrayList = j.a(uobArray);
          if (!PatchProxy.applyVoidOneRefs(uArrayList, on, n.class, str)) {
             on.z.clear();
             Iterator iterator = uArrayList.iterator();
             while (iterator.hasNext()) {
                n$b uob = iterator.next();
                if (uob.d != null) {
                   on.z.add(uob);
                }
             }
             on.o0();
          }
          on.C = tc.r.w();
          on.n0(new v0(tc));
          on.Z();
          tc.P8(on);
       }
       return;
    }
}
