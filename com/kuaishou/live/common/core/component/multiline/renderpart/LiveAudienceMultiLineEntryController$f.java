package com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController$f;
import mq5.h;
import com.kuaishou.live.common.core.component.multiline.renderpart.LiveAudienceMultiLineEntryController;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rq1.a;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatRoomInfo;
import lh3.b;
import kotlin.jvm.internal.a;
import nh3.b;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import nh3.c;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Integer;
import lq1.c;
import java.lang.System;

public final class LiveAudienceMultiLineEntryController$f implements h	// class@0014fa
{
    public final LiveAudienceMultiLineEntryController b;

    public void LiveAudienceMultiLineEntryController$f(LiveAudienceMultiLineEntryController p0){
       this.b = p0;
       super();
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public final void k(){
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, LiveAudienceMultiLineEntryController$f.class, "1")) {
          return;
       }
       LiveAudienceMultiLineEntryController t = obj.b.t;
       if (t != null && (!PatchProxy.applyVoid(objArray, t, a.class, "6") && t.a != null)) {
          SCInteractiveChatRoomInfo sCInteractiv = t.n.b();
          if (sCInteractiv != null) {
             a.m(sCInteractiv);
             b uob = t.e(sCInteractiv);
             if (!q.f(uob.f())) {
                List list = uob.f();
                a.m(list);
                Iterator iterator = list.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      c uoc = iterator.next();
                      a.o(uoc, "userInfo");
                      if (a.g(uoc.c().mId, t.l)) {
                         objArray = uoc.b();
                      }
                   }
                }
             }
             t.d.clear();
             t.e.clear();
             t.b(10, "MULTI_LIVE_CHAT_MODE_PLAY", objArray, uob.a(), "AUTHOR_END_LIVE", Integer.valueOf(uob.b()), uob.c(), t.a(t.o), t.o.Y(), System.currentTimeMillis(), t.b, t.d, t.e, t.f);
             t.d();
          }
       }
       return;
    }
}
