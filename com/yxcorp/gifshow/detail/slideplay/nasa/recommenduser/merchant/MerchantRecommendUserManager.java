package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.MerchantRecommendUserManager;
import java.lang.Object;
import java.util.ArrayList;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.MerchantRecommendUserManager$currentShowUserChange$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.merchant.MerchantRecommendUserManager$replaceShowUser$1;
import usd.q;
import usd.k;
import java.util.Iterator;
import java.lang.Iterable;
import trd.l0;
import com.kwai.framework.model.user.User;
import io.reactivex.subjects.PublishSubject;
import com.kwai.robust.PatchProxyResult;

public final class MerchantRecommendUserManager	// class@00178b
{
    public final ArrayList a;
    public final ArrayList b;
    public MerchantRecommendUserFeed c;
    public final p d;
    public int e;

    public void MerchantRecommendUserManager(int p0){
       super();
       this.e = p0;
       this.a = new ArrayList();
       this.b = new ArrayList();
       this.d = s.c(MerchantRecommendUserManager$currentShowUserChange$2.INSTANCE);
    }
    public static void c(MerchantRecommendUserManager p0,int p1,boolean p2,int p3,Object p4){
       int i = -1;
       if (p3 & 0x01) {
          p1 = -1;
       }
       p4 = 1;
       if (p3 & 0x02) {
          p2 = true;
       }
       if (!PatchProxy.isSupport2(MerchantRecommendUserManager.class, "3") || !PatchProxy.applyVoidTwoRefsWithListener(Integer.valueOf(p1), Boolean.valueOf(p2), p0, MerchantRecommendUserManager.class, "3")) {
          MerchantRecommendUserManager$replaceShowUser$1 oreplaceShow = new MerchantRecommendUserManager$replaceShowUser$1(p0, p2);
          if (p1 == i) {
             p0.b.clear();
             p4 = q.n1(0, q.u(p0.e, p0.a.size())).iterator();
             while (p4.hasNext()) {
                p4.b();
                p0.b.add(p0.a.remove(0));
             }
             oreplaceShow.invoke(p1);
          }else {
             i = p0.b.size();
             if (p1 >= 0 && (i > p1 && p0.a.size() > 0)) {
                p0.b.get(p1).mIsReplaced = p4;
                p0.b.set(p1, p0.a.remove(0));
                oreplaceShow.invoke(p1);
             }
          }
          PatchProxy.onMethodExit(MerchantRecommendUserManager.class, "3");
       }
       return;
    }
    public final PublishSubject a(){
       Object obj = PatchProxy.applyWithListener(null, this, MerchantRecommendUserManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(MerchantRecommendUserManager.class, "1");
       return this.d.getValue();
    }
    public final ArrayList b(){
       return this.b;
    }
}
