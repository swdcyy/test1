package hf1.l;
import o81.c;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import android.graphics.drawable.BitmapDrawable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import cn1.a;
import lnc.a1;
import android.graphics.Bitmap;
import android.content.res.Resources;

public class l implements c	// class@00268b
{
    public final HashMap a;

    public void l(){
       super();
       this.a = new HashMap();
    }
    public BitmapDrawable a(String p0){
       Bitmap obj = PatchProxy.applyOneRefs(p0, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a.get(p0) == null) {
          obj = b.a(-402039372).a(p0, a1.e(14.00f));
          if (obj != null) {
             this.a.put(p0, new BitmapDrawable(a1.m(), obj));
          }
       }
       return this.a.get(p0);
    }
}
