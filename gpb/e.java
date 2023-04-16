package gpb.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import gpb.h;
import com.yxcorp.gifshow.music.cloudmusic.search.panel.MusicSearchPanelFragment;
import java.lang.Object;
import com.kwai.feature.post.api.music.cloudmusic.SearchMusicPanelInteraction;

public class e extends Accessor	// class@002b59
{
    public final MusicSearchPanelFragment c;
    public final h d;

    public void e(h p0,MusicSearchPanelFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.ch();
    }
}
