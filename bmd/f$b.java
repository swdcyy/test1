package bmd.f$b;
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
import smd.d;
import androidx.lifecycle.ViewModel;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.WaitDrawerBitmapAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class f$b implements g	// class@000284
{
    public final BaseFragment b;
    public final boolean c;

    public void f$b(BaseFragment p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "1")) {
          return;
       }
       a.p(p0, "it");
       ViewModelProviders.of(this.b).get(d.class).t0(new WaitDrawerBitmapAction(p0, this.c));
       return;
    }
}
