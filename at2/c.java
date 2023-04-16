package at2.c;
import at2.c$a;
import nsd.u;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.util.ArrayList;
import at2.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import com.kuaishou.live.core.voiceparty.micseats.guide.MicSeatGuideState;
import com.kwai.robust.PatchProxyResult;
import at2.c$b;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Integer;
import at2.c$c;
import com.kuaishou.live.core.voiceparty.micseats.guide.GuideStructBizRelations;
import kotlin.NoWhenBranchMatchedException;
import com.kuaishou.live.core.voiceparty.micseats.guide.MicSeatGuideBizType;
import ss2.f;
import com.kuaishou.live.core.voiceparty.micseats.guide.ClickSource;
import java.util.Iterator;
import java.lang.Iterable;

public abstract class c	// class@0002c5
{
    public List a;
    public static final AtomicInteger b;
    public static final c$a c;

    static {
       c.c = new c$a(null);
       c.b = new AtomicInteger();
    }
    public void c(){
       super();
       this.a = new ArrayList();
    }
    public void c(u p0){
       super();
       this.a = new ArrayList();
    }
    public final void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       a.p(p0, "callback");
       this.a.add(p0);
       return;
    }
    public final c b(MicSeatGuideState p0){
       c$b obj2;
       int i3;
       c uoc = this;
       Object obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj1 = PatchProxy.applyOneRefs(obj, uoc, c.class, "1");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = "state";
       a.p(obj, obj1);
       int i = 0;
       int i1 = 8;
       if (uoc instanceof c$b) {
          obj2 = uoc;
          String str = obj2.g();
          c$b g = obj2.g;
          c$b h = obj2.h;
          c$b i2 = obj2.i;
          c$b j = obj2.j;
          c$b k = obj2.k;
          i3 = obj2.d();
          c$b uob = c$b.class;
          if (PatchProxy.isSupport(uob)) {
             Object[] objArray = new Object[i1];
             objArray[i] = str;
             objArray[1] = obj;
             objArray[2] = Boolean.valueOf(g);
             objArray[3] = h;
             objArray[4] = Long.valueOf(i2);
             objArray[5] = j;
             objArray[6] = Boolean.valueOf(k);
             objArray[7] = Integer.valueOf(i3);
             obj2 = PatchProxy.apply(objArray, obj2, uob, "5");
             if (obj2 != patchProxyRe) {
             }
          }
          a.p(str, "userId");
          a.p(obj, obj1);
          c$b uob1 = new c$b(str, p0, g, h, i2, j, k, i3);
          obj2 = uob;
       }else if(uoc instanceof c$c){
          Object obj3 = uoc;
          String str1 = obj3.g();
          c$c f = obj3.f;
          c$c g1 = obj3.g;
          c$c h1 = obj3.h;
          c$c i4 = obj3.i;
          c$c j1 = obj3.j;
          GuideStructBizRelations guideStructB = obj3.e();
          i3 = obj3.d();
          if (PatchProxy.isSupport(c$c.class)) {
             Object[] objArray1 = new Object[9];
             objArray1[i] = str1;
             objArray1[1] = obj;
             objArray1[2] = Boolean.valueOf(f);
             objArray1[3] = g1;
             objArray1[4] = h1;
             objArray1[5] = Boolean.valueOf(i4);
             objArray1[6] = Long.valueOf(j1);
             objArray1[7] = guideStructB;
             objArray1[8] = Integer.valueOf(i3);
             c$c uoc1 = PatchProxy.apply(objArray1, obj3, c$c.class, "6");
             if (uoc1 != patchProxyRe) {
             label_0118 :
                obj2 = uoc1;
                uoc = this;
             }
          }
          a.p(str1, "userId");
          a.p(obj, obj1);
          a.p(g1, "bubbleContent");
          a.p(h1, "buttonContent");
          a.p(guideStructB, "relation");
          c$c uoc2 = new c$c(str1, p0, f, g1, h1, i4, j1, guideStructB, i3);
          goto label_0118 ;
       }else {
          throw new NoWhenBranchMatchedException();
       }
       obj2.a = uoc.a;
       return obj2;
    }
    public final MicSeatGuideBizType c(){
       MicSeatGuideBizType fOLLOW = (this instanceof c$b)? MicSeatGuideBizType.FOLLOW: MicSeatGuideBizType.UNION;
       return fOLLOW;
    }
    public abstract int d();
    public abstract GuideStructBizRelations e();
    public abstract MicSeatGuideState f();
    public abstract String g();
    public abstract boolean h();
    public final void i(f p0,ClickSource p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "5")) {
          return;
       }
       a.p(p0, "micSeatData");
       a.p(p1, "clickSource");
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(this, p0, p1);
       }
       return;
    }
}
