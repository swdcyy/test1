package ak2.g;
import lf3.g;
import ak2.l;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamActivityMessages$SCActivityLiveInfo;
import java.util.Objects;
import java.lang.String;
import lf3.f;

public final class g implements g	// class@0000ea
{
    public final l b;

    public void g(l p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       tb.W8(p0.accumulatedWatchCount);
    }
    public boolean V(){
       return f.a(this);
    }
}
