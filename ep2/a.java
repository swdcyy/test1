package ep2.a;
import mp2.d;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import com.yxcorp.gifshow.model.Lyrics;
import zo2.a0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ep2.e;
import msd.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import jp2.w;

public final class a implements d	// class@0027aa
{
    public final e a;
    public final KtvMusicOrderInfo b;
    public final Lyrics c;

    public void a(KtvMusicOrderInfo p0,Lyrics p1,a0 p2,long p3){
       a.p(p0, "music");
       a.p(p2, "player");
       super();
       this.b = p0;
       this.c = p1;
       this.a = new e(p2, p3);
    }
    public void a(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       a.p(p0, "listener");
       this.a.b(p0);
       return;
    }
    public void b(int p0){
    }
    public void c(int p0,l p1){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, a.class, "1")) {
          return;
       }
       a.p(p1, "onComplete");
       this.a.c(this.b);
       return;
    }
    public Lyrics getLyrics(){
       return this.c;
    }
    public w getMusicInfo(){
       return null;
    }
    public void stop(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.a.d();
       return;
    }
}
