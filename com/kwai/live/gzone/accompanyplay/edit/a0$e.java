package com.kwai.live.gzone.accompanyplay.edit.a0$e;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.edit.a0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.edit.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import n37.k;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyGameInfo;
import h37.n0;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.kwai.live.gzone.accompanyplay.edit.d0;
import io.reactivex.g;
import com.kwai.live.gzone.accompanyplay.edit.a0$e$a;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class a0$e implements View$OnClickListener	// class@000bd4
{
    public final a0 b;

    public void a0$e(a0 p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a0$e.class, "1")) {
          return;
       }
       n0.j(this.b.p.o.a(), this.b.s.b);
       a0$e tb = this.b;
       Objects.requireNonNull(tb);
       t ot = PatchProxy.apply(null, tb, a0.class, "16");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = t.create(new d0(tb));
       }
       tb.X7(ot.subscribe(new a0$e$a(this)));
       return;
    }
}
