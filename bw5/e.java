package bw5.e;
import erd.o;
import com.kwai.feature.api.social.message.imshare.model.IMShareRequest;
import java.lang.Object;
import bw5.s;
import brd.t;
import bw5.u;

public final class e implements o	// class@000616
{
    public final IMShareRequest b;

    public void e(IMShareRequest p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       return p0.fL(this.b);
    }
}
