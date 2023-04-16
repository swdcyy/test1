package bwb.b;
import java.lang.Runnable;
import java.lang.String;
import bwb.c$a;
import java.lang.Object;
import bwb.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Bitmap;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.net.URL;
import java.io.InputStream;
import android.graphics.BitmapFactory;
import bwb.a;
import ekd.k1;

public final class b implements Runnable	// class@0004ca
{
    public final String b;
    public final c$a c;

    public void b(String p0,c$a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       b tc;
       Object obj;
       try{
          b tb = this.b;
          tc = this.c;
          Bitmap uBitmap = null;
          obj = PatchProxy.applyOneRefs(tb, uBitmap, c.class, "2");
          if (obj != PatchProxyResult.class) {
          }else if(!TextUtils.x(tb)){
             uBitmap = BitmapFactory.decodeStream(new URL(tb).openStream());
          }
          obj = uBitmap;
       }catch(java.io.IOException e0){
       }
          k1.o(new a(tc, obj));
          return;
    }
}
