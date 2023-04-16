package com.yxcorp.gifshow.hot.stagger.pagelist.g;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.hot.stagger.pagelist.j;
import java.lang.String;
import java.lang.Object;
import jb5.d;
import tkd.b;
import tkd.d;
import nl9.c0;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import brd.t;
import wkd.b;
import com.yxcorp.gifshow.w;
import com.yxcorp.gifshow.action.i;
import com.yxcorp.gifshow.hot.stagger.pagelist.e;
import yv8.c;
import yv8.a;
import java.util.List;
import qvb.a;
import hn5.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.api.feed.home.b;
import com.yxcorp.gifshow.refresh.RefreshType;
import r1b.b;
import com.google.gson.JsonObject;
import lb5.e;
import qvb.n0;
import java.util.UUID;
import mxb.n;
import ayb.i;
import mva.b;
import mva.a;
import o56.a;
import pe6.a;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import jb5.a;
import kva.a;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.log.h;
import hn5.f;
import android.app.Application;
import com.kwai.library.thirdparty.adchannelutils.AdChannelUtils;
import zc5.b;
import com.google.gson.JsonElement;
import e50.i;
import com.kuaishou.eve.kit.rerank.config.RankApiParams;
import wj9.h;
import ga5.e;
import u2b.c;
import erd.o;
import cjd.e;
import rva.f;
import erd.g;
import rva.j;
import rva.g;

public final class g implements Callable	// class@0018b0
{
    public final j b;
    public final String c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final int g;

    public void g(j p0,String p1,boolean p2,int p3,boolean p4,int p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final Object call(){
       t ot;
       String str1;
       g og1;
       g og2;
       g og = this;
       g b = og.b;
       g c = og.c;
       g d = og.d;
       g e = og.e;
       g f = og.f;
       g g = og.g;
       boolean b1 = b.D2();
       boolean i = -500494672;
       boolean b2 = false;
       boolean andSet = d.a(i).Jq().getAndSet(b2);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       String str = "hot";
       int i1 = 1;
       if (PatchProxy.isSupport(oj)) {
          Object[] objArray = new Object[]{c,Boolean.valueOf(d),Boolean.valueOf(b1),Integer.valueOf(e),Boolean.valueOf(f),Boolean.valueOf(andSet)};
          ot = PatchProxy.apply(objArray, b, oj, "8");
          if (ot != patchProxyRe) {
             str1 = str;
             og1 = g;
             og2 = c;
          label_0209 :
             return ot.to(new c(str1)).map(new e()).doOnSubscribe(new f(b)).doOnNext(new j(b, og2, og1)).doOnError(new g(b));
          }
       }
       b.a(-1343064608).H(str);
       String str2 = b.a(-129117978).g(b.M, e.a, b2);
       c0 uoc0 = d.a(i);
       List items = b.getItems();
       b2 = (b.u == 1)? true: false;
       uoc0.jb(items, b2);
       String str3 = b.a(0x1ffd7b71).A5();
       if (!TextUtils.x(str3)) {
          b.a(str3);
          b2 = 1;
       }else {
          b2 = 0;
       }
       JsonObject jsonObject = e.c(b.x2(), b.G, b2, str3);
       if (b.K() || TextUtils.x(b.P)) {
          b.P = UUID.randomUUID().toString();
       }
       jsonObject.c0("refresh_id", b.P);
       jsonObject = d.a(0x4f878389).OD(d.a(i).zf(b, jsonObject, new n()), "feedHot");
       b uob = a.a();
       String str4 = b.n2();
       String i2 = a.i;
       d u = b.u;
       long l = a.a();
       int i3 = d.a(i).Vz(7);
       HomeFeedResponse mCursor = (!b.K() && b.L0() != null)? b.L0().mCursor: "";
       HomeFeedResponse homeFeedResp = mCursor;
       Object[] objArray1 = null;
       a uoa = b.p;
       String obj = PatchProxy.apply(objArray1, b, oj, "26");
       i = (obj != patchProxyRe)? obj.booleanValue(): a.a.getBoolean("have_requested_hot_item", false);
       int i4 = i ^ 0x01;
       int i5 = 0;
       String sessionId = b.a(0x4b316083).getSessionId();
       float f1 = b.Y2();
       int i6 = f.a();
       String str5 = AdChannelUtils.a(a.b());
       String str6 = (d != null)? "1": "0";
       String str7 = str6;
       long l1 = b.a(-869999145).j();
       String str8 = b.a(-869999145).d();
       Boolean uBoolean = (b1)? Boolean.TRUE: objArray1;
       str1 = str;
       og1 = g;
       og2 = c;
       ot = uob.a(str4, i2, andSet, 7, u, andSet, e, null, l, i3, homeFeedResp, uoa, og2, i4, i5, sessionId, f1, f, i6, str5, str7, 0, l1, str8, 0, uBoolean, jsonObject.toString(), RankApiParams.a(b.E.isEnabled()), null, b.E.s2(), b.N, null, null, str2, h.b(), b.I, e.e("h"), b.E.v2());
       goto label_0209 ;
    }
}
