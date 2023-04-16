package ind.d$b;
import io.reactivex.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import und.l;
import androidx.lifecycle.ViewModel;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.WaitDrawerBitmapAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class d$b implements g	// class@001031
{
    public final BaseFragment b;
    public final boolean c;

    public void d$b(BaseFragment p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "1")) {
          return;
       }
       a.p(p0, "it");
       ViewModelProviders.of(this.b).get(l.class).t0(new WaitDrawerBitmapAction(p0, this.c));
       return;
    }
}
