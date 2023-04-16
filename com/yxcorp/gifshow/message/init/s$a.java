package com.yxcorp.gifshow.message.init.s$a;
import i85.f;
import com.yxcorp.gifshow.message.init.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import o56.c;
import o56.a;
import xf6.l;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.chat.sdk.signal.f;
import com.kwai.chat.kwailink.client.c0;
import java.util.concurrent.ScheduledExecutorService;
import com.kwai.chat.kwailink.base.b;
import com.kwai.chat.kwailink.client.m;
import java.lang.Runnable;

public class s$a extends f	// class@001d6a
{
    public final s a;

    public void s$a(s p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       s$a uoa = s$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       s$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, s.class, "15") && a.a().c()) {
          String str = l.g("laneId", "");
          if (!TextUtils.isEmpty(str)) {
             c0 uoc0 = f.e().g();
             Objects.requireNonNull(uoc0);
             if (!PatchProxy.applyVoidOneRefs(str, uoc0, c0.class, "61")) {
                b.c().execute(new m(str));
             }
          }
       }
       return;
    }
}
