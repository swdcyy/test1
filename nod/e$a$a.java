package nod.e$a$a;
import java.lang.Runnable;
import nod.e$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uv8.o$b;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import yod.k;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.v3.framework.post.EditSdkAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import uxb.r;
import uxb.l;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;

public final class e$a$a implements Runnable	// class@001e9e
{
    public final e$a b;

    public void e$a$a(e$a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e$a$a.class, "1")) {
          return;
       }
       ViewModelProviders.of(this.b.c.d).get(k.class).t0(new EditSdkAction());
       o$b d = this.b.c.d;
       a.o(d, "mCurrentFragment");
       l.i().JY(d, new EditSdkAction());
       return;
    }
}
