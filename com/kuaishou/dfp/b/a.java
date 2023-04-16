package com.kuaishou.dfp.b.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import l30.y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import l30.l;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.SharedPreferences;
import l30.k;
import n30.a;
import java.util.Objects;
import java.lang.Integer;
import android.os.Message;
import p30.a;
import java.lang.System;
import java.lang.Long;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Boolean;
import android.content.Intent;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import r30.d;
import k30.a;
import r30.a;

public class a extends BroadcastReceiver	// class@0016e2
{
    public boolean a;
    public boolean b;
    public boolean c;
    public long d;

    public void a(){
       super();
       this.a = false;
       this.b = false;
       this.c = false;
       this.d = 0;
    }
    public void a(Context p0){
       long l;
       y oy = y.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       l.a("handlePushRpWork");
       y oy1 = new y(p0);
       Object obj = PatchProxy.apply(null, oy1, oy, "47");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): oy1.a.getInt("re_net_hr", 3);
       k.h(p0, "com.kw.r.p", 1010, (long)(i * 0x36ee80));
       a uoa = a.a(p0);
       i = 6;
       Objects.requireNonNull(uoa);
       a uoa1 = a.class;
       if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), uoa, uoa1, "4")) {
          Message message = new Message();
          message.what = 2;
          message.arg1 = i;
          uoa.a.d(message);
       }
       l = System.currentTimeMillis();
       if (!PatchProxy.isSupport(oy) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), oy1, oy, "73")) {
          oy1.b.putLong("re_last_ofline_time", l);
          g.b(oy1.b);
       }
       return;
    }
    public void b(boolean p0){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, a.class, "2")) {
          return;
       }
       this.d = System.currentTimeMillis();
       this.a = true;
       this.b = p0;
       return;
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       if (p1 == null) {
          return;
       }
       String action = p1.getAction();
       if (TextUtils.isEmpty(action)) {
          return;
       }
       if (this.a != null && (System.currentTimeMillis() - this.d) - 1000 < 0) {
          l.c("netOnly < 1000 "+action);
          return;
       }else {
          l.c("action :"+action);
          d.a().b(new a(this, action, p0.getApplicationContext()));
          return;
       }
    }
}
