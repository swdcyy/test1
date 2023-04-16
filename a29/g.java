package a29.g;
import erd.g;
import a29.k;
import java.lang.Object;
import java.lang.Boolean;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import mm5.c;
import k2b.e0;
import com.yxcorp.gifshow.entity.QPhoto;

public final class g implements g	// class@000033
{
    public final k b;

    public void g(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       tb.D = true;
       DanmakuSwitchUtils h = DanmakuSwitchUtils.h;
       int i = true ^ h.d();
       c.a.d(tb.x, tb.t, i);
       h.a(i);
    }
}
