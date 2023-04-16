package d4c.d;
import erd.g;
import d4c.v;
import java.lang.Object;
import a46.d;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import kob.r;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.music.utils.o;
import d4c.w;
import com.kwai.feature.post.api.music.data.MusicSource;
import d46.c;
import qm9.f0;

public final class d implements g	// class@0020c8
{
    public final v b;

    public void d(v p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       p0.OF(tb.getActivity(), tb.F, tb.G, tb.D.m(), o.h(tb.F), false, false, new w(tb));
       p0 = tb.C;
       if (p0 != null) {
          p0.c(tb.D.e40(), tb.F);
       }
       return;
    }
}
