package h92.d0;
import z1.a;
import h92.i0;
import lm1.i;
import java.lang.Object;
import h92.d;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;

public final class d0 implements a	// class@002d03
{
    public final i0 a;
    public final i b;

    public void d0(i0 p0,i p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       d0 ta = this.a;
       Objects.requireNonNull(ta);
       ta.Y8(this.b, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveAudienceNormalGiftGuidePresenter][handleNormalGiftGuideClick] "+p0.a, p0.b);
    }
}
