package com.yxcorp.gifshow.detail.common.information.subscribeauthor.SubscribeAuthorGuideManager;
import com.yxcorp.gifshow.detail.model.SubscribeAuthorConfig;
import com.yxcorp.gifshow.detail.common.information.subscribeauthor.SubscribeAuthorGuideManager$SHOW_GUIDE_FEED_COUNT$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.reflect.Type;
import uw9.c;
import com.yxcorp.gifshow.detail.model.SnackBarConfig;
import java.util.LinkedHashMap;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.util.DateUtils;
import uw9.o;
import q87.c;
import java.lang.Long;
import java.lang.Integer;
import java.util.Calendar;
import java.lang.System;

public final class SubscribeAuthorGuideManager	// class@001455
{
    public static final p a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final Map e;
    public static final Map f;
    public static final SubscribeAuthorGuideManager g;

    static {
       int i1;
       SubscribeAuthorConfig subscribeAut = SubscribeAuthorConfig.class;
       SubscribeAuthorGuideManager.g = new SubscribeAuthorGuideManager();
       SubscribeAuthorGuideManager.a = s.c(SubscribeAuthorGuideManager$SHOW_GUIDE_FEED_COUNT$2.INSTANCE);
       SubscribeAuthorConfig subscribeAut1 = c.t(subscribeAut);
       if (subscribeAut1 != null) {
          SnackBarConfig snackBarConf = subscribeAut1.b();
          if (snackBarConf != null) {
             snackBarConf = snackBarConf.mDayLimit;
          label_0021 :
             SubscribeAuthorGuideManager.b = snackBarConf;
             subscribeAut1 = c.t(subscribeAut);
             if (subscribeAut1 != null) {
                snackBarConf = subscribeAut1.b();
                if (snackBarConf != null) {
                   snackBarConf = snackBarConf.mWeekLimit;
                label_0033 :
                   SubscribeAuthorGuideManager.c = snackBarConf;
                   subscribeAut = c.t(subscribeAut);
                   if (subscribeAut != null) {
                      SnackBarConfig snackBarConf1 = subscribeAut.b();
                      if (snackBarConf1 != null) {
                         snackBarConf1 = snackBarConf1.mMonthLimit;
                      label_0046 :
                         SubscribeAuthorGuideManager.d = snackBarConf1;
                         SubscribeAuthorGuideManager.e = new LinkedHashMap();
                         SubscribeAuthorGuideManager.f = new LinkedHashMap();
                      }
                   }
                   int i = 10;
                   goto label_0046 ;
                }
             }
             i1 = 5;
             goto label_0033 ;
          }
       }
       i1 = 2;
       goto label_0021 ;
    }
    public void SubscribeAuthorGuideManager(){
       super();
    }
    public static final boolean a(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SubscribeAuthorGuideManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "photo");
       if (p0.getUser().mHasSubscribedChanged == null) {
          return p0.isAuthorSubscribed();
       }
       User user = p0.getUser();
       a.o(user, "photo.user");
       return user.getHasSubscried();
    }
    public static final boolean b(){
       Object[] objArray;
       Object obj = PatchProxy.apply(null, null, SubscribeAuthorGuideManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = c.u();
       int i1 = c.w();
       int i2 = c.v();
       long longx = c.a.getLong("subscribeAuthorGuideShowTime", 0);
       boolean b = DateUtils.J(longx);
       SubscribeAuthorGuideManager g = SubscribeAuthorGuideManager.g;
       boolean b1 = g.c(longx, 3);
       boolean b2 = g.c(longx, 2);
       if (b && i2 >= SubscribeAuthorGuideManager.b) {
          objArray = new Object[0];
          o.C().w("SubscribeAuthorElement", "命中 每天的频控限制2", objArray);
          return true;
       }else if(!b){
          c.M(0);
       }
       if (b1 && i1 >= SubscribeAuthorGuideManager.c) {
          objArray = new Object[0];
          o.C().w("SubscribeAuthorElement", "命中 每周的频控限制5", objArray);
          return true;
       }else if(!b1){
          c.N(0);
       }
       if (b2 && i >= SubscribeAuthorGuideManager.d) {
          objArray = new Object[0];
          o.C().w("SubscribeAuthorElement", "命中 每月的频控限制10", objArray);
          return true;
       }else if(!b2){
          c.L(0);
       }
       return 0;
    }
    public static final void d(QPhoto p0,boolean p1){
       SubscribeAuthorGuideManager subscribeAut = SubscribeAuthorGuideManager.class;
       if (PatchProxy.isSupport(subscribeAut) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, subscribeAut, "7")) {
          return;
       }
       a.p(p0, "photo");
       p0.setAuthorSubscribed(p1);
       p0.getUser().setSubscribed(p1);
       return;
    }
    public final boolean c(long p0,int p1){
       Calendar obj;
       SubscribeAuthorGuideManager subscribeAut = SubscribeAuthorGuideManager.class;
       if (PatchProxy.isSupport(subscribeAut)) {
          obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Integer.valueOf(p1), this, subscribeAut, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = Calendar.getInstance();
       a.o(obj, "calendar");
       obj.setTimeInMillis(System.currentTimeMillis());
       obj.setTimeInMillis(p0);
       boolean b = (obj.get(p1) == obj.get(p1))? true: false;
       return b;
    }
}
