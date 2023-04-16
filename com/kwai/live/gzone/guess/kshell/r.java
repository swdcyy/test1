package com.kwai.live.gzone.guess.kshell.r;
import com.yxcorp.gifshow.widget.m;
import com.kwai.live.gzone.guess.kshell.q;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import q57.a;
import java.util.Objects;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.content.Context;
import zf6.j;
import java.util.ArrayList;
import k07.f;
import java.lang.CharSequence;
import java.util.List;
import com.kwai.library.widget.popup.bubble.a$c;
import u53.a;
import p57.n;
import k07.h;
import com.kwai.library.widget.popup.bubble.a;
import k07.l;

public class r extends m	// class@000d66
{
    public final q c;

    public void r(q p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
          return;
       }
       a.h(this.c.H.a(), y.d(this.c.getActivity()));
       r tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, q.class, "10")) {
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(new f(a1.f(R.drawable.arg_RES_7f081385), a1.p(R.string.arg_RES_7f1022f6)));
          uArrayList.add(new f(j.n(tc.getContext(), R.drawable.arg_RES_7f08055a, 0x7f061dc4), a1.p(R.string.arg_RES_7f1022fe)));
          a$c uoc = a.a(tc.getActivity(), uArrayList, tc.x);
          uoc.y0(new n(tc));
          uoc.C0(a1.e(-4.00f));
          l.c(uoc, R.layout.arg_RES_7f0d059b);
       }
       return;
    }
}
