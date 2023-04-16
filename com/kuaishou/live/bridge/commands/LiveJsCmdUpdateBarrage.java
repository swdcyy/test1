package com.kuaishou.live.bridge.commands.LiveJsCmdUpdateBarrage;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import com.kuaishou.live.bridge.commands.LiveJsCmdUpdateBarrage$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import bz1.a;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o63.m;
import o63.m$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.bridge.commands.LiveJsCmdUpdateBarrage$BarrageLikeData;
import lp3.c;
import kotlin.jvm.internal.a;
import java.lang.Long;
import dsd.a;

public final class LiveJsCmdUpdateBarrage extends AbstractLiveJsCommand	// class@000e05
{

    public void LiveJsCmdUpdateBarrage(){
       super();
    }
    public Class a(){
       return LiveJsCmdUpdateBarrage$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       a uoa = a.class;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveJsCmdUpdateBarrage.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof LiveJsCmdUpdateBarrage$a) {
          return m.g.c("invalid params");
       }
       if (TextUtils.x(p0.a())) {
          return m.g.c("invalid params, wishId is null");
       }
       if (p0.updateBarrageType != 1) {
          return m.g.c("invalid params, updateBarrageType not support");
       }
       if (p0.b() == null) {
          return m.g.c("invalid params, barrageLikeData is null");
       }
       if (this.g(uoa) == null) {
          return m.g.c("LiveAudienceWishRoomService is null");
       }
       a uoa1 = this.g(uoa);
       if (uoa1 != null) {
          String str = p0.a();
          a.m(str);
          LiveJsCmdUpdateBarrage$BarrageLikeData uBarrageLike = p0.b();
          Long longx = (uBarrageLike != null)? a.g(uBarrageLike.likeCount): null;
          a.m(longx);
          long l = longx.longValue();
          p0 = p0.b();
          p0 = (p0 != null)? p0.displayLikeCount: null;
          uoa1.Ji(str, l, p0);
       }
       return m$a.g(m.g, null, false, 3, null);
    }
}
