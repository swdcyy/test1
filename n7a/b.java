package n7a.b;
import jta.e;
import n7a.f;
import java.lang.Object;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;

public final class b implements e	// class@0030f2
{
    public final f a;

    public void b(f p0){
       this.a = p0;
    }
    public final void b(int p0,int p1){
       b ta = this.a;
       View view = ta.m8().findViewById(R.id.poster);
       if (view == null) {
       }else {
          view.getViewTreeObserver().addOnPreDrawListener(ta.M);
       }
       return;
    }
}
