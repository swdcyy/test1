package brc.d;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.yxcorp.gifshow.v3.editor.frame_v2.network.EditFrameRepo;
import xvc.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brc.c;
import java.lang.IllegalArgumentException;

public final class d implements ViewModelProvider$Factory	// class@000466
{
    public final EditFrameRepo a;
    public final f b;

    public void d(EditFrameRepo p0,f p1){
       a.p(p0, "frameRepo");
       a.p(p1, "editRepo");
       super();
       this.a = p0;
       this.b = p1;
    }
    public ViewModel create(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "modelClass");
       if (a.g(p0, c.class)) {
          return new c(this.a, this.b);
       }
       throw new IllegalArgumentException("Do not Use FrameViewModelV2Factory to create non-frameVm");
    }
}
