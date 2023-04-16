package x87.b;
import com.kwai.logger.upload.retrieve.azeroth.AzerothConfigPuller$a;
import com.kwai.logger.upload.retrieve.azeroth.f;
import java.lang.Object;
import crd.b;

public final class b implements AzerothConfigPuller$a	// class@0027c1
{
    public final f a;

    public void b(f p0){
       this.a = p0;
    }
    public final void a(){
       b ta = this.a;
       _monitor_enter(ta);
       if (ta.c != null && !ta.c.isDisposed()) {
          ta.c.dispose();
       }
       ta.c();
       _monitor_exit(ta);
       return;
    }
}
