package m9a.n;
import java.lang.Object;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import zf6.j;
import yz7.n;

public final class n	// class@002f8b
{
    public static final int a = 2131101684;
    public static final int b = 2131101677;
    public static final n c;

    static {
       n.c = new n();
    }
    public void n(){
       super();
    }
    public static final Drawable a(Context p0,int p1,int p2){
       if (PatchProxy.isSupport(n.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, n.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Drawable uDrawable = j.n(p0, p1, p2);
       if (uDrawable != null) {
          uDrawable.setBounds(0, 0, n.c(p0, 12.00f), n.c(p0, 12.00f));
       }else {
          uDrawable = null;
       }
       return uDrawable;
    }
    public static final Drawable b(Context p0,int p1){
       n on = n.class;
       Drawable uDrawable = null;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), uDrawable, on, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Drawable uDrawable1 = j.n(p0, p1, n.a);
       if (uDrawable1 != null) {
          uDrawable1.setBounds(0, 0, n.c(p0, 14.00f), n.c(p0, 14.00f));
          uDrawable = uDrawable1;
       }
       return uDrawable;
    }
    public static final Drawable c(Context p0,int p1){
       n on = n.class;
       Drawable uDrawable = null;
       if (PatchProxy.isSupport(on)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), uDrawable, on, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Drawable uDrawable1 = j.n(p0, p1, n.b);
       if (uDrawable1 != null) {
          uDrawable1.setBounds(0, 0, n.c(p0, 16.00f), n.c(p0, 16.00f));
          uDrawable = uDrawable1;
       }
       return uDrawable;
    }
}
