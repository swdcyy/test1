package com.kuaishou.live.preview.item.bottomcard.handler.h;
import hk3.a;
import com.kuaishou.live.preview.item.bottomcard.model.LivePreviewBottomCardModel;
import gk3.b;
import ll3.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.live.preview.item.bottomcard.handler.d;
import com.kuaishou.live.preview.item.bottomcard.handler.a;
import com.kuaishou.live.preview.item.bottomcard.handler.e;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kuaishou.live.preview.item.bottomcard.handler.c;
import com.kuaishou.live.preview.item.bottomcard.handler.b;
import com.kuaishou.live.preview.item.bottomcard.handler.f;
import fk3.c;
import fk3.b;
import com.yxcorp.gifshow.entity.QPhoto;
import brd.t;
import cjd.e;
import erd.o;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.kuaishou.live.preview.item.bottomcard.handler.g;
import crd.b;
import java.util.Map;
import com.kuaishou.live.preview.item.bottomcard.model.LivePreviewBottomCardExtraParam;
import java.lang.Throwable;
import java.lang.StringBuilder;
import rl3.c;

public final class h	// class@000d86
{

    public static void a(a p0,LivePreviewBottomCardModel p1,b p2){
       Object obj = PatchProxy.apply(null, null, j.class, "1");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().d(j.a, false);
       if (b) {
          b.b().b((long)p1.mBizId, p2.d().getUserId(), p2.d().getLiveStreamId(), k0.c(p1, d.a, a.a, e.a).orNull(), k0.c(p1, c.a, b.a, f.a).orNull()).map(new e()).subscribe(Functions.d(), g.b);
       }
       return;
    }
    public static String b(Map p0){
       return h.k(p0);
    }
    public static Map c(LivePreviewBottomCardExtraParam p0){
       return h.j(p0);
    }
    public static void d(Throwable p0){
       h.o(p0);
    }
    public static String e(Map p0){
       return h.n(p0);
    }
    public static LivePreviewBottomCardExtraParam f(LivePreviewBottomCardModel p0){
       return h.l(p0);
    }
    public static LivePreviewBottomCardExtraParam g(LivePreviewBottomCardModel p0){
       return h.i(p0);
    }
    public static Map h(LivePreviewBottomCardExtraParam p0){
       return h.m(p0);
    }
    public static LivePreviewBottomCardExtraParam i(LivePreviewBottomCardModel p0){
       return p0.mBottomCardExtraParam;
    }
    public static Map j(LivePreviewBottomCardExtraParam p0){
       return p0.mEventTrackData;
    }
    public static String k(Map p0){
       return p0.get("active_id");
    }
    public static LivePreviewBottomCardExtraParam l(LivePreviewBottomCardModel p0){
       return p0.mBottomCardExtraParam;
    }
    public static Map m(LivePreviewBottomCardExtraParam p0){
       return p0.mEventTrackData;
    }
    public static String n(Map p0){
       return p0.get("active_type");
    }
    public static void o(Throwable p0){
       c.a("handleErrorCardShowResponse: "+p0.getMessage());
    }
}
