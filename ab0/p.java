package ab0.p;
import erd.g;
import com.kuaishou.gifshow.smartalbum.ui.grid.b;
import com.kuaishou.gifshow.smartalbum.model.SmartAlbumUiItem;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import com.kuaishou.gifshow.smartalbum.ui.loading.SmartAlbumLoadingActivity;

public final class p implements g	// class@000046
{
    public final b b;
    public final SmartAlbumUiItem c;

    public void p(b p0,SmartAlbumUiItem p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       p tb = this.b;
       p tc = this.c;
       Objects.requireNonNull(tb);
       if (p0.booleanValue() && tb.getActivity() != null) {
          SmartAlbumLoadingActivity.G3(tb.getActivity(), 102, tb.r, tc);
       }
       return;
    }
}
