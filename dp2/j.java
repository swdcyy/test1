package dp2.j;
import lp2.b;
import q00.b;
import java.lang.String;
import jp2.u;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import zo2.a0;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import jp2.w;
import jp2.c;
import com.yxcorp.gifshow.model.Lyrics;
import java.lang.Object;
import kotlin.jvm.internal.a;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import dp2.a;

public final class j extends b	// class@002579
{
    public final b k;
    public final String l;
    public final RtcManager m;
    public final a0 n;
    public final Lyrics o;

    public void j(b p0,String p1,u p2,RtcManager p3,a0 p4,KtvMusicOrderInfo p5,w p6,c p7,Lyrics p8){
       int i = this;
       Object obj = p3;
       Object obj1 = p4;
       a.p(p0, "commonEngine");
       a.p(p1, "aryaSign");
       a.p(p2, "rtcService");
       a.p(obj, "rtcManager");
       a.p(obj1, "livePlayer");
       Object obj2 = p5;
       a.p(obj2, "music");
       Object obj3 = p6;
       a.p(obj3, "musicInfo");
       Object obj4 = p7;
       a.p(obj4, "ktvInfo");
       super(p0, p1, p2, obj4, obj2, obj3);
       i.k = p0;
       i.l = p1;
       i.m = obj;
       i.n = obj1;
       i.o = p8;
    }
    public void c(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       a.p(p0, "onComplete");
       this.n.stopPlay();
       super.c(p0);
       return;
    }
    public void d(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "2")) {
          return;
       }
       super.d(p0);
       this.n.h();
       if (!p0) {
          this.m.h(6, a.a);
       }
       return;
    }
    public Lyrics getLyrics(){
       return this.o;
    }
}
