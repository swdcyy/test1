package f83.b;
import com.kuaishou.live.viewcontroller.ViewController;
import vb3.m;
import java.lang.String;
import msd.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import f83.b$b;
import f83.b$a;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import fe3.e;
import fe3.d;
import zsd.u;
import fe3.g;
import java.lang.Math;

public final class b extends ViewController	// class@0028ed
{
    public final o j;
    public final b$a k;
    public final m l;
    public final String m;
    public final a n;

    public void b(m p0,String p1,a p2){
       a.p(p0, "stageChangeService");
       a.p(p2, "layoutConfig");
       super();
       this.l = p0;
       this.m = p1;
       this.n = p2;
       this.j = new b$b(this);
       this.k = new b$a();
    }
    public final int V2(LayoutConfig p0,int p1,String p2){
       int i;
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, b.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 != null) {
          List list = p0.e();
          if (list != null) {
             Iterator iterator = list.iterator();
             i = Integer.MIN_VALUE;
             while (iterator.hasNext()) {
                e uoe = iterator.next();
                d uod = uoe.h();
                String str = (uod != null)? uod.b(): null;
                if (u.J1(str, p2, false, 2, null)) {
                   continue ;
                }
                i = Math.max(i, uoe.e().d());
             }
             if (i != Integer.MIN_VALUE) {
                p1 = i;
             }
             return p1;
          }
       }
       i = Integer.MIN_VALUE;
       goto label_0063 ;
    }
    public final int W2(LayoutConfig p0,int p1,String p2){
       e obj;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, b.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = null;
       if (p0 != null) {
          List list = p0.e();
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                Object obj1 = iterator.next();
                d uod = obj1.h();
                String str = (uod != null)? uod.b(): obj;
                int i = a.g(str, p2) ^ 0x01;
                if (i) {
                   obj = obj1;
                   break ;
                }
             }
          }
       }
       if (obj != null) {
          g og = obj.e();
          if (og != null) {
             p1 = og.c();
          }
       }
       return p1;
    }
}
