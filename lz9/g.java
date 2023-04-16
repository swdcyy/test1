package lz9.g;
import erd.g;
import lz9.b0;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.feature.api.feed.detail.router.DetailDanmakuParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import crd.b;
import lnc.b9;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import lz9.f;

public final class g implements g	// class@002edd
{
    public final b0 b;

    public void g(b0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       boolean b = p0.booleanValue();
       Objects.requireNonNull(tb);
       b0 uob0 = b0.class;
       if (!PatchProxy.isSupport(uob0) || (PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, uob0, "13") || (tb.H == null || (b && tb.I.getDetailDanmakuParam().openDanmakuPanel == null)))) {
          b9.a(tb.N);
          tb.N = t.timer(1500, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new f(tb));
       }
    label_004f :
       return;
    }
}
