package dpb.l;
import erd.g;
import com.yxcorp.gifshow.music.cloudmusic.search.SearchMusicFragment;
import java.lang.Object;
import yob.e;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.music.cloudmusic.PostMusicTabHostFragment$Tab;
import com.yxcorp.gifshow.music.cloudmusic.CloudMusicRecyclerFragment;

public final class l implements g	// class@0024e4
{
    public final SearchMusicFragment b;

    public void l(SearchMusicFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, SearchMusicFragment.class, "23")) {
       }else if(p0.a() == PostMusicTabHostFragment$Tab.KTV_RN){
          tb.Mh();
       }
       return;
    }
}
