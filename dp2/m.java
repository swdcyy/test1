package dp2.m;
import lp2.b;
import q00.b;
import java.lang.String;
import jp2.u;
import jp2.c;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import jp2.w;
import com.yxcorp.gifshow.model.Lyrics;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class m extends b	// class@00257f
{
    public final Lyrics k;

    public void m(b p0,String p1,u p2,c p3,KtvMusicOrderInfo p4,w p5,Lyrics p6){
       a.p(p0, "commonEngine");
       a.p(p1, "aryaSign");
       a.p(p2, "ktvRtcService");
       a.p(p3, "ktvInfo");
       a.p(p4, "music");
       a.p(p5, "musicInfo");
       super(p0, p1, p2, p3, p4, p5);
       this.k = p6;
    }
    public Lyrics getLyrics(){
       return this.k;
    }
}
