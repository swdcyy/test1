package com.yxcorp.gifshow.channel.stagger.header.subentrance.a$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.channel.stagger.header.subentrance.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hlb.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import k2b.u1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wkd.b;
import nf6.i;
import android.net.Uri;
import ekd.w0;
import android.content.Context;
import android.content.Intent;

public class a$a extends m	// class@00106b
{
    public final a c;

    public void a$a(a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a v = this.c.v;
       if (v != null && !TextUtils.x(v.mLinkUrl)) {
          a$a tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(null, tc, a.class, "6")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "FIXED_OPERATION_POSITION";
             uElementPack.params = tc.P8();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.ksOrderInfoPackage = l0.a(tc.v.mKsOrderId);
             u1.u(1, uElementPack, uContentPack);
          }
          this.c.getActivity().startActivity(b.a(0x66dce92a).a(this.c.getActivity(), w0.f(this.c.v.mLinkUrl)));
       }
       return;
    }
}
