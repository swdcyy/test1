package ba2.w;
import lf3.g;
import com.kuaishou.live.core.show.hourlytrank.f;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import java.util.Objects;
import ekd.j;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$LiteTextNotice;
import lf3.f;

public final class w implements g	// class@0003b3
{
    public final f b;

    public void w(f p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       w tb = this.b;
       Objects.requireNonNull(tb);
       if (!j.h(p0.textNotice) && tb.S8(p0.textNotice[0])) {
          tb.W8(p0.textNotice[0]);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
