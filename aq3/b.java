package aq3.b;
import lf3.g;
import com.kuaishou.live.tuna.presenter.b;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveBsStateMessages$SCLiveCurrentBsState;
import tj3.k;
import tj3.e;
import java.lang.String;
import lf3.f;

public final class b implements g	// class@00029d
{
    public final b b;

    public void b(b p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       b tb = this.b;
       if (tb.V == null) {
          tb.N.x().X("TunaAudienceBottomTaskItemReceiveMsg");
       }
       tb.b9(p0, false);
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
