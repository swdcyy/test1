package epb.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.music.widget.search.MusicSearchUiOption;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import epb.c$a;
import android.view.View$OnClickListener;
import ekd.m1;

public final class c extends PresenterV2	// class@0027a6
{
    public final MusicSearchUiOption p;

    public void c(MusicSearchUiOption p0){
       super();
       this.p = p0;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       m1.a(p0, new c$a(this), R.id.item_root);
       return;
    }
}
