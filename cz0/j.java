package cz0.j;
import cz0.b;
import java.lang.Object;
import bz0.e;
import xp5.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import fq5.b;
import t02.a0;
import p91.m;
import lp3.e;
import rp5.a;
import lp3.c;
import ht5.b;
import java.util.HashMap;
import d61.e0;
import java.util.Map;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.kuaishou.live.core.basic.activity.x;
import com.kuaishou.live.core.basic.activity.LivePlayFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import z12.x;
import ht5.c;
import fg6.a;
import com.google.gson.Gson;
import com.kuaishou.live.common.core.component.trace.gift.bean.LiveSendGiftTraceInfo;
import mm1.c;
import android.os.SystemClock;
import lm1.c;
import w91.a;
import lm1.g;
import com.yxcorp.gifshow.model.response.WalletResponse;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;
import com.google.gson.JsonElement;
import em1.c0;
import em1.b0;
import com.kuaishou.live.external.invoke.deserializer.gift.PacketGift;
import java.lang.System;
import com.kwai.framework.model.user.UserInfo;
import i12.a;
import brd.t;
import qj1.h;
import erd.o;
import cz0.i;
import erd.g;
import cjd.e;
import cz0.h;
import com.yxcorp.gifshow.models.Gift;
import cz0.j$a;
import crd.b;
import cz0.a;

public class j implements b	// class@001ecc
{

    public void j(){
       super();
    }
    public boolean a(e p0){
       e a;
       j$a obj = p0;
       i oi = i.class;
       a obj1 = PatchProxy.applyOneRefs(obj, this, j.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1.booleanValue();
       }
       e b = obj.b;
       obj1 = b.b().t5().a(a.class);
       i oi1 = b.b().t5().a(oi);
       a = obj.a;
       b a1 = a.a;
       if (a.f == null) {
          a.f = new HashMap();
       }
       a.f.put("expTagList", e0.b());
       FeedLogCtx uFeedLogCtx = b.b().t5().a(oi).c0();
       if (uFeedLogCtx != null) {
          a.f.put("interStid", uFeedLogCtx.stidContainer);
       }
       String str = null;
       a.f.put("commonStid", b.a(0x4b316083).i(obj.b.R().t0().o(), str));
       x.b(a.f, b);
       c uoc = new c();
       Gson a2 = a.a;
       uoc.mLogExtraInfo = a2.q(a.f);
       LiveSendGiftTraceInfo liveSendGift = p0.c();
       if (liveSendGift != null) {
          str = liveSendGift.f();
       }
       SystemClock.elapsedRealtime();
       c uoc1 = new c(obj.c, 0, null, b.Z2.t5().a(a.class).d6(), a.l);
       g og = new g(null, null, 0, "", null);
       j oj = this;
       e uoe = a;
       e uoe1 = p0;
       g og1 = v7;
       h oh = new h(oj, uoe, uoe1, a1, b, v24, v7);
       j$a uoa = v7;
       obj = v7;
       uoa = new j$a(oj, uoe, uoe1, og1, a1, b, v24);
       b0.a().a(str, b.Z2.getLiveStreamId(), a1.mItemId, a.b, a.d, System.currentTimeMillis(), a.o.mId, a2.q(uoc), a.a(b)).retryWhen(new h()).doOnNext(new i(v7)).map(new e()).subscribe(v14, obj);
       return true;
    }
    public b b(int p0){
       return a.b(this, p0);
    }
    public void c(e p0,String p1,String p2,int p3){
       a.a(this, p0, p1, p2, p3);
    }
}
