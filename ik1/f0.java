package ik1.f0;
import p91.m;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Number;
import java.util.Set;
import java.util.Iterator;
import ik1.f0$a;
import com.google.gson.JsonElement;
import java.lang.Long;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ik1.a0;
import q2b.h$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import k2b.u1;

public class f0	// class@002926
{
    public long a;
    public m b;
    public Map c;

    public void f0(m p0){
       super();
       this.a = -600000;
       this.c = new ConcurrentHashMap();
       this.b = p0;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f0.class, "3")) {
          return;
       }
       this.b();
       this.c.clear();
       return;
    }
    public final void b(){
       Object[] objArray1;
       String str2;
       ClientContent$GiftPackage giftPackage;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, f0.class, "1")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       jsonObject.H("is_local_render", Boolean.TRUE);
       int i = 2;
       jsonObject.a0("version", Integer.valueOf(i));
       Iterator iterator = obj.c.keySet().iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          f0$a uoa = obj.c.get(str);
          if (uoa != null) {
             boolean i1 = uoa.a + uoa.b;
             int i2 = 1;
             f0$a uoa1 = (i1 > 0)? 1: null;
             if (uoa1) {
                JsonObject jsonObject1 = PatchProxy.apply(objArray, uoa, f0$a.class, "1");
                if (jsonObject1 != PatchProxyResult.class) {
                }else {
                   jsonObject1 = new JsonObject();
                   jsonObject1.a0("success_count", Integer.valueOf(uoa.a));
                   jsonObject1.a0("fail_count", Integer.valueOf(uoa.b));
                }
                jsonObject.G("result", jsonObject1);
                long l = Long.valueOf(str).longValue();
                ClientContent$LiveStreamPackage liveStreamPa = obj.b.a();
                i1 = obj.b.e();
                String str1 = jsonObject.toString();
                a0 uoa0 = a0.class;
                if (PatchProxy.isSupport(uoa0)) {
                   objArray = new Object[5];
                   objArray[0] = Long.valueOf(l);
                   objArray[i2] = Boolean.FALSE;
                   objArray[i] = liveStreamPa;
                   objArray[3] = Boolean.valueOf(i1);
                   objArray[4] = str1;
                   objArray1 = null;
                   if (PatchProxy.applyVoid(objArray, objArray1, uoa0, "20")) {
                   label_010c :
                      uoa.a = 0;
                      uoa.b = 0;
                   label_0112 :
                      objArray = objArray1;
                      i = 2;
                   }
                }else {
                   objArray1 = objArray;
                }
                h$b uob = h$b.e(10, "MAGIC_GIFT_EFFECT_SHOW");
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                if (PatchProxy.isSupport(uoa0)) {
                   str2 = str1;
                   giftPackage = PatchProxy.applyThreeRefs(Long.valueOf(l), Boolean.FALSE, str2, null, a0.class, "25");
                   if (giftPackage != PatchProxyResult.class) {
                   label_0100 :
                      uContentPack.giftPackage = giftPackage;
                      uContentPack.liveStreamPackage = liveStreamPa;
                      liveStreamPa.isAnchor = i1;
                      uob.h(uContentPack);
                      u1.r0(uob);
                      goto label_010c ;
                   }
                }else {
                   str2 = str1;
                }
                giftPackage = new ClientContent$GiftPackage();
                giftPackage.magicFaceId = l;
                giftPackage.isLocalHasMaterial = false;
                giftPackage.localHighDefinitionMaterials = str2;
                goto label_0100 ;
             }
          }
          objArray1 = objArray;
          goto label_0112 ;
       }
       return;
    }
}
