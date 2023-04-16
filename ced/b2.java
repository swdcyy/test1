package ced.b2;
import erd.g;
import com.yxcorp.plugin.search.result.hashtag.presenters.h0;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import uy5.a;
import java.lang.String;
import q87.c;
import io.reactivex.subjects.PublishSubject;

public final class b2 implements g	// class@000540
{
    public final h0 b;

    public void b2(h0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b2 tb = this.b;
       Objects.requireNonNull(tb);
       a.C().e("TagMusicPreDownloadPresenter", "œ¬‘ÿ ß∞‹", p0);
       tb.r.onNext("fail");
    }
}
