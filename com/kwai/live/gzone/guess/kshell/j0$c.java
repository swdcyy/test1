package com.kwai.live.gzone.guess.kshell.j0$c;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.guess.kshell.j0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import fq5.b;
import y43.a;
import oq5.a;
import q57.a;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import zf6.j;
import java.util.ArrayList;
import k07.f;
import java.lang.CharSequence;
import android.app.Activity;
import java.util.List;
import com.kwai.library.widget.popup.bubble.a$c;
import u53.a;
import p57.q1;
import k07.h;
import com.kwai.library.widget.popup.bubble.a;
import k07.l;

public class j0$c implements View$OnClickListener	// class@000d43
{
    public final j0 b;

    public void j0$c(j0 p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j0$c.class, "1")) {
          return;
       }
       j0$c tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, j0.class, "4")) {
          a.h(tb.r.a(), tb.t.v.H2());
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(new f(a1.f(R.drawable.arg_RES_7f081385), a1.p(R.string.arg_RES_7f1022f6)));
          uArrayList.add(new f(j.n(tb.getContext(), R.drawable.arg_RES_7f08055a, 0x7f061dc4), a1.p(R.string.arg_RES_7f1022fe)));
          a$c uoc = a.a(tb.getActivity(), uArrayList, tb.y);
          uoc.y0(new q1(tb));
          uoc.C0(a1.e(-4.00f));
          l.c(uoc, R.layout.arg_RES_7f0d059b);
       }
       return;
    }
}
