package gha.k;
import erd.o;
import java.lang.Object;
import android.graphics.Bitmap;
import gha.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.a1;
import java.lang.Math;
import android.graphics.Bitmap$Config;
import com.yxcorp.gifshow.util.BitmapUtil;

public final class k implements o	// class@002adb
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public final Object apply(Object p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, null, p.class, "7");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          i = a1.e(24.00f);
          if (i && p0.getHeight()) {
             i = Math.min(i, p0.getHeight());
          }
       }
       return BitmapUtil.U(p0, i, i, p0.getConfig(), false);
    }
}
