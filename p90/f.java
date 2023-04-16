package p90.f;
import erd.g;
import com.kuaishou.gifshow.kuaishan.ui.edit.videoedit.KuaishanVideoClipFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;
import com.kuaishou.gifshow.kuaishan.ui.edit.videoedit.a;
import t36.f$a;
import t36.f;

public final class f implements g	// class@0028f3
{
    public final KuaishanVideoClipFragment b;

    public void f(KuaishanVideoClipFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f tb = this.b;
       tb.eh();
       PostUtils.D("KuaishanVideoClipFragment", "startProcessing on error: ", p0);
       tb.k.s0(a.a);
    }
}
