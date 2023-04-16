package com.yxcorp.utility.alarm.KwaiAlarm;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.app.Activity;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import fkd.a;
import android.content.Intent;
import java.lang.CharSequence;
import android.text.TextUtils;
import e17.i;
import com.yxcorp.utility.alarm.KwaiAlarm$Builder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.framework.activitycontext.ActivityContext;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import q2b.h$b;
import k2b.u1;

public final class KwaiAlarm	// class@0009b5
{
    public static final Integer[] a;
    public static final KwaiAlarm b;

    static {
       KwaiAlarm.b = new KwaiAlarm();
       Integer[] integerArray = new Integer[]{Integer.valueOf(2),Integer.valueOf(3),Integer.valueOf(4),Integer.valueOf(5),Integer.valueOf(6),Integer.valueOf(7),Integer.valueOf(1)};
       KwaiAlarm.a = integerArray;
    }
    public void KwaiAlarm(){
       super();
    }
    public static final void a(String p0,String p1,Activity p2){
       a.p(p0, "msg");
       a.p(p1, "toast");
       String str = (!d.a(0x16474d59).Qy())? "android.intent.action.SHOW_ALARMS": "android.intent.action.DISMISS_ALARM";
       Intent intent = new Intent(str);
       if (!TextUtils.isEmpty(p0)) {
          intent.putExtra("android.intent.extra.alarm.MESSAGE", p0);
          intent.putExtra("android.intent.extra.alarm.SEARCH_MODE", "android.label");
          intent.putExtra("android.intent.extra.alarm.SKIP_UI", false);
       }
       if (p2 != null) {
          p2.startActivity(intent);
       }
       if (!TextUtils.isEmpty(p1)) {
          i.e(R.style.arg_RES_7f11066a, p1, false);
       }
       return;
    }
    public static final boolean d(KwaiAlarm$Builder p0,Activity p1){
       KwaiAlarm$Builder a;
       KwaiAlarm$Builder uBuilder1;
       a.p(p0, "builder");
       a = p0.a;
       KwaiAlarm b = KwaiAlarm.b;
       b.c(a, "ALARM_API_REQ");
       KwaiAlarm$Builder uBuilder = null;
       if (p1 != null) {
          int i = 0;
          if (!TextUtils.isEmpty(p0.a) && !TextUtils.isEmpty(p0.b)) {
             long l = (long)p0.c;
             uBuilder1 = (i - l <= 0 && 23 - l >= 0)? 1: null;
             if (uBuilder1) {
                l = (long)p0.d;
                uBuilder1 = (i - l <= 0 && 59 - l >= 0)? 1: 0;
                if (uBuilder1) {
                   uBuilder1 = 1;
                label_004d :
                   if (uBuilder1) {
                      KwaiAlarm$Builder e = p0.e;
                      KwaiAlarm$Builder f = p0.f;
                      KwaiAlarm$Builder g = p0.g;
                      ArrayList uArrayList = new ArrayList(p0.h);
                      Objects.requireNonNull(b);
                      Intent intent = new Intent("android.intent.action.SET_ALARM");
                      intent.putExtra("android.intent.extra.alarm.MESSAGE", p0.b);
                      intent.putExtra("android.intent.extra.alarm.HOUR", p0.c);
                      intent.putExtra("android.intent.extra.alarm.MINUTES", p0.d);
                      long l1 = (long)e;
                      if (i - l1 <= 0 && 60 - l1 >= 0) {
                         intent.putExtra("android.intent.extra.alarm.LENGTH", e);
                      }
                      intent.putExtra("android.intent.extra.alarm.RINGTONE", f);
                      intent.putExtra("android.intent.extra.alarm.VIBRATE", g);
                      intent.putExtra("android.intent.extra.alarm.SKIP_UI", true);
                      if (uArrayList.isEmpty() ^ true) {
                         SerializableHook.putExtra(intent, "android.intent.extra.alarm.DAYS", uArrayList);
                      }
                      p1.startActivity(intent);
                      b.c(a, "ALARM_REQ_SUC");
                      return true;
                   }
                }
             }
          }
       label_004c :
          uBuilder1 = null;
          goto label_004d ;
       }
       return uBuilder;
    }
    public static boolean e(KwaiAlarm$Builder p0,Activity p1,int p2,Object p3){
       ActivityContext uActivityCon;
       if (p2 & 0x02) {
          uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          uActivityCon = uActivityCon.e();
       }else {
          p1 = null;
       }
       return KwaiAlarm.d(p0, uActivityCon);
    }
    public final Integer[] b(){
       return KwaiAlarm.a;
    }
    public final void c(String p0,String p1){
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       oi3.d("scene_id", p0);
       uElementPack.params = oi3.e();
       h$b uob = h$b.e(7, p1);
       uob.k(uElementPack);
       u1.r0(uob);
    }
}
