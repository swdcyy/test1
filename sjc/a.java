package sjc.a;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import sjc.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import sjc.d;
import java.lang.Throwable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.io.File;
import java.util.Iterator;
import ekd.v0;
import java.util.Timer;
import sjc.b;
import java.util.TimerTask;

public final class a implements Runnable	// class@002434
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void run(){
       d b1;
       String str;
       boolean b2;
       String[] a;
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       String[] obj = PatchProxy.apply(null, null, uoc, "2");
       boolean b = true;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          str = c.b();
          a = c.a;
          boolean len = a.length;
          int i = 0;
          while (true) {
             if (i < len) {
                if ((a[i]).equals(str)) {
                   str1 = 1;
                label_002e :
                   if (str1) {
                      b1 = d.b;
                      if (!b1.f(str)) {
                         len = b1.e(str);
                         b2 = (!len)? b1.c(str): false;
                         if (len || !b2) {
                         label_0057 :
                            b = false;
                         }
                      }
                   }
                }else {
                   i = i + 1;
                }
             }else {
                str1 = null;
                goto label_002e ;
             }
          }
       }
       if (b) {
          obj = new String[]{"c++_shared","mmkv","core","chronos","kwsgmain","ksse","plt-base","plt-unwind","exception-handler","ffmpeg","kwaiplayer","ksaudioprocesslib","aegon","kwaiheif","godzilla","hodor"};
          ArrayList uArrayList = new ArrayList(Arrays.asList(obj));
          uArrayList.add("yuv");
          uArrayList.add("opencv_world");
          uArrayList.add("ykit");
          b1 = d.b;
          str = c.b();
          Objects.requireNonNull(b1);
          Object obj1 = PatchProxy.applyOneRefs(str, b1, d.class, "1");
          if (obj1 != patchProxyRe) {
             b2 = obj1.booleanValue();
          }else {
             a.p(str, "processName");
             boolean b3 = new File(b1.d(str, "so_aemon_preload")).exists();
             b2 = b3;
          }
          if (b2) {
             uArrayList.add("AemonPlayer");
          }
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             iterator.next().b(iterator.next());
          }
          if (!PatchProxy.applyVoid(null, null, uoc, "3")) {
             d.b.g(c.b(), "so_preload_error");
             new Timer("so-preload").schedule(new b(), 100);
          }
       }
       return;
    }
}
