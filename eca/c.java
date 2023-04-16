package eca.c;
import androidx.fragment.app.Fragment;
import cca.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import dca.s;
import androidx.lifecycle.ViewModel;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class c	// class@002108
{

    public static final b a(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ViewModelProviders.of(p0).get(s.class).o0();
    }
}
