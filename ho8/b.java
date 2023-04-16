package ho8.b;
import java.util.concurrent.Callable;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import ho8.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class b implements Callable	// class@0025c3
{
    public final Context b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;

    public void b(Context p0,String p1,String p2,int p3,int p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final Object call(){
       b tb = this.b;
       b tc = this.c;
       b td = this.d;
       b te = this.e;
       b tf = this.f;
       c uoc = c.class;
       Object obj = null;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{tb,tc,td,Integer.valueOf(te),Integer.valueOf(tf),Boolean.FALSE};
          Object obj1 = PatchProxy.apply(objArray, obj, uoc, "6");
          if (obj1 != PatchProxyResult.class) {
             obj = obj1;
          }else if(TextUtils.isEmpty(tc)){
             if (tc.startsWith("asset://")) {
                obj = c.d(tb, tc);
             }else if(tc.startsWith("file://")){
                obj = c.b(tb, tc, te, tf, 0);
             }else if(tc.startsWith("bundle://")){
                obj = c.a(tb, tc, td, te, tf, false);
             }else {
                obj = c.a(tb, tc, td, te, tf, false);
             }
          }
       }else {
          goto label_0040 ;
       }
       return obj;
    }
}
