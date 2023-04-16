package l5a.b;
import u07.u;
import l5a.d;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class b implements u	// class@002d4d
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       View view = this.b.m8().findViewById(R.id.forward_button);
       if (view != null) {
          view.performClick();
       }
       return;
    }
}
