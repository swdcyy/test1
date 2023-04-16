package j80.d;
import com.smile.gifshow.annotation.plugin.Factory;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.gifshow.files.FileManagerPriorPrivate;
import k80.a;
import java.util.Objects;
import k80.b;

public class d extends Factory	// class@0019bb
{

    public void d(){
       super();
    }
    public Object newInstance(){
       FileManagerPriorPrivate uFileManager = PatchProxy.apply(null, this, d.class, "1");
       if (uFileManager != PatchProxyResult.class) {
       }else {
          uFileManager = new FileManagerPriorPrivate();
          Objects.requireNonNull(uFileManager.s(), "null cannot be cast to non-null type com.kuaishou.gifshow.files.delegate.FileManagerDelegateImpl");
       }
       return uFileManager;
    }
}
