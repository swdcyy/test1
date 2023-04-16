package com.kuaishou.commercial.splash.presenter.o;
import android.view.View$OnClickListener;
import com.kuaishou.commercial.splash.presenter.q;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import nl9.h0;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nl9.m;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import gz.i2;
import gz.h2;
import z1.a;

public final class o implements View$OnClickListener	// class@0015fe
{
    public final q b;

    public void o(q p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, q.class, "8")) {
       }else {
          q w = tb.w;
          Objects.requireNonNull(w);
          d.a(-536296199).WK(tb.getActivity(), d.a(-2125799450).iJ(tb.q.mEntity, 1), new i2(w));
       }
       return;
    }
}
