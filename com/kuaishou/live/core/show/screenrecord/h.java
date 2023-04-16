package com.kuaishou.live.core.show.screenrecord.h;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.screenrecord.j;
import java.lang.Object;
import android.view.View;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ij2.n0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordContainerFragment$c;
import im8.f;
import java.lang.Long;
import java.io.File;
import java.util.ArrayList;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.System;
import m26.a$a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.i;
import qr4.h$a;
import com.kwai.framework.model.user.User;
import lnc.a1;
import m26.a;
import r16.d;
import lnc.x6;
import lnc.y6;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.FragmentActivity;
import ij2.h0;
import java.lang.Runnable;
import android.os.Handler;

public final class h implements View$OnClickListener	// class@000fe4
{
    public final j b;

    public void h(j p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       h tb = this.b;
       ClientContent$LiveStreamPackage liveStreamPa = tb.s.a();
       Object obj = null;
       int i = 1;
       if (PatchProxy.applyVoidOneRefs(liveStreamPa, obj, n0.class, "9")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "CLICK_QUICK_PUBLISH_SUBCARD";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          u1.v(i, uElementPack, uContentPack, obj);
       }
       tb.r.close();
       j p = tb.p;
       long l = tb.q.get().longValue();
       j oj = j.class;
       if (!PatchProxy.isSupport(oj) || (!PatchProxy.applyVoidTwoRefs(p, Long.valueOf(l), tb, oj, "7") && p.exists())) {
          ArrayList uArrayList = new ArrayList();
          String path = p.getPath();
          QMedia qMedia = new QMedia((long)path.hashCode(), path, l, System.currentTimeMillis(), 1);
          uArrayList.add(p);
          a$a uoa = new a$a();
          uoa.p(uArrayList);
          VideoContext videoContext = PatchProxy.apply(obj, tb, oj, "8");
          if (videoContext != PatchProxyResult.class) {
          }else {
             videoContext = new VideoContext();
             videoContext.m0();
             videoContext.F().f = new h$a();
             videoContext.F().f.c = 8;
          }
          uoa.x(videoContext);
          uoa.u(u1.f());
          uoa.k(4);
          uoa.o(false);
          Object[] objArray = new Object[]{tb.s.I().mName,tb.s.I().mId};
          uoa.m(a1.r(R.string.arg_RES_7f102c08, String.format("%1$s\(O%2$s\)", objArray)));
          y6.r(d.class).Up(tb.getActivity(), 771, uoa.f());
       }
       tb.A.postDelayed(new h0(tb), 500);
       return;
    }
}
