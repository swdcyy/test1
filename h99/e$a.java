package h99.e$a;
import ohc.i;
import h99.e;
import k2b.e0;
import com.kwai.framework.model.feed.BaseFeed;
import mhc.p1;
import com.yxcorp.gifshow.share.OperationModel;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import h99.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import erd.g;

public class e$a extends i	// class@002570
{
    public final BaseFeed d;
    public final e e;

    public void e$a(e p0,e0 p1,BaseFeed p2){
       this.e = p0;
       this.d = p2;
       super(p1);
    }
    public t a(p1 p0,OperationModel p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.M() == KwaiOp.FANS_TOP) {
          return t.just(p1).doOnNext(new d(this, this.e.c, this.d));
       }
       return null;
    }
}
