package com.kuaishou.live.lite.share.a$b;
import yh3.a;
import com.kuaishou.live.lite.share.a;
import com.kuaishou.live.lite.share.a$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.share.c;
import com.kuaishou.live.lite.share.h;
import com.kuaishou.live.lite.share.c$a;
import z1.k;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import or5.b;
import mhc.n1;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.yxcorp.gifshow.share.OperationModel;
import com.kuaishou.live.lite.share.b;
import msd.l;
import com.yxcorp.gifshow.share.OperationModel$d;
import com.yxcorp.gifshow.share.KwaiOperator;
import com.yxcorp.gifshow.share.KwaiOperator$Style;
import java.util.List;
import java.util.Collections;
import mhc.o0;
import dd3.f;
import com.kwai.framework.model.feed.BaseFeed;
import zic.a;
import com.kwai.sharelib.a;
import sx1.h;
import ed3.a;
import java.util.Map;
import java.util.Collection;
import com.yxcorp.gifshow.util.o;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionWithImPanelFragment;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import pj2.r;
import msd.a;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$Companion;
import djc.y0;
import gic.l;
import dd3.d;
import gic.o;
import gic.f;
import gic.n;
import com.yxcorp.gifshow.share.KsShareBuilder;
import com.kwai.feature.api.social.login.model.LoginParams;
import mhc.o2;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Objects;
import pj2.p;
import lnc.c3$a;
import lnc.c3;
import com.kwai.feature.api.social.message.imshare.model.SharePosInfo;
import pj2.o;
import uo7.l;
import com.google.gson.JsonObject;
import d61.e0;
import uo7.q;
import dd3.g;
import mhc.p;
import uo7.b0;
import uo7.d;
import uo7.k;
import uo7.u;
import uo7.h;
import com.yxcorp.gifshow.share.operation.b;
import uo7.f0;
import oic.q;
import mhc.c0;
import ed3.b;
import com.yxcorp.utility.TextUtils;
import y92.f;

public class a$b extends a	// class@000b12
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public void u0(a$a p0){
       String str3;
       boolean b;
       Object[] objArray1;
       c$a obj = this;
       c obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, a$b.class, str)) {
          return;
       }
       c uoc = new c();
       a$b a = obj.a;
       a.n.e = obj1.b;
       a uoa = a.class;
       Object[] objArray = null;
       c$a uoa1 = PatchProxy.apply(objArray, a, uoa, "4");
       String str1 = "5";
       if (uoa1 != PatchProxyResult.class) {
       }else {
          str3 = PatchProxy.apply(objArray, a, uoa, str1);
          if (str3 != PatchProxyResult.class) {
          }else {
             str3 = a.m.get();
             if (TextUtils.isEmpty(str3)) {
                str3 = "LIVE_STREAM";
             }
          }
          uoa1 = new c$a(a.B2(), a.l.r5(), a.n, str3);
       }
       String str2 = uoa1;
       str2.e = obj1.a;
       obj1 = c.class;
       if (!PatchProxy.applyVoidOneRefs(str2, uoc, obj1, str)) {
          b.c0(LiveLiteLogTag.SHARE, "LiveLiteShareHelper.share", "param", str2);
          LiveStreamFeed liveStreamFe = str2.a();
          OperationModel operationMod = PatchProxy.applyOneRefs(liveStreamFe, uoc, obj1, str1);
          if (operationMod != PatchProxyResult.class) {
          }else {
             operationMod = OperationModel.C.a(new b(uoc, liveStreamFe));
          }
          Object obj2 = operationMod;
          c$a a1 = str2.a;
          str3 = "7";
          KwaiOperator kwaiOperator = PatchProxy.applyTwoRefsWithListener(a1, obj2, uoc, obj1, str3);
          if (kwaiOperator != PatchProxyResult.class) {
          }else {
             kwaiOperator = new KwaiOperator(a1, obj2, KwaiOperator$Style.SECTION_LIGHT_REFACTOR, Collections.emptyList());
             PatchProxy.onMethodExit(obj1, str3);
          }
          Object obj3 = kwaiOperator;
          o0 oo0 = PatchProxy.applyOneRefs(liveStreamFe, uoc, obj1, "8");
          if (oo0 != PatchProxyResult.class) {
          }else {
             oo0 = a.b(liveStreamFe, new f(uoc, objArray));
          }
          obj3.m(oo0);
          a uoa2 = PatchProxy.applyThreeRefs(str2, obj2, obj3, uoc, c.class, "2");
          b = true;
          if (uoa2 != PatchProxyResult.class) {
             objArray1 = objArray;
          }else {
             liveStreamFe = str2.a();
             h oh = new h(b, obj3, str2.b.isWishLive());
             Map map = new a(obj2).a();
             Collection uCollection = o.c(map, false);
             ForwardGridSectionFragment uForwardGrid = ForwardGridSectionFragment.W0.c(str2.a, new r(new ForwardGridSectionWithImPanelFragment()));
             ForwardGridSectionFragment uForwardGrid1 = (uForwardGrid instanceof y0)? uForwardGrid: null;
             Map map1 = map;
             l ol = new l(new d(uoc, str2), str2.c, new o(), uForwardGrid1);
             KsShareBuilder ksShareBuild = new KsShareBuilder(str2.a, str2.d, liveStreamFe.getId(), o2.d(obj2.i(), 37), uForwardGrid);
             KsShareBuilder ksShareBuild1 = obj.s(uCollection);
             objArray1 = null;
             ArrayList uArrayList = PatchProxy.apply(objArray1, uoc, obj1, "12");
             if (uArrayList != PatchProxyResult.class) {
             }else {
                uArrayList = Lists.b();
             }
             ksShareBuild1 = ksShareBuild1.u(uArrayList);
             Objects.requireNonNull(ksShareBuild1);
             c3.c(obj3.f(), new p(ksShareBuild1));
             c3.c(obj3.k(), new o(ksShareBuild1));
             KsShareBuilder ksShareBuild2 = ksShareBuild1.o("LIVESTREAM_OTHER").l(uoc.a(str2.a()));
             JsonObject jsonObject = PatchProxy.applyOneRefs(str2, uoc, obj1, "11");
             if (jsonObject != PatchProxyResult.class) {
             }else {
                jsonObject = uoc.a(str2.a());
                JsonObject jsonObject1 = new JsonObject();
                jsonObject1.c0("serverExpTag", e0.c(str2.b));
                jsonObject1.c0("expTagList", e0.b());
             }
             ksShareBuild2 = ksShareBuild2.e(jsonObject);
             c$a d = str2.d;
             g og = PatchProxy.applyTwoRefs(liveStreamFe, d, uoc, obj1, "13");
             if (og != PatchProxyResult.class) {
             }else {
                og = new g(uoc, liveStreamFe, d);
             }
             ksShareBuild2.n(og).g(new p(obj2.i())).f(oh).p("LIVE_STREAM");
             l ol1 = ol;
             uoa2 = new a(ksShareBuild1.a(), str2.c).j(ol1).f("save", new b(str2.a)).f("im", ol1).f("copyLink", new q()).f("h5", new c0()).f("launchWechatMiniProgram", new b(str2.c)).g(map1);
          }
          obj = str2.e;
          if (!TextUtils.x(obj)) {
             Object obj4 = PatchProxy.applyOneRefs(obj, uoc, obj1, "9");
             if (obj4 != PatchProxyResult.class) {
                objArray = obj4;
             }else if(TextUtils.x(obj)){
                objArray = objArray1;
             }else {
                String str4 = o2.a(true, obj);
             }
             Objects.requireNonNull(uoa2);
             c3.c(objArray, new f(uoa2));
          }else {
             uoa2.l();
          }
       }
       return;
    }
}
