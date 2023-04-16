package com.yxcorp.gifshow.commontab.a;
import ea5.d$a;
import com.kwai.component.feedstaggercard.a;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.component.feedstaggercard.PhotoItemViewParam$a;
import com.facebook.drawee.generic.RoundingParams;
import uh5.e;
import ga5.e;
import android.app.Activity;
import ea5.d$d;
import java.util.List;
import java.util.ArrayList;
import com.kuaishou.android.model.feed.PhotoType;
import com.yxcorp.utility.SystemUtil;
import java.util.Iterator;
import in9.c;
import java.lang.StringBuilder;
import q87.c;
import a1.a;
import android.content.Context;
import com.kwai.component.feedstaggercard.model.CardStyle;
import zm9.b;
import ea5.d;
import android.view.ViewGroup;
import y8c.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fn9.a;

public class a extends a implements d$a	// class@0011b2
{
    public static final int c;

    public void a(PhotoItemViewParam p0){
       super(p0);
    }
    public static PhotoItemViewParam f(){
       Object[] objArray = null;
       PhotoItemViewParam$a obj = PatchProxy.apply(objArray, objArray, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PhotoItemViewParam$a();
       obj.l(8);
       obj.k(2);
       obj.b(true);
       obj.h(true);
       obj.v(true);
       obj.g(true);
       obj.i(false);
       obj.c(false);
       obj.e(false);
       obj.d(true);
       obj.r(R.drawable.arg_RES_7f080a06);
       obj.m(objArray);
       obj.p((e.b() ^ true));
       obj.q(true);
       obj.n(e.c());
       obj.f(true);
       obj.j(true);
       obj.t(true);
       return obj.a();
    }
    public void a(Activity p0,d$d p1){
       a uoa = a.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoa, "3")) {
          return;
       }
       ArrayList uArrayList = PatchProxy.apply(null, this, uoa, "5");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList();
          PhotoType vIDEO = PhotoType.VIDEO;
          uArrayList.add(vIDEO);
          uArrayList.add(vIDEO);
          uArrayList.add(vIDEO);
          if (SystemUtil.a(26)) {
             uArrayList.add(vIDEO);
          }
       }
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          c uoc = c.C();
          String str = "create presenter type: "+obj+", card style: "+obj;
          Object[] objArray = new Object[0];
          String str1 = "HomeCommonTabItemViewFactory";
          try{
             uoc.w(str1, str, objArray);
             d.c(p0, new a(p0), obj, e.a("h"), this.a, new b(p1));
          }catch(java.lang.Exception e0){
             goto label_0038 ;
          }
       }
       return;
    }
    public f c(ViewGroup p0,PhotoType p1,CardStyle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       f uof = super.c(p0, p1, p2);
       uof.b.U7(new a());
       return uof;
    }
}
