package bbc.s;
import com.yxcorp.gifshow.log.utils.b$a;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.retrofit.model.KwaiException;
import com.yxcorp.gifshow.relation.intimate.helper.i;

public final class s implements b$a	// class@000439
{
    public final Throwable b;

    public void s(Throwable p0){
       this.b = p0;
    }
    public final boolean a(String p0){
       s tb = this.b;
       if (tb instanceof KwaiException) {
          i.l(tb.mErrorMessage);
       }
       return true;
    }
}
