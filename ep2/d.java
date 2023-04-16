package ep2.d;
import mp2.b;
import java.lang.String;
import jp2.w;
import com.yxcorp.gifshow.model.Lyrics;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class d extends b	// class@0027b0
{
    public final w h;
    public final Lyrics i;

    public void d(String p0,w p1,Lyrics p2){
       a.p(p0, "aryaSign");
       a.p(p1, "musicInfo");
       super(p0, p1, p2);
       this.h = p1;
       this.i = p2;
    }
    public Lyrics getLyrics(){
       return this.i;
    }
    public w getMusicInfo(){
       return this.h;
    }
}
