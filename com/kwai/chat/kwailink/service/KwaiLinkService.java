package com.kwai.chat.kwailink.service.KwaiLinkService;
import android.app.Service;
import com.kwai.chat.kwailink.service.d;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class KwaiLinkService extends Service	// class@000a69
{
    public final d b;

    public void KwaiLinkService(){
       super();
       this.b = new d(this);
    }
    public IBinder onBind(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiLinkService.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b.a(p0);
       return null;
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, KwaiLinkService.class, "1")) {
          return;
       }
       super.onCreate();
       this.b.b();
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, KwaiLinkService.class, "5")) {
          return;
       }
       this.b.c();
       super.onDestroy();
       return;
    }
    public void onRebind(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiLinkService.class, "2")) {
          return;
       }
       this.b.d(p0);
       return;
    }
    public boolean onUnbind(Intent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiLinkService.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.e(p0);
       return true;
    }
}
