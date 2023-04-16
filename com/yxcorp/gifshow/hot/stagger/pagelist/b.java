package com.yxcorp.gifshow.hot.stagger.pagelist.b;
import erd.g;
import com.yxcorp.gifshow.hot.stagger.pagelist.j;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import e50.i;
import o56.d;
import java.lang.reflect.Type;
import com.kwai.framework.abtest.f;
import jb5.d;
import qc5.a;
import tkd.b;
import tkd.d;
import nl9.c0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.List;
import qvb.a;
import wkd.b;
import hn5.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.api.feed.home.b;
import com.yxcorp.gifshow.refresh.RefreshType;
import com.google.gson.JsonObject;
import lb5.e;
import mxb.n;
import qvb.n0;
import ayb.i;
import com.yxcorp.gifshow.action.i;
import com.yxcorp.gifshow.hot.stagger.pagelist.h;
import yv8.c;
import yv8.a;
import mva.b;
import mva.a;
import o56.a;
import pe6.a;
import jb5.a;
import com.yxcorp.gifshow.log.h;
import hn5.f;
import android.app.Application;
import com.kwai.library.thirdparty.adchannelutils.AdChannelUtils;
import zc5.b;
import com.google.gson.JsonElement;
import wj9.h;
import ga5.e;
import brd.t;
import u2b.c;
import erd.o;
import cjd.e;
import rva.i;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.hot.stagger.pagelist.c;
import rva.h;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class b implements g	// class@0018ab
{
    public final j b;

    public void b(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       boolean b2;
       float f;
       b b = this.b;
       Objects.requireNonNull(b);
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, oj, "13")) {
       }else {
          String obj = PatchProxy.apply(objArray, b, oj, "12");
          int i = 1;
          boolean b1 = false;
          if (obj != PatchProxyResult.class) {
             b2 = obj.booleanValue();
          }else if(!b.E.isEnabled() && (f.b("disablePrefetch", Boolean.class, Boolean.valueOf(d.d)).booleanValue() || b.F2())){
             b2 = true;
          }else {
             b2 = false;
          }
          if (!b2) {
             obj = j.T.a();
             d u = b.u;
             d y = b.y;
             boolean b3 = b.C2();
             int i1 = -500494672;
             boolean andSet = d.a(i1).Jq().getAndSet(b1);
             c0 uoc0 = d.a(i1);
             List items = b.getItems();
             boolean b4 = (b.u == i)? true: false;
             uoc0.jb(items, b4);
             String str = b.a(0x1ffd7b71).A5();
             if (!TextUtils.x(str)) {
                b.a(str);
             }else {
                i = 0;
             }
             JsonObject jsonObject = d.a(0x4f878389).OD(d.a(i1).zf(b, e.b(b.x2(), i, str), new n()), "feedHot");
             String str1 = b.a(-129117978).g(b.M, h.a, b1);
             b uob = a.a();
             str = a.i;
             d u1 = b.u;
             int i2 = b.X2();
             long l = a.a();
             int i3 = d.a(i1).Vz(7);
             HomeFeedResponse mCursor = (!b.K() && b.L0() != null)? b.L0().mCursor: "";
             HomeFeedResponse homeFeedResp = mCursor;
             a p = b.p;
             String sessionId = b.a(0x4b316083).getSessionId();
             f = b.Y2();
             int i4 = f.a();
             String str2 = AdChannelUtils.a(a.b());
             long l1 = b.a(-869999145).j();
             String str3 = b.a(-869999145).d();
             if (y != null) {
                objArray = Boolean.TRUE;
             }
             uob.b("", str, andSet, 7, u1, andSet, i2, false, l, i3, homeFeedResp, p, obj, false, null, sessionId, f, b3, i4, str2, "0", false, l1, str3, null, objArray, jsonObject.toString(), str1, b.N, h.b(), e.e("h")).to(new c("hot")).map(new e()).doOnNext(new i(b, obj, u)).observeOn(d.c).doOnNext(c.b).subscribe(new h(b), Functions.d());
          }
       }
       return;
    }
}
