package baa.b;
import baa.a;
import java.lang.Object;
import daa.b;
import com.yxcorp.gifshow.easteregg.model.ConditionConfig;
import daa.d;
import daa.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;

public final class b implements a	// class@00042e
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public boolean a(b p0,ConditionConfig p1){
       return this.b(p0, p1);
    }
    public boolean b(d p0,c p1){
       boolean b;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "c");
       a.p(p1, "t");
       b = false;
       if (p0.a() - p1.startTime >= 0 && p0.a() - p1.endTime <= 0) {
          p1 = p1.keywords;
          if (!p1 instanceof Collection || !p1.isEmpty()) {
             Iterator iterator = p1.iterator();
             while (iterator.hasNext()) {
                if (StringsKt__StringsKt.O2(p0.a, iterator.next(), b, 2, null)) {
                   b = true;
                   break ;
                }
             }
          }
       }
       return b;
    }
}
