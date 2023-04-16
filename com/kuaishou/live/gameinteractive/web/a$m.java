package com.kuaishou.live.gameinteractive.web.a$m;
import ht5.d;
import com.kuaishou.live.gameinteractive.web.a;
import v43.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;

public class a$m implements d	// class@001c06
{
    public final c a;
    public final a b;

    public void a$m(a p0,c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean onError(Throwable p0){
       a$m obj = PatchProxy.applyOneRefs(p0, this, a$m.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a;
       if (obj != null) {
          obj.onError(0x1e850, p0.getMessage());
       }
       return false;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$m.class, "1")) {
       }else {
          p0 = this.a;
          if (p0 != null) {
             p0.onSuccess();
          }
       }
       return;
    }
}
