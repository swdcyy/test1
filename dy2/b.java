package dy2.b;
import lf3.g;
import dy2.c;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import java.util.Objects;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$LiveCommonPopup;
import lf3.f;

public final class b implements g	// class@0025e4
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null) {
          SCActionSignal liveCommonPo = p0.liveCommonPopup;
          if (liveCommonPo != null && (liveCommonPo.length > 0 && liveCommonPo[0] != null)) {
             tb.a9(liveCommonPo[0]);
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
