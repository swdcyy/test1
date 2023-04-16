package f5.b;
import java.lang.Object;
import android.graphics.drawable.Drawable$Callback;
import java.lang.String;
import a5.c;
import java.util.Map;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import android.view.View;
import java.util.HashMap;
import android.content.Context;
import android.graphics.Bitmap;
import a5.g;

public class b	// class@001fd1
{
    public final Context a;
    public String b;
    public c c;
    public final Map d;
    public static final Object e;

    static {
       b.e = new Object();
    }
    public void b(Drawable$Callback p0,String p1,c p2,Map p3){
       super();
       this.b = p1;
       if (!TextUtils.isEmpty(p1)) {
          b tb = this.b;
          if (tb.charAt((tb.length() - 1)) != '/') {
             this.b = this.b+'/';
          }
       }
       if (!p0 instanceof View) {
          this.d = new HashMap();
          this.a = null;
          return;
       }else {
          this.a = p0.getContext();
          this.d = p3;
          this.b(p2);
          return;
       }
    }
    public final Bitmap a(String p0,Bitmap p1){
       Object e = b.e;
       _monitor_enter(e);
       this.d.get(p0).e(p1);
       _monitor_exit(e);
       return p1;
    }
    public void b(c p0){
       this.c = p0;
    }
}
