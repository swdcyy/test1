package l9a.b;
import erd.g;
import com.yxcorp.gifshow.detail.trigger.a;
import java.lang.Object;
import com.kwai.framework.player.helper.f$a;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.g;

public final class b implements g	// class@002d6c
{
    public final a b;

    public void b(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       boolean b;
       b tb = this.b;
       if (!tb.v - null) {
          tb.v = tb.s.getPlayer().getCurrentPosition();
       }
       a v = tb.v;
       f$a a = p0.a;
       p0 = a.class;
       if (PatchProxy.isSupport(p0)) {
          p0 = PatchProxy.applyTwoRefs(Long.valueOf(v), Long.valueOf(a), tb, p0, "6");
          if (p0 != PatchProxyResult.class) {
             b = p0.booleanValue();
          }else if(tb.p.isImageType() || (tb.p.isVideoType() && (tb.p.getVideoDuration() - a.A.longValue() > 0 && (a - v) - a.A.longValue() > 0))){
             b = true;
          }else {
             b = false;
          }
       }else {
          goto label_003d ;
       }
       if (b) {
          RxBus.f.b(new g(tb.p.getPhotoId(), tb.p.getUserId()));
       }
       return;
    }
}
