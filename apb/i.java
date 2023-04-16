package apb.i;
import android.view.View$OnClickListener;
import apb.m;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import t16.a;
import lob.q;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.music.util.a$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.post.api.music.data.MusicSource;
import com.kwai.feature.post.api.music.interfaces.CloudMusicHelper;
import com.yxcorp.gifshow.music.utils.g;
import apb.l;
import com.yxcorp.utility.AsyncTask;
import java.lang.Void;
import java.util.concurrent.Executor;
import java.lang.String;
import kob.n;
import com.google.gson.JsonObject;
import k2b.e0;
import jqb.k;

public final class i implements View$OnClickListener	// class@0002ab
{
    public final m b;

    public void i(m p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       i tb = this.b;
       Objects.requireNonNull(tb);
       q.a(q.b(), tb.L, tb.p);
       a$a uoa = new a$a(tb.getActivity());
       uoa.c(tb.p);
       uoa.g(tb.L);
       uoa.e(MusicSource.CLOUD_MUSIC);
       uoa.d(tb.q.getDuration());
       uoa.f(g.a(tb.p));
       uoa.b(false);
       uoa.a(true);
       l ol = new l(tb, uoa);
       Void[] voidArray = new Void[false];
       ol.e(AsyncTask.l, voidArray);
       k.m(tb.p, tb.t.f(), null, tb.u);
    }
}
