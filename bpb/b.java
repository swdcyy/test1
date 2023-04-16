package bpb.b;
import erd.g;
import com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragment;
import java.lang.Object;
import zq8.a;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public final class b implements g	// class@000420
{
    public final LocalMusicFragment b;

    public void b(LocalMusicFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.b != null) {
          tb.a();
       }
       return;
    }
}
