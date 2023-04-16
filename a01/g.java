package a01.g;
import java.lang.Runnable;
import a01.i;
import java.lang.String;
import java.lang.Object;
import lz0.c;
import t02.a0;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import vq5.d;

public final class g implements Runnable	// class@00000d
{
    public final i b;
    public final String c;

    public void g(i p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       g tb = this.b;
       tb.w.p2.r4(this.c, tb.getContext());
    }
}
