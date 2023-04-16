package fa6.c;
import java.lang.Object;
import com.google.gson.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.decompose.internal.ContainerDeserializer;
import zk.i;
import com.kwai.framework.model.decompose.internal.ContainerSerializer;
import ok.h;
import fa6.d;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.decompose.internal.FeedDeserializerStopWhenFailed;
import com.kwai.framework.model.decompose.internal.BaseFeedSerializer;
import fa6.e;
import ga6.g;
import ga6.f;
import java.util.Objects;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.framework.model.decompose.api.PartDescribeException;
import java.lang.StringBuilder;

public final class c	// class@0015f0
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final b a(){
       Object obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ContainerDeserializer();
    }
    public final i b(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ContainerSerializer();
    }
    public final b c(h p0,d p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "baseFeedFunction");
       a.p(p1, "logger");
       return new FeedDeserializerStopWhenFailed(p0, p1);
    }
    public final i d(){
       Object obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BaseFeedSerializer();
    }
    public final void e(Class p0,e p1){
       Map a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "2")) {
          return;
       }
       a.p(p0, "containerClazz");
       a.p(p1, "builder");
       g b = g.b;
       f uof = new f(p1);
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidTwoRefs(p0, uof, b, g.class, "1")) {
          a.p(p0, "parentClazz");
          a.p(uof, "partDescribe");
          a = g.a;
          ArrayList uArrayList = a.get(p0);
          if (uArrayList == null) {
             uArrayList = new ArrayList();
             a.put(p0, uArrayList);
          }
          Iterator iterator = uArrayList.iterator();
          while (true) {
             if (iterator.hasNext()) {
                f uof1 = iterator.next();
                if (a.g(uof1.a(), uof.a())) {
                label_0066 :
                   throw new PartDescribeException("duplicate \"field:"+uof.a()+"\" between PartDescribe\(path:"+uof1.c()+" class:"+uof1.b()+"\) and PartDescribe\(path:"+uof.c()+" class:"+uof.b()+')');
                }
                continue ;
             }else {
                uArrayList.add(uof);
                break ;
             }
          }
       }
       return;
    }
}
