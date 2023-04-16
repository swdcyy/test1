package ced.a2;
import erd.g;
import com.yxcorp.plugin.search.result.hashtag.presenters.h0;
import java.lang.Object;
import java.io.File;
import java.util.Objects;
import uy5.a;
import java.lang.String;
import q87.c;
import io.reactivex.subjects.PublishSubject;

public final class a2 implements g	// class@00053c
{
    public final h0 b;

    public void a2(h0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a2 tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.C().y("TagMusicPreDownloadPresenter", "œ¬‘ÿ≥…π¶", objArray);
       tb.r.onNext("success");
    }
}
