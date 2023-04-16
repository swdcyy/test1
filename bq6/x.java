package bq6.x;
import io.reactivex.g;
import java.lang.Object;
import brd.v;
import jh0.a$i;
import com.google.protobuf.nano.MessageNano;
import brd.g;

public final class x implements g	// class@0005cf
{
    public final byte[] b;

    public void x(byte[] p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       p0.onNext(MessageNano.mergeFrom(new a$i(), this.b));
       p0.onComplete();
    }
}
