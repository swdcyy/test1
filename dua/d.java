package dua.d;
import java.lang.Runnable;
import com.yxcorp.gifshow.homepage.presenter.splash.c;
import java.lang.Object;
import java.util.Objects;
import tra.b;
import java.lang.String;
import q87.c;
import com.yxcorp.utility.SystemUtil;
import w1.k;

public final class d implements Runnable	// class@002563
{
    public final c b;

    public void d(c p0){
       this.b = p0;
    }
    public final void run(){
       d tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       b.C().w("SplashPresenter", "finishSplashIfBlocked", objArray);
       if (SystemUtil.P()) {
          k.a("finishSplashIfBlocked");
          k.b();
       }
       c c = tb.C;
       if (c != null) {
          tb.Y8(c);
          tb.C = 0;
       }else {
          tb.Y8(0);
       }
       return;
    }
}
