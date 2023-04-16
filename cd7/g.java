package cd7.g;
import java.lang.Object;
import wkd.b;
import j80.c;
import java.lang.String;
import java.io.File;
import lnc.a1;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.kwai.nearby.local.pendant.b;
import java.io.FileFilter;
import com.kwai.nearby.local.pendant.c;
import java.util.Comparator;
import java.util.Arrays;
import java.util.ArrayList;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import ekd.x0;
import ekd.a0;

public final class g	// class@000537
{
    public static final String a;
    public static final int b;
    public static final int c;

    static {
       g.a = b.a(-1504323719).d("local_pendant").getAbsolutePath();
       g.b = a1.e(80.00f);
       g.c = a1.e(80.00f);
    }
    public void g(){
       super();
    }
    public static List a(File p0,int p1,int p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, g.class, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       Log.g("AnimationResourceManager", "findBitmaps from path-> "+p0.getAbsolutePath());
       File[] uFileArray = PatchProxy.applyOneRefs(p0, null, og, "5");
       if (uFileArray != patchProxyRe) {
       }else if(!p0.exists() || !p0.isDirectory()){
          uFileArray = p0.listFiles(b.b);
          if (uFileArray != null) {
             Arrays.sort(uFileArray, c.b);
          }
       }
       uFileArray = null;
       if (uFileArray == null) {
          return null;
       }else {
          ArrayList uArrayList = new ArrayList();
          BitmapFactory$Options options = new BitmapFactory$Options();
          if (p1 > 0) {
             options.outWidth = p1;
          }
          if (p1 > 0) {
             options.outHeight = p2;
          }
          p1 = uFileArray.length;
          p2 = 0;
          while (p2 < p1) {
             Bitmap uBitmap = BitmapFactory.decodeFile(uFileArray[p2].getPath(), options);
             if (uBitmap != null) {
                uArrayList.add(uBitmap);
             }
             p2++;
          }
          if (uArrayList.size() == uFileArray.length && uArrayList.size() > 0) {
             return uArrayList;
          }else {
             return null;
          }
       }
    }
    public static String b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a0.c(x0.f(p0).getPath());
    }
}
