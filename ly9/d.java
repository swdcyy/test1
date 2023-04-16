package ly9.d;
import erd.g;
import ly9.f;
import java.lang.Object;
import com.kuaishou.android.model.mix.QComment;
import java.util.Objects;
import ly9.g;
import com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeConfig;
import com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeResponse$a;
import com.yxcorp.gifshow.detail.common.information.marquee.model.e;
import qvb.a;

public final class d implements g	// class@002eb6
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null && !p0.getStatus()) {
          tb.c.add(tb.h, e.a(p0, tb.b.a.simpleEnabled));
       }
       return;
    }
}
