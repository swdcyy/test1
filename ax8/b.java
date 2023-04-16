package ax8.b;
import erd.g;
import java.lang.Object;
import com.kwai.feature.post.api.feature.producer.help.ProducerHelpConfig;
import f66.i;
import jq.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;

public final class b implements g	// class@00032a
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       i oi = a.b();
       StringBuilder str = "have business? ";
       boolean b = true;
       boolean b1 = (p0.mShareBusinessLinkInfo != null)? true: false;
       Object[] objArray = new Object[0];
       oi.w("ShareProducerPresenter", str+b1, objArray);
       oi = a.b();
       str = "have live? ";
       if (p0.mShareLivePredictionConfig == null) {
          b = false;
       }
       Object[] objArray1 = new Object[0];
       oi.w("ShareProducerPresenter", str+b, objArray1);
       return;
    }
}
