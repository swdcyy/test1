package c24.v;
import erd.g;
import java.io.File;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.String;
import com.yxcorp.gifshow.util.BitmapUtil;
import us3.f;
import us3.h;
import java.util.HashMap;

public final class v implements g	// class@00049d
{
    public final File b;
    public final RouterRequest c;

    public void v(File p0,RouterRequest p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       v tb = this.b;
       BitmapUtil.Q(p0, tb.getAbsolutePath(), 90);
       p0 = this.c.b();
       if (p0 != null) {
          h oh = new h();
          oh.a = 1;
          HashMap hashMap = new HashMap();
          hashMap.put("imagePath", tb.getAbsolutePath());
          oh.b = hashMap;
          p0.a(oh);
       }
       return;
    }
}
