package djc.c;
import java.lang.Runnable;
import com.yxcorp.gifshow.share.widget.d;
import java.lang.Object;
import djc.k;
import android.view.Window;
import android.app.Activity;
import android.content.Context;
import android.app.Dialog;
import zf6.j;
import lnc.i5;

public final class c implements Runnable	// class@0021d9
{
    public final d b;

    public void c(d p0){
       this.b = p0;
    }
    public final void run(){
       c tb = this.b;
       i5.j(tb.l.getWindow(), j.b(tb.getContext(), R.color.arg_RES_7f0617b3));
    }
}
