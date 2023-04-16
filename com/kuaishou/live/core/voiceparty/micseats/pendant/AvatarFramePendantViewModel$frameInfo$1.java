package com.kuaishou.live.core.voiceparty.micseats.pendant.AvatarFramePendantViewModel$frameInfo$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.micseats.pendant.AvatarFramePendantViewModel;
import java.lang.Object;
import java.util.Map;
import com.kwai.framework.model.user.UserInfo;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import su2.b;
import msd.a;
import java.lang.Boolean;
import java.util.Collection;

public final class AvatarFramePendantViewModel$frameInfo$1 extends Lambda implements p	// class@0015c9
{
    public final AvatarFramePendantViewModel this$0;

    public void AvatarFramePendantViewModel$frameInfo$1(AvatarFramePendantViewModel p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final List invoke(Map p0,UserInfo p1){
       b a;
       List list;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       List obj = PatchProxy.applyTwoRefs(p0, p1, this, AvatarFramePendantViewModel$frameInfo$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "avatarFrameInfoList");
       obj = null;
       p1 = (p1 != null)? p1.mId: obj;
       b uob = p0.get(p1);
       AvatarFramePendantViewModel$frameInfo$1 tthis$0 = this.this$0;
       if (tthis$0.i == null) {
          if (uob != null) {
             obj = uob.a();
          }
       }else if(uob != null){
          boolean b = tthis$0.h.invoke().booleanValue();
          b uob1 = b.class;
          if (PatchProxy.isSupport(uob1)) {
             obj = PatchProxy.applyOneRefs(Boolean.valueOf(b), uob, uob1, "2");
             if (obj != patchProxyRe) {
             }
          }
          a = uob.a;
          int i = 1;
          if (a != 2) {
             if (a == 3) {
                b = false;
             }
          }else {
             b = true;
          }
          if (b) {
             b c = uob.c;
             if (c != null && !c.isEmpty()) {
                i = 0;
             }
             if (!i) {
                uob = uob.c;
             }else {
                list = uob.b();
             }
          }else {
             List list1 = uob.b();
             list = (list1 != null)? list1: uob.c;
          }
          uob1 = uob;
       }
       return obj;
    }
}
