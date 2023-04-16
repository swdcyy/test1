package com.yxcorp.gifshow.ad.detail.d;
import io.reactivex.g;
import com.yxcorp.gifshow.ad.detail.AppInstalledReceiver;
import java.lang.String;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import rc5.b;
import java.lang.reflect.Type;
import java.util.List;
import pc5.a;
import java.util.Iterator;
import com.kwai.component.misc.gamedownload.GameInstallInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.System;
import rc5.c;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import q2b.h$b;
import k2b.u1;
import brd.g;

public class d implements g	// class@00154b
{
    public final String b;
    public final AppInstalledReceiver c;

    public void d(AppInstalledReceiver p0,String p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       List list = a.a(b.e);
       if (list != null && !list.isEmpty()) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             GameInstallInfo gameInstallI = iterator.next();
             if (TextUtils.n(gameInstallI.mGameDownloadedName, this.b)) {
                if ((System.currentTimeMillis() - gameInstallI.mGameDownloadedTime) - c.d < 0) {
                   d tc = this.c;
                   d tb = this.b;
                   Objects.requireNonNull(tc);
                   if (!PatchProxy.applyVoidOneRefs(tb, tc, AppInstalledReceiver.class, "4")) {
                      ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
                      resultPackag.message = tb;
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      i3 oi3 = i3.f();
                      oi3.c("source", Integer.valueOf(1));
                      uElementPack.params = oi3.e();
                      h$b uob = h$b.d(7, 1659);
                      uob.q(resultPackag);
                      uob.k(uElementPack);
                      u1.r0(uob);
                   }
                   iterator.remove();
                   a.b(list);
                   break ;
                }else {
                   iterator.remove();
                   a.b(list);
                   break ;
                }
             }
          }
       }
       p0.onComplete();
       return;
    }
}
