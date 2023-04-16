package a8a.b;
import java.lang.Runnable;
import a8a.c;
import java.lang.Object;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class b implements Runnable	// class@000075
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void run(){
       Activity activity = this.b.getActivity();
       if (activity != null && !activity.isFinishing()) {
          activity.finish();
       }
       return;
    }
}
