package b90.b;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.kuaishou.gifshow.kuaishan.mediascene.loading.MediaSceneLoadingFragment;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import b90.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.IllegalArgumentException;

public final class b implements ViewModelProvider$Factory	// class@000aea
{
    public final MediaSceneLoadingFragment a;

    public void b(MediaSceneLoadingFragment p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "modelClass");
       if (a.g(p0, e.class)) {
          return new e(this.a);
       }
       throw new IllegalArgumentException("Didn\'t Use MediaSceneLoadingViewModel to create");
    }
}
