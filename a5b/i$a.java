package a5b.i$a;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import a5b.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import xf6.g;
import e5b.b;
import s5b.b;
import java.lang.Throwable;
import q87.c;
import c5b.e;

public final class i$a	// class@000055
{

    public void i$a(){
       super();
    }
    public void i$a(u p0){
       super();
    }
    public final a a(MagicBusinessId p0,MagicEmojiPageConfig p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, i$a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "businessId");
       if (g.l1()) {
          Object[] objArray = null;
          obj = PatchProxy.apply(objArray, objArray, b.class, "1");
          if (obj != patchProxyRe) {
             objArray = obj;
          }else if(!g.l1()){
             String str = "com.yxcorp.gifshow.magic_search.LocalSearchProvider";
             try{
                objArray = Class.forName(str).newInstance();
             }catch(java.lang.Exception e0){
                b.D().z("MagicSearchDebugUtil", "MagicFaceSearchFragment not found !!!", e0);
             }
          }
       }
       return new e(p0, p1);
    }
}
