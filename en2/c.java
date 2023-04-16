package en2.c;
import java.lang.Runnable;
import com.kuaishou.live.core.show.wishlight.download.base.b;
import java.lang.Object;
import java.lang.String;
import j80.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.io.File;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kwai.robust.PatchProxyResult;
import j80.e;
import java.util.Comparator;
import java.util.Arrays;
import y56.a;

public final class c implements Runnable	// class@002791
{
    public final b b;

    public void c(b p0){
       this.b = p0;
    }
    public final void run(){
       c tb = this.b;
       tb.b = true;
       long l = f.d(tb.a);
       if (l - 0x1400000 > 0) {
          b uob = b.class;
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), tb, uob, "1")) {
             _monitor_enter(tb);
             if (!new File(tb.a).exists()) {
                b.P(b.d, "dirFile not exists. dirPath = "+tb.a);
                _monitor_exit(tb);
             }else {
                uob = tb.a;
                Object obj = null;
                File obj1 = PatchProxy.applyOneRefs(uob, obj, f.class, "7");
                if (obj1 != PatchProxyResult.class) {
                   obj = obj1;
                }else {
                   obj1 = new File(uob);
                   if (obj1.isDirectory()) {
                      File[] uFileArray = obj1.listFiles();
                      if (uFileArray != null) {
                         Arrays.sort(uFileArray, new e());
                         obj = uFileArray;
                      }
                   }
                }
                if (obj == null || !obj.length) {
                   b.P(b.d, "orderFileList is empty. dirPath = "+tb.a);
                   _monitor_exit(tb);
                }else {
                   long l1 = l / 2;
                   long l2 = 0;
                   int len = obj.length;
                   int i = 0;
                   int i1 = 0;
                   while (i < len) {
                      object oobject = obj[i];
                      f.a(oobject);
                      i1 = i1 + 1;
                      l2 = l2 + a.c(oobject);
                      if (l2 - l1 > 0) {
                         break ;
                      }
                      i = i + 1;
                   }
                   b.P(b.d, "deleteHalvedFileByModifyTime totalFileCount = "+obj.length+" deleteFileCount = "+i1+" dirSize = "+l+" halveDirSize = "+l1+" hasDeletedFieldSize = "+l2);
                   _monitor_exit(tb);
                }
             }
          }
       }
       tb.b = false;
       return;
    }
}
