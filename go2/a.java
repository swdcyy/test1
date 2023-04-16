package go2.a;
import java.lang.Runnable;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qkd.b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public final class a implements Runnable	// class@002b5d
{
    public final File b;

    public void a(File p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       try{
          b.p(this.b);
       }catch(java.lang.Exception e0){
          b.I(LiveLogTag.LIVE_VOICE_PARTY, "deleteBadCache", e0);
       }
       return;
    }
}
