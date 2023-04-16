package com.kwai.sharelib.apiservice.a;
import ca7.c;
import android.content.SharedPreferences;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sharelib.apiservice.KsDefaultMgr;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kwai.sharelib.model.BatchShareIdResponse;
import java.util.HashSet;
import com.kwai.sharelib.apiservice.KsDefaultMgr$Companion;
import java.util.Collection;
import android.content.SharedPreferences$Editor;
import java.util.Set;
import oe6.g;

public final class a implements c	// class@0016ba
{
    public final SharedPreferences a;

    public void a(SharedPreferences p0){
       this.a = p0;
       super();
    }
    public void onFailure(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       KsDefaultMgr.b.set(false);
       return;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else if(p0 != null){
          KsDefaultMgr$Companion c = KsDefaultMgr.c;
          HashSet hashSet = c.b();
          _monitor_enter(hashSet);
          c.b().addAll(p0.mShareIds);
          _monitor_exit(hashSet);
          KsDefaultMgr.b.set(false);
          g.a(this.a.edit().putStringSet("KS_DSI#1419", c.b()));
       }
       return;
    }
}
