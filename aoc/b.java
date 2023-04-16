package aoc.b;
import java.lang.Object;
import android.view.View;
import aoc.a;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class b	// class@00029a
{
    public static final int a = 2131379286;
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public static final a a(View p0,int p1){
       int a;
       a.p(p0, "rootView");
       p0 = p0.findViewById(p1);
       a uoa = null;
       if (p0 != null) {
          a.p(p0, "view");
          a = b.a;
          Object tag = p0.getTag(a);
          if (tag instanceof a) {
             uoa = tag;
          }
          if (uoa == null) {
             uoa = new a(p0);
             p0.setTag(a, uoa);
          }
       }
       return uoa;
    }
}
