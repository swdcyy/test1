package com.kuaishou.commercial.photoreduce.a;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenuInfo;
import mxb.c;
import java.util.ArrayList;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeReason;
import com.kuaishou.android.model.ads.PhotoAdvertisement$NegativeMenu;
import java.lang.Integer;
import com.kuaishou.commercial.photoreduce.a$a;

public class a	// class@00151e
{

    public void a(){
       super();
    }
    public static List a(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PhotoAdvertisement$NegativeMenuInfo negativeMenu = c.v(p0);
       if (negativeMenu == null) {
          return new ArrayList();
       }
       return a.c(negativeMenu.feedNegativeMenu, negativeMenu);
    }
    public static List b(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PhotoAdvertisement$NegativeMenuInfo negativeMenu = c.v(p0);
       if (negativeMenu == null) {
          return new ArrayList();
       }
       return a.c(negativeMenu.thanosDetailNegativeMenu, negativeMenu);
    }
    public static List c(List p0,PhotoAdvertisement$NegativeMenuInfo p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (!q.f(p0)) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             PhotoAdvertisement$NegativeReason negativeReas = iterator.next();
             PhotoAdvertisement$NegativeMenu negativeMenu = a.d(p1, negativeReas.menuId);
             if (negativeMenu != null) {
                PhotoAdvertisement$NegativeReason subMenuIds = negativeReas.subMenuIds;
                Object obj1 = PatchProxy.applyTwoRefs(p1, subMenuIds, null, a.class, "4");
                if (obj1 != PatchProxyResult.class) {
                }else if(q.f(subMenuIds)){
                   obj1 = null;
                }else {
                   obj1 = new ArrayList();
                   Iterator iterator1 = subMenuIds.iterator();
                   while (iterator1.hasNext()) {
                      PhotoAdvertisement$NegativeMenu negativeMenu1 = a.d(p1, iterator1.next().intValue());
                      if (negativeMenu1 != null) {
                         obj1.add(a$a.a(negativeMenu1, null, null, null));
                      }else {
                         continue ;
                      }
                   }
                }
                obj.add(a$a.a(negativeMenu, obj1, negativeReas.title, negativeReas.subTitle));
             }
          }
       }
       return obj;
    }
    public static PhotoAdvertisement$NegativeMenu d(PhotoAdvertisement$NegativeMenuInfo p0,int p1){
       PhotoAdvertisement$NegativeMenu obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!q.f(p0.negativeMenus)) {
          Iterator iterator = p0.negativeMenus.iterator();
          while (iterator.hasNext()) {
             obj = iterator.next();
             if (obj.id == p1) {
                return obj;
             }
          }
       }
       return null;
    }
}
