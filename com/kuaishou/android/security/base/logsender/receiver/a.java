package com.kuaishou.android.security.base.logsender.receiver.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.security.base.log.d;
import com.kuaishou.android.security.base.cloudconfig.c;
import com.kuaishou.android.security.base.util.n;
import com.kuaishou.android.security.base.logsender.a;
import java.lang.System;
import android.content.Intent;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.kuaishou.android.security.base.logsender.receiver.a$a;
import java.lang.Runnable;
import java.util.concurrent.Future;
import com.kuaishou.android.security.base.thread.a;
import java.lang.Throwable;

public class a extends BroadcastReceiver	// class@000ee9
{

    public void a(){
       super();
    }
    public void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       d.b("handlePushRpWork");
       c uoc = new c(p0);
       n.a(p0, "com.kw.r.p", 101, ((long)uoc.l() * 0x36ee80));
       a.a(p0).a(6);
       uoc.b(System.currentTimeMillis());
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
       d.b("action "+action);
       p0 = p0.getApplicationContext();
       if (action.equals("com.kw.pp.action") && !n.f(p0)) {
          d.b("net disable");
          return;
       }else {
          a.b(new a$a(this, action, p0));
          return;
       }
    }
}
