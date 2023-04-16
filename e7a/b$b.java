package e7a.b$b;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import e7a.b;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import e7a.b$a;
import com.yxcorp.gifshow.page.cost.list.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import e7a.b$b$a;
import ok.x;
import com.yxcorp.gifshow.page.cost.list.ListPageFirstRenderObserver$FlagNode;
import com.yxcorp.gifshow.page.cost.list.ListPageFirstRenderObserver;

public final class b$b implements IMediaPlayer$OnInfoListener	// class@00207d
{
    public final b b;
    public final NasaSlideParam c;

    public void b$b(b p0,NasaSlideParam p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(b$b.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b$b.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 == 3) {
          b$a t = b.t;
          Objects.requireNonNull(t);
          if (b.s) {
             return false;
          }else {
             t.a(true);
             g og = new g(b.P8(this.b), false, new b$b$a(this));
             NasaSlideParam mBizStartTs = this.c.mBizStartTs;
             og.j = mBizStartTs;
             og.f("reqNetToDataParsed", mBizStartTs);
             og.b("reqNetToDataParsed");
             if (!PatchProxy.applyVoid(null, og, g.class, "5")) {
                og.c.a(ListPageFirstRenderObserver$FlagNode.DATA_INITED);
             }
             og.d();
          }
       }
       return false;
    }
}
