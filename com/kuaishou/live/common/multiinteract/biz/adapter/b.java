package com.kuaishou.live.common.multiinteract.biz.adapter.b;
import lh3.g;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatRoomInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import oh3.i;
import qk.m;
import oh3.h;
import ok.o;
import com.google.common.base.Optional;
import oh3.g;
import ok.h;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import pp.c;
import com.kuaishou.android.live.log.b;

public class b implements g	// class@0017e5
{
    public String a;
    public boolean b;
    public String c;

    public void b(String p0){
       super();
       this.a = null;
       this.b = false;
       this.c = p0;
    }
    public boolean a(InteractiveChatRoomInfo p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       b = false;
       if (p0 != null && p0.userInfo != null) {
          b tc = this.c;
          Object obj1 = null;
          Object obj2 = PatchProxy.applyTwoRefs(p0, tc, obj1, i.class, "3");
          if (obj2 != patchProxyRe) {
             obj1 = obj2;
          }else {
             p0 = p0.userInfo;
             if (p0 != null && tc != null) {
                obj1 = m.t(p0).r(new h(tc)).transform(g.b).orNull();
             }
          }
          Object obj3 = obj1;
          b ta = this.a;
          if (ta != null && TextUtils.equals(obj3, ta)) {
             b.C(LiveLogTag.LIVE_MULTI_INTERACT, "shouldInterceptSwitchBiz", c.l("lastSession", this.a, "newSession", obj3, "isLocalClosed", Boolean.valueOf(this.b)));
             return this.b;
          }else {
             this.a = obj3;
             this.b = b;
          }
       }
       return b;
    }
}
