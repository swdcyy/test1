package dta.q;
import java.lang.Runnable;
import com.yxcorp.gifshow.homepage.kcube.presenter.a;
import java.lang.Object;
import tra.b;
import java.lang.String;
import q87.c;
import lr6.f;

public final class q implements Runnable	// class@00254a
{
    public final a b;

    public void q(a p0){
       this.b = p0;
    }
    public final void run(){
       q tb = this.b;
       if (tb.E == null) {
          Object[] objArray = new Object[0];
          b.C().w("CommonKCubeActionBarPresenter", "mActionBarController.bind\(\) after delay", objArray);
          tb.C.d();
          tb.E = true;
       }
       return;
    }
}
