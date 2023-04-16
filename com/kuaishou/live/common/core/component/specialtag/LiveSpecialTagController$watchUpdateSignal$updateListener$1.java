package com.kuaishou.live.common.core.component.specialtag.LiveSpecialTagController$watchUpdateSignal$updateListener$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import vx1.c;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.SCLiveSpecialTagUpdate;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import crd.b;
import oh3.j;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import android.os.SystemClock;
import uc.d;
import brd.t;
import com.kuaishou.live.common.core.basic.tools.l;
import vx1.d;
import erd.g;
import vx1.f;
import vx1.g;

public final class LiveSpecialTagController$watchUpdateSignal$updateListener$1 extends Lambda implements l	// class@00177a
{
    public final c this$0;

    public void LiveSpecialTagController$watchUpdateSignal$updateListener$1(c p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(SCLiveSpecialTagUpdate p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSpecialTagController$watchUpdateSignal$updateListener$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       LiveSpecialTagController$watchUpdateSignal$updateListener$1 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       c uoc = c.class;
       if (!PatchProxy.applyVoidOneRefs(p0, tthis$0, uoc, "5")) {
          SCLiveSpecialTagUpdate obj = PatchProxy.applyOneRefs(p0, tthis$0, uoc, "6");
          boolean b = false;
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = p0.tagIcon;
             if (obj != null) {
                a.o(obj, "message.tagIcon");
                int i = (!obj.length)? 1: 0;
                if ((i ^ 1) && (p0.tagExpireTime > 0 && p0.tagId)) {
                   b = true;
                }
             }
          }
          if (!b) {
             b.Z(c.k, "handleTagUpdate, invalid message, "+p0);
          }else {
             b.Z(c.k, "handleTagUpdate, id: "+p0.tagId+", expireTime: "+p0.tagExpireTime);
             if (!PatchProxy.applyVoidOneRefs(p0, tthis$0, uoc, "7")) {
                tthis$0.d();
                j.a(tthis$0.c);
                CDNUrl[] uCDNUrlArray = e0.i(p0.tagIcon);
                a.o(uCDNUrlArray, "CDNUtil.parsePicUrl\(tagMessage.tagIcon\)");
                tthis$0.c = l.e(uCDNUrlArray, null).doOnNext(new d(SystemClock.elapsedRealtime())).subscribe(new f(tthis$0, p0), g.b);
             }
          }
       }
       return;
    }
}
