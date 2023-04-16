package l76.e;
import java.lang.Runnable;
import l76.k;
import r97.r;
import java.lang.Object;
import java.util.Objects;
import r97.o;
import ca7.r;
import e66.c;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.log.model.CommonParams;
import k2b.u1;

public final class e implements Runnable	// class@001d5a
{
    public final k b;
    public final r c;
    public final int d;

    public void e(k p0,r p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       e tb = this.b;
       e tc = this.c;
       e td = this.d;
       Objects.requireNonNull(tb);
       if (!r.a(tc.c().sampleRatio())) {
          Object[] objArray = new Object[0];
          c.C().s("AzerothLoggerWrapper", "Drop a CustomStatEvent log, key: "+tc.e()+", sampleRatio: "+tc.c().sampleRatio(), objArray);
       }else {
          u1.Z(tc.e(), tc.g(), tb.P(tc.c()), tb.N(tc.c()), td);
       }
       return;
    }
}
