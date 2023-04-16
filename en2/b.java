package en2.b;
import java.lang.Runnable;
import com.kuaishou.live.core.show.wishlight.download.base.b;
import java.lang.Object;
import j80.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import java.util.List;
import com.kuaishou.android.live.log.b;

public final class b implements Runnable	// class@002790
{
    public final b b;

    public void b(b p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       _monitor_enter(tb);
       b a = tb.a;
       if (PatchProxy.applyVoidOneRefs(a, null, f.class, "8")) {
       }else {
          File uFile = new File(a);
          if (uFile.isDirectory()) {
             File[] uFileArray = uFile.listFiles();
             if (uFileArray != null) {
                int len = uFileArray.length;
                for (int i = 0; i < len; i = i + 1) {
                   f.a(uFileArray[i]);
                }
             }
          }
       }
       b.P(b.d, "deleteAllFilesWithoutDir");
       _monitor_exit(tb);
       return;
    }
}
