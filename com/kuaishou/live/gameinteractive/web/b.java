package com.kuaishou.live.gameinteractive.web.b;
import erd.g;
import com.kuaishou.live.gameinteractive.web.a$c;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v43.c;
import pp.a;
import q87.c;

public class b implements g	// class@001c0d
{
    public final a$c b;

    public void b(a$c p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          b = false;
          if (p0 != null && !p0.isFollowingOrFollowRequesting()) {
             this.b.c.onSuccess();
             this.b.a(b);
          }else {
             Object[] objArray = new Object[b];
             a.C().t("GameInteractiveCommonBridgeImpl", "call unfollow interface failed!", objArray);
             this.b.c.onError(-1, "");
          }
       }
       return;
    }
}
