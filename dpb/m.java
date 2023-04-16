package dpb.m;
import erd.g;
import com.yxcorp.gifshow.music.cloudmusic.search.SearchMusicFragment;
import java.lang.Object;
import yob.c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.music.cloudmusic.event.ClickPurpose;

public final class m implements g	// class@0024e5
{
    public final SearchMusicFragment b;

    public void m(SearchMusicFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, SearchMusicFragment.class, "24")) {
       }else if(p0.a() == ClickPurpose.TO_PAUSE_MUSIC_CARD){
          tb.Z0 = true;
       }else if(p0.a() == ClickPurpose.TO_PAUSE_PHOTO){
          tb.a1 = true;
       }
       return;
    }
}
