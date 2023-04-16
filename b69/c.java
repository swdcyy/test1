package b69.c;
import com.yxcorp.gifshow.prefetch.preloader.TunaProphetPreLoader;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import gu7.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.tuna_preloader.DataPreLoader$a;
import b69.b;
import com.kwai.tuna_preloader.DataPreLoader$LoadController;
import hu7.b;
import com.kwai.tuna_preloader.DataPreLoader$b;
import com.kwai.tuna_preloader.DataPreLoader;
import java.lang.Boolean;

public final class c extends TunaProphetPreLoader	// class@000376
{
    public final String c;

    public void c(String p0){
       a.p(p0, "userId");
       super();
       this.c = p0;
    }
    public b a(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new DataPreLoader$a(new b(this.c)).b(new b(0x36ee80)).a();
    }
    public boolean b(TunaProphetPreLoader p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "new");
       p0 = this.b;
       boolean b = false;
       if (p0 != null) {
          int state = p0.getState();
          if (state == 1 || state == 4) {
             b = true;
          }
       }
       return b;
    }
    public String d(){
       return "ExploreFriendPreLoader";
    }
}
