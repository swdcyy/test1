package com.yxcorp.gifshow.relation.inapp.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.util.HashMap;
import zk.d;
import com.google.gson.Gson;
import k2b.u1;

public class b	// class@0018d8
{

    public void b(){
       super();
    }
    public static void a(boolean p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), null, uob, "5")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "GENERAL_PUSH_POPUP";
       String str = (p0)? "1": "2";
       HashMap hashMap = new HashMap();
       hashMap.put("click_area", str);
       hashMap.put("type", "follower");
       HashMap hashMap1 = new HashMap();
       hashMap1.put("cnt", Integer.valueOf(p1));
       hashMap.put("extra_info", hashMap1);
       d uod = new d();
       uod.i();
       uod.k("yyyy-MM-dd HH:mm:ss");
       uElementPack.params = uod.b().q(hashMap);
       u1.u(1, uElementPack, uContentPack);
       return;
    }
}
