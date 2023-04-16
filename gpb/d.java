package gpb.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import gpb.h;
import com.yxcorp.gifshow.music.cloudmusic.search.panel.MusicSearchPanelFragment;
import java.lang.Object;
import k2b.e0;

public class d extends Accessor	// class@002b58
{
    public final MusicSearchPanelFragment c;
    public final h d;

    public void d(h p0,MusicSearchPanelFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.n;
    }
    public void set(Object p0){
       this.c.n = p0;
    }
}
