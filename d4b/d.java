package d4b.d;
import erd.o;
import d4b.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import s5b.b;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.MagicEmoji;
import q87.c;
import java.util.Set;
import com.google.common.collect.o$f;
import com.google.common.collect.o;
import java.util.AbstractSet;
import com.yxcorp.gifshow.magic.data.repo.response.MagicFaceResponse;
import brd.t;
import e4b.a;
import e4b.c;
import com.google.common.base.a;
import java.lang.Iterable;
import w3b.l;

public final class d implements o	// class@00242c
{
    public final b b;
    public final Ref$ObjectRef c;
    public final Ref$ObjectRef d;

    public void d(b p0,Ref$ObjectRef p1,Ref$ObjectRef p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "resultMap");
          String str = " size:";
          Object[] objArray = new Object[0];
          b.D().w("MagicLocalRepository", "get dbCache : "+this.b.c.mName+str+p0.size(), objArray);
          this.c.element.putAll(p0);
          p0 = o.a(this.d.element.keySet(), p0.keySet());
          if (p0.isEmpty()) {
             ot = t.just(new MagicFaceResponse());
          }else {
             Object[] objArray1 = new Object[0];
             b.D().s("MagicLocalRepository", "request : "+this.b.c.mName+str+p0.size(), objArray1);
             ot = c.a().q("["+a.f(',').c(p0)+"]", 0, l.e());
          }
       }
       return ot;
    }
}
