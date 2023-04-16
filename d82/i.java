package d82.i;
import lf3.g;
import d82.n;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCEnterRoomAck;
import lf3.f;

public final class i implements g	// class@002492
{
    public final n b;

    public void i(n p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       i tb = this.b;
       if (tb.u == null) {
          tb.P8();
          tb.u = true;
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
