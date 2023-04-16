package com.yxcorp.login.bind.presenter.e0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.utility.n;
import h3b.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import v0d.g;
import lnc.a1;
import nfc.k;
import ekd.p1;
import e1d.r0;
import erd.g;
import crd.b;
import brd.t;
import e1d.s0;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import e1d.t0;
import com.yxcorp.login.bind.presenter.e0$a;
import com.yxcorp.login.bind.presenter.d0;
import brd.w;
import erd.h;
import io.reactivex.internal.functions.Functions;
import com.kwai.feature.api.social.login.model.LoginParams;
import o1d.m;
import ekd.m1;
import com.kwai.library.widget.textview.SizeAdjustableTextView;
import android.widget.ImageView;
import e1d.p0;
import android.view.View$OnClickListener;
import mrd.c;

public class e0 extends PresenterV2	// class@001a6d
{
    public SizeAdjustableTextView p;
    public KwaiImageView q;
    public c r;

    public void e0(){
       super();
    }
    public void E8(){
       z a;
       if (PatchProxy.applyVoid(null, this, e0.class, "3")) {
          return;
       }
       View[] viewArray = new View[]{this.q};
       int i = 0;
       n.Z(i, viewArray);
       a.o(i);
       g.h(this.q);
       k.a(this.q, a1.d(R.dimen.arg_RES_7f070271));
       p1.c(this.q, 80, 80, 80, 80);
       e0 tr = this.r;
       if (tr != null) {
          tr.subscribe(new r0(this));
       }
       z c = d.c;
       a = d.a;
       t ot = t.fromCallable(new s0(this)).subscribeOn(c).observeOn(a);
       t ot1 = t.fromCallable(new t0(this)).subscribeOn(c).observeOn(a);
       ot = t.zip(ot, ot1, t.fromCallable(new e0$a(this)), new d0(this));
       ot.subscribe(Functions.d(), Functions.d());
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "5")) {
          return;
       }
       a.o((a.b() ^ 0x01));
       g.h(this.q);
       m.c(g.f(this.q), null);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2ea7);
       KwaiImageView kwaiImageVie = m1.f(p0, R.id.one_key_bind_protocol_checkbox);
       this.q = kwaiImageVie;
       kwaiImageVie.setSelected(false);
       m1.a(p0, new p0(this), R.id.one_key_bind_protocol_checkbox);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "1")) {
          return;
       }
       this.r = this.t8("KEY_CLICK_PROTOCOL_BUBBLE_SUBJECT");
       return;
    }
}
