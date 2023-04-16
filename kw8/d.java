package kw8.d;
import androidx.lifecycle.ViewModelProvider$Factory;
import com.yxcorp.gifshow.activity.share.ShareActivity;
import java.lang.Object;
import java.lang.Class;
import androidx.lifecycle.ViewModel;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ex8.d;
import ex8.b;
import xw8.d;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.entity.QPhoto;

public class d implements ViewModelProvider$Factory	// class@002c2a
{
    public final ShareActivity a;

    public void d(ShareActivity p0){
       this.a = p0;
       super();
    }
    public ViewModel create(Class p0){
       p0 = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       ShareActivity w = this.a.W;
       return new d(new b(w.g, w.f, w.D));
    }
}
