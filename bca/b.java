package bca.b;
import java.util.Comparator;
import bca.a$u;
import com.yxcorp.gifshow.aicut.VideoTemplateResponse;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.aicut.VideoTemplate;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.Comparable;
import xrd.b;

public final class b implements Comparator	// class@000465
{
    public final a$u b;
    public final VideoTemplateResponse c;

    public void b(a$u p0,VideoTemplateResponse p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final int compare(Object p0,Object p1){
       int i3;
       VideoTemplate videoTemplat;
       Iterator obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b.c.iterator();
       int i = 0;
       int i1 = 0;
       while (true) {
          int i2 = -1;
          if (obj.hasNext()) {
             if (a.g(String.valueOf(obj.next().getSecond().longValue()), p0.getId())) {
             label_0049 :
                i3 = Integer.MAX_VALUE;
                if (i1 < 0) {
                   i1 = Integer.MAX_VALUE;
                }
                videoTemplat = Integer.valueOf(i1);
                Iterator iterator = this.b.c.iterator();
                while (iterator.hasNext()) {
                   if (a.g(String.valueOf(iterator.next().getSecond().longValue()), p1.getId())) {
                      i2 = i;
                   }
                   i = i + 1;
                }
                if (i2 >= 0) {
                   i3 = i2;
                }
             }else {
                i1 = i1 + 1;
             }
          }else {
             i1 = -1;
             goto label_0049 ;
          }
       }
       PatchProxy.onMethodExit(b.class, "1");
       return b.f(videoTemplat, Integer.valueOf(i3));
    }
}
