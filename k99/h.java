package k99.h;
import erd.g;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.b;
import java.lang.Object;
import eda.l;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uf5.b$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class h implements g	// class@002b7d
{
    public final b b;

    public void h(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, b.class, "19")) {
       }else if(b$a.a()){
          b$a.j(tb.getActivity());
       }
       return;
    }
}
