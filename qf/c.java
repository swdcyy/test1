package qf.c;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import java.lang.Number;
import java.lang.CharSequence;
import java.lang.Integer;
import java.util.Map;
import android.net.Uri;
import android.net.Uri$Builder;

public class c	// class@0029d4
{
    public Map a;
    public static c b;

    public void c(){
       super();
       this.a = new HashMap();
    }
    public static c a(){
       c uoc = c.class;
       Object obj = PatchProxy.apply(null, null, uoc, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (c.b == null) {
          _monitor_enter(uoc);
          if (c.b == null) {
             c.b = new c();
          }
          _monitor_exit(uoc);
       }
       return c.b;
    }
    public Drawable b(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = this.c(p0, p1);
       Drawable drawable = (i > 0)? p0.getResources().getDrawable(i): null;
       return drawable;
    }
    public int c(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p1 == null || p1.isEmpty()) {
          return 0;
       }
       p1 = (p1.toLowerCase()).replace("-", "_");
       try{
          return Integer.parseInt(p1);
       }catch(java.lang.NumberFormatException e0){
          _monitor_enter(this);
          if (this.a.containsKey(p1)) {
             _monitor_exit(this);
             return this.a.get(p1).intValue();
          }else {
             int identifier = p0.getResources().getIdentifier(p1, "drawable", p0.getPackageName());
             this.a.put(p1, Integer.valueOf(identifier));
             _monitor_exit(this);
             return identifier;
          }
       }
    }
    public Uri d(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = this.c(p0, p1);
       Uri uri = (i > 0)? new Uri$Builder().scheme("res").path(String.valueOf(i)).build(): Uri.EMPTY;
       return uri;
    }
}
