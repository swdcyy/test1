package b99.b;
import java.lang.Runnable;
import b99.c;
import java.lang.Object;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import b99.f;

public final class b implements Runnable	// class@000396
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       tb.S8((float)(((int)tb.B.getY() - tb.m8().getHeight()) + a1.d(R.dimen.arg_RES_7f07025d)));
       tb.E = true;
    }
}
