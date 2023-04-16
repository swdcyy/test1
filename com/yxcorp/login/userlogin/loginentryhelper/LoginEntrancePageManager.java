package com.yxcorp.login.userlogin.loginentryhelper.LoginEntrancePageManager;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import z1d.d;
import asd.c;
import com.yxcorp.login.userlogin.loginentryhelper.LoginEntrancePageManager$launchPage$1;
import csd.b;
import java.util.Iterator;
import a2d.a;
import java.util.LinkedList;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import com.kwai.feature.api.social.login.model.LoginParams;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import b3d.f0;
import java.lang.Boolean;
import org.json.JSONObject;
import tb7.j;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.PrepareInterceptor;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.dialog.DialogHistoryInterceptor;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.dialog.DialogPrePhoneNumInterceptor;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.dialog.DialogFetchPhoneNumInterceptor;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.dialog.DialogKwaiAppInterceptor;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.FullScreenInterceptor;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.DefaultPageInterceptor;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.InterruptLoginInterceptor;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.VirtualUserLoginInterceptor;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.AlreadyLoginInterceptor;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.CancelAccountInterceptor;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.HistoryInterceptor;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.PrePhoneNumInterceptor;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.FetchPhoneNumInterceptor;
import com.yxcorp.login.userlogin.loginentryhelper.interceptor.activity.KwaiAppInterceptor;
import c97.d;
import q97.c;
import java.lang.StringBuilder;
import qrd.l1;

public final class LoginEntrancePageManager	// class@001b5a
{
    public static boolean a;
    public static AtomicBoolean b;
    public static final List c;
    public static final List d;
    public static final LoginEntrancePageManager e;

    static {
       Integer integer;
       Integer integer1;
       Integer integer2;
       Integer integer3;
       LoginEntrancePageManager.e = new LoginEntrancePageManager();
       LoginEntrancePageManager.b = new AtomicBoolean(false);
       Integer[] integerArray = new Integer[]{integer,Integer.valueOf(185),integer1,integer2,Integer.valueOf(120),Integer.valueOf(119),integer3,Integer.valueOf(206)};
       integer = Integer.valueOf(125);
       integer1 = Integer.valueOf(18);
       integer2 = Integer.valueOf(19);
       integer3 = Integer.valueOf(14);
       LoginEntrancePageManager.c = new ArrayList(CollectionsKt__CollectionsKt.L(integerArray));
       Integer[] integerArray1 = new Integer[]{Integer.valueOf(67),integer3,Integer.valueOf(26),integer,integer1,integer2};
       LoginEntrancePageManager.d = CollectionsKt__CollectionsKt.L(integerArray1);
    }
    public void LoginEntrancePageManager(){
       super();
    }
    public final Object a(d p0,c p1){
       LoginEntrancePageManager$launchPage$1 olaunchPage$;
       LoginEntrancePageManager$launchPage$1 l$4;
       LoginEntrancePageManager$launchPage$1 l$2;
       LoginEntrancePageManager$launchPage$1 l$0;
       Object obj2;
       boolean b;
       LinkedList linkedList;
       if (p1 instanceof LoginEntrancePageManager$launchPage$1) {
          olaunchPage$ = p1;
          LoginEntrancePageManager$launchPage$1 label = olaunchPage$.label;
          int i = Integer.MIN_VALUE;
          int i1 = label & i;
          if (i1) {
             int i2 = label - i;
             olaunchPage$.label = i2;
          label_0018 :
             LoginEntrancePageManager$launchPage$1 result = olaunchPage$.result;
             Object obj = b.h();
             LoginEntrancePageManager$launchPage$1 label1 = olaunchPage$.label;
             if (label1 != null) {
                if (label1 == 1) {
                   l$4 = olaunchPage$.L$4;
                   label1 = olaunchPage$.L$3;
                   l$2 = olaunchPage$.L$2;
                   l$0 = olaunchPage$.L$0;
                   j0.n(result);
                   result = olaunchPage$.L$1;
                label_0199 :
                   if (result.b != null) {
                      l$4 = d.a();
                      a.o(l$4, "Azeroth.get\(\)");
                      l$4.f().d("LoginInterceptor", "find login page: "+label1.getClass().getSimpleName());
                      return l1.a;
                   }
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                LoginParams loginParams = p0.e();
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                LoginEntrancePageManager loginEntranc = LoginEntrancePageManager.class;
                QCurrentUser obj1 = PatchProxy.applyOneRefs(loginParams, this, loginEntranc, "4");
                if (obj1 != patchProxyRe) {
                }else {
                   obj1 = QCurrentUser.me();
                   a.o(obj1, "QCurrentUser.me\(\)");
                   Object[] objArray = null;
                   if (!obj1.isLogined()) {
                      if (!LoginEntrancePageManager.c.contains(Integer.valueOf(loginParams.mLoginSource))) {
                         if (f0.a.a()) {
                            if (!LoginEntrancePageManager.d.contains(Integer.valueOf(loginParams.mLoginSource))) {
                               obj2 = PatchProxy.applyOneRefs(loginParams, this, loginEntranc, "8");
                               if (obj2 != patchProxyRe) {
                                  b = obj2.booleanValue();
                               }else if(loginParams.mLoginSource == 51){
                                  b = j.a("collection", new JSONObject(loginParams.mExtraInfoParams).getString("loginSource"));
                               }else {
                                  b = false;
                               }
                               if (!b) {
                               label_0108 :
                                  linkedList = PatchProxy.apply(objArray, this, loginEntranc, "6");
                                  if (linkedList != patchProxyRe) {
                                  }else {
                                     linkedList = new LinkedList();
                                     linkedList.add(new InterruptLoginInterceptor());
                                     linkedList.add(new PrepareInterceptor());
                                     linkedList.add(new VirtualUserLoginInterceptor());
                                     linkedList.add(new AlreadyLoginInterceptor());
                                     linkedList.add(new CancelAccountInterceptor());
                                     linkedList.add(new HistoryInterceptor());
                                     linkedList.add(new PrePhoneNumInterceptor());
                                     linkedList.add(new FetchPhoneNumInterceptor());
                                     linkedList.add(new KwaiAppInterceptor());
                                     linkedList.add(new FullScreenInterceptor());
                                     linkedList.add(new DefaultPageInterceptor());
                                  }
                               }
                            }
                         }else {
                            goto label_0108 ;
                         }
                      }
                      linkedList = PatchProxy.apply(objArray, this, loginEntranc, "5");
                      if (linkedList != patchProxyRe) {
                      }else {
                         linkedList = new LinkedList();
                         linkedList.add(new PrepareInterceptor());
                         linkedList.add(new DialogHistoryInterceptor());
                         linkedList.add(new DialogPrePhoneNumInterceptor());
                         linkedList.add(new DialogFetchPhoneNumInterceptor());
                         linkedList.add(new DialogKwaiAppInterceptor());
                         linkedList.add(new FullScreenInterceptor());
                         linkedList.add(new DefaultPageInterceptor());
                      }
                   }else {
                      goto label_0108 ;
                   }
                   obj2 = linkedList;
                }
                l$0 = this;
                l$2 = obj1;
                result = p0;
                l$4 = obj1.iterator();
             }
             if (l$4.hasNext()) {
                a uoa = l$4.next();
                olaunchPage$.L$0 = l$0;
                olaunchPage$.L$1 = result;
                olaunchPage$.L$2 = l$2;
                olaunchPage$.L$3 = uoa;
                olaunchPage$.L$4 = l$4;
                olaunchPage$.label = 1;
                if (uoa.a(result, olaunchPage$) == obj) {
                   return obj;
                }else {
                   goto label_0199 ;
                }
             }else {
                return l1.a;
             }
          }
       }
       olaunchPage$ = new LoginEntrancePageManager$launchPage$1(this, p1);
       goto label_0018 ;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, LoginEntrancePageManager.class, "3")) {
          return;
       }
       LoginEntrancePageManager.b.set(false);
       return;
    }
}
