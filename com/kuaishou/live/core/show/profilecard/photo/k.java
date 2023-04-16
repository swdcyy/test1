package com.kuaishou.live.core.show.profilecard.photo.k;
import com.kuaishou.live.core.show.profilecard.photo.h$b;
import com.kuaishou.live.core.show.profilecard.photo.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import wj2.o0;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Integer;
import wj2.r;
import java.util.Objects;
import ne2.k;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.HashMap;
import yp.x;
import com.google.gson.Gson;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class k implements h$b	// class@000def
{
    public final j a;

    public void k(j p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       j obj = PatchProxy.apply(null, this, k.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.B;
       if (obj == null) {
          return false;
       }
       return obj.a();
    }
    public boolean b(BaseFeed p0,int p1){
       j obj;
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ok, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.a.v;
       r s = obj.s;
       String str = (obj.e())? "LIVE_PLAY_PHOTO": "PLAY_PHOTO";
       Objects.requireNonNull(s);
       if (!PatchProxy.applyVoidTwoRefs(str, p0, s, k.class, "10")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = str;
          HashMap hashMap = new HashMap();
          hashMap.put("lv_params", x.g(p0));
          uElementPack.params = new Gson().q(hashMap);
          u1.G("", 1, uElementPack, s.b(p0));
       }
       obj = this.a.B;
       if (obj == null) {
          return false;
       }else {
          return obj.b(p0);
       }
    }
}
