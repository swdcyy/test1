package com.yxcorp.login.bind.presenter.z;
import android.view.View$OnClickListener;
import com.yxcorp.login.bind.presenter.a0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import c1d.b;
import okd.b;
import c1d.k;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import n3d.d;
import e1d.k0;
import n3d.a;

public final class z implements View$OnClickListener	// class@001aa4
{
    public final a0 b;

    public void z(a0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       z tb = this.b;
       Objects.requireNonNull(tb);
       b.a("USE_ELSE_NUMBER", null);
       b.a(-963936570).init(tb.getActivity()).i(tb.q).K(0).w(new k0(tb)).h();
    }
}
