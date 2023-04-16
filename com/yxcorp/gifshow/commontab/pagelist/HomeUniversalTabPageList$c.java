package com.yxcorp.gifshow.commontab.pagelist.HomeUniversalTabPageList$c;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.commontab.pagelist.HomeUniversalTabPageList;
import java.lang.String;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.w;
import java.lang.Integer;
import brd.t;
import wkd.b;
import com.yxcorp.gifshow.w;
import com.yxcorp.gifshow.action.i;
import en9.c;
import yv8.c;
import yv8.a;
import tkd.b;
import tkd.d;
import nl9.c0;
import java.util.List;
import qvb.a;
import jb5.d;
import in9.c;
import q87.c;
import bn9.b;
import bn9.a;
import pe6.a;
import qvb.n0;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import kotlin.jvm.internal.a;
import u2b.c;
import erd.o;
import cjd.e;
import com.yxcorp.gifshow.commontab.pagelist.a;
import erd.g;
import com.yxcorp.gifshow.commontab.pagelist.c;
import com.yxcorp.gifshow.commontab.pagelist.d;

public final class HomeUniversalTabPageList$c implements Callable	// class@0011b5
{
    public final HomeUniversalTabPageList b;
    public final String c;
    public final int d;

    public void HomeUniversalTabPageList$c(HomeUniversalTabPageList p0,String p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object call(){
       t ot1;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = PatchProxy.apply(null, this, HomeUniversalTabPageList$c.class, "1");
       if (ot != patchProxyRe) {
       }else {
          HomeUniversalTabPageList$c tb = this.b;
          HomeUniversalTabPageList i = tb.I;
          int i1 = (i == null)? 20: i;
          i = HomeUniversalTabPageList.class;
          if (PatchProxy.isSupport(i)) {
             ot1 = PatchProxy.applyOneRefs(Integer.valueOf(i1), tb, i, "4");
             if (ot1 != patchProxyRe) {
             label_00cb :
                ot = ot1.to(new c("common")).map(new e()).doOnSubscribe(new a(this)).doOnNext(new c(this)).doOnError(new d(this));
             }
          }
          b.a(-1343064608).H("common");
          b = false;
          String str = b.a(-129117978).g(tb.D, c.a, b);
          int i2 = -500494672;
          c0 uoc0 = d.a(i2);
          List items = tb.getItems();
          long l = 1;
          boolean b1 = (tb.u == l)? true: false;
          uoc0.jb(items, b1);
          i = tb.N;
          if (i != null && i.length()) {
             l = 0;
          }
          if (l) {
             Object[] objArray = new Object[b];
             c.C().t("HomeUniversalTabPageList", "the path is empty !!! use default path!", objArray);
          }
          b uob = a.a();
          i = tb.N;
          if (i == null) {
             String str1 = "n/feed/hot";
          }
          HomeUniversalTabPageList homeUniversa = i;
          d u = tb.u;
          l = a.a();
          HomeFeedResponse mCursor = (!tb.K() && tb.L0() != null)? tb.L0().mCursor: "";
          ot1 = uob.b(homeUniversa, u, i1, l, mCursor, str, 11, tb.K, d.a(i2).Vz(104));
          a.o(ot1, "HomeUniversalTabApi.getS¡­ qPhotoType\n      \)\n    \)");
          goto label_00cb ;
       }
       return ot;
    }
}
