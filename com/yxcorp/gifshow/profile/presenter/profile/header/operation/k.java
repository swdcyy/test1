package com.yxcorp.gifshow.profile.presenter.profile.header.operation.k;
import android.content.DialogInterface$OnClickListener;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.n;
import java.lang.String;
import android.widget.CompoundButton;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import s1c.j1;
import com.kwai.framework.model.user.User;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import java.util.Set;
import crd.b;
import com.yxcorp.gifshow.profile.util.o;
import com.yxcorp.gifshow.util.rx.RxBus;
import i3c.f;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import java.lang.Class;
import brd.t;
import s4c.h0;
import erd.g;

public final class k implements DialogInterface$OnClickListener	// class@001509
{
    public final n b;
    public final boolean c;
    public final String d;
    public final CompoundButton e;

    public void k(n p0,boolean p1,String p2,CompoundButton p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void onClick(DialogInterface p0,int p1){
       k tb = this.b;
       k tc = this.c;
       k td = this.d;
       k te = this.e;
       Objects.requireNonNull(tb);
       if (p1 == 0x7f100565) {
          o.A(tb.getActivity(), tb.A, tb.C, tb.z.e, true);
          tb.X7(RxBus.f.g(f.class, RxBus$ThreadMode.MAIN).subscribe(new h0(tb, tc, td, te)));
       }
       return;
    }
}
