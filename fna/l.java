package fna.l;
import io.reactivex.g;
import java.util.ArrayList;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import o56.a;
import java.io.File;
import android.app.Application;
import java.util.List;
import trd.y;
import qrd.l1;
import com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerHelper;
import java.util.Collection;
import brd.g;

public final class l implements g	// class@00298d
{
    public final ArrayList b;

    public void l(ArrayList p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       File externalCach;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       Application b = a.B;
       if (b != null) {
          externalCach = b.getExternalCacheDir();
          if (externalCach != null) {
             externalCach = externalCach.getParentFile();
             if (externalCach != null) {
                externalCach = externalCach.getParentFile();
             label_0026 :
                ArrayList uArrayList = new ArrayList();
                ArrayList uArrayList1 = new ArrayList();
                l tb = this.b;
                _monitor_enter(tb);
                File uFile = y.M0(this.b);
                _monitor_exit(tb);
                while (uFile != null) {
                   if (externalCach != null) {
                      i = a.g(uFile, externalCach) ^ 0x01;
                      if (!i || GrowthCleanerHelper.f(uFile, externalCach)) {
                      }
                   }
                   uArrayList1.add(uFile);
                   i = uArrayList1.isEmpty() ^ 0x01;
                   while (i) {
                      GrowthCleanerHelper.b(y.L0(uArrayList1), uArrayList, uArrayList1);
                   }
                   p0.onNext(new ArrayList(uArrayList));
                   uArrayList.clear();
                }
                p0.onComplete();
                return;
             }
          }
       }
       externalCach = null;
       goto label_0026 ;
    }
}
