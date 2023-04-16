package bbc.t;
import com.yxcorp.gifshow.log.utils.b$a;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.retrofit.model.KwaiException;
import com.yxcorp.gifshow.relation.intimate.helper.i;

public final class t implements b$a	// class@00043a
{
    public final Throwable b;

    public void t(Throwable p0){
       this.b = p0;
    }
    public final boolean a(String p0){
       t tb = this.b;
       if (tb instanceof KwaiException) {
          i.l(tb.mErrorMessage);
       }
       return true;
    }
}
