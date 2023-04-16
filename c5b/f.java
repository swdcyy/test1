package c5b.f;
import erd.o;
import java.util.List;
import java.lang.Object;
import hlb.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import c5b.b;
import java.lang.Long;
import java.lang.Number;
import java.util.Map;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import w3b.l;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import a5b.b;
import j8c.b;

public final class f implements o	// class@0004bb
{
    public final List b;

    public void f(List p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          a.p(p0, "findResult");
          uArrayList = new ArrayList();
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             Long longx = uob.a();
             if (longx != null) {
                MagicEmoji$MagicFace magicFace = p0.a.get(String.valueOf(longx.longValue()));
                if (magicFace != null && l.q(magicFace)) {
                   new MagicEmoji$MagicFace().copyFrom(magicFace);
                   uArrayList.add(new b(magicFace, uob.highLightWords));
                }
             }
          }
          b.d("MagicSearchProvider", "searchMagicFace success");
       }
       return uArrayList;
    }
}
