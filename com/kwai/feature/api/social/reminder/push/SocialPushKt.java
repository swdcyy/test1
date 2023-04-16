package com.kwai.feature.api.social.reminder.push.SocialPushKt;
import sx5.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.social.reminder.push.BarConfig;
import sx5.a;
import ekd.k1;
import com.kwai.feature.api.social.reminder.push.PopConfig;
import sx5.c;
import my5.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import crd.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import i6c.j;
import kotlin.jvm.internal.Ref$ObjectRef;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.kwai.feature.api.social.reminder.push.SocialPushKt$a;
import erd.o;
import com.kwai.feature.api.social.reminder.push.SocialPushKt$b;
import erd.r;
import com.kwai.feature.api.social.reminder.push.SocialPushKt$c;
import erd.g;
import crd.b;
import ftd.r1;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import com.kwai.feature.api.social.reminder.push.SocialPushKt$updatePushBarAsClosed$2;
import asd.c;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;

public final class SocialPushKt	// class@0011c6
{

    public static final boolean a(i p0){
       i obj = PatchProxy.applyOneRefs(p0, null, SocialPushKt.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "data");
       obj = p0.b;
       boolean b = false;
       if (obj.enableShowGuideBar != null) {
          BarConfig showBarMaxCl = obj.showBarMaxCloseCount;
          if (showBarMaxCl > null) {
             i d = p0.d;
             if (showBarMaxCl <= d.a) {
                return b;
             }else if((k1.t(d.b) / (long)1000) - p0.b.showBarAfterCloseIntervalSecond >= 0){
                b = true;
             }
          }
       }
       return b;
    }
    public static final boolean b(i p0){
       i obj = PatchProxy.applyOneRefs(p0, null, SocialPushKt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "data");
       obj = p0.a;
       boolean b = false;
       if (obj.enableShowPop != null) {
          PopConfig showPopMaxCo = obj.showPopMaxCount;
          if (showPopMaxCo > null) {
             if (showPopMaxCo <= p0.c.a) {
                return b;
             }else {
                long l = 0;
                long longx = a.a.getLong(b.d("user")+"push_notify_authority_last_show_time_ms", l);
                if (longx - l <= 0 || k1.t(longx) - 0xa4cb800 >= 0) {
                   c b1 = p0.c.b;
                   if (b1 - l > 0) {
                      long l1 = (long)4;
                      long l2 = (long)7;
                      int i = (!((((b1 - 0x5265c00) / 0x5265c00) + l1) / l2) - ((((k1.i() - 0x5265c00) / 0x5265c00) + l1) / l2))? 1: 0;
                      if (i) {
                      label_0080 :
                         return b;
                      }
                   }
                   b = true;
                   goto label_0080 ;
                }else {
                   goto label_0080 ;
                }
             }
          }
       }else {
          goto label_0080 ;
       }
    }
    public static final a c(BaseFragment p0,String p1,Boolean p2,String p3){
       a obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, SocialPushKt.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "host");
       a.p(p3, "source");
       obj = new a();
       if (TextUtils.x(p1)) {
          return obj;
       }
       j.a();
       Ref$ObjectRef objectRef = new Ref$ObjectRef();
       objectRef.element = null;
       SocialPushKt$c uoc = new SocialPushKt$c(objectRef, p2, obj, p3, p1);
       b uob = t.just(Boolean.TRUE).delay(500, TimeUnit.MILLISECONDS, d.c).observeOn(d.a).flatMap(new SocialPushKt$a(p0)).filter(SocialPushKt$b.b).subscribe(v8);
       objectRef.element = uob;
       obj.c(uob);
       return obj;
    }
    public static final void d(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, SocialPushKt.class, "3")) {
          return;
       }
       a.p(p0, "data");
       i d = p0.d;
       d.a = d.a + 1;
       d.b = k1.i();
       a.f(r1.b, z0.f(), null, new SocialPushKt$updatePushBarAsClosed$2(p0, null), 2, null);
       return;
    }
}
