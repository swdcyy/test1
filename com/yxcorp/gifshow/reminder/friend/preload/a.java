package com.yxcorp.gifshow.reminder.friend.preload.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wkd.b;
import zcc.k;
import com.kwai.social.startup.reminder.model.FriendTabStartupConfig;
import zcc.l;
import com.kwai.social.startup.reminder.model.FriendTabStartupConfig$PrefetchConfig;
import java.util.Collection;
import ekd.q;
import java.lang.Number;
import java.util.Calendar;
import java.util.Date;
import vdc.g;
import java.lang.Iterable;
import ok.o;
import com.google.common.base.Optional;
import qk.y;

public final class a	// class@001ac8
{

    public void a(){
       super();
    }
    public static boolean a(){
       boolean b;
       FriendTabStartupConfig obj = PatchProxy.apply(null, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = b.a(0x78443100).a();
       if (l.c()) {
          obj = obj.mPrefetchConfig;
          if (obj != null && obj.mEnableFriendEmptyUseCache != null) {
             b = true;
          label_0032 :
             return b;
          }
       }
       b = false;
       goto label_0032 ;
    }
    public static boolean b(){
       boolean b;
       int b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       FriendTabStartupConfig obj = PatchProxy.apply(null, null, uoa, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = b.a(0x78443100).a();
       b = false;
       if (l.c()) {
          obj = obj.mPrefetchConfig;
          if (obj != null && obj.mEnablePrefetch != null) {
             FriendTabStartupConfig$PrefetchConfig mPrefetchClo = obj.mPrefetchCloseTimeItems;
             Object obj1 = PatchProxy.applyOneRefs(mPrefetchClo, null, uoa, "3");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(q.f(mPrefetchClo)){
                b1 = false;
             }else {
                Object obj2 = PatchProxy.apply(null, null, uoa, "6");
                if (obj2 != patchProxyRe) {
                   b1 = obj2.intValue();
                }else {
                   Calendar instance = Calendar.getInstance();
                   instance.setTime(new Date());
                   b1 = instance.get(11);
                }
                b1 = y.y(mPrefetchClo, new g(b1)).isPresent();
             }
             if (!b1) {
                b = true;
             }
          }
       }
       return b;
    }
    public static boolean c(){
       boolean b;
       FriendTabStartupConfig obj = PatchProxy.apply(null, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = b.a(0x78443100).a();
       if (l.c()) {
          obj = obj.mPrefetchConfig;
          if (obj != null && obj.mEnableClientCache != null) {
             b = true;
          label_0032 :
             return b;
          }
       }
       b = false;
       goto label_0032 ;
    }
}
