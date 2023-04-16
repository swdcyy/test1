package fgd.l$a$a;
import erd.g;
import fgd.l$a;
import java.lang.Object;
import om6.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.post.api.feature.localalbum.LocalAlbumEntranceParams;
import android.content.Context;

public final class l$a$a implements g	// class@000e2b
{
    public final l$a b;

    public void l$a$a(l$a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l$a$a.class, "1")) {
       }else {
          p0.Zl(this.b.b.getActivity(), new LocalAlbumEntranceParams().setPageFrom(3));
       }
       return;
    }
}
