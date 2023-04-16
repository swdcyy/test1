package com.kuaishou.live.audience.course.l;
import java.lang.Runnable;
import android.content.Context;
import s31.y;
import java.lang.Object;
import android.app.Activity;
import e3a.a;
import com.kuaishou.live.common.core.basic.widget.h$a;
import com.kuaishou.live.common.core.basic.widget.h;
import s31.z;
import s31.a0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Dialog;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.StringBuilder;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import k2b.u1;

public final class l implements Runnable	// class@000c08
{
    public final Context b;
    public final y c;

    public void l(Context p0,y p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       l tb = this.b;
       l tc = this.c;
       Activity uActivity = a.b(tb);
       if (uActivity != null && !uActivity.isFinishing()) {
          h$a uoa = h.a(tb);
          String str = null;
          uoa.c = str;
          uoa.b = 0x7f102010;
          uoa.b(R.string.arg_RES_7f100902);
          uoa.f = new z(tc);
          uoa.g = new a0(tc);
          if (PatchProxy.apply(str, uoa, h$a.class, "2") != PatchProxyResult.class) {
          }else {
             uoa.a().show();
          }
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(str, tc, y.class, "7")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action = 1215;
             uElementPack.name = "knowledge_SHOW_PHONE_BIND_G_channel_"+tc.d;
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = y.a(tc.a);
             y.b(tc.d);
             u1.u0(4, uElementPack, uContentPack);
          }
       }
    label_008a :
       return;
    }
}
