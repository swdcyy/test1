package u97.d;
import com.kwai.middleware.leia.handler.LeiaParamExtractor;
import android.content.Context;
import com.kwai.middleware.azeroth.Azeroth2;
import java.lang.String;
import com.kwai.middleware.azeroth.AzerothAccount;

public abstract class d extends LeiaParamExtractor	// class@0025c0
{

    public void d(){
       super();
    }
    public boolean A(){
       return false;
    }
    public boolean B(){
       return false;
    }
    public boolean C(){
       return true;
    }
    public Context a(){
       return Azeroth2.B.d();
    }
    public String n(){
       AzerothAccount uAzerothAcco = Azeroth2.B.c();
       if (uAzerothAcco != null) {
          uAzerothAcco = uAzerothAcco.e;
          if (uAzerothAcco != null) {
          label_000f :
             return uAzerothAcco;
          }
       }
       String str = "";
       goto label_000f ;
    }
    public String p(){
       AzerothAccount uAzerothAcco = Azeroth2.B.c();
       if (uAzerothAcco != null) {
          uAzerothAcco = uAzerothAcco.d;
          if (uAzerothAcco != null) {
          label_000f :
             return uAzerothAcco;
          }
       }
       String str = "";
       goto label_000f ;
    }
    public String r(){
       AzerothAccount uAzerothAcco = Azeroth2.B.c();
       if (uAzerothAcco != null) {
          uAzerothAcco = uAzerothAcco.b;
          if (uAzerothAcco != null) {
          label_000f :
             return uAzerothAcco;
          }
       }
       String str = "";
       goto label_000f ;
    }
    public boolean s(){
       return true;
    }
    public boolean t(){
       return false;
    }
    public abstract String u();
    public boolean v(){
       return true;
    }
    public boolean w(){
       return false;
    }
    public boolean x(){
       return false;
    }
    public boolean y(){
       return false;
    }
    public boolean z(){
       return false;
    }
}
