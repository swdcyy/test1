package d4c.e0;
import erd.g;
import d4c.h0$a;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import a46.d;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.post.api.music.data.MusicSource;
import d4c.h0;
import kob.r;
import com.yxcorp.gifshow.music.utils.o;
import d4c.g0;
import d46.c;

public final class e0 implements g	// class@0020c9
{
    public final h0$a b;
    public final Music c;

    public void e0(h0$a p0,Music p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       e0 tb = this.b;
       e0 tc = this.c;
       p0.OF(tb.a.getActivity(), tc, MusicSource.PROFILE_MUSIC, tb.a.z.m(), o.h(tc), false, false, new g0(tb));
    }
}
