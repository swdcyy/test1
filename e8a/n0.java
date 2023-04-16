package e8a.n0;
import erd.g;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaPymkDialogFragment;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class n0 implements g	// class@0020c2
{
    public final ProgressFragment b;

    public void n0(ProgressFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.dismiss();
       ExceptionHandler.handleException(a.a().a(), p0);
    }
}
