package gpb.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import gpb.h;
import com.yxcorp.gifshow.music.cloudmusic.search.panel.MusicSearchPanelFragment;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class b extends Accessor	// class@002b56
{
    public final MusicSearchPanelFragment c;
    public final h d;

    public void b(h p0,MusicSearchPanelFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.k;
    }
    public void set(Object p0){
       this.c.k = p0;
    }
}
