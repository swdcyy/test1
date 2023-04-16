package og.m;
import io.reactivex.g;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import brd.v;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.music.utils.e;
import brd.g;
import wkd.b;
import com.yxcorp.gifshow.music.utils.a;
import og.q;
import com.yxcorp.gifshow.music.utils.a$a;

public final class m implements g	// class@0027b5
{
    public final Music b;

    public void m(Music p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       m tb = this.b;
       if (e.e(tb.mUrl, tb.mUrls)) {
          p0.onNext(tb);
          p0.onComplete();
       }else {
          b.a(-905856758).d(tb, tb.mUrl, tb.mUrls, new q(p0, tb));
       }
       return;
    }
}
