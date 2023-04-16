package k79.j;
import android.database.Cursor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import qkd.b;
import jc7.h;
import java.lang.StringBuilder;
import java.lang.Boolean;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.regex.Pattern;
import java.lang.CharSequence;
import java.util.regex.Matcher;

public final class j	// class@002b55
{

    public static final void a(Cursor p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, j.class, "7")) {
          return;
       }
       if (p0 != null && !p0.isClosed()) {
          p0.close();
       }
       return;
    }
    public static final File b(File p0,int p1,int p2){
       if (PatchProxy.isSupport(j.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, j.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.q(p0, "originFile");
       if (!b.L(p0)) {
          h oh = h.c();
          a.h(oh, "KsAlbumFileManager.getInstance\(\)");
          p0 = new File(oh.d(), p0.getName()+"-"+p1+"-"+p2+(p0.getAbsolutePath()).hashCode()+".jpg");
       }
       return p0;
    }
    public static final float c(int p0,int p1,int p2){
       if (!p1 || !p0) {
          return 0;
       }
       float f = (!(p2 % 180))? (float)p0 / (float)p1: (float)p1 / (float)p0;
       return f;
    }
    public static final float d(int p0,int p1,int p2){
       if (!p1 || !p0) {
          return 0;
       }
       float f = (!(p2 % 180))? (float)p0 / (float)p1: (float)p1 / (float)p0;
       return f;
    }
    public static final boolean e(Cursor p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, j.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 == null || p0.isClosed())? true: false;
       return b;
    }
    public static final boolean f(String p0,ArrayList p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, j.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "path");
       if (p1 != null) {
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             if (iterator.next().matcher(p0).matches()) {
                return true;
             }
          }
       }
       return false;
    }
}
