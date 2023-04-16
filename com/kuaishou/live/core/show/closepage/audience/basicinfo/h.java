package com.kuaishou.live.core.show.closepage.audience.basicinfo.h;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.closepage.audience.basicinfo.k;
import java.lang.Object;
import android.view.View;
import t02.a0;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mz6.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import mz6.a;
import mz6.b$d;
import f52.s;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import j52.b;
import f52.b;

public final class h implements View$OnClickListener	// class@000a3d
{
    public final k b;

    public void h(k p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       String str2;
       h tb = this.b;
       String str = "0";
       String str1 = "NULL";
       if (tb.F != null) {
          str2 = (tb.C != null)? "1": str;
       }else {
          str2 = str1;
       }
       int i = 0;
       if (tb.p.c.getUser().isFollowingOrFollowRequesting()) {
          if (!PatchProxy.applyVoid(null, tb, k.class, "11")) {
             b uob = new b(tb.getActivity());
             a uoa = a.b();
             uoa.i(i);
             uoa.o(R.color.arg_RES_7f06200e);
             uoa.g(R.string.arg_RES_7f104f07);
             uoa.p(R.dimen.arg_RES_7f070f70);
             uob.a(uoa.a());
             uoa = a.b();
             uoa.i(i);
             uoa.o(R.color.arg_RES_7f061767);
             uoa.g(R.string.arg_RES_7f104f05);
             uoa.p(R.dimen.arg_RES_7f070f73);
             uob.a(uoa.a());
             uob.l(new s(tb));
             uob.q();
          }
          b.b(tb.p.Z2.a(), true);
          ClientContent$LiveStreamPackage liveStreamPa = tb.p.Z2.a();
          if (tb.A != null) {
             str1 = "1";
          }
          b.c(liveStreamPa, "FOLLOW", "1", str2, str1);
       }else {
          tb.r.a(tb.p.c, true);
          b.b(tb.p.Z2.a(), i);
          ClientContent$LiveStreamPackage liveStreamPa1 = tb.p.Z2.a();
          if (tb.A != null) {
             str1 = "1";
          }
          b.c(liveStreamPa1, "FOLLOW", str, str2, str1);
       }
       return;
    }
}
