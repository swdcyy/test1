package gpb.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import gpb.h;
import com.yxcorp.gifshow.music.cloudmusic.search.panel.MusicSearchPanelFragment;
import java.lang.Object;
import dpb.b;

public class c extends Accessor	// class@002b57
{
    public final MusicSearchPanelFragment c;
    public final h d;

    public void c(h p0,MusicSearchPanelFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.m;
    }
    public void set(Object p0){
       this.c.m = p0;
    }
}
