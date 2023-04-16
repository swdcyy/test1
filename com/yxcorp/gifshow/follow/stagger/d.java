package com.yxcorp.gifshow.follow.stagger.d;
import ea5.d$a;
import com.kwai.component.feedstaggercard.a;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import android.util.SparseArray;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.feedstaggercard.PhotoItemViewParam$a;
import wh5.c;
import xf6.l;
import lga.a;
import com.facebook.drawee.generic.RoundingParams;
import ga5.e;
import com.yxcorp.gifshow.follow.stagger.experiment.HomeFollowExperimentUtils;
import android.app.Activity;
import ea5.d$d;
import wia.b;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.android.model.feed.PhotoType;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import yga.b;
import java.lang.StringBuilder;
import yga.c;
import a1.a;
import android.content.Context;
import com.kwai.component.feedstaggercard.model.CardStyle;
import iia.s1;
import ea5.d;
import java.lang.Exception;
import k2b.u1;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Integer;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.follow.stagger.d$a;
import java.lang.Enum;
import eja.u0;
import eja.e1;

public class d extends a implements d$a	// class@001165
{
    public final SparseArray c;
    public boolean d;
    public static final int e;

    public void d(PhotoItemViewParam p0){
       super(p0);
       this.c = new SparseArray();
       this.d = true;
    }
    public static PhotoItemViewParam f(){
       Object[] objArray = null;
       PhotoItemViewParam$a obj = PatchProxy.apply(objArray, objArray, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PhotoItemViewParam$a();
       obj.l(16);
       obj.k(3);
       obj.b(true);
       obj.u(true);
       obj.t = c.b();
       boolean b = (l.e("ENABLE_FOLLOW_GIF", 0) != 2)? true: false;
       obj.h(b);
       obj.v(true);
       obj.g = true;
       obj.q(true);
       obj.i(true);
       obj.z = false;
       obj.g((a.a() ^ true));
       obj.e(true);
       obj.c(true);
       obj.d(0);
       obj.r(R.drawable.arg_RES_7f080a06);
       obj.m(objArray);
       obj.p(0);
       obj.D = true;
       obj.u = true;
       obj.n(e.c());
       obj.M = true;
       obj.E = HomeFollowExperimentUtils.d();
       return obj.a();
    }
    public void a(Activity p0,d$d p1){
       String str = "3";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, str)) {
          return;
       }
       ArrayList uArrayList = PatchProxy.apply(null, null, b.class, str);
       if (uArrayList != PatchProxyResult.class) {
       }else {
          List a = b.a;
          if (q.f(a)) {
             b.a(4, 0);
          }
          ArrayList uArrayList1 = new ArrayList();
          uArrayList1.addAll(a);
          a.clear();
          uArrayList = uArrayList1;
       }
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          List list = KsLogFollowTag.FOLLOW_STAGGER.appendTag("AsyncFeedViewCache");
          String str1 = "create presenter type: "+obj+", card style: "+obj;
          try{
             c.a(list, str1);
             a uoa = new a(p0);
             CardStyle uCardStyle = PatchProxy.apply(null, this, d.class, "4");
             if (uCardStyle != PatchProxyResult.class) {
             }else {
                uCardStyle = HomeFollowExperimentUtils.f();
             }
             d.c(p0, uoa, obj, uCardStyle, this.a, new s1(this, p1));
          }catch(java.lang.Exception e3){
             u1.Q("holder_async_init", e3.getMessage());
             goto label_0038 ;
          }
       }
       return;
    }
    public f b(ViewGroup p0,int p1,CardStyle p2){
       if (PatchProxy.isSupport(d.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, d.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.d = false;
       List list = this.c.get(p1);
       if (!q.f(list)) {
          return list.remove(false);
       }else {
          return super.b(p0, p1, p2);
       }
    }
    public f c(ViewGroup p0,PhotoType p1,CardStyle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       f uof = super.c(p0, p1, p2);
       this.g(p1, uof.b);
       return uof;
    }
    public final void g(PhotoType p0,PresenterV2 p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, d.class, "8")) {
          return;
       }
       int i = d$a.a[p0.ordinal()];
       if (i != 1 && i != 2) {
          if (i == 3) {
             p1.U7(new u0());
          }
       }else {
          p1.U7(new u0());
          p1.U7(new e1(this.a.mPage));
       }
       PatchProxy.onMethodExit(d.class, "8");
       return;
    }
}
