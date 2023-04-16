package com.kwai.chat.kwailink.service.d;
import android.content.Context;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.ScheduledExecutorService;
import com.kwai.chat.kwailink.base.b;
import com.kwai.chat.kwailink.service.b;
import java.lang.Runnable;
import com.kwai.chat.kwailink.service.c;
import com.kwai.chat.kwailink.log.a;
import c85.a;

public class d	// class@000a6e
{
    public final Context a;

    public void d(Context p0){
       super();
       this.a = p0;
    }
    public void a(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       b.c().execute(b.b);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       if (!b.g()) {
          return;
       }
       if (b.b() == null) {
          b.m(this.a.getApplicationContext());
       }
       b.c().execute(c.b);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       a.g("KwaiLinkServiceInternal", "KwaiLinkService onDestroy");
       return;
    }
    public void d(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       b.c().execute(new a(this, p0));
       return;
    }
    public void e(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       a.g("KwaiLinkServiceInternal", "KwaiLinkService onUnbind");
       return;
    }
}
