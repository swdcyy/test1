package i02.j;
import eg1.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.effect.resource.download.common.e;
import vz2.a;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.live.common.core.component.magiceffect.LiveMagicEffectUtil;
import lp3.e;
import lp3.c;
import lp3.b;

public class j implements a	// class@0027f2
{

    public void j(){
       super();
    }
    public boolean B6(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (e.b().he().g(p0) != null)? true: false;
       return b;
    }
    public long Un(String p0,int p1){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oj, "1");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return LiveMagicEffectUtil.a(p0, p1);
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
}
