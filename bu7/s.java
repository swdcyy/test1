package bu7.s;
import erd.g;
import com.kwai.tokenshare.KwaiTokenInitModule;
import java.lang.Object;
import e06.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import com.yxcorp.plugin.kwaitoken.KwaiToken;
import java.lang.Exception;

public final class s implements g	// class@00049b
{
    public final KwaiTokenInitModule b;

    public void s(KwaiTokenInitModule p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, KwaiTokenInitModule.class, "10")) {
       }else {
          try{
             KwaiToken.k().F1(new File(p0.a()).getName());
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
       }
    }
}
