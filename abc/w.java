package abc.w;
import java.lang.Runnable;
import java.lang.Throwable;
import java.lang.Object;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import e17.i;

public final class w implements Runnable	// class@0000e2
{
    public final Throwable b;

    public void w(Throwable p0){
       this.b = p0;
    }
    public final void run(){
       i.d(R.style.arg_RES_7f11066a, this.b.mErrorMessage);
    }
}
