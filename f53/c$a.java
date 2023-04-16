package f53.c$a;
import eg1.o;
import f53.c;
import java.lang.Object;
import pz2.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import ki1.a;
import java.util.Objects;
import java.lang.Integer;
import y43.a;
import xp5.a;
import com.kwai.live.gzone.common.keyswitch.a;
import java.util.Set;
import java.util.HashSet;
import com.kwai.sdk.switchconfig.a;
import com.google.gson.JsonArray;
import java.lang.reflect.Type;
import com.google.gson.JsonElement;
import pp.a;
import java.lang.Exception;
import q87.c;

public class c$a implements o	// class@0028a2
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public boolean a(c p0){
       HashSet hashSet;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c$a obj = PatchProxy.applyOneRefs(p0, this, c$a.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 instanceof a) {
          obj = this.a;
          int i = p0.M();
          Objects.requireNonNull(obj);
          c uoc = c.class;
          if (PatchProxy.isSupport(uoc)) {
             Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(i), obj, uoc, "4");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }
          }
          if (obj.p.d1.c()) {
             if (obj.r == null) {
                try{
                   hashSet = PatchProxy.apply(null, null, a.class, "31");
                   if (hashSet != patchProxyRe) {
                   }else {
                      hashSet = new HashSet();
                      patchProxyRe = 0;
                      JsonArray value = a.t().getValue("gzoneGiftEffectBlackList", JsonArray.class, new JsonArray());
                      for (int i1 = 0; i1 < value.size(); i1 = i1 + 1) {
                         hashSet.add(Integer.valueOf(value.e0(i1).p()));
                      }
                   }
                }catch(java.lang.Exception e5){
                   Object[] objArray = new Object[patchProxyRe];
                   a.C().t("gzoneGiftEffectBlackList", e5.getMessage(), objArray);
                }
                obj.r = hashSet;
             }
             b = b ^ obj.r.contains(Integer.valueOf(i));
          }
       }
       return b;
    }
    public String getName(){
       return "LiveGzoneEffectTaskFilterPresenter";
    }
}
