package dpb.n;
import erd.o;
import com.yxcorp.gifshow.music.cloudmusic.search.b;
import java.lang.Object;
import com.yxcorp.gifshow.music.network.model.response.MusicsResponse;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.music.network.model.response.MusicItemWrapperResponse;
import java.lang.String;

public final class n implements o	// class@0024e6
{
    public final b b;

    public void n(b p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null && !q.f(p0.mMusics)) {
          tb.t = p0.mMusics.size();
       }
       return new MusicItemWrapperResponse(p0, tb.q);
    }
}
