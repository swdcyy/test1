package do1.b;
import android.view.View$OnClickListener;
import do1.d;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lp3.e;
import p91.m;
import xp5.g;
import lp3.c;
import sx1.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import pw1.a;
import com.yxcorp.gifshow.model.CDNUrl;
import sx1.a$b;
import java.lang.System;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import tkd.b;
import tkd.d;
import dw5.a;
import bw5.u;
import java.lang.Iterable;
import qk.m;
import com.google.common.collect.ImmutableList;
import com.kwai.feature.api.social.message.imshare.model.IMShareRequest;
import lnc.a1;

public final class b implements View$OnClickListener	// class@001fd9
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, uod, "9")) {
       }else {
          tb.R8();
          if (tb.x != null) {
             if (!PatchProxy.applyVoid(objArray, tb, uod, "11") && tb.z.t5().a(g.class).e()) {
                a uoa = new a(tb.getActivity(), tb.z.getLiveStreamId(), tb.z.t5().a(a.class).vd(), tb.A);
                a uoa1 = a.class;
                if (!PatchProxy.applyVoid(objArray, uoa, uoa1, "1")) {
                   String str = String.valueOf(System.currentTimeMillis());
                   ImmutableList immutableLis = PatchProxy.apply(objArray, uoa, uoa1, "8");
                   if (immutableLis != PatchProxyResult.class) {
                   }else {
                      immutableLis = m.s(d.a(0x7904f115).hS(0)).v(1).B();
                   }
                   IMShareRequest iMShareReque = uoa.a(str, immutableLis);
                   iMShareReque.comment = a1.p(0x7f101d72);
                   uoa.c(str);
                   d.a(0x7904f115).S40(uoa.a, iMShareReque);
                }
             }
          }else {
             tb.V8(1);
          }
       }
       return;
    }
}
