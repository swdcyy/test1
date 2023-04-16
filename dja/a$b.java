package dja.a$b;
import z0.a;
import dja.a;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import h8c.a;
import java.lang.StringBuilder;
import q87.c;
import kotlin.jvm.internal.a;
import com.google.common.collect.ImmutableList;
import o26.d;
import java.util.Iterator;
import java.lang.Iterable;

public final class a$b implements a	// class@0024b7
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public Object apply(Object p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          Object[] objArray = new Object[0];
          a.C().w("MockFeedViewModel", "switch currentQPhoto{postWorkId:"+p0+'}', objArray);
          obj = this.a.b;
          a.o(obj, "mMockFeedRepo");
          ImmutableList immutableLis = obj.Id();
          int i = 0;
          if (immutableLis != null) {
             Iterator iterator = immutableLis.iterator();
             while (iterator.hasNext()) {
                Object obj1 = iterator.next();
                Object obj2 = obj1;
                a.o(obj2, "it");
                int postWorkInfo = obj2.getPostWorkInfoId();
                obj2 = (p0 != null && p0.intValue() == postWorkInfo)? 1: null;
                if (obj2) {
                   i = obj1;
                   break ;
                }
             }
          }
          obj = i;
       }
       return obj;
    }
}
