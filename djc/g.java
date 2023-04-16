package djc.g;
import erd.g;
import com.yxcorp.gifshow.share.widget.d;
import java.lang.Object;
import java.lang.Throwable;
import java.util.List;
import n80.b;
import java.lang.String;
import q87.c;

public final class g implements g	// class@0021f6
{
    public final d b;

    public void g(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       tb.B = true;
       tb.A(tb.o());
       Object[] objArray = new Object[0];
       b.C().w("UPDATE_IM_LIST_FROM_RECO", p0.getMessage(), objArray);
    }
}
